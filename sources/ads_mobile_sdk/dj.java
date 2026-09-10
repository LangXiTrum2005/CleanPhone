package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.tympanoplasty;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class dj implements coi {
    public final coffeecake a;

    public dj(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        kj wrapper = (kj) this.a.get();
        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
        return (tympanoplasty) vilification.dern(wrapper);
    }
}
