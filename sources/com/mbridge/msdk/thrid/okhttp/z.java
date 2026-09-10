package com.mbridge.msdk.thrid.okhttp;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class z {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a extends z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f36761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f36762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ byte[] f36763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f36764d;

        public a(u uVar, int i10, byte[] bArr, int i11) {
            this.f36761a = uVar;
            this.f36762b = i10;
            this.f36763c = bArr;
            this.f36764d = i11;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.z
        public long a() {
            return this.f36762b;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.z
        public u b() {
            return this.f36761a;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.z
        public void a(com.mbridge.msdk.thrid.okio.d dVar) throws IOException {
            dVar.write(this.f36763c, this.f36764d, this.f36762b);
        }
    }

    public static z a(u uVar, byte[] bArr) {
        return a(uVar, bArr, 0, bArr.length);
    }

    public abstract long a() throws IOException;

    public abstract void a(com.mbridge.msdk.thrid.okio.d dVar) throws IOException;

    public abstract u b();

    public static z a(u uVar, byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(bArr.length, i10, i11);
        return new a(uVar, i11, bArr, i10);
    }
}
