package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;
import saneness.hobby;

/* JADX INFO: loaded from: classes.dex */
public final class du0 implements coi {
    public final coffeecake a;

    public du0(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new cu0((hobby) this.a.get());
    }
}
