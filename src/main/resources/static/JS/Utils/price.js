function formatPrice(priceSelector) {
    let elements = document.querySelectorAll(priceSelector);
    elements.forEach(element => {
        let price = parseFloat(element.textContent);
        let temp = String(price);
        let result = "";
        let count = 0;
        for (let i = temp.length - 1; i >= 0; i--) {
            result = temp.charAt(i) + result;
            count++;
            if (count % 3 == 0) result = '.' + result;
        }
        element.textContent = (temp.length % 3 == 0) ? result.slice(1, result.length) + "đ" : result + "đ";
    })
}

export { formatPrice };