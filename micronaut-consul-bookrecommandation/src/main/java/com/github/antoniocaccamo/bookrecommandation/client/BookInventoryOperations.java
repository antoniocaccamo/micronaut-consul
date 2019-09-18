package com.github.antoniocaccamo.bookrecommandation.client;

import io.reactivex.Maybe;

import javax.validation.constraints.NotBlank;

/**
 * @author antoniocaccamo on 18/09/19
 */
public interface BookInventoryOperations {

    Maybe<Boolean> stock(@NotBlank String isbn);
}
