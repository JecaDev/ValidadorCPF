package view;

import javax.swing.*;
import controller.CPFController;

public class Principal {

	public static void main(String[] args) {
		boolean continuar = true;
		CPFController CPFcont = new CPFController();
		while (continuar) {
		String CPF = JOptionPane.showInputDialog("Insira o seu CPF, sem pontos e hífen, para que possamos validá-lo");

			CPFcont.validaCPF(CPF);

		}
	}
}
