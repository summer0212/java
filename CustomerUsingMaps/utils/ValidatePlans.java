package utils;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Map;

import core1.*;
import custom_exceptn.*;


public class ValidatePlans 
{
    public static ServicePlan parseAndValidateServicePlan(String plan)throws IllegalArgumentException
    {
        return ServicePlan.valueOf(plan.toUpperCase());//this is new version of legacy api new ServicePlan(String plan)

    }

    public static LocalDate parseAndValidateDob(String dob)throws DateTimeParseException
    {
        LocalDate dateOfBirth = LocalDate.parse(dob);
        return dateOfBirth;
    }
                                                //  <datatype>
    public static void checkForDups(String newEmail,Map<String,Customer> cList)throws CustomerHandlingExcptn
    {
        //Customer nwCustomer = cList.get(newEmail);
        if(cList.containsKey(newEmail))
        {
            throw new CustomerHandlingExcptn("Customer can't be added : duplicate email id !!!!!!");
        }
        System.out.println("No duplicate email");
    }

    public static Customer validateAllInputs(String firstname,String lastname,String email,String password,double registrationAmount,String dateString,String plan,Map<String,Customer> cList)throws CustomerHandlingExcptn
    {
        checkForDups(email, cList);
        ServicePlan pServicePlan = parseAndValidateServicePlan(plan);
        LocalDate dob = parseAndValidateDob(dateString);
        return new Customer(firstname,lastname,email,password,registrationAmount,dob,pServicePlan);

    }

    public static Customer authenticateCustomer(String email,String pwd,Map<String,Customer> cList)throws CustomerHandlingExcptn
    {
        Customer authCustomer=cList.get(email);
        if(authCustomer==null)
        throw new CustomerHandlingExcptn("Invalid email id");
        // Customer authCustomer=cList.get(pwd);
        // if(authCustomer==null)
        //we cannot write this way because password is not a key
        if(!authCustomer.getPassword().equals(pwd))
        throw new CustomerHandlingExcptn("Invalid password");
        return authCustomer;
    }
}




