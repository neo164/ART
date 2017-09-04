package test.exel;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadandWriteExcel {

    public static void main(String[] args) {
        try {
            File src = new File("excel.xlsx");

            FileInputStream fis = new FileInputStream(src);
            XSSFWorkbook myEB = new XSSFWorkbook(src);
            // Load sheet- Here we are loading first sheetonly
            XSSFSheet sh1 = myEB.getSheetAt(0);

            String name = null;
            String description = null;
            String assignee = null;

            myEB.getSheetAt(0).getRow(0).getCell(1);
            // System.out.println("Name : " + name);
            name = sh1.getRow(1).getCell(0).toString();
            System.out.println(name);

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

}