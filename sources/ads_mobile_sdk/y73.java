package ads_mobile_sdk;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import saneness.amphitheatre;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class y73 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public y73(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, h21 h21Var) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = h21Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new x73((Context) this.a.get(), (amphitheatre) this.b.get(), (ExecutorService) this.c.get(), x73.h);
    }
}
