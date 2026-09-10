package ads_mobile_sdk;

import android.content.Context;
import java.util.Optional;
import saneness.amphitheatre;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class tr1 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;

    public tr1(h21 h21Var, coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4, coffeecake coffeecakeVar5) {
        this.a = h21Var;
        this.b = coffeecakeVar;
        this.c = coffeecakeVar2;
        this.d = coffeecakeVar3;
        this.e = coffeecakeVar4;
        this.f = coffeecakeVar5;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new sr1((Context) this.a.get(), (String) this.b.get(), (String) this.c.get(), (wf) this.d.get(), (Optional) this.e.get(), (amphitheatre) this.f.get());
    }
}
