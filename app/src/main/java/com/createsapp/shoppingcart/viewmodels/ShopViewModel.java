package com.createsapp.shoppingcart.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.createsapp.shoppingcart.databinding.ShopRowBinding;
import com.createsapp.shoppingcart.models.Product;
import com.createsapp.shoppingcart.repositories.ShopRepo;

import java.util.List;

public class ShopViewModel extends ViewModel {

    ShopRepo shopRepo = new ShopRepo();

     public LiveData<List<Product>> getProducts(){
         return shopRepo.getProducts();
     }
}
