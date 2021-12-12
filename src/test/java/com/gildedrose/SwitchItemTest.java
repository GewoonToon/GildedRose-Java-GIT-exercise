package com.gildedrose;

import com.gildedrose.core.GildedRose;
import com.gildedrose.core.Item;
import com.gildedrose.items.AgingItem;
import com.gildedrose.items.SwitchItem;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwitchItemTest {
    private Item[] items = new Item[] {new SwitchItem("Aged Brie", 10, 20)};
    private Item[] items2 = new Item[] {new SwitchItem("Aged Brie", -4, 20)};
    private GildedRose app = new GildedRose(items);
    private GildedRose app2 = new GildedRose(items2);


    @Test
    public void sellInValueKleinerDanNul(){
        app2.calculateNextDay();
        assert(app2.items[0].quality == 19);
    }

    @Test
    public void sellInValueGroterDanNul(){
        app.calculateNextDay();
        assert(app.items[0].quality == 21);
    }
}