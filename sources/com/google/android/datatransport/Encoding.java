package com.google.android.datatransport;

import android.support.v4.media.a;

/* JADX INFO: loaded from: classes3.dex */
public final class Encoding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16673a;

    public Encoding(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f16673a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Encoding)) {
            return false;
        }
        return this.f16673a.equals(((Encoding) obj).f16673a);
    }

    public final int hashCode() {
        return this.f16673a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a.r(new StringBuilder("Encoding{name=\""), this.f16673a, "\"}");
    }
}
