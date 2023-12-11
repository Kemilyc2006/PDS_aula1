package visao;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import modelo.Hotel;
import javax.swing.JSpinner;

public class hotelJTableModel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JLabel labelNome;
	private JTextField txtNome;
	private JLabel lblNewLabel;
	private JTextField txtCPF;
	ArrayList<Hotel> listaPessoas = new ArrayList<Hotel>();
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hotelJTableModel frame = new hotelJTableModel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param numQuartos 
	 * @param cEP 
	 * @param cidade 
	 * @param endereco 
	 * @param email 
	 * @param telefone 
	 * @param nome 
	 */
	public hotelJTableModel(String nome, int telefone, String email, String endereco, String cidade, int cEP, int numQuartos) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 324, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(11, 104, 287, 146);
		contentPane.add(scrollPane);
		
		table = new JTable();
		//atualizarJTableModel();
		scrollPane.setViewportView(table);
		
		labelNome = new JLabel("Nome");
		labelNome.setBounds(15, 11, 46, 14);
		contentPane.add(labelNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 36, 146, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				if(nome.length() == 0) {
					JOptionPane.showMessageDialog(null, "Campo Nome é obrigatório!");
					return ;

				}
				
				Integer cep= txtCep.getext();
				
				Hotel h = new Hotel();
				h.setNome(nome);
				int cepInt=0;
				try {
					cepInt = Integer.parseInt(cEP);
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Insira o CEP corretamente");
					return ;
					
				}
				


				
				
				
				
			}
		});
		btnNewButton.setBounds(11, 67, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Excluir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
	
			
			}
		});
		
		
		
		
		btnNewButton_1.setBounds(110, 67, 89, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Alterar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnNewButton_2.setBounds(210, 67, 89, 23);
		contentPane.add(btnNewButton_2);
	}

	public hotelJTableModel() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}










