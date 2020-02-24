package mahima.com;

import java.util.*;
import java.io.*;
import java.lang.*;
import org.apache.log4j.*;
public class App
{
    public static final Logger M=LogManager.getLogger(App.class);
    public static void main(String args[]) throws IOException
    {
	BasicConfigurator.configure();
        Interest i = new Interest();
        Construction c = new Construction();
        M.debug("-----INTEREST-----");
        i.calc_interest();
        M.debug("-----CONSTRUCTION ESTIMATION-----");
        c.estimation();
    }

}
class Interest
{
	public static final Logger M=LogManager.getLogger(Interest.class);
	void calc_interest() throws IOException
    {
        double si,ci;
        double principle,rate;
        int time,choice;
        Scanner sc = new Scanner(System.in);
        M.debug("Enter the principle amount : \n");
        principle=sc.nextDouble();
        M.debug("Enter the rate of interest : \n");
        rate=sc.nextDouble();
        M.debug("Enter the time duration :  \n");
        time=sc.nextInt();
        M.debug("enter your choice : 1 for simple interest or 2 for compound interest : \n");
        choice=sc.nextInt();
        if(choice==1)
        {
            si=(principle*rate*time)/100;
            System.out.printf("Simple Interest is : %f \n",si);
        }
        else if(choice == 2)
        {
            ci=principle*Math.pow((1+(rate/100)),time);
            System.out.printf("Compound Interest is : %f \n",ci);
        }
        else
            M.debug("invalid input : \n");
    }

}

class Construction
{
	public static final Logger M=LogManager.getLogger(Construction.class);
	void estimation() throws IOException
    {
        String standard,automation ;
        double area,estimate;
        
        String type1="standard material",type2="above standard material",type3="highly standard material",automation1="no",automation2="yes";
        Scanner sc = new Scanner (System.in);
        M.debug("enter the material of the house : \n");
        standard = sc.nextLine();
        M.debug("enter whether the house is fully automated : \n");
        automation=sc.nextLine();
        M.debug("enter the area of the house : \n");
        area=sc.nextDouble();
        if(standard.compareTo(type1)==0 && automation.compareTo(automation1)==0)
        {
            estimate=area*1200;
            System.out.printf("The estimated cost is : %f \n",estimate);
        }
        else if(standard.compareTo(type2)==0 && automation.compareTo(automation1)==0)
        {
            estimate=area*1500;
            System.out.printf("The estimated cost is : %f \n",estimate);
        }
        else if(standard.compareTo(type3)==0 && automation.compareTo(automation1)==0)
        {
            estimate=area*1800;
            System.out.printf("The estimated cost is : %f \n",estimate);
        }
        else if(standard.compareTo(type3)==0 && automation.compareTo(automation2)==0)
        {
            estimate=area*2500;
            System.out.printf("The estimated cost is : %f \n",estimate);
        }
        else
            {
                System.out.printf("wrong input : ");
            }
    }

}
