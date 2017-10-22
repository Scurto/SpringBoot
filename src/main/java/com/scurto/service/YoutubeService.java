package com.scurto.service;

import com.scurto.model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.*;

/**
 * Created by yustymenko on 13.10.2017.
 */
@Repository
@Transactional
public class YoutubeService {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.openSession();
    }

    @SuppressWarnings("unchecked")
    public List<Person> getAllPersons() {
        return getSession().createQuery("from Person").list();
    }

    public List<Youtube> getAllYoutubeTasks() {
        return getSession().createQuery("from Youtube").list();
    }

    public Person getPersonById(Long id) {
        Person person = (Person) getSession().get(Person.class, id);
        return person;
    }

    public Youtube getTaskById(String taskId) {
        Youtube task = (Youtube) getSession().get(Youtube.class, taskId);
        return task;
    }

    public List<Youtube> getReklamaListForRemove(String taskId) {
        List<Youtube> relatedTasks = new ArrayList<>();
        for (String relatedTaskId : getRelatedTasks(taskId)) {
            Youtube relatedTaskFromDb = getTaskById(relatedTaskId);
            if (relatedTaskFromDb != null) {
                relatedTasks.add(relatedTaskFromDb);
            }
        }
        return relatedTasks;
    }

    public ArrayList<String> getRelatedTasks(String taskId) {
        ArrayList<String> relatedTasks = new ArrayList<>();

        if (taskId.equalsIgnoreCase("1") || taskId.equalsIgnoreCase("2")) {
            relatedTasks.add("1");
            relatedTasks.add("2");
        } else if (taskId.equalsIgnoreCase("3") || taskId.equalsIgnoreCase("4")) {
            relatedTasks.add("3");
            relatedTasks.add("4");
        } else if (taskId.equalsIgnoreCase("5")) {
            relatedTasks.add("5");
        }

        return relatedTasks;
    }

    public ArrayList<TransferReklamaModel> prepareReklamaListToShow(String taskId, String countOfReklama, String countOfMove) {
        int intCountOfReklama = Integer.parseInt(countOfReklama);
        int intCountOfMove = Integer.parseInt(countOfMove);
        ArrayList<String> allReklama = new ArrayList<>();
        ArrayList<TransferReklamaModel> etalonReklamaForShow = new ArrayList<>();

        HashMap<String, ReklamaModel> storageReklama = ReklamaStorage.getAllReklama();
        List<Youtube> taskForRemove = getReklamaListForRemove(taskId);
        List<String> readReklamaFromTask = readReklamaFromTask(taskForRemove);

        for (String s : readReklamaFromTask) {
            storageReklama.remove(s);
        }


        ArrayList<String> uniqKeys = new ArrayList<>();
        uniqKeys.addAll(storageReklama.keySet());

        if (uniqKeys.size() > intCountOfReklama) {
            Random rnd = new Random();
            for (int i = 0; i < intCountOfReklama; i++) {
                String unigKey = uniqKeys.get(rnd.nextInt(uniqKeys.size()));
                uniqKeys.remove(unigKey);
                allReklama.add(unigKey);
            }

            for (String rek : allReklama) {
                ReklamaModel model = storageReklama.get(rek);
                TransferReklamaModel newModel = new TransferReklamaModel();
                ArrayList<String> newModelTextLine = new ArrayList<>();


                for (int i = 0; i < intCountOfMove; i++) {
                    SecondaryReklamaModel secondaryReklamaModel = model.getSecondaryReklamaModels().get(rnd.nextInt(model.getSecondaryReklamaModels().size()));
                    model.getSecondaryReklamaModels().remove(secondaryReklamaModel);
                    newModelTextLine.add(secondaryReklamaModel.getUrl());
                }

                newModel.setGclidLine(model.getMainUrl());
                newModel.setTextLine(newModelTextLine);

                etalonReklamaForShow.add(newModel);
            }

        }

        return etalonReklamaForShow;
    }

    public List<String> readReklamaFromTask(List<Youtube> list) {

        List<String> stringSet = new ArrayList<>();
        for (Youtube youtube : list) {
            stringSet.addAll(Arrays.asList(youtube.getLastReklama().split("/")));
        }

        return stringSet;
    }

    public String getGclid() {
        Document doc = null;
        try {
            doc = Jsoup.connect("http://www.googleadservices.com/pagead/aclk?sa=L&ai=CL5pYZBf5Vt7JDdHCzAaQ9rioBNPTpaAJi6fr1cwCwI23ARABII-3lydgpa6jhvwioAGl1PrMA8gBAqkCi1C4O9yRZD6oAwHIA8EEqgSGAU_QZb7yQmc68XRES43BmnFv7WwFuh2EO6yXlVPcp-CjYYmaJiLpDGT1Ez62ipR-tLpJMwkRX4ksXWfXHyrpWF6PJSGaDjOAWcp0fa9ms2HrI69PE4w9-ci_dYs4bfS15CAD88OaojTjVtSEa-acK4Bcht2KJ_6GSBaqn5jAiEkCRr-tujxYiAYBoAYCgAfDq4UzqAemvhvYBwE&num=1&cid=5GgQQtsb4HnWY7c17g9SpS51&sig=AOD64_2UG1wFu-Coo7ptfLnfD_RuF3I-pg&client=ca-pub-6591344393480072&adurl=http://www.amotutto.com.ua/maslo-olivkovoe-olio-di-oliva.html").get();
//			http://www.googleadservices.com/pagead/aclk?sa=L&ai=CE3Ea0xH5VrvBMsLQWIbMi5gEh9C46wjP2J3IqgHZ2R4QASCPt5cnYKWuo4b8IqAB8ZDo0QPIAQSpAtuvLQjFc2Q-qAMBqgSJAU_QdforgDP693gblzap__W37VMG-P-6lyJJpludDxa-Sly2VejUppKx_sVlVzn2eneASTPem0i-3PiTBXuDCXfvCPs7WMQ7tXkwGbWA5PUG5g8dTCkDhjHNwK8mXmQInbxBaIcWy4wsNcrNNEHxgb7jV385InOFFx4xphpJ409zmpt7tcAtjONhiAYBoAYEgAf37pcuqAemvhvYBwA&num=1&cid=5GjuNJU5TeVzfh3jPSr5DtZ2&sig=AOD64_13YGsXGMFoT8tFggLncW46HsknqA&client=ca-pub-6591344393480072&adurl=http://oiler.com.ua/sto/
        } catch (IOException e) {
            e.printStackTrace();
        }

        String baseUri = doc.baseUri();
        int index = baseUri.lastIndexOf("gclid=");
        String gclid = baseUri.substring(index+6, baseUri.length());
        System.out.println(baseUri);
        System.out.println(gclid);
        return gclid;
    }



//    private static void prepareStringValueForDB(List<String> reklamaList) {
//        StringBuilder stringBuilder = new StringBuilder();
//        for (String s : reklamaList) {
//            stringBuilder.append(s).append("/");
//        }
//
//        if (stringBuilder.length() > 1) {
//            stringBuilder.delete(stringBuilder.length() -1, stringBuilder.length());
//            System.out.println("stringBuilder = " + stringBuilder);
//        }
//    }
//
//
//    public void workWithTimer() {
//        LocalDate today = LocalDate.now();
//        System.out.println("Current DateTime: " + today);
//        String stringDate = today.toString();
//        LocalDate parsedDate = LocalDate.parse(stringDate).minusDays(2);
////        System.out.println("parsedDate: " + parsedDate.minusDays(2));
//
//        System.out.println("isAfter " + parsedDate.isAfter(parsedDate));
//        System.out.println("isEqual " + parsedDate.isEqual(parsedDate));
//        System.out.println("isAfter 2  " + today.isAfter(parsedDate));
//    }


}
