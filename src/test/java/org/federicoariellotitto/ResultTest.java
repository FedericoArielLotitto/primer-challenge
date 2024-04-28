package org.federicoariellotitto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResultTest {
    Result resolver;

    @BeforeEach
    void setUp() {
        resolver = new Result();
    }

    @Test
    public void maximaDiferencia_given4DescendendantNumbers_shouldReturnMinus1() {
        List<Integer> numbers = List.of(90, 88, 49, 39);

        int result = resolver.maximaDiferencia(numbers);
        assertEquals(result, -1);
    }

    @Test
    public void maximaDiferencia_given4DifferentNumbers_shouldReturn7() {
        List<Integer> numbers = List.of(15, 3, 6, 10);

        int result = resolver.maximaDiferencia(numbers);
        assertEquals(result, 7);
    }

    @Test
    public void balancedBraces_givenOneInCorrectOrderAndOtherIncorrect_shouldReturnYESandNO() {
        List<String> braces = List.of("(({}))", "[}(]");

        List<String> result = resolver.balancedBraces(braces);

        assertEquals(result, List.of("YES", "NO"));
    }
}
