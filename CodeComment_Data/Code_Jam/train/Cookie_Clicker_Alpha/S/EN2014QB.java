package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1381;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EN2014QB {
	public static void main(String[] args) {
		File inputFile = new File("c:/tmp/B-small-attempt0.in");
		File outputFile = new File("c:/tmp/B-small-attempt0.out");
		FileReader filereader = null;
		BufferedReader br = null;
		FileWriter filewriter = null;
		BufferedWriter bw = null;

		try {
			// ??????
			filereader = new FileReader(inputFile);
			br = new BufferedReader(filereader);

			// ??????
			filewriter = new FileWriter(outputFile);
			bw = new BufferedWriter(filewriter);

			/**************************************************************************************
			// ????????????????????????????????????
			 **************************************************************************************/
			int T;

			// ???????????????????????????
			String lineStr = br.readLine();
			T = Integer.parseInt(lineStr);
			System.out.println("T = " + T + "\n");

			/**************************************************************************************
			// Case???1???????????????
			 **************************************************************************************/
			long caseIndex = 1;
			for(int t=0; t < T; t++) {
				/**************************************************************************************
				// Case?????????
				 **************************************************************************************/
				// ??????
				String caseAnser = null;

				lineStr = br.readLine();
				String line[] = lineStr.split(" ");
				double C = Double.parseDouble(line[0]);
				double F = Double.parseDouble(line[1]);
				double X = Double.parseDouble(line[2]);
				
				System.out.println("C = " + C + ", " + "F = " + F + ", " + "X = " + X);
				
				// C???????????????????????????farm?????????????????????X??????????????????????????????????????????
				// ??????????????????(X-C)/(nF+2)
				// farm????????????(X)/(nF+F+2)
				// ?????????????????????????????????????????????????????????
				// (X-C)/(nF+2) < (X)/(nF+F+2)
				// n > (XF-CF-2C)/CF			
				double x = (X*F-C*F-2*C)/(C*F);
				if(x < 0){
					x = 0.0;
				}
				System.out.println("x = " + x);
				
				// ?????????????????????????????????
				int n = (int)Math.ceil(x);
				System.out.println("n = " + n);	
				
				// n???farm?????????
				double totalTime = 0.0;
				for(int i=0; i < n; i++){
					// C??????????????????????????????
					double time = C/(2+i*F);
					totalTime = totalTime + time;
//					System.out.println("time = " + time + ", total time = " + totalTime);
				}
				// ????????????X??????????????????????????????
				double time = X/(2+n*F);
				totalTime = totalTime + time;
//				System.out.println("time = " + time + ", total time = " + totalTime);
				
				caseAnser = String.format("%.7f", totalTime);
				
				/**************************************************************************************
				// Case?????????
				 **************************************************************************************/
				String output = "Case #" + caseIndex + ": " + caseAnser;
				caseIndex++;
				System.out.println(output);
				bw.write(output);
				bw.newLine();
				bw.flush();

				/**************************************************************************************
				// ??????Case???????????????
				 **************************************************************************************/
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				if (filereader != null) {
					filereader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				if (bw != null) {
					bw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				if (filewriter != null) {
					filewriter.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
