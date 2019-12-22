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
				throw new IOException("�ļ�����ȷ");
			}
			
			is = new FileInputStream(file);
			
			Workbook workbook = WorkbookFactory.create(is);
			FormulaEvaluator fe = workbook.getCreationHelper().createFormulaEvaluator();
			
			//��ȡ��һ�ű�
			Sheet sheet = workbook.getSheetAt(0);
			if(sheet==null) {
				throw new IOException("����ĵ�һ�ű�Ϊ��");
			}
			
			for(int rowNum=0;rowNum<=sheet.getLastRowNum();rowNum++) {
Row row = sheet.getRow(rowNum);
				
				if(row != null) {
					
					//��õ�ǰ�еĿ�ʼ��
					int firestCellNum = row.getFirstCellNum();
					
					//��õ�ǰ�е�����
					int lastCellNum = row.getPhysicalNumberOfCells();
					
					StringBuilder result = new  StringBuilder();
					
					//ѭ����ǰ��
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
			throw new Exception("�ļ�����ȷ��");
		}finally {
			is.close();
		}
		
		
		
		return students;
	}
}
