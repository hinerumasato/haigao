import { formatPrice } from "./Utils/price.js"
class Home {
    run() {
        formatPrice('.rice_col_price');
    }
}

let home = new Home();
home.run();