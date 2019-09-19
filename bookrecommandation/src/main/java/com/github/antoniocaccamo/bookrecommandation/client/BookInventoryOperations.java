package com.github.antoniocaccamo.bookrecommandation.client;

import javax.validation.constraints.NotEmpty;

import io.reactivex.Maybe;

/**
 * @author antoniocaccamo on 18/09/19
 */
public interface BookInventoryOperations {

    Maybe<Boolean> stock(@NotEmpty String isbn);
}
