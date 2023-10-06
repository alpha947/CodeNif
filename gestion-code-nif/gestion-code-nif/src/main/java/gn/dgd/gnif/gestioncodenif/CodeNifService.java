package gn.dgd.gnif.gestioncodenif;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CodeNifService {
    List<CodeNif> fetchAllCodeNifs();
    ResponseEntity searchCodeNif(String cmpCod);
}
