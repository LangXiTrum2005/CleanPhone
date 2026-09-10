package com.pgl.ssdk;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public abstract class p {
    public static o<ByteBuffer, Long> a(q qVar) throws IOException {
        if (qVar.a() < 22) {
            return null;
        }
        o<ByteBuffer, Long> oVarA = a(qVar, 0);
        return oVarA != null ? oVarA : a(qVar, 65535);
    }

    private static int b(ByteBuffer byteBuffer) {
        a(byteBuffer);
        int iCapacity = byteBuffer.capacity();
        if (iCapacity < 22) {
            return -1;
        }
        int i2 = iCapacity - 22;
        int iMin = Math.min(i2, 65535);
        for (int i3 = 0; i3 <= iMin; i3++) {
            int i4 = i2 - i3;
            if (byteBuffer.getInt(i4) == 101010256 && a(byteBuffer, i4 + 20) == i3) {
                return i4;
            }
        }
        return -1;
    }

    public static long c(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return b(byteBuffer, byteBuffer.position() + 16);
    }

    public static long d(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return b(byteBuffer, byteBuffer.position() + 12);
    }

    public static int e(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return a(byteBuffer, byteBuffer.position() + 10);
    }

    private static o<ByteBuffer, Long> a(q qVar, int i2) throws IOException {
        if (i2 >= 0 && i2 <= 65535) {
            long jA = qVar.a();
            if (jA < 22) {
                return null;
            }
            int iMin = ((int) Math.min(i2, jA - 22)) + 22;
            long j = jA - ((long) iMin);
            ByteBuffer byteBufferA = qVar.a(j, iMin);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferA.order(byteOrder);
            int iB = b(byteBufferA);
            if (iB == -1) {
                return null;
            }
            byteBufferA.position(iB);
            ByteBuffer byteBufferSlice = byteBufferA.slice();
            byteBufferSlice.order(byteOrder);
            return o.a(byteBufferSlice, Long.valueOf(j + ((long) iB)));
        }
        throw new IllegalArgumentException("maxCommentSize: ".concat(String.valueOf(i2)));
    }

    public static long b(ByteBuffer byteBuffer, int i2) {
        return ((long) byteBuffer.getInt(i2)) & 4294967295L;
    }

    public static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static int a(ByteBuffer byteBuffer, int i2) {
        return byteBuffer.getShort(i2) & 65535;
    }
}
