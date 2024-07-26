package com.gossip.api.service;

import com.gossip.api.item.Item;
import com.gossip.api.item.ResponseItem;
import org.apache.coyote.Response;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService{

    private int getRandomNumber(){
        return (int) (Math.random()*10);
    }
    ResponseItem dayi = new ResponseItem(
            "Dayi",
            "https://i.makeagif.com/media/4-21-2021/Vnk8_z.gif"
    );
    private final ArrayList<ResponseItem> hellomf = new ArrayList<>(List.of(dayi));


    Item item1 = new Item(
            1,
            "Docker",
            "https://static-00.iconduck.com/assets.00/docker-icon-2048x2048-5mc7mvtn.png"
    );
    Item item2 = new Item(
            2,
            "Dayi",
            "https://i.makeagif.com/media/4-21-2021/Vnk8_z.gif"
    );
    Item item3 = new Item(
            3,
            "GitHub",
            "https://cdn-icons-png.flaticon.com/512/25/25231.png"
    );

    ArrayList<Item> items = new ArrayList<>(Arrays.asList(item1, item2, item3));

    public ArrayList<ResponseItem> getRandomItems(){
        if(getRandomNumber()==4){
            return hellomf;
        }else{
            ArrayList<ResponseItem> responseItems = (ArrayList<ResponseItem>)
                    items.stream().map(e-> new ResponseItem(e.getName(),e.getUrl())).collect(Collectors.toList());
            Collections.shuffle(responseItems);
            return responseItems;
        }
    }

}
