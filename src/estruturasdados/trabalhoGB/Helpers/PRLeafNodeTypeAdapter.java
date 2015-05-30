/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturasdados.trabalhoGB.Helpers;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import estruturasdados.trabalhoGB.Domain.PRLeafNode;
import java.awt.Color;
import java.io.IOException;

/**
 *
 * @author rosted
 */
public class PRLeafNodeTypeAdapter extends TypeAdapter<PRLeafNode>{

    @Override
    public void write(JsonWriter writer, PRLeafNode node) throws IOException {
        
        writer.beginObject();
            writer.name("id").value(node.getId());
            writer.name("level").value(node.getLevel());
            writer.name("position").value(node.getPosition() == null ? null : node.getPosition().toString());
            writer.name("father").value(node.getFather() == null ? null : node.getFather().getId());
        
            writer.name("x").value(node.getX());
            writer.name("y").value(node.getY());
            
            Color c = node.getColor();
            writer.name("rgb").value("R: " + c.getRed() + " G: " + c.getGreen() + " B: " + c.getBlue());
        writer.endObject();
        
    }

    @Override
    public PRLeafNode read(JsonReader reader) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
