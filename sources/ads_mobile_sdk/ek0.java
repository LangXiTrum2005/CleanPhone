package ads_mobile_sdk;

import android.content.Context;
import saneness.coffeecake;
import saneness.coi;
import saneness.crock;

/* JADX INFO: loaded from: classes.dex */
public final class ek0 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;

    public ek0(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
        this.d = coffeecakeVar4;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new crock((Context) this.a.get(), (sj0) this.b.get(), (ll2) this.c.get(), (yf) this.d.get());
    }
}
