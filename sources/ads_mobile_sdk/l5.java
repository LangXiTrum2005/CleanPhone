package ads_mobile_sdk;

import saneness.capsulated;
import saneness.coffeecake;
import saneness.coi;
import saneness.stupefactive;

/* JADX INFO: loaded from: classes.dex */
public final class l5 implements coi {
    public final coffeecake a;

    public l5(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        return new capsulated((stupefactive) this.a.get());
    }
}
