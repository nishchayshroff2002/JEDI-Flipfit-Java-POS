package com.flipfit.client;
import com.flipfit.bean.FlipFitAdmin;

import java.util.Scanner;

public class ApplicationClient {
    public void startFunction()
    {
        System.out.println("Welcome to FlipFit");
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("enter 1 to register,2 to login");
            int num=sc.nextInt();
            if(num==1)
            {

                System.out.println("Enter 1 if you are customer, 2 if you are a gym owner");
                int val=sc.nextInt();
                switch(val)
                {
                    case 1:
                        CustomerFlipFitMenu.register();
                        break;
                    case 2:
                        GymOwnerFlipFitMenu.register();
                        break;
                    default:
                        System.out.println("Invalid");
                }

            }
            else  if(num==2)
            {

                System.out.println("Enter 1 if you are customer, 2 if you are a gym owner,3 if you are an admin");
                int val=sc.nextInt();
                switch(val)
                {
                    case 1:
                        CustomerFlipFitMenu.login();
                        break;
                    case 2:
                        GymOwnerFlipFitMenu.login();
                        break;
                    case 3:
                        FlipFitAdmin.login();
                        break;
                    default:
                        System.out.println("Invalid");
                }

            }



        }
    }
}
