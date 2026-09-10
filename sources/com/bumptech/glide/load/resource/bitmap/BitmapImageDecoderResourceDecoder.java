package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.emoji2.text.b;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter;
import com.bumptech.glide.load.resource.DefaultOnHeaderDecodedListener;
import com.p004ironsource.d9;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class BitmapImageDecoderResourceDecoder implements ResourceDecoder<ImageDecoder.Source, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitmapPoolAdapter f12638a = new BitmapPoolAdapter();

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final /* bridge */ /* synthetic */ boolean a(Object obj, Options options) {
        b.v(obj);
        return true;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final /* bridge */ /* synthetic */ Resource b(Object obj, int i2, int i3, Options options) {
        return c(b.d(obj), i2, i3, options);
    }

    public final BitmapResource c(ImageDecoder.Source source, int i2, int i3, Options options) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new DefaultOnHeaderDecodedListener(i2, i3, options));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i2 + "x" + i3 + d9.i.f24752e);
        }
        return new BitmapResource(bitmapDecodeBitmap, this.f12638a);
    }
}
