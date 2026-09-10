package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.undertread;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class ch1 implements coi {
    public final coffeecake a;

    public ch1(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        xf1 mraidAdEventListener = (xf1) this.a.get();
        Intrinsics.checkNotNullParameter(mraidAdEventListener, "mraidAdEventListener");
        return (undertread) vilification.dern(mraidAdEventListener);
    }
}
