package ads_mobile_sdk;

import android.content.Context;
import kotlinx.coroutines.saran;
import saneness.amphitheatre;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class bu1 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;

    public bu1(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4, coffeecake coffeecakeVar5, coffeecake coffeecakeVar6) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
        this.d = coffeecakeVar4;
        this.e = coffeecakeVar5;
        this.f = coffeecakeVar6;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new au1((Context) this.a.get(), (saran) this.b.get(), ((Integer) this.c.get()).intValue(), (amphitheatre) this.d.get(), (mu1) this.e.get(), (b63) this.f.get());
    }
}
