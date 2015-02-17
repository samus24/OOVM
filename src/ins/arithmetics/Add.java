package ins.arithmetics;

import cpu.ExecutionManager;
import cpu.Memory;
import cpu.OperandStack;
import ins.Instruction;

public class Add extends Arithmetics {
	
	public Add() {
		super();
	}

	public boolean execute(Memory mem, OperandStack pila, ExecutionManager gestor) {
		if (pila.getSize() < 2) return false;
		else {
			int cima = pila.desapilar();
			int subcima = pila.desapilar();

			pila.apilar(subcima + cima);

			return true;
		}
	}
	
	protected Instruction crear() {
		return new Add();
	}
	
	public String toString() {
		return "ADD";
	}
}
