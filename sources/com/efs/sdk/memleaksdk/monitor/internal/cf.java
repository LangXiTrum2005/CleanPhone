package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f633a = new a(0);
    private static final int e = br.BOOLEAN.i;
    private static final int f = br.CHAR.i;
    private static final int g = br.FLOAT.i;
    private static final int h = br.DOUBLE.i;
    private static final int i = br.BYTE.i;
    private static final int j = br.SHORT.i;
    private static final int k = br.INT.i;
    private static final int l = br.LONG.i;
    private int b;
    private final int c;
    private final byte[] d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public cf(int i2, byte[] bArr) {
        AbstractC2995aW.q(bArr, "classFieldBytes");
        this.c = i2;
        this.d = bArr;
    }

    private final cb a(int i2) {
        if (i2 == 2) {
            return new cb.i(g());
        }
        if (i2 == e) {
            return new cb.a(h());
        }
        if (i2 == f) {
            return new cb.c((char) e());
        }
        if (i2 == g) {
            return new cb.f(i());
        }
        if (i2 == h) {
            return new cb.e(j());
        }
        if (i2 == i) {
            return new cb.b(b());
        }
        if (i2 == j) {
            return new cb.j(e());
        }
        if (i2 == k) {
            return new cb.g(c());
        }
        if (i2 == l) {
            return new cb.h(d());
        }
        throw new IllegalStateException(AbstractC3950lJ.p("Unknown type ", i2));
    }

    private final byte b() {
        byte[] bArr = this.d;
        int i2 = this.b;
        this.b = i2 + 1;
        return bArr[i2];
    }

    private final int c() {
        byte[] bArr = this.d;
        int i2 = this.b;
        int i3 = ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2] & 255) << 24);
        int i4 = i2 + 3;
        int i5 = i3 | ((bArr[i2 + 2] & 255) << 8);
        this.b = i2 + 4;
        return (bArr[i4] & 255) | i5;
    }

    private final long d() {
        byte[] bArr = this.d;
        int i2 = this.b;
        int i3 = i2 + 7;
        long j2 = ((((long) bArr[i2]) & 255) << 56) | ((((long) bArr[i2 + 1]) & 255) << 48) | ((((long) bArr[i2 + 2]) & 255) << 40) | ((((long) bArr[i2 + 3]) & 255) << 32) | ((((long) bArr[i2 + 4]) & 255) << 24) | ((((long) bArr[i2 + 5]) & 255) << 16) | ((((long) bArr[i2 + 6]) & 255) << 8);
        this.b = i2 + 8;
        return (((long) bArr[i3]) & 255) | j2;
    }

    private final short e() {
        byte[] bArr = this.d;
        int i2 = this.b;
        int i3 = i2 + 1;
        int i4 = (bArr[i2] & 255) << 8;
        this.b = i2 + 2;
        return (short) ((bArr[i3] & 255) | i4);
    }

    private final int f() {
        return b() & 255;
    }

    private final long g() {
        int iB;
        int i2 = this.c;
        if (i2 == 1) {
            iB = b();
        } else if (i2 == 2) {
            iB = e();
        } else {
            if (i2 != 4) {
                if (i2 == 8) {
                    return d();
                }
                throw new IllegalArgumentException("ID Length must be 1, 2, 4, or 8");
            }
            iB = c();
        }
        return iB;
    }

    private final boolean h() {
        return b() != 0;
    }

    private final float i() {
        return Float.intBitsToFloat(c());
    }

    private final double j() {
        return Double.longBitsToDouble(d());
    }

    public final List<ba.a.AbstractC0127a.C0128a.C0129a> b(cm.a aVar) {
        AbstractC2995aW.q(aVar, "indexedClass");
        this.b = aVar.c;
        a();
        int iE = e() & 65535;
        ArrayList arrayList = new ArrayList(iE);
        for (int i2 = 0; i2 < iE; i2++) {
            arrayList.add(new ba.a.AbstractC0127a.C0128a.C0129a(g(), f()));
        }
        return arrayList;
    }

    public final boolean c(cm.a aVar) {
        AbstractC2995aW.q(aVar, "indexedClass");
        this.b = aVar.c;
        a();
        int iE = e() & 65535;
        for (int i2 = 0; i2 < iE; i2++) {
            this.b += this.c;
            if (f() == 2) {
                return true;
            }
        }
        return false;
    }

    public final List<ba.a.AbstractC0127a.C0128a.b> a(cm.a aVar) {
        AbstractC2995aW.q(aVar, "indexedClass");
        this.b = aVar.c;
        int iE = e() & 65535;
        ArrayList arrayList = new ArrayList(iE);
        for (int i2 = 0; i2 < iE; i2++) {
            long jG = g();
            int iF = f();
            arrayList.add(new ba.a.AbstractC0127a.C0128a.b(jG, iF, a(iF)));
        }
        return arrayList;
    }

    private final void a() {
        int iIntValue;
        int iE = e() & 65535;
        for (int i2 = 0; i2 < iE; i2++) {
            this.b += this.c;
            int iF = f();
            int i3 = this.b;
            if (iF == 2) {
                iIntValue = this.c;
            } else {
                iIntValue = ((Number) U5.q0(br.m, Integer.valueOf(iF))).intValue();
            }
            this.b = i3 + iIntValue;
        }
    }
}
