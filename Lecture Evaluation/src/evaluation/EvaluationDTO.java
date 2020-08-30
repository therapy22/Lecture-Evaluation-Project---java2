package evaluation;

public class EvaluationDTO {
	
	int evaluationID;
	String userID;
	String lectureName;
	String professorName;
	int lectureYear;
	String semesterDivide;
	String lectureDivide;
	String evaluationTitle;
	String evaluationContent;
	String totalScore;
	String creditScore;
	String confortableScore;
	String lectureScore;
	int likeCount;
	
	public EvaluationDTO() {
	}
	
	public EvaluationDTO(int evaluationID, String userID, String lectureName, String projessorName, int lectureYear,
			String semesterDivide, String lectureDivide, String evaluationTitle, String evaluationContent,
			String totalScore, String creidtScore, String confortableScore, String lectureScore, int likeCount) {
		super();
		this.evaluationID = evaluationID;
		this.userID = userID;
		this.lectureName = lectureName;
		this.professorName = projessorName;
		this.lectureYear = lectureYear;
		this.semesterDivide = semesterDivide;
		this.lectureDivide = lectureDivide;
		this.evaluationTitle = evaluationTitle;
		this.evaluationContent = evaluationContent;
		this.totalScore = totalScore;
		this.creditScore = creidtScore;
		this.confortableScore = confortableScore;
		this.lectureScore = lectureScore;
		this.likeCount = likeCount;
	}
	
	public int getEvaluationID() {
		return evaluationID;
	}
	public void setEvaluationID(int evaluationID) {
		this.evaluationID = evaluationID;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getLectureName() {
		return lectureName;
	}
	public void setLectureName(String lectureName) {
		this.lectureName = lectureName;
	}
	public String getProjessorName() {
		return professorName;
	}
	public void setProjessorName(String projessorName) {
		this.professorName = projessorName;
	}
	public int getLectureYear() {
		return lectureYear;
	}
	public void setLectureYear(int lectureYear) {
		this.lectureYear = lectureYear;
	}
	public String getSemesterDivide() {
		return semesterDivide;
	}
	public void setSemesterDivide(String semesterDivide) {
		this.semesterDivide = semesterDivide;
	}
	public String getLectureDivide() {
		return lectureDivide;
	}
	public void setLectureDivide(String lectureDivide) {
		this.lectureDivide = lectureDivide;
	}
	public String getEvaluationTitle() {
		return evaluationTitle;
	}
	public void setEvaluationTitle(String evaluationTitle) {
		this.evaluationTitle = evaluationTitle;
	}
	public String getEvaluationContent() {
		return evaluationContent;
	}
	public void setEvaluationContent(String evaluationContent) {
		this.evaluationContent = evaluationContent;
	}
	public String getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(String totalScore) {
		this.totalScore = totalScore;
	}
	public String getCreidtScore() {
		return creditScore;
	}
	public void setCreidtScore(String creidtScore) {
		this.creditScore = creidtScore;
	}
	public String getConfortableScore() {
		return confortableScore;
	}
	public void setConfortableScore(String confortableScore) {
		this.confortableScore = confortableScore;
	}
	public String getLectureScore() {
		return lectureScore;
	}
	public void setLectureScore(String lectureScore) {
		this.lectureScore = lectureScore;
	}
	public int getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	
	
	
}
