package ads_mobile_sdk;

import java.util.Optional;
import kotlinx.coroutines.saran;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class j93 implements coi {
    public final coffeecake a;
    public final coffeecake b;
    public final coffeecake c;

    public j93(b80 b80Var, coffeecake coffeecakeVar, coffeecake coffeecakeVar2) {
        this.a = b80Var;
        this.b = coffeecakeVar;
        this.c = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new i93((Optional) this.a.get(), (saran) this.b.get(), (jk0) this.c.get());
    }
}
