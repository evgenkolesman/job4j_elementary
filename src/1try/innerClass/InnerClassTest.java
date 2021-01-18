package innerClass;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/* Вэтой программе  демонстрируется применение внутренних классов
*/

public class InnerClassTest
{
    public static void main (String [] args)
    {
        TalkingClock clock=new TalkingClock(1000,true);
        clock.start();
        //выполняем программу пока  пользователь не щелкнет по кнопке "Ок"
        JOptionPane.showMessageDialog(null, "Закрыть программу?");
        System.exit(0);
    }
}

/*Часы выводящие время через регулярные отрезки времени
*/

class TalkingClock
{
    private int interval;
    private boolean beep;

    /*Конструирет "Говорящие часы"
    @param interval Интервал между сообщениями в милисекундах
    @param beep Истинно елси  часы должны издавать звуковой сигнал
     */
    public TalkingClock (int interval, boolean beep)
    {
        this.interval=interval;
        this.beep = beep;
    }
    // Запускаем часы
    public void start()
    {
        ActionListener listener=new TimePrinter();
        Timer t = new Timer (interval, listener);
        t.start();
    }

    public class TimePrinter implements ActionListener
    {
        public void actionPerformed (ActionEvent event)
        {
            System.out.println("Время: " + new Date());
            if (beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}