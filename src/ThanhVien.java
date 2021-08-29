/*
 * Muc Dich: Tao lop Thanh Vien de quan ly thong tinthanh vien cho cac lop ke thua 
 * 
 */
public class ThanhVien implements NhapXuat {

	// 1. Attributes
	protected String hoTen;
	protected String namSinh;
	protected String noiSinh;
	protected String diaChi;

	// 2. Get, Set
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(String namSinh) {
		this.namSinh = namSinh;
	}

	public String getNoiSinh() {
		return noiSinh;
	}

	public void setNoiSinh(String noiSinh) {
		this.noiSinh = noiSinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	// 3. Constructor
	public ThanhVien() {

	}

	/**
	 * @param hoTen
	 * @param namSinh
	 * @param noiSinh
	 * @param diaChi
	 */
	public ThanhVien(String hoTen, String namSinh, String noiSinh, String diaChi) {
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.noiSinh = noiSinh;
		this.diaChi = diaChi;
	}

	// 4. Input, Output
	public void xuat() {
		System.out.println("Ho va Ten: " + this.hoTen + "\tNam Sinh: " + this.namSinh + "\tNoi Sinh: " + this.noiSinh
				+ "\tDia Chi: " + this.diaChi);
	}

	// 5. Business method

}
