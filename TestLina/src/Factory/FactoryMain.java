package Factory;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class FactoryMain {
	public static void main(String[] args) {
		JFrame frm=new JFrame("studentInformation");
		frm.setLayout(new FlowLayout());
		
		frm.setSize(700, 300);
		frm.setLocationRelativeTo(null);
	
		JButton btnname=FactoryMethodClass.createButton("enterYourName");

		
	
		JButton btncourse=FactoryMethodClass.createButton("enterYourCourse");
		
	
		JButton btnsemester=FactoryMethodClass.createButton("enterYourSemester");
		
	
		
		JTextField txtId=FactoryMethodClass.createTextField(20) ;
		JTextField txtName=FactoryMethodClass.createTextField(20) ;
		JTextField txtSalary=FactoryMethodClass.createTextField(20) ;
		

		
		JPanel pnl=new JPanel();
		pnl.add(txtId);
		pnl.add(txtName);
		pnl.add(txtSalary);
		
		JPanel pnl2=new JPanel();
		pnl2.add(btnname);
		pnl2.add(btncourse);
		pnl2.add(btnsemester);
		
		frm.add(pnl);
		frm.add(pnl2);
		
		frm.setVisible(true);
	}
	

}
