package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double output = point1.distance(point2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11to22then1dot4142() {
        double expected = 1.4142;
        Point point1 = new Point(1, 1);
        Point point2 = new Point(2, 2);
        double output = point1.distance(point2);
        assertThat(output).isEqualTo(expected, withPrecision(0.0001));
    }

    @Test
    void when00to34then5() {
        double expected = 5;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 4);
        double output = point1.distance(point2);
        assertThat(output).isEqualTo(expected, withPrecision(0.0001));
    }

    @Test
    void whenMinus8Minus9to34then17dot0293() {
        double expected = 17.0293;
        Point point1 = new Point(-8, -9);
        Point point2 = new Point(3, 4);
        double output = point1.distance(point2);
        assertThat(output).isEqualTo(expected, withPrecision(0.0001));
    }

    @Test
    void when000To345then7dot0710() {
        double expected = 7.0710;
        Point point1 = new Point(0, -0, 0);
        Point point2 = new Point(3, 4, 5);
        double output = point1.distance3d(point2);
        assertThat(output).isEqualTo(expected, withPrecision(0.0001));
    }

}
