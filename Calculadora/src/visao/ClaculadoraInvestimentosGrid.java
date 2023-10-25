package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Investimento;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class ClaculadoraInvestimentosGrid extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textDepMes;
	private JTextField textNumMes;
	private JTextField textJuros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClaculadoraInvestimentosGrid frame = new ClaculadoraInvestimentosGrid();
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
	public ClaculadoraInvestimentosGrid() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 239);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Ajuda ");
		menuBar.add(mnNewMenu);
		
		JButton btnNewButton_1 = new JButton("Sobre ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormSobre frame = new FormSobre();
				frame.setVisible(true);
				
			}
		});
		mnNewMenu.add(btnNewButton_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 2, 0, 0));
		
		JLabel lblDepMes = new JLabel("Depósito mensal R$: ");
		contentPane.add(lblDepMes);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textDepMes = new JTextField();
		panel_2.add(textDepMes);
		textDepMes.setColumns(10);
		
		JLabel lblNumMes = new JLabel("Num. de meses: ");
		contentPane.add(lblNumMes);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textNumMes = new JTextField();
		panel_3.add(textNumMes);
		textNumMes.setColumns(10);
		
		JLabel lblJuros = new JLabel("Juros ao mês R$: ");
		contentPane.add(lblJuros);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textJuros = new JTextField();
		panel_4.add(textJuros);
		textJuros.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Total investido + juros R$: ");
		contentPane.add(lblNewLabel_3);
		
		JLabel lblTotal = new JLabel("");
		contentPane.add(lblTotal);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("Calcular");
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Dep = textDepMes.getText();
				String Juros = textJuros.getText();
				String Mes = textNumMes.getText();
				
				Double DepMes = Double.valueOf(Dep);
				Double JuMes = Double.valueOf(Juros);
				Integer NumMes= Integer.valueOf(Mes);
				
				Investimento calc = new Investimento(NumMes, JuMes, DepMes);
				Double CalcFim = calc.calculaTotal();
				String CalcTotal = String.valueOf(CalcFim);
				
				lblTotal.setText(CalcTotal); 
				
				
			}
		});
	}

}
