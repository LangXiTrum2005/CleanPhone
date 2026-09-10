package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m9 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f17345f = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f17350e;

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f17346a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f17350e;
            int length = bArr2.length;
            int i13 = this.f17348c + i12;
            if (length < i13) {
                this.f17350e = Arrays.copyOf(bArr2, i13 + i13);
            }
            System.arraycopy(bArr, i10, this.f17350e, this.f17348c, i12);
            this.f17348c += i12;
        }
    }
}
