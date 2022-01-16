package com.example.backandfront;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.text.SimpleDateFormat;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BasicController {

    @GetMapping(path = "/info")
    public List<String> getHallo() {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());


        List<String> tmpList = new ArrayList<>();
        tmpList.add( "Miau um: " + formatter.format(date));
        tmpList.add( "Service: BackAndFront " );
//        tmpList.add( "spring.data.mongodb.database: " + mongdatabase );
//        tmpList.add( "spring.data.mongodb.host: " + monghost );
//        tmpList.add( "spring.data.mongodb.port: " + mongport );
//        if(repository.existsById(0))
//            tmpList.add( "Mongo Online");
//        else
//            tmpList.add( "Mongo Offline");


        return tmpList;
    }


}
