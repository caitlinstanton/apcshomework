public class Shapes{
	
	//helper function
  public String line(String c, int h){
  	String s ="";
  	for(int i=0; i<h; i++){
  		s = s + c;
  	}
  	return s;
  }
  
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
    	//with helper function 
    	/*
    	for (r=0; r<height; r++){
    		s = s + line(" ",height-r-1);
    		s = s + line("*", 2*r+1);
    		s = s + "\n";
    	}
    	*/
    	}
  }
}
