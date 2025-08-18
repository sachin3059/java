import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService(){
        questions[0] = new Question(0, "question1", "opt1", "opt2", "opt3", "opt4", "answer0");
        questions[1] = new Question(1, "question2", "opt1", "opt2", "opt3", "opt4", "answer1");
        questions[2] = new Question(2, "question3", "opt1", "opt2", "opt3", "opt4", "answer2");
        questions[3] = new Question(3, "question4", "opt1", "opt2", "opt3", "opt4", "answer3");
        questions[4] = new Question(4, "question5", "opt1", "opt2", "opt3", "opt4", "answer4");
    }

    public void playQuiz(){
        for(Question q: questions){
            System.out.println("Qustion no. " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            Scanner sc = new Scanner(System.in);
            selection[q.getId()] = sc.nextLine();
        }

        for(String s : selection){
            System.out.println(s);
        }
    }
    public static void main(String[] args){

    }

}
