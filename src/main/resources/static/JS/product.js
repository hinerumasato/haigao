import { getSlug } from "./Utils/slug.js";

class Product {
    constructor(product) {
        this.product = product;
    }

    generateLinkToProduct() {    
        const productName = this.product.querySelector("h2").textContent.trim();
        const productLink = this.product.querySelector("a");
        productLink.setAttribute("href", "/san-pham" + "/" + getSlug(productName));
    }
}

export { Product };