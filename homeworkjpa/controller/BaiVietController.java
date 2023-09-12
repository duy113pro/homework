package com.homework.homeworkjpa.controller;

import com.homework.homeworkjpa.entity.BaiViet;
import com.homework.homeworkjpa.repository.BaiVietRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/baiviet")
public class BaiVietController {

    @Autowired
    BaiVietRepository baiVietRepository;

    @GetMapping
    public ResponseEntity<?> addBaiViet(){

        List<BaiViet> listBaiViet = baiVietRepository.findAll();

        return new ResponseEntity<>(listBaiViet, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> saveBaiViet(){

        BaiViet baiViet = new BaiViet();

        baiViet.setId_tacgia(1);
        baiViet.setTieude("Game");
        baiViet.setNoidung("aaaaaaaaaabbbbbbbb");

        baiVietRepository.save(baiViet);

        return new ResponseEntity<>("saveBaiViet", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBaiViet(@PathVariable int id) {
        BaiViet existingBaiViet = baiVietRepository.findById(id).orElse(null);
        if (existingBaiViet == null) {
            return ResponseEntity.notFound().build();
        }

        baiVietRepository.delete(existingBaiViet);
        return new ResponseEntity<>("Đã xoá bài viết id " + id, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> updateBaiViet() {

        BaiViet updateBV = new BaiViet();

        updateBV.setId(1);
        updateBV.setTieude("anime");
        updateBV.setNoidung("bbbbbbbbcccccccc");

        baiVietRepository.save(updateBV);

        return new ResponseEntity<>("đã update bài viết", HttpStatus.OK);
    }
}

