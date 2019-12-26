package com.woniu.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.woniu.pojo.Score;

public class ScoreExcel {
	
	public static List<Score> readExcel(File file) throws Exception{
		List<Score> scores = new ArrayList<Score>();
		InputStream inStream = null;
		
		try {
			if(file==null) {
				throw new IOException("�ļ�����Ϊ��!");
			}
			
			inStream = new FileInputStream(file);
			
			Workbook workbook = WorkbookFactory.create(inStream);
			FormulaEvaluator fe = workbook.getCreationHelper().createFormulaEvaluator();
			
			Sheet sheet = workbook.getSheetAt(0);
			if(sheet==null) {
				throw new IOException("����ĵ�һ�ű�Ϊ��!");
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
	}

}
