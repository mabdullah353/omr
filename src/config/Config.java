package config;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Config {
	public 	String DR,ext,excelname;
	public double markth= 200,quth=55;
	public boolean 	Debug = true,
					extra = true,
					appendlog = true;
	public JsonArray cells,rows;
	public int[][] layout;
	public int firstmark,
		secondmark,
		thirdmark,
		qrcode,
		x0,y0,x1,y1,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,
		q11,q12,q13,q14,q15,q16,q17,q18,q19,q20,
		A,B,C,D,E,F;
	public int[][][] ans = {
			{{2,15,4,17},{4,15,(8-2),(18-1)},{6,(16-1),(10-2),(18-1)},{(10-2),(16-1),(12-2),(18-1)},{(12-2),(16-1),(14-2),(18-1)},{(14-2),(16-1),(16-2),(18-1)}},
			{{2,17,4,19},{(6-2),(18-1),(8-2),(20-1)},{(8-2),(18-1),(10-2),(20-1)},{(10-2),(18-1),(12-2),(20-1)},{(12-2),(18-1),(14-2),(20-1)},{(14-2),(18-1),(16-2),(20-1)}},
			{{(4-2),(20-1),(6-2),(22-1)},{(6-2),(20-1),(8-2),(22-1)},{(8-2),(20-1),(10-2),(22-1)},{(10-2),(20-1),(12-2),(22-1)},{(12-2),(20-1),(14-2),(22-1)},{(14-2),(20-1),(16-2),(22-1)}},
			{{(4-2),(22-1),(6-2),(24-1)},{(6-2),(22-1),(8-2),(24-1)},{(8-2),(22-1),(10-2),(24-1)},{(10-2),(22-1),(12-2),(24-1)},{(12-2),(22-1),(14-2),(24-1)},{(14-2),(22-1),(16-2),(24-1)}},
			{{(4-2),(24-1),(6-2),(26-1)},{(6-2),(24-1),(8-2),(26-1)},{(8-2),(24-1),(10-2),(26-1)},{(10-2),(24-1),(12-2),(26-1)},{(12-2),(24-1),(14-2),(26-1)},{(14-2),(24-1),(16-2),(26-1)}},
			{{(4-2),(26-1),(6-2),(28-1)},{(6-2),(26-1),(8-2),(28-1)},{(8-2),(26-1),(10-2),(28-1)},{(10-2),(26-1),(12-2),(28-1)},{(12-2),(26-1),(14-2),(28-1)},{(14-2),(26-1),(16-2),(28-1)}},
			{{(4-2),(28-1),(6-2),(30-1)},{(6-2),(28-1),(8-2),(30-1)},{(8-2),(28-1),(10-2),(30-1)},{(10-2),(28-1),(12-2),(30-1)},{(12-2),(28-1),(14-2),(30-1)},{(14-2),(28-1),(16-2),(30-1)}},
			{{(4-2),(30-1),(6-2),(32-1)},{(6-2),(30-1),(8-2),(32-1)},{(8-2),(30-1),(10-2),(32-1)},{(10-2),(30-1),(12-2),(32-1)},{(12-2),(30-1),(14-2),(32-1)},{(14-2),(30-1),(16-2),(32-1)}},
			{{(4-2),(32-1),(6-2),(34-1)},{(6-2),(32-1),(8-2),(34-1)},{(8-2),(32-1),(10-2),(34-1)},{(10-2),(32-1),(12-2),(34-1)},{(12-2),(32-1),(14-2),(34-1)},{(14-2),(32-1),(16-2),(34-1)}},
			{{(4-2),(34-1),(6-2),(36-1)},{(6-2),(34-1),(8-2),(36-1)},{(8-2),(34-1),(10-2),(36-1)},{(10-2),(34-1),(12-2),(36-1)},{(12-2),(34-1),(14-2),(36-1)},{(14-2),(34-1),(16-2),(36-1)}},
			{{(4-2),(36-1),(6-2),(38-1)},{(6-2),(36-1),(8-2),(38-1)},{(8-2),(36-1),(10-2),(38-1)},{(10-2),(36-1),(12-2),(38-1)},{(12-2),(36-1),(14-2),(38-1)},{(14-2),(36-1),(16-2),(38-1)}},
			{{(4-2),(38-1),(6-2),(40-1)},{(6-2),(38-1),(8-2),(40-1)},{(8-2),(38-1),(10-2),(40-1)},{(10-2),(38-1),(12-2),(40-1)},{(12-2),(38-1),(14-2),(40-1)},{(14-2),(38-1),(16-2),(40-1)}},
			{{(4-2),(40-1),(6-2),(42-1)},{(6-2),(40-1),(8-2),(42-1)},{(8-2),(40-1),(10-2),(42-1)},{(10-2),(40-1),(12-2),(42-1)},{(12-2),(40-1),(14-2),(42-1)},{(14-2),(40-1),(16-2),(42-1)}},
			{{(4-2),(42-1),(6-2),(44-1)},{(6-2),(42-1),(8-2),(44-1)},{(8-2),(42-1),(10-2),(44-1)},{(10-2),(42-1),(12-2),(44-1)},{(12-2),(42-1),(14-2),(44-1)},{(14-2),(42-1),(16-2),(44-1)}},
			{{(4-2),(44-1),(6-2),(46-1)},{(6-2),(44-1),(8-2),(46-1)},{(8-2),(44-1),(10-2),(46-1)},{(10-2),(44-1),(12-2),(46-1)},{(12-2),(44-1),(14-2),(46-1)},{(14-2),(44-1),(16-2),(46-1)}},
			{{(4-2),(46-1),(6-2),(48-1)},{(6-2),(46-1),(8-2),(48-1)},{(8-2),(46-1),(10-2),(48-1)},{(10-2),(46-1),(12-2),(48-1)},{(12-2),(46-1),(14-2),(48-1)},{(14-2),(46-1),(16-2),(48-1)}},
			{{(4-2),(48-1),(6-2),(50-1)},{(6-2),(48-1),(8-2),(50-1)},{(8-2),(48-1),(10-2),(50-1)},{(10-2),(48-1),(12-2),(50-1)},{(12-2),(48-1),(14-2),(50-1)},{(14-2),(48-1),(16-2),(50-1)}},
			{{(4-2),(50-1),(6-2),(52-1)},{(6-2),(50-1),(8-2),(52-1)},{(8-2),(50-1),(10-2),(52-1)},{(10-2),(50-1),(12-2),(52-1)},{(12-2),(50-1),(14-2),(52-1)},{(14-2),(50-1),(16-2),(52-1)}},
			{{(4-2),(52-1),(6-2),(54-1)},{(6-2),(52-1),(8-2),(54-1)},{(8-2),(52-1),(10-2),(54-1)},{(10-2),(52-1),(12-2),(54-1)},{(12-2),(52-1),(14-2),(54-1)},{(14-2),(52-1),(16-2),(54-1)}},
			{{(4-2),(54-1),(6-2),(56-1)},{(6-2),(54-1),(8-2),(56-1)},{(8-2),(54-1),(10-2),(56-1)},{(10-2),(54-1),(12-2),(56-1)},{(12-2),(54-1),(14-2),(56-1)},{(14-2),(54-1),(16-2),(56-1)}},
		
			{{25-2,(16-1),27-2,(18-1)},{27-2,(16-1),29-2,(18-1)},{29-2,(16-1),31-2,(18-1)},{31-2,(16-1),33-2,(18-1)},{33-2,(16-1),35-2,(18-1)},{35-2,(16-1),37-2,(18-1)}},
			{{25-2,(18-1),27-2,(20-1)},{27-2,(18-1),29-2,(20-1)},{29-2,(18-1),31-2,(20-1)},{31-2,(18-1),33-2,(20-1)},{33-2,(18-1),35-2,(20-1)},{35-2,(18-1),37-2,(20-1)}},
			{{25-2,(20-1),27-2,(22-1)},{27-2,(20-1),29-2,(22-1)},{29-2,(20-1),31-2,(22-1)},{31-2,(20-1),33-2,(22-1)},{33-2,(20-1),35-2,(22-1)},{35-2,(20-1),37-2,(22-1)}},
			{{25-2,(22-1),27-2,(24-1)},{27-2,(22-1),29-2,(24-1)},{29-2,(22-1),31-2,(24-1)},{31-2,(22-1),33-2,(24-1)},{33-2,(22-1),35-2,(24-1)},{35-2,(22-1),37-2,(24-1)}},
			{{25-2,(24-1),27-2,(26-1)},{27-2,(24-1),29-2,(26-1)},{29-2,(24-1),31-2,(26-1)},{31-2,(24-1),33-2,(26-1)},{33-2,(24-1),35-2,(26-1)},{35-2,(24-1),37-2,(26-1)}},
			{{25-2,(26-1),27-2,(28-1)},{27-2,(26-1),29-2,(28-1)},{29-2,(26-1),31-2,(28-1)},{31-2,(26-1),33-2,(28-1)},{33-2,(26-1),35-2,(28-1)},{35-2,(26-1),37-2,(28-1)}},
			{{25-2,(28-1),27-2,(30-1)},{27-2,(28-1),29-2,(30-1)},{29-2,(28-1),31-2,(30-1)},{31-2,(28-1),33-2,(30-1)},{33-2,(28-1),35-2,(30-1)},{35-2,(28-1),37-2,(30-1)}},
			{{25-2,(30-1),27-2,(32-1)},{27-2,(30-1),29-2,(32-1)},{29-2,(30-1),31-2,(32-1)},{31-2,(30-1),33-2,(32-1)},{33-2,(30-1),35-2,(32-1)},{35-2,(30-1),37-2,(32-1)}},
			{{25-2,(32-1),27-2,(34-1)},{27-2,(32-1),29-2,(34-1)},{29-2,(32-1),31-2,(34-1)},{31-2,(32-1),33-2,(34-1)},{33-2,(32-1),35-2,(34-1)},{35-2,(32-1),37-2,(34-1)}},
			{{25-2,(34-1),27-2,(36-1)},{27-2,(34-1),29-2,(36-1)},{29-2,(34-1),31-2,(36-1)},{31-2,(34-1),33-2,(36-1)},{33-2,(34-1),35-2,(36-1)},{35-2,(34-1),37-2,(36-1)}},
			{{25-2,(36-1),27-2,(38-1)},{27-2,(36-1),29-2,(38-1)},{29-2,(36-1),31-2,(38-1)},{31-2,(36-1),33-2,(38-1)},{33-2,(36-1),35-2,(38-1)},{35-2,(36-1),37-2,(38-1)}},
			{{25-2,(38-1),27-2,(40-1)},{27-2,(38-1),29-2,(40-1)},{29-2,(38-1),31-2,(40-1)},{31-2,(38-1),33-2,(40-1)},{33-2,(38-1),35-2,(40-1)},{35-2,(38-1),37-2,(40-1)}},
			{{25-2,(40-1),27-2,(42-1)},{27-2,(40-1),29-2,(42-1)},{29-2,(40-1),31-2,(42-1)},{31-2,(40-1),33-2,(42-1)},{33-2,(40-1),35-2,(42-1)},{35-2,(40-1),37-2,(42-1)}},
			{{25-2,(42-1),27-2,(44-1)},{27-2,(42-1),29-2,(44-1)},{29-2,(42-1),31-2,(44-1)},{31-2,(42-1),33-2,(44-1)},{33-2,(42-1),35-2,(44-1)},{35-2,(42-1),37-2,(44-1)}},
			{{25-2,(44-1),27-2,(46-1)},{27-2,(44-1),29-2,(46-1)},{29-2,(44-1),31-2,(46-1)},{31-2,(44-1),33-2,(46-1)},{33-2,(44-1),35-2,(46-1)},{35-2,(44-1),37-2,(46-1)}},
			{{25-2,(46-1),27-2,(48-1)},{27-2,(46-1),29-2,(48-1)},{29-2,(46-1),31-2,(48-1)},{31-2,(46-1),33-2,(48-1)},{33-2,(46-1),35-2,(48-1)},{35-2,(46-1),37-2,(48-1)}},
			{{25-2,(48-1),27-2,(50-1)},{27-2,(48-1),29-2,(50-1)},{29-2,(48-1),31-2,(50-1)},{31-2,(48-1),33-2,(50-1)},{33-2,(48-1),35-2,(50-1)},{35-2,(48-1),37-2,(50-1)}},
			{{25-2,(50-1),27-2,(52-1)},{27-2,(50-1),29-2,(52-1)},{29-2,(50-1),31-2,(52-1)},{31-2,(50-1),33-2,(52-1)},{33-2,(50-1),35-2,(52-1)},{35-2,(50-1),37-2,(52-1)}},
			{{25-2,(52-1),27-2,(54-1)},{27-2,(52-1),29-2,(54-1)},{29-2,(52-1),31-2,(54-1)},{31-2,(52-1),33-2,(54-1)},{33-2,(52-1),35-2,(54-1)},{35-2,(52-1),37-2,(54-1)}},
			{{25-2,(54-1),27-2,(56-1)},{27-2,(54-1),29-2,(56-1)},{29-2,(54-1),31-2,(56-1)},{31-2,(54-1),33-2,(56-1)},{33-2,(54-1),35-2,(56-1)},{35-2,(54-1),37-2,(56-1)}}
	};
	public JsonObject grid;
	public Config(){
		DR="/";
		ext=".xls";
		excelname = "results";
		x0 = firstmark	=0;
		y0 = secondmark	=1;
		x1 = thirdmark	=2;
		y1 = qrcode		=3;
		setAns();
		grid = new JsonObject();
		setgrid();
	}
	public void setgrid(){
		String seq = "{\"0\":{\"A\":{\"x\":0,\"y\":0},\"B\":{\"x\":1,\"y\":0},\"C\":{\"x\":2,\"y\":0},\"D\":{\"x\":3,\"y\":0},\"E\":{\"x\":4,\"y\":0},\"F\":{\"x\":5,\"y\":0}},\"1\":{\"A\":{\"x\":0,\"y\":1},\"B\":{\"x\":1,\"y\":1},\"C\":{\"x\":2,\"y\":1},\"D\":{\"x\":3,\"y\":1},\"E\":{\"x\":4,\"y\":1},\"F\":{\"x\":5,\"y\":1}},\"2\":{\"A\":{\"x\":0,\"y\":2},\"B\":{\"x\":1,\"y\":2},\"C\":{\"x\":2,\"y\":2},\"D\":{\"x\":3,\"y\":2},\"E\":{\"x\":4,\"y\":2},\"F\":{\"x\":5,\"y\":2}},\"3\":{\"A\":{\"x\":0,\"y\":3},\"B\":{\"x\":1,\"y\":3},\"C\":{\"x\":2,\"y\":3},\"D\":{\"x\":3,\"y\":3},\"E\":{\"x\":4,\"y\":3},\"F\":{\"x\":5,\"y\":3}},\"4\":{\"A\":{\"x\":0,\"y\":4},\"B\":{\"x\":1,\"y\":4},\"C\":{\"x\":2,\"y\":4},\"D\":{\"x\":3,\"y\":4},\"E\":{\"x\":4,\"y\":4},\"F\":{\"x\":5,\"y\":4}},\"5\":{\"A\":{\"x\":0,\"y\":5},\"B\":{\"x\":1,\"y\":5},\"C\":{\"x\":2,\"y\":5},\"D\":{\"x\":3,\"y\":5},\"E\":{\"x\":4,\"y\":5},\"F\":{\"x\":5,\"y\":5}},\"6\":{\"A\":{\"x\":0,\"y\":6},\"B\":{\"x\":1,\"y\":6},\"C\":{\"x\":2,\"y\":6},\"D\":{\"x\":3,\"y\":6},\"E\":{\"x\":4,\"y\":6},\"F\":{\"x\":5,\"y\":6}},\"7\":{\"A\":{\"x\":0,\"y\":7},\"B\":{\"x\":1,\"y\":7},\"C\":{\"x\":2,\"y\":7},\"D\":{\"x\":3,\"y\":7},\"E\":{\"x\":4,\"y\":7},\"F\":{\"x\":5,\"y\":7}},\"8\":{\"A\":{\"x\":0,\"y\":8},\"B\":{\"x\":1,\"y\":8},\"C\":{\"x\":2,\"y\":8},\"D\":{\"x\":3,\"y\":8},\"E\":{\"x\":4,\"y\":8},\"F\":{\"x\":5,\"y\":8}},\"9\":{\"A\":{\"x\":0,\"y\":9},\"B\":{\"x\":1,\"y\":9},\"C\":{\"x\":2,\"y\":9},\"D\":{\"x\":3,\"y\":9},\"E\":{\"x\":4,\"y\":9},\"F\":{\"x\":5,\"y\":9}},\"10\":{\"A\":{\"x\":0,\"y\":10},\"B\":{\"x\":1,\"y\":10},\"C\":{\"x\":2,\"y\":10},\"D\":{\"x\":3,\"y\":10},\"E\":{\"x\":4,\"y\":10},\"F\":{\"x\":5,\"y\":10}},\"11\":{\"A\":{\"x\":0,\"y\":11},\"B\":{\"x\":1,\"y\":11},\"C\":{\"x\":2,\"y\":11},\"D\":{\"x\":3,\"y\":11},\"E\":{\"x\":4,\"y\":11},\"F\":{\"x\":5,\"y\":11}},\"12\":{\"A\":{\"x\":0,\"y\":12},\"B\":{\"x\":1,\"y\":12},\"C\":{\"x\":2,\"y\":12},\"D\":{\"x\":3,\"y\":12},\"E\":{\"x\":4,\"y\":12},\"F\":{\"x\":5,\"y\":12}},\"13\":{\"A\":{\"x\":0,\"y\":13},\"B\":{\"x\":1,\"y\":13},\"C\":{\"x\":2,\"y\":13},\"D\":{\"x\":3,\"y\":13},\"E\":{\"x\":4,\"y\":13},\"F\":{\"x\":5,\"y\":13}},\"14\":{\"A\":{\"x\":0,\"y\":14},\"B\":{\"x\":1,\"y\":14},\"C\":{\"x\":2,\"y\":14},\"D\":{\"x\":3,\"y\":14},\"E\":{\"x\":4,\"y\":14},\"F\":{\"x\":5,\"y\":14}},\"15\":{\"A\":{\"x\":0,\"y\":15},\"B\":{\"x\":1,\"y\":15},\"C\":{\"x\":2,\"y\":15},\"D\":{\"x\":3,\"y\":15},\"E\":{\"x\":4,\"y\":15},\"F\":{\"x\":5,\"y\":15}},\"16\":{\"A\":{\"x\":0,\"y\":16},\"B\":{\"x\":1,\"y\":16},\"C\":{\"x\":2,\"y\":16},\"D\":{\"x\":3,\"y\":16},\"E\":{\"x\":4,\"y\":16},\"F\":{\"x\":5,\"y\":16}},\"17\":{\"A\":{\"x\":0,\"y\":17},\"B\":{\"x\":1,\"y\":17},\"C\":{\"x\":2,\"y\":17},\"D\":{\"x\":3,\"y\":17},\"E\":{\"x\":4,\"y\":17},\"F\":{\"x\":5,\"y\":17}},\"18\":{\"A\":{\"x\":0,\"y\":18},\"B\":{\"x\":1,\"y\":18},\"C\":{\"x\":2,\"y\":18},\"D\":{\"x\":3,\"y\":18},\"E\":{\"x\":4,\"y\":18},\"F\":{\"x\":5,\"y\":18}},\"19\":{\"A\":{\"x\":0,\"y\":19},\"B\":{\"x\":1,\"y\":19},\"C\":{\"x\":2,\"y\":19},\"D\":{\"x\":3,\"y\":19},\"E\":{\"x\":4,\"y\":19},\"F\":{\"x\":5,\"y\":19}},\"20\":{\"A\":{\"x\":6,\"y\":0},\"B\":{\"x\":7,\"y\":0},\"C\":{\"x\":8,\"y\":0},\"D\":{\"x\":9,\"y\":0},\"E\":{\"x\":10,\"y\":0},\"F\":{\"x\":11,\"y\":0}},\"21\":{\"A\":{\"x\":6,\"y\":1},\"B\":{\"x\":7,\"y\":1},\"C\":{\"x\":8,\"y\":1},\"D\":{\"x\":9,\"y\":1},\"E\":{\"x\":10,\"y\":1},\"F\":{\"x\":11,\"y\":1}},\"22\":{\"A\":{\"x\":6,\"y\":2},\"B\":{\"x\":7,\"y\":2},\"C\":{\"x\":8,\"y\":2},\"D\":{\"x\":9,\"y\":2},\"E\":{\"x\":10,\"y\":2},\"F\":{\"x\":11,\"y\":2}},\"23\":{\"A\":{\"x\":6,\"y\":3},\"B\":{\"x\":7,\"y\":3},\"C\":{\"x\":8,\"y\":3},\"D\":{\"x\":9,\"y\":3},\"E\":{\"x\":10,\"y\":3},\"F\":{\"x\":11,\"y\":3}},\"24\":{\"A\":{\"x\":6,\"y\":4},\"B\":{\"x\":7,\"y\":4},\"C\":{\"x\":8,\"y\":4},\"D\":{\"x\":9,\"y\":4},\"E\":{\"x\":10,\"y\":4},\"F\":{\"x\":11,\"y\":4}},\"25\":{\"A\":{\"x\":6,\"y\":5},\"B\":{\"x\":7,\"y\":5},\"C\":{\"x\":8,\"y\":5},\"D\":{\"x\":9,\"y\":5},\"E\":{\"x\":10,\"y\":5},\"F\":{\"x\":11,\"y\":5}},\"26\":{\"A\":{\"x\":6,\"y\":6},\"B\":{\"x\":7,\"y\":6},\"C\":{\"x\":8,\"y\":6},\"D\":{\"x\":9,\"y\":6},\"E\":{\"x\":10,\"y\":6},\"F\":{\"x\":11,\"y\":6}},\"27\":{\"A\":{\"x\":6,\"y\":7},\"B\":{\"x\":7,\"y\":7},\"C\":{\"x\":8,\"y\":7},\"D\":{\"x\":9,\"y\":7},\"E\":{\"x\":10,\"y\":7},\"F\":{\"x\":11,\"y\":7}},\"28\":{\"A\":{\"x\":6,\"y\":8},\"B\":{\"x\":7,\"y\":8},\"C\":{\"x\":8,\"y\":8},\"D\":{\"x\":9,\"y\":8},\"E\":{\"x\":10,\"y\":8},\"F\":{\"x\":11,\"y\":8}},\"29\":{\"A\":{\"x\":6,\"y\":9},\"B\":{\"x\":7,\"y\":9},\"C\":{\"x\":8,\"y\":9},\"D\":{\"x\":9,\"y\":9},\"E\":{\"x\":10,\"y\":9},\"F\":{\"x\":11,\"y\":9}},\"30\":{\"A\":{\"x\":6,\"y\":10},\"B\":{\"x\":7,\"y\":10},\"C\":{\"x\":8,\"y\":10},\"D\":{\"x\":9,\"y\":10},\"E\":{\"x\":10,\"y\":10},\"F\":{\"x\":11,\"y\":10}},\"31\":{\"A\":{\"x\":6,\"y\":11},\"B\":{\"x\":7,\"y\":11},\"C\":{\"x\":8,\"y\":11},\"D\":{\"x\":9,\"y\":11},\"E\":{\"x\":10,\"y\":11},\"F\":{\"x\":11,\"y\":11}},\"32\":{\"A\":{\"x\":6,\"y\":12},\"B\":{\"x\":7,\"y\":12},\"C\":{\"x\":8,\"y\":12},\"D\":{\"x\":9,\"y\":12},\"E\":{\"x\":10,\"y\":12},\"F\":{\"x\":11,\"y\":12}},\"33\":{\"A\":{\"x\":6,\"y\":13},\"B\":{\"x\":7,\"y\":13},\"C\":{\"x\":8,\"y\":13},\"D\":{\"x\":9,\"y\":13},\"E\":{\"x\":10,\"y\":13},\"F\":{\"x\":11,\"y\":13}},\"34\":{\"A\":{\"x\":6,\"y\":14},\"B\":{\"x\":7,\"y\":14},\"C\":{\"x\":8,\"y\":14},\"D\":{\"x\":9,\"y\":14},\"E\":{\"x\":10,\"y\":14},\"F\":{\"x\":11,\"y\":14}},\"35\":{\"A\":{\"x\":6,\"y\":15},\"B\":{\"x\":7,\"y\":15},\"C\":{\"x\":8,\"y\":15},\"D\":{\"x\":9,\"y\":15},\"E\":{\"x\":10,\"y\":15},\"F\":{\"x\":11,\"y\":15}},\"36\":{\"A\":{\"x\":6,\"y\":16},\"B\":{\"x\":7,\"y\":16},\"C\":{\"x\":8,\"y\":16},\"D\":{\"x\":9,\"y\":16},\"E\":{\"x\":10,\"y\":16},\"F\":{\"x\":11,\"y\":16}},\"37\":{\"A\":{\"x\":6,\"y\":17},\"B\":{\"x\":7,\"y\":17},\"C\":{\"x\":8,\"y\":17},\"D\":{\"x\":9,\"y\":17},\"E\":{\"x\":10,\"y\":17},\"F\":{\"x\":11,\"y\":17}},\"38\":{\"A\":{\"x\":6,\"y\":18},\"B\":{\"x\":7,\"y\":18},\"C\":{\"x\":8,\"y\":18},\"D\":{\"x\":9,\"y\":18},\"E\":{\"x\":10,\"y\":18},\"F\":{\"x\":11,\"y\":18}},\"39\":{\"A\":{\"x\":6,\"y\":19},\"B\":{\"x\":7,\"y\":19},\"C\":{\"x\":8,\"y\":19},\"D\":{\"x\":9,\"y\":19},\"E\":{\"x\":10,\"y\":19},\"F\":{\"x\":11,\"y\":19}}}";
		JsonParser parser = new JsonParser();
		grid = (JsonObject) parser.parse(seq);
	}
	public void setLog(String filename,FileHandler fh,Logger logger){
		try {
			fh=new FileHandler("log/log.txt",appendlog);
		} catch (IOException e) {
			e.printStackTrace();
		}
		fh.setFormatter(new SimpleFormatter());
		logger.addHandler(fh);
		logger.setLevel(Level.ALL);
	}

	public void setlayout(int unit,int origx,int origy){
		
		layout = new int[4][4];
		
		layout[firstmark][x0] = 0*unit+origx;
		layout[firstmark][y0] = 0*unit+origy;
		layout[firstmark][x1] = 8*unit+origx;
		layout[firstmark][y1] = 1*unit+origy;
		
		layout[secondmark][x0] = 0*unit+origx;
		layout[secondmark][y0] = 13*unit+origy;
		layout[secondmark][x1] = 8*unit+origx;
		layout[secondmark][y1] = 14*unit+origy;
		/*
		layout[thirdmark][x0] = 27*unit+origx;
		layout[thirdmark][y0] = 55*unit+origy;
		layout[thirdmark][x1] = 35*unit+origx;
		layout[thirdmark][y1] = 56*unit+origy;
		*/
		layout[thirdmark][x0] = 0*unit+origx;
		layout[thirdmark][y0] = 13*unit+origy;
		layout[thirdmark][x1] = 8*unit+origx;
		layout[thirdmark][y1] = 14*unit+origy;
	}
	public void setAns(){
		A=q1=0;
		B=q2=1;
		C=q3=2;
		D=q4=3;
		E=q5=4;
		F=q6=5;
		q7=6;
		q8=7;
		q9=8;
		q10=9;
		q11=10;
		q12=11;
		q13=12;
		q14=13;
		q15=14;
		q16=15;
		q17=16;
		q18=17;
		q19=18;
		q20=19;
		/*ans = new int[20][24][4];
		ans[q1][A][x0]=4; //+u/2
		ans[q1][A][y0]=16;
		ans[q1][A][x1]=6;
		ans[q1][A][y1]=18;//-u/2
		
		ans[q1][B][x0]=6; //+u/2
		ans[q1][B][y0]=16;
		ans[q1][B][x1]=8;
		ans[q1][B][y1]=19;//-u/2

		ans[q1][C][x0]=8; //+u/2
		ans[q1][C][y0]=16;
		ans[q1][C][x1]=10;
		ans[q1][C][y1]=20;//-u/2

		ans[q1][D][x0]=10; //+u/2
		ans[q1][D][y0]=16;
		ans[q1][D][x1]=12;
		ans[q1][D][y1]=21;//-u/2

		ans[q1][E][x0]=12; //+u/2
		ans[q1][E][y0]=16;
		ans[q1][E][x1]=14;
		ans[q1][E][y1]=22;//-u/2

		ans[q1][F][x0]=14; //+u/2
		ans[q1][F][y0]=16;
		ans[q1][F][x1]=16;
		ans[q1][F][y1]=23;//-u/2
		*/
	}
	/*
	public void showQBlueprint(int nu,int unit){
		System.out.println("Q"+(nu+1)+":A option start ("+(ans[nu][A][x0]+1/2)*unit+","+(ans[q][A][y0]*twounit)+") end ("+(ans[q][A][x1]*twounit)+","+(ans[q][A][y1]*twounit-unit)+")");
		System.out.println("Q"+(nu+1)+":B option start ("+(ans[q][B][x0]*twounit+unit)+","+(ans[q][B][y0]*twounit)+") end ("+(ans[q][B][x1]*twounit)+","+(ans[q][B][y1]*twounit-unit)+")");
		System.out.println("Q"+(nu+1)+":C option start ("+(ans[q][C][x0]*twounit+unit)+","+(ans[q][C][y0]*twounit)+") end ("+(ans[q][C][x1]*twounit)+","+(ans[q][C][y1]*twounit-unit)+")");
		System.out.println("Q"+(nu+1)+":D option start ("+(ans[q][D][x0]*twounit+unit)+","+(ans[q][D][y0]*twounit)+") end ("+(ans[q][D][x1]*twounit)+","+(ans[q][D][y1]*twounit-unit)+")");
		System.out.println("Q"+(nu+1)+":E option start ("+(ans[q][E][x0]*twounit+unit)+","+(ans[q][E][y0]*twounit)+") end ("+(ans[q][E][x1]*twounit)+","+(ans[q][E][y1]*twounit-unit)+")");
		System.out.println("Q"+(nu+1)+":F option start ("+(ans[q][F][x0]*twounit+unit)+","+(ans[q][F][y0]*twounit)+") end ("+(ans[q][F][x1]*twounit)+","+(ans[q][F][y1]*twounit-unit)+")");
	}
	*/
	public int getind(int nu,String opt,String axis){
		return grid.get(""+nu).getAsJsonObject().get(opt).getAsJsonObject().get(axis).getAsInt();
	}
}
