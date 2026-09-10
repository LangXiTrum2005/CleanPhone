package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ByteBufferBitmapDecoder implements ResourceDecoder<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Downsampler f12640a;

    public ByteBufferBitmapDecoder(Downsampler downsampler) {
        this.f12640a = downsampler;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final boolean a(Object obj, Options options) {
        this.f12640a.getClass();
        return true;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final Resource b(Object obj, int i2, int i3, Options options) {
        Downsampler downsampler = this.f12640a;
        ArrayList arrayList = downsampler.d;
        return downsampler.a(new ImageReader.ByteBufferReader(downsampler.f12659c, (ByteBuffer) obj, arrayList), i2, i3, options, Downsampler.j);
    }
}
