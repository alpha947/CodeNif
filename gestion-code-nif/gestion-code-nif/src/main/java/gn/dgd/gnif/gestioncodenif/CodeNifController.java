package gn.dgd.gnif.gestioncodenif;

import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/api/v1")
public class CodeNifController {
    @Autowired
    public CodeNifService codeNifService;
@GetMapping("/")
    public List<CodeNif> fetchAllCodeNifs() {
        return codeNifService.fetchAllCodeNifs();
    }
    //creation de la methode recherche
    @GetMapping("/id/{cmp_cod}")
    public ResponseEntity searchCodeNif(@PathVariable String cmp_cod){
      return codeNifService.searchCodeNif(cmp_cod);
    }


}
