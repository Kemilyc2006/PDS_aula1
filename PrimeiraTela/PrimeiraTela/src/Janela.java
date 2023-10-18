import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setForeground(SystemColor.windowBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOlaMundo = new JLabel("Olá Mundo!");
		lblOlaMundo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "O foco está no JLabel");

			}
		});
		lblOlaMundo.setForeground(new Color(128, 0, 255));
		lblOlaMundo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				JOptionPane.showMessageDialog(null, "O foco está no JLabel");
			}
		});
		lblOlaMundo.setFont(new Font("Perpetua", Font.PLAIN, 29));
		lblOlaMundo.setBounds(138, 11, 132, 74);
		contentPane.add(lblOlaMundo);
		
		JButton btnFechar = new JButton("fechar");
		btnFechar.setBackground(new Color(64, 0, 128));
		btnFechar.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
			}
		});
		btnFechar.setBounds(304, 196, 89, 23);
		contentPane.add(btnFechar);
		
		textNome = new JTextField();
		textNome.setBackground(new Color(225, 217, 249));
		textNome.setBounds(138, 108, 174, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setFont(new Font("Verdana", Font.BOLD, 13));
		lblNome.setBounds(65, 109, 63, 14);
		contentPane.add(lblNome);
		
		JButton btnValidar = new JButton("Validar");
		btnValidar.setBackground(new Color(64, 0, 128));
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pegar o texto digitado no JTextFIeld (textNome)
				String nome = textNome.getText();
			   //Mostrar o nome digitado na tela usando jOptionPane
				JOptionPane.showMessageDialog(null, "O nome digitado é: " + nome);
				
			}
		});
		btnValidar.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnValidar.setBounds(169, 196, 89, 23);
		contentPane.add(btnValidar);
		
		JButton btnNewButton = new JButton("LImpar");
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnNewButton.setBackground(new Color(64, 0, 128));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNome.setText("");
			}
			
		});
		btnNewButton.setBounds(39, 197, 89, 23);
		contentPane.add(btnNewButton);
	}
}
