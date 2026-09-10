package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class f9 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public f9(coffeecake coffeecakeVar, coffeecake coffeecakeVar2) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new e9((jk0) this.a.get(), (v8) this.b.get());
    }
}
