package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2446Gn {
    public static final C2373Ds g = new C2373Ds(1);
    public static final Random h = new Random();
    public FU d;
    public String f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fc0 f3139a = new Fc0();
    public final Ec0 b = new Ec0();
    public final HashMap c = new HashMap();
    public Gc0 e = Gc0.f3128a;

    public final synchronized void a(C3403f4 c3403f4) {
        FU fu;
        this.f = null;
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            C2420Fn c2420Fn = (C2420Fn) it.next();
            it.remove();
            if (c2420Fn.e && (fu = this.d) != null) {
                ((C4219oO) fu).m(c3403f4, c2420Fn.f3087a);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0067  */
    /* JADX WARN: Code duplicated, block: B:46:0x0078 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final C2420Fn b(int i, C5186zO c5186zO) {
        long j;
        HashMap map = this.c;
        C2420Fn c2420Fn = null;
        long j2 = Long.MAX_VALUE;
        for (C2420Fn c2420Fn2 : map.values()) {
            if (c2420Fn2.c == -1 && i == c2420Fn2.b && c5186zO != null) {
                c2420Fn2.c = c5186zO.d;
            }
            C5186zO c5186zO2 = c2420Fn2.d;
            if (c5186zO != null) {
                long j3 = c5186zO.d;
                if (c5186zO2 == null) {
                    if (!c5186zO.a() && j3 == c2420Fn2.c) {
                        j = c2420Fn2.c;
                        if (j != -1) {
                        }
                        c2420Fn = c2420Fn2;
                        j2 = j;
                    }
                } else if (j3 == c5186zO2.d && c5186zO.b == c5186zO2.b && c5186zO.c == c5186zO2.c) {
                    j = c2420Fn2.c;
                    if (j != -1) {
                    }
                    c2420Fn = c2420Fn2;
                    j2 = j;
                }
            } else if (i == c2420Fn2.b) {
                j = c2420Fn2.c;
                if (j != -1 || j < j2) {
                    c2420Fn = c2420Fn2;
                    j2 = j;
                } else if (j == j2) {
                    int i2 = Ug0.f3833a;
                    if (c2420Fn.d != null && c5186zO2 != null) {
                        c2420Fn = c2420Fn2;
                    }
                }
            }
        }
        if (c2420Fn != null) {
            return c2420Fn;
        }
        String str = (String) g.get();
        C2420Fn c2420Fn3 = new C2420Fn(this, str, i, c5186zO);
        map.put(str, c2420Fn3);
        return c2420Fn3;
    }

    public final synchronized String c(Gc0 gc0, C5186zO c5186zO) {
        return b(gc0.h(c5186zO.f4977a, this.b).c, c5186zO).f3087a;
    }

    public final void d(C3403f4 c3403f4) {
        C5186zO c5186zO;
        if (c3403f4.b.q()) {
            this.f = null;
            return;
        }
        C2420Fn c2420Fn = (C2420Fn) this.c.get(this.f);
        int i = c3403f4.c;
        C5186zO c5186zO2 = c3403f4.d;
        this.f = b(i, c5186zO2).f3087a;
        e(c3403f4);
        if (c5186zO2 == null || !c5186zO2.a()) {
            return;
        }
        long j = c5186zO2.d;
        if (c2420Fn != null && c2420Fn.c == j && (c5186zO = c2420Fn.d) != null && c5186zO.b == c5186zO2.b && c5186zO.c == c5186zO2.c) {
            return;
        }
        b(i, new C5186zO(c5186zO2.f4977a, j));
        this.d.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r1.d < r2) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void e(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3403f4 r8) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2446Gn.e(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.f4):void");
    }

    public final synchronized void f(C3403f4 c3403f4, int i) {
        try {
            this.d.getClass();
            boolean z = i == 0;
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                C2420Fn c2420Fn = (C2420Fn) it.next();
                if (c2420Fn.a(c3403f4)) {
                    it.remove();
                    if (c2420Fn.e) {
                        boolean zEquals = c2420Fn.f3087a.equals(this.f);
                        if (z && zEquals) {
                            boolean z2 = c2420Fn.f;
                        }
                        if (zEquals) {
                            this.f = null;
                        }
                        ((C4219oO) this.d).m(c3403f4, c2420Fn.f3087a);
                    }
                }
            }
            d(c3403f4);
        } catch (Throwable th) {
            throw th;
        }
    }
}
