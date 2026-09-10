package com.bumptech.glide.load.resource.drawable;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.ByteBufferUtil;
import com.bumptech.glide.util.Util;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class AnimatedWebpDecoder {

    public static final class AnimatedImageDrawableResource implements Resource<Drawable> {
        @Override // com.bumptech.glide.load.engine.Resource
        public final void a() {
            ((AnimatedImageDrawable) null).stop();
            ((AnimatedImageDrawable) null).clearAnimationCallbacks();
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public final Class c() {
            return Drawable.class;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public final Object get() {
            return null;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public final int getSize() {
            return Util.d(Bitmap.Config.ARGB_8888) * null.getIntrinsicHeight() * null.getIntrinsicWidth() * 2;
        }
    }

    public static final class ByteBufferAnimatedWebpDecoder implements ResourceDecoder<ByteBuffer, Drawable> {
        @Override // com.bumptech.glide.load.ResourceDecoder
        public final boolean a(Object obj, Options options) {
            throw null;
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public final Resource b(Object obj, int i2, int i3, Options options) {
            ImageDecoder.createSource((ByteBuffer) obj);
            throw null;
        }
    }

    public static final class StreamAnimatedWebpDecoder implements ResourceDecoder<InputStream, Drawable> {
        @Override // com.bumptech.glide.load.ResourceDecoder
        public final boolean a(Object obj, Options options) {
            throw null;
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public final Resource b(Object obj, int i2, int i3, Options options) {
            ImageDecoder.createSource(ByteBufferUtil.b((InputStream) obj));
            throw null;
        }
    }
}
