package com.google.protobuf;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24908a;

    @Override // com.google.protobuf.q
    public final byte[] a(byte[] bArr, int i10, int i11) {
        switch (this.f24908a) {
            case 0:
                return Arrays.copyOfRange(bArr, i10, i11 + i10);
            default:
                byte[] bArr2 = new byte[i11];
                System.arraycopy(bArr, i10, bArr2, 0, i11);
                return bArr2;
        }
    }
}
