package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2307Be;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2853Wf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U5;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class bb {
    public static final a c = new a(0);
    private static final int f;
    private static final int g;
    private static final int h;
    private static final int i;
    private static final int j;
    private static final int k;
    private static final int l;
    private static final int m;
    private static final int n;
    private static final int o;
    private static final int p;
    private static final int q;
    private static final int r;
    private static final int s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f598a;
    final int[] b;
    private final int d;
    private final n e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        br brVar = br.BOOLEAN;
        f = brVar.j;
        br brVar2 = br.CHAR;
        g = brVar2.j;
        br brVar3 = br.BYTE;
        h = brVar3.j;
        br brVar4 = br.SHORT;
        i = brVar4.j;
        br brVar5 = br.INT;
        j = brVar5.j;
        br brVar6 = br.LONG;
        k = brVar6.j;
        l = brVar.i;
        m = brVar2.i;
        n = br.FLOAT.i;
        o = br.DOUBLE.i;
        p = brVar3.i;
        q = brVar4.i;
        r = brVar5.i;
        s = brVar6.i;
    }

    public bb(ax axVar, n nVar) {
        AbstractC2995aW.q(axVar, "header");
        AbstractC2995aW.q(nVar, "source");
        this.e = nVar;
        int i2 = axVar.c;
        this.d = i2;
        Map mapW0 = U5.w0(br.m, new C4839vT(2, Integer.valueOf(i2)));
        Object objO0 = AbstractC2853Wf.o0(mapW0.keySet());
        AbstractC2995aW.n(objO0);
        int iIntValue = ((Number) objO0).intValue() + 1;
        int[] iArr = new int[iIntValue];
        for (int i3 = 0; i3 < iIntValue; i3++) {
            Integer num = (Integer) mapW0.get(Integer.valueOf(i3));
            iArr[i3] = num != null ? num.intValue() : 0;
        }
        this.b = iArr;
    }

    public final void A() throws IOException {
        a(this.d + j);
        int iG = G();
        int i2 = this.d;
        a((iG * i2) + i2);
    }

    public final void B() throws IOException {
        a(this.d + j);
        a(G() * this.b[E()]);
    }

    public final void C() throws IOException {
        int i2 = this.d;
        a(i2 + i2);
    }

    public final long D() {
        return ((long) G()) & 4294967295L;
    }

    public final int E() {
        return I() & 255;
    }

    public final short F() {
        this.f598a += (long) i;
        return this.e.d();
    }

    public final int G() {
        this.f598a += (long) j;
        return this.e.e();
    }

    public final long H() {
        this.f598a += (long) k;
        return this.e.f();
    }

    public final byte I() {
        this.f598a += (long) h;
        return this.e.c();
    }

    public final boolean J() {
        this.f598a += (long) f;
        return this.e.c() != 0;
    }

    public final char K() {
        return a(g, AbstractC2307Be.b).charAt(0);
    }

    public final float L() {
        return Float.intBitsToFloat(G());
    }

    public final double M() {
        return Double.longBitsToDouble(H());
    }

    public final long N() {
        int I;
        int i2 = this.d;
        if (i2 == 1) {
            I = I();
        } else if (i2 == 2) {
            I = F();
        } else {
            if (i2 != 4) {
                if (i2 == 8) {
                    return H();
                }
                throw new IllegalArgumentException("ID Length must be 1, 2, 4, or 8");
            }
            I = G();
        }
        return I;
    }

    public final int O() {
        return F() & 65535;
    }

    public final ap.n a() {
        return new ap.n(N());
    }

    public final ap.e b() {
        return new ap.e(N(), N());
    }

    public final ap.f c() {
        return new ap.f(N(), G(), G());
    }

    public final ap.d d() {
        return new ap.d(N(), G(), G());
    }

    public final ap.i e() {
        return new ap.i(N(), G());
    }

    public final ap.k f() {
        return new ap.k(N());
    }

    public final ap.l g() {
        return new ap.l(N(), G());
    }

    public final ap.h h() {
        return new ap.h(N());
    }

    public final ap.m i() {
        return new ap.m(N(), G(), G());
    }

    public final ap.c j() {
        return new ap.c(N());
    }

    public final ap.b k() {
        return new ap.b(N());
    }

    public final ap.a l() {
        return new ap.a(N());
    }

    public final ap.j m() {
        return new ap.j(N());
    }

    public final ap.p n() {
        return new ap.p(N());
    }

    public final ap.g o() {
        return new ap.g(N(), G(), G());
    }

    public final ap.o p() {
        return new ap.o(N());
    }

    public final ba.a.AbstractC0127a.b q() {
        return new ba.a.AbstractC0127a.b(N(), G(), N(), k(G()));
    }

    public final ba.a.AbstractC0127a.C0128a r() throws IOException {
        bb bbVar = this;
        long jN = N();
        int iG = G();
        long jN2 = N();
        long jN3 = N();
        long jN4 = N();
        long jN5 = N();
        N();
        N();
        int iG2 = G();
        int iO = O();
        for (int i2 = 0; i2 < iO; i2++) {
            bbVar.a(i);
            bbVar.a(bbVar.b[E()]);
        }
        int iO2 = O();
        ArrayList arrayList = new ArrayList(iO2);
        int i3 = 0;
        while (i3 < iO2) {
            long j2 = jN5;
            long jN6 = N();
            int i4 = iO2;
            int iE = E();
            arrayList.add(new ba.a.AbstractC0127a.C0128a.b(jN6, iE, bbVar.b(iE)));
            i3++;
            bbVar = this;
            jN5 = j2;
            iO2 = i4;
            iG2 = iG2;
        }
        long j3 = jN5;
        int i5 = iG2;
        int iO3 = O();
        ArrayList arrayList2 = new ArrayList(iO3);
        int i6 = 0;
        while (i6 < iO3) {
            arrayList2.add(new ba.a.AbstractC0127a.C0128a.C0129a(N(), E()));
            i6++;
            iO3 = iO3;
        }
        return new ba.a.AbstractC0127a.C0128a(jN, iG, jN2, jN3, jN4, j3, i5, arrayList, arrayList2);
    }

    public final ba.a.AbstractC0127a.d s() {
        long jN = N();
        int iG = G();
        int iG2 = G();
        int iE = E();
        if (iE == l) {
            return new ba.a.AbstractC0127a.d.C0130a(jN, iG, d(iG2));
        }
        if (iE == m) {
            return new ba.a.AbstractC0127a.d.c(jN, iG, e(iG2));
        }
        if (iE == n) {
            return new ba.a.AbstractC0127a.d.e(jN, iG, f(iG2));
        }
        if (iE == o) {
            return new ba.a.AbstractC0127a.d.C0131d(jN, iG, g(iG2));
        }
        if (iE == p) {
            return new ba.a.AbstractC0127a.d.b(jN, iG, k(iG2));
        }
        if (iE == q) {
            return new ba.a.AbstractC0127a.d.h(jN, iG, h(iG2));
        }
        if (iE == r) {
            return new ba.a.AbstractC0127a.d.f(jN, iG, i(iG2));
        }
        if (iE == s) {
            return new ba.a.AbstractC0127a.d.g(jN, iG, j(iG2));
        }
        throw new IllegalStateException(AbstractC3950lJ.p("Unexpected type ", iE));
    }

    public final ba.a.AbstractC0127a.c t() {
        return new ba.a.AbstractC0127a.c(N(), G(), N(), c(G()));
    }

    public final void u() throws IOException {
        a((this.d * 7) + (j * 2));
        v();
    }

    public final void v() throws IOException {
        int iO = O();
        for (int i2 = 0; i2 < iO; i2++) {
            a(br.SHORT.j);
            a(this.b[E()]);
        }
    }

    public final void w() throws IOException {
        int iO = O();
        for (int i2 = 0; i2 < iO; i2++) {
            a(this.d);
            int iE = E();
            a(iE == 2 ? this.d : ((Number) U5.q0(br.m, Integer.valueOf(iE))).intValue());
        }
    }

    public final void x() throws IOException {
        a((this.d + 1) * O());
    }

    public final void y() throws IOException {
        int i2 = this.d;
        a(j + i2 + i2);
        a(G());
    }

    public final void z() throws IOException {
        int i2 = this.d;
        int i3 = j;
        a(i2 + i3 + i2 + i2 + i2 + i2 + i2 + i2 + i3);
        int iO = O();
        for (int i4 = 0; i4 < iO; i4++) {
            a(i);
            a(this.b[E()]);
        }
        int iO2 = O();
        for (int i5 = 0; i5 < iO2; i5++) {
            a(this.d);
            a(this.b[E()]);
        }
        a((this.d + h) * O());
    }

    public final void a(int i2) throws IOException {
        long j2 = i2;
        this.f598a += j2;
        this.e.c(j2);
    }

    public final float[] f(int i2) {
        float[] fArr = new float[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            fArr[i3] = L();
        }
        return fArr;
    }

    public final double[] g(int i2) {
        double[] dArr = new double[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            dArr[i3] = M();
        }
        return dArr;
    }

    public final short[] h(int i2) {
        short[] sArr = new short[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            sArr[i3] = F();
        }
        return sArr;
    }

    public final long[] j(int i2) {
        long[] jArr = new long[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            jArr[i3] = H();
        }
        return jArr;
    }

    public final byte[] k(int i2) throws IOException {
        long j2 = i2;
        this.f598a += j2;
        byte[] bArrB = this.e.b(j2);
        AbstractC2995aW.p(bArrB, "source.readByteArray(byteCount.toLong())");
        return bArrB;
    }

    public final void a(long j2) throws IOException {
        this.f598a += j2;
        this.e.c(j2);
    }

    public final cb b(int i2) {
        if (i2 == 2) {
            return new cb.i(N());
        }
        if (i2 == l) {
            return new cb.a(J());
        }
        if (i2 == m) {
            return new cb.c(K());
        }
        if (i2 == n) {
            return new cb.f(L());
        }
        if (i2 == o) {
            return new cb.e(M());
        }
        if (i2 == p) {
            return new cb.b(I());
        }
        if (i2 == q) {
            return new cb.j(F());
        }
        if (i2 == r) {
            return new cb.g(G());
        }
        if (i2 == s) {
            return new cb.h(H());
        }
        throw new IllegalStateException(AbstractC3950lJ.p("Unknown type ", i2));
    }

    public final char[] e(int i2) {
        char[] cArr = new char[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            cArr[i3] = K();
        }
        return cArr;
    }

    public final String a(int i2, Charset charset) throws IOException {
        AbstractC2995aW.q(charset, "charset");
        long j2 = i2;
        this.f598a += j2;
        String strA = this.e.a(j2, charset);
        AbstractC2995aW.p(strA, "source.readString(byteCount.toLong(), charset)");
        return strA;
    }

    public final long[] c(int i2) {
        long[] jArr = new long[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            jArr[i3] = N();
        }
        return jArr;
    }

    public final boolean[] d(int i2) {
        boolean[] zArr = new boolean[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            zArr[i3] = I() != 0;
        }
        return zArr;
    }

    public final int[] i(int i2) {
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = G();
        }
        return iArr;
    }

    public final String b(long j2) throws IOException {
        this.f598a += j2;
        String strA = this.e.a(j2);
        AbstractC2995aW.p(strA, "source.readUtf8(byteCount)");
        return strA;
    }
}
