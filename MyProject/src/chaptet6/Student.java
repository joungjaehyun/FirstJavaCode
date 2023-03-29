package chaptet6;

public class Student {

	// ① 학생이름, 국어점수, 영어점수, 수학점수를 저장하는 변수를 정의 합니다.
	// 변수는 캡슐화를 합니다.
	private String studentName;
	private int korScore;
	private int engScore;
	private int mathScore;
	//초기화
	
	public Student(String studentName, int korScore, int engScore, int mathScore) {
		super();
		this.studentName = studentName;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	// ②  getter/setter 메소드를 정의합니다.

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getKorScore() {
		return korScore;
	}
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	// ③ 총점과 평균을 구해 결과를 반환하는 메소드를 정의합니다.
	public int getSum() {
		return this.engScore + this.korScore + this.mathScore;
	}
	public float getAvg() {
		return (float) getSum()/3;
	}
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", korScore=" + korScore + ", engScore=" + engScore
				+ ", mathScore=" + mathScore + "]";
	}
	
}
