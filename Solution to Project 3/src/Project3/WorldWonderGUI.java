package Project3;

import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*<pre>
* Class         WorldWonderGUI
* File          WorldWonderGUI.java
* Project       WorldWonderGUI Application
* Description   This class provides a UI and interworks for a world wonder quiz.
*               It is necessary for the user to have two valid text files and one
*               image folder for the quiz to operate. The user will then have to 
*               match the corresponding ComboBox to the image.
* Course        CS 141, Summer 2021, Edmonnds College
* @author       <i>Minh Nguyen</i>
* Environment   PC, Windows 10, jdk1.8.0_241, NetBeans 11.3
* Date          8/22/2021
* Hours         12 hours and 30 minutes
* @version      1.0
* @see          javax.swing.JFrame
*</pre>         
*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class WorldWonderGUI extends javax.swing.JFrame {
     /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Constructor   WorldWonderGUI(--default constructor
    * Description   Creates a form as designed, center it, set the icon, 
    *               submiteJButton as default, reads necessary files, populates
    *               the wonderJComboBox, and randomizes the application index.
    * @author       <i>Minh Nguyen</i>
    * Date          8/22/2021
    * @see          java.awt.Toolkit
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public WorldWonderGUI() {
        initComponents();
        // Import list of wonders
        readWonders(LIST_FILE_NAME, DETAIL_FILE_NAME, IMAGES_FILE_NAME);
        // Centers form at start
        setLocationRelativeTo(null);
        // Set icon
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/Project3/Logo.jpg"));
        // Set displayJButton as default
        this.getRootPane().setDefaultButton(submitJButton);
        // Chooses random wonder
        randomizer();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageJLabel = new javax.swing.JLabel();
        titleJLabel = new javax.swing.JLabel();
        submitJButton = new javax.swing.JButton();
        nextJButton = new javax.swing.JButton();
        againJButton = new javax.swing.JButton();
        selectJLabel = new javax.swing.JLabel();
        scoreJLabel = new javax.swing.JLabel();
        wondersJComboBox = new javax.swing.JComboBox<>();
        worldJMenuBar = new javax.swing.JMenuBar();
        fileJMenu = new javax.swing.JMenu();
        newJMenuItem = new javax.swing.JMenuItem();
        clearJMenuItem = new javax.swing.JMenuItem();
        saveJMenuItem = new javax.swing.JMenuItem();
        printJMenuItem = new javax.swing.JMenuItem();
        fileJSeperator = new javax.swing.JPopupMenu.Separator();
        exitJMenuItem = new javax.swing.JMenuItem();
        helpJMenu = new javax.swing.JMenu();
        detailsJMenuItem = new javax.swing.JMenuItem();
        aboutJMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Famous Artist Quiz");
        setResizable(false);

        imageJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project3/Images/Wonder0.jpg"))); // NOI18N

        titleJLabel.setFont(new java.awt.Font("Pristina", 2, 38)); // NOI18N
        titleJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titleJLabel.setText("World Wonders Quiz");

        submitJButton.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        submitJButton.setMnemonic('S');
        submitJButton.setText("Submit");
        submitJButton.setToolTipText("Enter your answer");
        submitJButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        nextJButton.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        nextJButton.setMnemonic('W');
        nextJButton.setText("Next Wonder");
        nextJButton.setToolTipText("Skip to next wonder");
        nextJButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        nextJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextJButtonActionPerformed(evt);
            }
        });

        againJButton.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        againJButton.setMnemonic('A');
        againJButton.setText("Play Again");
        againJButton.setToolTipText("Take another quiz");
        againJButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        againJButton.setEnabled(false);
        againJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                againJButtonActionPerformed(evt);
            }
        });

        selectJLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        selectJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectJLabel.setText("Select Wonder:");
        selectJLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        scoreJLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        scoreJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreJLabel.setToolTipText("Current score out of 5");
        scoreJLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        wondersJComboBox.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        wondersJComboBox.setToolTipText("Match wonder to picture");
        wondersJComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        fileJMenu.setMnemonic('F');
        fileJMenu.setText("File");
        fileJMenu.setToolTipText("File menus");

        newJMenuItem.setMnemonic('N');
        newJMenuItem.setText("New");
        newJMenuItem.setToolTipText("Choose new wonders");
        newJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(newJMenuItem);

        clearJMenuItem.setMnemonic('C');
        clearJMenuItem.setText("Clear");
        clearJMenuItem.setToolTipText("Reset state of application");
        clearJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(clearJMenuItem);

        saveJMenuItem.setMnemonic('S');
        saveJMenuItem.setText("Save");
        saveJMenuItem.setToolTipText("Save score of quiz");
        saveJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(saveJMenuItem);

        printJMenuItem.setMnemonic('F');
        printJMenuItem.setText("Print Form");
        printJMenuItem.setToolTipText("Print application");
        printJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(printJMenuItem);
        fileJMenu.add(fileJSeperator);

        exitJMenuItem.setMnemonic('E');
        exitJMenuItem.setText("Exit");
        exitJMenuItem.setToolTipText("Close application");
        exitJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(exitJMenuItem);

        worldJMenuBar.add(fileJMenu);

        helpJMenu.setMnemonic('H');
        helpJMenu.setText("Help");
        helpJMenu.setToolTipText("Help menus");

        detailsJMenuItem.setMnemonic('D');
        detailsJMenuItem.setText("Details");
        detailsJMenuItem.setToolTipText("Details of current wonder");
        detailsJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsJMenuItemActionPerformed(evt);
            }
        });
        helpJMenu.add(detailsJMenuItem);

        aboutJMenuItem.setMnemonic('A');
        aboutJMenuItem.setText("About");
        aboutJMenuItem.setToolTipText("About the WorldWonderGUI");
        aboutJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutJMenuItemActionPerformed(evt);
            }
        });
        helpJMenu.add(aboutJMenuItem);

        worldJMenuBar.add(helpJMenu);

        setJMenuBar(worldJMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(imageJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(againJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nextJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(submitJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wondersJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scoreJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(wondersJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scoreJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(titleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nextJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(againJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variable declaration
    public static int determinant;
    private int count = 0;
    private int totalPoints = 0;
    private int points = 0;
    private static boolean[] choosenWonder;
    public static String[] wondersNameList;
    public static String[] wondersDetailList;
    public static String[] wondersImageList;
    private final String LIST_FILE_NAME = "src/Project3/List.txt";
    private final String DETAIL_FILE_NAME = "src/Project3/Details.txt";
    private final String IMAGES_FILE_NAME = "src/Project3/Images";
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method          readWonders()
    * Description     Validates file type and list wonder names into JComboBox,
    *                 store .txt details ana .jpg images into arrays.
    * Date            8/22/2021
    * @author         <i>Minh Nguyen</i>	
    * @param          listFile--String	
    * @param          detailFile--String	
    * @param          imageFile--String	
    * @see            java.io.BufferedReader
    * @see            java.io.File
    * @see            java.io.FileNotFoundException
    * @see            java.io.FileReader
    * @see            java.io.IOException
    * @see            javax.swing.JFileChooser
    * @see            javax.swing.filechooser.FileNameExtensionFilter
    * @see            javax.swing.JOptionPane
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void readWonders (String listFile, String detailFile, String imageFile){
        // Variable declaration
        String wondersName = "";
        String wondersDetail = "";
        final int MAX = 100;
        
        cleanArrays();
        wondersJComboBox.removeAllItems();
        try {
            FileReader readList = new FileReader(listFile);
            FileReader readDetail = new FileReader(detailFile);
            BufferedReader nameInput = new BufferedReader(readList);
            BufferedReader detailInput = new BufferedReader(readDetail);
            
            // Read the first line in the file
            wondersName = nameInput.readLine();
            wondersDetail = detailInput.readLine();
            // Add name to combobox and keeps reading and adding
            // as long as their are names in file
            count = 0;
            while(wondersName != null) {
                // Creating space in arrays for storing values
                wondersNameList = Arrays.copyOf(wondersNameList, wondersNameList.length + 1);
                wondersDetailList = Arrays.copyOf(wondersDetailList, wondersDetailList.length + 1);
                wondersImageList = Arrays.copyOf(wondersImageList, wondersImageList.length + 1);
                choosenWonder = Arrays.copyOf(choosenWonder, choosenWonder.length + 1);

                wondersJComboBox.addItem(wondersName);
                // Add text file lines and .jpg locations to arrays
                wondersNameList[count] = wondersName;
                wondersDetailList[count] = wondersDetail;
                wondersImageList[count] = imageFile + "/Wonder" + count + ".jpg";
                choosenWonder[count] = false;
                wondersName = nameInput.readLine();
                wondersDetail = detailInput.readLine();
                count++;
                if(count > MAX){
                    JOptionPane.showMessageDialog(null, "File exceeded the limit of 100 wonders",
                    "File Input Error", JOptionPane.WARNING_MESSAGE);
                }
            }
            nameInput.close();
            detailInput.close();
        }
        catch(FileNotFoundException exp){
            JOptionPane.showMessageDialog(null, "src/Project3/List.txt does not exist",
                    "File Input Error", JOptionPane.WARNING_MESSAGE);
            // Bring up JFileChooser to select file in current directory
            JFileChooser chooser = new JFileChooser("src/Project3");
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
                    "Txt Files", "txt");
            chooser.setFileFilter(filter);
            int choice = chooser.showOpenDialog(null);
            if (choice == JFileChooser.APPROVE_OPTION){
                File chosenFile = chooser.getSelectedFile();
                listFile = "src/Project3/" + chosenFile.getName();
                readWonders(listFile, detailFile, imageFile);
            }
        }
        catch(IOException exp){
            JOptionPane.showMessageDialog(null, "Unable to read file", 
                    "File Input Error",JOptionPane.WARNING_MESSAGE);
        }
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        cleanArrays()
    * Description   Clear arrays by setting their length to 0
    * Date          8/24/2021
    * @author       <i>Minh Nguyen</i>	
    * @see          javax.swing.ImageIcon
    * @see          java.util.Arrays
    * @see          java.util.Random
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void cleanArrays(){
        wondersNameList = new String[0];
        wondersDetailList = new String[0];
        wondersImageList = new String[0];
        choosenWonder = new boolean[0];
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        randomizer()
    * Description   Chooses a random value and changes image
    * Date          8/24/2021
    * @author       <i>Minh Nguyen</i>	
    * @see          javax.swing.ImageIcon
    * @see          java.util.Arrays
    * @see          java.util.Random
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void randomizer(){
        // Determines random integer 
        Random random = new Random();
        int randomValue = random.nextInt(count - 1);
        determinant = randomValue;
        // Cycles through boolean array until false
        if(choosenWonder[determinant] == false){
            ImageIcon image = new ImageIcon(wondersImageList[determinant]);
            imageJLabel.setIcon(image);
            choosenWonder[determinant] = true;
        }
        else
           randomizer(); 
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        newJMenuItemActionPerformed
    * Description   Clears all values and resets to starting state
    * Date          8/24/2021
    * @author       <i>Minh Nguyen</i>	
    * @param        evt java.awt.event.ActionEvent
    * @see          java.awt.event.ActionEvent
    * @see          javax.swing.JFileChooser
    * @see          javax.swing.filechooser.FileNameExtensionFilter
    * @see          javax.swing.JOptionPane
    * @see          java.io.File
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void newJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newJMenuItemActionPerformed
        // Prompts user of necessary order to load files
        JOptionPane.showMessageDialog(null, "Select the list of names first," + 
                    " then the details, and finally, the folder of images", 
                    "Must be in order",JOptionPane.INFORMATION_MESSAGE);
        String list = "", detail = "", imageFolder = "";
        // List of names of wonders
        JFileChooser chooser1 = new JFileChooser("src/Project3");
        // Filter .txt files
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                    "Txt Files", "txt");
        chooser1.setFileFilter(filter);
        int choice1 = chooser1.showOpenDialog(null);
        if (choice1 == JFileChooser.APPROVE_OPTION){
            File chosenFile = chooser1.getSelectedFile();
            list = "src/Project3/" + chosenFile.getName();
        }
        // List of details of wonders
        JFileChooser chooser2 = new JFileChooser("src/Project3");
        chooser2.setFileFilter(filter);
        int choice2 = chooser2.showOpenDialog(null);
        if (choice2 == JFileChooser.APPROVE_OPTION){
            File chosenFile = chooser2.getSelectedFile();
            detail = "src/Project3/" + chosenFile.getName();
        }
        // File of images of wonders
        JFileChooser chooser3 = new JFileChooser("src/Project3");
        // Filter directories
        chooser3.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int choice3 = chooser3.showOpenDialog(null);
        if (choice3 == JFileChooser.APPROVE_OPTION){
            File chosenFile = chooser3.getSelectedFile();
            imageFolder = "src/Project3/" + chosenFile.getName();
        }    
        readWonders(list, detail, imageFolder);
    }//GEN-LAST:event_newJMenuItemActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        clearJMenuItemActionPerformed()
    * Description   Clears all values and resets to starting state
    * Date          8/24/2021
    * @author       <i>Minh Nguyen</i>	
    * @param        evt java.awt.event.ActionEvent
    * @see          java.awt.event.ActionEvent
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void clearJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearJMenuItemActionPerformed
        scoreJLabel.setText("");
        points = 0;
        totalPoints = 0;
        count = 0;
        cleanArrays();
        wondersJComboBox.removeAllItems();
        submitJButton.setEnabled(true);
        nextJButton.setEnabled(true);
        againJButton.setEnabled(false);
        // Reloads starting files
        readWonders(LIST_FILE_NAME, DETAIL_FILE_NAME, IMAGES_FILE_NAME);
    }//GEN-LAST:event_clearJMenuItemActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        printJMenuItemPerformed()
    * Description   Prompts printing form to print GUI
    * Date          8/22/2021
    * @author       <i>Minh Nguyen</i>	
    * @param        evt java.awt.event.ActionEvent
    * @see          java.awt.event.ActionEvent
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void printJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printJMenuItemActionPerformed
        // Print form
        PrintUtilities.printComponent(this);
    }//GEN-LAST:event_printJMenuItemActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        exitJMenuItemPerformed()
    * Description   Closes the application
    * Date          8/22/2021
    * @author       <i>Minh Nguyen</i>	
    * @param        evt java.awt.event.ActionEvent
    * @see          java.awt.event.ActionEvent
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void exitJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitJMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitJMenuItemActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        detailsJMenuItemActionPerformed()
    * Description   Opens from menu for Detail JDialog 
    * Date          8/22/2021
    * @author       <i>Minh Nguyen</i>	
    * @param        evt java.awt.event.ActionEvent
    * @see          java.awt.event.ActionEvent
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void detailsJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsJMenuItemActionPerformed
        Detail myDetail = new Detail(this, true);
        myDetail.setVisible(true);
    }//GEN-LAST:event_detailsJMenuItemActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        aboutJMenuItemActionPerformed()
    * Description   Opens from menu for About JDialog 
    * Date          8/22/2021
    * @author       <i>Minh Nguyen</i>	
    * @param        evt java.awt.event.ActionEvent
    * @see          java.awt.event.ActionEvent
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void aboutJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutJMenuItemActionPerformed
        About myAbout = new About(this, true);
        myAbout.setVisible(true);
    }//GEN-LAST:event_aboutJMenuItemActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        nextJButtonActionPerformed()
    * Description   Skips to next random wonder and adds to total questions answered
    * Date          8/24/2021
    * @author       <i>Minh Nguyen</i>	
    * @param        evt java.awt.event.ActionEvent
    * @see          java.awt.event.ActionEvent
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void nextJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextJButtonActionPerformed
        totalPoints++;
        switch(totalPoints){
            case 5:
                submitJButton.setEnabled(false);
                nextJButton.setEnabled(false);
                againJButton.setEnabled(true);
                break;
            case 4:
                nextJButton.setEnabled(false);
                randomizer();
                break;
            default:
                randomizer();
        }
      /*if(totalPoints == 5){
            submitJButton.setEnabled(false);
            nextJButton.setEnabled(false);
            againJButton.setEnabled(true);
        }
        else if(totalPoints == 4){
            nextJButton.setEnabled(false);
            randomizer();
        }   
        
        else
            randomizer(); */
        
        scoreJLabel.setText(points + "/" + totalPoints);
    }//GEN-LAST:event_nextJButtonActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        submitJButtonActionPerformed
    * Description   Checks if array determinant value equivlant to choosen index
    *               of JComboBox. Adds towards total amount and moves on to next
    *               image.
    * Date          8/24/2021
    * @author       <i>Minh Nguyen</i>	
    * @param        evt java.awt.event.ActionEvent
    * @see          java.awt.event.ActionEvent
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        if(wondersJComboBox.getSelectedIndex() == determinant){
            totalPoints++;
            points++;
            scoreJLabel.setText("Correct! " + points + "/" + totalPoints);
        }
        else{
            totalPoints++;
            scoreJLabel.setText("Incorrect! " + points + "/" + totalPoints);
        }
        if(totalPoints == 5){
            submitJButton.setEnabled(false);
            nextJButton.setEnabled(false);
            againJButton.setEnabled(true);
        }
        else
            randomizer();
    }//GEN-LAST:event_submitJButtonActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        againJButtonActionPerformed
    * Description   Calls to clearJButtonActionPerformed to resart to starting 
    *               state.
    * Date          8/24/2021
    * @author       <i>Minh Nguyen</i>	
    * @param        evt java.awt.event.ActionEvent
    * @see          java.awt.event.ActionEvent
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void againJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_againJButtonActionPerformed
        randomizer();
        clearJMenuItemActionPerformed(evt);
    }//GEN-LAST:event_againJButtonActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        saveJMenuItemActionPerformed()
    * Description   Opens from menu for About JDialog 
    * Date          8/24/2021
    * @author       <i>Minh Nguyen</i>	
    * @param        evt java.awt.event.ActionEvent
    * @see          java.awt.event.ActionEvent
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void saveJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJMenuItemActionPerformed
        Save mySave = new Save(this, true);
        mySave.setVisible(true);
    }//GEN-LAST:event_saveJMenuItemActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method          main()     
    * Description     Invokes default constructor to create an instance of the 
    *                 form and runs splash screen
    * Date            8/24/2021
    * @param          args are the command line strings
    * @author         <i>Minh Nguyen</i>
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void main(String args[]) {
        // Show splash screen
        Splash mySplash = new Splash(2000); // 2 Second screen
        mySplash.showSplash();
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WorldWonderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WorldWonderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WorldWonderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WorldWonderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WorldWonderGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutJMenuItem;
    private javax.swing.JButton againJButton;
    private javax.swing.JMenuItem clearJMenuItem;
    private javax.swing.JMenuItem detailsJMenuItem;
    private javax.swing.JMenuItem exitJMenuItem;
    private javax.swing.JMenu fileJMenu;
    private javax.swing.JPopupMenu.Separator fileJSeperator;
    private javax.swing.JMenu helpJMenu;
    private javax.swing.JLabel imageJLabel;
    private javax.swing.JMenuItem newJMenuItem;
    private javax.swing.JButton nextJButton;
    private javax.swing.JMenuItem printJMenuItem;
    private javax.swing.JMenuItem saveJMenuItem;
    private javax.swing.JLabel scoreJLabel;
    private javax.swing.JLabel selectJLabel;
    private javax.swing.JButton submitJButton;
    private javax.swing.JLabel titleJLabel;
    private javax.swing.JComboBox<String> wondersJComboBox;
    private javax.swing.JMenuBar worldJMenuBar;
    // End of variables declaration//GEN-END:variables
}
