package mainPackage.controllers;

import mainPackage.ReportsData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
public class MainController {

   @Autowired
   protected MongoTemplate mongoTemplate;

//   @Autowired
//   GeneratorFunc gf;


   @PostMapping("/nameX1")
   public ResponseEntity<ReportsData> cre1(@RequestBody ReportsData rd) {
      return new ResponseEntity<ReportsData>(rd, HttpStatus.OK);
   }


   @GetMapping("/getProfRab")
   public ResponseEntity<List<ReportsData>> cre2() {

      List<ReportsData> r = mongoTemplate.findAll(ReportsData.class, "ProfRab");

      return new ResponseEntity<>(r, HttpStatus.OK);
   }


}