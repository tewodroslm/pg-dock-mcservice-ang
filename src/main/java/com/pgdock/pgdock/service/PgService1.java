package com.pgdock.pgdock.service;

import com.pgdock.pgdock.dto.PgDto1;
import com.pgdock.pgdock.model.PgModel1;
import com.pgdock.pgdock.repository.PgRepository1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PgService1 {

    PgRepository1 pgRepository1;

    Logger logger = LoggerFactory.getLogger(PgService1.class);


    PgService1(PgRepository1 pr){
        this.pgRepository1 = pr;
    }

    public PgDto1 create(PgDto1 pgDto1){
        logger.info("Inside Create : {}", pgDto1);
        PgModel1 pgModel1 = new PgModel1(pgDto1.getId(), pgDto1.getPdMname());
        pgRepository1.save(pgModel1);
        logger.info("Created successfully");
        return pgDto1;
    }

    public List<PgDto1> get() {
        logger.info("Inside get all data");
        List<PgDto1> liPg = pgRepository1.findAll().stream()
                .map(pgModel1 -> mapPgModel(pgModel1))
                .collect(Collectors.toList());
        logger.info("All data {}", liPg);
        return liPg;
     }

    private PgDto1 mapPgModel(PgModel1 pgModel1) {
        PgDto1 pgDto1 = new PgDto1(pgModel1.getId(), pgModel1.getPdMname());
        return pgDto1;
    }


}
