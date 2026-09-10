package ads_mobile_sdk;

import android.content.Context;
import kotlinx.coroutines.saran;
import saneness.coffeecake;
import saneness.coi;
import saneness.unkink;

/* JADX INFO: loaded from: classes.dex */
public final class to1 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;

    public to1(h21 h21Var, coffeecake coffeecakeVar, coffeecake coffeecakeVar2, ip1 ip1Var, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4) {
        this.a = h21Var;
        this.b = coffeecakeVar;
        this.c = coffeecakeVar2;
        this.d = ip1Var;
        this.e = coffeecakeVar3;
        this.f = coffeecakeVar4;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new so1((Context) this.a.get(), (saran) this.b.get(), (g83) this.c.get(), (unkink) this.d.get(), (jk0) this.e.get(), (com.google.android.libraries.ads.mobile.sdk.nativead.dern) this.f.get());
    }
}
