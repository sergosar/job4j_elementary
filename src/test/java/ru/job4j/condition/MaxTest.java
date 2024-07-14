package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10ToMinus7Then10() {
        int left = 10;
        int right = -7;
        int result = Max.max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxMinus100ToMinus7ThenMinus7() {
        int left = -100;
        int right = -7;
        int result = Max.max(left, right);
        int expected = -7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax8To8Then8() {
        int left = 8;
        int right = 8;
        int result = Max.max(left, right);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1And2And3Then3() {
        int left = 1;
        int right = 2;
        int top = 3;
        int result = Max.max(left, right, top);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1And2And3AndMinus50Then3() {
        int left = 1;
        int right = 2;
        int top = 3;
        int bottom = -50;
        int result = Max.max(left, right, top, bottom);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }
}
