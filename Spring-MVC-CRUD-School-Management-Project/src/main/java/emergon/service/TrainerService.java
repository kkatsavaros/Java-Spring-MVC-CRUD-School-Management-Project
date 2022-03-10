package emergon.service;

import emergon.entity.Trainers;
import emergon.repository.TrainerRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class TrainerService {

    @Autowired
    TrainerRepo trainerRepo;
    
    private List<Trainers> trainers;

    public List<Trainers> getTrainers() {
        List<Trainers> trainers = trainerRepo.findAll();
        return trainers;
    }

    public void addTrainer(Trainers trainer) {
        trainerRepo.save(trainer);
    }

    public void deleteTrainer(int id) {
        trainerRepo.delete(Trainers.class, id);
    }

    public Trainers getTrainersById(int ccode) {
        return trainerRepo.find(ccode);
    }

    public Trainers updateTrainer(Trainers trainer) {//customer argument contains the new data from the form
        return trainerRepo.save(trainer);
    }
}

