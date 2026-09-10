package com.bumptech.glide.request;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.applovin.shadow.okio.Segment;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.DrawableTransformation;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.load.resource.gif.GifDrawableTransformation;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.signature.EmptySignature;
import com.bumptech.glide.signature.ObjectKey;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import com.p004ironsource.mediationsdk.metadata.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseRequestOptions<T extends BaseRequestOptions<T>> implements Cloneable {
    public int X;
    public boolean i0;
    public boolean m0;
    public boolean n0;
    public boolean p0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public DiskCacheStrategy f12787Y = DiskCacheStrategy.f12433c;
    public Priority Z = Priority.Z;
    public boolean e0 = true;
    public int f0 = -1;
    public int g0 = -1;
    public Key h0 = EmptySignature.f12828b;
    public Options j0 = new Options();
    public CachedHashCodeArrayMap k0 = new CachedHashCodeArrayMap(0);
    public Class l0 = Object.class;
    public boolean o0 = true;

    public static boolean f(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    public BaseRequestOptions b(BaseRequestOptions baseRequestOptions) {
        if (this.n0) {
            return clone().b(baseRequestOptions);
        }
        int i2 = baseRequestOptions.X;
        if (f(baseRequestOptions.X, 1048576)) {
            this.p0 = baseRequestOptions.p0;
        }
        if (f(baseRequestOptions.X, 4)) {
            this.f12787Y = baseRequestOptions.f12787Y;
        }
        if (f(baseRequestOptions.X, 8)) {
            this.Z = baseRequestOptions.Z;
        }
        if (f(baseRequestOptions.X, 16)) {
            this.X &= -33;
        }
        if (f(baseRequestOptions.X, 32)) {
            this.X &= -17;
        }
        if (f(baseRequestOptions.X, 64)) {
            this.X &= -129;
        }
        if (f(baseRequestOptions.X, 128)) {
            this.X &= -65;
        }
        if (f(baseRequestOptions.X, 256)) {
            this.e0 = baseRequestOptions.e0;
        }
        if (f(baseRequestOptions.X, 512)) {
            this.g0 = baseRequestOptions.g0;
            this.f0 = baseRequestOptions.f0;
        }
        if (f(baseRequestOptions.X, 1024)) {
            this.h0 = baseRequestOptions.h0;
        }
        if (f(baseRequestOptions.X, 4096)) {
            this.l0 = baseRequestOptions.l0;
        }
        if (f(baseRequestOptions.X, Segment.SIZE)) {
            this.X &= -16385;
        }
        if (f(baseRequestOptions.X, 16384)) {
            this.X &= -8193;
        }
        if (f(baseRequestOptions.X, 131072)) {
            this.i0 = baseRequestOptions.i0;
        }
        if (f(baseRequestOptions.X, a.f25965n)) {
            this.k0.putAll(baseRequestOptions.k0);
            this.o0 = baseRequestOptions.o0;
        }
        this.X |= baseRequestOptions.X;
        this.j0.f12369b.g(baseRequestOptions.j0.f12369b);
        j();
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public BaseRequestOptions clone() {
        try {
            BaseRequestOptions baseRequestOptions = (BaseRequestOptions) super.clone();
            Options options = new Options();
            baseRequestOptions.j0 = options;
            options.f12369b.g(this.j0.f12369b);
            CachedHashCodeArrayMap cachedHashCodeArrayMap = new CachedHashCodeArrayMap(0);
            baseRequestOptions.k0 = cachedHashCodeArrayMap;
            cachedHashCodeArrayMap.putAll(this.k0);
            baseRequestOptions.m0 = false;
            baseRequestOptions.n0 = false;
            return baseRequestOptions;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final BaseRequestOptions d(Class cls) {
        if (this.n0) {
            return clone().d(cls);
        }
        this.l0 = cls;
        this.X |= 4096;
        j();
        return this;
    }

    public final BaseRequestOptions e(DiskCacheStrategy diskCacheStrategy) {
        if (this.n0) {
            return clone().e(diskCacheStrategy);
        }
        this.f12787Y = diskCacheStrategy;
        this.X |= 4;
        j();
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BaseRequestOptions)) {
            return false;
        }
        BaseRequestOptions baseRequestOptions = (BaseRequestOptions) obj;
        baseRequestOptions.getClass();
        if (Float.compare(1.0f, 1.0f) != 0) {
            return false;
        }
        char[] cArr = Util.f12851a;
        return this.e0 == baseRequestOptions.e0 && this.f0 == baseRequestOptions.f0 && this.g0 == baseRequestOptions.g0 && this.i0 == baseRequestOptions.i0 && this.f12787Y.equals(baseRequestOptions.f12787Y) && this.Z == baseRequestOptions.Z && this.j0.equals(baseRequestOptions.j0) && this.k0.equals(baseRequestOptions.k0) && this.l0.equals(baseRequestOptions.l0) && this.h0.equals(baseRequestOptions.h0);
    }

    public final BaseRequestOptions g(DownsampleStrategy downsampleStrategy, BitmapTransformation bitmapTransformation) {
        if (this.n0) {
            return clone().g(downsampleStrategy, bitmapTransformation);
        }
        k(DownsampleStrategy.f, downsampleStrategy);
        return q(bitmapTransformation, false);
    }

    public final BaseRequestOptions h(int i2, int i3) {
        if (this.n0) {
            return clone().h(i2, i3);
        }
        this.g0 = i2;
        this.f0 = i3;
        this.X |= 512;
        j();
        return this;
    }

    public int hashCode() {
        return Util.i(Util.i(Util.i(Util.i(Util.i(Util.i(Util.i(Util.h(0, Util.h(0, Util.h(1, Util.h(this.i0 ? 1 : 0, Util.h(this.g0, Util.h(this.f0, Util.h(this.e0 ? 1 : 0, Util.i(Util.h(0, Util.i(Util.h(0, Util.i(Util.h(0, Util.g(1.0f, 17)), null)), null)), null)))))))), this.f12787Y), this.Z), this.j0), this.k0), this.l0), this.h0), null);
    }

    public final BaseRequestOptions i() {
        Priority priority = Priority.e0;
        if (this.n0) {
            return clone().i();
        }
        this.Z = priority;
        this.X |= 8;
        j();
        return this;
    }

    public final void j() {
        if (this.m0) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final BaseRequestOptions k(Option option, DownsampleStrategy downsampleStrategy) {
        if (this.n0) {
            return clone().k(option, downsampleStrategy);
        }
        Preconditions.b(option);
        this.j0.f12369b.put(option, downsampleStrategy);
        j();
        return this;
    }

    public final BaseRequestOptions l(ObjectKey objectKey) {
        if (this.n0) {
            return clone().l(objectKey);
        }
        this.h0 = objectKey;
        this.X |= 1024;
        j();
        return this;
    }

    public final BaseRequestOptions p() {
        if (this.n0) {
            return clone().p();
        }
        this.e0 = false;
        this.X |= 256;
        j();
        return this;
    }

    public final BaseRequestOptions q(Transformation transformation, boolean z2) {
        if (this.n0) {
            return clone().q(transformation, z2);
        }
        DrawableTransformation drawableTransformation = new DrawableTransformation(transformation, z2);
        r(Bitmap.class, transformation, z2);
        r(Drawable.class, drawableTransformation, z2);
        r(BitmapDrawable.class, drawableTransformation, z2);
        r(GifDrawable.class, new GifDrawableTransformation(transformation), z2);
        j();
        return this;
    }

    public final BaseRequestOptions r(Class cls, Transformation transformation, boolean z2) {
        if (this.n0) {
            return clone().r(cls, transformation, z2);
        }
        Preconditions.b(transformation);
        this.k0.put(cls, transformation);
        int i2 = this.X;
        this.X = 67584 | i2;
        this.o0 = false;
        if (z2) {
            this.X = i2 | 198656;
            this.i0 = true;
        }
        j();
        return this;
    }

    public final BaseRequestOptions s() {
        if (this.n0) {
            return clone().s();
        }
        this.p0 = true;
        this.X |= 1048576;
        j();
        return this;
    }
}
