package ads_mobile_sdk;

import java.util.concurrent.ExecutorService;
import saneness.coffeecake;
import saneness.coi;
import saneness.euthanasia;

/* JADX INFO: loaded from: classes.dex */
public final class mt2 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;

    public mt2(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4, coffeecake coffeecakeVar5) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
        this.d = coffeecakeVar4;
        this.e = coffeecakeVar5;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new lt2((j5) this.a.get(), (it2) this.b.get(), (euthanasia) this.c.get(), (ExecutorService) this.d.get(), (u13) this.e.get());
    }
}
