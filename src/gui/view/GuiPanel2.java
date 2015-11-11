package gui.view;

import javax.swing.JPanel;

import gui.controller.GuiController2;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.color.*;
import java.awt.event.ActionEvent;


public class GuiPanel2 extends JPanel
{
	private GuiController2 baseController;
	private JButton secondButton;
	private JTextField secondTextField;
	private SpringLayout baseLayout;
	
	public GuiPanel2(GuiController2 baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		secondButton = new JButton("Don't push me.");
		secondTextField = new JTextField("This is where words go.");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GREEN);
		this.add(secondButton);
		this.add(secondTextField);
	}
	/**
	 * Dumping ground for generated code.
	 */
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		secondButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				secondTextField.setText("Wow, this the most amazing click event ever!");
			}
		});
	}
}
