package ads_mobile_sdk;

import android.content.Context;
import java.util.Map;
import saneness.bochum;
import saneness.coffeecake;
import saneness.coi;
import saneness.counters;

/* JADX INFO: loaded from: classes.dex */
public final class bl2 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;

    public bl2(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, h21 h21Var, coffeecake coffeecakeVar4, coffeecake coffeecakeVar5) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
        this.d = h21Var;
        this.e = coffeecakeVar4;
        this.f = coffeecakeVar5;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new al2((bochum) this.a.get(), (counters) this.b.get(), (yu2) this.c.get(), (Context) this.d.get(), (Map) this.e.get(), (u13) this.f.get());
    }
}
