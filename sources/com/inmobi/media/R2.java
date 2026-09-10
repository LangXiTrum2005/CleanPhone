package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class R2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f23116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23117b;

    public R2(byte b2, String str) {
        this.f23116a = b2;
        this.f23117b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R2)) {
            return false;
        }
        R2 r2 = (R2) obj;
        return this.f23116a == r2.f23116a && Intrinsics.a(this.f23117b, r2.f23117b);
    }

    public final int hashCode() {
        int iHashCode = Byte.hashCode(this.f23116a) * 31;
        String str = this.f23117b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfigError(errorCode=");
        sb.append((int) this.f23116a);
        sb.append(", errorMessage=");
        return androidx.media3.extractor.text.ttml.a.p(sb, this.f23117b, ')');
    }
}
