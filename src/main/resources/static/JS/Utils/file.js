function renderImgFile(fileInput) {
    if(fileInput.files && fileInput.files[0]) {
        let reader = new FileReader();

        reader.onload = e => {
            const loadIcon = document.querySelector(".fas.fa-cloud-upload-alt.tm-upload-icon")
            const imgField = document.querySelector(".tm-product-img-dummy.mx-auto")
            const img = document.createElement("img");
            console.log(e.target.result);
            img.setAttribute("src", e.target.result);
            img.style.width = `100%`;
            img.style.height = `240px`;
            
            if(loadIcon)
                imgField.removeChild(loadIcon);
            else {
                const oldImg = imgField.querySelector('img');
                imgField.removeChild(oldImg);
            }
            imgField.appendChild(img);
        }

        reader.readAsDataURL(fileInput.files[0]);
    }
}