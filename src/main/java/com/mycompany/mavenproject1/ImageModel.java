
package com.mycompany.mavenproject1;


import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;

public class ImageModel extends AbstractListModel<BufferedImage> {

    private List<BufferedImage> images = new ArrayList<>();

    @Override
    public int getSize() {
        return images.size();
    }

    @Override
    public BufferedImage getElementAt(int index) {
        return images.get(index);
    }

    public void addImage(BufferedImage image) {
        images.add(image);
        fireIntervalAdded(this, images.size() - 1, images.size() - 1);
    }
}
