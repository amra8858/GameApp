/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.brain.gaming;


import javax.swing.JFrame;

public class FrameGame extends JFrame{
     public FrameGame(){
         Board board = new Board();
		FrameGame frame= new FrameGame();
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setTitle("Game Dev In Java");
                setSize(1500,920);
                setResizable(false);
                setLocationRelativeTo(null);
                add(board);
                setVisible(true);
     }
		 public static void main(String[] args){
                     new FrameGame();
                        
	/* {
		Board board = new Board();
		setVisible(true);
		setSize(1500,800);
		setResizable(false);
		setTitle("Game Development in Java");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(board);
	}*/
	
	}
}


/**
 *
 * @author Amra
 */
