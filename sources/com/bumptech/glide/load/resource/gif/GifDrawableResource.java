package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.gifdecoder.StandardGifDecoder;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.resource.drawable.DrawableResource;

/* JADX INFO: loaded from: classes.dex */
public class GifDrawableResource extends DrawableResource<GifDrawable> implements Initializable {
    @Override // com.bumptech.glide.load.engine.Resource
    public final void a() {
        GifDrawable gifDrawable = (GifDrawable) this.X;
        gifDrawable.stop();
        gifDrawable.e0 = true;
        GifFrameLoader gifFrameLoader = gifDrawable.X.f12718a;
        gifFrameLoader.f12722c.clear();
        Bitmap bitmap = gifFrameLoader.f12726l;
        if (bitmap != null) {
            gifFrameLoader.f12723e.b(bitmap);
            gifFrameLoader.f12726l = null;
        }
        gifFrameLoader.f = false;
        GifFrameLoader.DelayTarget delayTarget = gifFrameLoader.f12725i;
        RequestManager requestManager = gifFrameLoader.d;
        if (delayTarget != null) {
            requestManager.b(delayTarget);
            gifFrameLoader.f12725i = null;
        }
        GifFrameLoader.DelayTarget delayTarget2 = gifFrameLoader.k;
        if (delayTarget2 != null) {
            requestManager.b(delayTarget2);
            gifFrameLoader.k = null;
        }
        GifFrameLoader.DelayTarget delayTarget3 = gifFrameLoader.f12727n;
        if (delayTarget3 != null) {
            requestManager.b(delayTarget3);
            gifFrameLoader.f12727n = null;
        }
        StandardGifDecoder standardGifDecoder = gifFrameLoader.f12720a;
        standardGifDecoder.f12347l = null;
        byte[] bArr = standardGifDecoder.f12346i;
        GifDecoder.BitmapProvider bitmapProvider = standardGifDecoder.f12343c;
        if (bArr != null) {
            bitmapProvider.e(bArr);
        }
        int[] iArr = standardGifDecoder.j;
        if (iArr != null) {
            bitmapProvider.f(iArr);
        }
        Bitmap bitmap2 = standardGifDecoder.m;
        if (bitmap2 != null) {
            bitmapProvider.a(bitmap2);
        }
        standardGifDecoder.m = null;
        standardGifDecoder.d = null;
        standardGifDecoder.s = null;
        byte[] bArr2 = standardGifDecoder.f12344e;
        if (bArr2 != null) {
            bitmapProvider.e(bArr2);
        }
        gifFrameLoader.j = true;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class c() {
        return GifDrawable.class;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        GifFrameLoader gifFrameLoader = ((GifDrawable) this.X).X.f12718a;
        StandardGifDecoder standardGifDecoder = gifFrameLoader.f12720a;
        return (standardGifDecoder.j.length * 4) + standardGifDecoder.d.limit() + standardGifDecoder.f12346i.length + gifFrameLoader.o;
    }

    @Override // com.bumptech.glide.load.resource.drawable.DrawableResource, com.bumptech.glide.load.engine.Initializable
    public final void initialize() {
        ((GifDrawable) this.X).c().prepareToDraw();
    }
}
