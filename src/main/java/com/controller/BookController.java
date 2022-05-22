package com.controller;

import com.alibaba.fastjson.JSON;
import com.pojo.Book;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/allBook")
    public String allBook() {
        List<Book> bookList = bookService.queryAllBook();
        return JSON.toJSONString(bookList);
    }

    @RequestMapping("/addBook")
    public String addBook(Book book) {
        return JSON.toJSONString(bookService.addBook(book));
    }

    @RequestMapping("/updateBook")
    public String updateBook(Book book) {
        return JSON.toJSONString(bookService.updateBook(book));
    }

    @RequestMapping("/deleteBook")
    public String updateBook(int id) {
        return JSON.toJSONString(bookService.deleteBookById(id));
    }

    @RequestMapping("/queryBookByName")
    public String updateBook(String bookName) {
        return JSON.toJSONString(bookService.queryBookByName(bookName));
    }
}
