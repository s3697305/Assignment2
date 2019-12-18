/*
  RMIT University Vietnam
  Course: INTE2512 Object-Oriented Programming
  Semester: 2019C
  Assessment: Assignment 2
  Author: Nguyen Quoc Hoang
  ID: s3697305
  Created  date: 11/12/2019
  Last modified: 16/12/2019
  Acknowledgement: javafx Media Player by Prof. Quang
*/

package game;

public class Card {
    private String name;

    public Card (String name) {
        this.name = name;
    }

    public Card () {
    }

    public String getName() {
        return this.name;
    }
}
