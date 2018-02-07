/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oreganTrail.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Randy Beckford
 */
public class Question implements Serializable{
    
    private String question;
    private String answer;
    private ArrayList<QuestionScene> questionScenes = new ArrayList<QuestionScene>();
    

    public Question() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public ArrayList<QuestionScene> getQuestionScenes() {
        return questionScenes;
    }

    public void setQuestionScenes(ArrayList<QuestionScene> questionScenes) {
        this.questionScenes = questionScenes;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.question);
        hash = 61 * hash + Objects.hashCode(this.answer);
        hash = 61 * hash + Objects.hashCode(this.questionScenes);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Question other = (Question) obj;
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        if (!Objects.equals(this.answer, other.answer)) {
            return false;
        }
        if (!Objects.equals(this.questionScenes, other.questionScenes)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Question{" + "question=" + question + ", answer=" + answer + ", questionScenes=" + questionScenes + '}';
    }
    
    
    
}
