package com.vastika.dailysalesrecord.basic;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class DailySalesForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField gasolineField;
	private JTextField beerField;
	private JTextField wineField;
	private JTextField cigaretteField;
	private JTextField lotteryField;
	private JTextField groceriesField;
	private JTextField softDrinkField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DailySalesForm frame = new DailySalesForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DailySalesForm() {
		setFont(new Font("Lucida Sans Typewriter", Font.ITALIC, 16));
		setTitle("OCASH Convenience Store");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sales Catagory");
		lblNewLabel.setBounds(21, 19, 235, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Amount");
		lblNewLabel_1.setBounds(316, 19, 121, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gasoline");
		lblNewLabel_2.setBounds(21, 59, 200, 28);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Beer");
		lblNewLabel_3.setBounds(21, 101, 200, 28);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Wine");
		lblNewLabel_4.setBounds(21, 141, 200, 28);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblCigarettes = new JLabel("Cigarettes");
		lblCigarettes.setBounds(21, 181, 200, 28);
		contentPane.add(lblCigarettes);
		
		JLabel lblLottery = new JLabel("Lottery");
		lblLottery.setBounds(21, 221, 200, 28);
		contentPane.add(lblLottery);
		
		JLabel lblGroceries = new JLabel("Groceries");
		lblGroceries.setBounds(21, 261, 200, 28);
		contentPane.add(lblGroceries);
		
		JLabel lblSoftDrinks = new JLabel("Soft Drinks");
		lblSoftDrinks.setBounds(21, 301, 200, 28);
		contentPane.add(lblSoftDrinks);
		
		gasolineField = new JTextField();
		gasolineField.setBounds(307, 59, 130, 33);
		contentPane.add(gasolineField);
		gasolineField.setColumns(10);
		
		beerField = new JTextField();
		beerField.setColumns(10);
		beerField.setBounds(307, 102, 130, 33);
		contentPane.add(beerField);
		
		wineField = new JTextField();
		wineField.setColumns(10);
		wineField.setBounds(307, 142, 130, 33);
		contentPane.add(wineField);
		
		cigaretteField = new JTextField();
		cigaretteField.setColumns(10);
		cigaretteField.setBounds(307, 182, 130, 33);
		contentPane.add(cigaretteField);
		
		lotteryField = new JTextField();
		lotteryField.setColumns(10);
		lotteryField.setBounds(307, 222, 130, 33);
		contentPane.add(lotteryField);
		
		groceriesField = new JTextField();
		groceriesField.setColumns(10);
		groceriesField.setBounds(307, 262, 130, 33);
		contentPane.add(groceriesField);
		
		softDrinkField = new JTextField();
		softDrinkField.setColumns(10);
		softDrinkField.setBounds(307, 302, 130, 33);
		contentPane.add(softDrinkField);
		
		JLabel lblNewLabel_5 = new JLabel("Total Sales =");
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(137, 356, 118, 28);
		contentPane.add(lblNewLabel_5);
		
		JButton totalBtn = new JButton("Total ");
		totalBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		totalBtn.setBounds(317, 352, 117, 38);
		contentPane.add(totalBtn);
	}
}
