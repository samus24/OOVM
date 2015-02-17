package mv.ins.branch;

import mv.cpu.ExecutionManager;
import mv.cpu.Memory;
import mv.cpu.OperandStack;
import mv.ins.Instruction;
import mv.mvSystem.in.InStream;
import mv.mvSystem.out.OutStream;

public class BF extends Branch {
	
	public BF() {
		super();
	}
	public BF (int n) {
		super();
		this.argumento = n;
	}
	
	public void execute (Memory<Integer> mem, OperandStack<Integer> pila, ExecutionManager gestor, InStream in, OutStream out) {
		if (this.argumento < 0) throw new IllegalArgumentException("La posici�n a saltar debe ser positiva");
	
		if (pila.pop() == 0)
			gestor.setNextPC(this.argumento);
	}

	protected Instruction crear(int n) {
		
		return new BF (n);
	}

	public String toString() {
		return "BF " + this.argumento;
	}
}
