package ads_mobile_sdk;

import java.util.concurrent.ExecutorService;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class jt2 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;

    public jt2(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4, coffeecake coffeecakeVar5, coffeecake coffeecakeVar6) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
        this.d = coffeecakeVar4;
        this.e = coffeecakeVar5;
        this.f = coffeecakeVar6;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new it2(qd0.a(this.a), qd0.a(this.b), qd0.a(this.c), (j5) this.d.get(), (ExecutorService) this.e.get(), (u13) this.f.get());
    }
}
