package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class J2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22896b;

    public J2(String url, String accountId) {
        Intrinsics.f(url, "url");
        Intrinsics.f(accountId, "accountId");
        this.f22895a = url;
        this.f22896b = accountId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J2)) {
            return false;
        }
        J2 j2 = (J2) obj;
        return Intrinsics.a(this.f22895a, j2.f22895a) && Intrinsics.a(this.f22896b, j2.f22896b);
    }

    public final int hashCode() {
        return this.f22896b.hashCode() + (this.f22895a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfigIdentifier(url=");
        sb.append(this.f22895a);
        sb.append(", accountId=");
        return androidx.media3.extractor.text.ttml.a.p(sb, this.f22896b, ')');
    }
}
