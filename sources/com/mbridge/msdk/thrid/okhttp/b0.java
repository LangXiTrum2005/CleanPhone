package com.mbridge.msdk.thrid.okhttp;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b0 implements Closeable {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a extends b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f36139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f36140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.thrid.okio.e f36141c;

        public a(u uVar, long j10, com.mbridge.msdk.thrid.okio.e eVar) {
            this.f36139a = uVar;
            this.f36140b = j10;
            this.f36141c = eVar;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.b0
        public long k() {
            return this.f36140b;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.b0
        public u l() {
            return this.f36139a;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.b0
        public com.mbridge.msdk.thrid.okio.e m() {
            return this.f36141c;
        }
    }

    public static b0 a(u uVar, byte[] bArr) {
        return a(uVar, bArr.length, new com.mbridge.msdk.thrid.okio.c().write(bArr));
    }

    private Charset h() {
        u uVarL = l();
        return uVarL != null ? uVarL.a(com.mbridge.msdk.thrid.okhttp.internal.c.f36267j) : com.mbridge.msdk.thrid.okhttp.internal.c.f36267j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.mbridge.msdk.thrid.okhttp.internal.c.a(m());
    }

    public final InputStream d() {
        return m().j();
    }

    public abstract long k();

    public abstract u l();

    public abstract com.mbridge.msdk.thrid.okio.e m();

    public final String n() throws IOException {
        com.mbridge.msdk.thrid.okio.e eVarM = m();
        try {
            return eVarM.a(com.mbridge.msdk.thrid.okhttp.internal.c.a(eVarM, h()));
        } finally {
            com.mbridge.msdk.thrid.okhttp.internal.c.a(eVarM);
        }
    }

    public static b0 a(u uVar, long j10, com.mbridge.msdk.thrid.okio.e eVar) {
        if (eVar != null) {
            return new a(uVar, j10, eVar);
        }
        throw new NullPointerException("source == null");
    }
}
