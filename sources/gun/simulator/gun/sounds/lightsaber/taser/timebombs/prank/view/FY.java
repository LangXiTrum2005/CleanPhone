package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4619sw f3070a;
    public final AC b;
    public final long c;
    public final List d;
    public final List e;
    public final List f;
    public final C3614hX g;

    public FY(C4619sw c4619sw, AC ac, AbstractC3139c40 abstractC3139c40, ArrayList arrayList, List list, List list2) {
        FW.h(!ac.isEmpty());
        this.f3070a = c4619sw;
        this.b = AC.j(ac);
        this.d = Collections.unmodifiableList(arrayList);
        this.e = list;
        this.f = list2;
        this.g = abstractC3139c40.a(this);
        this.c = Ug0.R(abstractC3139c40.c, 1000000L, abstractC3139c40.b);
    }

    public abstract String a();

    public abstract InterfaceC3021al b();

    public abstract C3614hX d();
}
