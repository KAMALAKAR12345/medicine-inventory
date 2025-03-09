package com.medicineinventory.service;

import com.medicineinventory.model.Medicine;
import com.medicineinventory.repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicineService {

    @Autowired
    private MedicineRepository medicineRepository;

    // Get all medicines
    public List<Medicine> getAllMedicines() {
        return medicineRepository.findAll();
    }

    // Get medicine by ID
    public Optional<Medicine> getMedicineById(Long id) {
        return medicineRepository.findById(id);
    }

    // Add a new medicine
    public Medicine addMedicine(Medicine medicine) {
        return medicineRepository.save(medicine);
    }

    // Update a medicine (PUT)
    public Medicine updateMedicine(Long id, Medicine updatedMedicine) {
        return medicineRepository.findById(id).map(medicine -> {
            medicine.setName(updatedMedicine.getName());
            medicine.setManufacturer(updatedMedicine.getManufacturer());
            medicine.setPrice(updatedMedicine.getPrice());
            return medicineRepository.save(medicine);
        }).orElse(null);
    }

    // Delete a medicine
    public boolean deleteMedicine(Long id) {
        if (medicineRepository.existsById(id)) {
            medicineRepository.deleteById(id);
            return true;
        }
        return false;
    }

    // PATCH: Partially update a medicine
    public Medicine patchMedicine(Long id, Medicine medicineUpdates) {
        Optional<Medicine> existingMedicineOpt = medicineRepository.findById(id);

        if (existingMedicineOpt.isPresent()) {
            Medicine existingMedicine = existingMedicineOpt.get();

            // Update only non-null fields
            if (medicineUpdates.getName() != null) {
                existingMedicine.setName(medicineUpdates.getName());
            }
            if (medicineUpdates.getManufacturer() != null) {
                existingMedicine.setManufacturer(medicineUpdates.getManufacturer());
            }
            if (medicineUpdates.getPrice() != null) {
                existingMedicine.setPrice(medicineUpdates.getPrice());
            }

            return medicineRepository.save(existingMedicine);
        }

        return null; // Return null if medicine not found
    }
}
