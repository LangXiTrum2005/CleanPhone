package ads_mobile_sdk;

import java.util.concurrent.Executor;
import saneness.amphitheatre;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class kb1 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public kb1(coffeecake coffeecakeVar, coffeecake coffeecakeVar2) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new jb1((Executor) this.a.get(), (amphitheatre) this.b.get());
    }
}
