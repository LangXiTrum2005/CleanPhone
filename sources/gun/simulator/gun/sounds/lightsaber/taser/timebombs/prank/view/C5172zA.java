package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5172zA extends AbstractC3882kb0 {
    public final /* synthetic */ AA e;
    public final /* synthetic */ boolean f = false;
    public final /* synthetic */ R50 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5172zA(String str, AA aa, R50 r50) {
        super(str, true);
        this.e = aa;
        this.g = r50;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3882kb0
    public final long a() {
        long jA;
        int i;
        MA[] maArr;
        AA aa = this.e;
        boolean z = this.f;
        R50 r50 = this.g;
        aa.getClass();
        AbstractC2995aW.q(r50, "settings");
        C3086bY c3086bY = new C3086bY();
        GA ga = aa.b;
        synchronized (ga.y) {
            synchronized (ga) {
                try {
                    R50 r51 = ga.s;
                    if (!z) {
                        R50 r52 = new R50();
                        r52.b(r51);
                        r52.b(r50);
                        r50 = r52;
                    }
                    c3086bY.f4172a = r50;
                    jA = ((long) r50.a()) - ((long) r51.a());
                    i = 0;
                    if (jA == 0 || ga.c.isEmpty()) {
                        maArr = null;
                    } else {
                        Object[] array = ga.c.values().toArray(new MA[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        maArr = (MA[]) array;
                    }
                    R50 r53 = (R50) c3086bY.f4172a;
                    AbstractC2995aW.q(r53, "<set-?>");
                    ga.s = r53;
                    ga.k.c(new C4996xA(AbstractC2995aW.v0(" onSettings", ga.d), ga, c3086bY, 0), 0L);
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                ga.y.a((R50) c3086bY.f4172a);
            } catch (IOException e) {
                ga.b(e);
            }
        }
        if (maArr == null) {
            return -1L;
        }
        int length = maArr.length;
        while (i < length) {
            MA ma = maArr[i];
            i++;
            synchronized (ma) {
                ma.f += jA;
                if (jA > 0) {
                    ma.notifyAll();
                }
            }
        }
        return -1L;
    }
}
