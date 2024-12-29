package com.parwez.quiz_service.model;

import lombok.Data;

@Data
public class QuizDto {
    String categoryName;
    Integer noOfQuestions;
    String title;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getNoOfQuestions() {
        return noOfQuestions;
    }

    public void setNoOfQuestions(Integer noOfQuestions) {
        this.noOfQuestions = noOfQuestions;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "QuizDto{" +
                "categoryName='" + categoryName + '\'' +
                ", noOfQuestions=" + noOfQuestions +
                ", title='" + title + '\'' +
                '}';
    }
}
