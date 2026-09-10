package com.mbridge.msdk.thrid.okio;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f36826a = Charset.forName("UTF-8");

    public static int a(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    public static short a(short s10) {
        return (short) (((s10 & 255) << 8) | ((65280 & s10) >>> 8));
    }

    public static void a(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            StringBuilder sbL = wi.d.l(j10, "size=", " offset=");
            sbL.append(j11);
            throw new ArrayIndexOutOfBoundsException(defpackage.e.s(sbL, " byteCount=", j12));
        }
    }

    public static void a(Throwable th2) throws Throwable {
        b(th2);
    }

    public static boolean a(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    private static <T extends Throwable> void b(Throwable th2) throws Throwable {
        throw th2;
    }
}
