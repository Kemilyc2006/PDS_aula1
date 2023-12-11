package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.Color;


public class ExibirInformacoesHotel extends JFrame {

	private String nome;
    private int telefone;
    private String email;
    private String endereco;
    private String cidade;
    private int cep;
    private int numQuartos;
 
	private JButton btnNewButton_2;
	

    public ExibirInformacoesHotel(String nome, int telefone2, String email, String endereco, String cidade, int cEP2, int numQuartos2){
    	setTitle("Cadastros");
        this.nome = nome;
        this.telefone = telefone2;
        this.email = email;
        this.endereco = endereco;
        this.cidade = cidade;
        this.cep = cEP2;
        this.numQuartos = numQuartos2;

      	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[85px][45px][grow][][][][][]", "[21px][][][][grow][][][][]"));
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBackground(new Color(255, 140, 69));
		btnSalvar.setForeground(new Color(255, 255, 255));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
			
		});
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 0 2 8 5,grow");
		contentPane.add(btnSalvar, "cell 0 8,alignx left,aligny top");
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setForeground(new Color(255, 255, 255));
		btnExcluir.setBackground(new Color(255, 140, 69));
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
			
		});
		contentPane.add(btnExcluir, "cell 7 8");
		
		
		
    }	
    
}