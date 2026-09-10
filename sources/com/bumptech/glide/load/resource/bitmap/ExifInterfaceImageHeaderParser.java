package com.bumptech.glide.load.resource.bitmap;

import androidx.exifinterface.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ExifInterfaceImageHeaderParser implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int a(InputStream inputStream, LruArrayPool lruArrayPool) {
        int iC = new ExifInterface(inputStream).c();
        if (iC == 0) {
            return -1;
        }
        return iC;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType b(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int c(ByteBuffer byteBuffer, LruArrayPool lruArrayPool) {
        return a(ByteBufferUtil.f(byteBuffer), lruArrayPool);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType d(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
