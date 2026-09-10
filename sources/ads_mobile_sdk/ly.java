package ads_mobile_sdk;

import android.content.Context;
import kotlinx.coroutines.saran;
import saneness.blighty;
import saneness.coffeecake;
import saneness.coi;
import saneness.hobby;

/* JADX INFO: loaded from: classes.dex */
public final class ly implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;

    public ly(h21 h21Var, coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4, coffeecake coffeecakeVar5) {
        this.a = h21Var;
        this.b = coffeecakeVar;
        this.c = coffeecakeVar2;
        this.d = coffeecakeVar3;
        this.e = coffeecakeVar4;
        this.f = coffeecakeVar5;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new ky((Context) this.a.get(), (saran) this.b.get(), (jk0) this.c.get(), (hobby) this.d.get(), (ri2) this.e.get(), (blighty) this.f.get());
    }
}
