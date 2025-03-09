fun updateImageView(imageUrl: String, context: Context) {
    val bitmap = BitmapFactory.decodeFile(imageUrl)
    val processor = ImageProcessor(context)
    val enhancedBitmap = processor.enhanceImage(bitmap)

    // WebView に反映
    webView.evaluateJavascript("document.querySelector('img').src = '${imageUrl}'", null)
}
