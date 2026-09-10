package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.sclerosis;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class yr implements coi {
    public final coffeecake a;

    public yr(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        wb0 listener = (wb0) this.a.get();
        Intrinsics.checkNotNullParameter(listener, "listener");
        return (sclerosis) vilification.dern(listener);
    }
}
