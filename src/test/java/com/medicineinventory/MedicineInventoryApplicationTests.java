package com.medicineinventory;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SpringExtension.class)  // Ensures Spring Context loads correctly
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MedicineInventoryApplicationTests {

    @Test
    void contextLoads() {
        // Test if the application context loads successfully
    }
}
