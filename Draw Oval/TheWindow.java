package drawoval;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class TheWindow extends JFrame {

	private JSlider slider;
	private DrawOval myPanel;

	// constructor:
	public TheWindow() {
		super("Oval Slider");
		myPanel = new DrawOval();
		myPanel.setBackground(new Color(245, 255, 250));

		// slider
		slider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);

		slider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				myPanel.setD(slider.getValue());
			}
		});
		
		add(slider, BorderLayout.SOUTH);
		add(myPanel, BorderLayout.CENTER);
	}

}
