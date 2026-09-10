package com.pgl.ssdk;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f33472a = "0123456789abcdef".toCharArray();

    public static i a(q qVar, t tVar, int i2) throws j, IOException {
        try {
            d.a aVarA = d.a(qVar, tVar);
            long jB = aVarA.b();
            q qVarA = aVarA.a();
            ByteBuffer byteBufferA = qVarA.a(0L, (int) qVarA.a());
            byteBufferA.order(ByteOrder.LITTLE_ENDIAN);
            return new i(a(byteBufferA, i2), jB, tVar.a(), tVar.e(), tVar.d());
        } catch (b e2) {
            throw new j(e2.getMessage(), e2);
        }
    }

    private static ByteBuffer b(ByteBuffer byteBuffer, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("size: ".concat(String.valueOf(i2)));
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (i3 < iPosition || i3 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i3);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i3);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static byte[] c(ByteBuffer byteBuffer) throws a {
        int i2 = byteBuffer.getInt();
        if (i2 < 0) {
            throw new a("Negative length");
        }
        if (i2 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i2];
            byteBuffer.get(bArr);
            return bArr;
        }
        StringBuilder sbU = android.support.v4.media.a.u(i2, "Underflow while reading length-prefixed value. Length: ", ", available: ");
        sbU.append(byteBuffer.remaining());
        throw new a(sbU.toString());
    }

    public static ByteBuffer b(ByteBuffer byteBuffer) throws a {
        if (byteBuffer.remaining() >= 4) {
            int i2 = byteBuffer.getInt();
            if (i2 >= 0) {
                if (i2 <= byteBuffer.remaining()) {
                    return b(byteBuffer, i2);
                }
                StringBuilder sbU = android.support.v4.media.a.u(i2, "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: ");
                sbU.append(byteBuffer.remaining());
                throw new a(sbU.toString());
            }
            throw new IllegalArgumentException("Negative length");
        }
        throw new a("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
    }

    public static ByteBuffer a(ByteBuffer byteBuffer, int i2) throws j {
        a(byteBuffer);
        ByteBuffer byteBufferA = a(byteBuffer, 8, byteBuffer.capacity() - 24);
        int i3 = 0;
        while (byteBufferA.hasRemaining()) {
            i3++;
            if (byteBufferA.remaining() >= 8) {
                long j = byteBufferA.getLong();
                if (j >= 4 && j <= 2147483647L) {
                    int i4 = (int) j;
                    int iPosition = byteBufferA.position() + i4;
                    if (i4 <= byteBufferA.remaining()) {
                        if (byteBufferA.getInt() == i2) {
                            return b(byteBufferA, i4 - 4);
                        }
                        byteBufferA.position(iPosition);
                    } else {
                        StringBuilder sbP = androidx.datastore.preferences.protobuf.a.p(i3, i4, "APK Signing Block entry #", " size out of range: ", ", available: ");
                        sbP.append(byteBufferA.remaining());
                        throw new j(sbP.toString());
                    }
                } else {
                    throw new j("APK Signing Block entry #" + i3 + " size out of range: " + j);
                }
            } else {
                throw new j("Insufficient data to read size of APK Signing Block entry #".concat(String.valueOf(i3)));
            }
        }
        throw new j("No APK Signature Scheme block in APK Signing Block with ID: ".concat(String.valueOf(i2)));
    }

    public static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException("start: ".concat(String.valueOf(i2)));
        }
        if (i3 >= i2) {
            int iCapacity = byteBuffer.capacity();
            if (i3 <= byteBuffer.capacity()) {
                int iLimit = byteBuffer.limit();
                int iPosition = byteBuffer.position();
                try {
                    byteBuffer.position(0);
                    byteBuffer.limit(i3);
                    byteBuffer.position(i2);
                    ByteBuffer byteBufferSlice = byteBuffer.slice();
                    byteBufferSlice.order(byteBuffer.order());
                    return byteBufferSlice;
                } finally {
                    byteBuffer.position(0);
                    byteBuffer.limit(iLimit);
                    byteBuffer.position(iPosition);
                }
            }
            throw new IllegalArgumentException(android.support.v4.media.a.g(i3, iCapacity, "end > capacity: ", " > "));
        }
        throw new IllegalArgumentException(android.support.v4.media.a.g(i3, i2, "end < start: ", " < "));
    }
}
