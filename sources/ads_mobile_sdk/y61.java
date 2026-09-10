package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.basify;
import saneness.coffeecake;
import saneness.coi;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class y61 implements coi {
    public final coffeecake a;

    public y61(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        d7 listener = (d7) this.a.get();
        Intrinsics.checkNotNullParameter(listener, "listener");
        return (basify) vilification.dern(listener);
    }
}
