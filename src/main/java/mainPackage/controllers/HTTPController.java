package mainPackage.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


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

   @GetMapping("/newProfRab-mob")
   public String newReportMob(Model model, @RequestParam(name = "id", required = false) String id0) {
      if (id0 != null) {
         model.addAttribute("idEdit", id0);
      }
      return "create-edid-profrab-mob";
   }

   @GetMapping("listProfRab-mob")
   public String reportListMob(Model model) {
      return "list-profrab-mob";
   }

}
