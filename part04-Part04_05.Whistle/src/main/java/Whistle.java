/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jtrice
 */
public class Whistle {
    private String sound;
    
    public Whistle(String whistleSound) {
        this.sound = whistleSound;
    }
    
    public void sound() {
        System.out.println(this.sound);
    }
}
