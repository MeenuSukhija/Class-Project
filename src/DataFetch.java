
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
     public class DataFetch extends SelectData{
		
			public void Insert(String product_name,String productprice) throws InterruptedException, SQLException, ClassNotFoundException{
	    
			Connection con=JDBCConnection.getConnection();
	   
			String insertFristData="insert into productinfo values(?,?)";
			PreparedStatement insertQuerryExcute=con.prepareStatement(insertFristData);
			insertQuerryExcute.setString(1, product_name);
			insertQuerryExcute.setString(2, productprice);
			
			int excutequerry=insertQuerryExcute.executeUpdate();
	 		    if(excutequerry>0) {
	 				System.out.println("insertion is done");
	 			}
	 			else {
	 				System.out.println("insertion is not done");
	 			}
	 				
	 		   insertQuerryExcute.close();	 
	     }
	}