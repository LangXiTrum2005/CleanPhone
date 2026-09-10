package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f36357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okio.e f36358c;

    public h(String str, long j10, com.mbridge.msdk.thrid.okio.e eVar) {
        this.f36356a = str;
        this.f36357b = j10;
        this.f36358c = eVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.b0
    public long k() {
        return this.f36357b;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.b0
    public u l() {
        String str = this.f36356a;
        if (str != null) {
            return u.b(str);
        }
        return null;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.b0
    public com.mbridge.msdk.thrid.okio.e m() {
        return this.f36358c;
    }
}
