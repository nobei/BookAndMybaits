package com.example.demo.Service;

import com.example.demo.Pojo.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public interface BookServiceDao {
    public List findBookByReader(String reader);
    public void saveBook(Book book);
}
