package ads_mobile_sdk;

import android.content.Context;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class s11 implements coi {
    public final coffeecake a;

    public s11(h21 h21Var) {
        this.a = h21Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new r11((Context) this.a.get());
    }
}
