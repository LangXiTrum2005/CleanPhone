package ads_mobile_sdk;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class zs1 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public zs1(coffeecake coffeecakeVar, coffeecake coffeecakeVar2) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new ys1((Context) this.a.get(), (ExecutorService) this.b.get());
    }
}
