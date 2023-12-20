/**
 * Problem 8 
 * Sameer Ahmed
 */
public class ASMEmulator{
    private static int eax;
    private static int ebx;
    private static int ecx;
    private static int edx;

    public static void mov(String reg1, int val){
        switch(reg1){
            case "eax": eax = val; break;
            case "ebx": ebx = val; break;
            case "ecx": ecx = val; break; 
            case "edx": edx = val; break;
        }
    }
    public static void mov(String reg1, String reg2){
        //get data from the registry represented by label stored in reg2
        int tempData = 0;
        switch(reg2){
            case "eax": tempData = eax; break;
            case "ebx": tempData = ebx; break;
            case "ecx": tempData = ecx; break;
            case "edx": tempData = edx; break;
        }
        //move the data to the register represented by the label stored in reg1
        mov(reg1, tempData);
    }
    public static void add(String reg1, int val){
        switch(reg1){
            case "eax": eax = eax + val; break;
            case "ebx": eax = ebx + val; break; 
            case "ecx": eax = ecx + val; break;
            case "edx": eax = edx + val; break;
        }
    }
    public static void add(String reg1, String reg2){
        int tempData = 0;
        switch(reg2){
            case "eax": tempData = eax; break;
            case "ebx": tempData = ebx; break; 
            case "ecx": tempData = ecx; break;
            case "edx": tempData = edx; break;
        }
        add(reg1, tempData);
    }
    public static void imul(String reg1, int val){
        switch(reg1){
            case "eax": eax = eax * val; break;
            case "ebx": eax = ebx * val; break; 
            case "ecx": eax = ecx * val; break;
            case "edx": eax = edx * val; break;
        }  
    }
    public static void imul(String reg1, String reg2){
        int tempData = 0;
        switch(reg2){
            case "eax": tempData = eax; break;
            case "ebx": tempData = ebx; break; 
            case "ecx": tempData = ecx; break;
            case "edx": tempData = edx; break;
        }
        imul(reg1, tempData);
    }
    public static void cmp(String reg1, int val){
        switch(reg1){
            case "eax": if(eax == val){eax = 1;} else{eax = 0;}break;
            case "ebx": if(ebx == val){ebx = 1;} else{ebx = 0;}break;
            case "ecx": if(ecx == val){ecx = 1;} else{ecx = 0;}break;
            case "edx": if(edx == val){edx = 1;} else{edx = 0;}break;
        }
    }
    public static void cmp(String reg1, String reg2){
        int tempData = 0;
        switch(reg2){
            case "eax": if(eax == tempData){eax = 1;} else{eax = 0;}break;
            case "ebx": if(ebx == tempData){ebx = 1;} else{ebx = 0;}break;
            case "ecx": if(ecx == tempData){ecx = 1;} else{ecx = 0;}break;
            case "edx": if(edx == tempData){edx = 1;} else{edx = 0;}break;
        }
        cmp(reg1, tempData);
    }
    public static void call(String proc, String reg1){
        if(proc.equals("PRINT")){
            switch(reg1){
                case "eax": System.out.println("[eax]: "+ eax); break;
                case "ebx": System.out.println("[ebx]: "+ ebx); break;
                case "ecx": System.out.println("[ecx]: "+ ecx); break;
                case "edx": System.out.println("[edx]: "+ edx); break;
            }
        }
    }
}