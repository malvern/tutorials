package com.baeldung;

public class Packing<T> {
    private T packingContents;

    public T getPackingContents() {
        return packingContents;
    }

    public void setPackingContents(T packingContents) {
        this.packingContents = packingContents;
    }
}
