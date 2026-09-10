package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class cj0 implements coi {
    public final coffeecake a;

    public cj0(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        vg2 rewardGmsgHandler = (vg2) this.a.get();
        Intrinsics.checkNotNullParameter(rewardGmsgHandler, "rewardGmsgHandler");
        return new bx(rewardGmsgHandler);
    }
}
