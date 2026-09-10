package com.mbridge.msdk.thrid.okio;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f36787a;

    public h(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f36787a = sVar;
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.f36787a.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f36787a.close();
    }

    public final s d() {
        return this.f36787a;
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f36787a.toString() + ")";
    }
}
