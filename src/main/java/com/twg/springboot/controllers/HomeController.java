package com.twg.springboot.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.twg.springboot.entity.Entry;
import com.twg.springboot.entity.User;
import com.twg.springboot.service.EntryService;
import com.twg.springboot.service.UserService;

import jakarta.servlet.http.HttpSession;


@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	 @Autowired
	    HttpSession session;
	
	 @Autowired
	 private EntryService entryService;
      
	@GetMapping("/")
	public String homepage() {
		return  "loginpage";
	}
	
	@GetMapping("register")
	public String registrationpage() {
		return "registrationpage";
	}
	
	@PostMapping("saveuser")
	public String saveuser(@ModelAttribute("user") User user) {
		userService.save(user);
		return "registersuccess";
	}
	
	@PostMapping("authenticate")
	public String authenticateUser(@ModelAttribute("user") User user,Model model) {
		String viewname="loginpage";
		User user1=userService.findByUsername(user.getUsername());
		
		if(user1!=null && user.getPassword().equals(user1.getPassword())) {
			viewname="userhomepage";
			model.addAttribute("user",user1);
			
			session.setAttribute("user",user1);
			List<Entry> entries=null;
			try {
				entries=entryService.findByUserId(user1.getId());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			model.addAttribute("entrieslist",entries);
			
			
		}
		
		return viewname;
	}
	
	  @GetMapping("addentry")
	  public String addentry() {
		  return "addentryform";
	  }
	  
	  @PostMapping("saveentry")
	  public String saveentry(@ModelAttribute("entry") Entry entry,Model model) {
		  
		  String viewname="userhomepage";
		  User user1=(User)session.getAttribute("user");
		  if (user1 == null) {
		        return "/";
		    }
		  entryService.save(entry);
		  List<Entry> entries=null;
			try {
				entries=entryService.findByUserId(user1.getId());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			model.addAttribute("entrieslist",entries);
		  
		  return viewname;
	  }
	  
	  @GetMapping("viewentry")
		public String viewentry(@RequestParam("id") int id,Model model) {
			
		    Entry entry=(Entry)entryService.findById(id);
			model.addAttribute(entry);
			return "displayentry";
		}
	  
		@GetMapping("userhome")
		public String userhome(Model model) {
			
			String viewname="userhomepage";
			
			
			User user1=(User)session.getAttribute("user");
			

		    if (user1 == null) {
		        return "/";
		    }
			session.setAttribute("user",user1);
			List<Entry> entries=null;
			try {
				entries=entryService.findByUserId(user1.getId());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			model.addAttribute("entrieslist",entries);
			return viewname;
		}
		
		@GetMapping("updateentry")
		public String updateentry(@RequestParam("id") int id,Model model) {
			
			String viewname="displayupdateentry";
			
			Entry entry=entryService.findById(id);
			
			model.addAttribute("entry",entry);
	        User user1=(User)session.getAttribute("user");
			

		    if (user1 == null) {
		        return "loginpage";
		    }
			
			return viewname;
		}
		
		@PostMapping("processentryupdate")
		public String processentryupdate(@ModelAttribute("entry") Entry entry ,Model model) {
			String viewname="userhomepage";
			
			
			entryService.update(entry);
			
			User user1=(User)session.getAttribute("user");
			

		    if (user1 == null) {
		        return "home";
		    }
			
			// entry.setUserid(user1.getId());
			//entry.setEntrydate(new java.sql.Date(System.currentTimeMillis()));
			
			
			
			List<Entry> entries=null;
			try {
				entries=entryService.findByUserId(user1.getId());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

			
			model.addAttribute("entrieslist",entries);
			return viewname;
		}
		
		@GetMapping("deleteentry")
		public String deleteentry(@RequestParam("id") int id,Model model) {
			
			String viewname="userhomepage";
			
			Entry entry=entryService.findById(id);
			 
			
			
	     	User user1=(User)session.getAttribute("user");
			
	   
		    if (user1 == null) {
		        return "loginpage";
		    }
		    else
		    	entryService.delete(entry);
			
		    List<Entry> entries=null;
			try {
				entries=entryService.findByUserId(user1.getId());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			model.addAttribute("entrieslist",entries);
			
			return viewname;
		}
		
		@GetMapping("signout")
		public String signout() {
			
			String viewname="loginpage";
			 
			
			
			session.invalidate();
			return viewname;
		}
		
}
