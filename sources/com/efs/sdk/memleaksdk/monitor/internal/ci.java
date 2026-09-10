package com.efs.sdk.memleaksdk.monitor.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2307Be;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes2.dex */
public final class ci {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f637a = new a(0);
    private static final int e = br.BOOLEAN.i;
    private static final int f = br.CHAR.i;
    private static final int g = br.FLOAT.i;
    private static final int h = br.DOUBLE.i;
    private static final int i = br.BYTE.i;
    private static final int j = br.SHORT.i;
    private static final int k = br.INT.i;
    private static final int l = br.LONG.i;
    private int b;
    private final ba.a.AbstractC0127a.b c;
    private final int d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public ci(ba.a.AbstractC0127a.b bVar, int i2) {
        AbstractC2995aW.q(bVar, "record");
        this.c = bVar;
        this.d = i2;
    }

    private final long a() {
        int iC;
        int i2 = this.d;
        if (i2 == 1) {
            iC = c();
        } else if (i2 == 2) {
            iC = e();
        } else {
            if (i2 != 4) {
                if (i2 == 8) {
                    return f();
                }
                throw new IllegalArgumentException("ID Length must be 1, 2, 4, or 8");
            }
            iC = d();
        }
        return iC;
    }

    private final boolean b() {
        byte[] bArr = this.c.f588a;
        int i2 = this.b;
        byte b = bArr[i2];
        this.b = i2 + 1;
        return b != ((byte) 0);
    }

    private final byte c() {
        byte[] bArr = this.c.f588a;
        int i2 = this.b;
        byte b = bArr[i2];
        this.b = i2 + 1;
        return b;
    }

    private final int d() {
        int iB = ce.b(this.c.f588a, this.b);
        this.b += 4;
        return iB;
    }

    private final short e() {
        short sA = ce.a(this.c.f588a, this.b);
        this.b += 2;
        return sA;
    }

    private final long f() {
        long jC = ce.c(this.c.f588a, this.b);
        this.b += 8;
        return jC;
    }

    private final float g() {
        return Float.intBitsToFloat(d());
    }

    private final double h() {
        return Double.longBitsToDouble(f());
    }

    private final char i() {
        String str = new String(this.c.f588a, this.b, 2, AbstractC2307Be.b);
        this.b += 2;
        return str.charAt(0);
    }

    public final cb a(ba.a.AbstractC0127a.C0128a.C0129a c0129a) {
        AbstractC2995aW.q(c0129a, "field");
        int i2 = c0129a.b;
        if (i2 == 2) {
            return new cb.i(a());
        }
        if (i2 == e) {
            return new cb.a(b());
        }
        if (i2 == f) {
            return new cb.c(i());
        }
        if (i2 == g) {
            return new cb.f(g());
        }
        if (i2 == h) {
            return new cb.e(h());
        }
        if (i2 == i) {
            return new cb.b(c());
        }
        if (i2 == j) {
            return new cb.j(e());
        }
        if (i2 == k) {
            return new cb.g(d());
        }
        if (i2 == l) {
            return new cb.h(f());
        }
        throw new IllegalStateException("Unknown type " + c0129a.b);
    }
}
