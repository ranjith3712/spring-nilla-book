package com.nila.book.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nila.book.model.Book;

@Repository
public interface BookRepositoryDAO extends JpaRepository<Book, Long>
{

}
