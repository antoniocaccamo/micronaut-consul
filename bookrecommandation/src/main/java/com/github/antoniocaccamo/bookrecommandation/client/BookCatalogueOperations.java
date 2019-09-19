package com.github.antoniocaccamo.bookrecommandation.client;

import com.github.antoniocaccamo.bookdomain.Book;
import io.reactivex.Flowable;

/**
 * @author antoniocaccamo on 18/09/19
 */
public interface BookCatalogueOperations {

    Flowable<Book> findAll();
}
