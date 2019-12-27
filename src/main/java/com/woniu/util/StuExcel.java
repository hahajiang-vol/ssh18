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

import com.woniu.pojo.Clazz;
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
			
			for(int rowNum=1;rowNum<=sheet.getLastRowNum();rowNum++) {
				Row row = sheet.getRow(rowNum);
				
				if(row != null) {
					
//					//获得当前行的开始列
//					int firestCellNum = row.getFirstCellNum();
//					
//					//获得当前行的列数
//					int lastCellNum = row.getPhysicalNumberOfCells();
					
					
					//循环当前行
					/*
					 * for (int cellNum = 0; cellNum < lastCellNum; cellNum++) {
					 * 
					 * Cell cell = row.getCell(cellNum);
					 * 
					 * String value = "";
					 * 
					 * if(null!=fe.evaluate(cell)) { value=fe.evaluate(cell).getStringValue(); } }
					 */

					Student stu = rowToStudent(row,fe);
					students.add(stu);
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
	
	private static Student rowToStudent(Row row,FormulaEvaluator fe) {
		Student student = new Student();
		int cellNum=1;
		Cell cell = null;
		//设置学生姓名
		cell = row.getCell(cellNum++);
		if(cell!=null) {
			student.setStudentName(fe.evaluate(cell).getStringValue());
		}
		//设置学生班级
		cell = row.getCell(cellNum++);
		if(cell!=null) {
			Clazz clazz = new Clazz();
			clazz.setClazzId((int)(fe.evaluate(cell).getNumberValue()));
			student.setClazz(clazz);
		}
		//设置学生学号
		cell = row.getCell(cellNum++);
		if(cell!=null) {
			student.setSutdentCode(fe.evaluate(cell).getStringValue());
		}
		//设置学生性别
		cell = row.getCell(cellNum++);
		if(cell!=null) {
			student.setStudentSex(fe.evaluate(cell).getStringValue());
		}
		//设置学生电话
		cell = row.getCell(cellNum++);
		if(cell!=null) {
			cell.setCellType(Cell.CELL_TYPE_STRING);
			student.setStudentPhone(fe.evaluate(cell).getStringValue());
		}
		//设置学生住址
		cell = row.getCell(cellNum++);
		if(cell!=null) {
			student.setStudentAddress(fe.evaluate(cell).getStringValue());
		}
		//设置学生学历
		cell = row.getCell(cellNum++);
		if(cell!=null) {
			student.setStudentEdu(fe.evaluate(cell).getStringValue());
		}
		//设置学生大学
		cell = row.getCell(cellNum++);
		if(cell!=null) {
			student.setStudentCollege(fe.evaluate(cell).getStringValue());
		}
		//设置学生专业
		cell = row.getCell(cellNum++);
		if(cell!=null) {
			student.setStudentProfessional(fe.evaluate(cell).getStringValue());
		}
		//设置学生毕业时间
		cell = row.getCell(cellNum++);
		if(cell!=null) {
			student.setStudentGraduateTime(cell.getDateCellValue());
		}
		
		
		
		return student;
	}
}
