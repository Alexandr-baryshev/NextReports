package mainPackage.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HTTPController {

   @GetMapping("/")
   public String loginMob(Model model) {
      return "login-mob";
   }

   @GetMapping("/main-mob")
   public String mainMob(Model model) {
      return "main-mob";
   }

   @GetMapping("/newReport-mob")
   public String newReportMob(Model model) {
      return "newReport-mob";
   }

   @GetMapping("reportList-mob")
   public String reportListMob(Model model) {
      return "reportList-mob";
   }

}
