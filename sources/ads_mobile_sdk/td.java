package ads_mobile_sdk;

import android.content.Context;
import com.google.common.util.concurrent.gintrap;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class td implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;
    public final coffeecake d;

    public td(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3, coffeecake coffeecakeVar4) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
        this.d = coffeecakeVar4;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new sd((Context) this.a.get(), (j5) this.c.get(), (u13) this.b.get(), (gintrap) this.d.get());
    }
}
