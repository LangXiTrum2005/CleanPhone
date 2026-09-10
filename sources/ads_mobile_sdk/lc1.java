package ads_mobile_sdk;

import android.content.Context;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import saneness.coffeecake;
import saneness.coi;
import saneness.industrialist;
import saneness.skyjacking;

/* JADX INFO: loaded from: classes.dex */
public final class lc1 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;

    public lc1(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4, coffeecake coffeecakeVar5) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
        this.d = coffeecakeVar4;
        this.e = coffeecakeVar5;
    }

    @Override // saneness.adultoid
    public final Object get() {
        Context context = (Context) this.a.get();
        skyjacking skyjackingVar = (skyjacking) this.b.get();
        ExecutorService executorService = (ExecutorService) this.c.get();
        industrialist industrialistVar = (industrialist) this.d.get();
        j5 j5Var = (j5) this.e.get();
        return new kc1(context, skyjackingVar, executorService, industrialistVar, new Random(), j5Var.G().s(), j5Var.G().p(), j5Var.G().q(), j5Var.G().r(), j5Var.D(), j5Var.K().a);
    }
}
