package com.efs.sdk.memleaksdk.monitor.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements m, n, Cloneable, ByteChannel {
    private static final byte[] c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    r f688a;
    long b;

    public long a() {
        return this.b;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.n
    public boolean b() {
        return this.b == 0;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.n
    public byte c() {
        long j = this.b;
        if (j == 0) {
            throw new IllegalStateException("size == 0");
        }
        r rVar = this.f688a;
        int i = rVar.b;
        int i2 = rVar.c;
        int i3 = i + 1;
        byte b = rVar.f693a[i];
        this.b = j - 1;
        if (i3 == i2) {
            this.f688a = rVar.b();
            s.a(rVar);
        } else {
            rVar.b = i3;
        }
        return b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, com.efs.sdk.memleaksdk.monitor.internal.v
    public void close() {
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.n
    public short d() {
        long j = this.b;
        if (j < 2) {
            throw new IllegalStateException("size < 2: " + this.b);
        }
        r rVar = this.f688a;
        int i = rVar.b;
        int i2 = rVar.c;
        if (i2 - i < 2) {
            return (short) (((c() & 255) << 8) | (c() & 255));
        }
        byte[] bArr = rVar.f693a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.b = j - 2;
        if (i5 == i2) {
            this.f688a = rVar.b();
            s.a(rVar);
        } else {
            rVar.b = i5;
        }
        return (short) i6;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.n
    public int e() {
        long j = this.b;
        if (j < 4) {
            throw new IllegalStateException("size < 4: " + this.b);
        }
        r rVar = this.f688a;
        int i = rVar.b;
        int i2 = rVar.c;
        if (i2 - i < 4) {
            return ((c() & 255) << 24) | ((c() & 255) << 16) | ((c() & 255) << 8) | (c() & 255);
        }
        byte[] bArr = rVar.f693a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.b = j - 4;
        if (i5 == i2) {
            this.f688a = rVar.b();
            s.a(rVar);
        } else {
            rVar.b = i5;
        }
        return i6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        long j = this.b;
        if (j != lVar.b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        r rVar = this.f688a;
        r rVar2 = lVar.f688a;
        int i = rVar.b;
        int i2 = rVar2.b;
        while (j2 < this.b) {
            long jMin = Math.min(rVar.c - i, rVar2.c - i2);
            int i3 = 0;
            while (i3 < jMin) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (rVar.f693a[i] != rVar2.f693a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == rVar.c) {
                rVar = rVar.f;
                i = rVar.b;
            }
            if (i2 == rVar2.c) {
                rVar2 = rVar2.f;
                i2 = rVar2.b;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.n
    public long f() {
        long j = this.b;
        if (j < 8) {
            throw new IllegalStateException("size < 8: " + this.b);
        }
        r rVar = this.f688a;
        int i = rVar.b;
        int i2 = rVar.c;
        if (i2 - i < 8) {
            return ((((long) e()) & 4294967295L) << 32) | (4294967295L & ((long) e()));
        }
        byte[] bArr = rVar.f693a;
        int i3 = i + 7;
        long j2 = ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        int i4 = i + 8;
        long j3 = j2 | (((long) bArr[i3]) & 255);
        this.b = j - 8;
        if (i4 == i2) {
            this.f688a = rVar.b();
            s.a(rVar);
        } else {
            rVar.b = i4;
        }
        return j3;
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    public void g() {
        try {
            c(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public l clone() {
        l lVar = new l();
        if (this.b == 0) {
            return lVar;
        }
        r rVarA = this.f688a.a();
        lVar.f688a = rVarA;
        rVarA.g = rVarA;
        rVarA.f = rVarA;
        r rVar = this.f688a;
        while (true) {
            rVar = rVar.f;
            if (rVar == this.f688a) {
                lVar.b = this.b;
                return lVar;
            }
            lVar.f688a.g.a(rVar.a());
        }
    }

    public int hashCode() {
        r rVar = this.f688a;
        if (rVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = rVar.c;
            for (int i3 = rVar.b; i3 < i2; i3++) {
                i = (i * 31) + rVar.f693a[i3];
            }
            rVar = rVar.f;
        } while (rVar != this.f688a);
        return i;
    }

    public o i() {
        long j = this.b;
        if (j <= 2147483647L) {
            return b((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.b);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        r rVar = this.f688a;
        if (rVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), rVar.c - rVar.b);
        byteBuffer.put(rVar.f693a, rVar.b, iMin);
        int i = rVar.b + iMin;
        rVar.b = i;
        this.b -= (long) iMin;
        if (i == rVar.c) {
            this.f688a = rVar.b();
            s.a(rVar);
        }
        return iMin;
    }

    public String toString() {
        return i().toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            r rVarA = a(1);
            int iMin = Math.min(i, 8192 - rVarA.c);
            byteBuffer.get(rVarA.f693a, rVarA.c, iMin);
            i -= iMin;
            rVarA.c += iMin;
        }
        this.b += (long) iRemaining;
        return iRemaining;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.n
    public String a(long j) throws EOFException {
        return a(j, x.f696a);
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.n
    public byte[] b(long j) throws EOFException {
        x.a(this.b, 0L, j);
        if (j > 2147483647L) {
            throw new IllegalArgumentException(AbstractC5044xl.h("byteCount > Integer.MAX_VALUE: ", j));
        }
        byte[] bArr = new byte[(int) j];
        a(bArr);
        return bArr;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.n
    public String a(long j, Charset charset) throws EOFException {
        x.a(this.b, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException(AbstractC5044xl.h("byteCount > Integer.MAX_VALUE: ", j));
        }
        if (j == 0) {
            return "";
        }
        r rVar = this.f688a;
        int i = rVar.b;
        if (((long) i) + j > rVar.c) {
            return new String(b(j), charset);
        }
        String str = new String(rVar.f693a, i, (int) j, charset);
        int i2 = (int) (((long) rVar.b) + j);
        rVar.b = i2;
        this.b -= j;
        if (i2 == rVar.c) {
            this.f688a = rVar.b();
            s.a(rVar);
        }
        return str;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.v
    public long b(l lVar, long j) {
        if (lVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j >= 0) {
            long j2 = this.b;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            lVar.a(this, j);
            return j;
        }
        throw new IllegalArgumentException(AbstractC5044xl.h("byteCount < 0: ", j));
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.n
    public void c(long j) throws EOFException {
        while (j > 0) {
            r rVar = this.f688a;
            if (rVar != null) {
                int iMin = (int) Math.min(j, rVar.c - rVar.b);
                long j2 = iMin;
                this.b -= j2;
                j -= j2;
                r rVar2 = this.f688a;
                int i = rVar2.b + iMin;
                rVar2.b = i;
                if (i == rVar2.c) {
                    this.f688a = rVar2.b();
                    s.a(rVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public void a(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int iA = a(bArr, i, bArr.length - i);
            if (iA == -1) {
                throw new EOFException();
            }
            i += iA;
        }
    }

    public o b(int i) {
        if (i == 0) {
            return o.b;
        }
        return new t(this, i);
    }

    public int a(byte[] bArr, int i, int i2) {
        x.a(bArr.length, i, i2);
        r rVar = this.f688a;
        if (rVar == null) {
            return -1;
        }
        int iMin = Math.min(i2, rVar.c - rVar.b);
        System.arraycopy(rVar.f693a, rVar.b, bArr, i, iMin);
        int i3 = rVar.b + iMin;
        rVar.b = i3;
        this.b -= (long) iMin;
        if (i3 == rVar.c) {
            this.f688a = rVar.b();
            s.a(rVar);
        }
        return iMin;
    }

    public r a(int i) {
        if (i >= 1 && i <= 8192) {
            r rVar = this.f688a;
            if (rVar == null) {
                r rVarA = s.a();
                this.f688a = rVarA;
                rVarA.g = rVarA;
                rVarA.f = rVarA;
                return rVarA;
            }
            r rVar2 = rVar.g;
            return (rVar2.c + i > 8192 || !rVar2.e) ? rVar2.a(s.a()) : rVar2;
        }
        throw new IllegalArgumentException();
    }

    public void a(l lVar, long j) {
        if (lVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (lVar != this) {
            x.a(lVar.b, 0L, j);
            while (j > 0) {
                r rVar = lVar.f688a;
                if (j < rVar.c - rVar.b) {
                    r rVar2 = this.f688a;
                    r rVar3 = rVar2 != null ? rVar2.g : null;
                    if (rVar3 != null && rVar3.e) {
                        if ((((long) rVar3.c) + j) - ((long) (rVar3.d ? 0 : rVar3.b)) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                            rVar.a(rVar3, (int) j);
                            lVar.b -= j;
                            this.b += j;
                            return;
                        }
                    }
                    lVar.f688a = rVar.a((int) j);
                }
                r rVar4 = lVar.f688a;
                long j2 = rVar4.c - rVar4.b;
                lVar.f688a = rVar4.b();
                r rVar5 = this.f688a;
                if (rVar5 == null) {
                    this.f688a = rVar4;
                    rVar4.g = rVar4;
                    rVar4.f = rVar4;
                } else {
                    rVar5.g.a(rVar4).c();
                }
                lVar.b -= j2;
                this.b += j2;
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.n
    public long a(byte b) {
        return a(b, 0L, Long.MAX_VALUE);
    }

    public long a(byte b, long j, long j2) {
        r rVar;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (j3 >= 0 && j4 >= j3) {
            long j6 = this.b;
            if (j4 > j6) {
                j4 = j6;
            }
            if (j3 == j4 || (rVar = this.f688a) == null) {
                return -1L;
            }
            if (j6 - j3 < j3) {
                while (j6 > j3) {
                    rVar = rVar.g;
                    j6 -= (long) (rVar.c - rVar.b);
                }
            } else {
                while (true) {
                    long j7 = ((long) (rVar.c - rVar.b)) + j5;
                    if (j7 >= j3) {
                        break;
                    }
                    rVar = rVar.f;
                    j5 = j7;
                }
                j6 = j5;
            }
            while (j6 < j4) {
                byte[] bArr = rVar.f693a;
                int iMin = (int) Math.min(rVar.c, (((long) rVar.b) + j4) - j6);
                for (int i = (int) ((((long) rVar.b) + j3) - j6); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - rVar.b)) + j6;
                    }
                }
                j6 += (long) (rVar.c - rVar.b);
                rVar = rVar.f;
                j3 = j6;
            }
            return -1L;
        }
        StringBuilder sbP = DM.p("size=", this.b, " fromIndex=");
        sbP.append(j3);
        sbP.append(" toIndex=");
        sbP.append(j4);
        throw new IllegalArgumentException(sbP.toString());
    }
}
