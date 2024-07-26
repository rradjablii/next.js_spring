package com.gossip.api.service;

import com.gossip.api.item.ResponseItem;

import java.util.ArrayList;

public interface ItemService {
    public ArrayList<ResponseItem> getRandomItems();
}
