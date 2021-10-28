package Project3;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*<pre>
*   Class           About
*   File            About.java
*   Description     About form for Project 3
*   @author         <i>Minh Nguyen</i>
*   Environment     PC, Windows 10, NetBeans IDE 11.3, jdk 1.8.0_241
*   Date            8/23/2021
*   @version        1.0
*   @see            javax.swing.JDialog
*</pre>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class Save extends javax.swing.JDialog
{
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Constructor   About()--default constructor
    * Description   Create the form as designed, sets close button as default, 
    *               centers form at the start of dialog, changes date of form
    *               and moves cursor to starting position            
    * @author       <i>Minh Nguyen</i>
    * Date          7/21/2021
    * @param        parent java.awt.Frame
    * @param        modal boolean
    * @see          java.awt.Color
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Save(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        // Set as default the button
        this.getRootPane().setDefaultButton(cancelJButton);
        // Center the form
        this.setLocationRelativeTo(null);    
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleJLabel = new javax.swing.JLabel();
        cancelJButton = new javax.swing.JButton();
        saveJButton = new javax.swing.JButton();
        nameJLabel = new javax.swing.JLabel();
        scoreJLabel = new javax.swing.JLabel();
        scoreJTextField = new javax.swing.JTextField();
        nameJTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Student");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        titleJLabel.setFont(new java.awt.Font("Tempus Sans ITC", 2, 36)); // NOI18N
        titleJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJLabel.setText("Add Student");

        cancelJButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cancelJButton.setMnemonic('C');
        cancelJButton.setText("Cancel");
        cancelJButton.setToolTipText("Close saving prompt");
        cancelJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelJButtonActionPerformed(evt);
            }
        });

        saveJButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        saveJButton.setMnemonic('S');
        saveJButton.setText("Save");
        saveJButton.setToolTipText("Save to text file");
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });

        nameJLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameJLabel.setText("Student's Name");

        scoreJLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        scoreJLabel.setText("Student's Quiz Score");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scoreJLabel)
                            .addComponent(nameJLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(scoreJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(161, 161, Short.MAX_VALUE))
                            .addComponent(nameJTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(saveJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(titleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameJLabel)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scoreJLabel)
                    .addComponent(scoreJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method       cancelJButtonActionPerformed()
    * Description  Event handler to dispose the About form
    * @param       evt java.awt.event.ActionEvent
    * @see         java.awt.event.ActionEvent
    * Date         8/22/2021
    * @author      <i>Minh Nguyen</i>	
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void cancelJButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cancelJButtonActionPerformed
    {//GEN-HEADEREND:event_cancelJButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelJButtonActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        saveJButtonActionPerformed()
    * Description   Saves the content of the pop-up to a text file
    * Date          8/24/2021
    * @author       <i>Minh Nguyen</i>	
    * @param        evt--java.awt.event.ActionEvent
    * @see          java.awt.event.ActionEvent
    * @see          java.io.FileWrite
    * @see          java.io.PrintWriter
    * @see          java.io.IOException
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed
       try{
            String name = nameJTextField.getText();
            int score = Integer.parseInt(scoreJTextField.getText());
            String content = name + " scored a total of " + score + " out of 5";
            if(score > 5 || score < 0)
                throw new NumberFormatException();
            
            FileWriter fwriter = new FileWriter("src/Project3/" + name + ".txt",false);
            PrintWriter outputFile = new PrintWriter(fwriter);
            // Write the name & score to the file
            outputFile.println(content);
            outputFile.close();
        }
        catch(NumberFormatException exp){
            JOptionPane.showMessageDialog(null, "Enter a valid score ranging " +
                    "from 0 to 5", "File Input Error",JOptionPane.WARNING_MESSAGE);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_saveJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelJButton;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JButton saveJButton;
    private javax.swing.JLabel scoreJLabel;
    private javax.swing.JTextField scoreJTextField;
    private javax.swing.JLabel titleJLabel;
    // End of variables declaration//GEN-END:variables
}
