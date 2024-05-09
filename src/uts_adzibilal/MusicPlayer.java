/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_adzibilal;

import jaco.mp3.player.MP3Player;
import java.io.File;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.JFrame;

/**
 *
 * @author LENOVO
 */
public class MusicPlayer {
    public static void main(String[] args) throws Exception {

    // MP3Player.setDefaultUI(MP3PlayerUICompact.class);

    //

    MP3Player player = new MP3Player();

    player.setRepeat(true);

    player.addToPlayList(new File("C:\\Users\\LENOVO\\Downloads\\tiara.mp3"));

    //

    player.setBorder(BorderFactory.createEmptyBorder(50, 100, 50, 100));

    JFrame frame = new JFrame("MP3 Player");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(player);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
