package Factory;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTextField;

public class FactoryMethodClass {
	public static JButton createButton(String title) {
		JButton btn=new JButton(title);
		btn.setForeground(Color.pink);	
		btn.setBackground(Color.blue);
		btn.setFont(new Font("Arial",Font.ITALIC,20));
		return btn;
	}
	
	public static JTextField createTextField(int width) {
		JTextField txt=new JTextField(width);
		txt.setPreferredSize(new Dimension(200,50));
		txt.setBorder(BorderFactory.createLineBorder(Color.white));
		
		return txt;
	}
}
