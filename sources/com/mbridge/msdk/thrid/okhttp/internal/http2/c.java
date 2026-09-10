package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.applovin.shadow.okhttp3.internal.http2.Header;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f36404d = com.mbridge.msdk.thrid.okio.f.c(":");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f36405e = com.mbridge.msdk.thrid.okio.f.c(Header.RESPONSE_STATUS_UTF8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f36406f = com.mbridge.msdk.thrid.okio.f.c(Header.TARGET_METHOD_UTF8);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f36407g = com.mbridge.msdk.thrid.okio.f.c(Header.TARGET_PATH_UTF8);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f36408h = com.mbridge.msdk.thrid.okio.f.c(Header.TARGET_SCHEME_UTF8);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f36409i = com.mbridge.msdk.thrid.okio.f.c(Header.TARGET_AUTHORITY_UTF8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okio.f f36410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okio.f f36411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f36412c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
    }

    public c(String str, String str2) {
        this(com.mbridge.msdk.thrid.okio.f.c(str), com.mbridge.msdk.thrid.okio.f.c(str2));
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f36410a.equals(cVar.f36410a) && this.f36411b.equals(cVar.f36411b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f36411b.hashCode() + ((this.f36410a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public String toString() {
        return com.mbridge.msdk.thrid.okhttp.internal.c.a("%s: %s", this.f36410a.m(), this.f36411b.m());
    }

    public c(com.mbridge.msdk.thrid.okio.f fVar, String str) {
        this(fVar, com.mbridge.msdk.thrid.okio.f.c(str));
    }

    public c(com.mbridge.msdk.thrid.okio.f fVar, com.mbridge.msdk.thrid.okio.f fVar2) {
        this.f36410a = fVar;
        this.f36411b = fVar2;
        this.f36412c = fVar2.j() + fVar.j() + 32;
    }
}
