package com.createsapp.shoppingcart.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.createsapp.shoppingcart.databinding.ShopRowBinding;
import com.createsapp.shoppingcart.models.CartItem;
import com.createsapp.shoppingcart.models.Product;
import com.createsapp.shoppingcart.repositories.CartRepo;
import com.createsapp.shoppingcart.repositories.ShopRepo;

import java.util.List;

public class ShopViewModel extends ViewModel {

    ShopRepo shopRepo = new ShopRepo();
    CartRepo cartRepo = new CartRepo();

    MutableLiveData<Product> mutableLiveData = new MutableLiveData<>();

    public LiveData<List<Product>> getProducts() {
        return shopRepo.getProducts();
    }

    public void setProduct(Product product) {
        mutableLiveData.setValue(product);
    }

    public LiveData<Product> getProdcut(){
        return mutableLiveData;
    }

    public LiveData<List<CartItem>> getCart(){
        return cartRepo.getCart();
    }

    public boolean addItemToCart(Product product){
        return cartRepo.addItemToCart(product);
    }

}
