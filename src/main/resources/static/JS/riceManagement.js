import { Rice } from "./rice.js";

class RiceManagement {
    
    async toRiceArray() {
        let rawDatas = await this.getAllRices(); 
        let result = [];
        rawDatas.forEach(rice => {
            rice.image = rice.image.replaceAll("\\", "/");
            rice.image = "file:///" + rice.image;
            result.push(new Rice(rice.name, rice.image, rice.kilograms, rice.price, rice.brand, rice.description));
        });
        return result;
    }

    async getAllRices() {
        const response = await fetch("/api/rice");
        return response.json();
    }

    async toHTML(selector) {
        let count = 0;
        let riceList = await this.toRiceArray();
        console.log(riceList.length);
        const parent = document.querySelector(selector);
        for(let rice of riceList) {
            if(count % 4 == 0) {
                parent.innerHTML += `
                    <div class="rice_row"></div>
                `
            }

            const div = document.querySelectorAll(".rice_row")[document.querySelectorAll(".rice_row").length - 1];
            div.innerHTML += rice.toHTML(`
            <div class="rice_col">
                <img src= ${undefined} alt="" class="rice_col_img">
                <div class="rice_col_info">
                    <h2 class="rice_col_title">${undefined}</h2>
                    <p class="rice_col_price">${undefined}</p>
                </div>
            </div>
            `, rice.image, rice.name, rice.formatPrice());
            count++;
        }   
    }
}

let riceManagement = new RiceManagement();
riceManagement.toHTML(".rice_list");


