package com.bumptech.glide.signature;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public final class ObjectKey implements Key {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12829b;

    public ObjectKey(Object obj) {
        Preconditions.c(obj, "Argument must not be null");
        this.f12829b = obj;
    }

    @Override // com.bumptech.glide.load.Key
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(this.f12829b.toString().getBytes(Key.f12364a));
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (obj instanceof ObjectKey) {
            return this.f12829b.equals(((ObjectKey) obj).f12829b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return this.f12829b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f12829b + AbstractJsonLexerKt.END_OBJ;
    }
}
