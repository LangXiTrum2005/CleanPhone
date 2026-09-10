package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k9 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f16376e = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f16380d;

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f16377a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f16380d;
            int length = bArr2.length;
            int i13 = this.f16378b + i12;
            if (length < i13) {
                this.f16380d = Arrays.copyOf(bArr2, i13 + i13);
            }
            System.arraycopy(bArr, i10, this.f16380d, this.f16378b, i12);
            this.f16378b += i12;
        }
    }
}
