package ads_mobile_sdk;

import android.content.Context;
import com.google.gson.Gson;
import saneness.coffeecake;
import saneness.coi;
import saneness.loun;
import saneness.micrococcus;
import saneness.veejay;

/* JADX INFO: loaded from: classes.dex */
public final class rz1 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;

    public rz1(coffeecake coffeecakeVar, hb0 hb0Var, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, h21 h21Var) {
        micrococcus micrococcusVar = veejay.f37359attabal;
        this.a = coffeecakeVar;
        this.b = hb0Var;
        this.c = coffeecakeVar2;
        this.d = micrococcusVar;
        this.e = coffeecakeVar3;
        this.f = h21Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new qz1((nz1) this.a.get(), (loun) this.b.get(), (jk0) this.c.get(), (Gson) this.d.get(), (xl1) this.e.get(), (Context) this.f.get());
    }
}
