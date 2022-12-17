package com.example.word_dic;

import java.io.*;
import java.util.HashMap;

public class DictionarySaver {
    private HashMap<String,String > dicList;
    HashMap<String,String> getDictionaryList(){
        return dicList;
    }

    DictionarySaver(){
        dicList=new HashMap<>();
    }

    void  serializeHashMap() {
        try {
            FileOutputStream fos = new FileOutputStream("DictionaryData1");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dicList);
            oos.close();
            fos.close();
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
    void  deserializeHashMap() throws IOException,ClassNotFoundException{
        FileInputStream fis =new FileInputStream("DictionaryData1");
        ObjectInputStream ois = new ObjectInputStream(fis);
        dicList=(HashMap<String, String>) ois.readObject();



    }
}
