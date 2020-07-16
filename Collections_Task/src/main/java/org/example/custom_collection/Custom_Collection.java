package org.example.custom_collection;

public class Custom_Collection {
    private Object[] objArray =new Object[10];
    private int elementcount = 0;

    public void add(Object obj) {
        if (elementcount == objArray.length) {
            increasecapacity();
        }
        objArray[elementcount] = obj;
        elementcount++;
    }

    public void increasecapacity() {
        int newcapacity = objArray.length * 2;
        Object[] nextArray = new Object[newcapacity];
        for (int i = 0; i < objArray.length; i++) {
            nextArray[i] = objArray[i];
        }
        objArray = nextArray;
    }

    public int size() {
        return elementcount;
    }

    public int capacity() {
        return objArray.length;
    }

    public Object get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Give Proper index");
        }
        return objArray[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Give Proper Index");
        }
        while (index < size() - 1) {
            objArray[index] = objArray[index + 1];
            index++;
        }
        objArray[index] = null;
        elementcount--;
    }
    public void print(int start,int len){
        for(int i=start;i<objArray.length;i++){
            System.out.print(objArray[i]+" ");
        }
        System.out.println(" ");
    }


}