package com.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalogue implements Products {

    private List<Products> productCatalogueList = new ArrayList<Products>();

    @Override
    public void showProductDetails() {
        for (Products product : productCatalogueList) {
            product.showProductDetails();
        }
    }

    public void addProductToCatalogue(Products product) {
        productCatalogueList.add(product);
    }

    public void removeProductFromCatalogue(Products product) {
        productCatalogueList.remove(product);
    }
}
