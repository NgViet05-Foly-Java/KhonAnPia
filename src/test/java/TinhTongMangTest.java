import com.example.KTNC_Lan3.TinhTongMang;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TinhTongMangTest {
    @Test
    void testMangRong(){
        TinhTongMang tinhTong = new TinhTongMang();
        assertEquals(0, tinhTong.TinhTongMang(new int[]{}));
    }
    @Test
    void testMotPhanTu() {
        TinhTongMang tinhTong = new TinhTongMang();
        assertEquals(5, tinhTong.TinhTongMang(new int[]{5}));
    }

    @Test
    void testNhieuPhanTu() {
        TinhTongMang tinhTong = new TinhTongMang();
        assertEquals(15, tinhTong.TinhTongMang(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void testSoAm() {
        TinhTongMang tinhTong = new TinhTongMang();
        assertEquals(-5, tinhTong.TinhTongMang(new int[]{-1, -2, -2}));
    }

    @Test
    void testSoLon() {
        TinhTongMang tinhTong = new TinhTongMang();
        assertEquals(1000000, tinhTong.TinhTongMang(new int[]{500000, 500000}));
    }
}
