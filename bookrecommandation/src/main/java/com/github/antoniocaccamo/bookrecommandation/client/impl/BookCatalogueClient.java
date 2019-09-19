package com.github.antoniocaccamo.bookrecommandation.client.impl;

import com.github.antoniocaccamo.bookdomain.Book;
import com.github.antoniocaccamo.bookrecommandation.client.BookCatalogueOperations;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Flowable;

/**
 * @author antoniocaccamo on 18/09/19
 */

@Client("bookcatalogue")
public interface BookCatalogueClient extends BookCatalogueOperations {


    @Get("/books")
    Flowable<Book> findAll();

}
