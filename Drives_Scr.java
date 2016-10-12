import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Drives_Scr {
	JComboBox cmb_F = new JComboBox();
	JComboBox cmb_G = new JComboBox();
	JLabel lblF = new JLabel("F:");
	JLabel lblG = new JLabel("G:");
	
	JButton btnDriveUpdate = new JButton("Update Drives");
	private JFrame frame;

	
	public Drives_Scr() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 328, 522);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setActionListeners();
		
		JTextPane txtpnTest = new JTextPane();
		txtpnTest.setText("Drive Mappings");
		frame.getContentPane().add(txtpnTest, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		
		
		sl_panel.putConstraint(SpringLayout.NORTH, cmb_F, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, cmb_F, -10, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnDriveUpdate, -10, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, btnDriveUpdate, 0, SpringLayout.WEST, lblF);
		sl_panel.putConstraint(SpringLayout.NORTH, lblF, 13, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblF, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, lblG, 13, SpringLayout.SOUTH, lblF);
		sl_panel.putConstraint(SpringLayout.WEST, cmb_F, 5, SpringLayout.EAST, lblG);
		
		sl_panel.putConstraint(SpringLayout.WEST, lblG, 0, SpringLayout.WEST, lblF);
		
		sl_panel.putConstraint(SpringLayout.EAST, cmb_G, 0, SpringLayout.EAST, cmb_F);
		sl_panel.putConstraint(SpringLayout.NORTH, cmb_G, 7, SpringLayout.SOUTH, cmb_F);
		sl_panel.putConstraint(SpringLayout.WEST, cmb_G, 0, SpringLayout.WEST, cmb_F);
		
		panel.add(lblF);
		panel.add(lblG);
		panel.add(cmb_F);
		panel.add(cmb_G);
		panel.add(btnDriveUpdate);
	}
	
	private void updateDrives(){
		
	}
	private void setActionListeners(){
		btnDriveUpdate.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){	
				updateDrives();
			}
		});
	}
	
}
