package DataDriven.DataDrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	public static final String excelFilePath = "D:\\User.xlsx";

	public static List<User> getUserList() throws IOException {
		List<User> listUser = new ArrayList<User>();

		FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
		Workbook workbook = ExcelUtil.getWorkbook(inputStream, excelFilePath);

		Sheet firstSheet = workbook.getSheetAt(0);
		Iterator<Row> iterator = firstSheet.iterator();
		while (iterator.hasNext()) {
			Row nextRow = iterator.next();
			Iterator<Cell> cellIterator = nextRow.cellIterator();
			User user = new User();

			while (cellIterator.hasNext()) {
				Cell nextCell = cellIterator.next();
				int columnIndex = nextCell.getColumnIndex();

				switch (columnIndex) {
				case 0:
					user.setUserName((String) getCellValue(nextCell));
					break;
				case 1:
					user.setPassword((String) getCellValue(nextCell));
					break;
				}
			}
			listUser.add(user);
		}

		workbook.close();
		inputStream.close();

		return listUser;
	}

	public static Object getCellValue(Cell cell) {
		switch (cell.getCellType()) {
		case Cell.CELL_TYPE_STRING:
			return cell.getStringCellValue();

		case Cell.CELL_TYPE_BOOLEAN:
			return cell.getBooleanCellValue();

		case Cell.CELL_TYPE_NUMERIC:
			return cell.getNumericCellValue();
		}

		return null;
	}

	public static Workbook getWorkbook(FileInputStream inputStream, String excelFilePath) throws IOException {
		Workbook workbook = null;

		if (excelFilePath.endsWith("xlsx")) {
			workbook = new XSSFWorkbook(inputStream);
		} else if (excelFilePath.endsWith("xls")) {
			workbook = new HSSFWorkbook(inputStream);
		} else {
			throw new IllegalArgumentException("The specified file is not Excel file");
		}

		return workbook;
	}

	public static void main(String[] args) throws IOException {
		List<User> list = ExcelUtil.getUserList();
		for (User user : list) {
			System.out.println(user.getUserName());
			System.out.println(user.getPassword());
		}
	}
}
