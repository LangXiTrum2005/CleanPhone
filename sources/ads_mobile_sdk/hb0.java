package ads_mobile_sdk;

import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class hb0 implements coi {
    public coffeecake a;

    public static void a(coffeecake coffeecakeVar, coffeecake coffeecakeVar2) {
        hb0 hb0Var = (hb0) coffeecakeVar;
        if (hb0Var.a != null) {
            throw new IllegalStateException();
        }
        hb0Var.a = coffeecakeVar2;
    }

    @Override // saneness.adultoid
    public final Object get() {
        coffeecake coffeecakeVar = this.a;
        if (coffeecakeVar != null) {
            return coffeecakeVar.get();
        }
        throw new IllegalStateException();
    }
}
