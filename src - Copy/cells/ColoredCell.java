/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codinggame.map.cells;

import codinggame.map.MapTile;
import codinggame.map.proceduralmap.ProcMapCell;
import com.lwjglwrapper.utils.colors.StaticColor;
import org.joml.Vector4f;

/**
 *
 * @author Welcome
 */
public class ColoredCell extends DataCell{
    
    private StaticColor color;

    public ColoredCell(StaticColor color, MapTile tile) {
        super(tile);
        this.color = color;
    }

    public StaticColor getColor() {
        return color;
    }

    @Override
    public ColoredCell clone() {
        return new ColoredCell(color, tile);
    }
    
    
}
