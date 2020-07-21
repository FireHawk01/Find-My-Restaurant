import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import java.util.Scanner;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
    
class FindMyRestaurant extends javax.swing.JFrame {

    private JLabel label;

 
    /**
     * Creates new form NewJFrame2
     **/
     public FindMyRestaurant() {
       
       getContentPane().setBackground(new java.awt.Color(0,0,0));
        
        initComponents();
        
    }
    @SuppressWarnings("unchecked")                          
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 51));
        getContentPane().setLayout(null);

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 255, 255)), "ENTER YOUR CITY HERE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Elephant", 0, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(20, 20, 340, 80);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("GO");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(110, 130, 150, 50);

        jLabel1.setBackground(new java.awt.Color(255, 51, 255));
        jLabel1.setFont(new java.awt.Font("Constantia", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(480, 80, 450, 30);

        jLabel2.setBackground(new java.awt.Color(51, 255, 102));
        jLabel2.setFont(new java.awt.Font("Constantia", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(490, 110, 460, 30);

        jLabel3.setFont(new java.awt.Font("Constantia", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(490, 140, 360, 40);

        jLabel4.setFont(new java.awt.Font("Constantia", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(490, 180, 1340, 40);

        jLabel5.setFont(new java.awt.Font("Constantia", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(480, 260, 520, 40);

        jLabel6.setFont(new java.awt.Font("Constantia", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(490, 300, 1050, 40);

        jLabel7.setFont(new java.awt.Font("Constantia", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(490, 340, 1060, 40);

        jLabel8.setFont(new java.awt.Font("Constantia", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(490, 380, 1330, 40);

        jLabel9.setFont(new java.awt.Font("Constantia", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel9);
        jLabel9.setBounds(480, 460, 1100, 40);

        jLabel10.setFont(new java.awt.Font("Constantia", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(490, 500, 1100, 40);

        jLabel11.setFont(new java.awt.Font("Constantia", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel11);
        jLabel11.setBounds(490, 540, 1100, 40);

        jLabel12.setFont(new java.awt.Font("Constantia", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel12);
        jLabel12.setBounds(490, 580, 1330, 40);

        jLabel13.setFont(new java.awt.Font("Constantia", 3, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel13);
        jLabel13.setBounds(480, 650, 1260, 40);

        jLabel14.setFont(new java.awt.Font("Constantia", 3, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel14);
        jLabel14.setBounds(490, 690, 1260, 40);

        jLabel15.setFont(new java.awt.Font("Constantia", 3, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel15);
        jLabel15.setBounds(490, 730, 1260, 40);

        jLabel16.setFont(new java.awt.Font("Constantia", 3, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel16);
        jLabel16.setBounds(490, 770, 1350, 40);

        jLabel17.setFont(new java.awt.Font("Constantia", 3, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel17);
        jLabel17.setBounds(480, 850, 1270, 30);

        jLabel18.setFont(new java.awt.Font("Constantia", 3, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel18);
        jLabel18.setBounds(490, 890, 1040, 30);

        jLabel19.setFont(new java.awt.Font("Constantia", 3, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel19);
        jLabel19.setBounds(490, 920, 1040, 30);

        jLabel20.setFont(new java.awt.Font("Constantia", 3, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel20);
        jLabel20.setBounds(490, 960, 1110, 30);

        jLabel21.setBackground(new java.awt.Color(51, 51, 255));
        jLabel21.setFont(new java.awt.Font("Yu Gothic UI Semibold", 2, 13)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Powered by:");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(1600, 950, 80, 40);

        jLabel23.setBackground(Color.RED);
        jLabel23.setFont(new java.awt.Font("Cooper Black", 3, 36)); // NOI18N
        jLabel23.setForeground(Color.WHITE);
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("zomato");
        jLabel23.setEnabled(true);
	jLabel23.setOpaque(true);
        getContentPane().add(jLabel23);
        jLabel23.setBounds(1680, 940, 160, 50);

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel22);
        jLabel22.setBounds(10, 270, 620, 60);

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Elephant", 0, 30)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel24);
        jLabel24.setBounds(490, 20, 1120, 40);

        pack();
    }                       

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       String city = jTextField1.getText();
		try{                   
		sendGet(findCityId(city));
                
                }
                catch(Exception e){
                   jLabel22.setText("An error occured. Please try again");
                }
                
        //jLabel1.setText( "zzzzz" + jTextField1.getText() );
                 
    }                                        

    
private String findCityId(String city) throws Exception{
         String city_url = "https://developers.zomato.com/api/v2.1/cities?q="+city;
         URL obj = new URL(city_url);

		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		//add request header
		con.setRequestProperty("user-key","0383dd943ed704c9c3f6e9b261421306");

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String response = in.readLine();
        in.close();
        return (response.substring(response.indexOf("id")+4,response.indexOf(",")));
    }
     
        	// HTTP GET request
	




private void sendGet(String id) throws Exception {      
		String url = "https://developers.zomato.com/api/v2.1/search?entity_id="+id+"&entity_type=city&sort=rating&count=5&category=2&order=desc";
		
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		//add request header
		con.setRequestProperty("user-key","0383dd943ed704c9c3f6e9b261421306");

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
        int f=0;

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		int count = 1;
		
                
               
	if (id.compareTo("ocation_suggestions\":[]")==0){
            
                String s1="Sorry :( we couldn't find that place. Please try again.";
                 jLabel22.setText( s1+"" );
                 jLabel1.setText( "" );
                 jLabel2.setText( "" );
                 jLabel3.setText( "" );
                 jLabel4.setText( "" );
                 jLabel5.setText( "" );
                 jLabel6.setText( "" );
                 jLabel7.setText( "" );
                 jLabel8.setText( "" );
                 jLabel9.setText( "" );
                 jLabel10.setText( "" );
                 jLabel11.setText( "" );
                 jLabel12.setText( "" );
                 jLabel13.setText( "" );
                 jLabel14.setText( "" );
                 jLabel15.setText( "" );
                 jLabel16.setText( "" );
                 jLabel17.setText( "" );
                 jLabel18.setText( "" );
                 jLabel19.setText( "" );
                 jLabel20.setText( "" );
                 jLabel24.setText( "" );
                
	return;
	}	
        
        jLabel24.setText("HERE ARE THE TOP FIVE RESTAURANTS OF YOUR CITY");
        jLabel22.setText( "" );
        String s2="";
		for (int i=0;i<5;i++){
                   if(i==0)
                   {
             s2=response.substring(response.indexOf(",\"name")+9,response.substring(response.indexOf(",\"name")+9).indexOf("\"")+response.indexOf(",\"name")+9);
            jLabel1.setText( '\u2022'+" "+s2 );
            
              s2="Rating: "+ response.substring(response.indexOf("aggregate_rating\":\"")+19,response.indexOf("aggregate_rating\":\"")+22);
	    jLabel2.setText( s2 );
            
              s2="Average cost for two: " + response.substring(response.indexOf("average_cost")+22,response.substring(response.indexOf("average_cost")+21).indexOf("\"")+response.indexOf("average_cost")+20);
              jLabel3.setText( s2 );
              
            s2="Address: " + response.substring(response.indexOf("address\":\"")+10,response.indexOf("address\":\"")+10+response.substring(response.indexOf("address\":\"")+10).indexOf("\""));
             jLabel4.setText( s2 );
                   }
                   else if(i==1)
                   {
                      s2=response.substring(response.indexOf(",\"name")+9,response.substring(response.indexOf(",\"name")+9).indexOf("\"")+response.indexOf(",\"name")+9);
            jLabel5.setText( '\u2022'+" "+s2 );
            
              s2="Rating: "+ response.substring(response.indexOf("aggregate_rating\":\"")+19,response.indexOf("aggregate_rating\":\"")+22);
	    jLabel6.setText( s2 );
            
              s2="Average cost for two: " + response.substring(response.indexOf("average_cost")+22,response.substring(response.indexOf("average_cost")+21).indexOf("\"")+response.indexOf("average_cost")+20);
              jLabel7.setText( s2 );
              
            s2="Address: " + response.substring(response.indexOf("address\":\"")+10,response.indexOf("address\":\"")+10+response.substring(response.indexOf("address\":\"")+10).indexOf("\""));
             jLabel8.setText( s2 );
                   }
                   else if(i==2)
                   {
                       s2=response.substring(response.indexOf(",\"name")+9,response.substring(response.indexOf(",\"name")+9).indexOf("\"")+response.indexOf(",\"name")+9);
            jLabel9.setText( '\u2022'+" "+s2 );
            
              s2="Rating: "+ response.substring(response.indexOf("aggregate_rating\":\"")+19,response.indexOf("aggregate_rating\":\"")+22);
	    jLabel10.setText( s2 );
            
              s2="Average cost for two: " + response.substring(response.indexOf("average_cost")+22,response.substring(response.indexOf("average_cost")+21).indexOf("\"")+response.indexOf("average_cost")+20);
              jLabel11.setText( s2 );
              
            s2="Address: " + response.substring(response.indexOf("address\":\"")+10,response.indexOf("address\":\"")+10+response.substring(response.indexOf("address\":\"")+10).indexOf("\""));
             jLabel12.setText( s2 );
                   }
                   else if(i==3)
                   {
                       s2=response.substring(response.indexOf(",\"name")+9,response.substring(response.indexOf(",\"name")+9).indexOf("\"")+response.indexOf(",\"name")+9);
            jLabel13.setText( '\u2022'+" "+s2 );
            
              s2="Rating: "+ response.substring(response.indexOf("aggregate_rating\":\"")+19,response.indexOf("aggregate_rating\":\"")+22);
	    jLabel14.setText( s2 );
            
              s2="Average cost for two: " + response.substring(response.indexOf("average_cost")+22,response.substring(response.indexOf("average_cost")+21).indexOf("\"")+response.indexOf("average_cost")+20);
              jLabel15.setText( s2 );
              
            s2="Address: " + response.substring(response.indexOf("address\":\"")+10,response.indexOf("address\":\"")+10+response.substring(response.indexOf("address\":\"")+10).indexOf("\""));
             jLabel16.setText( s2 );
                   }
                   else
                   {
                       s2=response.substring(response.indexOf(",\"name")+9,response.substring(response.indexOf(",\"name")+9).indexOf("\"")+response.indexOf(",\"name")+9);
            jLabel17.setText( '\u2022'+" "+s2 );
            
              s2="Rating: "+ response.substring(response.indexOf("aggregate_rating\":\"")+19,response.indexOf("aggregate_rating\":\"")+22);
	    jLabel18.setText( s2 );
            
              s2="Average cost for two: " + response.substring(response.indexOf("average_cost")+22,response.substring(response.indexOf("average_cost")+21).indexOf("\"")+response.indexOf("average_cost")+20);
              jLabel19.setText( s2 );
              
            s2="Address: " + response.substring(response.indexOf("address\":\"")+10,response.indexOf("address\":\"")+10+response.substring(response.indexOf("address\":\"")+10).indexOf("\""));
             jLabel20.setText( s2 );
                   }
                   
	        response = new StringBuffer(response.substring(response.indexOf("aggregate_rating\":\"")+19));

		}
		in.close();
	}

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FindMyRestaurant().setVisible(true);
            }
            
        });
        
        Scanner in = new Scanner (System.in);
		FindMyRestaurant ob1 = new FindMyRestaurant();
    }

                    
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
                
}

