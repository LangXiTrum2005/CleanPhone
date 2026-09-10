package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;
import saneness.connector;

/* JADX INFO: loaded from: classes.dex */
public final class s0 implements coi {
    public final coffeecake a;

    public s0(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new r0((connector) this.a.get());
    }
}
