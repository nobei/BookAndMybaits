package com.example.demo.Service;

import com.example.demo.Pojo.Book;
import com.example.demo.Pojo.BookExample;
import com.example.demo.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookServiceDaoImp implements BookServiceDao{

    @Autowired
    private BookExample bookExample;

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List findBookByReader(String reader) {
        BookExample.Criteria criteria=bookExample.createCriteria();
        criteria.andReaderEqualTo(reader);
        return bookMapper.selectByExample(bookExample);
    }

    @Override
    public void saveBook(Book book) {
        bookMapper.insertSelective(book);
    }
}
