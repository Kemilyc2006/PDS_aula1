package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Calculadora;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class exercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textPrim;
	private JTextField textSegun;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exercicio2 frame = new exercicio2();
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
	public exercicio2() {
		setTitle("Calculadora ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(7, 2, 0, 0));
		
		JLabel lblPriNumInt = new JLabel("Primeiro Número Inteiro: ");
		lblPriNumInt.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		contentPane.add(lblPriNumInt);
		
		textPrim = new JTextField();
		contentPane.add(textPrim);
		textPrim.setColumns(10);
		
		JLabel lblSegNumInt = new JLabel("Segundo Número Inteiro: ");
		lblSegNumInt.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		contentPane.add(lblSegNumInt);
		
		textSegun = new JTextField();
		contentPane.add(textSegun);
		textSegun.setColumns(10);
		
		JRadioButton rdbtnAdicao = new JRadioButton("Adição(+): ");
		rdbtnAdicao.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		contentPane.add(rdbtnAdicao);
		
		JLabel label_1 = new JLabel("");
		contentPane.add(label_1);
		
		JRadioButton rdbtnSubtracao = new JRadioButton("Subtração(-):");
		rdbtnSubtracao.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		contentPane.add(rdbtnSubtracao);
		
		JLabel label_2 = new JLabel("");
		contentPane.add(label_2);
		
		JRadioButton rdbtnMult = new JRadioButton("Multiplicação(x):");
		rdbtnMult.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		contentPane.add(rdbtnMult);
		
		JLabel label_7 = new JLabel("");
		contentPane.add(label_7);
		
		JRadioButton rdbtnDivisao = new JRadioButton("Divisão(/):");
		rdbtnDivisao.setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		contentPane.add(rdbtnDivisao);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblResult = new JLabel("");
		lblResult.setBounds(147, 11, 55, 14);
		panel_1.add(lblResult);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnCalc = new JButton("Calcular");
		btnCalc.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String PriDigitada = textPrim.getText ();
				String SegunDigitada = textSegun.getText ();
				
				Integer Primeiro = Integer.valueOf(PriDigitada);
				Integer Segundo  = Integer.valueOf(SegunDigitada);
				
				Calculadora calculo = new Calculadora();
				Integer SomaCalcular = calculo.calculoSoma(Primeiro, Segundo);
				Integer SubCalcular = calculo.calculoSub(Primeiro, Segundo);
				Integer MultCalcular = calculo.calculoMult(Primeiro, Segundo);
				Float DivCalcular = calculo.calculoDiv(Primeiro, Segundo);
				String SomaCalc = String.valueOf(SomaCalcular);
				String SubCalc = String.valueOf(SubCalcular);
				String MultCalc = String.valueOf(MultCalcular);
				String DivCalc = String.valueOf(DivCalcular);
				

				if(rdbtnAdicao.isSelected()) {
					lblResult.setText(SomaCalc);
				}
				 if(rdbtnSubtracao.isSelected()) {
					lblResult.setText(SubCalc);
					
				}
				 if(rdbtnMult.isSelected()) {
					lblResult.setText(MultCalc);
				 }
				 if(rdbtnDivisao.isSelected()) {
						lblResult.setText(DivCalc);
				 }


			}
		});
		btnCalc.setBounds(10, 11, 104, 23);
		panel.add(btnCalc);
	}
}
