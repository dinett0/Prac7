package com.example.prac5_r.Data_layer;

import com.example.prac5_r.Data_layer.DataSource.Custom;
import com.example.prac5_r.Data_layer.DataSource.User;

public class Repository {
    private User client;
    private Custom item;

    public Repository(User client) {
        this.client = client;
    }

    public Repository(Custom item) {
        this.item = item;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public Custom getItem() {
        return item;
    }

    public void setItem(Custom item) {
        this.item = item;
    }
}
