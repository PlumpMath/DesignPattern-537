package prototype;

public class DameTeacher {

	    public Paper[] createManyCrystals(){
	        Paper[] papers = new Paper[100];
	        
	        //遅い処理を何度も繰り返す
	        for(int n=0; n<papers.length ; n++){
	            drawCrystal(papers[n]);  // 時間がかかる
	            cutAccordanceWithLine(papers[n]);// 時間がかかる
	        }
	        return papers;
	    }
	    private void drawCrystal(Paper paper){
	        // きれいに描くため時間がかかる
	    }
	    private void cutAccordanceWithLine(Paper paper){
	        // 描かれた線に沿ってきれいに切るには時間がかかる
	    }
	
}
