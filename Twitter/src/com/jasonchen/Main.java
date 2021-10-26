package com.jasonchen;

public class Main {
    // Events happen
    public static void main(String[] args) {
	    Person Bob = new Person("Bob");
        Person Amy = new Person("Amy");
        Person Cathy = new Person("Cathy");
        Person David = new Person("David");
        Person Eva = new Person("Eva");

        Person Trump = new Person("Trump");
        Person Biden = new Person("Biden");

        Bob.followerPerson(Trump);
        Amy.followerPerson(Trump);
        Cathy.followerPerson(Trump);

        David.followerPerson(Biden);
        Eva.followerPerson(Biden);
        
    }
}
