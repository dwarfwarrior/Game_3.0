package com.company.createOrContinue;

import com.company.dataBaseOfGame.ConnectAndWorkWhithDB;
import com.company.start.CreateNewCharacter;

import javax.swing.*;

/**
 * Created by dwarfawrrior on 6/10/2016.
 */
public class Chooser {
   public static void Chooser() {
       boolean chooser = false;
       JOptionPane.showMessageDialog(null, "Hello!");
       JOptionPane.showMessageDialog(null, "Would you create new character or load old one?");
       int choose = Integer.parseInt(JOptionPane.showInputDialog(null, "if you want to load character enter 1, if you want to create new one - 0"));
       while (chooser == false) {
           if (choose == 0) {
               ConnectAndWorkWhithDB.DataBase();
               CreateNewCharacter.CreateNewCharacte();
               chooser = true;
           } else if (choose == 1) {
               ConnectAndWorkWhithDB.Load();
               chooser = true;
           }
           else {
               JOptionPane.showMessageDialog(null,  "Put right number");
               choose = Integer.parseInt(JOptionPane.showInputDialog(null, "if you want to load character enter 1, if you want to create new one - 0"));
           }
       }
   }
}
