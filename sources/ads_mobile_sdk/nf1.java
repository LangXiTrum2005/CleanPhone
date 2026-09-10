package ads_mobile_sdk;

import android.content.Context;
import java.io.File;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import saneness.coffeecake;
import saneness.coi;
import saneness.loanblend;
import saneness.saran;

/* JADX INFO: loaded from: classes.dex */
public final class nf1 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;
    public final coffeecake f;
    public final coffeecake g;
    public final coffeecake h;

    public nf1(h21 h21Var, h21 h21Var2, coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4, h21 h21Var3) {
        saran saranVar = loanblend.f37194attabal;
        this.a = h21Var;
        this.b = h21Var2;
        this.c = coffeecakeVar;
        this.d = coffeecakeVar2;
        this.e = coffeecakeVar3;
        this.f = coffeecakeVar4;
        this.g = h21Var3;
        this.h = saranVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        Context context = (Context) this.a.get();
        ExecutorService executorService = (ExecutorService) this.b.get();
        a aVar = (a) this.c.get();
        et2 et2Var = (et2) this.d.get();
        File file = (File) this.e.get();
        u13 u13Var = (u13) this.f.get();
        j5 j5Var = (j5) this.g.get();
        return new mf1(context, executorService, aVar, et2Var, file, u13Var, j5Var.H(), (Set) this.h.get());
    }
}
