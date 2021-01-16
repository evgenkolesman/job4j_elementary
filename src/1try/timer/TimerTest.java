package timer;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

// имя класса указанно полностью для разрешения
//конфликта имен с классом java.util.Timer


public class TimerTest
{
    public static void main (String[]args)
    {
    ActionListener listener = new TimePrinter ();
    //построить таймер который вызывает приемник каждые 10 секунд
    Timer t = new Timer(10000, listener);
    t.start();
    JOptionPane.showMessageDialog(null, "Quit programm?");
    System.exit(0);
    }
}

