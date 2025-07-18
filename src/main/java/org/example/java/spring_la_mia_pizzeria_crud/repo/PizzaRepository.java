package org.example.java.spring_la_mia_pizzeria_crud.repo;

import java.util.List;

import org.example.java.spring_la_mia_pizzeria_crud.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Integer> {

    Pizza findByIdEquals(int id);

    List<Pizza> findByNameContainingIgnoreCase(String name);
}
