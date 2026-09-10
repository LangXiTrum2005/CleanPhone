package com.bumptech.glide.load;

import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface ImageHeaderParser {

    /* JADX INFO: renamed from: com.bumptech.glide.load.ImageHeaderParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12353a;

        static {
            int[] iArr = new int[ImageType.values().length];
            f12353a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12353a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12353a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum ImageType {
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

        public final boolean X;

        ImageType(boolean z2) {
            this.X = z2;
        }

        public boolean hasAlpha() {
            return this.X;
        }

        public boolean isWebp() {
            int i2 = AnonymousClass1.f12353a[ordinal()];
            return i2 == 1 || i2 == 2 || i2 == 3;
        }
    }

    int a(InputStream inputStream, LruArrayPool lruArrayPool);

    ImageType b(ByteBuffer byteBuffer);

    int c(ByteBuffer byteBuffer, LruArrayPool lruArrayPool);

    ImageType d(InputStream inputStream);
}
