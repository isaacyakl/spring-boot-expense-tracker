package com.isaacyakl.springbootexpensetracker.services;

import com.isaacyakl.springbootexpensetracker.domain.Category;
import com.isaacyakl.springbootexpensetracker.exceptions.EtResourceNotFoundException;
import com.isaacyakl.springbootexpensetracker.exceptions.EtBadRequestException;

import java.util.List;

public interface CategoryService {
    List<Category> fetchAllCategories(Integer userId);

    Category fetchCategoryById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Category addCategory(Integer userId, String title, String description) throws EtBadRequestException;

    void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeCategoryWithAllTransactions(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
}
