public class Shapes{

  public String diamond(int h){
	  String s = tri3((h+1)/2);
	  int r;
	  for(r=(h-1)/2-1; r>=0; r--){
	    for(int i=0; i<h-r-3; i++){
	      s = s + ".";
	    }
	    for(int i=0; i<2*r+1; i++){
		    s = s + "*";
	    }
	    s = s + "\n";
	  }    
    return s;
  }
}
