package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exe4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textPago;
	private JTextField textGasolina;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exe4 frame = new Exe4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Exe4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblValor = new JLabel("Valor pago: ");
		lblValor.setFont(new Font("Yu Gothic", Font.BOLD, 16));
		lblValor.setForeground(new Color(0, 0, 160));
		lblValor.setBounds(34, 43, 98, 27);
		contentPane.add(lblValor);
		
		textPago = new JTextField();
		textPago.setBounds(190, 44, 86, 20);
		contentPane.add(textPago);
		textPago.setColumns(10);
		
		JLabel lblGasolina = new JLabel("Valor da gasolina: ");
		lblGasolina.setFont(new Font("Yu Gothic", Font.BOLD, 16));
		lblGasolina.setForeground(new Color(0, 0, 160));
		lblGasolina.setBounds(34, 93, 146, 34);
		contentPane.add(lblGasolina);
		
		JButton btnCalculo = new JButton("Calcular");
		btnCalculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ValorP = textPago.getText ();
					float Pago = Float.valueOf(ValorP);
					
			    String ValorL = textGasolina.getText ();
					float Gasolina = Float.valueOf(ValorL);
					
				float ValorT = Pago / Gasolina;
				JOptionPane.showMessageDialog(null, "Quantidade de litros: " +ValorT);
				

			}
		});
		btnCalculo.setBackground(new Color(128, 128, 255));
		btnCalculo.setBounds(165, 196, 98, 34);
		contentPane.add(btnCalculo);
		
		textGasolina = new JTextField();
		textGasolina.setBounds(190, 98, 86, 20);
		contentPane.add(textGasolina);
		textGasolina.setColumns(10);
	}

}
