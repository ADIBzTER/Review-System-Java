package src;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

public class Comment {

    JPanel panel;
    JLabel nameJLabel, starJLabel, dateJLabel;
    JTextPane commentJTextPane;

    public Comment(String name, int star, String date, String comment, JScrollPane scrollPane) {
        
        final String FULL_STAR = "★";
        final String EMPTY_STAR = "☆";
        String starString = "";

        for (int i = 1; i <= 5; i++) {
            if (i <= star) starString.concat(FULL_STAR);
            else starString.concat(EMPTY_STAR);
        }

        panel = new JPanel();
        nameJLabel = new JLabel(name);
        starJLabel = new JLabel(starString);
        dateJLabel = new JLabel(date);
        commentJTextPane = new JTextPane();
        
        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nameJLabel.setFont(new java.awt.Font("Segoe UI", 0, 14));
        commentJTextPane.setText(comment);
        commentJTextPane.setFocusable(false);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(starJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateJLabel))
                    .addComponent(nameJLabel))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(nameJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateJLabel)
                    .addComponent(starJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addContainerGap())
        );

    }
    
}
