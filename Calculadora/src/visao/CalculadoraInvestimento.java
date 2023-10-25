package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CalculadoraInvestimento extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textDepMes;
	private JTextField textNumMes;
	private JTextField textJurosMes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraInvestimento frame = new CalculadoraInvestimento();
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
	public CalculadoraInvestimento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDepositoMes = new JLabel("Depósito mensal R$:");
		lblDepositoMes.setBounds(56, 11, 120, 14);
		contentPane.add(lblDepositoMes);
		
		textDepMes = new JTextField();
		textDepMes.setBounds(66, 36, 86, 20);
		contentPane.add(textDepMes);
		textDepMes.setColumns(10);
		
		textNumMes = new JTextField();
		textNumMes.setBounds(66, 82, 86, 20);
		contentPane.add(textNumMes);
		textNumMes.setColumns(10);
		
		JLabel lblNumMes = new JLabel("Num. de meses: ");
		lblNumMes.setBounds(56, 57, 80, 14);
		contentPane.add(lblNumMes);
		
		textJurosMes = new JTextField();
		textJurosMes.setBounds(66, 138, 86, 20);
		contentPane.add(textJurosMes);
		textJurosMes.setColumns(10);
		
		JLabel lblJurosMes = new JLabel("Juros ao mês %:");
		lblJurosMes.setBounds(56, 113, 99, 14);
		contentPane.add(lblJurosMes);
		
		JLabel lblInvestido = new JLabel("Total investido + juros R$: ");
		lblInvestido.setBounds(56, 158, 148, 14);
		contentPane.add(lblInvestido);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(66, 177, 89, 23);
		contentPane.add(btnCalcular);
	}
}
