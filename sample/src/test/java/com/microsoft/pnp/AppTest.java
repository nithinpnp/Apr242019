package com.microsoft.pnp;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void it_should_char_seq() {

        int N = 3;

        CharacterSequencer sequencer = new CharacterSequencer(N);

        while(sequencer.hasNext()){
            sequencer.getNext();
        }
    }
}
