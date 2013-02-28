package edu.wctc.distjava.blueproject.controller;

import edu.wctc.distjava.blueproject.model.Employee;
import edu.wctc.distjava.blueproject.model.EmployeeEAO;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * A sample JSF Managed Bean
 * @author  jlombardo
 * @version 1.00
 */
@Named(value = "sample")
@ViewScoped
public class SampleBean implements Serializable {
    // Incremement this with each structural class change
    private static final long serialVersionUID = 1L;
    @Inject
    private EmployeeEAO eao;
    private String message = "Hello From JSF Managed Bean";

    /**
     * Creates a new instance of SampleBean
     */
    public SampleBean() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public String getEmployeeById(String id){
        Employee employee = eao.getEmployeeByID(new Integer(id));
        return employee.toString();
    }
    
}
