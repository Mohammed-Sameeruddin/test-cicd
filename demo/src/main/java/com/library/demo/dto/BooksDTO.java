package com.library.demo.dto;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
public class BooksDTO {
    private int bookId;

    @NotNull(message = "is required")
    @Size(min=3,message="length should be atleast 3")
    private String bookName;

    @NotNull(message = "is required")
    @Size(min=3,message="length should be atleast 3")
    private String author;

    @NotNull(message = "is required")
    @Size(min=3,message="length should be atleast 3")
    private String publisher;

    @NotNull(message = "is required")
    @Min(0)
    private int quantity;

    private Date createdAt;

    private Date updatedAt;
}
