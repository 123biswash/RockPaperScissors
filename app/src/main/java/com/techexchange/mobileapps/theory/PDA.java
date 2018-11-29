package com.techexchange.mobileapps.theory;
import java.util.*;

public class PDA {
    private String currState;
    private HashMap<String,String> alphabet;
    private HashMap<String, PState> states;
    private Stack<String> stack;

    public PDA (String start, HashMap<String,String> alphabet, HashMap<String, PState> states){
        this.currState = start; // The current state name of the machine is initially it's start state
        this.alphabet = alphabet;
        this.states = states; // a dictionary of name: State
        this.stack = new Stack<String>(); // initialize empty stack
    }

    public String getNextState(String input){
        HashMap<String, String> transitions = this.states.get(this.currState).getTransitions();
        String nextStateName = transitions.get(input);
        // String nextStateName = nextState.getStateName();
    /*
      Stack logic
      R, S -> P || R, EPS -> P
    */
        String popped = "EPS";
        if (!this.stack.isEmpty()){
            popped = this.stack.pop();
        }
        String read = input;
        String pushed = nextStateName;
        this.stack.push(pushed);
    /*
      PDA Style
      Q: input, popped -> pushed :Q+
    */
        String transitionString = this.currState + ": " + read + ", " + popped + " -> " + pushed + " :" + nextStateName;
        // Current state is now the next state
        this.currState = nextStateName;

        return nextStateName;

    }

    public String getCurrentState(){
        return this.currState;
    }
}
