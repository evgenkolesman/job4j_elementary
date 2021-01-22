package annonymousInnerClass;

import java.awt.*;
/*import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;*/
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/* Демонстрируется применение анонимных
внутренних классов
 */


public class AnnonymousInnerClassTest
{
    public static void main(String[] args)
    {
        TalkingClock clock = new TalkingClock();
        clock.start(1000, true);
        //выполняем программу до тех пор пока обыватель не щелкнет "ок"
        JOptionPane.showMessageDialog(null, "Закрыть программу?");
        System.exit(0);
    }
}
    /* Часы выводящие время через регулярные промежутки     */

class TalkingClock {
    /* запускает часы
     * @param interval Интервал между сообщениями в милисекундах
     * @param beep Истинно, если часы должны издавать звуковой сигнал
     */
    public void start(int interval, boolean beep) {
         Timer t = new Timer(interval, event ->
            {
                System.out.println("Time is " + new Date());
                if (beep) Toolkit.getDefaultToolkit().beep();
            });

        t.start();
        }

    }
/* Другой вариант метода start ()
тогда надо добавлять
библиотеки

*
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
*

public void start( int interval, boolean beep)
{
    ActionListener listener =new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
        System.out.println("Time is:" + new Date());
        if (beep) Toolkit.getDefaultToolkit().beep();
        }
    };
    Timer t = new Timer(interval,listener);
    t.start();
}
 */