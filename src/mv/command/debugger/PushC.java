package mv.command.debugger;

import mv.command.CommandInterpreter;
import mv.exceptions.cpuExceptions.NoInstructionsException;
import mv.ins.sequential.Push;

public class PushC extends Debugger {
	private int argumento;
	
	public PushC() {
		super();
	}
	
	public PushC (int n) {
		super();
		this.argumento = n;
	}
	
	/**
	 * Ejecuta el comando push para debuggear en ejecución.
	 * @throws NoInstructionsException 
	 */
	public void executeCommand() throws NoInstructionsException {
		cpu.step(new Push(this.argumento));
	}

	public CommandInterpreter crear() {
		
		return null;
	}

	public CommandInterpreter crear(int n) {
		return new PushC(n);
	}
	
	public CommandInterpreter crear(int n, int m) {
		
		return null;
	}
	
	public String toString() {
		return "PUSH " + this.argumento;
	}
}
