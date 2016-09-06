package tw.iii.org;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
///如何處理implements
public class Brad30 extends JFrame implements ActionListener{
	private JButton open, save, exit; 
	public Brad30(){
		super("My Window App");
		open = new JButton("Open");
		save = new JButton("Save");
		exit = new JButton("Exit");
		setLayout(new FlowLayout());
		add(open); add(save); add(exit);
		open.addActionListener(this);
		open.addActionListener(this);
		open.addActionListener(this);
		save.addActionListener(this);
		exit.addActionListener(this);
//		save.addActionListener(new Mylisten());
//		exit.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				System.exit(0);
//				
//			}
//		});
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Brad30 obj1 =new Brad30() ;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==open){
			System.out.println("OPEN");
		}else if(e.getSource()==save){
			System.out.println("Save");
		}else if(e.getSource()==exit){
			System.exit(0);
		}
		
	}
	class Mylisten implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Save");
			
		}
		
	}

}
