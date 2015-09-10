/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import service.SearchStartService;

/**
 *
 * @author wookie
 */
public class SearchController extends SimpleFormController {
    
    private SearchStartService searchStartService;

    public void setSearchStartService(SearchStartService searchStartService) {
        this.searchStartService = searchStartService;
    }

  
    
    public SearchController() {
        //Initialize controller properties here or 
        //in the Web Application Context

        setCommandClass(Table.class);
        setCommandName("search");
        setSuccessView("SearchView");
        setFormView("MainView");
    }
    
    @Override
    protected void doSubmitAction(Object command) throws Exception {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
    
    /*@Override
    protected ModelAndView onSubmit(
            HttpServletRequest request,
            HttpServletResponse response,
            Object command,
            BindException errors) throws Exception {

        Table table = (Table) command;
        ModelAndView mv = new ModelAndView(getSuccessView());
        mv.addObject("message", searchStartService.test(table.getTable_name()));
        return mv;
    }*/
     
}
