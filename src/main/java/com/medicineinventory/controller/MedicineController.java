package com.medicineinventory.controller;

import com.medicineinventory.model.Medicine;
import com.medicineinventory.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/medicines")
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    // Get all medicines
    @GetMapping
    public ResponseEntity<List<Medicine>> getAllMedicines() {
        List<Medicine> medicines = medicineService.getAllMedicines();
        return ResponseEntity.ok(medicines);
    }

    // Get medicine by ID
    @GetMapping("/{id}")
    public ResponseEntity<Medicine> getMedicineById(@PathVariable Long id) {
        Optional<Medicine> medicine = medicineService.getMedicineById(id);
        return medicine.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Add a new medicine (POST)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> addMedicine(@Valid @RequestBody Medicine medicine) {
        if (medicine == null) {
            return ResponseEntity.badRequest().body("Invalid input: Medicine data is missing.");
        }
        Medicine savedMedicine = medicineService.addMedicine(medicine);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedMedicine);
    }

    // Update an existing medicine (PUT)
    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> updateMedicine(@PathVariable Long id, @Valid @RequestBody Medicine updatedMedicine) {
        Medicine updated = medicineService.updateMedicine(id, updatedMedicine);
        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }

    // Delete a medicine (DELETE)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMedicine(@PathVariable Long id) {
        boolean deleted = medicineService.deleteMedicine(id);
        return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }

    // PATCH: Partially update a medicine
    @PatchMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> patchMedicine(@PathVariable Long id, @RequestBody Medicine medicineUpdates) {
        Medicine updatedMedicine = medicineService.patchMedicine(id, medicineUpdates);
        return updatedMedicine != null ? ResponseEntity.ok(updatedMedicine) : ResponseEntity.notFound().build();
    }
}
