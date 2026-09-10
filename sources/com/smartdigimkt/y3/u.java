package com.smartdigimkt.y3;

import com.smartdigimkt.p4.f0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes6.dex */
final class u implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f40178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40179c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f40180e;
    private int f;
    private int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ByteBuffer f40181h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ByteBuffer f40182i;
    private byte[] j;
    private int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f40183l;

    public u() {
        ByteBuffer byteBuffer = f.f40052a;
        this.f40181h = byteBuffer;
        this.f40182i = byteBuffer;
        this.f40180e = -1;
        this.f = -1;
        this.j = new byte[0];
    }

    public void a(int i2, int i3) {
        this.f40179c = i2;
        this.d = i3;
    }

    @Override // com.smartdigimkt.y3.f
    public void c() {
        flush();
        this.f40181h = f.f40052a;
        this.f40180e = -1;
        this.f = -1;
        this.j = new byte[0];
    }

    @Override // com.smartdigimkt.y3.f
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.f40182i;
        this.f40182i = f.f40052a;
        return byteBuffer;
    }

    @Override // com.smartdigimkt.y3.f
    public void e() {
        this.f40183l = true;
    }

    @Override // com.smartdigimkt.y3.f
    public boolean f() {
        return this.f40178b;
    }

    @Override // com.smartdigimkt.y3.f
    public void flush() {
        this.f40182i = f.f40052a;
        this.f40183l = false;
        this.g = 0;
        this.k = 0;
    }

    @Override // com.smartdigimkt.y3.f
    public int g() {
        return this.f40180e;
    }

    @Override // com.smartdigimkt.y3.f
    public int h() {
        return this.f;
    }

    @Override // com.smartdigimkt.y3.f
    public int i() {
        return 2;
    }

    @Override // com.smartdigimkt.y3.f
    public boolean a(int i2, int i3, int i4) throws f.a {
        if (i4 == 2) {
            this.f40180e = i3;
            this.f = i2;
            int i5 = this.d;
            this.j = new byte[i5 * i3 * 2];
            this.k = 0;
            int i6 = this.f40179c;
            this.g = i3 * i6 * 2;
            boolean z2 = this.f40178b;
            boolean z3 = (i6 == 0 && i5 == 0) ? false : true;
            this.f40178b = z3;
            return z2 != z3;
        }
        throw new f.a(i2, i3, i4);
    }

    @Override // com.smartdigimkt.y3.f
    public void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int iMin = Math.min(i2, this.g);
        this.g -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.g > 0) {
            return;
        }
        int i3 = i2 - iMin;
        int length = (this.k + i3) - this.j.length;
        if (this.f40181h.capacity() < length) {
            this.f40181h = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f40181h.clear();
        }
        int iA = f0.a(length, 0, this.k);
        this.f40181h.put(this.j, 0, iA);
        int iA2 = f0.a(length - iA, 0, i3);
        byteBuffer.limit(byteBuffer.position() + iA2);
        this.f40181h.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i4 = i3 - iA2;
        int i5 = this.k - iA;
        this.k = i5;
        byte[] bArr = this.j;
        System.arraycopy(bArr, iA, bArr, 0, i5);
        byteBuffer.get(this.j, this.k, i4);
        this.k += i4;
        this.f40181h.flip();
        this.f40182i = this.f40181h;
    }

    @Override // com.smartdigimkt.y3.f
    public boolean a() {
        return this.f40183l && this.f40182i == f.f40052a;
    }
}
