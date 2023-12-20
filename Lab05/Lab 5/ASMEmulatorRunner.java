import java.util.Scanner;

public class ASMEmulatorRunner
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		while(input.hasNextLine() == true)
		{
			String line = input.nextLine();
			parseLine(line);
		}
	}

	public static void parseLine(String line)
	{
		Scanner parser = new Scanner(line);
		String instruction = parser.next();
		String reg1 = parser.next();
		if ( parser.hasNextInt() == true )
		{
			int value = parser.nextInt();
			executeMASM(instruction, reg1, value);
		}
		else
		{
			String reg2 = parser.next();
			executeMASM(instruction, reg1, reg2);
		}
	}

	public static void executeMASM(String cmd, String reg1, String reg2)
	{
		switch(cmd)
		{
			case "MOV": ASMEmulator.mov(reg1, reg2); break;
			case "ADD": ASMEmulator.add(reg1, reg2); break;
			case "IMUL": ASMEmulator.imul(reg1, reg2); break;
			case "CMP": ASMEmulator.cmp(reg1, reg2); break;
			case "CALL": ASMEmulator.call(reg1, reg2); break;

		}
	}

	public static void executeMASM(String cmd, String reg1, int val1)
	{
		switch(cmd)
		{
			case "MOV": ASMEmulator.mov(reg1, val1); break;
			case "ADD": ASMEmulator.add(reg1, val1); break;
			case "IMUL": ASMEmulator.imul(reg1, val1); break;
			case "CMP": ASMEmulator.cmp(reg1, val1); break;
		}
	}
}