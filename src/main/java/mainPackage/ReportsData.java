package mainPackage;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;

public class ReportsData implements Serializable {


   @Id
   public String id;

   private String login;
   private String password;

   private int reportNum;
   private Date reportDate;
   private String descriptWork;
   private String resultWork;

   private String historyOut;

   public ReportsData(){}

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getLogin() {
      return login;
   }

   public void setLogin(String login) {
      this.login = login;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public int getReportNum() {
      return reportNum;
   }

   public void setReportNum(int reportNum) {
      this.reportNum = reportNum;
   }

   public Date getReportDate() {
      return reportDate;
   }

   public void setReportDate(Date reportDate) {
      this.reportDate = reportDate;
   }

   public String getDescriptWork() {
      return descriptWork;
   }

   public void setDescriptWork(String descriptWork) {
      this.descriptWork = descriptWork;
   }

   public String getResultWork() {
      return resultWork;
   }

   public void setResultWork(String resultWork) {
      this.resultWork = resultWork;
   }

   public String getHistoryOut() {
      return historyOut;
   }

   public void setHistoryOut(String historyOut) {
      this.historyOut = historyOut;
   }


}


