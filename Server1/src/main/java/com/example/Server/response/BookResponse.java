package com.example.Server.response;

import com.example.Server.entity.BookEntity;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class BookResponse extends BaseResponse {

    public BookResponse(boolean success, String message, Iterable<BookEntity> data){
        super(success, message);
        this.data = data;
    }

    public BookResponse(Iterable<BookEntity> data) {
        super(true, "Список книг");
        this.data = data;
    }

    private Iterable<BookEntity> data;
}
