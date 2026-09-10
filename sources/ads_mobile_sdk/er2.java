package ads_mobile_sdk;

import android.content.Context;
import android.util.DisplayMetrics;
import saneness.coffeecake;
import saneness.coi;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class er2 implements coi {
    public final coffeecake a;

    public er2(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return (DisplayMetrics) vilification.dern(((Context) this.a.get()).getResources().getDisplayMetrics());
    }
}
