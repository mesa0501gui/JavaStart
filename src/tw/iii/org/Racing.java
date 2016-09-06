package tw.iii.org;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//�~��JFrame ��������
public class Racing extends JFrame {
	// ���s go
	private JButton go;
	// �]�D���}�C
	private JLabel[] lanes;
	//���ɦW��
	private int rank ;

	// Racing �غc�� �~�����Osuper�ǤJ
	public Racing() {
		super("Racing Game");
		// setLayout �e���t�m
		setLayout(new GridLayout(9, 1));
		// �s�W���骫��
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
				//�إߤ@�Ө��l����}�C ��8��
				Car[] cars = new Car[8];
				//�j��y��
				for (int i=0; i<cars.length; i++){
					cars[i] = new Car(i);
				}
				//�j��run
				for (int i=0; i<cars.length; i++){
					cars[i].start();
				}
			}
		});
		// �����j�p
		setSize(1024, 400);
		setVisible(true);
		// ��exit���}
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
private class Car extends Thread{
	//�w�q���@�Ӷ]�D�W�������l
	private int num;
	//�غc���w�q�ݩ�
	Car(int num){this.num = num;}
	@Override
	//���l�]���覡
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
