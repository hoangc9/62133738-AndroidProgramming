package thigk2.NguyenNhatHoang.baigiuaky;

public class TouristSpot {
    private String ten;
    private String diaChi;
    private int hinhAnh; // drawable resource id

    public TouristSpot(String ten, String diaChi, int hinhAnh) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.hinhAnh = hinhAnh;
    }

    public String getTen() { return ten; }
    public String getDiaChi() { return diaChi; }
    public int getHinhAnh() { return hinhAnh; }
}