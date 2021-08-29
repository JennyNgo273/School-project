import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class DanhSachHocSinh implements NhapXuat {

	private ArrayList<HocSinh> listHocSinh;

	public ArrayList<HocSinh> getListHocSinh() {
		return listHocSinh;
	}

	public void setListHocSinh(ArrayList<HocSinh> listHocSinh) {
		this.listHocSinh = listHocSinh;
	}

	public DanhSachHocSinh() {
		this.listHocSinh = new ArrayList<HocSinh>();
	}

	@Override
	public void xuat() {
		for (HocSinh hs : this.listHocSinh) {
			hs.xuat();
		}
	}

	public void taoDuLieu() {
		try {
			FileReader reader = new FileReader("src/HocSinh.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] listInfo = line.split(" # ");
				HocSinh hs = new HocSinh(listInfo[0], listInfo[1], listInfo[2], listInfo[3],
						Float.parseFloat(listInfo[4]), Float.parseFloat(listInfo[5]), Float.parseFloat(listInfo[6]));
				this.listHocSinh.add(hs);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<HocSinh> timDTBcaoNhat() {
		ArrayList<HocSinh> list = new ArrayList<HocSinh>();
		if (this.listHocSinh.size() > 0) {
			HocSinh hsMax = this.listHocSinh.get(0);
			int vitriMaxDauTien = 0;
			for (int i = 0; i < this.listHocSinh.size(); i++) {
				HocSinh hsCurrent = this.listHocSinh.get(i);
				if (hsCurrent.getDTB() > hsMax.getDTB()) {
					hsMax = hsCurrent;
					vitriMaxDauTien = i;
				}
			}
			// them hoc sinh co DTB cao vao list
			list.add(hsMax);

			// Da tim thay hoc sinh co DTB cao nhat (hsMax)
			for (int i = vitriMaxDauTien + 1; i < this.listHocSinh.size(); i++) {
				HocSinh hsCurrent = this.listHocSinh.get(i);
				if (hsCurrent.getDTB() == hsMax.getDTB()) {
					list.add(hsCurrent);
				}
			}
		}
		return list;
	}

	public void quickSort(ArrayList<HocSinh> listQS, int left, int right) {

		int i = left;
		int j = right;
		float x = listQS.get((left + right) / 2).getDTB();
		do {
			while (listQS.get(i).getDTB() > x) {
				i++;
			}

			while (listQS.get(j).getDTB() < x) {
				j--;
			}

			if (i <= j) {
				Collections.swap(listQS, i++, j--);
			}
		} while (i < j);
		if (j > left) {
			quickSort(listQS, left, j);
		}
		if (i < right) {
			quickSort(listQS, i, right);
		}
	}
	
	public void sortDiem() {
		quickSort(listHocSinh, 0, listHocSinh.size() - 1);
	}

	public void bubbleSort(ArrayList<HocSinh> listBS) {
		int i, j;
		for (i = 0; i < listHocSinh.size() - 1; i++) {
			for (j = listHocSinh.size() - 1; j > i; j--) {
				HocSinh hsJ = listBS.get(j);
				HocSinh hsJ1 = listBS.get(j - 1);
				if (hsJ.getHoTen().compareToIgnoreCase(hsJ1.getHoTen()) < 0) {
					Collections.swap(listBS, j, j - 1);
				}

			}
		}
	}
	public void sortName() {
		bubbleSort(listHocSinh);
	}

	public void tinhDiemTB() {
		for (HocSinh hs : this.listHocSinh) {
			hs.tinhDTB();
		}
	}

	public void xepLoaiHocSinh() {
		for (HocSinh hs : this.listHocSinh) {
			hs.xepLoai();
		}
	}

}
