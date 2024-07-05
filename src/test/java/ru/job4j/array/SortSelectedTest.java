package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[]{5, 2, -150};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{-150, 2, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[]{5, -150, 9, 17, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{-150, 5, 8, 9, 17};
        assertThat(result).containsExactly(expected);
    }
}