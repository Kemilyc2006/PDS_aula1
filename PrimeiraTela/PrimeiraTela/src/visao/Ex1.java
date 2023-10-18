package visao;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.ConversaoTemp;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textTempF;
	private JButton btnConverter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex1 frame = new Ex1();
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
	public Ex1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 195);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textTempF = new JTextField();
		textTempF.setBounds(220, 25, 86, 20);
		contentPane.add(textTempF);
		textTempF.setColumns(10);
		
		JLabel lbltemp = new JLabel("Temperatura em F º : ");
		lbltemp.setFont(new Font("Perpetua Titling MT", Font.BOLD, 13));
		lbltemp.setBounds(39, 30, 171, 14);
		contentPane.add(lbltemp);
		
		btnConverter = new JButton("Calcular");
		btnConverter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pegar a temp digitada no componente de texto 
				String tempDigitada = textTempF.getText ();
			   //converter a temp de string para float 
				float tempConvertidaF = Float.valueOf(tempDigitada);
			  //criar o objeto da classe COnversaoTemp 
				ConversaoTemp conv = new ConversaoTemp ();
			 //chamar metodo conversao
				float tempC = conv.conversaoTemp(tempConvertidaF);
				String tempFormatada = String.format("%.2f", tempC);
			//mostrar a temp convertida 
				JOptionPane.showMessageDialog(null, "Temperatura convertida: " +tempFormatada);
			}
		});
		btnConverter.setBounds(153, 89, 89, 23);
		contentPane.add(btnConverter);
	}

}
