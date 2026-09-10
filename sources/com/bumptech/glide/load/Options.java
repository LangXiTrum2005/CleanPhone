package com.bumptech.glide.load;

import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public final class Options implements Key {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CachedHashCodeArrayMap f12369b = new CachedHashCodeArrayMap(0);

    @Override // com.bumptech.glide.load.Key
    public final void b(MessageDigest messageDigest) {
        int i2 = 0;
        while (true) {
            CachedHashCodeArrayMap cachedHashCodeArrayMap = this.f12369b;
            if (i2 >= cachedHashCodeArrayMap.Z) {
                return;
            }
            Option option = (Option) cachedHashCodeArrayMap.f(i2);
            Object objJ = this.f12369b.j(i2);
            Option.CacheKeyUpdater cacheKeyUpdater = option.f12367b;
            if (option.d == null) {
                option.d = option.f12368c.getBytes(Key.f12364a);
            }
            cacheKeyUpdater.a(option.d, objJ, messageDigest);
            i2++;
        }
    }

    public final Object c(Option option) {
        CachedHashCodeArrayMap cachedHashCodeArrayMap = this.f12369b;
        return cachedHashCodeArrayMap.containsKey(option) ? cachedHashCodeArrayMap.get(option) : option.f12366a;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (obj instanceof Options) {
            return this.f12369b.equals(((Options) obj).f12369b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return this.f12369b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f12369b + AbstractJsonLexerKt.END_OBJ;
    }
}
