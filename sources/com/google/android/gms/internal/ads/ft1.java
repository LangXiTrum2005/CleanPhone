package com.google.android.gms.internal.ads;

import com.google.protobuf.Internal;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ft1 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f14534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer f14535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f14540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14541i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f14542j;

    public /* synthetic */ ft1() {
        this.f14533a = 0;
    }

    public boolean d() {
        this.f14537e++;
        Iterator it = this.f14534b;
        if (!it.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) it.next();
        this.f14535c = byteBuffer;
        this.f14538f = byteBuffer.position();
        if (this.f14535c.hasArray()) {
            this.f14539g = true;
            this.f14540h = this.f14535c.array();
            this.f14541i = this.f14535c.arrayOffset();
        } else {
            this.f14539g = false;
            this.f14542j = com.google.protobuf.x4.b(this.f14535c);
            this.f14540h = null;
        }
        return true;
    }

    public void h(int i10) {
        int i11 = this.f14538f + i10;
        this.f14538f = i11;
        if (i11 == this.f14535c.limit()) {
            d();
        }
    }

    public boolean k() {
        ByteBuffer byteBuffer;
        Iterator it = this.f14534b;
        do {
            this.f14537e++;
            if (!it.hasNext()) {
                return false;
            }
            byteBuffer = (ByteBuffer) it.next();
            this.f14535c = byteBuffer;
        } while (!byteBuffer.hasRemaining());
        this.f14538f = this.f14535c.position();
        if (this.f14535c.hasArray()) {
            this.f14539g = true;
            this.f14540h = this.f14535c.array();
            this.f14541i = this.f14535c.arrayOffset();
            return true;
        }
        this.f14539g = false;
        this.f14542j = nu1.n(this.f14535c);
        this.f14540h = null;
        return true;
    }

    public void n(int i10) {
        int i11 = this.f14538f + i10;
        this.f14538f = i11;
        if (i11 == this.f14535c.limit()) {
            k();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        int iI0;
        int iF;
        switch (this.f14533a) {
            case 0:
                if (this.f14537e == this.f14536d) {
                    return -1;
                }
                if (this.f14539g) {
                    iI0 = this.f14540h[this.f14538f + this.f14541i] & 255;
                    n(1);
                } else {
                    iI0 = nu1.f17982c.I0(((long) this.f14538f) + this.f14542j) & 255;
                    n(1);
                }
                return iI0;
            default:
                if (this.f14537e == this.f14536d) {
                    return -1;
                }
                if (this.f14539g) {
                    iF = this.f14540h[this.f14538f + this.f14541i] & 255;
                    h(1);
                } else {
                    iF = com.google.protobuf.x4.f25021c.f(((long) this.f14538f) + this.f14542j) & 255;
                    h(1);
                }
                return iF;
        }
    }

    public ft1(Iterable iterable) {
        this.f14533a = 1;
        this.f14534b = iterable.iterator();
        this.f14536d = 0;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f14536d++;
        }
        this.f14537e = -1;
        if (d()) {
            return;
        }
        this.f14535c = Internal.EMPTY_BYTE_BUFFER;
        this.f14537e = 0;
        this.f14538f = 0;
        this.f14542j = 0L;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        switch (this.f14533a) {
            case 0:
                if (this.f14537e == this.f14536d) {
                    return -1;
                }
                int iLimit = this.f14535c.limit();
                int i12 = this.f14538f;
                int i13 = iLimit - i12;
                if (i11 > i13) {
                    i11 = i13;
                }
                if (this.f14539g) {
                    System.arraycopy(this.f14540h, i12 + this.f14541i, bArr, i10, i11);
                    n(i11);
                } else {
                    int iPosition = this.f14535c.position();
                    this.f14535c.position(this.f14538f);
                    this.f14535c.get(bArr, i10, i11);
                    this.f14535c.position(iPosition);
                    n(i11);
                }
                return i11;
            default:
                if (this.f14537e == this.f14536d) {
                    return -1;
                }
                int iLimit2 = this.f14535c.limit();
                int i14 = this.f14538f;
                int i15 = iLimit2 - i14;
                if (i11 > i15) {
                    i11 = i15;
                }
                if (this.f14539g) {
                    System.arraycopy(this.f14540h, i14 + this.f14541i, bArr, i10, i11);
                    h(i11);
                } else {
                    int iPosition2 = this.f14535c.position();
                    this.f14535c.position(this.f14538f);
                    this.f14535c.get(bArr, i10, i11);
                    this.f14535c.position(iPosition2);
                    h(i11);
                }
                return i11;
        }
    }
}
