import com.example.KTNC_Lan3.Model.SinhVien;
import com.example.KTNC_Lan3.Service.SinhVienService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SinhVienServiceTest {
    private SinhVien sinhVien;
    private SinhVienService sinhVienService;
    @BeforeEach
    void setUp(){
        sinhVienService = new SinhVienService();
        sinhVien = new SinhVien("SV001", "Nguyen Van A", 20, 7.5f, 3, "CNTT");
        sinhVienService.themSinhVien(sinhVien);
    }
    @Test
    void testThemSinhVienThanhCong(){
        SinhVien newSV = new SinhVien("", "Nguyen Van A", 20, 7.5f, 3, "CNTT");
        sinhVienService.themSinhVien(newSV);
    }
}
