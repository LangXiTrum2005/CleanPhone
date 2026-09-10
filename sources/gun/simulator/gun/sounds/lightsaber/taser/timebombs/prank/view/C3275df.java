package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.df, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3275df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f4282a;
    public final ArrayList b;
    public final HashSet c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;

    public C3275df(String str) {
        AbstractC2995aW.q(str, "serialName");
        this.f4282a = C2812Uq.f3846a;
        this.b = new ArrayList();
        this.c = new HashSet();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
    }

    public static void a(C3275df c3275df, String str, D40 d40) {
        C2812Uq c2812Uq = C2812Uq.f3846a;
        c3275df.getClass();
        AbstractC2995aW.q(d40, "descriptor");
        if (!c3275df.c.add(str)) {
            throw new IllegalArgumentException(DM.B("Element with name '", str, "' is already registered").toString());
        }
        c3275df.b.add(str);
        c3275df.d.add(d40);
        c3275df.e.add(c2812Uq);
        c3275df.f.add(false);
    }
}
