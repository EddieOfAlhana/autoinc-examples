/*
Task: 
Toggle doors challenge

Description:
n doors in a row are all initially closed. You make
n passes by the doors. The first time through, you
visit every door and toggle the door (if the door is
closed, you open it; if it is open, you close it).
The second time you only visit every 2nd door (door
#2, #4, #6, ...). The third time, every 3rd door
(door #3, #6, #9, ...), etc, until you only visit
the nth door.

Question: What state are the doors in after the last
pass? Which are open, which are closed?

Interface to be implemented:
public Boolean[] toggleDoors(Integer numberOfDoors) 

Examples:
1) input: 1 result: (true)
2) input: 2 result: (true, false)
3) input: 4 result: (true, false, false, true)
4) input: 9 result: (true, false, false, true, false, false, false, false, true)
*/

public Boolean[] toggleDoors(Integer numberOfDoors) {
    Boolean[] result = new Boolean[numberOfDoors];
    for (Integer i = 0; i < numberOfDoors; ++i) {
        result[i] = false;
    }

    for (Integer i = 1; i <= numberOfDoors; ++i) {
        for (Integer j = i; j <= numberOfDoors; j = j + i) {
            result[j-1] = !result[j-1];
        }
    }

    return result;
}
