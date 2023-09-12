package com.homework.homeworkjpa.repository;

import com.homework.homeworkjpa.entity.BaiViet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaiVietRepository extends JpaRepository<BaiViet, Integer> {
}
