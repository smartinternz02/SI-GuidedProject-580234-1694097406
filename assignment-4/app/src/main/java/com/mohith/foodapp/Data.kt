package com.mohith.foodapp
data class Data(
    val CatId: String,
    val CatName: String,
    val LongDescription: String,
    val MasterCatId: String,
    val MasterCatName: String,
    val PrdBrandId: String,
    val PrdBrandName: String,
    val PrdId: String,
    val PrdImageUrl: String,
    val PrdName: String,
    val PrdPrice: String,
    val PrdPriceShow: String,
    val PrdRating: String,
    val PrdratingCount: String,
    val ProductImages: List<ProductImage>,
    val ProductTypeId: String,
    val ProductTypeImageurl: String,
    val ProductTypeName: String,
    val PtrPrdvariantList: List<PtrPrdvariant>,
    val ShortDescription: String,
    val SubCatId: String,
    val SubCatName: String
)
data class MealList(
    val Data: List<Data>
)
data class ProductImage(
    val imageId: String,      // Example property: unique identifier for the image
    val imageUrl: String,    // Example property: URL of the image
    val imageDescription: String?  // Example property: Description of the image (nullable)
)

data class PtrPrdvariant(
    val variantId: String,    // Example property: unique identifier for the variant
    val variantName: String,  // Example property: Name of the variant
    val variantPrice: Double  // Example property: Price of the variant
    // Add more properties as needed based on your project's requirements
)
