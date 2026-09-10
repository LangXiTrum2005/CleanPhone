package com.smartdigimkt.y3;

import com.smartdigimkt.p4.f0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class t implements f {
    public static final float o = 8.0f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final float f40169p = 0.1f;
    public static final float q = 8.0f;
    public static final float r = 0.1f;
    public static final int s = -1;
    private static final float t = 0.01f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f40170u = 1024;
    private int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private s f40174h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ByteBuffer f40175i;
    private ShortBuffer j;
    private ByteBuffer k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f40176l;
    private long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f40177n;
    private float d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f40173e = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40171b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40172c = -1;
    private int f = -1;

    public t() {
        ByteBuffer byteBuffer = f.f40052a;
        this.f40175i = byteBuffer;
        this.j = byteBuffer.asShortBuffer();
        this.k = byteBuffer;
        this.g = -1;
    }

    public float a(float f) {
        float fA = f0.a(f, 0.1f, 8.0f);
        if (this.f40173e != fA) {
            this.f40173e = fA;
            this.f40174h = null;
        }
        flush();
        return fA;
    }

    public float b(float f) {
        float fA = f0.a(f, 0.1f, 8.0f);
        if (this.d != fA) {
            this.d = fA;
            this.f40174h = null;
        }
        flush();
        return fA;
    }

    @Override // com.smartdigimkt.y3.f
    public void c() {
        this.d = 1.0f;
        this.f40173e = 1.0f;
        this.f40171b = -1;
        this.f40172c = -1;
        this.f = -1;
        ByteBuffer byteBuffer = f.f40052a;
        this.f40175i = byteBuffer;
        this.j = byteBuffer.asShortBuffer();
        this.k = byteBuffer;
        this.g = -1;
        this.f40174h = null;
        this.f40176l = 0L;
        this.m = 0L;
        this.f40177n = false;
    }

    @Override // com.smartdigimkt.y3.f
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.k;
        this.k = f.f40052a;
        return byteBuffer;
    }

    @Override // com.smartdigimkt.y3.f
    public void e() {
        com.smartdigimkt.p4.a.b(this.f40174h != null);
        this.f40174h.d();
        this.f40177n = true;
    }

    @Override // com.smartdigimkt.y3.f
    public boolean f() {
        if (this.f40172c != -1) {
            return Math.abs(this.d - 1.0f) >= t || Math.abs(this.f40173e - 1.0f) >= t || this.f != this.f40172c;
        }
        return false;
    }

    @Override // com.smartdigimkt.y3.f
    public void flush() {
        if (f()) {
            s sVar = this.f40174h;
            if (sVar == null) {
                this.f40174h = new s(this.f40172c, this.f40171b, this.d, this.f40173e, this.f);
            } else {
                sVar.a();
            }
        }
        this.k = f.f40052a;
        this.f40176l = 0L;
        this.m = 0L;
        this.f40177n = false;
    }

    @Override // com.smartdigimkt.y3.f
    public int g() {
        return this.f40171b;
    }

    @Override // com.smartdigimkt.y3.f
    public int h() {
        return this.f;
    }

    @Override // com.smartdigimkt.y3.f
    public int i() {
        return 2;
    }

    public void a(int i2) {
        this.g = i2;
    }

    public long a(long j) {
        long j2 = this.m;
        if (j2 >= 1024) {
            int i2 = this.f;
            int i3 = this.f40172c;
            if (i2 == i3) {
                return f0.c(j, this.f40176l, j2);
            }
            return f0.c(j, this.f40176l * ((long) i2), j2 * ((long) i3));
        }
        return (long) (((double) this.d) * j);
    }

    @Override // com.smartdigimkt.y3.f
    public boolean a(int i2, int i3, int i4) throws f.a {
        if (i4 == 2) {
            int i5 = this.g;
            if (i5 == -1) {
                i5 = i2;
            }
            if (this.f40172c == i2 && this.f40171b == i3 && this.f == i5) {
                return false;
            }
            this.f40172c = i2;
            this.f40171b = i3;
            this.f = i5;
            this.f40174h = null;
            return true;
        }
        throw new f.a(i2, i3, i4);
    }

    @Override // com.smartdigimkt.y3.f
    public void a(ByteBuffer byteBuffer) {
        com.smartdigimkt.p4.a.b(this.f40174h != null);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f40176l += (long) iRemaining;
            this.f40174h.b(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
        int iB = this.f40174h.b() * this.f40171b * 2;
        if (iB > 0) {
            if (this.f40175i.capacity() < iB) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iB).order(ByteOrder.nativeOrder());
                this.f40175i = byteBufferOrder;
                this.j = byteBufferOrder.asShortBuffer();
            } else {
                this.f40175i.clear();
                this.j.clear();
            }
            this.f40174h.a(this.j);
            this.m += (long) iB;
            this.f40175i.limit(iB);
            this.k = this.f40175i;
        }
    }

    @Override // com.smartdigimkt.y3.f
    public boolean a() {
        if (!this.f40177n) {
            return false;
        }
        s sVar = this.f40174h;
        return sVar == null || sVar.b() == 0;
    }
}
