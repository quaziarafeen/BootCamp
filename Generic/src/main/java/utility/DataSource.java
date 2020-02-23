package utility;

import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataSource {
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static DataReader dataReader = new DataReader();

    // Insert Data from into Database
    public static void insertDataIntoDB() {
        //List<String> list = getItemValue();
        connectToSqlDB = new ConnectToSqlDB();
        //connectToSqlDB.insertStringDataFromArrayListToSqlTable(list,"ItemList","items");
    }

    //  From Class
    public static List<String> getItemValue() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("American Express Travel");
        itemsList.add("Find a Business Card");
        itemsList.add("Rewards Built For You");
        itemsList.add("Personal card");
        itemsList.add("Business Card");
        itemsList.add("corporate card");
        return itemsList;
    }


    //Database
    public static List<String> getItemsListFromDB() throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("ItemList", "items");
        return list;
    }

    //Excel file
    public String[] getDataFromExcelFile() throws IOException {
        String path = System.getProperty("user.dir") + "/Data/file1.xls";
        String[] data = dataReader.fileReader2(path, 0);
        return data;
    }

    public static List<String> getItemsListFromExcel(String filePath) throws Exception, IOException, SQLException, ClassNotFoundException {
        //List<String> list = new ArrayList<String>(); ../Generic/browser-driver/chromedriver
        String path = System.getProperty(filePath);
        String[] myStringArray = dataReader.fileReader2(path, 1);
        for (int i = 1; i < myStringArray.length; i++)
            System.out.print(myStringArray[i] + " ");
        ArrayList<String> list = new ArrayList<String>();

        // Using add() method to add elements in array_list
        //System.out.println();
        for (int i = 0; i < myStringArray.length; i++) {
            list.add(myStringArray[i]);
            //System.out.print(list.get(i+1) + " ");
        }
        return list;
    }

}
