package com.nila.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nila.book.dao.BookRepositoryDAO;
import com.nila.book.model.Book;

@Service
public class BookServiceImpl implements BookService
{

    @Autowired
    BookRepositoryDAO bookRepositoryDAO;

    @Override
    public List<Book> getBookDetailsList()
    {
        return bookRepositoryDAO.findAll();
    }

}
