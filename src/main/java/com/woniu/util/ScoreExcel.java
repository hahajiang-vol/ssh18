package com.woniu.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.woniu.pojo.Score;
import com.woniu.pojo.Student;

public class ScoreExcel {
	
	public static List<Score> readExcel(File file) throws Exception{
		List<Score> scores = new ArrayList<Score>();
		InputStream inStream = null;
		
		try {
			if(file==null) {
				throw new IOException("===============================文件不能为空!");
			}
			inStream = new FileInputStream(file);
			
			Workbook workbook = WorkbookFactory.create(inStream);
			FormulaEvaluator fe = workbook.getCreationHelper().createFormulaEvaluator();
			
			Sheet sheet = workbook.getSheetAt(0);
			
			if(sheet==null) {
				throw new IOException("===================传入的第一张表为空!");
			}
			
			for(int rowNum=1;rowNum<=sheet.getLastRowNum();rowNum++) {
				
				Row row = sheet.getRow(rowNum);
				if(row!=null) {
					
					System.out.println(row);
					Score sco = rowToScore(row, fe);
					
					System.out.println("addqian");
					scores.add(sco);
					
					System.out.println("addhou");
				}
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("===========文件不正确！");
		}finally {
			inStream.close();
		}
		return scores;
	}
	
	
	public static Score rowToScore(Row row,FormulaEvaluator fe) {
		Score score = new Score();
		int cellNum = 1;//
		Cell cell = null;
		
		cell = row.getCell(cellNum++);//设置分数对应学生id
		
		if(cell!=null) {
			Student stu = new Student() ;
			stu.setStudentId((int)fe.evaluate(cell).getNumberValue());
			score.setStudent(stu);
			
		}
		System.out.println("1111");
		cell = row.getCell(cellNum++);//设置分数
		System.out.println(cell);
		if(cell!=null) {
			score.setScoreNum(fe.evaluate(cell).getNumberValue());
		}
		score.setScoreDate(new Date());
		
		
		return score;
	}
	

}
