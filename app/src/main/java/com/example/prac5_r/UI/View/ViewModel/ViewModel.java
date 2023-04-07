package com.example.prac5_r.UI.View.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.prac5_r.Data_layer.DataSource.Custom;
import com.example.prac5_r.Data_layer.DataSource.User;
import com.example.prac5_r.Data_layer.Repository;

public class ViewModel extends androidx.lifecycle.ViewModel {

    private final MutableLiveData<Repository> clientUI =
            new MutableLiveData(new Repository(new User(null, null, null)));
    private final MutableLiveData<Repository> itemID =
            new MutableLiveData(new Repository(new Custom(null, null)));

    public LiveData<Repository> getClientUI() {
        return clientUI;
    }

    public void addClient(String name, String email, String password) {
        clientUI.setValue(
                new Repository(new User(name, email, password))
        );
    }

    public LiveData<Repository> getItemID() {
        return itemID;
    }

    public void addItem(Integer imageId, String itemText) {
        itemID.setValue(
                new Repository(new Custom(imageId, itemText))
        );
    }
}
