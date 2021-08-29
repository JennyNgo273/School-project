import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DanhSachGiaoVien implements NhapXuat {

	private ArrayList<GiaoVien> listGiaoVien;

	public ArrayList<GiaoVien> getListGiaoVien() {
		return listGiaoVien;
	}

	public void setListGiaoVien(ArrayList<GiaoVien> listGiaoVien) {
		this.listGiaoVien = listGiaoVien;
	}

	public DanhSachGiaoVien() {
		this.listGiaoVien = new ArrayList<GiaoVien>();
	}

	public void taoDuLieu() {
		try {
			FileReader reader = new FileReader("src/GiaoVien.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] listInfo = line.split(" # ");

				GiaoVien gv = new GiaoVien(listInfo[0], listInfo[1], listInfo[2], listInfo[3], Float.parseFloat(listInfo[4]), listInfo[5]);
				this.listGiaoVien.add(gv);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void xuat() {
		for (GiaoVien gv : this.listGiaoVien) {
			gv.xuat();
		}

	}

	public ArrayList<GiaoVien> timMaxGVcoThamNien() {
		ArrayList<GiaoVien> list = new ArrayList<GiaoVien>();
		if (this.listGiaoVien.size() > 0) {
			GiaoVien gvMax = this.listGiaoVien.get(0);
			int vitriMaxDauTien = 0;
			for (int i = 0; i < this.listGiaoVien.size(); i++) {
				GiaoVien gvCurrent = this.listGiaoVien.get(i);
				if (gvCurrent.getThamNien() > gvMax.getThamNien()) {
					gvMax = gvCurrent;
					vitriMaxDauTien = i;
				}
			}
			// them Giao vien co tham nien cao vao list
			list.add(gvMax);

			// Da tim thay giao vien co tham nien cao nhat (gvMax)
			for (int i = vitriMaxDauTien + 1; i < this.listGiaoVien.size(); i++) {
				GiaoVien gvCurrent = this.listGiaoVien.get(i);
				if (gvCurrent.getThamNien() == gvMax.getThamNien()) {
					list.add(gvCurrent);
				}
			}
		}
		return list;
	}

	public ArrayList<GiaoVien> timGVcoTNhon5vaCMTN() {
		ArrayList<GiaoVien> list5TN = new ArrayList<GiaoVien>();
		System.out.println("Giao vien co tham hon 5 nam va chuyen mon la tu nhien: ");
		for (GiaoVien gv : this.listGiaoVien) {
			if (gv.getThamNien() > 5 && gv.getChuyenMon().equalsIgnoreCase("tu nhien")) {
				list5TN.add(gv);
				
			}
		}
		return list5TN;
	}

	public void tinhTN() {
		for (GiaoVien gv : this.listGiaoVien) {
			gv.tinhThamNien();
		}
	}
	


}
