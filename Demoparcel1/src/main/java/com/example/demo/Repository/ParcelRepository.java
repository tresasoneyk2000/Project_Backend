package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Parcel;

import java.util.List;

@Repository

public interface ParcelRepository extends JpaRepository<Parcel, Long> {

    List<Parcel> findByUsername(String username);
}
