package com.example.testapp.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.testapp.model.Repository;
import com.example.testapp.model.network.ApiService;
import com.example.testapp.model.NetworkData;

import io.reactivex.Maybe;

public class MainActivityViewModel extends AndroidViewModel {
   public Repository repository;
    private LiveData<NetworkData> itemResponseLiveData;
    public MainActivityViewModel(@NonNull Application application) {
        super(application);
         repository = Repository.getInstance(application);
         itemResponseLiveData= repository.getAllData();
    }
    public LiveData<NetworkData> getResponseLiveData() {
        return itemResponseLiveData;
    }
}

