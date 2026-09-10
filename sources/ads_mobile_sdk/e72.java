package ads_mobile_sdk;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import saneness.coffeecake;
import saneness.coi;
import saneness.industrialist;

/* JADX INFO: loaded from: classes.dex */
public final class e72 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;

    public e72(h21 h21Var, h21 h21Var2, h21 h21Var3, coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3) {
        this.a = h21Var;
        this.b = h21Var2;
        this.c = h21Var3;
        this.d = coffeecakeVar;
        this.e = coffeecakeVar2;
        this.f = coffeecakeVar3;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new d72((Context) this.a.get(), (ExecutorService) this.b.get(), (j5) this.c.get(), (industrialist) this.d.get(), (u13) this.e.get(), (p72) this.f.get());
    }
}
