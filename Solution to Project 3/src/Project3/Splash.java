package Project3;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*<pre>
* Class         Splash
* File          Splash.java
* Description   This class provides a Splash screen for the WorldWonderGUI Application
* @author       <i>Minh Nguyen</i>
* Course        CS 141, Summer 2021, Edmonds
* Environment   PC, Windows 10, jdk1.8.0_241, NetBeans 11.3
* Date          8/24/2021
* @version      1.0
* @see          javax.swing.JWindow
* @see          javax.swing.JProgressBar
*</pre>         
*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class Splash extends JWindow {
    // Class instance variables
    private JProgressBar loading = new JProgressBar();
    private int duration;
    private int progress;
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Constructor   Splash()--Default constructor
    * Description   Assign value to duration for how long to show it
    * @author       <i>Minh Nguyen</i>
    * Date          8/24/2021
    * @param        dur--int
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Splash(int dur){
        duration = dur;
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        showSplash()
    * Description   Display image and progress bar in a JPanel in a seperate Thread
    * @author       <i>Minh Nguyen</i>
    * Date          8/24/2021
    * @see          java.lang.Thread
    * @see          java.awt.Color
    * @see          java.awt.Dimension
    * @see          java.awt.Toolkit
    * @see          java.awt.BorderLayout
    * @see          javax.swing.JPanel
    * @see          javax.swing.ImageIcon
    * @see          javax.swing.JLabel
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void showSplash(){
        JPanel content = (JPanel)getContentPane();
        content.setBackground(Color.lightGray);
        // Set the window's bounds, centering the window
        int width = 610;
        int height = 620;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - width) / 2;
        int y = (screen.height - height) / 2;
        setBounds(x,y,width,height);
        // Build the splash screen
        JLabel imageLabel = new JLabel (new ImageIcon("src/Project3/Logo.jpg"));
        JLabel copyrt = new JLabel ("Copyright: Freeware, Paycheck", JLabel.CENTER);
        content.add(imageLabel, BorderLayout.CENTER);
        content.add(loading, BorderLayout.SOUTH); 
        Color border = new Color(255, 255, 255, 255);
        content.setBorder(BorderFactory.createLineBorder(border, 10));
        // Display it
        this.setVisible(true);
        // Wait a little while, maybe while loading resources
        try {
            // Increment the progress bar's value to 100 starting from 0
            increment(25);
            Thread.sleep(duration);
        }
        catch(Exception e){
            
        }
        setVisible(false);
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method        increment()
    * Description   Creates and runs a new thread to manage the incrementing of 
    *               the progress bar while the splash screen is showing. Creates 
    *               an instance of an inner class IncementProgress and calls the 
    *               start method to run it in a seperate thread.
    * @author       <i>Minh Nguyen</i>
    * Date          8/24/2021
    * @throws       InterruptedException if not loading
    * @param        milliseconds--int
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void increment (int milliseconds) throws InterruptedException {
        IncementProgress up = new IncementProgress(milliseconds);
        up.thread.start();
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Class         IncementProgress
    * Description   An inner class to handle the running of the progress bar in 
    *               a seperate thread
    * @author       <i>Minh Nguyen</i>
    * Date          8/24/2021
    *</pre>         
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    class IncementProgress {
        private int incProgress;
        /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        *<pre>
        * Constructor   IncementProgress
        * Description   Assigns time value in milliseconds to incProgress
        * @author       <i>Minh Nguyen</i>
        * Date          8/24/2021
        * @see          java.lang.Thread
        * @see          java.lang.Runnable
        * @param        time--int
        *</pre>
        *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
        public IncementProgress(int time) {
            this.incProgress = time;
        }
        // Handling of the thread is done by an anonymous inncer class
        private Thread thread = new Thread(new Runnable(){
            @Override
            public void run(){
                {
                    // Increment the progress bar until it's value hit 100
                    while (progress < (progress + incProgress)) {
                        progress++;
                        try {
                            Thread.sleep(19);
                        }
                        catch(InterruptedException ex){
                            
                        }
                        loading.setValue(progress);
                    }
                }    
            }
        });
    }
}
