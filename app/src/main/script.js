function getImageUrls() {
    let images = document.querySelectorAll("img");
    let urls = [];
    images.forEach(img => urls.push(img.src));
    Android.processImage(JSON.stringify(urls));  // Kotlin に送信
}

window.onload = getImageUrls;
