package com.pgdock.pgdock.dto;

public class PgDto1 {
    public int id;
    public String pdMname;

    public PgDto1(int id, String pdMname) {
        this.id = id;
        this.pdMname = pdMname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPdMname() {
        return pdMname;
    }

    public void setPdMname(String pdMname) {
        this.pdMname = pdMname;
    }
}
