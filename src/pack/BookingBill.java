package pack;

import java.awt.Container;
import java.util.ArrayList;
import java.util.Date;
import java.awt.*;

import javax.swing.*;

public class BookingBill {
	
	ArrayList<NoPassenger> list;
	JFrame f;
	JPanel p1,p2,p3,p4,p5;
	JLabel title,from_to,date,line,line2,header,total;
	JButton b1;
	int tot;
	int col = 1;
	Date date1;
	
	BookingBill(ArrayList<NoPassenger> list){
		this.list = list;
	}
	
	@SuppressWarnings("deprecation")
	public void design() {
		for(NoPassenger p : list) {
			col++;
			tot+=p.getCost();
		}
		f = new JFrame();
		
		p1 = new JPanel();
		title = new JLabel("Booking  Details");
		p1.add(title);
		
		p2 = new JPanel(new FlowLayout());
		String fromto = "";
		
		for(int i=0;i<1;i++) {
			NoPassenger pa = list.get(i);
			fromto+=pa.getDetail().getFrom();
			fromto+="  ->   ";
			fromto+=pa.getDetail().getTo();
			date1 =(Date) pa.getDetail().getDate();
		}
		from_to = new JLabel(fromto);
		date = new JLabel("Date  : "+(date1.getDay())+"/"+(date1.getMonth()+1)+"/"+(date1.getYear()+1900));
		line = new JLabel("______________________________________________________________");
		header = new JLabel("Name       Age with gender       class         seat no       cost of ticket  ");
		p2.add(from_to);
		p2.add(date);
		p2.add(line);
		p2.add(header);
		
		p3 = new JPanel(new GridLayout(5,col));
		for(NoPassenger p : list) {
			JLabel it = new JLabel(p.getName()+"                     "+p.getAgeandgender()+"                     "+p.get_class()+"                   "+p.getSeatno()+"                  "+p.getCost());
			p3.add(it);
		}
		
		p4 = new JPanel(new FlowLayout());
		total = new JLabel("                                                                                     TOTAL COST : "+tot);
		line2 = new JLabel("______________________________________________________________");
		p4.add(line);
		p4.add(total);
		
		p5 = new JPanel(new FlowLayout());
		b1 = new JButton("Print");
		p5.add(b1);
		
		Container pane = f.getContentPane();
		pane.setLayout(new BoxLayout(pane,BoxLayout.Y_AXIS));
		pane.add(p1);
		pane.add(p2);
		pane.add(p3);
		pane.add(p4);
		pane.add(p5);
		f.setSize(400,400);
		f.setVisible(true);
	}
	
}
