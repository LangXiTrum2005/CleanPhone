package com.inmobi.media;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class L9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f22950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f22951c;
    public final boolean d;

    public L9(String url, HashMap map, boolean z2) {
        Intrinsics.f(url, "url");
        this.f22950b = map;
        this.f22951c = null;
        this.d = z2;
        this.f22949a = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L9)) {
            return false;
        }
        L9 l9 = (L9) obj;
        return Intrinsics.a(this.f22949a, l9.f22949a) && Intrinsics.a(this.f22950b, l9.f22950b) && Intrinsics.a(this.f22951c, l9.f22951c) && this.d == l9.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final int hashCode() {
        int iHashCode = this.f22949a.hashCode() * 31;
        Map map = this.f22950b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.f22951c;
        int iHashCode3 = (iHashCode2 + (map2 != null ? map2.hashCode() : 0)) * 961;
        boolean z2 = this.d;
        ?? r1 = z2;
        if (z2) {
            r1 = 1;
        }
        return iHashCode3 + r1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GetRequest(url=");
        sb.append(this.f22949a);
        sb.append(", headers=");
        sb.append(this.f22950b);
        sb.append(", queryParams=");
        sb.append(this.f22951c);
        sb.append(", retryPolicy=null, followRedirects=");
        return androidx.media3.extractor.text.ttml.a.r(sb, this.d, ')');
    }
}
