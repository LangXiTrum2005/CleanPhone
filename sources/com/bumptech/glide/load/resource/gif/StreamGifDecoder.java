package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class StreamGifDecoder implements ResourceDecoder<InputStream, GifDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteBufferGifDecoder f12733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LruArrayPool f12734c;

    public StreamGifDecoder(ArrayList arrayList, ByteBufferGifDecoder byteBufferGifDecoder, LruArrayPool lruArrayPool) {
        this.f12732a = arrayList;
        this.f12733b = byteBufferGifDecoder;
        this.f12734c = lruArrayPool;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final boolean a(Object obj, Options options) {
        return !((Boolean) options.c(GifOptions.f12731b)).booleanValue() && ImageHeaderParserUtils.f(this.f12732a, (InputStream) obj, this.f12734c) == ImageHeaderParser.ImageType.GIF;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final Resource b(Object obj, int i2, int i3, Options options) {
        byte[] byteArray;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i4 = inputStream.read(bArr);
                if (i4 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i4);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e2);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.f12733b.b(ByteBuffer.wrap(byteArray), i2, i3, options);
    }
}
