package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
class EngineKey implements Key {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12459c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Class f12460e;
    public final Class f;
    public final Key g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CachedHashCodeArrayMap f12461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Options f12462i;
    public int j;

    public EngineKey(Object obj, Key key, int i2, int i3, CachedHashCodeArrayMap cachedHashCodeArrayMap, Class cls, Class cls2, Options options) {
        Preconditions.c(obj, "Argument must not be null");
        this.f12458b = obj;
        this.g = key;
        this.f12459c = i2;
        this.d = i3;
        Preconditions.c(cachedHashCodeArrayMap, "Argument must not be null");
        this.f12461h = cachedHashCodeArrayMap;
        Preconditions.c(cls, "Resource class must not be null");
        this.f12460e = cls;
        Preconditions.c(cls2, "Transcode class must not be null");
        this.f = cls2;
        Preconditions.c(options, "Argument must not be null");
        this.f12462i = options;
    }

    @Override // com.bumptech.glide.load.Key
    public final void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (!(obj instanceof EngineKey)) {
            return false;
        }
        EngineKey engineKey = (EngineKey) obj;
        return this.f12458b.equals(engineKey.f12458b) && this.g.equals(engineKey.g) && this.d == engineKey.d && this.f12459c == engineKey.f12459c && this.f12461h.equals(engineKey.f12461h) && this.f12460e.equals(engineKey.f12460e) && this.f.equals(engineKey.f) && this.f12462i.equals(engineKey.f12462i);
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        if (this.j == 0) {
            int iHashCode = this.f12458b.hashCode();
            this.j = iHashCode;
            int iHashCode2 = ((((this.g.hashCode() + (iHashCode * 31)) * 31) + this.f12459c) * 31) + this.d;
            this.j = iHashCode2;
            int iHashCode3 = this.f12461h.hashCode() + (iHashCode2 * 31);
            this.j = iHashCode3;
            int iHashCode4 = this.f12460e.hashCode() + (iHashCode3 * 31);
            this.j = iHashCode4;
            int iHashCode5 = this.f.hashCode() + (iHashCode4 * 31);
            this.j = iHashCode5;
            this.j = this.f12462i.f12369b.hashCode() + (iHashCode5 * 31);
        }
        return this.j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f12458b + ", width=" + this.f12459c + ", height=" + this.d + ", resourceClass=" + this.f12460e + ", transcodeClass=" + this.f + ", signature=" + this.g + ", hashCode=" + this.j + ", transformations=" + this.f12461h + ", options=" + this.f12462i + AbstractJsonLexerKt.END_OBJ;
    }
}
