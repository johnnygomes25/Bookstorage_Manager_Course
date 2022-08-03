package com.rodrigopeleias.bookstoragemanager.repository;

import com.rodrigopeleias.bookstoragemanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
