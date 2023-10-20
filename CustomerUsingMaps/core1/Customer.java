package core1;


import java.time.LocalDate;

public class Customer
{       
        private int customerId;
        private String firstname;
        private String lastname;
        private String email;
        private String password;
        private double registrationAmount;
        private  LocalDate dob ;
        private ServicePlan plan;
        private static int idGenerator=0;

        public Customer(String fn,String ln,String email,String pswd,double amt,LocalDate dob, ServicePlan plan)
        {
            
            this.customerId=++idGenerator;
            firstname=fn;
            lastname=ln;
            this.email=email;
            password=pswd;
            registrationAmount=amt;
            this.dob=dob;
            this.plan=plan;

        }

        
        public Customer(String nwEmail)
        {
            email=nwEmail;
        }

        public String getEmail()
        {
            return this.email;
        }
        
        public String getFirstName()
        {
            return this.firstname;
        }

        public String getLastName()
        {
            return this.lastname;
        }

        public LocalDate getDob()
        {
            return this.dob;
        }

        public int getCustomerId()
        {
            return this.customerId;
        }

        public ServicePlan getPlan()
        {
            return this.plan;
        }

        public String getPassword()
        {
            return this.password;
        }

        public void setPassword(String password)
        {
            this.password=password;
        }

        @Override
        public boolean equals(Object o)
        {
            System.out.println("in customer's equals");
            if(o instanceof Customer)
            {
                Customer nexCustomer = (Customer) o;
                return true;
            }
            return false;
        }

        @Override
        public String toString()
        {
            return "Customer details "+ email +" "+ customerId +" "+ firstname+" "+lastname+" "+plan+" "+dob;
        }

       
}
   

