package org.jochoa.controllers.imp;

import org.jochoa.DAO.DrawablesDao;
import com.google.gson.Gson;
import org.jochoa.constants.Constant;
import org.jochoa.models.Evaluation;
import org.jochoa.models.Evaluator;
import org.jochoa.models.Land;
import org.jochoa.service.RequestService;
import org.jochoa.views.FormSaveDataPanel;
import org.jochoa.views.FormSaveDataWindow;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class SaveController {

    private DrawablesDao drawablesDao;

    private RequestService requestService;

    private String figures;

    private Gson json;
    public SaveController(){
        this.initGson();
        this.requestService = new RequestService();
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

            figures = json.toJson(drawablesDao.getDrawables());
            bufferedWriter.write(figures);

            bufferedWriter.close();

            System.out.println("El contenido ha sido guardado en el archivo exitosamente: " + rutaArchivo);

            sendData();
        } catch (IOException e) {
            System.out.println("Ocurrió un error al guardar el archivo.");
            e.printStackTrace();
        }
    }

    private void sendData() {
        List<Land> lands = requestService.getLands();
        List<Evaluator> evaluators = requestService.getEvaluators();


        DefaultComboBoxModel<String> landsCombo = new DefaultComboBoxModel<>();
        DefaultComboBoxModel<String> evaluatorCombo = new DefaultComboBoxModel<>();
        DefaultComboBoxModel<String> stateCombo = new DefaultComboBoxModel<>();



        for (Land land: lands) {
            landsCombo.addElement(land.getLand_id()+"-"+land.getDescription());
        }

        for(Evaluator evaluator: evaluators){
            evaluatorCombo.addElement(evaluator.getEvaluator_Id()+"-"+evaluator.getName());

        }

        stateCombo.addElement(Constant.CREATE);
        stateCombo.addElement(Constant.EVALUATE);


        FormSaveDataPanel formSaveDataPanel = new FormSaveDataPanel(landsCombo,evaluatorCombo,stateCombo, this);
        FormSaveDataWindow formSaveDataWindow = new FormSaveDataWindow(formSaveDataPanel);
        formSaveDataWindow.add(formSaveDataPanel);
        formSaveDataWindow.setVisible(true);

    }

    public void setDrawablesDao(DrawablesDao drawablesDao) {
        this.drawablesDao = drawablesDao;
    }

    public void sendData(Long land, Long evaluator, String state) {
        String dataSend = json.toJson(new Evaluation(land,evaluator,state, this.figures));
        requestService.sendPostRequest(dataSend);
    }
}
