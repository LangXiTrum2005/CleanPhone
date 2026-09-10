package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class I9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC3157o4 f22886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22887b;

    public I9(EnumC3157o4 errorCode, String str) {
        Intrinsics.f(errorCode, "errorCode");
        this.f22886a = errorCode;
        this.f22887b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I9)) {
            return false;
        }
        I9 i9 = (I9) obj;
        return this.f22886a == i9.f22886a && Intrinsics.a(this.f22887b, i9.f22887b);
    }

    public final int hashCode() {
        int iHashCode = this.f22886a.hashCode() * 31;
        String str = this.f22887b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkError(errorCode=");
        sb.append(this.f22886a);
        sb.append(", errorMessage=");
        return androidx.media3.extractor.text.ttml.a.p(sb, this.f22887b, ')');
    }
}
