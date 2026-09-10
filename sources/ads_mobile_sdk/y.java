package ads_mobile_sdk;

import android.app.Application;
import android.content.Context;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.saran;
import saneness.amphitheatre;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class y implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;

    public y(h21 h21Var, coffeecake coffeecakeVar, h21 h21Var2, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4) {
        this.a = h21Var;
        this.b = coffeecakeVar;
        this.c = h21Var2;
        this.d = coffeecakeVar2;
        this.e = coffeecakeVar3;
        this.f = coffeecakeVar4;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new x((Context) this.a.get(), (Application) this.b.get(), (WeakReference) this.c.get(), (saran) this.d.get(), (jk0) this.e.get(), (amphitheatre) this.f.get());
    }
}
