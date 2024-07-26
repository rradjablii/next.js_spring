package com.gossip.api.item;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Item {

    private Integer id;
    @Setter
    private String name;
    @Setter
    private String url;

}
