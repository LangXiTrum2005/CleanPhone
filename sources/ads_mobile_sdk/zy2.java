package ads_mobile_sdk;

import complexometry.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class zy2 implements coi {
    public final coffeecake a;

    public zy2(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        wz2 listener = (wz2) this.a.get();
        Intrinsics.checkNotNullParameter(listener, "listener");
        return (adultoid.attabal) vilification.dern(listener);
    }
}
