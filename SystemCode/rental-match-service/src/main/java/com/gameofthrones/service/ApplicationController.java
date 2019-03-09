package com.gameofthrones.service;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

import org.jbpm.services.api.DeploymentService;
import org.jbpm.services.api.ProcessService;
import org.jbpm.services.api.RuntimeDataService;
import org.kie.server.services.api.KieServer;
import org.kie.server.springboot.jbpm.ContainerAliasResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.gameofthrones.DAO.RentalListingRepo;
import com.gameofthrones.model.*;

import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ApplicationController {

	@Autowired
    private DeploymentService deploymentService;

    @Autowired
    private RuntimeDataService runtimeDataService;

    @Autowired
    private ProcessService processService;

    @Autowired
    private KieServer kieServer; // have to autowire this bean in order to use aliasresolver atm

    @Autowired
    private ContainerAliasResolver aliasResolver;

    @Autowired
    RentalListingRepo repo;
    
    private String inFirstName ="";
    private String containerAlias = "rental-match-kjar";
    private String processId = "rental-match-kjar.RentalSearchProcess";
    private long processInstanceId;
    //HashMap<String, String> questionResults;
    UserAnsSearch userAns;
    UserAnsSearch userAnsHolder;
    
    @GetMapping("/index")
    public String myapp(Model model) {
    	initUserAnswers();
    	model.addAttribute("userAns", userAns);
    	return "index";
    }
 
    @PostMapping("/question1")
    public String question1(@ModelAttribute UserAnsSearch userAns, Model model) {
    	model.addAttribute("userAns", userAns);
    	//System.out.print("Parameters: "+userAns.toString());

        return "question1";
    }
    
    @PostMapping("/question2")
    public String question2(@ModelAttribute UserAnsSearch userAns,Model model) {
       	userAnsHolder.setQnsBudget(userAns.getQnsBudget());
    	model.addAttribute("userAns", userAns);
    	System.out.println("Parameters: "+userAnsHolder.toString());

        return "question2";
    }
    
    @PostMapping("/question3")
    public String question3(@ModelAttribute UserAnsSearch userAns,Model model) {
    	userAnsHolder.setQnsPurpose(userAns.getQnsPurpose());
    	model.addAttribute("userAns", userAns);
    	System.out.print("Parameters: "+userAnsHolder.toString());
        return "question3";
    }
    
    
    @PostMapping("/question4")
    public String question4(@ModelAttribute UserAnsSearch userAns,Model model) {
    	userAnsHolder.setQnsLocationWork(userAns.getQnsLocationWork());
    	model.addAttribute("userAns", userAns);
    	System.out.print("Parameters: "+userAnsHolder.toString());
        return "question4";
    }
    
    //deviating question
    @PostMapping("/question5")
    public String question5(@ModelAttribute UserAnsSearch userAns,Model model) {
    	
    	String stayingWithFamily = userAns.getQnsStayingFamily();
    	if(stayingWithFamily.equalsIgnoreCase("Yes") || stayingWithFamily.equalsIgnoreCase("No")) {
        	userAnsHolder.setQnsStayingFamily(stayingWithFamily);
    	}
    	model.addAttribute("userAns", userAns);
    	System.out.print("Parameters: "+userAnsHolder.toString());
    	
    	if(stayingWithFamily.equalsIgnoreCase("Yes")) {
    		return "redirect:/question4a";
    	}else {
    		return "question5";
    	}
    }
    
    @PostMapping("/question5a")
    public String question5a(@ModelAttribute UserAnsSearch userAns,Model model) {
    	//userAnsHolder.setQnsSpouseWork(userAns.getQnsSpouseWork());
    	model.addAttribute("userAns", userAns);
    	System.out.print("Parameters: "+userAnsHolder.toString());
        return "question5";
    }
    
    @PostMapping("/question6")
    public String question6(@ModelAttribute UserAnsSearch userAns,Model model) {
    	userAnsHolder.setQnsCook(userAns.getQnsCook());
    	model.addAttribute("userAns", userAns);
    	System.out.print("Parameters: "+userAnsHolder.toString());
        return "question6";
    }
    
    @GetMapping("/question5")
    public String question5get(@ModelAttribute UserAnsSearch userAns,Model model) {
    	model.addAttribute("userAns", userAns);
    	System.out.print("Parameters: "+userAnsHolder.toString());
        return "question5";
    }
    
    @PostMapping("/question7")
    public String question7(@ModelAttribute UserAnsSearch userAns,Model model) {
    	userAnsHolder.setQnsTransport(userAns.getQnsTransport());
    	model.addAttribute("userAns", userAns);
    	System.out.print("Parameters: "+userAnsHolder.toString());
        return "question7";
    }

    @GetMapping("/question4a")
    public String question4a(@ModelAttribute UserAnsSearch userAns,Model model) {
    	userAnsHolder.setQnsNoOfChild(userAns.getQnsNoOfChild());
    	model.addAttribute("userAns", userAns);
    	System.out.print("Parameters: "+userAnsHolder.toString());
        return "question4a";
    }
    
    @PostMapping("/question4b")
    public String question4b(@ModelAttribute UserAnsSearch userAns,Model model) {
    	userAnsHolder.setQnsNoOfChild(userAns.getQnsNoOfChild());
    	model.addAttribute("userAns", userAns);
    	System.out.print("Parameters: "+userAnsHolder.toString());
        return "question4b";
    }
    
    @PostMapping("/question4c")
    public String question4c(@ModelAttribute UserAnsSearch userAns,Model model) {
    	userAnsHolder.setQnsNoOfAdult(userAns.getQnsNoOfAdult());;
    	model.addAttribute("userAns", userAns);
    	System.out.print("Parameters: "+userAnsHolder.toString());
        return "question4c";
    }
    
    @PostMapping("/question4d")
    public String question4d(@ModelAttribute UserAnsSearch userAns,Model model) {
    	String spouseWorking = userAns.getQnsSpouseWork();
    	
    	userAnsHolder.setQnsSpouseWork(userAns.getQnsSpouseWork());
    	System.out.print("Parameters: Spouse "+userAnsHolder.toString());
    	userAns.setQnsSpouseWork("");
        if(spouseWorking.equalsIgnoreCase("Yes")) {
        	model.addAttribute("userAns", userAns);
        	return "question4d";
        }else {
        	return "redirect:/question5";
        }
    }
    
    @PostMapping("/lastqns")
    public String lastqns(@ModelAttribute UserAnsSearch userAns,Model model) {
    	userAnsHolder.setQnsExercise(userAns.getQnsExercise());
    	model.addAttribute("userAns", userAns);
    	
    	runAppProcess(userAnsHolder, model);
    	
    	System.out.print("Parameters: "+userAnsHolder.toString());
        return "redirect:/mysearchresults";
    }
    
    @GetMapping("/mysearchresults")
    public String mysearchresults(Model model) {
        
        System.out.println("Instance ID: "+processInstanceId);
        Map<String, Object> processVariables = new HashMap<>();
        processVariables = processService.getProcessInstanceVariables(processInstanceId);
        System.out.println("Hash map "+processVariables.toString());
    	
        userAnsHolder  = (UserAnsSearch) processVariables.get("userAnsHolder");
        System.out.println("Search Criteria: "+userAnsHolder.toString());

        /*
         * 	@Query("from RentalListing where zone=?1 and mrt=?2 and leaseType=?3 and busStop=?4 and numberOfRoomsRented=?5 and school=?6 and childCare=?7 and gym=?8")
	List<RentalListing> findRental(String zone, String mrt, String leaseType, String busStop, String numberOfRoomsRented, String school, String childCare, String gym);
	
	@Query("from RentalListing where zone=?1 and mrt=?2 and leaseType=?3 and busStop=?4 and school=?5 and childCare=?6 and gym=?7")
	List<RentalListing> findRentalSingle(String zone, String mrt, String leaseType, String busStop, String school, String childCare, String gym);
         * 
         */
        List<RentalListing> listings;
        if((userAnsHolder.getLeaseType()).equalsIgnoreCase("Whole")) {
        	listings = repo.findRental(userAnsHolder.getZone(), userAnsHolder.getMrt(), userAnsHolder.getLeaseType(), userAnsHolder.getBusStop(), Integer.parseInt(userAnsHolder.getNoOfRooms()), userAnsHolder.getChildCare(), userAnsHolder.getGym(), Float.parseFloat(userAnsHolder.getQnsBudget()));
        }else {
        	listings = repo.findRentalSingle(userAnsHolder.getZone(), userAnsHolder.getMrt(), userAnsHolder.getLeaseType(), userAnsHolder.getBusStop(), userAnsHolder.getGym(), Float.parseFloat(userAnsHolder.getQnsBudget()));
        }
     
        
        System.out.println("My Listing is "+listings.toString());
        if(!listings.isEmpty()) {
        	model.addAttribute("listings", listings);

        }
        
    	model.addAttribute("userAnsHolder", userAnsHolder);
        return "mysearchresults";
    } 
    /*
    @PostMapping("/mysearchresults")
    public String mysearchresults2(Model model) {
        
        System.out.println("Instance ID: "+processInstanceId);
        Map<String, Object> processVariables = new HashMap<>();
        processVariables = processService.getProcessInstanceVariables(processInstanceId);
        System.out.println("Hash map "+processVariables.toString());
    	
        userAnsHolder  = (UserAnsSearch) processVariables.get("searchCriteria");
        System.out.println("Person "+userAnsHolder.toString());

    	model.addAttribute("userAnsHolder", userAnsHolder);

        
        return "mysearchresults";
    } 
*/
    private void runAppProcess(UserAnsSearch userAns,
                                Model model) {
        
        Map<String, Object> processInputs = new HashMap<>();
        processInputs.put("userAnsHolder", userAnsHolder);
        
        String resolvedContainerId = aliasResolver.latest(containerAlias);

        processInstanceId = processService.startProcess(resolvedContainerId,
                                                             processId,
                                                             processInputs);
    }
    
    
    private void initUserAnswers() {
        userAns = new UserAnsSearch();
        userAnsHolder = new UserAnsSearch();
    	//System.out.print("Question Results parameters: "+userAnsHolder.toString());
    }
    
}

