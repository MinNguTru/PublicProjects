package Project2;
import java.text.NumberFormat;
import java.util.Objects;
/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*<pre>
* Class         PaycheckBill
* File          PaycheckBill.java
* Description   Provides dental bill with all fields for services provided in a 
*               dental office. Methods include calculateDentalBill(), desplayBill(),
*               padSpaces(), toString(), equals(), and getAmount().
* @author       <i>Minh Nguyen</i>
* Course        CS 141, Summer 2021, Edmonds College
* Environment   PC, Windows 10, jdk1.8.0_241, NetBeans 11.3
* Date          8/5/2021
* @version      1.0
* @see          java.text.NumberFormat
*</pre>         
*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class PaycheckBill {
    // Class constants
    double total = 0.0;// Sum of all services provided
    StringBuffer display = new StringBuffer(); // Output
    private static double commissionSalary = 0.0, grossPay = 0.0, federalTax = 0.0, 
            fica = 0.0, medicare = 0.0, fli = 0.0, pension = 0.0;
    
    // Instance Variables
    private String workerName;
    private boolean address, city, state, zip, account, sales, salary;
    private NumberFormat dollars = NumberFormat.getCurrencyInstance();
    private double salesAmount = 0.0, salaryAmount = 0.0;

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Constructor   DentalBill()--default constructor
    * Description   Creates and instance of a DentalBill object with default
    *               values for its fields.
    * @author       <i>Minh Nguyen</i>
    * Date          8/5/2021
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public PaycheckBill() {
        workerName = "";
        address = false;
        city = false;
        state = false;
        zip = false; 
        account = false;
        sales = false;
        salary = false;
        salesAmount = 0.0;
        salaryAmount = 0.0;
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Constructor   DentalBill()--overloaded constructor
    * Description   Creates and instance of a DentalBill object with specified
    *               parameters provided values for its fields
    * @author       <i>Minh Nguyen</i>
    * Date          8/5/2021
    * @param        name--String
    * @param        add--boolean
    * @param        cit--boolean
    * @param        sta--boolean
    * @param        zi--boolean
    * @param        acct--boolean
    * @param        sal--boolean
    * @param        sala--boolean
    * @param        salAmount--double
    * @param        salarAmount--double
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public PaycheckBill(String name, boolean add, boolean cit, boolean sta, 
            boolean zi, boolean acct, boolean sal, boolean sala,  
            double salAmount, double salarAmount) {
        workerName = name;
        address = add;
        city = cit;
        state = sta;
        zip = zi; 
        account = acct;
        sales = sal;
        salary = sala;
        salesAmount = salAmount;
        salaryAmount = salarAmount;
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method          calculateDentalBill()
    * Description     Calculates the total amount for paycheck
    * Date            8/8/2021
    * @author         <i>Minh Nguyen</i>	
    * @return         total--double 
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    double calculatePaycheckBill(){
        // Variables
        total = 0.0;
        grossPay = 0.0;
        double commissionRate1 = .08, commissionRate2 = .1, commissionRate3 = .12,
                fedRate = .0756, ficaRate = .062, medicareRate = .0145,
                fliRate = .002532, pensionRate = .05, minimumCheck = 5000.0,
                maximumCheck = 10000.0;
        
        // Calculate employee's paycheck
        if(getSalesAmount() <= minimumCheck)
            grossPay = getSalesAmount() * commissionRate1;
        else if(getSalesAmount() <= maximumCheck)
            grossPay = (getSalesAmount() - minimumCheck) * commissionRate2
                    + minimumCheck * commissionRate1;
        else if(getSalesAmount() > maximumCheck)
            grossPay = (getSalesAmount() - maximumCheck) * commissionRate3 +
                    minimumCheck * commissionRate2 + minimumCheck * commissionRate1;
        commissionSalary = grossPay;
        grossPay += getSalaryAmount();
        federalTax = grossPay * fedRate;
        fica = grossPay * ficaRate;
        medicare = grossPay * medicareRate;
        fli = grossPay * fliRate;
        pension = grossPay * pensionRate;
        total = grossPay - federalTax - fica - medicare - fli - pension;
        return total;
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method          getSalaryAmount()
    * Description     Sample getter method for the amount Salary
    * Date            8/8/2021
    * @author         <i>Minh Nguyen</i>	
    * @return         salaryAmount--double
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getSalaryAmount() {
        return salaryAmount;
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method          getSalesAmount()
    * Description     Sample getter method for the amount Sales
    * Date            8/8/2021
    * @author         <i>Minh Nguyen</i>	
    * @return         salesAmount--double
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getSalesAmount() {
        return salesAmount;
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method          padSpaces()
    * Description     Accepts two strings as inputs and returns a formatted line
    *                 (StringBuffer) with the first String left-justified and the
    *                 second right-justified
    * Date            8/8/2021
    * @author         <i>Minh Nguyen</i>	
    * @param          first--String
    * @param          second--String
    * @return         line--StringBuffer
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private StringBuffer padSpaces(String first, String second){
        final int MAX_SPACES = 35; // Width of JTextArea
        StringBuffer line = new StringBuffer(first);
        // Find number of spaces needed to pad the string to right-justification
        int numSpaces = MAX_SPACES - first.length() - second.length();
        for (int i = 0; i < numSpaces; i++)
            line.append(" ");       // Add appropriate number of spaces
        line.append(second);        // Add second string
        return line;
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method          displayBill()
    * Description     Displays bill with appropriate formattting which is 
    *                 accomplished by calling the padSpaces() method
    * Date            8/8/2021
    * @author         <i>Minh Nguyen</i>	
    * @return         display--StringBuffer
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public StringBuffer displayBill(){
        display.delete(0, display.length());
        display.append(padSpaces("Employee", workerName + '\n'));
        display.append('\n');
        display.append(padSpaces("Base Salary", dollars.format(getSalaryAmount()) 
                + '\n'));
        display.append(padSpaces("Commission Salary", dollars.format(commissionSalary) 
                + '\n'));
        display.append(padSpaces("Total Gross Pay", dollars.format(grossPay) + '\n'));
        display.append(padSpaces("Federal Tax", dollars.format(federalTax) + '\n'));
        display.append(padSpaces("FICA", dollars.format(fica) + '\n'));
        display.append(padSpaces("Medicare", dollars.format(medicare) + '\n'));
        display.append(padSpaces("FLI", dollars.format(fli) + '\n'));
        display.append(padSpaces("401 (k) Pension Plan", dollars.format(pension) 
                + '\n'));
        display.append("----------------------------------" + '\n');
        display.append(padSpaces("Total", dollars.format(calculatePaycheckBill()) 
                + '\n'));
        return display;
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method          toString()
    * Description     Display PaycheckBill info: returns employee name and total 
    *                 bill by calling calculateDentalBill()
    * Date            8/8/2021
    * @author         <i>Minh Nguyen</i>	
    * @return         Employee info String 
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    @Override
    public String toString(){
        return "Employee " + workerName + " has a total paycheck of " + 
                dollars.format(calculatePaycheckBill());
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method          equals()
    * Description     Overriden method to decide when dentalBill objects are equal
    *                 Netbean generated
    * Date            8/8/2021
    * @author         <i>Minh Nguyen</i>
    * @see            java.util.Objects
    * @param          obj--Object
    * @return         boolean
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PaycheckBill other = (PaycheckBill) obj;
        if (Double.doubleToLongBits(this.total) != Double.doubleToLongBits(other.total)) {
            return false;
        }
        if (this.address != other.address) {
            return false;
        }
        if (this.city != other.city) {
            return false;
        }
        if (this.state != other.state) {
            return false;
        }
        if (this.zip != other.zip) {
            return false;
        }
        if (this.account != other.account) {
            return false;
        }
        if (this.sales != other.sales) {
            return false;
        }
        if (this.salary != other.salary) {
            return false;
        }
        if (Double.doubleToLongBits(this.salesAmount) != Double.doubleToLongBits(other.salesAmount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.salaryAmount) != Double.doubleToLongBits(other.salaryAmount)) {
            return false;
        }
        if (!Objects.equals(this.workerName, other.workerName)) {
            return false;
        }
        return true;
    }
   
    
}
