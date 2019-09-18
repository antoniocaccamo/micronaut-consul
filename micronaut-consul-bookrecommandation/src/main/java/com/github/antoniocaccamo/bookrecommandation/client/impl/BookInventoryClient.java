package com.github.antoniocaccamo.bookrecommandation.client.impl;

import com.github.antoniocaccamo.bookrecommandation.client.BookInventoryOperations;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Maybe;

import javax.validation.constraints.NotBlank;

/**
 * @author antoniocaccamo on 18/09/19
 */
@Client("bookinventory")
public interface BookInventoryClient extends BookInventoryOperations {

    @Override
    @Get("/books/stock/{isbn}")
    Maybe<Boolean> stock(@NotBlank String isbn);
}
