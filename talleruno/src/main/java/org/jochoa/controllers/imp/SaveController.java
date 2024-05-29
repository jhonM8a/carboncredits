package org.jochoa.controllers.imp;

import org.jochoa.DAO.DrawablesDao;
import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SaveController {

    private DrawablesDao drawablesDao;

    private Gson json;
    public SaveController(){
        this.initGson();
    }
    private void initGson(){
        if (json == null){
            json = new Gson();
        }
    }

    public void saveData(){
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());

        String rutaArchivo = "File_" + timestamp + ".txt";
        try {
            FileWriter fileWriter = new FileWriter(rutaArchivo);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(json.toJson(drawablesDao.getDrawables()));

            bufferedWriter.close();

            System.out.println("El contenido ha sido guardado en el archivo exitosamente: " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al guardar el archivo.");
            e.printStackTrace();
        }
    }

    public void setDrawablesDao(DrawablesDao drawablesDao) {
        this.drawablesDao = drawablesDao;
    }
}
