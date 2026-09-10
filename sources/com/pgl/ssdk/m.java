package com.pgl.ssdk;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes5.dex */
public class m implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileChannel f33477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f33478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f33479c;

    public m(FileChannel fileChannel, long j, long j2) {
        if (j < 0) {
            throw new IndexOutOfBoundsException("offset: ".concat(String.valueOf(j2)));
        }
        if (j2 < 0) {
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(j2)));
        }
        this.f33477a = fileChannel;
        this.f33478b = j;
        this.f33479c = j2;
    }

    @Override // com.pgl.ssdk.q
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m a(long j, long j2) {
        long jA = a();
        a(j, j2, jA);
        return (j == 0 && j2 == jA) ? this : new m(this.f33477a, this.f33478b + j, j2);
    }

    private static void a(long j, long j2, long j3) {
        if (j < 0) {
            throw new IndexOutOfBoundsException("offset: ".concat(String.valueOf(j)));
        }
        if (j2 < 0) {
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(j2)));
        }
        if (j > j3) {
            throw new IndexOutOfBoundsException(android.support.v4.media.a.j(j3, ")", android.support.v4.media.a.v(j, "offset (", ") > source size (")));
        }
        long j4 = j + j2;
        if (j4 < j) {
            throw new IndexOutOfBoundsException(android.support.v4.media.a.j(j2, ") overflow", android.support.v4.media.a.v(j, "offset (", ") + size (")));
        }
        if (j4 <= j3) {
            return;
        }
        StringBuilder sbV = android.support.v4.media.a.v(j, "offset (", ") + size (");
        sbV.append(j2);
        sbV.append(") > source size (");
        sbV.append(j3);
        sbV.append(")");
        throw new IndexOutOfBoundsException(sbV.toString());
    }

    @Override // com.pgl.ssdk.q
    public long a() {
        long j = this.f33479c;
        if (j != -1) {
            return j;
        }
        try {
            return this.f33477a.size();
        } catch (IOException unused) {
            return 0L;
        }
    }

    public void a(long j, int i2, ByteBuffer byteBuffer) throws IOException {
        int i3;
        a(j, i2, a());
        if (i2 == 0) {
            return;
        }
        if (i2 <= byteBuffer.remaining()) {
            long j2 = this.f33478b + j;
            int iLimit = byteBuffer.limit();
            try {
                byteBuffer.limit(byteBuffer.position() + i2);
                while (i2 > 0) {
                    synchronized (this.f33477a) {
                        this.f33477a.position(j2);
                        i3 = this.f33477a.read(byteBuffer);
                    }
                    j2 += (long) i3;
                    i2 -= i3;
                }
                byteBuffer.limit(iLimit);
                return;
            } catch (Throwable th) {
                byteBuffer.limit(iLimit);
                throw th;
            }
        }
        throw new BufferOverflowException();
    }

    @Override // com.pgl.ssdk.q
    public ByteBuffer a(long j, int i2) throws IOException {
        if (i2 >= 0) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i2);
            a(j, i2, byteBufferAllocate);
            byteBufferAllocate.flip();
            return byteBufferAllocate;
        }
        throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(i2)));
    }
}
