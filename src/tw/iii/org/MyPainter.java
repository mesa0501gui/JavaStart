package tw.iii.org;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPainter extends JFrame{
	private Drawer drawer;
	private JButton clear, undo, redo,save;
	
	public MyPainter(){
		super("My Painter");
		setLayout(new BorderLayout());
		
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		save = new JButton("Save");
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.add(clear);top.add(undo);top.add(redo);top.add(save);
		add(top, BorderLayout.NORTH);
		
		drawer = new Drawer();
		add(drawer, BorderLayout.CENTER);
		
		setSize(1024, 768);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clearDrawer();
			}
		});
		undo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				undoDrawer();
			}
		});
		redo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				redoDrawer();
			}
		});
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				saveDrawer();
			}
		});
		
	}
	private void saveDrawer(){
		 BufferedImage img = 
				 new BufferedImage(drawer.getWidth(), drawer.getHeight(), 
						 BufferedImage.TYPE_INT_RGB);
		 drawer.print(img.getGraphics()); // or: panel.printAll(...);
		    try {
		        ImageIO.write(img, "jpg", new File("dir1/drawer.jpg"));
		        System.out.println("save ok");
		    }
		    catch (IOException e) {
		    	System.out.println(e);
		    }
	}
	private void clearDrawer(){
		drawer.clear();
	}
	private void undoDrawer(){
		drawer.undo();
	}
	private void redoDrawer(){
		drawer.redo();
	}
	
	public static void main(String[] args) {
		new MyPainter();
	}

}
