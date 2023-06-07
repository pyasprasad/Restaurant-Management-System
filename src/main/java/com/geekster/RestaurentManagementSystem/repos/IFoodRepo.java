package com.geekster.RestaurentManagementSystem.repos;

import com.geekster.RestaurentManagementSystem.models.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFoodRepo extends JpaRepository<Food, Long> {
    List<Food> findByFoodName(String foodName);
}
