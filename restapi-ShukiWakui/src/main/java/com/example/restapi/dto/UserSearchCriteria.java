package com.example.restapi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UserSearchCriteria {
    @NotBlank(message = "名前は必須です")
    private String name;
    @NotBlank(message = "メールは必須です")
    @Email(message = "メールの形式にしてください")
    private String email;

    public UserSearchCriteria() {
    }

    public UserSearchCriteria(@NotBlank String name, @NotBlank @Email String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserSearchCriteria [name=" + name + ", email=" + email + "]";
    }

}
