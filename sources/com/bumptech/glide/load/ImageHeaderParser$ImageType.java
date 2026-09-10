package com.bumptech.glide.load;

import e6.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    ANIMATED_AVIF(true),
    UNKNOWN(false);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10513a;

    ImageHeaderParser$ImageType(boolean z10) {
        this.f10513a = z10;
    }

    public boolean hasAlpha() {
        return this.f10513a;
    }

    public boolean isWebp() {
        int i10 = d.f39141a[ordinal()];
        return i10 == 1 || i10 == 2 || i10 == 3;
    }
}
