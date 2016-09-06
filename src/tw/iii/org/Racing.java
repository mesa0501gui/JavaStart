package tw.iii.org;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//繼承JFrame 視窗介面
public class Racing extends JFrame {
	// 按鈕 go
	private JButton go;
	// 跑道的陣列
	private JLabel[] lanes;
	//比賽名次
	private int rank ;

	// Racing 建構式 繼承類別super傳入
	public Racing() {
		super("Racing Game");
		// setLayout 畫面配置
		setLayout(new GridLayout(9, 1));
		// 新增實體物件
		go = new JButton("Go!");
		add(go);
		lanes = new JLabel[8];
		for (int i = 0; i < lanes.length; i++) {
			lanes[i] = new JLabel((i + 1) + ". ");
			add(lanes[i]);
		}
		go.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				 go();
			}

			private void go() {
				rank=0 ;
				// TODO Auto-generated method stub
				//建立一個車子物件陣列 有8個
				Car[] cars = new Car[8];
				//迴圈造車
				for (int i=0; i<cars.length; i++){
					cars[i] = new Car(i);
				}
				//迴圈run
				for (int i=0; i<cars.length; i++){
					cars[i].start();
				}
			}
		});
		// 視窗大小
		setSize(1024, 400);
		setVisible(true);
		// 按exit離開
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
private class Car extends Thread{
	//定義哪一個跑道上面的車子
	private int num;
	//建構式定義屬性
	Car(int num){this.num = num;}
	@Override
	//車子跑的方式
	public void run() {
		for (int i=0; i<100; i++){
			lanes[num].setText(lanes[num].getText()+">");
			if(i==99){
			lanes[num].setText(lanes[num].getText()+">"+ ++rank) ;
			}
			//
			try {
				Thread.sleep((int)(Math.random()*300));
			} catch (InterruptedException e) {
				
			}
		}
	}
} 
	
	
	
	public static void main(String[] args) {
		new Racing();
	}

}
