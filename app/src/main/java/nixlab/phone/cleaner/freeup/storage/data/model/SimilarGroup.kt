package nixlab.phone.cleaner.freeup.storage.data.model

data class SimilarGroup(
    val id: String,
    val title: String,
    val bestAsset: MediaAsset,
    val duplicateAssets: List<MediaAsset>
) {
    val allAssets: List<MediaAsset>
        get() = listOf(bestAsset) + duplicateAssets

    val reclaimableSize: Long
        get() = duplicateAssets.filter { it.isSelected }.sumOf { it.size }

    val totalGroupSize: Long
        get() = allAssets.sumOf { it.size }
}

data class ScanResult(
    val similarGroups: List<SimilarGroup> = emptyList(),
    val duplicateGroups: List<SimilarGroup> = emptyList(),
    val screenshots: List<MediaAsset> = emptyList(),
    val largeVideos: List<MediaAsset> = emptyList(),
    val allPhotos: List<MediaAsset> = emptyList(),
    val otherMedia: List<MediaAsset> = emptyList(),
    val totalPhotosCount: Int = 0,
    val totalVideosCount: Int = 0,
    val totalReclaimableBytes: Long = 0L
)
