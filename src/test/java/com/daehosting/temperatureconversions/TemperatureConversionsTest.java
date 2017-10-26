package com.daehosting.temperatureconversions;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class TemperatureConversionsTest {

    @Test
    public void getTemperatureConversionsSoap() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap();
        BigDecimal fahrenheitToCelsiusResult = service.fahrenheitToCelsius(BigDecimal.valueOf(32));
        assertEquals("The Fahrenheit to celcius conversion failed", fahrenheitToCelsiusResult, BigDecimal.valueOf(0));
    }

    @Test
    public void getTemperatureConversionsSoap1() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap();
        BigDecimal windChillToCelciusResult = service.windChillInCelsius(BigDecimal.valueOf(0.0), BigDecimal.valueOf(12));
        assertEquals("Wind chill to celcius conversion failed", windChillToCelciusResult, BigDecimal.valueOf(-10.7484));
    }

    @Test
    public void getTemperatureConversionsSoap121() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal windChillToFarhrenheitResult = service.windChillInFahrenheit(BigDecimal.valueOf(64), BigDecimal.valueOf(15));
        assertEquals("Wind chill to farhrenheit conversion failed", windChillToFarhrenheitResult, BigDecimal.valueOf(48.4259999));
    }

    @Test
    public void getTemperatureConversionsSoap12() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal celsiusToFahrenheitResult = service.celsiusToFahrenheit(BigDecimal.valueOf(0.0));
        assertEquals("The celcius to Fahrenheit conversion failed", celsiusToFahrenheitResult, BigDecimal.valueOf(32));
    }


}