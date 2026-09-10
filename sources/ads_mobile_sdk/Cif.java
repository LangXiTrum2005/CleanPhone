package ads_mobile_sdk;

import android.content.Context;
import saneness.amphitheatre;
import saneness.coffeecake;
import saneness.coi;
import saneness.loun;

/* JADX INFO: renamed from: ads_mobile_sdk.if, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class Cif implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public Cif(h21 h21Var, hb0 hb0Var, coffeecake coffeecakeVar) {
        this.a = h21Var;
        this.b = hb0Var;
        this.c = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new hf((Context) this.a.get(), (loun) this.b.get(), (amphitheatre) this.c.get());
    }
}
