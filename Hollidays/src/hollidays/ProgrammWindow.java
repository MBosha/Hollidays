/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hollidays;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author mikhail.bombin
 */
public class ProgrammWindow extends Frame 
{
    public ProgrammWindow ()    
    {
        //super («Hollidays»);
        setSize (200,200); 
        Button myButton = new Button ("Выполнить");
        Label myLabel = new Label ("Текст");
        add (myLabel, BorderLayout.NORTH);
        add (myButton, BorderLayout.SOUTH);
        myButton.addActionListener ( new ActionListener ()
        {
            public void actionPerformed (ActionEvent e) 
            {
                myLabel.setText ("Текст");
            }
        });
                
    }        
}

