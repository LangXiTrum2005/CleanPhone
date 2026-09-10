package com.example.cleanapp.domain.algorithm

import com.example.cleanapp.data.model.MediaAsset

object BestPhotoSelector {

    fun selectBestPhoto(photos: List<MediaAsset>): Pair<MediaAsset, List<MediaAsset>> {
        if (photos.isEmpty()) {
            throw IllegalArgumentException("List cannot be empty")
        }
        if (photos.size == 1) {
            return Pair(photos[0].copy(isBestResult = true, isSelected = false), emptyList())
        }

        val bestIndex = photos.indices.maxByOrNull { calculateScore(photos[it]) } ?: 0
        val best = photos[bestIndex].copy(isBestResult = true, isSelected = false)
        val duplicates = photos.filterIndexed { index, _ -> index != bestIndex }
            .map { it.copy(isBestResult = false, isSelected = true) }

        return Pair(best, duplicates)
    }

    private fun calculateScore(asset: MediaAsset): Double {
        val resolution = (asset.width.toLong() * asset.height.toLong()).toDouble()
        val sizeScore = asset.size.toDouble()
        val recencyBonus = asset.dateTaken.toDouble() / 1_000_000_000.0

        // Composite scoring weighted towards resolution and raw detail size
        return (resolution * 0.6) + (sizeScore * 0.3) + (recencyBonus * 0.1)
    }
}
