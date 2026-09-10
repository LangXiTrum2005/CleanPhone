package com.umeng.analytics.pro;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class ci extends cp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final int f2538a = -65536;
    protected static final int b = -2147418112;
    private static final cu h = new cu();
    protected boolean c;
    protected boolean d;
    protected int e;
    protected boolean f;
    private byte[] i;
    private byte[] j;
    private byte[] k;
    private byte[] l;
    private byte[] m;
    private byte[] n;
    private byte[] o;
    private byte[] p;

    public static class a implements cr {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected boolean f2539a;
        protected boolean b;
        protected int c;

        public a() {
            this(false, true);
        }

        @Override // com.umeng.analytics.pro.cr
        public cp a(dd ddVar) {
            ci ciVar = new ci(ddVar, this.f2539a, this.b);
            int i = this.c;
            if (i != 0) {
                ciVar.c(i);
            }
            return ciVar;
        }

        public a(boolean z, boolean z2) {
            this(z, z2, 0);
        }

        public a(boolean z, boolean z2, int i) {
            this.f2539a = z;
            this.b = z2;
            this.c = i;
        }
    }

    public ci(dd ddVar) {
        this(ddVar, false, true);
    }

    @Override // com.umeng.analytics.pro.cp
    public ByteBuffer A() throws bw {
        int iW = w();
        d(iW);
        if (this.g.h() >= iW) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.g.f(), this.g.g(), iW);
            this.g.a(iW);
            return byteBufferWrap;
        }
        byte[] bArr = new byte[iW];
        this.g.d(bArr, 0, iW);
        return ByteBuffer.wrap(bArr);
    }

    @Override // com.umeng.analytics.pro.cp
    public void a() {
    }

    @Override // com.umeng.analytics.pro.cp
    public void b() {
    }

    @Override // com.umeng.analytics.pro.cp
    public void c() {
    }

    @Override // com.umeng.analytics.pro.cp
    public void d() throws bw {
        a((byte) 0);
    }

    @Override // com.umeng.analytics.pro.cp
    public void e() {
    }

    @Override // com.umeng.analytics.pro.cp
    public void f() {
    }

    @Override // com.umeng.analytics.pro.cp
    public void g() {
    }

    @Override // com.umeng.analytics.pro.cp
    public cn h() throws bw {
        int iW = w();
        if (iW < 0) {
            if (((-65536) & iW) == b) {
                return new cn(z(), (byte) (iW & 255), w());
            }
            throw new cq(4, "Bad version in readMessageBegin");
        }
        if (this.c) {
            throw new cq(4, "Missing version in readMessageBegin, old client?");
        }
        return new cn(b(iW), u(), w());
    }

    @Override // com.umeng.analytics.pro.cp
    public void i() {
    }

    @Override // com.umeng.analytics.pro.cp
    public cu j() {
        return h;
    }

    @Override // com.umeng.analytics.pro.cp
    public void k() {
    }

    @Override // com.umeng.analytics.pro.cp
    public ck l() throws bw {
        byte bU = u();
        return new ck("", bU, bU == 0 ? (short) 0 : v());
    }

    @Override // com.umeng.analytics.pro.cp
    public void m() {
    }

    @Override // com.umeng.analytics.pro.cp
    public cm n() throws bw {
        return new cm(u(), u(), w());
    }

    @Override // com.umeng.analytics.pro.cp
    public void o() {
    }

    @Override // com.umeng.analytics.pro.cp
    public cl p() throws bw {
        return new cl(u(), w());
    }

    @Override // com.umeng.analytics.pro.cp
    public void q() {
    }

    @Override // com.umeng.analytics.pro.cp
    public ct r() throws bw {
        return new ct(u(), w());
    }

    @Override // com.umeng.analytics.pro.cp
    public void s() {
    }

    @Override // com.umeng.analytics.pro.cp
    public boolean t() throws bw {
        return u() == 1;
    }

    @Override // com.umeng.analytics.pro.cp
    public byte u() throws bw {
        if (this.g.h() < 1) {
            a(this.m, 0, 1);
            return this.m[0];
        }
        byte b2 = this.g.f()[this.g.g()];
        this.g.a(1);
        return b2;
    }

    @Override // com.umeng.analytics.pro.cp
    public short v() throws bw {
        int iG;
        byte[] bArrF = this.n;
        if (this.g.h() >= 2) {
            bArrF = this.g.f();
            iG = this.g.g();
            this.g.a(2);
        } else {
            a(this.n, 0, 2);
            iG = 0;
        }
        return (short) ((bArrF[iG + 1] & 255) | ((bArrF[iG] & 255) << 8));
    }

    @Override // com.umeng.analytics.pro.cp
    public int w() throws bw {
        int iG;
        byte[] bArrF = this.o;
        if (this.g.h() >= 4) {
            bArrF = this.g.f();
            iG = this.g.g();
            this.g.a(4);
        } else {
            a(this.o, 0, 4);
            iG = 0;
        }
        return (bArrF[iG + 3] & 255) | ((bArrF[iG] & 255) << 24) | ((bArrF[iG + 1] & 255) << 16) | ((bArrF[iG + 2] & 255) << 8);
    }

    @Override // com.umeng.analytics.pro.cp
    public long x() throws bw {
        int iG;
        byte[] bArrF = this.p;
        if (this.g.h() >= 8) {
            bArrF = this.g.f();
            iG = this.g.g();
            this.g.a(8);
        } else {
            a(this.p, 0, 8);
            iG = 0;
        }
        return ((long) (bArrF[iG + 7] & 255)) | (((long) (bArrF[iG] & 255)) << 56) | (((long) (bArrF[iG + 1] & 255)) << 48) | (((long) (bArrF[iG + 2] & 255)) << 40) | (((long) (bArrF[iG + 3] & 255)) << 32) | (((long) (bArrF[iG + 4] & 255)) << 24) | (((long) (bArrF[iG + 5] & 255)) << 16) | (((long) (bArrF[iG + 6] & 255)) << 8);
    }

    @Override // com.umeng.analytics.pro.cp
    public double y() throws bw {
        return Double.longBitsToDouble(x());
    }

    @Override // com.umeng.analytics.pro.cp
    public String z() throws bw {
        int iW = w();
        if (this.g.h() < iW) {
            return b(iW);
        }
        try {
            String str = new String(this.g.f(), this.g.g(), iW, C.UTF8_NAME);
            this.g.a(iW);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new bw("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    public ci(dd ddVar, boolean z, boolean z2) {
        super(ddVar);
        this.f = false;
        this.i = new byte[1];
        this.j = new byte[2];
        this.k = new byte[4];
        this.l = new byte[8];
        this.m = new byte[1];
        this.n = new byte[2];
        this.o = new byte[4];
        this.p = new byte[8];
        this.c = z;
        this.d = z2;
    }

    @Override // com.umeng.analytics.pro.cp
    public void a(cu cuVar) {
    }

    public String b(int i) throws bw {
        try {
            d(i);
            byte[] bArr = new byte[i];
            this.g.d(bArr, 0, i);
            return new String(bArr, C.UTF8_NAME);
        } catch (UnsupportedEncodingException unused) {
            throw new bw("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    public void c(int i) {
        this.e = i;
        this.f = true;
    }

    public void d(int i) throws bw {
        if (i < 0) {
            throw new cq(AbstractC3950lJ.p("Negative length: ", i));
        }
        if (this.f) {
            int i2 = this.e - i;
            this.e = i2;
            if (i2 < 0) {
                throw new cq(AbstractC3950lJ.p("Message length exceeded: ", i));
            }
        }
    }

    @Override // com.umeng.analytics.pro.cp
    public void a(cn cnVar) throws bw {
        if (this.d) {
            a(cnVar.b | b);
            a(cnVar.f2546a);
            a(cnVar.c);
        } else {
            a(cnVar.f2546a);
            a(cnVar.b);
            a(cnVar.c);
        }
    }

    @Override // com.umeng.analytics.pro.cp
    public void a(ck ckVar) throws bw {
        a(ckVar.b);
        a(ckVar.c);
    }

    @Override // com.umeng.analytics.pro.cp
    public void a(cm cmVar) throws bw {
        a(cmVar.f2545a);
        a(cmVar.b);
        a(cmVar.c);
    }

    @Override // com.umeng.analytics.pro.cp
    public void a(cl clVar) throws bw {
        a(clVar.f2544a);
        a(clVar.b);
    }

    @Override // com.umeng.analytics.pro.cp
    public void a(ct ctVar) throws bw {
        a(ctVar.f2550a);
        a(ctVar.b);
    }

    @Override // com.umeng.analytics.pro.cp
    public void a(boolean z) throws bw {
        a(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.umeng.analytics.pro.cp
    public void a(byte b2) throws bw {
        byte[] bArr = this.i;
        bArr[0] = b2;
        this.g.b(bArr, 0, 1);
    }

    @Override // com.umeng.analytics.pro.cp
    public void a(short s) throws bw {
        byte[] bArr = this.j;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        this.g.b(bArr, 0, 2);
    }

    @Override // com.umeng.analytics.pro.cp
    public void a(int i) throws bw {
        byte[] bArr = this.k;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        this.g.b(bArr, 0, 4);
    }

    @Override // com.umeng.analytics.pro.cp
    public void a(long j) throws bw {
        byte[] bArr = this.l;
        bArr[0] = (byte) ((j >> 56) & 255);
        bArr[1] = (byte) ((j >> 48) & 255);
        bArr[2] = (byte) ((j >> 40) & 255);
        bArr[3] = (byte) ((j >> 32) & 255);
        bArr[4] = (byte) ((j >> 24) & 255);
        bArr[5] = (byte) ((j >> 16) & 255);
        bArr[6] = (byte) ((j >> 8) & 255);
        bArr[7] = (byte) (j & 255);
        this.g.b(bArr, 0, 8);
    }

    @Override // com.umeng.analytics.pro.cp
    public void a(double d) throws bw {
        a(Double.doubleToLongBits(d));
    }

    @Override // com.umeng.analytics.pro.cp
    public void a(String str) throws bw {
        try {
            byte[] bytes = str.getBytes(C.UTF8_NAME);
            a(bytes.length);
            this.g.b(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new bw("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.umeng.analytics.pro.cp
    public void a(ByteBuffer byteBuffer) throws bw {
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        a(iLimit);
        this.g.b(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), iLimit);
    }

    private int a(byte[] bArr, int i, int i2) throws bw {
        d(i2);
        return this.g.d(bArr, i, i2);
    }
}
