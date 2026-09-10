package ads_mobile_sdk;

import android.content.Context;
import java.io.File;
import saneness.coffeecake;
import saneness.coi;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class d5 implements coi {
    public final coffeecake a;

    public d5(h21 h21Var) {
        this.a = h21Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return (File) vilification.dern(((Context) this.a.get()).getDir("yqzdkcache", 0));
    }
}
