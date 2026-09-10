package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22821d;

    public f0(byte[] bArr, int i10) {
        super(bArr);
        h0.n(0, i10, bArr.length);
        this.f22821d = i10;
    }

    @Override // com.google.android.gms.internal.auth.h0
    public final byte b(int i10) {
        int i11 = this.f22821d;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f22840b[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(l1.d.e(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(defpackage.e.g(i10, i11, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.auth.h0
    public final byte h(int i10) {
        return this.f22840b[i10];
    }

    @Override // com.google.android.gms.internal.auth.h0
    public final int m() {
        return this.f22821d;
    }
}
