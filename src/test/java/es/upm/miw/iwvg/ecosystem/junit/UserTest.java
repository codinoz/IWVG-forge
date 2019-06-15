package es.upm.miw.iwvg.ecosystem.junit;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    private User user1;

    private User user2;

    @BeforeEach
    void beore(){
        user1 = new User(1, "erich", "gamma");
        user2 = new User(1, "ERICH", "GAMMA");
    }

    @Test
    void testFullName(){
        assertEquals("Erich Gamma", user1.fullName());
        assertEquals("Erich Gamma", user2.fullName());
    }

    @Test
    void testInitials(){
        assertEquals("E.", user1.initials());
        assertEquals("E.", user2.initials());
    }


}
