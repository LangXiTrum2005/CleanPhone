package com.bumptech.glide.util;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class MultiClassKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Class f12848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class f12849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Class f12850c;

    public MultiClassKey(Class cls, Class cls2, Class cls3) {
        this.f12848a = cls;
        this.f12849b = cls2;
        this.f12850c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MultiClassKey multiClassKey = (MultiClassKey) obj;
        return this.f12848a.equals(multiClassKey.f12848a) && this.f12849b.equals(multiClassKey.f12849b) && Util.b(this.f12850c, multiClassKey.f12850c);
    }

    public final int hashCode() {
        int iHashCode = (this.f12849b.hashCode() + (this.f12848a.hashCode() * 31)) * 31;
        Class cls = this.f12850c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f12848a + ", second=" + this.f12849b + AbstractJsonLexerKt.END_OBJ;
    }
}
