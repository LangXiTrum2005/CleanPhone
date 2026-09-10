package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.idolatry;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class bj implements coi {
    public final coffeecake a;

    public bj(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        hi bannerAdRenderer = (hi) this.a.get();
        Intrinsics.checkNotNullParameter(bannerAdRenderer, "bannerAdRenderer");
        return (idolatry) vilification.dern(bannerAdRenderer);
    }
}
