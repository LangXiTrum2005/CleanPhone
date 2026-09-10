package ads_mobile_sdk;

import java.util.concurrent.ExecutorService;
import saneness.coffeecake;
import saneness.coi;
import saneness.kamptulicon;
import saneness.resalable;

/* JADX INFO: loaded from: classes.dex */
public final class zo2 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;

    public zo2(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4, h21 h21Var) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
        this.d = coffeecakeVar4;
        this.e = h21Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new yo2((u73) this.a.get(), (kamptulicon) this.b.get(), (resalable) this.c.get(), (u13) this.d.get(), (ExecutorService) this.e.get());
    }
}
