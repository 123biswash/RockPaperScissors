package com.techexchange.mobileapps.theory;
import java.util.*;

public class PState {
    private String name;
    private HashMap<String, String> transitions;

    public PState (String name){
        this.name = name; // The name of the state, our states our numbered
        this.transitions = new HashMap<String, String>(); // a has map of input: next state name
    }

    public HashMap<String, String> getTransitions () {
        return this.transitions;
    }

    public String getStateName(){
        return this.name;
    }

    public void setTransition(String char_, String stateName){
        this.transitions.put(char_, stateName);
    }

}
