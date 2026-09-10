package ads_mobile_sdk;

import java.io.File;
import java.util.concurrent.ExecutorService;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class tv2 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;
    public final coffeecake g;
    public final coffeecake h;
    public final coffeecake i;

    public tv2(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4, coffeecake coffeecakeVar5, coffeecake coffeecakeVar6, coffeecake coffeecakeVar7, h21 h21Var, coffeecake coffeecakeVar8) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
        this.d = coffeecakeVar4;
        this.e = coffeecakeVar5;
        this.f = coffeecakeVar6;
        this.g = coffeecakeVar7;
        this.h = h21Var;
        this.i = coffeecakeVar8;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new sv2((pv2) this.a.get(), (pv2) this.b.get(), qd0.a(this.c), (pv2) this.d.get(), (pv2) this.e.get(), qd0.a(this.f), (File) this.g.get(), (ExecutorService) this.h.get(), (u13) this.i.get());
    }
}
