package gn.dgd.gnif.gestioncodenif;

import org.aspectj.apache.bcel.classfile.Code;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface CodeNifDao extends JpaRepository<CodeNifDao, String> {
    @Query(value="select * from code_nif limit 50 ", nativeQuery = true)
     List<CodeNif> getAllCodeNif();

}
