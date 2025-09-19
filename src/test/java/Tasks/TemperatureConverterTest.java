package Tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    TemperatureConverter tc = new TemperatureConverter();

    @Test
    void kelvinToCelsius() {
        assertEquals(26.85, tc.kelvinToCelsius(300), 0.01);
        assertEquals(-173.15, tc.kelvinToCelsius(100), 0.01);
    }

    @Test
    void fahrenheitToCelsius() {
        assertEquals(0.0, tc.fahrenheitToCelsius(32));
        assertEquals(10, tc.fahrenheitToCelsius(50));
        assertEquals(-56.6, tc.fahrenheitToCelsius(-70), 0.1);


    }

    @Test
    void celsiusToFahrenheit() {
        assertEquals(122, tc.celsiusToFahrenheit(50));
        assertEquals(6.8, tc.celsiusToFahrenheit(-14), 0.01);
        assertEquals(87.08, tc.celsiusToFahrenheit(30.6), 0.01);
    }

    @Test
    void isExtremeTemperature() {
        assertTrue(tc.isExtremeTemperature(51));
        assertFalse(tc.isExtremeTemperature(20));
        assertTrue(tc.isExtremeTemperature(-50));

    }
}
