package my_class;

public class Problem {
	
	private int problem_id;
	private String problem_name;
    private	int solved_by;
	private String description;
	private String answer;
	
	
	public Problem(int problem_id, String problem_name, int solved_by, String description, String answer) {
		super();
		this.problem_id = problem_id;
		this.problem_name = problem_name;
		this.solved_by = solved_by;
		this.description = description;
		this.answer=answer;
	}
	
	

	public String getAnswer() {
		return answer;
	}



	public void setAnswer(String answer) {
		this.answer = answer;
	}



	public int getProblem_id() {
		return problem_id;
	}
	public void setProblem_id(int problem_id) {
		this.problem_id = problem_id;
	}
	public String getProblem_name() {
		return problem_name;
	}
	public void setProblem_name(String problem_name) {
		this.problem_name = problem_name;
	}
	public int getSolved_by() {
		return solved_by;
	}
	public void setSolved_by(int solved_by) {
		this.solved_by = solved_by;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
	

}
