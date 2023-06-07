package com.geekster.RestaurentManagementSystem.repos;

import com.geekster.RestaurentManagementSystem.models.Order;
import com.geekster.RestaurentManagementSystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOrderRepo extends JpaRepository<Order , Long> {
    List<Order> findByUser(User user);
}
