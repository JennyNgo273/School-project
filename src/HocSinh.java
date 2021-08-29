/*
 * Muc Dich: Tao lop Hoc Sinh de quan ly thong tin hoc sinh 
 * 
 */
public class HocSinh extends ThanhVien {

	// 1. Attributes
	private float diemToan;
	private float diemVan;
	private float diemNgoaiNgu;
	private float DTB;
	private String xepLoai;
	// 2. Get, set

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemVan() {
		return diemVan;
	}

	public void setDiemVan(float diemVan) {
		this.diemVan = diemVan;
	}

	public float getDiemNgoaiNgu() {
		return diemNgoaiNgu;
	}

	public void setDiemNgoaiNgu(float diemNgoaiNgu) {
		this.diemNgoaiNgu = diemNgoaiNgu;
	}

	public float getDTB() {
		return DTB;
	}

	public String getxepLoai() {
		return this.xepLoai;
	}

	// 3. Constructors

	/**
	 * @param diemToan
	 * @param diemVan
	 * @param diemNgoaiNgu
	 */
	public HocSinh(float diemToan, float diemVan, float diemNgoaiNgu) {
		// super();
		this.diemToan = diemToan;
		this.diemVan = diemVan;
		this.diemNgoaiNgu = diemNgoaiNgu;
	}

	public HocSinh() {

	}

	public HocSinh(String hoTen, String namSinh, String noiSinh, String diaChi, float diemToan, float diemVan,
			float diemNgoaiNgu) {
		super(hoTen, namSinh, noiSinh, diaChi);
		this.diemToan = diemToan;
		this.diemVan = diemVan;
		this.diemNgoaiNgu = diemNgoaiNgu;
	}

	// 4. input, out

	public void xuat() {
		super.xuat();
		System.out.println("\tDiem Toan: " + this.diemToan + "\tDiem Van: " + this.diemVan + "\tDiem Ngoai Ngu: "
				+ this.diemNgoaiNgu + "\tDTB la: " + this.DTB + "\tXep Loai: " + this.xepLoai);
	}
	// 5. Business methods

	public void tinhDTB() {
		this.DTB = (this.diemNgoaiNgu + this.diemToan + this.diemVan) / 3;
	}

	public void xepLoai() {
		if (this.DTB >= 9) {
			this.xepLoai = "Xuat Sac";
		} else if (this.DTB >= 8) {
			this.xepLoai = "Gioi";
		} else if (this.DTB >= 7) {
			this.xepLoai = "Kha";
		} else if (this.DTB >= 5) {
			this.xepLoai = "TB";
		} else {
			this.xepLoai = "Yeu";
		}
	}

}
