package ads_mobile_sdk;

import java.util.Optional;
import kotlinx.coroutines.saran;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class qr1 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public qr1(coffeecake coffeecakeVar, b80 b80Var, coffeecake coffeecakeVar2) {
        this.a = coffeecakeVar;
        this.b = b80Var;
        this.c = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new pr1((ag1) this.a.get(), (Optional) this.b.get(), (saran) this.c.get());
    }
}
