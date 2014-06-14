package helper;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import org.bytedeco.javacpp.opencv_core.CvPoint;

import com.google.gson.JsonArray;

import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import config.Config;

public class Questions extends Config{
	public ArrayList<Question> questions;
	public int total,unit;
	private CvPoint topl,botr;
	private JsonArray cells,rows;
	BufferedImage image;
	Point orig;
	private int avgr;
	/*
	 * Constructors
	 */
	public Questions(int total,int unit,BufferedImage image,Point orig, JsonArray tcols, JsonArray trows,int avgr,CvPoint tl,CvPoint br){
		this.total=total;
		this.unit=unit;
		this.image=image;
		this.orig = orig;
		this.cells = tcols;
		this.rows = trows;
		this.avgr = avgr;
		questions = new ArrayList<Question>(); 
	}
	/*
	 * Methods
	 */
	public void addQuestion(int number,int options,String imgname){
		Question q = new Question(number, options, image,imgname, unit,orig,cells,rows,avgr);
		questions.add(q);
	}
	public void addAllQuestions(int[] options,String imgname){
		for (int i = 0; i < total; i++) {
			questions.add(new Question(i, options[i], image, imgname, unit, orig,cells,rows,avgr));
		}
	}
	public Question getQuestion(int q){
		return questions.get(q);
	}
	public String[] getAllOptions(){
		int listsize = questions.size();
		String[] ret = new String[listsize];
		for(int i=0; i<listsize; i++){
			ret[i]=questions.get(i).getResult();
		}
		return ret;
	}
	public void genExcel(WritableSheet sheets){
		String[] selecOpt = getAllOptions();
		Question currque;
		for (int i = 0; i < total; i++) {
			currque = getQuestion(i);
			Label label = new Label(i, 0, "Question "+currque.nu); 
			Label number = new Label(i, 1, selecOpt[i]); 
			try {
				sheets.addCell(label);
				sheets.addCell(number);
			} catch (RowsExceededException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (WriteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public String[] getGrades(){
		return getAllOptions();
	}
}
