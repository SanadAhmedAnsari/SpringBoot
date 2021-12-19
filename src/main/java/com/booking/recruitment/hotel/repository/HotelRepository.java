package com.booking.recruitment.hotel.repository;

import com.booking.recruitment.hotel.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;


public interface HotelRepository extends JpaRepository<Hotel, Long> {

    @Transactional
    @Modifying
    @Query(value = "UPDATE hotel SET deleted = true WHERE id = ?1", nativeQuery = true)
    void markAsDeleted(Long id);
}
