package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class i extends t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private t f36788e;

    public i(t tVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f36788e = tVar;
    }

    public final i a(t tVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f36788e = tVar;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public t b() {
        return this.f36788e.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public long c() {
        return this.f36788e.c();
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public boolean d() {
        return this.f36788e.d();
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public void e() throws IOException {
        this.f36788e.e();
    }

    public final t g() {
        return this.f36788e;
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public t a(long j10, TimeUnit timeUnit) {
        return this.f36788e.a(j10, timeUnit);
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public t a(long j10) {
        return this.f36788e.a(j10);
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public t a() {
        return this.f36788e.a();
    }
}
