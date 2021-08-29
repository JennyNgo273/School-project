/*
 * Muc Dich: Tao lop giao vien de quan ly thong tin cua giao vien
 * 
 */
public class GiaoVien extends ThanhVien {

	// 1. Attributes
	private float namBD;
	private String chuyenMon;
	private float thamNien;
	// 2. Get, Set

	public float getNamBD() {
		return namBD;
	}

	public void setNamBD(int namBD) {
		this.namBD = namBD;
	}

	public String getChuyenMon() {
		return chuyenMon;
	}

	public void setChuyenMon(String chuyenMon) {
		this.chuyenMon = chuyenMon;
	}

	public float getThamNien() {
		return thamNien;
	}

	// 3. Constructor
	public GiaoVien() {
		// TODO Auto-generated constructor stub
	}

	public GiaoVien(String hoTen, String namSinh, String noiSinh, String diaChi) {
		super(hoTen, namSinh, noiSinh, diaChi);

	}

	/**
	 * @param namBD
	 * @param chuyenMon
	 */
	public GiaoVien(String hoTen, String namSinh, String noiSinh, String diaChi, float namBD, String chuyenMon) {
		super(hoTen, namSinh, noiSinh, diaChi);
		this.namBD = namBD;
		this.chuyenMon = chuyenMon;
	}

	// 4. Input, Output
	public void xuat() {
		super.xuat();
		System.out.println("Nam bat dau day: " + this.namBD + "\tChuyen mon: " + this.chuyenMon + "\tTham Nien: " + this.thamNien);
	}

	// 5. Business method
	public void tinhThamNien() {
		this.thamNien = 2021 - this.namBD;
	}

}
