package com.homework.homeworkjpa.controller;

import com.homework.homeworkjpa.entity.TacGia;
import com.homework.homeworkjpa.repository.TacGiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/tacgia")
public class TacGiaController {
    @Autowired
    TacGiaRepository tacGiaRepository;

    @GetMapping("")
    public ResponseEntity<?> getTacGia(){

        List<TacGia> listTacGia = tacGiaRepository.findAll();

        return new ResponseEntity<>(listTacGia, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> addTacGia(){

        TacGia tacGia = new TacGia();
        tacGia.setTentacgia("Oden");
        tacGia.setHoten("Kimochi");
        tacGia.setGioitinh("Nam");

        tacGiaRepository.save(tacGia);

        return new ResponseEntity<>("addTacGia", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTacGia(@PathVariable int id) {
        TacGia existingTacGia = tacGiaRepository.findById(id).orElse(null);
        if (existingTacGia == null) {
            return ResponseEntity.notFound().build();
        }

        tacGiaRepository.delete(existingTacGia);
        return new  ResponseEntity<>("Đã xoá tác giả id " + id, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> updateTacGia(){

        TacGia updateTG = new TacGia();

        TacGia tacGia = new TacGia();
        tacGia.setId(1);
        tacGia.setTentacgia("Oda");
        tacGia.setHoten("omg");
        tacGia.setGioitinh("nữ");

        tacGiaRepository.save(tacGia);

        return new ResponseEntity<>("updateTacGia", HttpStatus.OK);
    }
}

