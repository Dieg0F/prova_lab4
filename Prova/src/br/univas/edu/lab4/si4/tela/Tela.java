package br.univas.edu.lab4.si4.tela;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Tela extends JFrame{

	private static final long serialVersionUID = 8481658190544171968L;
	
	private JPanel panel;
	private JPanel leftPanel;
	private JPanel rightPanel;
	
	public Tela()
	{
		this.setTitle("Prova");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(500, 450);
		
		setContentPanel();
		setColumns();
		addComponents();
	}
	
	public void setContentPanel()
	{
		panel =  new JPanel();
		
		BorderLayout border = new BorderLayout();
		
		panel.setLayout(border);
		this.setContentPane(panel);		
	}
	
	public void setColumns()
	{
		leftPanel = new JPanel();
		leftPanel.setBackground(Color.blue);
		leftPanel.setPreferredSize(new Dimension(150, 450));
		panel.add(leftPanel, BorderLayout.WEST);
		
		rightPanel = new JPanel();
		rightPanel.setPreferredSize(new Dimension(450, 450));
		panel.add(rightPanel, BorderLayout.EAST);
		
		setLayoutPanels();
	}
	
	public void setLayoutPanels()
	{
		GridBagLayout gridBag = new GridBagLayout();
		
		leftPanel.setLayout(gridBag);
		rightPanel.setLayout(gridBag);
	}
	
	public void addComponents()
	{				
		//Labels
		/*JLabel lblNome = new JLabel();
		lblNome.setText("Nome: ");
		
		JLabel lblEmail = new JLabel();
		lblEmail.setText("Email: ");
		
		rightPanel.add(lblNome);
		rightPanel.add(lblEmail);
		
		//Inputs
		
		JTextField txtNome = new JTextField();
		txtNome.setPreferredSize(new Dimension(250, 25));
		
		JTextField txtEmail = new JTextField();
		txtEmail.setPreferredSize(new Dimension(250, 25));
		
		rightPanel.add(txtNome);
		rightPanel.add(txtEmail);
		*/
		
		GridBagConstraints gbc = new GridBagConstraints();

		JLabel lblNome = new JLabel();
		lblNome.setText("Nome: ");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.LINE_END;
		gbc.insets = new Insets(15, 15, 10, 15);
		rightPanel.add(lblNome, gbc);
		
		JTextField txtName = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.weightx = 1.0;
		gbc.insets = new Insets(15, 0, 10, 15); 		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.CENTER;
		rightPanel.add(txtName, gbc);

		JLabel lblEmail = new JLabel();
		lblEmail.setText("E-mail: ");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 0;
		gbc.insets = new Insets(15, 15, 10, 15);
		gbc.anchor = GridBagConstraints.LINE_END;
		rightPanel.add(lblEmail, gbc);

		JTextField txtEmail = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.weightx = 1.0;
		gbc.insets = new Insets(15, 0, 10, 15); 
		gbc.anchor = GridBagConstraints.LINE_START;
		rightPanel.add(txtEmail, gbc);
		
		JButton btnSalvar = new JButton();
		btnSalvar.setText("Salvar");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		gbc.insets = new Insets(15, 15, 15, 15); 
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.CENTER;
		rightPanel.add(btnSalvar, gbc);
		
		Object[][] rowData = {
				{"João", "111.111.111-11", "joao@gmail.com"},
				{"Maria", "222.222.222-22", "maria@gmail.com"},
				{"José", "333.333.333-33", "jose@gmail.com"}
		};
		
		Object[] columnNames = {
			"Nome",
			"CPF",
			"E-mail"
		};
		
		JTable dataTable = new JTable(rowData, columnNames);
		dataTable.setFillsViewportHeight(true);
		JScrollPane tableScrollPane = new JScrollPane(dataTable);
		tableScrollPane.setMinimumSize(new Dimension(100, 100));
		tableScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		tableScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 2;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.CENTER;
		rightPanel.add(tableScrollPane, gbc);
		
		//Buttons
		
		JButton btnUm = new JButton();
		JButton btnDois = new JButton();
		JButton btnTres = new JButton();
		JButton btnQuatro = new JButton();
		JButton btnCinco = new JButton();
		JButton btnSeis = new JButton();
		JButton btnSete = new JButton();
		JButton btnOito = new JButton();
		JButton btnNove = new JButton();
		JButton btnDez = new JButton();

		btnUm.setText("Botão 1");
		btnDois.setText("Botão 2");
		btnTres.setText("Botão 3");
		btnQuatro.setText("Botão 4");
		btnCinco.setText("Botão 5");
		btnSeis.setText("Botão 6");
		btnSete.setText("Botão 7");
		btnOito.setText("Botão 8");
		btnNove.setText("Botão 9");
		btnDez.setText("Botão 10");
		
		
	}
	
}
