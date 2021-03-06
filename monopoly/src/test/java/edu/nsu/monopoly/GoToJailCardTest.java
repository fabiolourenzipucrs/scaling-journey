package edu.nsu.monopoly;

import static org.junit.Assert.*;

import org.junit.*;

import edu.ncsu.monopoly.Card;
import edu.ncsu.monopoly.GameBoardCCJail;
import edu.ncsu.monopoly.GameMaster;
import edu.ncsu.monopoly.IOwnable;
import edu.ncsu.monopoly.JailCard;
import edu.ncsu.monopoly.MockGUI;

public class GoToJailCardTest {
    GameMaster gameMaster;
    Card jailCard = new JailCard(Card.TYPE_CC);
    
    @Before
    public void setUp() {
		gameMaster = GameMaster.instance();
		gameMaster.setGameBoard(new GameBoardCCJail());
		gameMaster.setNumberOfPlayers(1);
		gameMaster.reset();
		gameMaster.setGUI(new MockGUI());
		gameMaster.getGameBoard().addCard(jailCard);
    }
    
    @Test
    public void testJailCardAction() {
		Card card = gameMaster.drawCCCard();
		assertEquals(jailCard, card);
		card.applyAction();
		IOwnable cell = gameMaster.getCurrentPlayer().getPosition();
		assertEquals(gameMaster.getGameBoard().queryCell("Jail"), cell);
    }
    
    @Test
    public void testJailCardLabel() {
        assertEquals("Go to Jail immediately without collecting" +
        		" $200 when passing the GO cell", jailCard.getLabel());
    }
    
    @Test
    public void testJailCardUI() {
        gameMaster.movePlayer(0, 1);
        assertTrue(gameMaster.getGUI().isDrawCardButtonEnabled());
        assertFalse(gameMaster.getGUI().isEndTurnButtonEnabled());
        gameMaster.btnDrawCardClicked();
        assertFalse(gameMaster.getGUI().isDrawCardButtonEnabled());
		IOwnable cell = gameMaster.getCurrentPlayer().getPosition();
		assertEquals(gameMaster.getGameBoard().queryCell("Jail"), cell);
		assertTrue(gameMaster.getGUI().isEndTurnButtonEnabled());
    }
}
