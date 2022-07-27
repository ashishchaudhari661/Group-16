package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
public static String data(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\ashis\\Downloads\\Excel\\zerodha.xlsx");
	return WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
}
}
