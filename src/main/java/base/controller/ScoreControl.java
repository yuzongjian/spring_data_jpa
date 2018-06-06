package base.controller;  
/**
 * @author yuzongjian
 *
 * This is a project for the power supply bureau.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import base.bean.user;
import base.service.userService;



@Controller  
@RequestMapping("/second")    
public class ScoreControl {  
	@Autowired  
	private userService userService;
	@Autowired  
	private base.service.pageService pageService;
	@RequestMapping("/findall")
    @ResponseBody
    public Map<String, Object> getUser(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("state", "success");
        System.out.println(userService.findByUsername("123123"));
        System.out.println(userService.findByPasswordAndUsernameLike("1123", "1231234"));
//        userService.delete(1);  实现删除接口
        System.out.println(userService.count());
        System.out.println(userService.countByUsername( "12"));
        System.out.println(userService.countByUsername( "1231234"));
        System.out.println(userService.update("2", 4));
        map.put("data", userService.findAll());
        return map;
    }
//	分页查询
	@RequestMapping(value = "page", method=RequestMethod.GET)
	 @ResponseBody
	public Page<user> getEntryByPageable(@PageableDefault(value = 15, sort = { "id" }) 
    Pageable pageable)  {
	    return pageService.findAll(pageable);
	}
	
	
//	分页查询
	@RequestMapping(value = "pageByUsername", method=RequestMethod.GET)
	 @ResponseBody
	public Page<user> getByPageable(@PageableDefault(value = 15, sort = { "id" }) @RequestParam(value="username",required=false)String username,Pageable pageable )  {
	    return pageService.findByUserName(username, pageable);
	}
}
