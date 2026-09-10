package ads_mobile_sdk;

import android.content.Context;
import p002kotlin.coroutines.CoroutineContext;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class wj1 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;

    public wj1(h21 h21Var, coffeecake coffeecakeVar, coffeecake coffeecakeVar2, tn1 tn1Var, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4) {
        this.a = h21Var;
        this.b = coffeecakeVar;
        this.c = coffeecakeVar2;
        this.d = tn1Var;
        this.e = coffeecakeVar3;
        this.f = coffeecakeVar4;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new vj1((Context) this.a.get(), (CoroutineContext) this.b.get(), (hn1) this.c.get(), (sn1) this.d.get(), (com.google.android.libraries.ads.mobile.sdk.nativead.dern) this.e.get(), (jk0) this.f.get());
    }
}
