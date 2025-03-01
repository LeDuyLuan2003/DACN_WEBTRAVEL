package com.SpringBootJdk22.SpringBootJdk22.repository;

import com.SpringBootJdk22.SpringBootJdk22.model.ItemCategory;
import com.SpringBootJdk22.SpringBootJdk22.model.Tour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

@Repository
public interface TourRepository extends JpaRepository<Tour, Long>, JpaSpecificationExecutor<Tour> {
    List<Tour> findByNameContainingIgnoreCase(String name);
    List<Tour> findByItemCategory_Id(Long itemCategoryId);
    List<Tour> findByItemCategory(ItemCategory itemCategory);
}
