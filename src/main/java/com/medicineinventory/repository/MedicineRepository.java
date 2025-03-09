package com.medicineinventory.repository;

import com.medicineinventory.model.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long> {
    // No additional code is needed since JpaRepository provides save(), findById(), and deleteById() methods.
}
