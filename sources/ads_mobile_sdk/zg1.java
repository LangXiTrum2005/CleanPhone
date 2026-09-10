package ads_mobile_sdk;

import android.content.Context;
import kotlinx.coroutines.saran;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class zg1 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;

    public zg1(h21 h21Var, coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4, coffeecake coffeecakeVar5) {
        this.a = h21Var;
        this.b = coffeecakeVar;
        this.c = coffeecakeVar2;
        this.d = coffeecakeVar3;
        this.e = coffeecakeVar4;
        this.f = coffeecakeVar5;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new yg1((Context) this.a.get(), (x) this.b.get(), (ag1) this.c.get(), (String) this.d.get(), (saran) this.e.get(), (qc0) this.f.get());
    }
}
