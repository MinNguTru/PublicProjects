package Project2;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*<pre>
* Class         About
* File          About.java
* Description   This is the About form that describes the application
* @author       <i>Minh Nguyen</i>
* Course        CS 141, Summer 2021, Edmonds
* Environment   PC, Windows 10, jdk1.8.0_241, NetBeans 11.3
* Date          8/1/2021
* @version      1.0
* @see          javax.swing.JDialog
*</pre>         
*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class About extends javax.swing.JDialog {
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Constructor   About()--Default constructor
    * Description   Create a modal About form as deisgned, center it, okayJButton
    *               as default, sets the caret position of the text in the 
    *               descriptionJTextArea to the top, sets copyright symbol in 
    *               the copyrightJLabel, and changes background color
    * @author       <i>Minh Nguyen</i>
    * Date          8/1/2021
    * @param        parent java.awt.Frame
    * @param        modal boolean
    * @see          java.awt.Color
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public About(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents(); // Creates the form
        // Set closeJButton as default
        this.getRootPane().setDefaultButton(closeJButton);
        // Centers form at start
        setLocationRelativeTo(null);
        // Set background color
        this.getContentPane().setBackground(new Color(255,255,177));
        // Move cursor to start position
        descriptionJTextArea.setCaretPosition(0);
        // Sets the date
        setDate();
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method          setDate()
    * Description     Sets date to current date using "MM/dd/yyyy" format in
    *                 the title
    * Date            8/1/2021
    * @author         <i>Minh Nguyen</i>	
    * @see            java.text.DateFormat   
    * @see            java.text.SimpleDateFormat
    * @see            java.util.Date
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void setDate() {
        // Date format string
        DateFormat dateFormat = new SimpleDateFormat ("MM/dd/yyyy");
        Date date = new Date(); // Current date in milliseconds
        dateJLabel.setText("Date: " + dateFormat.format(date));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dentalScrollPane = new javax.swing.JScrollPane();
        descriptionJTextArea = new javax.swing.JTextArea();
        closeJButton = new javax.swing.JButton();
        copyrightJLabel = new javax.swing.JLabel();
        authorJLabel = new javax.swing.JLabel();
        titleJLabel = new javax.swing.JLabel();
        dateJLabel = new javax.swing.JLabel();
        versionJLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Paycheck About Form");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        descriptionJTextArea.setEditable(false);
        descriptionJTextArea.setColumns(20);
        descriptionJTextArea.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        descriptionJTextArea.setLineWrap(true);
        descriptionJTextArea.setRows(5);
        descriptionJTextArea.setText("This program provides paycheck calculation for an employee whose gross monthly salary is based on a base monthly salary of $1,000 plus a commission on gross sales made by the employee. The commission rate is based on the following table.\n\nSales Amount\t\tCommission Rate\n$0.01-$5,000\t\t8%\n$5,000.01-$10,000\t10%\n$10,000.01 and above\t12%\n\nThe deduction on the paycheck are based on the following assumptions:\n\n1. Federal Tax deduction is 7% of the gross pay.\n2. FICA taxes support Social Security and Medicare. Employees pay Social Secuirty tax at a rate of 6.2%\n3. Medicare tax at 1.45% without any cap.\n4. WA does not currently have a state tax, so $0.00 for state tax.\n5. Family Leave Insurance is 0.2532% of the gross pay.\n6. State Disability Insurance is not a mandatory requirement in WA.\n7. For our emplyees volunatary 401(k) pension plan is 5% of the gross pay.");
        descriptionJTextArea.setWrapStyleWord(true);
        dentalScrollPane.setViewportView(descriptionJTextArea);

        closeJButton.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        closeJButton.setMnemonic('C');
        closeJButton.setText("Close");
        closeJButton.setToolTipText("Closes About Form");
        closeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeJButtonActionPerformed(evt);
            }
        });

        copyrightJLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        copyrightJLabel.setText("Copyright:Freeware");

        authorJLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        authorJLabel.setText("Author: Minh Nguyen");

        titleJLabel.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        titleJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project2/PaystubFit.jpg"))); // NOI18N
        titleJLabel.setText("Paycheck About");

        dateJLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        dateJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dateJLabel.setText("Date:");

        versionJLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        versionJLabel.setText("Version: 1.0.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(authorJLabel)
                        .addGap(123, 123, 123)
                        .addComponent(closeJButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(versionJLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateJLabel))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(copyrightJLabel)
                            .addComponent(dentalScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(titleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(titleJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dentalScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorJLabel)
                    .addComponent(closeJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(copyrightJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateJLabel)
                    .addComponent(versionJLabel))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method          closeJButtonActionPerformed()
    * Description     Closes the About form
    * Date            8/1/2021
    * @author         <i>Minh Nguyen</i>	
    * @param          evt java.awt.event.ActionEvenwarningJLabel
    * @see            java.awt.event.ActionEvent
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void closeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeJButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authorJLabel;
    private javax.swing.JButton closeJButton;
    private javax.swing.JLabel copyrightJLabel;
    private javax.swing.JLabel dateJLabel;
    private javax.swing.JScrollPane dentalScrollPane;
    private javax.swing.JTextArea descriptionJTextArea;
    private javax.swing.JLabel titleJLabel;
    private javax.swing.JLabel versionJLabel;
    // End of variables declaration//GEN-END:variables
}
