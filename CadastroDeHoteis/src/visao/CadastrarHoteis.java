package visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import net.miginfocom.swing.MigLayout;

public class CadastrarHoteis extends JFrame {

private static final long serialVersionUID = 1L;
private JPanel contentPane;
private JTextField textNome;
private JTextField textTelefone;
private JTextField textEmail;
private JTextField textEndereco;
/**
* @wbp.nonvisual location=661,-31
*/
private final JLabel label = new JLabel("New label");
private final ButtonGroup buttonGroup1 = new ButtonGroup();
private JTextField textCidade;
private JTextField textCEP;
private JTextField textDesc;
private JTextField textSite;
private JTextField textNumQuartos;
private final ButtonGroup buttonGroup2 = new ButtonGroup ();

public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
CadastrarHoteis frame = new CadastrarHoteis();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}


public CadastrarHoteis() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 1017, 710);
contentPane = new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);
contentPane.setLayout(new BorderLayout(0, 0));

JPanel panel = new JPanel();
contentPane.add(panel, BorderLayout.CENTER);
panel.setLayout(new MigLayout("", "[grow][grow]", "[grow][grow][grow]"));

JPanel panel_1 = new JPanel();
panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Cadastro", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
panel.add(panel_1, "cell 0 0 2 1,grow");
panel_1.setLayout(null);

textNome = new JTextField();
textNome.setBounds(173, 52, 86, 20);
panel_1.add(textNome);
textNome.setColumns(10);

textTelefone = new JTextField();
textTelefone.setBounds(173, 98, 86, 20);
panel_1.add(textTelefone);
textTelefone.setColumns(10);

textEmail = new JTextField();
textEmail.setBounds(173, 140, 86, 20);
panel_1.add(textEmail);
textEmail.setColumns(10);

textEndereco = new JTextField();
textEndereco.setBounds(460, 140, 96, 20);
panel_1.add(textEndereco);
textEndereco.setColumns(10);

JLabel lblNome = new JLabel("Nome: ");
lblNome.setBounds(44, 54, 86, 14);
panel_1.add(lblNome);

JLabel lblTelefone = new JLabel("Telefone: ");
lblTelefone.setBounds(44, 100, 91, 14);
panel_1.add(lblTelefone);

JLabel lblEmail = new JLabel("E-mail:");
lblEmail.setBounds(45, 142, 103, 14);
panel_1.add(lblEmail);

JLabel lblEndereco = new JLabel("Endereço:");
lblEndereco.setBounds(381, 142, 75, 14);
panel_1.add(lblEndereco);
JLabel lblCidade = new JLabel("Cidade:");
lblCidade.setBounds(381, 55, 45, 13);
panel_1.add(lblCidade);
textCidade = new JTextField();
textCidade.setBounds(460, 52, 96, 19);
panel_1.add(textCidade);
textCidade.setColumns(10);
JLabel lblCEP = new JLabel("CEP:");
lblCEP.setBounds(381, 101, 45, 13);
panel_1.add(lblCEP);
textCEP = new JTextField();
textCEP.setBounds(460, 98, 96, 19);
panel_1.add(textCEP);
textCEP.setColumns(10);
JLabel lblNumquartos = new JLabel("Número de Quartos:");
lblNumquartos.setBounds(614, 55, 124, 13);
panel_1.add(lblNumquartos);
textNumQuartos = new JTextField();
textNumQuartos.setBounds(737, 49, 96, 19);
panel_1.add(textNumQuartos);
textNumQuartos.setColumns(10);

JPanel panel_5 = new JPanel();
panel_5.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Informa\u00E7\u00F5es", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
panel.add(panel_5, "cell 0 1 2 2,grow");
panel_5.setLayout(null);

JRadioButton rdbtn1estrela = new JRadioButton("1 estrela");
rdbtn1estrela.addItemListener(new ItemListener() {
public void itemStateChanged(ItemEvent e) {
}
});
buttonGroup2.add(rdbtn1estrela);
rdbtn1estrela.setBounds(32, 176, 125, 23);
panel_5.add(rdbtn1estrela);

