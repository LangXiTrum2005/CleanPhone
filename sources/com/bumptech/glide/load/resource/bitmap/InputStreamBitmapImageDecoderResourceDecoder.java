package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class InputStreamBitmapImageDecoderResourceDecoder implements ResourceDecoder<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitmapImageDecoderResourceDecoder f12681a = new BitmapImageDecoderResourceDecoder();

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final /* bridge */ /* synthetic */ boolean a(Object obj, Options options) {
        return true;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final Resource b(Object obj, int i2, int i3, Options options) {
        return this.f12681a.c(ImageDecoder.createSource(ByteBufferUtil.b((InputStream) obj)), i2, i3, options);
    }
}
