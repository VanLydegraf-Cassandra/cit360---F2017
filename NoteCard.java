package hibernateexample;
// Generated Nov 17, 2017 1:31:58 PM by Hibernate Tools 4.3.1



/**
 * NoteCard generated by hbm2java
 */
public class NoteCard  implements java.io.Serializable {


     private Integer noteCardId;
     private String noteCardQuestion;
     private String noteCardAnswer;

    public NoteCard() {
    }

    public NoteCard(String noteCardQuestion, String noteCardAnswer) {
       this.noteCardQuestion = noteCardQuestion;
       this.noteCardAnswer = noteCardAnswer;
    }
   
    public Integer getNoteCardId() {
        return this.noteCardId;
    }
    
    public void setNoteCardId(Integer noteCardId) {
        this.noteCardId = noteCardId;
    }
    public String getNoteCardQuestion() {
        return this.noteCardQuestion;
    }
    
    public void setNoteCardQuestion(String noteCardQuestion) {
        this.noteCardQuestion = noteCardQuestion;
    }
    public String getNoteCardAnswer() {
        return this.noteCardAnswer;
    }
    
    public void setNoteCardAnswer(String noteCardAnswer) {
        this.noteCardAnswer = noteCardAnswer;
    }




}


