
public class TotalNumberOfdayAssignment {
  public static <Switch> void main(String[]arge){
	  int days= 7;

	  switch(days) {
	  case 1:
	   System.out.println("mon");
	    break;
	  case 2:
	    System.out.println("tue");
	  case 3:
		    System.out.println("wed");
		   break; 
	  case 4:
		    System.out.println("thu");
		    break;
	  case 5:
		    System.out.println("fri");
		    break;
	  case 6:
		    System.out.println("sat");
		    break;
	  case 7:
		    System.out.println("sun");
		    
	    break;
	    default:
	    	System.out.println("invalid day");
	    	break;
	  }
  }

}
