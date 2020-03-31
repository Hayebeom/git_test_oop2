package oop4;
/**
 * 2
 * @author HYB
 *
 */
public class Reporter {
	
	String[] data;
	
	// 교체 품목
	// DataOutput류 객체를 전달받아서 멤버변수 outputter에 담은 메서드
	// DataOutput outputter = new DataOutput();
	// DataOutput outputter = new ConsoleDataOutput();
	DataOutput outputter = new FileDataOutput("c:/files", "데이터.txt");
	
	void setOutputter(DataOutput dataOutput) {
		this.outputter = dataOutput;
	}	
	
	void setData(String[] data) {
		this.data = data;
	}
	
	void reporting() {
		/*
		if (outputter instanceof FileDataOutput) {
			((FileDataOutput) outputter).output(data);
		} else if (outputter instanceof ConsoleDataOutput) {
			((ConsoleDataOutput) outputter).output(data);
		} else if (outputter instanceof DBDataOutput) {
			((DBDataOutput) outputter).output(data);
		} if (outputter instanceof XlsDataOutput) {
			((XlsDataOutput) outputter).output(data);
		}  .... 등등 기능이 많아질수록 추가되는 번거로워짐
		*/
		outputter.output(data);
		// 이거 한줄로 완성
		
	}
	

	
	
}
