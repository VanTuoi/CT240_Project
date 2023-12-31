package View.Report;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

import Controller.executed;
import View.Login.DangNhap;

public class thongkedoanhthu extends JPanel {

	static JLabel lbtongdoanhthu_kq, lbsodonhang_kq, lbtongloinhuan_kq;
	private executed ect;

	public void hienthibaocao() {
		double tongdoanhthu = ect.baocao_tongdoanhthu();
		lbtongdoanhthu_kq.setText(ect.DinhDangSo(tongdoanhthu));
		
		int sohoadon = ect.baocao_tonghoadon();
		lbsodonhang_kq.setText(ect.DinhDangSo(sohoadon));
		
		double chiphi = ect.baocao_tongloinhuan();
		double tongloinhuan = tongdoanhthu - chiphi;
		lbtongloinhuan_kq.setText(ect.DinhDangSo(tongloinhuan));
	}

	public void setNgay1(int y,int m ,int d) {
		ect.setNgay1(y,m,d);
	}

	public void setNgay2(int y,int m ,int d) {
		ect.setNgay2(y,m,d);
	}

	public thongkedoanhthu(int d1, int m1, int y1, int d2, int m2, int y2) {
		ect = new executed(DangNhap.con, d1, d2, m1, m2, y1, y2);

		GUI();
	}

	private void GUI() {
		setLayout(new GridLayout(0, 4, 5, 5));

		JPanel panel_tongdoanhthu = new JPanel();
		panel_tongdoanhthu.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, Color.CYAN));
		panel_tongdoanhthu.setBackground(Color.WHITE);
		add(panel_tongdoanhthu);
		panel_tongdoanhthu.setLayout(new BorderLayout(0, 0));

		JLabel lbtongdoanhthu = new JLabel("Tổng Doanh Thu");
		lbtongdoanhthu.setVerticalTextPosition(SwingConstants.BOTTOM);
		lbtongdoanhthu.setIconTextGap(15);
		lbtongdoanhthu.setIcon(new ImageIcon("Imager\\tongdoanhthu-40.png"));
		lbtongdoanhthu.setBackground(Color.WHITE);
		lbtongdoanhthu.setHorizontalAlignment(SwingConstants.CENTER);
		lbtongdoanhthu.setFont(new Font("Arial", Font.PLAIN, 18));
		panel_tongdoanhthu.add(lbtongdoanhthu, BorderLayout.SOUTH);

		lbtongdoanhthu_kq = new JLabel("0");
		lbtongdoanhthu_kq.setHorizontalAlignment(SwingConstants.CENTER);
		lbtongdoanhthu_kq.setFont(new Font("Arial", Font.PLAIN, 20));
		panel_tongdoanhthu.add(lbtongdoanhthu_kq, BorderLayout.CENTER);

		JPanel panel_tongloinhuan = new JPanel();
		panel_tongloinhuan.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, Color.CYAN));
		panel_tongloinhuan.setBackground(Color.WHITE);
		add(panel_tongloinhuan);
		panel_tongloinhuan.setLayout(new BorderLayout(0, 0));

		JLabel lbtongloinhuan = new JLabel("Tổng Lợi Nhuận");
		lbtongloinhuan.setFont(new Font("Arial", Font.PLAIN, 18));
		lbtongloinhuan.setVerticalTextPosition(SwingConstants.BOTTOM);
		lbtongloinhuan.setIcon(new ImageIcon("Imager\\tongloinhuan-40.png"));
		lbtongloinhuan.setIconTextGap(15);
		lbtongloinhuan.setHorizontalTextPosition(SwingConstants.RIGHT);
		lbtongloinhuan.setHorizontalAlignment(SwingConstants.CENTER);
		panel_tongloinhuan.add(lbtongloinhuan, BorderLayout.SOUTH);

		lbtongloinhuan_kq = new JLabel("0");
		lbtongloinhuan_kq.setHorizontalAlignment(SwingConstants.CENTER);
		lbtongloinhuan_kq.setFont(new Font("Arial", Font.PLAIN, 20));
		panel_tongloinhuan.add(lbtongloinhuan_kq, BorderLayout.CENTER);

		JPanel panel_sodonhang = new JPanel();
		panel_sodonhang.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, Color.CYAN));
		panel_sodonhang.setBackground(Color.WHITE);
		add(panel_sodonhang);
		panel_sodonhang.setLayout(new BorderLayout(0, 5));

		JLabel lbtongsodonhang = new JLabel("Số Đơn Hàng");
		lbtongsodonhang.setIcon(new ImageIcon("Imager\\tongsodonhang-45.png"));
		lbtongsodonhang.setVerticalTextPosition(SwingConstants.BOTTOM);
		lbtongsodonhang.setVerticalAlignment(SwingConstants.BOTTOM);
		lbtongsodonhang.setIconTextGap(15);
		lbtongsodonhang.setHorizontalAlignment(SwingConstants.CENTER);
		lbtongsodonhang.setFont(new Font("Arial", Font.PLAIN, 18));
		panel_sodonhang.add(lbtongsodonhang, BorderLayout.SOUTH);

		lbsodonhang_kq = new JLabel("0");
		lbsodonhang_kq.setHorizontalAlignment(SwingConstants.CENTER);
		lbsodonhang_kq.setFont(new Font("Arial", Font.PLAIN, 20));
		panel_sodonhang.add(lbsodonhang_kq, BorderLayout.CENTER);


	}
}
