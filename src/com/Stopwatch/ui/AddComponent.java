package com.Stopwatch.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import com.Stopwatch.logic.TaskStopwatch;

public class AddComponent implements ActionListener {
    FontStyle font = new FontStyle();
    private String text;
    private int elapsedTime = 0; // Track total elapsed time in seconds

    private JTextField hourOutput = new JTextField();
    private JTextField minuteOutput = new JTextField();
    private JTextField secOutput = new JTextField();

    private JButton startButton = new JButton();
    private JButton endButton = new JButton();

    private Timer timer;

    public AddComponent() {
        timer = new Timer(1000, e -> updateTime());
    }

    public JTextField addHourOutput() {
        this.hourOutput.setText("0");
        this.hourOutput.setFont(font.addOutputFontText());
        this.hourOutput.setColumns(2);
        this.hourOutput.setHorizontalAlignment(SwingConstants.RIGHT);
        this.hourOutput.setFocusable(false);

        return this.hourOutput;
    }

    public JTextField addMinuteOutput() {
        this.minuteOutput.setText("0");
        this.minuteOutput.setFont(font.addOutputFontText());
        this.minuteOutput.setColumns(2);
        this.minuteOutput.setHorizontalAlignment(SwingConstants.RIGHT);
        this.minuteOutput.setFocusable(false);

        return this.minuteOutput;
    }

    public JTextField addSecOutput() {
        this.secOutput.setText("0");
        this.secOutput.setFont(font.addOutputFontText());
        this.secOutput.setColumns(2);
        this.secOutput.setHorizontalAlignment(SwingConstants.RIGHT);
        this.secOutput.setFocusable(false);

        return this.secOutput;
    }

    public JButton addStartButton() {
        this.text = "Start";
        this.startButton.setText(this.text);
        this.startButton.setHorizontalAlignment(SwingConstants.CENTER);
        this.startButton.addActionListener(this);
        return this.startButton;
    }

    public JButton addEndButton() {
        this.text = "Stop";
        this.endButton.setText(this.text);
        this.endButton.setHorizontalAlignment(SwingConstants.CENTER);
        this.endButton.addActionListener(this);
        return this.endButton;
    }

    private void updateTime() {
        elapsedTime++;
        int hours = elapsedTime / 3600;
        int minutes = (elapsedTime % 3600) / 60;
        int seconds = elapsedTime % 60;

        this.hourOutput.setText(String.valueOf(hours));
        this.minuteOutput.setText(String.valueOf(minutes));
        this.secOutput.setText(String.valueOf(seconds));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == startButton) {
            timer.start();
            startButton.setEnabled(false);
            endButton.setEnabled(true);
        } else if (source == endButton) {
            timer.stop();
            elapsedTime = 0;
            this.hourOutput.setText("0");
            this.minuteOutput.setText("0");
            this.secOutput.setText("0");
            startButton.setEnabled(true);
            endButton.setEnabled(false);
        }
    }
}
