package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
final class DataCacheKey implements Key {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Key f12399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Key f12400c;

    public DataCacheKey(Key key, Key key2) {
        this.f12399b = key;
        this.f12400c = key2;
    }

    @Override // com.bumptech.glide.load.Key
    public final void b(MessageDigest messageDigest) {
        this.f12399b.b(messageDigest);
        this.f12400c.b(messageDigest);
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (obj instanceof DataCacheKey) {
            DataCacheKey dataCacheKey = (DataCacheKey) obj;
            if (this.f12399b.equals(dataCacheKey.f12399b) && this.f12400c.equals(dataCacheKey.f12400c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return this.f12400c.hashCode() + (this.f12399b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f12399b + ", signature=" + this.f12400c + AbstractJsonLexerKt.END_OBJ;
    }
}
