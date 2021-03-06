package mv.model.ins.bool;

import mv.model.cpu.ExecutionManager;
import mv.model.cpu.Memory;
import mv.model.cpu.OperandStack;
import mv.model.ins.Instruction;
import mv.model.mvsystem.in.InStream;
import mv.model.mvsystem.out.OutStream;

public class Not extends Bool {
	
	public Not() {
		super();
	}

	public void execute (Memory<Integer> mem, OperandStack<Integer> pila, ExecutionManager gestor, InStream in, OutStream out) {
		int cima = pila.pop();
			
		if (cima == 0) pila.push(1);
		else pila.push(0);
	}
	
	protected Instruction crear() {
		return new Not();
	}
	
	public String toString() {
		return "NOT";
	}
}