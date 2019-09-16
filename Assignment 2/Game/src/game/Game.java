/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author Sameer Naumani
 */
import java.util.Random;

public class Game {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) 
    {
        int strategy1Count = 0;
        int strategy2Count = 0;
        final int NUMBER_OF_RUNS = 1000;
        Random generator = new Random();
        
        //Simulate the game 1000 times
        for (int i = 0; i < NUMBER_OF_RUNS; i++){
            int doorWithCar = generator.nextInt(3);
            int playerDoorPick = generator.nextInt(3);  //fill here
            
            // Host must pick a door that is not the player's door and not the 
            // door with the car
            int hostpickDoor;
            if (playerDoorPick == doorWithCar)
            {
                // Player picked the car, just pick either of the other two doors
                hostpickDoor = (generator.nextInt(2) + 1 + playerDoorPick) % 3;
            }
            else
            {
                /**
                 *Host has only one choice, the door that is left over. We can
                 do this in one step by adding the current player door with the
                 car door to yield a number between 1 and 3, if we subtract 3
                 from that, we get the leftover door
                 */
                hostpickDoor = Math.abs((playerDoorPick + doorWithCar)-3);  //Fill here
            }
            
            //Same trick as the above case
            int playerDoorSwitch = Math.abs((playerDoorPick + hostpickDoor)-3);//Fill here
            
            if (playerDoorSwitch == doorWithCar){
                strategy1Count++;
            }
            if (playerDoorPick == doorWithCar){
                strategy2Count++;
            }
        }
        
        System.out.printf("After %d runs, strategy 1 yielded %d wins while" + "strategy 2 yielded %d.%n", NUMBER_OF_RUNS, strategy1Count, strategy2Count);
    }
    
    
}
