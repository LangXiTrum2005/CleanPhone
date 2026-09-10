package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.idolatry;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class gj implements coi {
    public final coffeecake a;

    public gj(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        yi2 renderer = (yi2) this.a.get();
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        return (idolatry) vilification.dern(renderer);
    }
}
