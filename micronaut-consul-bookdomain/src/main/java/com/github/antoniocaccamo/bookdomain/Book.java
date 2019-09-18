package com.github.antoniocaccamo.bookdomain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor
@NoArgsConstructor
public class Book {

    private String isbn;

    private String name;

//  public String getIsbn() {
//      return isbn;
//  }
//
//  public void setIsbn(String isbn) {
//      this.isbn = isbn;
//  }
//
//  public String getName() {
//      return name;
//  }
//
//  public void setName(String name) {
//      this.name = name;
//  }

}