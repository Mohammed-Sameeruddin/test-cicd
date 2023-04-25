package com.library.demo.dto;

import com.library.demo.entity.Roles;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
public class UsersDTO {
    private int userId;

    @NotNull(message="is required")
    @Size(min=3,message="length should be atleast 3")
    private String username;

    @NotNull(message="is required")
    @Size(min=4,message="length should be atleast 4")
    private String password;

    @Size(min=10,max=10,message="length should be exact 10")
    private String phone;

    @NotNull(message="is required")
    @Email(message= "email should be valid")
    private String email;

    @NotNull(message = "is required")
    private Set<Roles> roles = new HashSet<>();

    private boolean enabled;

    private Date createdAt;

    private Date updatedAt;
}
