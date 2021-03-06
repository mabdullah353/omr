package config;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Config {
	public 	String DR,ext;
	public double markth= 200,quth=240;
	public boolean 	Debug = true,
					extra = true,
					appendlog = false;
	public int[][] layout;
	//public int[][][] ans;
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
		
		{{25,16,27,18},{27,16,29,18},{29,16,31,18},{31,16,34,18},{34,16,36,18},{36,16,38,18}},
		{{25,18,27,20},{27,18,29,20},{29,18,31,20},{31,18,34,20},{34,18,36,20},{36,18,38,20}},
		{{25,20,27,22},{27,20,29,22},{29,20,31,22},{31,20,34,22},{34,20,36,22},{36,20,38,22}},
		{{25,22,27,24},{27,22,29,24},{29,22,31,24},{31,22,34,24},{34,22,36,24},{36,22,38,24}},
		{{25,24,27,26},{27,24,29,26},{29,24,31,26},{31,24,34,26},{34,24,36,26},{36,24,38,26}},
		{{25,26,27,28},{27,26,29,28},{29,26,31,28},{31,26,34,28},{34,26,36,28},{36,26,38,28}},
		{{25,28,27,30},{27,28,29,30},{29,28,31,30},{31,28,34,30},{34,28,36,30},{36,28,38,30}},
		{{25,30,27,32},{27,30,29,32},{29,30,31,32},{31,30,34,32},{34,30,36,32},{36,30,38,32}},
		{{25,32,27,34},{27,32,29,34},{29,32,31,34},{31,32,34,34},{34,32,36,34},{36,32,38,34}},
		{{25,34,27,36},{27,34,29,36},{29,34,31,36},{31,34,34,36},{34,34,36,36},{36,34,38,36}},
		{{25,36,27,38},{27,36,29,38},{29,36,31,38},{31,36,34,38},{34,36,36,38},{36,36,38,38}},
		{{25,38,27,40},{27,38,29,40},{29,38,31,40},{31,38,34,40},{34,38,36,40},{36,38,38,40}},
		{{25,40,27,42},{27,40,29,42},{29,40,31,42},{31,40,34,42},{34,40,36,42},{36,40,38,42}},
		{{25,42,27,44},{27,42,29,44},{29,42,31,44},{31,42,34,44},{34,42,36,44},{36,42,38,44}},
		{{25,44,27,46},{27,44,29,46},{29,44,31,46},{31,44,34,46},{34,44,36,46},{36,44,38,46}},
		{{25,46,27,48},{27,46,29,48},{29,46,31,48},{31,46,34,48},{34,46,36,48},{36,46,38,48}},
		{{25,48,27,50},{27,48,29,50},{29,48,31,50},{31,48,34,50},{34,48,36,50},{36,48,38,50}},
		{{25,50,27,52},{27,50,29,52},{29,50,31,52},{31,50,34,52},{34,50,36,52},{36,50,38,52}},
		{{25,52,27,54},{27,52,29,54},{29,52,31,54},{31,52,34,54},{34,52,36,54},{36,52,38,54}},
		{{25,54,27,56},{27,54,29,56},{29,54,31,56},{31,54,34,56},{34,54,36,56},{36,54,38,56}}
	};
	public Config(){
		DR="/";
		ext=".xls";
		x0 = firstmark	=0;
		y0 = secondmark	=1;
		x1 = thirdmark	=2;
		y1 = qrcode		=3;
		setAns();
	}
	public void setLog(String filename,FileHandler fh,Logger logger){
		try {
			fh=new FileHandler("log/"+filename+".log",appendlog);
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
		
		layout[thirdmark][x0] = 27*unit+origx;
		layout[thirdmark][y0] = 55*unit+origy;
		layout[thirdmark][x1] = 35*unit+origx;
		layout[thirdmark][y1] = 56*unit+origy;
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
}
