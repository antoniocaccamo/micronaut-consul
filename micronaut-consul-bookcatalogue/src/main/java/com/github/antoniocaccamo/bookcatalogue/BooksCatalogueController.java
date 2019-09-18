package com.github.antoniocaccamo.bookcatalogue;

import com.github.antoniocaccamo.bookdomain.Book;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

@OpenAPIDefinition(
        info = @Info(
                title = "Books Catalogue",
                version = "1.0",
                description = "Books Catalogue"
        )
)
@Controller("/books")
@Slf4j
public class BooksCatalogueController {

    @Get("/")
    List<Book> index() {

        log.info("incoming requests...");

        Book buildingMicroservices =
                new Book("1491950358", "Building Microservices");
        Book releaseIt =
                new Book("1680502395", "Release It!");
        Book cidelivery =
                new Book("0321601912", "Continuous Delivery:");

        List list = Arrays.asList(buildingMicroservices, releaseIt, cidelivery);

        log.info("books list {}",list);

        return list;
    }

}