package com.woniu.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.woniu.pojo.Student;

public class StuExcel {

	public static List<Student> readExcel(File file) throws Exception{
		List<Student> students = new ArrayList<Student>();
		InputStream is = null;
		try {
			
			if(file==null) {
				throw new IOException("文件不正确");
			}
			
			is = new FileInputStream(file);
			
			Workbook workbook = WorkbookFactory.create(is);
			FormulaEvaluator fe = workbook.getCreationHelper().createFormulaEvaluator();
			
			//获取第一张表
			Sheet sheet = workbook.getSheetAt(0);
			if(sheet==null) {
				throw new IOException("传入的第一张表为空");
			}
			
			for(int rowNum=0;rowNum<=sheet.getLastRowNum();rowNum++) {
Row row = sheet.getRow(rowNum);
				
				if(row != null) {
					
					//获得当前行的开始列
					int firestCellNum = row.getFirstCellNum();
					
					//获得当前行的列数
					int lastCellNum = row.getPhysicalNumberOfCells();
					
					StringBuilder result = new  StringBuilder();
					
					//循环当前行
					for (int cellNum = 0; cellNum < lastCellNum; cellNum++) {
						
						Cell cell = row.getCell(cellNum);
						
						String value = "";
						
						if(null!=fe.evaluate(cell)) {
							value=fe.evaluate(cell).getStringValue();
						}
						
						result = result.append(cellNum).append(":").append(value).append("--");
						
					}
					
					System.out.println("result---------"+result);
				}
			}
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
			throw new Exception("文件不正确！");
		}finally {
			is.close();
		}
		
		
		
		return students;
	}
}
