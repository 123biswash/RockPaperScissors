package com.techexchange.mobileapps.theory;
import java.util.*;

public class MachineParser {
    private String[] machineContents;

    public MachineParser(String machine){
        this.machineContents = machine.split("\n");
    }

    private ArrayList<String> getStatesList(){
        String statesString = this.machineContents[0].split(": ")[1];

        ArrayList<String> statesList = new ArrayList<String>(Arrays.asList(statesString.split("\\s*,\\s*")));

        return statesList;
    }

    private HashMap<String, String> getStateAlphabetMapping(){
        String mappingString = this.machineContents[1].split(": ")[1];

        mappingString = mappingString.replace("{", "");
        mappingString = mappingString.replace("}","");

        final ArrayList<String> mappingArrayList = new ArrayList<String>(Arrays.asList(mappingString.split(",")));

        HashMap<String, String> stateAlphabetMap = new HashMap<String, String>(){
            {
                for (String mapping : mappingArrayList) {
                    String arrayOfMapping[] = mapping.split(":");
                    put(arrayOfMapping[0], arrayOfMapping[1]);
                }
            }

        };

        return stateAlphabetMap;

    }

    private String getStartState(){
        String startState = machineContents[2].split(": ")[1];
        return startState;
    }

    private HashMap<String, PState> getStateStringStateObjectMap(){
        ArrayList<ArrayList<String>> listOfTransitions = new ArrayList<ArrayList<String>>();

        for (int i=4; i < machineContents.length; ++i){
            listOfTransitions.add(new ArrayList<String>(Arrays.asList(machineContents[i].split(", "))));
        }

        // Get states and their respective transitions
        HashMap<String, PState> stateStrStateObj = new HashMap<String, PState>();
        ArrayList<String> statesList = getStatesList();
        for (String stateString : statesList){
            PState __state__ = new PState(stateString);

            for (ArrayList<String> transition : listOfTransitions){
                String currStateStr = transition.get(0);
                if (stateString.equals(currStateStr)){
                    String input = transition.get(1);
                    String nextStateStr = transition.get(2);
                    __state__.setTransition(input, nextStateStr);
                }
            }
            stateStrStateObj.put(stateString, __state__);
        }

        return stateStrStateObj;
    }

    public PDA getPDA(){
        HashMap<String, String> stateAlphabetMap = getStateAlphabetMapping();
        String startStateStr = getStartState();
        HashMap<String, PState> stateStrStateObj =  getStateStringStateObjectMap();

        PDA machine = new PDA(startStateStr, stateAlphabetMap, stateStrStateObj);

        return machine;
    }
}
