package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.basify;
import saneness.coffeecake;
import saneness.coi;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class u61 implements coi {
    public final coffeecake a;

    public u61(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        gy0 listener = (gy0) this.a.get();
        Intrinsics.checkNotNullParameter(listener, "listener");
        return (basify) vilification.dern(listener);
    }
}
