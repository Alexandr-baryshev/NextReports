package mainPackage.controllers;

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
//
//   @PostMapping("/data")
//   public ResponseEntity<GeneratorData> createX(@RequestBody GeneratorData gd) {
//
//      gd.setOutTxt(gf.sortFunc(gd));
//
//      return new ResponseEntity<GeneratorData>(gd, HttpStatus.OK);
//   }
//
//
//   @PostMapping("/dataSave")
//   public ResponseEntity<GeneratorData> createX2(@RequestBody GeneratorData gd) {
//
//      gd.setOutTxt(gf.sortFunc(gd));
//      mongoTemplate.insert(gd, "GeneratorCollect");
//
//      return new ResponseEntity<GeneratorData>(gd, HttpStatus.OK);
//   }
//
//
//   @GetMapping("/getAll")
//   public ResponseEntity<List<GeneratorData>> createX3() {
//
//      List<GeneratorData> r = mongoTemplate.findAll(GeneratorData.class, "GeneratorCollect");
//
//      return new ResponseEntity<>(r, HttpStatus.OK);
//   }


}