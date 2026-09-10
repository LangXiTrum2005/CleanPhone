package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class K9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f22927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22928c;
    public final String d;

    public K9(long j, Map headers, int i2, String str) {
        Intrinsics.f(headers, "headers");
        this.f22926a = j;
        this.f22927b = headers;
        this.f22928c = i2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K9)) {
            return false;
        }
        K9 k9 = (K9) obj;
        return this.f22926a == k9.f22926a && Intrinsics.a(this.f22927b, k9.f22927b) && this.f22928c == k9.f22928c && Intrinsics.a(this.d, k9.d);
    }

    public final int hashCode() {
        int iA = androidx.media3.extractor.text.ttml.a.a(this.f22928c, (this.f22927b.hashCode() + (Long.hashCode(this.f22926a) * 31)) * 31, 31);
        String str = this.d;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkMetaData(timeTaken=");
        sb.append(this.f22926a);
        sb.append(", headers=");
        sb.append(this.f22927b);
        sb.append(", contentLength=");
        sb.append(this.f22928c);
        sb.append(", contentType=");
        return androidx.media3.extractor.text.ttml.a.p(sb, this.d, ')');
    }
}
