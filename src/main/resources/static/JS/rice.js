class Rice {
    constructor(name, image, kilograms, price, brand, description) {
        this.name = name;
        this.image = image;
        this.kilograms = kilograms;
        this.price = price;
        this.brand = brand;
        this.description = description;
    }

    formatPrice() {
        let temp = String(this.price);
        let result = "";
        let count = 0;
        for(let i = temp.length - 1; i >= 0; i--) {
            result = temp.charAt(i) + result;
            count++;
            if(count % 3 == 0) result = '.' + result;
        }
        return (temp.length % 3 == 0) ? result.slice(1, result.length) + "đ" : result + "đ";
    }

    toHTML(html, ...rest) {
        for(let item of rest)
            html = html.replace("undefined", item);
        console.log(html);
        return html;
    }

}

export { Rice };