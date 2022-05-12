package com.milos.vulic.quiz.Iterator;


public class Validate implements Collection{
    private String validation[];

    public Validate(String[] validation) {
        this.validation = validation;
    }

    @Override
    public Iterator getIterator() {
        return new userValidate();
    }
    private class userValidate implements Iterator{
        int index;
        @Override
        public boolean hasNext() {
            if(index<validation.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return validation[index++];
        }
    }
}
