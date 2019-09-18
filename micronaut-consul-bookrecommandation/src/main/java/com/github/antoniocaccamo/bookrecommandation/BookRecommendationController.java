package com.github.antoniocaccamo.bookrecommandation;

import com.github.antoniocaccamo.bookdomain.BookRecommendation;
import com.github.antoniocaccamo.bookrecommandation.client.BookCatalogueOperations;
import com.github.antoniocaccamo.bookrecommandation.client.BookInventoryOperations;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Flowable;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

/**
 * @author antoniocaccamo on 18/09/19
 */

@OpenAPIDefinition(
        info = @Info(
                title = "Books Reccomandation",
                version = "1.0",
                description = "Books Reccomandation API"
        )
)
@Controller("/books")
public class BookRecommendationController {

    private final BookCatalogueOperations catalogueOps;
    private final BookInventoryOperations inventoryOps;

    public BookRecommendationController(BookCatalogueOperations catalogueOps, BookInventoryOperations inventoryOps) {
        this.catalogueOps = catalogueOps;
        this.inventoryOps = inventoryOps;
    }


    @Get("/")
    public Flowable<BookRecommendation> index(){

        return catalogueOps.findAll()
                .flatMapMaybe( book -> inventoryOps.stock(book.getIsbn())
                                            .filter(Boolean::booleanValue)
                                            .map(aBoolean -> book)
                )
                .map(book -> new BookRecommendation(book.getName()))
            ;
    }
}
