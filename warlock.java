/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arena;

/**
 *
 * @author CrazyGreekDude
 */
public class warlock {
     String name;
    int life;
    char sex;
    int attack_power;
    int defence_power;
    float agility;
    int ready_for_special_attack;

    public warlock( char[] a, char b ){
        this.name=new String(a);
        this.life=1000;
        this.sex=b;
        this.attack_power= 7 * this.life / 100;
        if ("M".equals(this.sex)){
            this.attack_power+= 20* this.life / 1000;
        }
        this.defence_power= 15 * this.life /1000;
        this.agility = 60/100;
        if ("F".equals(this.sex)){
            this.agility+=40/100;
        }
        ready_for_special_attack=0;
            
    }
    
    public int normal_attack(int a, float b, int c){
    /*    if (c == 5){
            return special_attack();
        }
    */   return (int) (a + a * b);
    }
    
    // a is attack power, b is def, c is ready for specialattack 
    public int defend(int a, int b, int c){
        c++;
        return a-b; 
    }
    
/*   public int special_attack(){
        
    } */
    
}
