/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gonnagoraiding;

/**
 *
 * @author CrazyGreekDude
 */
public class hunter {
    String name;
    int life;
    char sex;
    int attack_power;
    int defence_power;
    float agility;
    int ready_for_special_attack;

    public hunter( char[] a, char b ){
        this.name=new String(a);
        this.life=1000;
        this.sex=b;
        this.attack_power=5 * this.life / 100;
        if ("M".equals(this.sex)){
            this.attack_power+=25* this.life / 1000;
        }
        this.defence_power= 25 * this.life /1000;
        this.agility = 40/100;
        if ("F".equals(this.sex)){
            this.agility+=20/100;
        }
            
    }
    
    public int normal_attack(int a, float b){
        return (int) (a + a * b);
    }
    
    // a is attack power, b is def, c is ready for specattack (pun not intended)
    public int defend(int a, int b, int c){
        c++;
        return a-b; 
    }
    
    
}
