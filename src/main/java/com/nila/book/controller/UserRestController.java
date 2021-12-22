package com.nila.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nila.book.model.Book;
import com.nila.book.service.BookService;

@RestController
@RequestMapping(value = "/user")
public class UserRestController
{
    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String userTest()
    {
        return "This is normal user";
    }

    // @PreAuthorize("hasRole('ROLE_USER')")
    @RequestMapping(value = "/getbookdetails", method = RequestMethod.GET)
    public List<Book> getBookDetails()
    {
        return bookService.getBookDetailsList();
    }

}
