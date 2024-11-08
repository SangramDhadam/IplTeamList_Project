package com.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.controller.Controller;
import com.entity.Player;
import com.tka.sep28.IplPlayersLogic;

public class Teams {
	public static void main(String[] args) {

		List<Player> mi = new ArrayList<Player>();
		List<Player> csk = new ArrayList<Player>();
		List<Player> rcb = new ArrayList<Player>();
		
		while (true) {
			System.out.println("IPL Teams");
			System.out.println("1.Mumbai Indians");
			System.out.println("2.Chennai Super Kings  ");
			System.out.println("3.Royal Challengers Bangaluro");
			System.out.println("4.Exit");
			

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println(choice);
				Controller ct1 = new Controller();
				mi = ct1.getAllPlayerControllermi();

				break;
			case 2:
				System.out.println(choice);
				Controller ct2 = new Controller();
				csk = ct2.getAllPlayersControllercsk();

				break;
			case 3:
				System.out.println();
				Controller ct3 = new Controller();
				rcb = ct3.getAllPlayersControllerrcb();

				break;
			case 4:
				System.out.println(choice);
				System.out.println("Thank You for Using our System");
				
				break;
			
			default:
				System.out.println("Please Enter Valid Choice");
				break;
			}
			if (choice == 4) {
				break;
			}
			
		}

	}
}
