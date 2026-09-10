package ads_mobile_sdk;

import saneness.amphitheatre;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class vf2 implements coi {
    public final coffeecake a;
    public final coffeecake b;

    public vf2(coffeecake coffeecakeVar, coffeecake coffeecakeVar2) {
        this.a = coffeecakeVar;
        this.b = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new uf2((jk0) this.a.get(), (amphitheatre) this.b.get());
    }
}
