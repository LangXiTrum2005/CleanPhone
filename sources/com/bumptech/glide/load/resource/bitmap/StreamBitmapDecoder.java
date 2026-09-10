package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.util.ExceptionPassthroughInputStream;
import com.bumptech.glide.util.MarkEnforcingInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public class StreamBitmapDecoder implements ResourceDecoder<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Downsampler f12689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LruArrayPool f12690b;

    public static class UntrustedCallbacks implements Downsampler.DecodeCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecyclableBufferedInputStream f12691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ExceptionPassthroughInputStream f12692b;

        public UntrustedCallbacks(RecyclableBufferedInputStream recyclableBufferedInputStream, ExceptionPassthroughInputStream exceptionPassthroughInputStream) {
            this.f12691a = recyclableBufferedInputStream;
            this.f12692b = exceptionPassthroughInputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks
        public final void a(Bitmap bitmap, BitmapPool bitmapPool) throws IOException {
            IOException iOException = this.f12692b.f12836Y;
            if (iOException != null) {
                if (bitmap == null) {
                    throw iOException;
                }
                bitmapPool.b(bitmap);
                throw iOException;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks
        public final void b() {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f12691a;
            synchronized (recyclableBufferedInputStream) {
                recyclableBufferedInputStream.Z = recyclableBufferedInputStream.X.length;
            }
        }
    }

    public StreamBitmapDecoder(Downsampler downsampler, LruArrayPool lruArrayPool) {
        this.f12689a = downsampler;
        this.f12690b = lruArrayPool;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final boolean a(Object obj, Options options) {
        this.f12689a.getClass();
        return true;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final Resource b(Object obj, int i2, int i3, Options options) {
        boolean z2;
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        ExceptionPassthroughInputStream exceptionPassthroughInputStream;
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof RecyclableBufferedInputStream) {
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream;
            z2 = false;
        } else {
            z2 = true;
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, this.f12690b);
        }
        ArrayDeque arrayDeque = ExceptionPassthroughInputStream.Z;
        synchronized (arrayDeque) {
            exceptionPassthroughInputStream = (ExceptionPassthroughInputStream) arrayDeque.poll();
        }
        if (exceptionPassthroughInputStream == null) {
            exceptionPassthroughInputStream = new ExceptionPassthroughInputStream();
        }
        ExceptionPassthroughInputStream exceptionPassthroughInputStream2 = exceptionPassthroughInputStream;
        exceptionPassthroughInputStream2.X = recyclableBufferedInputStream;
        MarkEnforcingInputStream markEnforcingInputStream = new MarkEnforcingInputStream(exceptionPassthroughInputStream2);
        UntrustedCallbacks untrustedCallbacks = new UntrustedCallbacks(recyclableBufferedInputStream, exceptionPassthroughInputStream2);
        try {
            Downsampler downsampler = this.f12689a;
            BitmapResource bitmapResourceA = downsampler.a(new ImageReader.InputStreamImageReader(markEnforcingInputStream, downsampler.d, downsampler.f12659c), i2, i3, options, untrustedCallbacks);
            exceptionPassthroughInputStream2.f12836Y = null;
            exceptionPassthroughInputStream2.X = null;
            synchronized (arrayDeque) {
                arrayDeque.offer(exceptionPassthroughInputStream2);
            }
            return bitmapResourceA;
        } finally {
            exceptionPassthroughInputStream2.f12836Y = null;
            exceptionPassthroughInputStream2.X = null;
            ArrayDeque arrayDeque2 = ExceptionPassthroughInputStream.Z;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(exceptionPassthroughInputStream2);
                if (z2) {
                    recyclableBufferedInputStream.release();
                }
            }
        }
    }
}
