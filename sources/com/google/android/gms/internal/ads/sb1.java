package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class sb1 extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19927a;

    public final String toString() {
        switch (this.f19927a) {
        }
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        int i11 = this.f19927a;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        switch (this.f19927a) {
            case 0:
                bArr.getClass();
                break;
            default:
                bArr.getClass();
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        switch (this.f19927a) {
            case 0:
                bArr.getClass();
                ps1.h0(i10, i11 + i10, bArr.length);
                break;
            default:
                bArr.getClass();
                go.k.r(i10, i11 + i10, bArr.length);
                break;
        }
    }

    private final void a(int i10) {
    }

    private final void b(int i10) {
    }
}
