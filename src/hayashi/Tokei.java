package hayashi;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tokei extends JFrame {
    private static final long serialVersionUID = 1L;

    public static void main(String args[]) {
        Tokei ti = new Tokei();
        ti.setBounds(100, 100, 300, 200);
        ti.setBackground(Color.red);
        ti.setVisible(true);
    }

    public Tokei() {
        TimeLabel label = new TimeLabel();
        this.add(label,BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class TimeLabel extends JLabel {
    private DateFormat format;

    public TimeLabel(){
        this.setFont(new Font("Dialog",Font.BOLD,100));
        format = new SimpleDateFormat("HH:mm"/*:ss"*/);
        Timer t = new Timer();
        t.schedule(new TimerLabelTask(), 0,1000);
    }

    public void setTime(){
        Calendar calendar = Calendar.getInstance(Locale.JAPAN);
        this.setText(format.format(calendar.getTime()));
    }

    class TimerLabelTask extends TimerTask {

        public void run(){
            setTime();
        }
    }
}