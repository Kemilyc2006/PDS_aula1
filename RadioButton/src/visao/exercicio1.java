package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Calculo;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class exercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textAltura;
	private JTextField textBase;
	private JButton btnLimpar;
	private JButton btnCalcular;
	private JButton btnFechar;
	private JRadioButton rdbtnArea;
	private JRadioButton rdbtnPerimetro;
	private JLabel lblResultado;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exercicio1 frame = new exercicio1();
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
	public exercicio1() {
		setTitle("retangulo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textAltura = new JTextField();
		textAltura.setBackground(new Color(255, 223, 223));
		textAltura.setBounds(10, 45, 128, 20);
		contentPane.add(textAltura);
		textAltura.setColumns(10);
		
		textBase = new JTextField();
		textBase.setBackground(new Color(255, 223, 223));
		textBase.setBounds(272, 45, 128, 20);
		contentPane.add(textBase);
		textBase.setColumns(10);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setFont(new Font("NSimSun", Font.BOLD | Font.ITALIC, 14));
		lblAltura.setBounds(306, 26, 63, 14);
		contentPane.add(lblAltura);
		
		JLabel lblBase = new JLabel("Base: ");
		lblBase.setFont(new Font("NSimSun", Font.BOLD | Font.ITALIC, 14));
		lblBase.setBounds(33, 26, 46, 14);
		contentPane.add(lblBase);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setBackground(new Color(255, 223, 223));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAltura.setText("");
				textBase.setText("");
				lblResultado.setText("");

			}
		});
		btnLimpar.setBounds(157, 204, 89, 23);
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
				float areaCalcular = calcular.calculoA(Altura, Base);
				String perimetroCalc = String.valueOf(perimetroCalcular);
				String areaCalc = String.valueOf(areaCalcular);

				
				if(rdbtnArea.isSelected()) {
					 lblResultado.setText(areaCalc);
				}else if(rdbtnPerimetro.isSelected()) {
					lblResultado.setText(perimetroCalc);
					
				}
							}
		});
		btnCalcular.setBounds(294, 204, 89, 23);
		contentPane.add(btnCalcular);
		
		btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(24, 204, 89, 23);
		contentPane.add(btnFechar);
		 
		
		rdbtnArea = new JRadioButton("Área ");
		buttonGroup.add(rdbtnArea);
		rdbtnArea.setBackground(new Color(255, 128, 128));
		rdbtnArea.setBounds(10, 115, 109, 23);
		contentPane.add(rdbtnArea);
		
		rdbtnPerimetro = new JRadioButton("Perímetro");
		buttonGroup.add(rdbtnPerimetro);

		rdbtnPerimetro.setBackground(new Color(255, 128, 128));
		rdbtnPerimetro.setBounds(272, 115, 109, 23);
		contentPane.add(rdbtnPerimetro);
		
		lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(33, 164, 80, 14);
		contentPane.add(lblResultado);
	}
}