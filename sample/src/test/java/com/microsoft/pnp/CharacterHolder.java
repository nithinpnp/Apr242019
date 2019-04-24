package com.microsoft.pnp;




public class CharacterHolder implements IHolder<Character> {


    int i = -1;
    int pre = i;
    Character[] chars;
    private Character val;
    private Character defaultVal;


    public CharacterHolder() {
        chars = new Character[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        this.val = chars[0];
        this.defaultVal = chars[0];

    }

    @Override
    public Character getNext() {

        pre = i;
        i = ++i % chars.length;
        this.val = chars[i];
        return this.val;
    }

    @Override
    public void setVal(Character val) {
        this.val = this.getNext();
    }

    @Override
    public Character getVal() {
        return val;
    }

    @Override
    public Character getDefaultVal() {
        return defaultVal;
    }

    @Override
    public boolean maxReached() {

        if (pre > i) {

            if (this.val == defaultVal) {
                return true;
            }
        }

        return false;
    }


}
