package com.mbridge.msdk.thrid.okio;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f36786a;

    public g(r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f36786a = rVar;
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public void a(c cVar, long j10) throws IOException {
        this.f36786a.a(cVar, j10);
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public t b() {
        return this.f36786a.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f36786a.close();
    }

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
    public void flush() throws IOException {
        this.f36786a.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f36786a.toString() + ")";
    }
}
