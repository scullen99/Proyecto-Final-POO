package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana {

	private JFrame frmVentana;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frmVentana.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVentana = new JFrame();
		frmVentana.setTitle("Ventana Proyecto Final POO Sergio Esteban Tarrero");
		frmVentana.setBounds(100, 100, 900, 500);
		frmVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVentana.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JTextPane txtpnProyecto = new JTextPane();
		txtpnProyecto.setText("Proyecto Final POO - Sergio Esteban Tarrero");
		frmVentana.getContentPane().add(txtpnProyecto, BorderLayout.NORTH);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.window);
		frmVentana.getContentPane().add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setToolTipText("Cometologia");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frmVentana.getContentPane().add(btnNewButton, BorderLayout.WEST);
	}

}
