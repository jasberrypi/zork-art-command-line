/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author gigadot
 */
public class LightOffCommand implements Command {

    @Override
    public void apply() {
        System.out.println("Light turned off");
    }
    
}
