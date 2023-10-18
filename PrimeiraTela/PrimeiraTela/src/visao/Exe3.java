package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Calculo;
import modelo.ConversaoTemp;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exe3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textAltura;
	private JTextField textBase;
	private JButton btnLimpar;
	private JButton btnCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exe3 frame = new Exe3();
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
	public Exe3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(234, 164, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textAltura = new JTextField();
		textAltura.setBackground(new Color(255, 223, 223));
		textAltura.setBounds(166, 84, 128, 20);
		contentPane.add(textAltura);
		textAltura.setColumns(10);
		
		textBase = new JTextField();
		textBase.setBackground(new Color(255, 223, 223));
		textBase.setBounds(166, 136, 128, 20);
		contentPane.add(textBase);
		textBase.setColumns(10);
		
		JLabel lblTitulo = new JLabel("Insira a altura e a base do triângulo: ");
		lblTitulo.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblTitulo.setForeground(new Color(0, 0, 0));
		lblTitulo.setBounds(73, 33, 310, 14);
		contentPane.add(lblTitulo);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setFont(new Font("NSimSun", Font.BOLD | Font.ITALIC, 14));
		lblAltura.setBounds(59, 87, 63, 14);
		contentPane.add(lblAltura);
		
		JLabel lblBase = new JLabel("Base: ");
		lblBase.setFont(new Font("NSimSun", Font.BOLD | Font.ITALIC, 14));
		lblBase.setBounds(59, 139, 46, 14);
		contentPane.add(lblBase);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setBackground(new Color(255, 223, 223));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAltura.setText("");
				textBase.setText("");

			}
		});
		btnLimpar.setBounds(33, 204, 89, 23);
		contentPane.add(btnLimpar);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String AltDigitada = textAltura.getText ();
				String BaseDigitada = textBase.getText ();

				float Altura = Float.valueOf(AltDigitada);
				float Base = Float.valueOf(BaseDigitada);
				
				Calculo calcular = new Calculo();
				float perimetroCalcular = calcular.calculoPe(Altura, Base);
				float alturaCalcular = calcular.calculoA(Altura, Base);
				JOptionPane.showMessageDialog(null, "O Calculo do Perímetro é: " +perimetroCalcular + "\nO calculo da Área é: " +alturaCalcular );

							}
		});
		btnCalcular.setBounds(294, 204, 89, 23);
		contentPane.add(btnCalcular);
	}
}
