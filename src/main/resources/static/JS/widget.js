import { formatPrice } from "./Utils/price.js"

class Widget {
    constructor(productSelector, newsSelector) {
        this.productWidget = document.querySelector(productSelector);
        this.newsWidget = document.querySelector(newsSelector);
    }

    generateLinkForItem() {
        formatPrice(".product-widget_link_info_price")
        const products = this.productWidget.querySelectorAll(".product-widget_item");
        products.forEach(product => {
            const productName = product.querySelector(".product-widget_link_info_title").textContent;
            const productLink = product.querySelector(".product-widget_item > a");
            productLink.setAttribute("href", "/san-pham" + "/" + getSlug(productName));
        })
    }

    start() {
        this.generateLinkForItem();
    }
}

let widget = new Widget(".product-widget", ".news-widget");
widget.start();