package Project3;
import static Project3.WorldWonderGUI.wondersImageList;
import javax.swing.ImageIcon;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*<pre>
*   Class           Detail
*   File            Detail.java
*   Description     Detail for Project 3
*   @author         <i>Minh Nguyen</i>
*   Environment     PC, Windows 10, NetBeans IDE 11.3, jdk 1.8.0_241
*   Date            8/23/2021
*   @version        1.0
*   @see            javax.swing.JDialog
*</pre>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class Detail extends javax.swing.JDialog
{
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Constructor   Detail()--default constructor
    * Description   Create the form as designed, sets close button as default, 
    *               centers form at the start of dialog, changes date of form
    *               and moves cursor to starting position            
    * @author       <i>Minh Nguyen</i>
    * Date          8/23/2021
    * @param        parent java.awt.Frame
    * @param        modal boolean
    * @see          java.awt.Color
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Detail(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        // Set as default the button
        this.getRootPane().setDefaultButton(closeJButton);
        // Center the form
        this.setLocationRelativeTo(null);    
      
        infoJTextArea.setCaretPosition(0);
        startUp();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageJLabel = new javax.swing.JLabel();
        infoJScrollPane = new javax.swing.JScrollPane();
        infoJTextArea = new javax.swing.JTextArea();
        closeJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Details of");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        imageJLabel.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        imageJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageJLabel.setToolTipText("Picture of wonder");

        infoJTextArea.setEditable(false);
        infoJTextArea.setColumns(20);
        infoJTextArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        infoJTextArea.setLineWrap(true);
        infoJTextArea.setRows(5);
        infoJTextArea.setToolTipText("Information of wonder");
        infoJTextArea.setWrapStyleWord(true);
        infoJScrollPane.setViewportView(infoJTextArea);

        closeJButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        closeJButton.setMnemonic('C');
        closeJButton.setText("Close");
        closeJButton.setToolTipText("Close detail form");
        closeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imageJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                            .addComponent(infoJScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(closeJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imageJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(infoJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(closeJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
     * Method       closeJButtonActionPerformed()
     * Description  Event handler to dispose the Detail form
     * @param       evt java.awt.event.ActionEvent
     * @see         java.awt.event.ActionEvent
     * @author      <i>Minh Nguyen</i>
     * Date         8/23/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void closeJButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_closeJButtonActionPerformed
    {//GEN-HEADEREND:event_closeJButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeJButtonActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
     * Method       startUp()
     * Description  Imports variables from WorldWonderGUI to correspond the correct
     *              details, name, and picture of wonders on start up
     * @see         Project3.WorldWonderGUI.wondersImageList
     * @see         javax.swing.ImageIcon;
     * @author      <i>Minh Nguyen</i>
     * Date         8/23/2021
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void startUp(){
        int choosen = WorldWonderGUI.determinant;
        infoJTextArea.setText(WorldWonderGUI.wondersDetailList[choosen]);
        ImageIcon image = new ImageIcon(wondersImageList[choosen]);
        imageJLabel.setIcon(image);
        this.setTitle("Detail of " + WorldWonderGUI.wondersNameList[choosen]);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeJButton;
    private javax.swing.JLabel imageJLabel;
    private javax.swing.JScrollPane infoJScrollPane;
    private javax.swing.JTextArea infoJTextArea;
    // End of variables declaration//GEN-END:variables
}
