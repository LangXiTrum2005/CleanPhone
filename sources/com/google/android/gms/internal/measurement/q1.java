package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f23877a;

    static {
        byte[] bArr = new byte[0];
        f23877a = bArr;
        ByteBuffer.wrap(bArr);
        int i10 = 0 + 0;
        try {
            if (i10 < 0) {
                throw new u1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            }
            if (i10 > Integer.MAX_VALUE) {
                throw new u1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        } catch (u1 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int a(int i10, int i11, int i12, byte[] bArr) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }
}
