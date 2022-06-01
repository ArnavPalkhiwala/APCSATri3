package com.example.sping_portfolio.controllers;

import java.time.LocalDate;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;
import lombok.Data;
@Data
public class Student {
    @NotNull(message = "LastName can not be null!!")
    @NotEmpty(message = "LastName can not be empty!!")
    private String name;
    @NotNull(message = "Choose the subject count you are going to study!")
    @Min(value = 4, message = "Student should enroll to minimum 4 subjects!!")
    @Max(value = 8, message = "Student can enroll to maximum 8 subjects!!")
    private int subjectCount;
    @NotNull
    @Min(1)
    @Max(12)
    private int grade;
    @NotNull
    @Size(max = 10, min = 10, message = "Mobile number should be of 10 digits")
    @Pattern(regexp = "[7-9][0-9]{9}", message = "Mobile number is invalid!!")
    private String mobileNo;
    @NotNull(message = "Please enter birth date")
    @Past(message = "Birth date should be less than current date!!")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate birthDate;
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String s) {
        this.userId = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getSubjectCount() {
        return subjectCount;
    }

    public void setSubjectCount(int i) {
        this.subjectCount = i;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int i) {
        this.grade = i;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String s) {
        this.mobileNo = s;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate d) {
        this.birthDate = d;
    }
}
