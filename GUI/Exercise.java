package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise extends JFrame {
    String team1 = new String("AC Milan");
    String team2 = new String("Real Madrid");
    int team1Score = 0, team2Score = 0;

    public Exercise() {
        super("Example");
        setLayout(new BorderLayout());
        JButton button1 = new JButton(team1);
        JButton button2 = new JButton(team2);
        JLabel result =
                new JLabel("Result: " + team1Score + " X " + team2Score,
                        JLabel.CENTER);
        JLabel lastScorer = new JLabel("Last Scorer: N/A", JLabel.CENTER);
        lastScorer.setVerticalAlignment(JLabel.NORTH);
        Label winner = new Label("Winner: DRAW", Label.CENTER);

        add(button1, BorderLayout.WEST);
        add(result, BorderLayout.NORTH);
        add(lastScorer, BorderLayout.CENTER);
        add(winner, BorderLayout.SOUTH);
        add(button2, BorderLayout.EAST);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                team1Score++;
                lastScorer.setText("Last Scorer: " + team1);
                result.setText("Result: " + team1Score + " X " + team2Score);
                winner.setText("Winner: " + (team1Score > team2Score ? team1 :
                        (team1Score < team2Score ? team2 : "N/A")));
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                team2Score++;
                lastScorer.setText("Last Scorer: " + team2);
                result.setText("Result: " + team1Score + " X " + team2Score);
                winner.setText("Winner: " + (team1Score > team2Score ? team1 :
                        (team1Score < team2Score ? team2 : "N/A")));
            }
        });
        setSize(400, 200);
    }

    public static void main(String[] args) {
        new Exercise().setVisible(true);
    }
}