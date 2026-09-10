package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bt1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f12888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ByteBuffer f12889b;

    static {
        byte[] bArr = new byte[0];
        f12888a = bArr;
        f12889b = ByteBuffer.wrap(bArr);
        fs1.q(bArr, 0, 0);
    }

    public static void a() {
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int b(int i10, int i11, int i12, byte[] bArr) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }
}
