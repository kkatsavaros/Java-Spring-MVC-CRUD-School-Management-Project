package emergon.repository;

import emergon.entity.Trainers;
import java.util.List;
import org.springframework.stereotype.Repository;


@Repository
public class TrainerRepo extends HibernateUtil<Trainers>{
    
    public List<Trainers> findAll(){
        return super.findAll("Trainers.findAll");
    }
    
    @Override
    public Trainers save(Trainers trainer){
        return super.save(trainer);
    }
    
    public Trainers find(int id){
        return super.find(Trainers.class, id);
    }
    
}