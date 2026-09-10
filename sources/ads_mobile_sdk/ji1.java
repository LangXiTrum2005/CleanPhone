package ads_mobile_sdk;

import java.util.Optional;
import kotlinx.coroutines.saran;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class ji1 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public ji1(coffeecake coffeecakeVar, coffeecake coffeecakeVar2, coffeecake coffeecakeVar3) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
        this.c = coffeecakeVar3;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new ii1((ag1) this.a.get(), (Optional) this.b.get(), (saran) this.c.get());
    }
}
