package com.example.demo.Controller;

import com.example.demo.Pojo.Book;
import com.example.demo.Service.BookServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ReadingListController {

    @Autowired
    private BookServiceDao bookServiceDao;

    @RequestMapping(value="/Book/{reader}" , method= RequestMethod.GET)
    public String readersBooks(@PathVariable String reader, Model model)
    {
          List readList=bookServiceDao.findBookByReader(reader);
          if(readList!=null)
          {
              model.addAttribute("books",readList);
          }

          return "readingList";
    }

    @RequestMapping(value="/Book/{reader}" , method=RequestMethod.POST)
    public String addToReadingList(@PathVariable String reader, Book book)
    {
        book.setReader(reader);
        bookServiceDao.saveBook(book);
        return "redirect:/Book/{reader}";
    }

    @RequestMapping(value="/CreateList/")
    public String createReadingList()
    {
        return "readingList";
    }

}
