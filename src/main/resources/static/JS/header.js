class Header {

    constructor(selector) {
        this.header = document.querySelector(selector);
    }

    isMustBeFixed() {
        let scrollPos = window.scrollY;
        let headerPos = this.header.offsetTop;
        return headerPos - scrollPos < 0;
    }

    fixed() {
        this.header.style.position = "fixed";
        this.header.style.top = "0px";
        this.header.style.right = "0px";
        this.header.style.bottom = "0px";
        this.header.style.left = "0px";
        this.header.style.zIndex = "9999";
    }

    unfixed() {
        this.header.style.position = "relative";
    }

    run() {
        window.onscroll = () => {
            if(header.isMustBeFixed())
                header.fixed();
            else header.unfixed();
        }
    }
}

let header = new Header(".nav_header");
header.run();