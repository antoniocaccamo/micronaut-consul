package com.github.antoniocaccamo.bookrecommandation.client.impl;

import javax.validation.constraints.NotEmpty;

import com.github.antoniocaccamo.bookrecommandation.client.BookInventoryOperations;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Maybe;

/**
 * @author antoniocaccamo on 18/09/19
 */
@Client("bookinventory")
public interface BookInventoryClient extends BookInventoryOperations {

    @Override
    @Get("/books/stock/{isbn}")
    Maybe<Boolean> stock(@NotEmpty String isbn);
}
