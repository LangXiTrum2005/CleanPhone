package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class tx1 extends z01 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g22 f20521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qx1 f20522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ByteBuffer f20523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f20524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f20525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f20526h;

    static {
        z5.a("media3.decoder");
    }

    public tx1(int i10) {
        super(1);
        this.f20522d = new qx1(0);
        this.f20526h = i10;
    }

    public void g() {
        this.f22444b = 0;
        ByteBuffer byteBuffer = this.f20523e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f20525g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
    }

    public final void h(int i10) {
        ByteBuffer byteBuffer = this.f20523e;
        if (byteBuffer == null) {
            this.f20523e = k(i10);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (iCapacity >= i11) {
            this.f20523e = byteBuffer;
            return;
        }
        ByteBuffer byteBufferK = k(i11);
        byteBufferK.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferK.put(byteBuffer);
        }
        this.f20523e = byteBufferK;
    }

    public final boolean i() {
        return f(1073741824);
    }

    public final void j() {
        ByteBuffer byteBuffer = this.f20523e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f20525g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final ByteBuffer k(int i10) {
        int i11 = this.f20526h;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f20523e;
        int iCapacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb2 = new StringBuilder(String.valueOf(iCapacity).length() + 21 + String.valueOf(i10).length() + 1);
        l1.d.p(sb2, "Buffer too small (", iCapacity, " < ", i10);
        sb2.append(")");
        throw new sx1(sb2.toString());
    }
}
