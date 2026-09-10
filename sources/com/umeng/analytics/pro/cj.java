package com.umeng.analytics.pro;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class cj extends cp {
    private static final cu d = new cu("");
    private static final ck e = new ck("", (byte) 0, 0);
    private static final byte[] f = {0, 0, 1, 3, 7, 0, 4, 0, 5, 0, 6, 8, 12, 11, 10, 9};
    private static final byte h = -126;
    private static final byte i = 1;
    private static final byte j = 31;
    private static final byte k = -32;
    private static final int l = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    byte[] f2540a;
    byte[] b;
    byte[] c;
    private bo m;
    private short n;
    private ck o;
    private Boolean p;
    private final long q;
    private byte[] r;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final byte f2542a = 1;
        public static final byte b = 2;
        public static final byte c = 3;
        public static final byte d = 4;
        public static final byte e = 5;
        public static final byte f = 6;
        public static final byte g = 7;
        public static final byte h = 8;
        public static final byte i = 9;
        public static final byte j = 10;
        public static final byte k = 11;
        public static final byte l = 12;

        private b() {
        }
    }

    public cj(dd ddVar, long j2) {
        super(ddVar);
        this.m = new bo(15);
        this.n = (short) 0;
        this.o = null;
        this.p = null;
        this.f2540a = new byte[5];
        this.b = new byte[10];
        this.r = new byte[1];
        this.c = new byte[1];
        this.q = j2;
    }

    private int E() throws bw {
        int i2 = 0;
        if (this.g.h() >= 5) {
            byte[] bArrF = this.g.f();
            int iG = this.g.g();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                byte b2 = bArrF[iG + i2];
                i3 |= (b2 & 127) << i4;
                if ((b2 & 128) != 128) {
                    this.g.a(i2 + 1);
                    return i3;
                }
                i4 += 7;
                i2++;
            }
        } else {
            int i5 = 0;
            while (true) {
                byte bU = u();
                i2 |= (bU & 127) << i5;
                if ((bU & 128) != 128) {
                    return i2;
                }
                i5 += 7;
            }
        }
    }

    private long F() throws bw {
        int i2 = 0;
        long j2 = 0;
        if (this.g.h() >= 10) {
            byte[] bArrF = this.g.f();
            int iG = this.g.g();
            long j3 = 0;
            int i3 = 0;
            while (true) {
                byte b2 = bArrF[iG + i2];
                j3 |= ((long) (b2 & 127)) << i3;
                if ((b2 & 128) != 128) {
                    this.g.a(i2 + 1);
                    return j3;
                }
                i3 += 7;
                i2++;
            }
        } else {
            while (true) {
                byte bU = u();
                j2 |= ((long) (bU & 127)) << i2;
                if ((bU & 128) != 128) {
                    return j2;
                }
                i2 += 7;
            }
        }
    }

    private int c(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    private long d(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    private int g(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    @Override // com.umeng.analytics.pro.cp
    public ByteBuffer A() throws bw {
        int iE = E();
        f(iE);
        if (iE == 0) {
            return ByteBuffer.wrap(new byte[0]);
        }
        byte[] bArr = new byte[iE];
        this.g.d(bArr, 0, iE);
        return ByteBuffer.wrap(bArr);
    }

    @Override // com.umeng.analytics.pro.cp
    public void B() {
        this.m.c();
        this.n = (short) 0;
    }

    @Override // com.umeng.analytics.pro.cp
    public void a() throws bw {
    }

    @Override // com.umeng.analytics.pro.cp
    public void b() throws bw {
        this.n = this.m.a();
    }

    @Override // com.umeng.analytics.pro.cp
    public void e() throws bw {
    }

    @Override // com.umeng.analytics.pro.cp
    public void f() throws bw {
    }

    @Override // com.umeng.analytics.pro.cp
    public cn h() throws bw {
        byte bU = u();
        if (bU != -126) {
            throw new cq("Expected protocol id " + Integer.toHexString(-126) + " but got " + Integer.toHexString(bU));
        }
        byte bU2 = u();
        byte b2 = (byte) (bU2 & j);
        if (b2 != 1) {
            throw new cq(AbstractC3950lJ.p("Expected version 1 but got ", b2));
        }
        return new cn(z(), (byte) ((bU2 >> 5) & 3), E());
    }

    @Override // com.umeng.analytics.pro.cp
    public void i() throws bw {
    }

    @Override // com.umeng.analytics.pro.cp
    public cu j() throws bw {
        this.m.a(this.n);
        this.n = (short) 0;
        return d;
    }

    @Override // com.umeng.analytics.pro.cp
    public void k() throws bw {
        this.n = this.m.a();
    }

    @Override // com.umeng.analytics.pro.cp
    public ck l() throws bw {
        byte bU = u();
        if (bU == 0) {
            return e;
        }
        short s = (short) ((bU & 240) >> 4);
        short sV = s == 0 ? v() : (short) (this.n + s);
        byte b2 = (byte) (bU & cw.m);
        ck ckVar = new ck("", d(b2), sV);
        if (c(bU)) {
            this.p = b2 == 1 ? Boolean.TRUE : Boolean.FALSE;
        }
        this.n = ckVar.c;
        return ckVar;
    }

    @Override // com.umeng.analytics.pro.cp
    public void m() throws bw {
    }

    @Override // com.umeng.analytics.pro.cp
    public cm n() throws bw {
        int iE = E();
        byte bU = iE == 0 ? (byte) 0 : u();
        return new cm(d((byte) (bU >> 4)), d((byte) (bU & cw.m)), iE);
    }

    @Override // com.umeng.analytics.pro.cp
    public void o() throws bw {
    }

    @Override // com.umeng.analytics.pro.cp
    public cl p() throws bw {
        byte bU = u();
        int iE = (bU >> 4) & 15;
        if (iE == 15) {
            iE = E();
        }
        return new cl(d(bU), iE);
    }

    @Override // com.umeng.analytics.pro.cp
    public void q() throws bw {
    }

    @Override // com.umeng.analytics.pro.cp
    public ct r() throws bw {
        return new ct(p());
    }

    @Override // com.umeng.analytics.pro.cp
    public void s() throws bw {
    }

    @Override // com.umeng.analytics.pro.cp
    public boolean t() throws bw {
        Boolean bool = this.p;
        if (bool == null) {
            return u() == 1;
        }
        boolean zBooleanValue = bool.booleanValue();
        this.p = null;
        return zBooleanValue;
    }

    @Override // com.umeng.analytics.pro.cp
    public byte u() throws bw {
        if (this.g.h() <= 0) {
            this.g.d(this.c, 0, 1);
            return this.c[0];
        }
        byte b2 = this.g.f()[this.g.g()];
        this.g.a(1);
        return b2;
    }

    @Override // com.umeng.analytics.pro.cp
    public short v() throws bw {
        return (short) g(E());
    }

    @Override // com.umeng.analytics.pro.cp
    public int w() throws bw {
        return g(E());
    }

    @Override // com.umeng.analytics.pro.cp
    public long x() throws bw {
        return d(F());
    }

    @Override // com.umeng.analytics.pro.cp
    public double y() throws bw {
        byte[] bArr = new byte[8];
        this.g.d(bArr, 0, 8);
        return Double.longBitsToDouble(a(bArr));
    }

    @Override // com.umeng.analytics.pro.cp
    public String z() throws bw {
        int iE = E();
        f(iE);
        if (iE == 0) {
            return "";
        }
        try {
            if (this.g.h() < iE) {
                return new String(e(iE), C.UTF8_NAME);
            }
            String str = new String(this.g.f(), this.g.g(), iE, C.UTF8_NAME);
            this.g.a(iE);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new bw("UTF-8 not supported!");
        }
    }

    public static class a implements cr {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f2541a;

        public a() {
            this.f2541a = -1L;
        }

        @Override // com.umeng.analytics.pro.cr
        public cp a(dd ddVar) {
            return new cj(ddVar, this.f2541a);
        }

        public a(int i) {
            this.f2541a = i;
        }
    }

    private void b(int i2) throws bw {
        int i3 = 0;
        while ((i2 & (-128)) != 0) {
            this.f2540a[i3] = (byte) ((i2 & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128);
            i2 >>>= 7;
            i3++;
        }
        byte[] bArr = this.f2540a;
        bArr[i3] = (byte) i2;
        this.g.b(bArr, 0, i3 + 1);
    }

    private long c(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    private byte[] e(int i2) throws bw {
        if (i2 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i2];
        this.g.d(bArr, 0, i2);
        return bArr;
    }

    private void f(int i2) throws cq {
        if (i2 < 0) {
            throw new cq(AbstractC3950lJ.p("Negative length: ", i2));
        }
        long j2 = this.q;
        if (j2 != -1 && i2 > j2) {
            throw new cq(AbstractC3950lJ.p("Length exceeded max allowed: ", i2));
        }
    }

    @Override // com.umeng.analytics.pro.cp
    public void a(cn cnVar) throws bw {
        b(h);
        d(((cnVar.b << 5) & (-32)) | 1);
        b(cnVar.c);
        a(cnVar.f2546a);
    }

    @Override // com.umeng.analytics.pro.cp
    public void d() throws bw {
        b((byte) 0);
    }

    @Override // com.umeng.analytics.pro.cp
    public void g() throws bw {
    }

    private void d(int i2) throws bw {
        b((byte) i2);
    }

    @Override // com.umeng.analytics.pro.cp
    public void c() throws bw {
    }

    private boolean c(byte b2) {
        int i2 = b2 & cw.m;
        return i2 == 1 || i2 == 2;
    }

    private byte d(byte b2) throws cq {
        byte b3 = (byte) (b2 & cw.m);
        switch (b3) {
            case 0:
                return (byte) 0;
            case 1:
            case 2:
                return (byte) 2;
            case 3:
                return (byte) 3;
            case 4:
                return (byte) 6;
            case 5:
                return (byte) 8;
            case 6:
                return (byte) 10;
            case 7:
                return (byte) 4;
            case 8:
                return (byte) 11;
            case 9:
                return cw.m;
            case 10:
                return cw.l;
            case 11:
                return cw.k;
            case 12:
                return (byte) 12;
            default:
                throw new cq(AbstractC3950lJ.p("don't know what type: ", b3));
        }
    }

    private void b(long j2) throws bw {
        int i2 = 0;
        while (((-128) & j2) != 0) {
            this.b[i2] = (byte) ((127 & j2) | 128);
            j2 >>>= 7;
            i2++;
        }
        byte[] bArr = this.b;
        bArr[i2] = (byte) j2;
        this.g.b(bArr, 0, i2 + 1);
    }

    private byte e(byte b2) {
        return f[b2];
    }

    @Override // com.umeng.analytics.pro.cp
    public void a(cu cuVar) throws bw {
        this.m.a(this.n);
        this.n = (short) 0;
    }

    private void b(byte b2) throws bw {
        byte[] bArr = this.r;
        bArr[0] = b2;
        this.g.b(bArr);
    }

    @Override // com.umeng.analytics.pro.cp
    public void a(ck ckVar) throws bw {
        if (ckVar.b == 2) {
            this.o = ckVar;
        } else {
            a(ckVar, (byte) -1);
        }
    }

    public cj(dd ddVar) {
        this(ddVar, -1L);
    }

    private void a(ck ckVar, byte b2) throws bw {
        if (b2 == -1) {
            b2 = e(ckVar.b);
        }
        short s = ckVar.c;
        short s2 = this.n;
        if (s > s2 && s - s2 <= 15) {
            d(b2 | ((s - s2) << 4));
        } else {
            b(b2);
            a(ckVar.c);
        }
        this.n = ckVar.c;
    }

    @Override // com.umeng.analytics.pro.cp
    public void a(cm cmVar) throws bw {
        int i2 = cmVar.c;
        if (i2 == 0) {
            d(0);
            return;
        }
        b(i2);
        d(e(cmVar.b) | (e(cmVar.f2545a) << 4));
    }

    @Override // com.umeng.analytics.pro.cp
    public void a(cl clVar) throws bw {
        a(clVar.f2544a, clVar.b);
    }

    @Override // com.umeng.analytics.pro.cp
    public void a(ct ctVar) throws bw {
        a(ctVar.f2550a, ctVar.b);
    }

    @Override // com.umeng.analytics.pro.cp
    public void a(boolean z) throws bw {
        ck ckVar = this.o;
        if (ckVar != null) {
            a(ckVar, z ? (byte) 1 : (byte) 2);
            this.o = null;
        } else {
            b(z ? (byte) 1 : (byte) 2);
        }
    }

    @Override // com.umeng.analytics.pro.cp
    public void a(byte b2) throws bw {
        b(b2);
    }

    @Override // com.umeng.analytics.pro.cp
    public void a(short s) throws bw {
        b(c((int) s));
    }

    @Override // com.umeng.analytics.pro.cp
    public void a(int i2) throws bw {
        b(c(i2));
    }

    @Override // com.umeng.analytics.pro.cp
    public void a(long j2) throws bw {
        b(c(j2));
    }

    @Override // com.umeng.analytics.pro.cp
    public void a(double d2) throws bw {
        byte[] bArr = {0, 0, 0, 0, 0, 0, 0, 0};
        a(Double.doubleToLongBits(d2), bArr, 0);
        this.g.b(bArr);
    }

    @Override // com.umeng.analytics.pro.cp
    public void a(String str) throws bw {
        try {
            byte[] bytes = str.getBytes(C.UTF8_NAME);
            a(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new bw("UTF-8 not supported!");
        }
    }

    @Override // com.umeng.analytics.pro.cp
    public void a(ByteBuffer byteBuffer) throws bw {
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        a(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), iLimit);
    }

    private void a(byte[] bArr, int i2, int i3) throws bw {
        b(i3);
        this.g.b(bArr, i2, i3);
    }

    public void a(byte b2, int i2) throws bw {
        if (i2 <= 14) {
            d(e(b2) | (i2 << 4));
        } else {
            d(e(b2) | 240);
            b(i2);
        }
    }

    private void a(long j2, byte[] bArr, int i2) {
        bArr[i2] = (byte) (j2 & 255);
        bArr[i2 + 1] = (byte) ((j2 >> 8) & 255);
        bArr[i2 + 2] = (byte) ((j2 >> 16) & 255);
        bArr[i2 + 3] = (byte) ((j2 >> 24) & 255);
        bArr[i2 + 4] = (byte) ((j2 >> 32) & 255);
        bArr[i2 + 5] = (byte) ((j2 >> 40) & 255);
        bArr[i2 + 6] = (byte) ((j2 >> 48) & 255);
        bArr[i2 + 7] = (byte) ((j2 >> 56) & 255);
    }

    private long a(byte[] bArr) {
        return ((((long) bArr[7]) & 255) << 56) | ((((long) bArr[6]) & 255) << 48) | ((((long) bArr[5]) & 255) << 40) | ((((long) bArr[4]) & 255) << 32) | ((((long) bArr[3]) & 255) << 24) | ((((long) bArr[2]) & 255) << 16) | ((((long) bArr[1]) & 255) << 8) | (255 & ((long) bArr[0]));
    }
}
