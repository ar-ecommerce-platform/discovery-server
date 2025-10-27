package com.ecommerce.discovery_server;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThatCode;

/**
 * Tests for the Discovery Server application. Makes sure the application starts correctly and the
 * context loads.
 */
@SpringBootTest
class DiscoveryServerApplicationTests {

    /**
     * Check that the Spring application context starts without errors. This ensures all configuration
     * and beans work correctly.
     */
	@Test
	void contextLoads() {
        // Method left intentionally empty – test passes if context loads successfully
	}

    /**
     * Check that the main method runs without throwing errors. This makes sure the application can
     * start using the main method.
     */
    @Test
    void mainRunsWithoutException() {
        String[] args = {};
        assertThatCode(() -> DiscoveryServerApplication.main(args)).doesNotThrowAnyException();
    }
}
