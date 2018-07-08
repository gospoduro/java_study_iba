package views.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import actions.click.ClickStart;

/**

 */
public class MainFrame extends JFrame {
	private static final long serialVersionUID = 5398032942924976106L;
	private static String name = "Thread Gui Views";
	private JTextArea areaMonitor;
	private JTextArea areaThreads;
	private JButton startButton;
	private JPanel panel;

	public MainFrame() {
		super(name);
		this.setPreferredSize(new Dimension(1024, 600));
		this.setLayout(new BorderLayout());
		
		startButton=new JButton("Run");	      
		startButton.addActionListener(new ClickStart());
				
		areaMonitor=new JTextArea();
		areaMonitor.setForeground(Color.BLACK);
		areaMonitor.setName("monitor");
		
		areaThreads=new JTextArea();
		areaThreads.setForeground(Color.BLACK);
		areaThreads.setName("area");
		
		/**	
	   
	    panel=new JPanel(new GridLayout(2, 2));
		
		panel.add(areaThreads);
		panel.add(areaMonitor);
		panel.add(startButton);
		
		*/
		
		panel=new JPanel(new FlowLayout());

		panel.add(areaThreads);
		panel.add(areaMonitor);
		panel.add(startButton);



		this.add(panel);
		this.pack();
		this.setVisible(true);
	}
}
