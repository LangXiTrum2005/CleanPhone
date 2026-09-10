package ads_mobile_sdk;

import android.util.DisplayMetrics;
import java.util.Map;
import saneness.bochum;
import saneness.coffeecake;
import saneness.coi;
import saneness.counters;

/* JADX INFO: loaded from: classes.dex */
public final class u03 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;
    public final coffeecake e;

    public u03(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4, coffeecake coffeecakeVar5) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
        this.d = coffeecakeVar4;
        this.e = coffeecakeVar5;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new t03((bochum) this.a.get(), (counters) this.b.get(), (Map) this.c.get(), (DisplayMetrics) this.d.get(), (u13) this.e.get());
    }
}
