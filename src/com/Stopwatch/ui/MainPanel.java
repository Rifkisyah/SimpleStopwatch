package com.Stopwatch.ui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JPanel;

public class MainPanel extends JPanel {
	private GridBagConstraints constraint = new GridBagConstraints();
	private JPanel timerOutputPanel = new JPanel();
	private JPanel buttonInputPanel = new JPanel();
	
	AddComponent component = new AddComponent();
	
	public MainPanel() {
		setLayout(new GridBagLayout());
		setBounds(20, 50, 150, 200);
		this.constraint.insets = new Insets(4, 4, 4, 4);
		addTimerOutputPanel();
		addButtonInputPanel();
	}
	
	public void addTimerOutputPanel() {
		this.constraint.gridx = 0;
		this.constraint.gridy = 0;
		this.timerOutputPanel.add(component.addHourOutput());
		
		this.constraint.gridx = 1;
		this.constraint.gridy = 0;
		this.timerOutputPanel.add(component.addMinuteOutput());
		
		this.constraint.gridx = 2;
		this.constraint.gridy = 0;
		this.timerOutputPanel.add(component.addSecOutput());
		
		this.add(timerOutputPanel, constraint);
	}
	
	public void addButtonInputPanel() {
		this.constraint.gridx = 0;
		this.constraint.gridy = 1;
		this.buttonInputPanel.add(component.addStartButton());
		
		this.constraint.gridx = 2;
		this.constraint.gridy = 1;
		this.buttonInputPanel.add(component.addEndButton());
		
		this.add(buttonInputPanel, constraint);
	}
}
