package com.techexchange.mobileapps.theory;

public class PDATestDriver {
    public static void driver(){
        String machine = "Q: 1, 2, 3\nE: {1:R,2:S,3:P}\ns: 1\nd: \n1, R, 3\n1, S, 3\n1, P, 2\n2, R, 1\n2, P, 3\n2, S, 3\n3, S, 2\n3, R, 1\n3, P, 1";
        String[] machine_ = machine.split("\n");

        for (int i=0; i < machine_.length; ++i){
            System.out.println(machine_[i]);
        }

        MachineParser parser = new MachineParser(machine);
        PDA pushdown = parser.getPDA();

        System.out.println("System start state: " + pushdown.getCurrentState());

        System.out.println("Next state on R: " + pushdown.getNextState("R"));

        System.out.println("Next state on P: " + pushdown.getNextState("P"));

        System.out.println("Next state on S: " + pushdown.getNextState("S"));

    }

}
