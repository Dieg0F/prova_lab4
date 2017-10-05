package br.univas.edu.lab4.si4.tela;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
		leftPanel.setBackground(Color.LIGHT_GRAY);
		leftPanel.setPreferredSize(new Dimension(150, 450));
		leftPanel.setSize(new Dimension(150, 450));
		panel.add(leftPanel, BorderLayout.WEST);
		
		rightPanel = new JPanel();
		rightPanel.setPreferredSize(new Dimension(325, 450));
		rightPanel.setSize(new Dimension(325, 450));
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
		dataTable.setFillsViewportHeight(false);
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
		btnUm.setText("Botão 1");									
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(5, 5, 5, 5); 
		leftPanel.add(btnUm, gbc);		
		btnUm.addActionListener(new clickButton());
		
		JButton btnDois = new JButton();		
		btnDois.setText("Botão 2");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(5, 5, 5, 5);
		leftPanel.add(btnDois, gbc);
		btnDois.addActionListener(new clickButton());
		
		JButton btnTres = new JButton();
		btnTres.setText("Botão 3");
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(5, 5, 5, 5);
		leftPanel.add(btnTres, gbc);
		btnTres.addActionListener(new clickButton());
		
		JButton btnQuatro = new JButton();
		btnQuatro.setText("Botão 4");
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(5, 5, 5, 5);
		leftPanel.add(btnQuatro, gbc);
		btnQuatro.addActionListener(new clickButton());
		
		JButton btnCinco = new JButton();
		btnCinco.setText("Botão 5");
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(5, 5, 5, 5);
		leftPanel.add(btnCinco, gbc);
		btnCinco.addActionListener(new clickButton());
		
		JButton btnSeis = new JButton();
		btnSeis.setText("Botão 6");		
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(5, 5, 5, 5);
		leftPanel.add(btnSeis, gbc);
		btnSeis.addActionListener(new clickButton());
				
		JButton btnSete = new JButton();
		btnSete.setText("Botão 7");
		gbc.gridx = 0;
		gbc.gridy = 7;
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(5, 5, 5, 5);
		leftPanel.add(btnSete, gbc);
		btnSete.addActionListener(new clickButton());
		
		JButton btnOito = new JButton();		
		btnOito.setText("Botão 8");
		gbc.gridx = 0;
		gbc.gridy = 8;
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(5, 5, 5, 5);
		leftPanel.add(btnOito, gbc);
		btnOito.addActionListener(new clickButton());
		
		JButton btnNove = new JButton();
		btnNove.setText("Botão 9");
		gbc.gridx = 0;
		gbc.gridy = 9;
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(5, 5, 5, 5);
		leftPanel.add(btnNove, gbc);
		btnNove.addActionListener(new clickButton());
			
		JButton btnDez = new JButton();
		btnDez.setText("Botão 10");
		gbc.gridx = 0;
		gbc.gridy = 10;
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.insets = new Insets(5, 5, 5, 5);
		leftPanel.add(btnDez, gbc);			
		btnDez.addActionListener(new clickButton());
	}
	
	public class clickButton implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(panel, "Eu sou responsável pelo meu futuro!");
		}	
	}
	
}

















