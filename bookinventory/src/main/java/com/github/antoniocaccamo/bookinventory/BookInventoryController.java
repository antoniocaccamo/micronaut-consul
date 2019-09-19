package com.github.antoniocaccamo.bookinventory;

import com.github.antoniocaccamo.bookdomain.BookInventory;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.validation.Validated;
import lombok.extern.slf4j.Slf4j;

import javax.validation.constraints.NotEmpty;
import java.util.Optional;

/**
 * @author antoniocaccamo on 18/09/19
 */



@Controller("/books")
@Validated @Slf4j
public class BookInventoryController {


    @Produces(MediaType.TEXT_PLAIN)
    @Get("/stock/{isbn}") 
    public Boolean stock(@NotEmpty String isbn) {

        log.info("incoming requests...");

        Boolean bool = bookInventoryByIsbn(isbn)
                .map(bi -> bi.getStock() > 0)
                .orElse(null)
        ;

        log.info("book with isbn {} is {} available", isbn, bool ? "": "NOT" );
        return bool;
    }


    private Optional<BookInventory> bookInventoryByIsbn(String isbn) {
        if(isbn.equals("1491950358")) {
            return Optional.of(new BookInventory(isbn, 4));

        } else if(isbn.equals("1680502395")) {
            return Optional.of(new BookInventory(isbn, 0));
        }
        return Optional.empty();
    }
}
