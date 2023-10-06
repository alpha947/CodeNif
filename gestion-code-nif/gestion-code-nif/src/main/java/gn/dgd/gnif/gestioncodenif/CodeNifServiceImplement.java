package gn.dgd.gnif.gestioncodenif;

import org.apache.logging.log4j.Logger;
import org.slf4j.ILoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeNifServiceImplement implements CodeNifService {
    //Logger logger= ILoggerFactory.getLogger (CodeNifServiceImplement.class);
    @Autowired
    public CodeNifDao codeNifDao;


    @Override
    public List<CodeNif> fetchAllCodeNifs() {
        return codeNifDao.getAllCodeNif();
    }

    @Override
    public ResponseEntity searchCodeNif(String cmpCod) {
        return ResponseEntity.ok(codeNifDao.findById(cmpCod).get());
    }
}
