package ads_mobile_sdk;

import android.content.Context;
import kotlinx.coroutines.saran;
import p002kotlin.coroutines.CoroutineContext;
import saneness.coffeecake;
import saneness.coi;
import saneness.loun;

/* JADX INFO: loaded from: classes.dex */
public final class hy1 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;

    public hy1(h21 h21Var, coffeecake coffeecakeVar, coffeecake coffeecakeVar2, hb0 hb0Var, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4) {
        this.a = h21Var;
        this.b = coffeecakeVar;
        this.c = coffeecakeVar2;
        this.d = hb0Var;
        this.e = coffeecakeVar3;
        this.f = coffeecakeVar4;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new lv1((Context) this.a.get(), (CoroutineContext) this.b.get(), (saran) this.c.get(), (loun) this.d.get(), (ri2) this.e.get(), (String) this.f.get());
    }
}
