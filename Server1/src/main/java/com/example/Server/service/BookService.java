package com.example.Server.service;

import com.example.Server.entity.BookEntity;
import com.example.Server.repo.BookRepo;
import com.example.Server.utils.ValidationUtils;
import com.example.Server.exception.ValidationException;
import org.springframework.stereotype.Service;



@Service
public class BookService {

    private final BookRepo repo;
    public BookService (BookRepo repo){
        this.repo= repo;

    }
    public void save(BookEntity book) throws ValidationException {
        ValidationUtils.validationBook(book);
        repo.save(book);
    }
    public void delete(Long id){repo.deleteById(id);}

    public Iterable<BookEntity> getAll(){return repo.findAll();}

    public BookEntity find(Long id){return repo.findById(id).get();}
}
