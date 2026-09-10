package com.bumptech.glide.load.resource.drawable;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.load.resource.DefaultOnHeaderDecodedListener;
import com.bumptech.glide.load.resource.bitmap.a;
import com.bumptech.glide.util.ByteBufferUtil;
import com.bumptech.glide.util.Util;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class AnimatedImageDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LruArrayPool f12704b;

    public static final class AnimatedImageDrawableResource implements Resource<Drawable> {
        public final AnimatedImageDrawable X;

        public AnimatedImageDrawableResource(AnimatedImageDrawable animatedImageDrawable) {
            this.X = animatedImageDrawable;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public final void a() {
            this.X.stop();
            this.X.clearAnimationCallbacks();
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public final Class c() {
            return Drawable.class;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public final Object get() {
            return this.X;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public final int getSize() {
            return Util.d(Bitmap.Config.ARGB_8888) * this.X.getIntrinsicHeight() * this.X.getIntrinsicWidth() * 2;
        }
    }

    public static final class ByteBufferAnimatedImageDecoder implements ResourceDecoder<ByteBuffer, Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AnimatedImageDecoder f12705a;

        public ByteBufferAnimatedImageDecoder(AnimatedImageDecoder animatedImageDecoder) {
            this.f12705a = animatedImageDecoder;
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public final boolean a(Object obj, Options options) {
            ImageHeaderParser.ImageType imageTypeG = ImageHeaderParserUtils.g(this.f12705a.f12703a, (ByteBuffer) obj);
            if (imageTypeG != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return Build.VERSION.SDK_INT >= 31 && imageTypeG == ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            return true;
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public final Resource b(Object obj, int i2, int i3, Options options) {
            return AnimatedImageDecoder.b(ImageDecoder.createSource((ByteBuffer) obj), i2, i3, options);
        }
    }

    public static final class StreamAnimatedImageDecoder implements ResourceDecoder<InputStream, Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AnimatedImageDecoder f12706a;

        public StreamAnimatedImageDecoder(AnimatedImageDecoder animatedImageDecoder) {
            this.f12706a = animatedImageDecoder;
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public final boolean a(Object obj, Options options) {
            AnimatedImageDecoder animatedImageDecoder = this.f12706a;
            ImageHeaderParser.ImageType imageTypeF = ImageHeaderParserUtils.f(animatedImageDecoder.f12703a, (InputStream) obj, animatedImageDecoder.f12704b);
            if (imageTypeF != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return Build.VERSION.SDK_INT >= 31 && imageTypeF == ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            return true;
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public final Resource b(Object obj, int i2, int i3, Options options) {
            return AnimatedImageDecoder.b(ImageDecoder.createSource(ByteBufferUtil.b((InputStream) obj)), i2, i3, options);
        }
    }

    public AnimatedImageDecoder(ArrayList arrayList, LruArrayPool lruArrayPool) {
        this.f12703a = arrayList;
        this.f12704b = lruArrayPool;
    }

    public static ResourceDecoder a(ArrayList arrayList, LruArrayPool lruArrayPool) {
        return new ByteBufferAnimatedImageDecoder(new AnimatedImageDecoder(arrayList, lruArrayPool));
    }

    public static Resource b(ImageDecoder.Source source, int i2, int i3, Options options) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new DefaultOnHeaderDecodedListener(i2, i3, options));
        if (a.v(drawableDecodeDrawable)) {
            return new AnimatedImageDrawableResource(a.k(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    public static ResourceDecoder c(ArrayList arrayList, LruArrayPool lruArrayPool) {
        return new StreamAnimatedImageDecoder(new AnimatedImageDecoder(arrayList, lruArrayPool));
    }
}
