package com.smartdigimkt.y3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
final class k implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40093c;
    private int[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f40094e;
    private int[] f;
    private ByteBuffer g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ByteBuffer f40095h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f40096i;

    public k() {
        ByteBuffer byteBuffer = f.f40052a;
        this.g = byteBuffer;
        this.f40095h = byteBuffer;
        this.f40092b = -1;
        this.f40093c = -1;
    }

    public void a(int[] iArr) {
        this.d = iArr;
    }

    @Override // com.smartdigimkt.y3.f
    public void c() {
        flush();
        this.g = f.f40052a;
        this.f40092b = -1;
        this.f40093c = -1;
        this.f = null;
        this.d = null;
        this.f40094e = false;
    }

    @Override // com.smartdigimkt.y3.f
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.f40095h;
        this.f40095h = f.f40052a;
        return byteBuffer;
    }

    @Override // com.smartdigimkt.y3.f
    public void e() {
        this.f40096i = true;
    }

    @Override // com.smartdigimkt.y3.f
    public boolean f() {
        return this.f40094e;
    }

    @Override // com.smartdigimkt.y3.f
    public void flush() {
        this.f40095h = f.f40052a;
        this.f40096i = false;
    }

    @Override // com.smartdigimkt.y3.f
    public int g() {
        int[] iArr = this.f;
        return iArr == null ? this.f40092b : iArr.length;
    }

    @Override // com.smartdigimkt.y3.f
    public int h() {
        return this.f40093c;
    }

    @Override // com.smartdigimkt.y3.f
    public int i() {
        return 2;
    }

    @Override // com.smartdigimkt.y3.f
    public boolean a(int i2, int i3, int i4) throws f.a {
        boolean zEquals = Arrays.equals(this.d, this.f);
        boolean z2 = !zEquals;
        int[] iArr = this.d;
        this.f = iArr;
        if (iArr == null) {
            this.f40094e = false;
            return z2;
        }
        if (i4 != 2) {
            throw new f.a(i2, i3, i4);
        }
        if (zEquals && this.f40093c == i2 && this.f40092b == i3) {
            return false;
        }
        this.f40093c = i2;
        this.f40092b = i3;
        this.f40094e = i3 != iArr.length;
        int i5 = 0;
        while (true) {
            int[] iArr2 = this.f;
            if (i5 >= iArr2.length) {
                return true;
            }
            int i6 = iArr2[i5];
            if (i6 >= i3) {
                throw new f.a(i2, i3, i4);
            }
            this.f40094e = (i6 != i5) | this.f40094e;
            i5++;
        }
    }

    @Override // com.smartdigimkt.y3.f
    public void a(ByteBuffer byteBuffer) {
        com.smartdigimkt.p4.a.b(this.f != null);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int length = ((iLimit - iPosition) / (this.f40092b * 2)) * this.f.length * 2;
        if (this.g.capacity() < length) {
            this.g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.g.clear();
        }
        while (iPosition < iLimit) {
            for (int i2 : this.f) {
                this.g.putShort(byteBuffer.getShort((i2 * 2) + iPosition));
            }
            iPosition += this.f40092b * 2;
        }
        byteBuffer.position(iLimit);
        this.g.flip();
        this.f40095h = this.g;
    }

    @Override // com.smartdigimkt.y3.f
    public boolean a() {
        return this.f40096i && this.f40095h == f.f40052a;
    }
}
