import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

    @Test
    void createGame() {
        Game game = new Game();
        assertNotNull(game);
    }

    @Test
    void throwExceptionWhenInputIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            Game game = new Game();
            game.guess(null);
        });
    }
}
