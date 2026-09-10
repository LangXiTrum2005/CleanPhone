package ads_mobile_sdk;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import saneness.coffeecake;
import saneness.coi;
import saneness.demented;
import saneness.psalmodic;

/* JADX INFO: loaded from: classes.dex */
public final class c72 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;
    public final coffeecake g;

    public c72(h21 h21Var, coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, h21 h21Var2, coffeecake coffeecakeVar4, coffeecake coffeecakeVar5) {
        this.a = h21Var;
        this.b = coffeecakeVar;
        this.c = coffeecakeVar2;
        this.d = coffeecakeVar3;
        this.e = h21Var2;
        this.f = coffeecakeVar4;
        this.g = coffeecakeVar5;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new b72((Context) this.a.get(), qd0.a(this.b), (demented) this.c.get(), (u13) this.d.get(), (ExecutorService) this.e.get(), (o72) this.f.get(), (psalmodic) this.g.get());
    }
}
