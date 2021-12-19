package TugasTeori12;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.awt.event.ActionEvent;

public class AppPesanMakanan {

	private JFrame frmAplikasiPemesananMakanan;
	private JTextField textFieldNama;
	private JTextField textFieldAlamat;
	private JTextField textFieldNoTelp;
	private JTextField txtHarga;
	private int totalBayar= 0;
	private Set<String> menu = new HashSet<String>();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppPesanMakanan window = new AppPesanMakanan();
					window.frmAplikasiPemesananMakanan.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppPesanMakanan() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {	
		frmAplikasiPemesananMakanan = new JFrame();
		frmAplikasiPemesananMakanan.setTitle("Aplikasi Pemesanan Makanan");
		frmAplikasiPemesananMakanan.setBounds(100, 100, 540, 520);
		frmAplikasiPemesananMakanan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAplikasiPemesananMakanan.getContentPane().setLayout(null);
		
		JLabel lblJudul = new JLabel("APLIKASI PEMESANAN");
		lblJudul.setFont(new Font("Calibri", Font.BOLD, 17));
		lblJudul.setBounds(182, 18, 159, 23);
		frmAplikasiPemesananMakanan.getContentPane().add(lblJudul);
		
		JPanel panelDataCustomer = new JPanel();
		panelDataCustomer.setBorder(new TitledBorder(null, "Data Customer", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelDataCustomer.setBounds(25, 43, 256, 165);
		frmAplikasiPemesananMakanan.getContentPane().add(panelDataCustomer);
		panelDataCustomer.setLayout(null);
		
		JLabel lblNama = new JLabel("Nama :");
		lblNama.setBounds(10, 27, 46, 14);
		panelDataCustomer.add(lblNama);
		
		JLabel lblAlamat = new JLabel("Alamat :");
		lblAlamat.setBounds(11, 66, 46, 14);
		panelDataCustomer.add(lblAlamat);
		
		JLabel lblNoTelp = new JLabel("No Telp :");
		lblNoTelp.setBounds(11, 107, 65, 14);
		panelDataCustomer.add(lblNoTelp);
		
		textFieldNama = new JTextField();
		textFieldNama.setBounds(86, 25, 120, 20);
		panelDataCustomer.add(textFieldNama);
		textFieldNama.setColumns(10);
		
		textFieldAlamat = new JTextField();
		textFieldAlamat.setBounds(86, 65, 120, 20);
		panelDataCustomer.add(textFieldAlamat);
		textFieldAlamat.setColumns(10);
		
		textFieldNoTelp = new JTextField();
		textFieldNoTelp.setBounds(86, 105, 120, 20);
		panelDataCustomer.add(textFieldNoTelp);
		textFieldNoTelp.setColumns(10);
		
		JPanel panelPilihMenu = new JPanel();
		panelPilihMenu.setBorder(new TitledBorder(null, "Pilih Menu", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelPilihMenu.setBounds(309, 71, 186, 137);
		frmAplikasiPemesananMakanan.getContentPane().add(panelPilihMenu);
		panelPilihMenu.setLayout(null);
		
		JCheckBox chckbxSphageti = new JCheckBox("Sphageti");
		chckbxSphageti.addActionListener(new
				ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(chckbxSphageti.isSelected()) {
							totalBayar += 40000;
							menu.add("Sphageti \t Rp40000");
						}
						else {
							Object o = "Sphageti \t Rp40000";
							totalBayar -= 40000;
							menu.remove(o);
						}
						txtHarga.setText(Integer.toString(totalBayar));
					}
				});
		chckbxSphageti.setBounds(6, 50, 97, 23);
		panelPilihMenu.add(chckbxSphageti);
		
		JCheckBox chckbxSteak = new JCheckBox("Steak");
		chckbxSteak.addActionListener(new
				ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(chckbxSteak.isSelected()) {
							totalBayar += 50000;
							menu.add("Steak \t Rp50000");
						}
						else {
							Object o = "Steak \t Rp50000";
							totalBayar -= 50000;
							menu.remove(o);
						}
						txtHarga.setText(Integer.toString(totalBayar));
					}
				});
		chckbxSteak.setBounds(6, 24, 97, 23);
		panelPilihMenu.add(chckbxSteak);
		
		JCheckBox chckbxPizza = new JCheckBox("Pizza");
		chckbxPizza.addActionListener(new
				ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(chckbxPizza.isSelected()) {
							totalBayar += 70000;
							menu.add("Pizza \t Rp70000");
						}
						else {
							Object o = "Pizza \t Rp70000";
							totalBayar -= 70000;
							menu.remove(o);
						}
						txtHarga.setText(Integer.toString(totalBayar));
					}
				});
		chckbxPizza.setBounds(6, 76, 97, 23);
		panelPilihMenu.add(chckbxPizza);
		
		JLabel lblTotalBayar = new JLabel("TOTAL BAYAR");
		lblTotalBayar.setFont(new Font("Calibri", Font.BOLD, 13));
		lblTotalBayar.setBounds(281, 219, 75, 14);
		frmAplikasiPemesananMakanan.getContentPane().add(lblTotalBayar);
		
		txtHarga = new JTextField();
		txtHarga.setToolTipText("");
		txtHarga.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtHarga.setHorizontalAlignment(SwingConstants.RIGHT);
		txtHarga.setForeground(Color.YELLOW);
		txtHarga.setBackground(Color.BLACK);
		txtHarga.setBounds(281, 238, 214, 31);
		frmAplikasiPemesananMakanan.getContentPane().add(txtHarga);
		txtHarga.setColumns(10);
			
		
		JPanel panelDataPenjualan = new JPanel();
		panelDataPenjualan.setBorder(new TitledBorder(null, "Data Penjualan", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelDataPenjualan.setBounds(25, 317, 468, 137);
		frmAplikasiPemesananMakanan.getContentPane().add(panelDataPenjualan);
		panelDataPenjualan.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setToolTipText("");
		scrollPane.setBounds(10, 23, 448, 103);
		panelDataPenjualan.add(scrollPane);
		
		JTextPane txtpnDataPenjualan = new JTextPane();
		scrollPane.setViewportView(txtpnDataPenjualan);
		txtpnDataPenjualan.setFont(new Font("Tahoma", Font.PLAIN,11));
		
		JButton btnTambah = new JButton("TAMBAH");
		btnTambah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nama, alamat, noTelp;
				Pemesan p;
				
				nama = textFieldNama.getText();
				alamat = textFieldAlamat.getText();
				noTelp = textFieldNoTelp.getText();			
				
				p = new Pemesan(nama, alamat, noTelp, totalBayar, menu);
				txtpnDataPenjualan.setText(p.toString());

			}
		});
		
		btnTambah.setBounds(406, 281, 89, 23);
		btnTambah.setBorder(new RoundBtn(15));
		frmAplikasiPemesananMakanan.getContentPane().add(btnTambah);
		frmAplikasiPemesananMakanan.getContentPane().setSize(250,250);
		frmAplikasiPemesananMakanan.getContentPane().setLayout(null);
		frmAplikasiPemesananMakanan.getContentPane().setVisible(true);
		
	}
}

class RoundBtn implements Border 
{
    private int r;
    RoundBtn(int r) {
        this.r = r;
    }
    public Insets getBorderInsets(Component c) {
        return new Insets(this.r+1, this.r+1, this.r+2, this.r);
    }
    public boolean isBorderOpaque() {
        return true;
    }
    public void paintBorder(Component c, Graphics g, int x, int y, 
    int width, int height) {
        g.drawRoundRect(x, y, width-1, height-1, r, r);
    }
}
