package uk.co.monotonic.testing.junit5.after.m6;

import org.junit.jupiter.api.Test;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.*;

public class SalesReportTest
{

    public static final int VALUE = 235;
    public static final String CITY = "London";

    PrintStream mockOutput = mock(PrintStream.class);
    SalesAnalyser analyser = mock(SalesAnalyser.class);
    SalesReport report = new SalesReport(mockOutput, analyser);

    @Test
    public void shouldPrintCityValues()
    {
        Map<String, Integer> results = new HashMap<>();
        results.put(CITY, VALUE);
        when(analyser.tallyStoreSales()).thenReturn(results);

        report.run();

        verify(mockOutput).printf(anyString(), eq(CITY), eq(VALUE));
    }
}
