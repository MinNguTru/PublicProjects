package Project2;
import java.awt.Color;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*<pre>
* Class         Paycheck
* File          Paycheck.java
* Project       Paycheck Application
* Description   This class provides a UI to calculate the paycheck of employees 
*               after paying deductions. Neccessary for users to enter other information
*               but currently have no definiteive purpose. A seperate class 
*               PaycheckBill does the calculation of the paycheck and output of 
*               services provided.
* Course        CS 141, Summer 2021, Edmonnds College
* @author       <i>Minh Nguyen</i>
* Environment   PC, Windows 10, jdk1.8.0_241, NetBeans 11.3
* Date          8/5/2021
* Hours         6 hours and 30 minutes
* @version      1.0
* @see          javax.swing.JFrame
* @see          java.text.NumberFormat
*</pre>         
*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class Paycheck extends javax.swing.JFrame {
    // Instanced variables
    private PaycheckBill myPaycheck = null;
    private NumberFormat dollars = NumberFormat.getCurrencyInstance();
    private StringBuffer display = new StringBuffer("");
     /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Constructor   Paycheck()--default constructor
    * Description   Creates a form as designed, center it, set the icon, 
    *               calculateJButton as default, reads employees from Workers.txt, 
    *               and populates the nameJComboBox
    * @author       <i>Minh Nguyen</i>
    * Date          8/5/2021
    * @see          java.awt.Color
    * @see          java.awt.Toolkit
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Paycheck() {
        initComponents();
        // Centers form at start
        setLocationRelativeTo(null);
        // Set form background color
        this.getContentPane().setBackground(new Color(255,255,177));
        // Set icon
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/Project2/PaystubLogo.jpg"));
        // Set the date in JTextField
        setDate();
        // Import list of workers
        readWorkers(FILE_NAME);
        // Set displayJButton as default
        this.getRootPane().setDefaultButton(displayJButton);
        salaryJTextField.requestFocus();
    }
    private final String FILE_NAME = "src/Project2/Workers.txt";
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method          readWorkers()
    * Description     Validates file type and list workers into a JComboBox 
    *                 from a .txt file
    * Date            8/5/2021
    * @author         <i>Minh Nguyen</i>	
     *@param          fileName--String	
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
    public void readWorkers (String fileName){
        String workersName = "";
        try {
            FileReader readList = new FileReader(fileName);
            BufferedReader input = new BufferedReader(readList);
            nameJComboBox.removeAllItems();
            // Read the first line in the file
            workersName = input.readLine();
            // Add name to combobox and keeps reading and adding
            // as long as their are names in file
            while(workersName != null) {
                nameJComboBox.addItem(workersName);
                workersName = input.readLine();
            }
            input.close();
        }
        catch(FileNotFoundException exp){
            JOptionPane.showMessageDialog(null, fileName + " does not exist",
                    "File Input Error", JOptionPane.WARNING_MESSAGE);
            // Bring up JFileChooser to select file in current directory
            JFileChooser chooser = new JFileChooser("src/Project2");
            // Filter only txt files
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
                    "Txt Files", "txt");
            chooser.setFileFilter(filter);
            int choice = chooser.showOpenDialog(null);
            if (choice == JFileChooser.APPROVE_OPTION){
                File chosenFile = chooser.getSelectedFile();
                fileName = "src/Project2/" + chosenFile.getName();
                readWorkers(fileName);
            }
        }
        catch(IOException exp){
            JOptionPane.showMessageDialog(null, "Unable to read file", 
                    "File Input Error",JOptionPane.WARNING_MESSAGE);
        }
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        setDate()
    * Description   Sets date to current date using "MMM dd, yyyy" format JTextField
    * Date          8/5/2021
    * @author       <i>Minh Nguyen</i>	
    * @see          java.text.DateFormat   
    * @see          java.text.SimpleDateFormat
    * @see          java.util.Date
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void setDate() {
        // Date format string
        DateFormat dateFormat = new SimpleDateFormat ("MMM dd, yyyy");
        Date date = new Date(); // Current date in milliseconds
        dateJTextField.setText(dateFormat.format(date));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salaryJTextField = new javax.swing.JTextField();
        salaryJLabel = new javax.swing.JLabel();
        dateJTextField = new javax.swing.JTextField();
        dateJLabel = new javax.swing.JLabel();
        salesJTextField = new javax.swing.JTextField();
        salesJLabel = new javax.swing.JLabel();
        accountJFormattedTextField = new javax.swing.JFormattedTextField();
        accountJLabel = new javax.swing.JLabel();
        netPayJTextField = new javax.swing.JTextField();
        netPayJLabel = new javax.swing.JLabel();
        nameJLabel = new javax.swing.JLabel();
        nameJComboBox = new javax.swing.JComboBox<>();
        addressJLabel = new javax.swing.JLabel();
        addressJTextField = new javax.swing.JTextField();
        cityJLabel = new javax.swing.JLabel();
        cityJTextField = new javax.swing.JTextField();
        stateJComboBox = new javax.swing.JComboBox<>();
        stateJLabel = new javax.swing.JLabel();
        zipJLabel = new javax.swing.JLabel();
        zipJFormattedTextField = new javax.swing.JFormattedTextField();
        outputJScrollPane = new javax.swing.JScrollPane();
        outputJTextArea = new javax.swing.JTextArea();
        displayJButton = new javax.swing.JButton();
        printJButton = new javax.swing.JButton();
        clearJButton = new javax.swing.JButton();
        quitJButton = new javax.swing.JButton();
        pictureJLabel = new javax.swing.JLabel();
        thankJLabel = new javax.swing.JLabel();
        saveJButton = new javax.swing.JButton();
        paycheckJMenuBar = new javax.swing.JMenuBar();
        fileJMenu = new javax.swing.JMenu();
        newJMenuItem = new javax.swing.JMenuItem();
        clearJMenuItem = new javax.swing.JMenuItem();
        printFormJMenuItem = new javax.swing.JMenuItem();
        printCheckJMenuItem = new javax.swing.JMenuItem();
        fileJSeperator = new javax.swing.JPopupMenu.Separator();
        quitJMenuItem = new javax.swing.JMenuItem();
        helpJMenuItem = new javax.swing.JMenu();
        aboutJMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Paycheck");
        setResizable(false);

        salaryJTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        salaryJTextField.setToolTipText("Enter base salary here");

        salaryJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        salaryJLabel.setText("Base Monthly Salary:");

        dateJTextField.setEditable(false);
        dateJTextField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dateJTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        dateJTextField.setToolTipText("Current date");

        dateJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dateJLabel.setText("Date:");

        salesJTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        salesJTextField.setToolTipText("Enter sales amount here");

        salesJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        salesJLabel.setText("Monthly Sales Amount:");

        try {
            accountJFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        accountJFormattedTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        accountJFormattedTextField.setText("");
        accountJFormattedTextField.setToolTipText("Enter account number here");

        accountJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        accountJLabel.setText("Account #:");

        netPayJTextField.setEditable(false);
        netPayJTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        netPayJTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        netPayJTextField.setToolTipText("Net pay after deductions");

        netPayJLabel.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        netPayJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        netPayJLabel.setText("Net Pay:");

        nameJLabel.setText("Name:");

        nameJComboBox.setToolTipText("Select your name");

        addressJLabel.setText("Address:");

        addressJTextField.setToolTipText("Enter your address here");

        cityJLabel.setText("City:");

        cityJTextField.setToolTipText("Enter your city name");

        stateJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY" }));
        stateJComboBox.setSelectedItem("WA");
        stateJComboBox.setToolTipText("Select your state");

        stateJLabel.setText("State:");

        zipJLabel.setText("Zip:");

        try {
            zipJFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        zipJFormattedTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        zipJFormattedTextField.setText("");
        zipJFormattedTextField.setToolTipText("Enter your zip code");

        outputJTextArea.setEditable(false);
        outputJTextArea.setColumns(20);
        outputJTextArea.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        outputJTextArea.setRows(5);
        outputJTextArea.setToolTipText("Your paycheck");
        outputJScrollPane.setViewportView(outputJTextArea);

        displayJButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        displayJButton.setMnemonic('D');
        displayJButton.setText("Display Paycheck");
        displayJButton.setToolTipText("Calculates and displays the paycheck");
        displayJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayJButtonActionPerformed(evt);
            }
        });

        printJButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        printJButton.setMnemonic('P');
        printJButton.setText("Print Paycheck");
        printJButton.setToolTipText("Print the paycheck");
        printJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printJButtonActionPerformed(evt);
            }
        });

        clearJButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clearJButton.setMnemonic('C');
        clearJButton.setText("Clear");
        clearJButton.setToolTipText("Clear the application");
        clearJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJButtonActionPerformed(evt);
            }
        });

        quitJButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        quitJButton.setMnemonic('Q');
        quitJButton.setText("Quit");
        quitJButton.setToolTipText("Quit the application");
        quitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitJButtonActionPerformed(evt);
            }
        });

        pictureJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project2/PaystubFit.jpg"))); // NOI18N

        thankJLabel.setFont(new java.awt.Font("Roboto", 2, 24)); // NOI18N
        thankJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        thankJLabel.setText("Thank you for being our employee!");

        saveJButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saveJButton.setMnemonic('S');
        saveJButton.setText("Save");
        saveJButton.setToolTipText("Save paycheck to external file");
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });

        fileJMenu.setMnemonic('F');
        fileJMenu.setText("File");

        newJMenuItem.setMnemonic('N');
        newJMenuItem.setText("New");
        newJMenuItem.setToolTipText("Select new file of employees");
        newJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(newJMenuItem);

        clearJMenuItem.setMnemonic('C');
        clearJMenuItem.setText("Clear");
        clearJMenuItem.setToolTipText("Clears the application");
        clearJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(clearJMenuItem);

        printFormJMenuItem.setMnemonic('P');
        printFormJMenuItem.setText("Print Form");
        printFormJMenuItem.setToolTipText("Prints the GUI of the application");
        printFormJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printFormJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(printFormJMenuItem);

        printCheckJMenuItem.setMnemonic('E');
        printCheckJMenuItem.setText("Print Employee Check");
        printCheckJMenuItem.setToolTipText("Print employee paycheck");
        printCheckJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printCheckJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(printCheckJMenuItem);
        fileJMenu.add(fileJSeperator);

        quitJMenuItem.setMnemonic('Q');
        quitJMenuItem.setText("Quit");
        quitJMenuItem.setToolTipText("Quit the application");
        quitJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(quitJMenuItem);

        paycheckJMenuBar.add(fileJMenu);

        helpJMenuItem.setMnemonic('H');
        helpJMenuItem.setText("Help");
        helpJMenuItem.setToolTipText("");

        aboutJMenuItem.setMnemonic('A');
        aboutJMenuItem.setText("About");
        aboutJMenuItem.setToolTipText("About the paycheck application");
        aboutJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutJMenuItemActionPerformed(evt);
            }
        });
        helpJMenuItem.add(aboutJMenuItem);

        paycheckJMenuBar.add(helpJMenuItem);

        setJMenuBar(paycheckJMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(outputJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(addressJLabel)
                                        .addComponent(nameJLabel)
                                        .addComponent(cityJLabel))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(stateJLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(stateJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(nameJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addressJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(printJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(displayJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(zipJLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(zipJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(saveJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(quitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(clearJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(salesJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(salesJTextField)
                                        .addComponent(salaryJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(salaryJLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(81, 81, 81)
                                            .addComponent(accountJLabel))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(29, 29, 29)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(accountJFormattedTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(dateJLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(dateJTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(netPayJLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(netPayJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addComponent(thankJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(pictureJLabel)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(pictureJLabel)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dateJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(salaryJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(salaryJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salesJLabel)
                            .addComponent(accountJLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salesJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accountJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(netPayJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(netPayJLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameJLabel)
                    .addComponent(nameJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addressJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressJLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityJLabel)
                    .addComponent(stateJLabel)
                    .addComponent(stateJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipJLabel)
                    .addComponent(zipJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(outputJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(thankJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(displayJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(printJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        aboutJMenuItemActionPerformed()
    * Description   Opens from menu for About JDialog 
    * Date          8/1/2021
    * @author       <i>Minh Nguyen</i>	
    * @param        evt java.awt.event.ActionEvent
    * @see          java.awt.event.ActionEvent
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void aboutJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutJMenuItemActionPerformed
        About myAbout = new About (this,true);
        myAbout.setVisible(true);
    }//GEN-LAST:event_aboutJMenuItemActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        newJMenuItemActionPerformed()
    * Description   Allows user to choose another .txt file to fill nameJComboBox
    *               such as another list of workers    
    * Date          8/5/2021
    * @author       <i>Minh Nguyen</i>
    * @param        evt java.awt.event.ActionEvent
    * @see          java.awt.event.ActionEvent
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void newJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newJMenuItemActionPerformed
        String alternativeFile = "";
        JFileChooser nextFile = new JFileChooser("src/Project2");
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                    "Txt Files", "txt");
        nextFile.setFileFilter(filter);
        int filePrompt = nextFile.showOpenDialog(null);
        if (filePrompt == JFileChooser.APPROVE_OPTION){
                File chosenFile = nextFile.getSelectedFile();
                alternativeFile = "src/Project2/" + chosenFile.getName();
                readWorkers(alternativeFile);
        }
    }//GEN-LAST:event_newJMenuItemActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        clearJMenuItemActionPerformed()
    * Description   Clear and resets fields where values can be manipulated
    * Date          8/5/2021
    * @author       <i>Minh Nguyen</i>
    * @param        evt java.awt.event.ActionEvent
    * @see          java.awt.event.ActionEvent
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void clearJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearJMenuItemActionPerformed
        // Calls to clearJButtonActionPerformed()
        clearJButton.doClick();
    }//GEN-LAST:event_clearJMenuItemActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        printJMenuItemPerformed()
    * Description   Prompts printing form to print GUI
    * Date          8/5/2021
    * @author       <i>Minh Nguyen</i>	
    * @param        evt java.awt.event.ActionEvent
    * @see          java.awt.event.ActionEvent
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void printFormJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printFormJMenuItemActionPerformed
        // Print form
        PrintUtilities.printComponent(this);
    }//GEN-LAST:event_printFormJMenuItemActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        printCheckJMenuItemActionPerformed()
    * Description   Saves the content of JTextArea to an external file with the     
    *               same name as worker
    * Date          8/5/2021
    * @author       <i>Minh Nguyen</i>	
    * @param        evt--java.awt.event.ActionEvent
    * @see          java.awt.event.ActionEvent
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void printCheckJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printCheckJMenuItemActionPerformed
        // Calls to JButtonActionPerformed()
        printJButton.doClick();
    }//GEN-LAST:event_printCheckJMenuItemActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method          quitJMenuItemActionPerformed()
    * Description     Closes the application
    * Date            8/1/2021
    * @author         <i>Minh Nguyen</i>	
    * @param          evt java.awt.event.ActionEvent
    * @see            java.awt.event.ActionEvent
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void quitJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitJMenuItemActionPerformed
         // Calls to quitJbutton()
        quitJButton.doClick();
    }//GEN-LAST:event_quitJMenuItemActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method          quitJButtonActionPerformed()
    * Description     Closes the application 
    * Date            8/1/2021
    * @author         <i>Minh Nguyen</i>	
    * @param          evt java.awt.event.ActionEvent
    * @see            java.awt.event.ActionEvent
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void quitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitJButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitJButtonActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        clearJButtonActionPerformed()
    * Description   Clear and resets fields where values can be manipulated
    * Date          8/5/2021
    * @author       <i>Minh Nguyen</i>
    * @param        evt java.awt.event.ActionEvent
    * @see          java.awt.event.ActionEvent
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void clearJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearJButtonActionPerformed
        salaryJTextField.setText("");
        salesJTextField.setText("");
        addressJTextField.setText("");
        cityJTextField.setText("");
        netPayJTextField.setText("");
        outputJTextArea.setText("");
        nameJComboBox.setSelectedIndex(0);
        stateJComboBox.setSelectedIndex(46);
        accountJFormattedTextField.setValue(null);
        zipJFormattedTextField.setValue(null);
        salaryJTextField.requestFocus();
    }//GEN-LAST:event_clearJButtonActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        printJButtonActionPerformed()
    * Description   Saves the content of JTextArea to an external file with the     
    *               same name as worker
    * Date          8/5/2021
    * @author       <i>Minh Nguyen</i>	
    * @param        evt--java.awt.event.ActionEvent
    * @see          java.awt.event.ActionEvent
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void printJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printJButtonActionPerformed
        // Print the content of the JText area
        try {
            outputJTextArea.print();
            // Print entire form
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_printJButtonActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        displayJButtonActionPerformed()
    * Description   Calulates paycheck bill by creating an instance of the 
    *               PaycheckBill object with all the perinent information passed 
    *               to the constructor and calls the bill's displayBill() method 
    *               to display the bill
    * Date          8/9/2021
    * @author       <i>Minh Nguyen</i>	
    * @param        evt--java.awt.event.ActionEvent
    * @see          java.awt.event.ActionEvent
    * @see          javax.swing.JOptionPane
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void displayJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayJButtonActionPerformed
        // Variable declaration
        double total = 0.0;
        // Checks all informational input slots
        if((salaryJTextField.getText().equals("") || 
                    salaryJTextField.getText().equals(null) ||
                    (salesJTextField.getText().equals("") || 
                    salesJTextField.getText().equals(null))) ||
                    (accountJFormattedTextField.getText().equals("") || 
                    accountJFormattedTextField.getText().equals(null)) ||
                    (addressJTextField.getText().equals("") || 
                    addressJTextField.getText().equals(null)) ||
                    (cityJTextField.getText().equals("") || 
                    cityJTextField.getText().equals(null)) ||
                    (zipJFormattedTextField.getText().equals("") || 
                    zipJFormattedTextField.getText().equals(null)) ||
                    (nameJComboBox.getSelectedItem().toString().equals("") || 
                    nameJComboBox.getSelectedItem().toString().equals(null)) ||
                    (stateJComboBox.getSelectedItem().toString().equals("") || 
                    stateJComboBox.getSelectedItem().toString().equals(null)))
            // Display error message
            JOptionPane.showMessageDialog(null,
                    "Enter all your information.",
                    "Missing information", JOptionPane.WARNING_MESSAGE);
        else {
            try {
                double salaryBase = salaryJTextField.getText().toString().length() > 
                        0 ? Double.parseDouble(salaryJTextField.getText()) : 0.0;
                double salesPlus = salesJTextField.getText().toString().length() > 
                        0 ? Double.parseDouble(salesJTextField.getText()) : 0.0;
                
                myPaycheck = new PaycheckBill(nameJComboBox.getSelectedItem().toString(), 
                        !(addressJTextField.getText().equals("") || 
                        addressJTextField.getText().equals(null)),
                        !(cityJTextField.getText().equals("") || 
                        cityJTextField.getText().equals(null)),
                        !(stateJComboBox.getSelectedItem().toString().equals("") || 
                        stateJComboBox.getSelectedItem().toString().equals(null)),
                        !(zipJFormattedTextField.getText().equals("") || 
                        zipJFormattedTextField.getText().equals(null)),
                        !(accountJFormattedTextField.getText().equals("") || 
                        accountJFormattedTextField.getText().equals(null)),
                        !(salesJTextField.getText().equals("") || 
                        salesJTextField.getText().equals(null)),
                        !(salaryJTextField.getText().equals("") || 
                        salaryJTextField.getText().equals(null)),
                        salesPlus, salaryBase);

                // Display total
                total = myPaycheck.calculatePaycheckBill();
                netPayJTextField.setText(dollars.format(total)); 
                // Display bill
                display.delete(0, display.length());    // Clear display
                outputJTextArea.setText(myPaycheck.displayBill().toString()); //  Call to PaycheckBill method
            }
            catch(NumberFormatException exp){
                JOptionPane.showMessageDialog(null,
                        "Base salary and gross sales must be positive numeric values.",
                        "Error", JOptionPane.WARNING_MESSAGE);
                salaryJTextField.requestFocus();
                salaryJTextField.selectAll();
            }
        }
    }//GEN-LAST:event_displayJButtonActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        saveJButtonActionPerformed()
    * Description   Saves the content of JTextArea to an external file with the     
    *               same name as patient
    * Date          8/9/2021
    * @author       <i>Minh Nguyen</i>	
    * @param        evt--java.awt.event.ActionEvent
    * @see          java.awt.event.ActionEvent
    * @see          java.ioFileWrite
    * @see          java.io.PrintWriter
    * @see          java.io.IOException
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed
        try {
            // Create a file to write
            String patient = nameJComboBox.getSelectedItem().toString();
            FileWriter fwriter = new FileWriter("src/Project2/" + patient + ".txt",false);
            PrintWriter outputFile = new PrintWriter(fwriter);
            // Write the name & bill to the file
            //display.delete(0, display.length());
            outputFile.println("Testing for now");
            outputFile.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_saveJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Paycheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paycheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paycheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paycheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paycheck().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutJMenuItem;
    private javax.swing.JFormattedTextField accountJFormattedTextField;
    private javax.swing.JLabel accountJLabel;
    private javax.swing.JLabel addressJLabel;
    private javax.swing.JTextField addressJTextField;
    private javax.swing.JLabel cityJLabel;
    private javax.swing.JTextField cityJTextField;
    private javax.swing.JButton clearJButton;
    private javax.swing.JMenuItem clearJMenuItem;
    private javax.swing.JLabel dateJLabel;
    private javax.swing.JTextField dateJTextField;
    private javax.swing.JButton displayJButton;
    private javax.swing.JMenu fileJMenu;
    private javax.swing.JPopupMenu.Separator fileJSeperator;
    private javax.swing.JMenu helpJMenuItem;
    private javax.swing.JComboBox<String> nameJComboBox;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JLabel netPayJLabel;
    private javax.swing.JTextField netPayJTextField;
    private javax.swing.JMenuItem newJMenuItem;
    private javax.swing.JScrollPane outputJScrollPane;
    private javax.swing.JTextArea outputJTextArea;
    private javax.swing.JMenuBar paycheckJMenuBar;
    private javax.swing.JLabel pictureJLabel;
    private javax.swing.JMenuItem printCheckJMenuItem;
    private javax.swing.JMenuItem printFormJMenuItem;
    private javax.swing.JButton printJButton;
    private javax.swing.JButton quitJButton;
    private javax.swing.JMenuItem quitJMenuItem;
    private javax.swing.JLabel salaryJLabel;
    private javax.swing.JTextField salaryJTextField;
    private javax.swing.JLabel salesJLabel;
    private javax.swing.JTextField salesJTextField;
    private javax.swing.JButton saveJButton;
    private javax.swing.JComboBox<String> stateJComboBox;
    private javax.swing.JLabel stateJLabel;
    private javax.swing.JLabel thankJLabel;
    private javax.swing.JFormattedTextField zipJFormattedTextField;
    private javax.swing.JLabel zipJLabel;
    // End of variables declaration//GEN-END:variables
}
