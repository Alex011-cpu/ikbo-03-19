package practika4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class example extends JFrame {
private JButton Milan=new JButton("AC Milan");
private JButton Madrid=new JButton("Real Madrid");
private JLabel result=new JLabel("Result 0 X 0");
private JLabel score=new JLabel("Last Scorer:N/A");
private JLabel winner=new JLabel("Winner:DRAW");

public example(){
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    final int[] x={0};final int[] y={0};
    setSize(new Dimension(800,400));
    Milan.setBounds(80,150,300,70);
    Madrid.setBounds(420,150,300,70);
    result.setBounds(5,20,200,80);
    score.setBounds(5,5,200,80);
    winner.setBounds(360,50,300,80);
    Milan.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            x[0]++;
            score.setText("Last scorer:AC Milan");
            if(x[0]>y[0]) winner.setText("Winner:AC Milan");
            if(x[0]<y[0]) winner.setText("Winner:Real Madrid");
            if(x[0]== y[0]) winner.setText("Winner:DRAW");
            result.setText("Result "+x[0]+" X "+y[0]);
        }
    });
    Madrid.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            y[0]++;
            score.setText("Last scorer:Real Madrid");
            if(x[0]>y[0]) winner.setText("Winner:AC Milan");
            if(x[0]<y[0]) winner.setText("Winner:Real Madrid");
            if(x[0]== y[0]) winner.setText("Winner:DRAW");
            result.setText("Result "+x[0]+" X "+y[0]);
        }
    });
    setLayout(null);
    this.getContentPane().add(Milan);
    this.getContentPane().add(Madrid);
    this.getContentPane().add(result);
    this.getContentPane().add(score);
    this.getContentPane().add(winner);
}

}
