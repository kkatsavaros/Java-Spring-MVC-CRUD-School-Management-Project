package emergon.controller;

import emergon.entity.Trainers;
import emergon.service.TrainerService;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/trainer")
public class TrainerController {
    
    @Autowired
    private TrainerService service;
    
    @RequestMapping
    public ModelAndView showTrainers(ModelAndView modelAndView){
        List<Trainers> trainers = service.getTrainers();
        modelAndView.addObject("listOfTrainers", trainers);
        modelAndView.setViewName("trainersList");//.jsp
        return modelAndView;
    }
    
    /**
     * URLs
     * /customer/create : GET  (customerList.jsp - link)
     * /customer/create : POST (customerForm.jsp - form)
     */
    
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String showForm(){
        return "TrainerAddUpdateFrom"; //.jsp
    }
    
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(Trainers trainer, RedirectAttributes attributes){
        service.addTrainer(trainer);
        String minima = "Trainer "+ trainer.gettFirstName() + " successfully created!!";
        attributes.addFlashAttribute("message", minima);
        return "redirect:/trainer";//Redirect instructs client to sent a new GET request to /customer
    }
    
    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id, RedirectAttributes attributes){
        service.deleteTrainer(id);
        String minima = "Trainer successfully deleted!!";
        attributes.addFlashAttribute("message", minima);
        return "redirect:/trainer";
    }
    
    @GetMapping("/update/{ccode}")
    public String showFormUpdate(@PathVariable("ccode") int ccode, Model model){
        Trainers trainer = service.getTrainersById(ccode);
        model.addAttribute("trainerToEdit", trainer);
        return "TrainerAddUpdateFrom";
    }
    
    @PostMapping("/update")
    public String update(Trainers trainer, RedirectAttributes attributes){
        service.updateTrainer(trainer);
        String minima = "Trainer updated successfully!!";
        attributes.addFlashAttribute("message", minima);
        return "redirect:/trainer";
    }
    
    
    
    
    
    
}
