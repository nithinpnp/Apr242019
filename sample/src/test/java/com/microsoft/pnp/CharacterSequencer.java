package com.microsoft.pnp;

public class CharacterSequencer implements ISequence<IHolder> {


    CharacterHolder[] holders;
    int start;
    int end;
    int N;
    int rightMostIndexreachedSofar;
    boolean hasNext = true;


    public CharacterSequencer(int N) {

        start = 0;
        end = N - 1;
        rightMostIndexreachedSofar = end;
        this.N = N;
        holders = new CharacterHolder[N];

        for (int i = 0; i < N; i++) {
            holders[i] = new CharacterHolder();
        }
    }

    @Override
    public boolean hasNext() {

        if (rightMostIndexreachedSofar < 0) {
            return false;
        }
        return true;
    }

    @Override
    public void getNext() {
        int j = N - 1;
        holders[j].getNext();
        while (j >= 0 && holders[j].maxReached()) {
            j = j - 1;
            rightMostIndexreachedSofar = Math.min(rightMostIndexreachedSofar, j);
            if (rightMostIndexreachedSofar < 0) {
                return;
            }
            holders[j].getNext();
        }


        ;

        print(holders);
    }

    // print methods is exposed inside this class.. ideally this deligated out.,
    public void print(IHolder[] holders) {
        for (int i = 0; i < holders.length; i++) {
            System.out.print(holders[i].getVal());
        }

        System.out.println();
    }
}
