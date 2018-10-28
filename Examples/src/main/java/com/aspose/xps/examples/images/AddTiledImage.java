/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aspose.xps.examples.images;

import com.aspose.xps.XpsDocument;
import com.aspose.xps.XpsImageBrush;
import com.aspose.xps.XpsPath;
import com.aspose.xps.XpsTileMode;
import com.aspose.xps.java.examples.Utils;
import java.awt.geom.Rectangle2D;

public class AddTiledImage {

    public static void main(String[] args) throws Exception
    {       

        // The path to the documents directory.
        String dataDir = Utils.getDataDir();       
        //ExStart:TiledImage

        // Create new XPS Document
        XpsDocument doc = new XpsDocument();
        // Tile image
        // ImageBrush filled rectangle in the right top bellow
        XpsPath path = doc.addPath(doc.createPathGeometry("M 10,160 L 228,160 228,305 10,305"));
        path.setFill(doc.createImageBrush(dataDir +  "R08LN_NN.jpg",
                                        new Rectangle2D.Float(0f, 0f, 128f, 96f), new Rectangle2D.Float(0f, 0f, 64f, 48f)));
        ((XpsImageBrush)path.getFill()).setTileMode(XpsTileMode.Tile);
        path.getFill().setOpacity(0.5f);
        // Save resultant XPS document
        doc.save(dataDir + "AddTiledImage_out.xps");
        //ExEnd:TiledImage
}

}