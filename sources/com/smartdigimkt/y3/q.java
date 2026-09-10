package com.smartdigimkt.y3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f40148p = 150000;
    private static final long q = 20000;
    private static final short r = 1024;
    private static final byte s = 4;
    private static final int t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f40149u = 1;
    private static final int v = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40151c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f40152e;
    private ByteBuffer f;
    private ByteBuffer g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f40153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private byte[] f40154i;
    private byte[] j;
    private int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f40155l;
    private int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f40156n;
    private long o;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public q() {
        ByteBuffer byteBuffer = f.f40052a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        this.f40150b = -1;
        this.f40151c = -1;
        this.f40154i = new byte[0];
        this.j = new byte[0];
    }

    public void a(boolean z2) {
        this.f40152e = z2;
        flush();
    }

    public long b() {
        return this.o;
    }

    @Override // com.smartdigimkt.y3.f
    public void c() {
        this.f40152e = false;
        flush();
        this.f = f.f40052a;
        this.f40150b = -1;
        this.f40151c = -1;
        this.m = 0;
        this.f40154i = new byte[0];
        this.j = new byte[0];
    }

    @Override // com.smartdigimkt.y3.f
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.g;
        this.g = f.f40052a;
        return byteBuffer;
    }

    @Override // com.smartdigimkt.y3.f
    public void e() {
        this.f40153h = true;
        int i2 = this.f40155l;
        if (i2 > 0) {
            a(this.f40154i, i2);
        }
        if (this.f40156n) {
            return;
        }
        this.o += (long) (this.m / this.d);
    }

    @Override // com.smartdigimkt.y3.f
    public boolean f() {
        return this.f40151c != -1 && this.f40152e;
    }

    @Override // com.smartdigimkt.y3.f
    public void flush() {
        if (f()) {
            int iA = a(f40148p) * this.d;
            if (this.f40154i.length != iA) {
                this.f40154i = new byte[iA];
            }
            int iA2 = a(q) * this.d;
            this.m = iA2;
            if (this.j.length != iA2) {
                this.j = new byte[iA2];
            }
        }
        this.k = 0;
        this.g = f.f40052a;
        this.f40153h = false;
        this.o = 0L;
        this.f40155l = 0;
        this.f40156n = false;
    }

    @Override // com.smartdigimkt.y3.f
    public int g() {
        return this.f40150b;
    }

    @Override // com.smartdigimkt.y3.f
    public int h() {
        return this.f40151c;
    }

    @Override // com.smartdigimkt.y3.f
    public int i() {
        return 2;
    }

    private int b(ByteBuffer byteBuffer) {
        for (int iLimit = byteBuffer.limit() - 1; iLimit >= byteBuffer.position(); iLimit -= 2) {
            if (Math.abs((int) byteBuffer.get(iLimit)) > 4) {
                int i2 = this.d;
                return androidx.datastore.preferences.protobuf.a.a(iLimit, i2, i2, i2);
            }
        }
        return byteBuffer.position();
    }

    private void f(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f40154i.length));
        int iB = b(byteBuffer);
        if (iB == byteBuffer.position()) {
            this.k = 1;
        } else {
            byteBuffer.limit(iB);
            d(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private void g(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iC = c(byteBuffer);
        byteBuffer.limit(iC);
        this.o += (long) (byteBuffer.remaining() / this.d);
        a(byteBuffer, this.j, this.m);
        if (iC < iLimit) {
            a(this.j, this.m);
            this.k = 0;
            byteBuffer.limit(iLimit);
        }
    }

    private void d(ByteBuffer byteBuffer) {
        a(byteBuffer.remaining());
        this.f.put(byteBuffer);
        this.f.flip();
        this.g = this.f;
    }

    @Override // com.smartdigimkt.y3.f
    public boolean a(int i2, int i3, int i4) throws f.a {
        if (i4 == 2) {
            if (this.f40151c == i2 && this.f40150b == i3) {
                return false;
            }
            this.f40151c = i2;
            this.f40150b = i3;
            this.d = i3 * 2;
            return true;
        }
        throw new f.a(i2, i3, i4);
    }

    private void e(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iC = c(byteBuffer);
        int iPosition = iC - byteBuffer.position();
        byte[] bArr = this.f40154i;
        int length = bArr.length;
        int i2 = this.f40155l;
        int i3 = length - i2;
        if (iC < iLimit && iPosition < i3) {
            a(bArr, i2);
            this.f40155l = 0;
            this.k = 0;
            return;
        }
        int iMin = Math.min(iPosition, i3);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f40154i, this.f40155l, iMin);
        int i4 = this.f40155l + iMin;
        this.f40155l = i4;
        byte[] bArr2 = this.f40154i;
        if (i4 == bArr2.length) {
            if (this.f40156n) {
                a(bArr2, this.m);
                this.o += (long) ((this.f40155l - (this.m * 2)) / this.d);
            } else {
                this.o += (long) ((i4 - this.m) / this.d);
            }
            a(byteBuffer, this.f40154i, this.f40155l);
            this.f40155l = 0;
            this.k = 2;
        }
        byteBuffer.limit(iLimit);
    }

    @Override // com.smartdigimkt.y3.f
    public void a(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            int i2 = this.k;
            if (i2 == 0) {
                f(byteBuffer);
            } else if (i2 == 1) {
                e(byteBuffer);
            } else if (i2 == 2) {
                g(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    private int c(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position() + 1; iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.get(iPosition)) > 4) {
                int i2 = this.d;
                return (iPosition / i2) * i2;
            }
        }
        return byteBuffer.limit();
    }

    @Override // com.smartdigimkt.y3.f
    public boolean a() {
        return this.f40153h && this.g == f.f40052a;
    }

    private void a(byte[] bArr, int i2) {
        a(i2);
        this.f.put(bArr, 0, i2);
        this.f.flip();
        this.g = this.f;
    }

    private void a(int i2) {
        if (this.f.capacity() < i2) {
            this.f = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        if (i2 > 0) {
            this.f40156n = true;
        }
    }

    private void a(ByteBuffer byteBuffer, byte[] bArr, int i2) {
        int iMin = Math.min(byteBuffer.remaining(), this.m);
        int i3 = this.m - iMin;
        System.arraycopy(bArr, i2 - i3, this.j, 0, i3);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.j, i3, iMin);
    }

    private int a(long j) {
        return (int) ((j * ((long) this.f40151c)) / 1000000);
    }
}
