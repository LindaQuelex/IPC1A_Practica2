package Hanoi;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.lang.Character.Subset;


public class otra implements ActionListener, MouseMotionListener, MouseListener{
	Point x,y;
	JButton uno,dos,tres,cuatro,cinco,seis,siete,ocho;
	
	public void ventana (){
		JFrame vent = new JFrame("TORRES HANNOI"); 
		vent.setVisible(true);
		vent.setSize(1000,700);
		vent.setLocationRelativeTo(null);
		vent.setResizable(true);
		vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel titulo =new JLabel();
		titulo.setVisible(true);
		titulo.setSize(500,50);
		titulo.setLocation(280,50);
		titulo.setIcon(new ImageIcon(getClass().getResource("titulo2.jpg")));
		vent.getContentPane().add(titulo);
		
		JLabel torre1=new JLabel("TORRE1");
		torre1.setOpaque(true);
		torre1.setBackground(Color.WHITE);
		torre1.setVisible(true);
		torre1.setSize(50,30);
		torre1.setLocation(135,610);
		vent.getContentPane().add(torre1);
		
		JLabel torre2=new JLabel("TORRE2");
		torre2.setOpaque(true);
		torre2.setBackground(Color.WHITE);
		torre2.setVisible(true);
		torre2.setSize(50,30);
		torre2.setLocation(470,610);
		vent.getContentPane().add(torre2);

		JLabel torre3=new JLabel("TORRE3");
		torre3.setOpaque(true);
		torre3.setBackground(Color.WHITE);
		torre3.setVisible(true);
		torre3.setSize(50,30);
		torre3.setLocation(790,610);
		vent.getContentPane().add(torre3);

		
		ocho =new JButton();
		ocho.setVisible(true);
		ocho.setSize(160,20);
		ocho.setLocation(85,570);
		ocho.setIcon(new ImageIcon(getClass().getResource("ocho.jpg")));
		vent.getContentPane().add(ocho);
		ocho.addActionListener(this);
		
		
		
	    siete =new JButton();
		siete.setVisible(true);
		siete.setSize(150,20);
		siete.setLocation(90, 550);
		siete.setIcon(new ImageIcon(getClass().getResource("siete.jpg")));
		vent.getContentPane().add(siete);
		siete.addActionListener(this);

		seis =new JButton();
		seis.setVisible(true);
		seis.setSize(140,20);
		seis.setLocation(95, 530);
		seis.setIcon(new ImageIcon(getClass().getResource("seis.jpg")));
		vent.getContentPane().add(seis);
		seis.addActionListener(this);

		cinco =new JButton();
		cinco.setVisible(true);
		cinco.setSize(130,20);
		cinco.setLocation(100, 510);
		cinco.setIcon(new ImageIcon(getClass().getResource("cinco.jpg")));
		vent.getContentPane().add(cinco);
		cinco.addActionListener(this);
		
		cuatro =new JButton();
		cuatro.setVisible(true);
		cuatro.setSize(120,20);
		cuatro.setLocation(105, 490);
		cuatro.setIcon(new ImageIcon(getClass().getResource("cuatro.jpg")));
		vent.getContentPane().add(cuatro);
		cuatro.addActionListener(this);
		
		tres =new JButton();
		tres.setVisible(true);
		tres.setSize(110,20);
		tres.setLocation(110, 470);
		tres.setIcon(new ImageIcon(getClass().getResource("tres.jpg")));
		vent.getContentPane().add(tres);
		tres.addActionListener(this);

		
		dos=new JButton();
		dos.setVisible(true);
		dos.setSize(100,20);
		dos.setLocation(115,450);
		dos.setIcon(new ImageIcon(getClass().getResource("dos.jpg")));
		vent.getContentPane().add(dos);
		dos.addActionListener(this);
		
		uno= new JButton();
		uno.setVisible(true);
		uno.setSize(90,20);
		uno.setLocation(120,430);
		uno.setIcon(new ImageIcon(getClass().getResource("uno.jpg")));
		vent.getContentPane().add(uno);
		uno.addActionListener(this);
		
	    JLabel barra=new JLabel();
	    barra.setVisible(true);
	    barra.setSize(100,970);
	    barra.setIcon(new ImageIcon(getClass().getResource("barra.png")));
		barra.setLocation(150, 15);
		vent.getContentPane().add(barra);
		
		JLabel barras=new JLabel();
	    barras.setVisible(true);
	    barras.setSize(100,970);
	    barras.setIcon(new ImageIcon(getClass().getResource("barra.png")));
		barras.setLocation(480, 15);
		vent.getContentPane().add(barras);
		
		JLabel barras1=new JLabel();
	    barras1.setVisible(true);
	    barras1.setSize(100,970);
	    barras1.setIcon(new ImageIcon(getClass().getResource("barra.png")));
		barras1.setLocation(800, 15);
		vent.getContentPane().add(barras1);
		
		JLabel barras2=new JLabel();
	    barras2.setVisible(true);
	    barras2.setSize(665,815);
	    barras2.setIcon(new ImageIcon(getClass().getResource("barrah.png")));
		barras2.setLocation(150, 200);
		vent.getContentPane().add(barras2);
	
	    /*JLabel movimientos= new JLabel ();
		movimientos.setVisible(true);
		movimientos.setSize(100,100);
		movimientos.setLocation(850,75);
		movimientos.setIcon(new ImageIcon(getClass().getResource("movimientos.jpg")));
		vent.getContentPane().add(movimientos);*/
		
		/*JTextField l=new JTextField(10);
		 l.setVisible(true);
		 l.setSize(100,20);
	     l.setLocation(15, 20);
		vent.getContentPane().add(l);*/
			
		
		
		
		JLabel l=new JLabel("seleccione");
		l.setOpaque(true);
		l.setBackground(Color.gray);
		l.setVisible(true);
		l.setSize(75,30);
		l.setLocation(15,50);
		vent.getContentPane().add(l);
		
	
		/*JLabel l=new JLabel("seleccione");
		l.setOpaque(true);
		l.setBackground(Color.gray);
		l.setVisible(true);
		l.setSize(75,30);
		l.setLocation(15,50);
		vent.getContentPane().add(l);
		
		JLabel l=new JLabel("seleccione");
		l.setOpaque(true);
		l.setBackground(Color.gray);
		l.setVisible(true);
		l.setSize(75,30);
		l.setLocation(15,50);
		vent.getContentPane().add(l);*/
		
		
        String[] numero = new String[] {"3","4","5","6","7","8"};
		final JComboBox<String> niveles = new JComboBox<String>(numero);
		niveles.setVisible(true);
		niveles.setSize(100, 30);
		niveles.setLocation(90,50);
		vent.getContentPane().add(niveles);
		
	
		
		JLabel fondo =new JLabel();
		fondo.setVisible(true);
		fondo.setSize(1000,700);
		fondo.setLocation(0, 0);
		//fondo.setOpaque(true);
		//fondo.setBackground(Color.darkGray);
		fondo.setIcon(new ImageIcon(getClass().getResource("FONDO.jpg")));
		vent.getContentPane().add(fondo);
	   // vent.add(fondo);

		ocho.addMouseListener(this);
		siete.addMouseListener(this);
		seis.addMouseListener(this);
		seis.addMouseListener(this);
		cinco.addMouseListener(this);
		cuatro.addMouseListener(this);
		tres.addMouseListener(this);
		dos.addMouseListener(this);
		uno.addMouseListener(this);
		
		ocho.addMouseMotionListener(this);
		siete.addMouseMotionListener(this);
		seis.addMouseMotionListener(this);
		cinco.addMouseMotionListener(this);
		cuatro.addMouseMotionListener(this);
		tres.addMouseMotionListener(this);
		dos.addMouseMotionListener(this);
		uno.addMouseMotionListener(this);
			
		
		vent.repaint();
		
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent me) {
				
	}



	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseMoved(MouseEvent arg0) {
		
		if(arg0.getSource()==uno){
			uno.setLocation(450,570 );
		}
		if(arg0.getSource()==dos){
				dos.setLocation(450,550 );
		}
		if(arg0.getSource()==tres){
					tres.setLocation(450,530);
		}
		if(arg0.getSource()==cuatro){
						cuatro.setLocation(450,510 );
		}

		if(arg0.getSource()==cinco){
			cinco.setLocation(450,490 );

}
		if(arg0.getSource()==seis){
			seis.setLocation(450,470 );
}
		if(arg0.getSource()==siete){
			siete.setLocation(450,450 );
		}
		
		if(arg0.getSource()==ocho){
			ocho.setLocation(450,430 );
		}

			}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if(arg0.getSource()==uno){
			Point m;
			m= uno.getLocation();
			System.out.println(m);
		}
				
	}



	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	}

