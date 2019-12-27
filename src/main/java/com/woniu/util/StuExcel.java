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
			
			for(int rowNum=1;rowNum<=sheet.getLastRowNum();rowNum++) {
				Row row = sheet.getRow(rowNum);
				
				if(row != null) {
					
//					//��õ�ǰ�еĿ�ʼ��
//					int firestCellNum = row.getFirstCellNum();
//					
//					//��õ�ǰ�е�����
//					int lastCellNum = row.getPhysicalNumberOfCells();
					
					
					//ѭ����ǰ��
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
			throw new Exception("�ļ�����ȷ��");
		}finally {
			is.close();
		}
		return students;
	}
	
	private static Student rowToStudent(Row row,FormulaEvaluator fe) {
		Student student = new Student();
		int cellNum=1;
		Cell cell = null;
		//����ѧ������
		cell = row.getCell(cellNum++);
		if(cell!=null) {
			student.setStudentName(fe.evaluate(cell).getStringValue());
		}
		//����ѧ���༶
		cell = row.getCell(cellNum++);
		if(cell!=null) {
			Clazz clazz = new Clazz();
			clazz.setClazzId((int)(fe.evaluate(cell).getNumberValue()));
			student.setClazz(clazz);
		}
		//����ѧ��ѧ��
		cell = row.getCell(cellNum++);
		if(cell!=null) {
			student.setSutdentCode(fe.evaluate(cell).getStringValue());
		}
		//����ѧ���Ա�
		cell = row.getCell(cellNum++);
		if(cell!=null) {
			student.setStudentSex(fe.evaluate(cell).getStringValue());
		}
		//����ѧ���绰
		cell = row.getCell(cellNum++);
		if(cell!=null) {
			cell.setCellType(Cell.CELL_TYPE_STRING);
			student.setStudentPhone(fe.evaluate(cell).getStringValue());
		}
		//����ѧ��סַ
		cell = row.getCell(cellNum++);
		if(cell!=null) {
			student.setStudentAddress(fe.evaluate(cell).getStringValue());
		}
		//����ѧ��ѧ��
		cell = row.getCell(cellNum++);
		if(cell!=null) {
			student.setStudentEdu(fe.evaluate(cell).getStringValue());
		}
		//����ѧ����ѧ
		cell = row.getCell(cellNum++);
		if(cell!=null) {
			student.setStudentCollege(fe.evaluate(cell).getStringValue());
		}
		//����ѧ��רҵ
		cell = row.getCell(cellNum++);
		if(cell!=null) {
			student.setStudentProfessional(fe.evaluate(cell).getStringValue());
		}
		//����ѧ����ҵʱ��
		cell = row.getCell(cellNum++);
		if(cell!=null) {
			student.setStudentGraduateTime(cell.getDateCellValue());
		}
		
		
		
		return student;
	}
}
