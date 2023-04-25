package com.library.demo.repository;

import com.library.demo.entity.Books;
import com.library.demo.entity.IssuedBook;
import com.library.demo.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Books,Integer> {
    @Query("SELECT u FROM Books u WHERE u.bookId =:bookId")
    Books getBookCreatedDate(@Param("bookId") int  bookId);
}
