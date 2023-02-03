package com.pgdock.pgdock.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PgModel1 {

    @Id
    public int id;
    public String pdMname;
    public PgModel1(){}
    public PgModel1(int id, String pdMname) {
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
