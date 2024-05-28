package org.jochoa.DAO;

import org.jochoa.drawable.IDrawable;

import java.util.ArrayList;

public class DrawablesDao {
    ArrayList<IDrawable> drawables;

    public DrawablesDao(){
        drawables = new ArrayList<>();
    }

    public void add(IDrawable drawable){
        this.drawables.add(drawable);
    }

    public ArrayList<IDrawable> getDrawables() {
        return drawables;
    }
}
