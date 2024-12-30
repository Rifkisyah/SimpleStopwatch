package com.Stopwatch.ui;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("simple StopWatch");
		setSize(450, 350);
		
		addComponent();
		
		setVisible(true);
	}
	
	public void addComponent() {
		this.add(new MainPanel());
	}
}
