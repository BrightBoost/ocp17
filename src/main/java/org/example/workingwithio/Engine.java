package org.example.workingwithio;

import java.io.Serializable;

public class Engine {
    private int pk;

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "pk=" + pk +
                '}';
    }
}
