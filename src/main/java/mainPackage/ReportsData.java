package mainPackage;

import java.io.Serializable;
import org.springframework.data.annotation.Id;

public class ReportsData implements Serializable {


   @Id
   public String id;

   private String login;
   private String password;

   private String descriptWork;
   private String resultWork;
   private int reportNum;

   public ReportsData(){}
}




