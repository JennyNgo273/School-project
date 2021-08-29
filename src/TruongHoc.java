import java.util.ArrayList;

public class TruongHoc implements NhapXuat{
	
	//1. Attributes 
	private DanhSachHocSinh objHocSinh;
	private DanhSachGiaoVien objGiaoVien;
	
	//2. Get, Set 
	
	public DanhSachHocSinh getObjHocSinh() {
		return objHocSinh;
	}

	

	public void setObjHocSinh(DanhSachHocSinh objHocSinh) {
		this.objHocSinh = objHocSinh;
	}

	public DanhSachGiaoVien getObjGiaoVien() {
		return objGiaoVien;
	}

	public void setObjGiaoVien(DanhSachGiaoVien objGiaoVien) {
		this.objGiaoVien = objGiaoVien;
	}
	//3. Constructor
	public TruongHoc() {
//		this.objGiaoVien = new DanhSachGiaoVien();
//		this.objGiaoVien.taoDuLieu();
//		this.objHocSinh = new DanhSachHocSinh();
//		this.objHocSinh.taoDuLieu();
	}
	//4. Input, Output

	@Override
	public void xuat() {
		//this.objHocSinh.xuat();
	}
	
	public void xuatDSHS() {
		this.objHocSinh.xuat();
	}
	
	public void xuatDSGV() {
		this.objGiaoVien.xuat();
	}
	
	
	
	//5. Business method
	
	public void taoDuLieu() {
		this.objHocSinh = new DanhSachHocSinh();
		this.objHocSinh.taoDuLieu();
		
		this.objGiaoVien = new DanhSachGiaoVien();
		this.objGiaoVien.taoDuLieu();
		
		
	}
	
	public void thamNienCuaGV() {
		this.objGiaoVien.tinhTN();
	}
	
	
//	public void timTNcaoNhatCuaGV() {
//		this.objGiaoVien.timMaxGVcoThamNien();
//	}
	
	public ArrayList<GiaoVien> timTNcaoNhatCuaGV(){
		return this.objGiaoVien.timMaxGVcoThamNien();
	} 
	
	public ArrayList<GiaoVien> timGVcoTNhon5vaCMTN() {
		return this.objGiaoVien.timGVcoTNhon5vaCMTN();
	}
	
	public void tinhDTB() {
		this.objHocSinh.tinhDiemTB();
	}
	
//	public void tinhMaxDTB() {
//		this.objHocSinh.timDTBcaoNhat();
//	}
	
	
	public ArrayList<HocSinh> timDTBcaoNhat(){
		return this.objHocSinh.timDTBcaoNhat();
	}
	
	public void xepLoaiHS() {
		this.objHocSinh.xepLoaiHocSinh();
	}
	
	public void DTBgiamDan() {
		this.objHocSinh.sortDiem();;
	}

	public void sapXepABC() {
		this.objHocSinh.sortName();
	}
	
	public void xuatHS(ArrayList<HocSinh> list) {
		int i = 0;
		for (HocSinh hs : list) {
			hs.xuat();
			i++;
		}
	}
	
	public void xuatGV(ArrayList<GiaoVien> list) {
		int i = 0;
		for (GiaoVien gv : list) {
			gv.xuat();
			i++;
		}
	}
	

	

	

}
