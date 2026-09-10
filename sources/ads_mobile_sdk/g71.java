package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class g71 implements coi {
    public final coffeecake a;

    public g71(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        yf2 requestType = (yf2) this.a.get();
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        return (yf2) vilification.dern(requestType);
    }
}