JRadioButton rdbtn2estrelas = new JRadioButton("2 estrelas");
rdbtn2estrelas.addItemListener(new ItemListener() {
public void itemStateChanged(ItemEvent e) {
}
});
buttonGroup2.add(rdbtn2estrelas);
rdbtn2estrelas.setBounds(32, 215, 125, 23);
panel_5.add(rdbtn2estrelas);
JLabel lblCategoria = new JLabel("Categoria:");
lblCategoria.setBounds(32, 118, 81, 13);
panel_5.add(lblCategoria);
JRadioButton rdbtn3estrelas = new JRadioButton("3 estrelas");
buttonGroup2.add(rdbtn3estrelas);
rdbtn3estrelas.setBounds(32, 260, 103, 21);
panel_5.add(rdbtn3estrelas);
JRadioButton rdbtn4estrelas = new JRadioButton("4 estrelas");
buttonGroup2.add(rdbtn4estrelas);
rdbtn4estrelas.setBounds(32, 303, 103, 21);
panel_5.add(rdbtn4estrelas);
JRadioButton rdbtn5estrelas = new JRadioButton("5 estrelas");
buttonGroup2.add(rdbtn5estrelas);
rdbtn5estrelas.setBounds(31, 349, 103, 21);
panel_5.add(rdbtn5estrelas);
JLabel lblServiDisp = new JLabel("Serviços Disponíveis:");
lblServiDisp.setBounds(203, 118, 193, 13);
panel_5.add(lblServiDisp);
JCheckBox CheckBoxWifi = new JCheckBox("Wi-fi Gratuíto ");
CheckBoxWifi.setBounds(191, 173, 125, 21);
panel_5.add(CheckBoxWifi);
JCheckBox CheckBoxArCond = new JCheckBox("Ar-Condicionado");
CheckBoxArCond.setBounds(191, 216, 125, 21);
panel_5.add(CheckBoxArCond);
JCheckBox CheckBoxEstac = new JCheckBox("Estacionamento");
CheckBoxEstac.setBounds(191, 260, 125, 21);
panel_5.add(CheckBoxEstac);
JCheckBox CheckBoxAcademia = new JCheckBox("Academia");
CheckBoxAcademia.setBounds(191, 303, 93, 21);
panel_5.add(CheckBoxAcademia);
JCheckBox chckbxPiscina = new JCheckBox("Piscina");
chckbxPiscina.setBounds(191, 349, 93, 21);
panel_5.add(chckbxPiscina);
JLabel lblDesc = new JLabel("Adicione uma Descrição do Hotel:");
lblDesc.setBounds(727, 118, 215, 13);
panel_5.add(lblDesc);
textDesc = new JTextField();
textDesc.setBounds(727, 141, 147, 46);
panel_5.add(textDesc);
textDesc.setColumns(10);
JLabel lblSite = new JLabel("Site Oficial do Hotel:");
lblSite.setBounds(661, 353, 118, 13);
panel_5.add(lblSite);
textSite = new JTextField();
textSite.setBounds(824, 350, 96, 19);
panel_5.add(textSite);
textSite.setColumns(10);

JPanel panel_6 = new JPanel();
contentPane.add(panel_6, BorderLayout.SOUTH);
panel_6.setLayout(new MigLayout("", "[][][][][][][][][][][][][][][][][]", "[]"));


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
JButton btnCadastrar = new JButton("Cadastrar");
btnCadastrar.setBackground(new Color(255, 140, 69));
btnCadastrar.setForeground(new Color(255, 255, 255));
btnCadastrar.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	 try {
         String Nome = textNome.getText();
         String TelefoneStr = textTelefone.getText();
         String Email = textEmail.getText();
         String Endereco = textEndereco.getText();
         String Cidade = textCidade.getText();
         String CEPStr = textCEP.getText();
         String NumQuartosStr = textNumQuartos.getText();

         int Telefone = Integer.parseInt(TelefoneStr);
         int CEP = Integer.parseInt(CEPStr);
         int NumQuartos = Integer.parseInt(NumQuartosStr);

         ExibirInformacoesHotel telaExibir = new ExibirInformacoesHotel(Nome, Telefone, Email, Endereco, Cidade, CEP, NumQuartos);

         telaExibir.setVisible(true);
     } catch (NumberFormatException ex) {
         JOptionPane.showMessageDialog(null, "Certifique-se de inserir valores válidos para Telefone, CEP e Número de Quartos.");
     }
 
}
});
panel_6.add(btnCadastrar, "cell 2 0");

JButton btnLimpar = new JButton("Limpar");
btnLimpar.setForeground(new Color(255, 255, 255));
btnLimpar.setBackground(new Color(255, 140, 69));
btnLimpar.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {

textNome.setText("");
textTelefone.setText("");
textEmail.setText("");
textEndereco.setText("");
textCEP.setText("");
textCidade.setText("");
textNumQuartos.setText(""); 
textDesc.setText("");
textSite.setText("");


}
});
panel_6.add(btnLimpar, "cell 8 0");

JButton btnFechar = new JButton("Fechar");
btnFechar.setForeground(new Color(255, 255, 255));
btnFechar.setBackground(new Color(255, 140, 69));
btnFechar.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {

setVisible(false);

}
});

panel_6.add(btnFechar, "cell 14 0");
}


}