import { Product } from "./product.js";
import { formatPrice } from "./Utils/price.js";

class ProductManagement {
    constructor(selector) {
        this.products = document.querySelectorAll(selector);
    }

    generateLinkToProduct() {
        this.products.forEach(productNode => {
            const product = new Product(productNode);
            product.generateLinkToProduct();
        })
    }

    formatPrice() {
        formatPrice(".product-container_item_price");
    }

    start() {
        this.generateLinkToProduct();
        this.formatPrice();
    }
}

const productManagement = new ProductManagement(".product-container_item");
productManagement.start();