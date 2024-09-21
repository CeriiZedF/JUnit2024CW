package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
public class PrintClassTest {

    @Mock
    private Calculate calculate;

    @InjectMocks
    private PrintClass printClass;

    @Test
    void stringSumma_ShouldReturnStringResultRepresentation_WhenCalled() {
        Mockito.when(calculate.summa()).thenReturn(30);

        String expected = "30";
        String actual = printClass.stringSumma();

        Assertions.assertEquals(expected, actual, "Result should be '30'");
    }

    @Test
    void stringSummaStatic_ShouldReturnStringResultRepresentation_WhenCalled() {
        Mockito.when(calculate.summaWithParameters(10, 20)).thenReturn(30);

        String expected = "30";
        String actual = printClass.stringSummaStatic(10, 20);

        Assertions.assertEquals(expected, actual, "Result should be '30'");
    }
}
