package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ob_sanpham {
	private String mahang, tenhang, donvitinh, ghichu, ngaykhoitao;
	private double gianhap, giabanle,soluong;
	private SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd");

	public ob_sanpham() {

	}

	public ob_sanpham(String mahang, String tenhang, String donvitinh, String ghichu, String anh, String ngaykhoitao,
			double gianhap, double giabanle, double soluong) throws Exception {
		super();
		this.mahang = mahang;
		this.tenhang = tenhang;
		this.donvitinh = donvitinh;
		this.ghichu = ghichu;
		this.soluong = soluong;
		setNgaykhoitao(ngaykhoitao);
		setGianhap(gianhap);
		setGiabanle(giabanle);
	}

	public double getGianhap() {
		return gianhap;
	}

	public void setGianhap(double gianhap) throws Exception {
		if (gianhap < 0)
			throw new Exception("sai gia nhap");
		this.gianhap = gianhap;
	}

	public double getGiabanle() {

		return giabanle;
	}

	public void setGiabanle(double giabanle) throws Exception {
		if (giabanle < 0)
			throw new Exception("sai gia ban le");
		this.giabanle = giabanle;
	}

	public String getMahang() {
		return mahang;
	}

	public void setMahang(String mahang) {
		this.mahang = mahang;
	}

	public String getTenhang() {
		return tenhang;
	}
	public double getSoLuong() {
		return soluong;
	}


	public void setTenhang(String tenhang) {
		this.tenhang = tenhang;
	}
	public void setSoluong(double soluong) {
		this.soluong = soluong;
	}
	public String getDonvitinh() {
		return donvitinh;
	}

	public void setDonvitinh(String donvitinh) {
		this.donvitinh = donvitinh;
	}

	public String getGhichu() {
		return ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}

	public String getNgaykhoitao() {
		return ngaykhoitao;
	}

	public void setNgaykhoitao(String ngaykhoitao) throws ParseException {
		if (ngaykhoitao == null || ngaykhoitao.equals(""))
			this.ngaykhoitao = ngaytao();
		else {
			Date date = simple.parse(ngaykhoitao);
			this.ngaykhoitao = simple.format(date);
		}

	}

	public String ngaytao() {
		Calendar c = Calendar.getInstance();

		java.util.Date date = c.getTime();
		String s = simple.format(date);
		return s;
	}

	@Override
	public String toString() {
		return mahang + ";" + tenhang + ";" + gianhap + ";" + giabanle + ";" + donvitinh + ";" + ghichu + ";"
				+ ngaykhoitao;
	}

}
