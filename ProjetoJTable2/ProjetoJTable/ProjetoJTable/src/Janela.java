import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JLabel labelNome;
	private JTextField txtNome;
	private JLabel lblNewLabel;
	private JTextField txtCPF;
	ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	private JButton btnNewButton_2;
	private JTextField textTelefone;
	private JTextField textIdade;
	private JTextField textPeso;
	private JTextField textAltura;
	private JTextField txt;
	String nome = "";
	String cpf= "";
	String telefone =  "";
	String idade =  "";
	float peso = (float) 0.00;
	float altura = (float) 0.00;

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
		setBounds(100, 100, 721, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 111, 613, 155);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int linha = table.getSelectedRow();
				Pessoa pessoaSelecionada = listaPessoas.get(linha);
				JOptionPane.showMessageDialog(null, "Pessoa Selecionada: "+pessoaSelecionada.getNome());
			}
		});
		atualizarJTableModel();
		scrollPane.setViewportView(table);
		
		txt = new JTextField();
		scrollPane.setColumnHeaderView(txt);
		txt.setColumns(10);
		
		labelNome = new JLabel("Nome");
		labelNome.setBounds(15, 11, 46, 14);
		contentPane.add(labelNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(25, 36, 146, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		lblNewLabel = new JLabel("CPF");
		lblNewLabel.setBounds(185, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(188, 36, 118, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nome = txtNome.getText();
				cpf= txtCPF.getText();
				telefone = textTelefone.getText();
				idade = textIdade.getText();
				peso = Float.parseFloat(textPeso.getText());
				altura = Float.parseFloat(textAltura.getText());
				
				Pessoa p = new Pessoa();
				p.setNome(nome);
				p.setCpf(Integer.parseInt(cpf));
				p.setAltura(altura);
				p.setPeso(peso);
				p.setIdade(Integer.parseInt(idade));
				p.setTelefone(Integer.parseInt(telefone));


		
				listaPessoas.add(p);
				
				atualizarJTableModel();
				limparCampos();
				
				
			}
	});
		btnNewButton.setBounds(11, 67, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Excluir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idx_linha = table.getSelectedRow();
				listaPessoas.remove(idx_linha);
				atualizarJTableModel();
				limparCampos();
			}
		});
		btnNewButton_1.setBounds(288, 67, 89, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Alterar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int linha = table.getSelectedRow();
				if(linha != -1) {
					Pessoa pessoaSelecionada = listaPessoas.get(linha);

		            pessoaSelecionada.setNome(txtNome.getText());
		            pessoaSelecionada.setCpf(Integer.parseInt(txtCPF.getText()));
		            pessoaSelecionada.setTelefone(Integer.parseInt(textTelefone.getText()));
		            pessoaSelecionada.setIdade(Integer.parseInt(textIdade.getText()));
		            pessoaSelecionada.setPeso(Float.parseFloat(textPeso.getText()));
		            pessoaSelecionada.setAltura(Float.parseFloat(textAltura.getText()));

		            limparCampos();
		            atualizarJTableModel();
		        } else {
		            JOptionPane.showMessageDialog(null, "Selecione uma pessoa para editar.");
		        }

			}
		});
		btnNewButton_2.setBounds(565, 67, 89, 23);
		contentPane.add(btnNewButton_2);
		
		textTelefone = new JTextField();
		textTelefone.setBounds(327, 36, 110, 20);
		contentPane.add(textTelefone);
		textTelefone.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(323, 11, 95, 14);
		contentPane.add(lblTelefone);
		
		textIdade = new JTextField();
		textIdade.setBounds(458, 36, 46, 20);
		contentPane.add(textIdade);
		textIdade.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(458, 11, 46, 14);
		contentPane.add(lblIdade);
		
		textPeso = new JTextField();
		textPeso.setBounds(525, 36, 46, 20);
		contentPane.add(textPeso);
		textPeso.setColumns(10);
		
		JLabel lblPeso = new JLabel("Peso(kg)");
		lblPeso.setBounds(525, 11, 61, 14);
		contentPane.add(lblPeso);
		
		textAltura = new JTextField();
		textAltura.setBounds(592, 36, 86, 20);
		contentPane.add(textAltura);
		textAltura.setColumns(10);
		
		JLabel lblAltura = new JLabel("Altura(m)");
		lblAltura.setBounds(596, 11, 71, 14);
		contentPane.add(lblAltura);
		
		
	}
	
	public void atualizarJTableModel() {
		table.setModel(new PessoaJTableModel(listaPessoas));

	}
	
	public void limparCampos() {
		txtNome.setText("");
		txtCPF.setText("");
		textTelefone.setText("");
		textIdade.setText("");
		textPeso.setText("");
		textAltura.setText("");
		
		
	}
}










