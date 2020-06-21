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
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Ventana {

	private JFrame frmVentana;

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
		frmVentana.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Cometolog\u00EDa");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(21, 100, 177, 23);
		frmVentana.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Construcci\u00F3n y Mantenimiento");
		btnNewButton_1.setBounds(21, 136, 177, 23);
		frmVentana.getContentPane().add(btnNewButton_1);
		
		JTextPane txtpnBuscar = new JTextPane();
		txtpnBuscar.setAlignmentX(Component.LEFT_ALIGNMENT);
		txtpnBuscar.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		txtpnBuscar.setText("Buscar persona");
		txtpnBuscar.setBounds(424, 503, 129, 29);
		frmVentana.getContentPane().add(txtpnBuscar);
		
		JButton btnNewButton_1_1 = new JButton("Control de Robots");
		btnNewButton_1_1.setBounds(21, 170, 177, 23);
		frmVentana.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Investigaci\u00F3n Biol\u00F3gica");
		btnNewButton_1_1_1.setBounds(21, 274, 177, 23);
		frmVentana.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Investigaci\u00F3n Astron\u00F3mica");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2.setBounds(21, 240, 177, 23);
		frmVentana.getContentPane().add(btnNewButton_1_2);
		
		JButton btnDireccin = new JButton("Direcci\u00F3n");
		btnDireccin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDireccin.setBounds(21, 204, 177, 23);
		frmVentana.getContentPane().add(btnDireccin);
		
		JButton btnLogstica = new JButton("Log\u00EDstica");
		btnLogstica.setBounds(21, 308, 177, 23);
		frmVentana.getContentPane().add(btnLogstica);
		
		JButton btnNewButton_1_2_1 = new JButton("M\u00E9dico");
		btnNewButton_1_2_1.setBounds(21, 344, 177, 23);
		frmVentana.getContentPane().add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Navegaci\u00F3n");
		btnNewButton_1_1_1_1.setBounds(21, 378, 177, 23);
		frmVentana.getContentPane().add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("Sistemas Inform\u00E1ticos");
		btnNewButton_1_1_1_1_1.setBounds(21, 412, 177, 23);
		frmVentana.getContentPane().add(btnNewButton_1_1_1_1_1);
		
		JLabel lblNewLabel = new JLabel("Proyecto Final POO - Sergio Esteban Tarrero");
		lblNewLabel.setBounds(674, 536, 300, 14);
		frmVentana.getContentPane().add(lblNewLabel);
		
		JLabel lblProyectoFinalPoo = new JLabel("https://github.com/scullen99/Proyecto-Final-POO.git");
		lblProyectoFinalPoo.setBounds(36, 536, 300, 14);
		frmVentana.getContentPane().add(lblProyectoFinalPoo);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
