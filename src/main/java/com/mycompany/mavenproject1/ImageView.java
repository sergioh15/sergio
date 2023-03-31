/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageView extends JPanel {
    
    private static final long serialVersionUID = 1L;
    
    private ImageModel model;
    
    public ImageView(ImageModel model) {
        this.model = model;
        setPreferredSize(new Dimension(600, 400));
        setLayout(new GridLayout(2, 2));
        
        List<Image> images = model.getImages();
        for (int i = 0; i < 4; i++) {
            ImageIcon icon = new ImageIcon(images.get(0)); // Obtener la primera imagen del modelo
            JLabel label = new JLabel(icon);
            add(label);
        }
    }
}



