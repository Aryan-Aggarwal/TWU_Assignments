package powerpackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class powertest {

    @Test
    public void oneRaisedToPowerOneIsOne() {
        assert powerfinder.OF(1,1) == 1;
    }

    @Test
    public void twoRaisedToPowerOneIsTwo() {
        assert powerfinder.OF(2,1) == 2;
    }

    @Test
    public void twoRaisedToPowerTwoIsFour() {
        assert powerfinder.OF(2, 2) == 4;
    }

    @Test
    public void threeRaisedToPowerTwoIsNine() {
        assert powerfinder.OF(3, 2) == 3*3;
    }
}