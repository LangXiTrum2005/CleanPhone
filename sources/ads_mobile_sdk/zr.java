package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.sclerosis;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class zr implements coi {
    public final coffeecake a;

    public zr(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        m23 listener = (m23) this.a.get();
        Intrinsics.checkNotNullParameter(listener, "listener");
        return (sclerosis) vilification.dern(listener);
    }
}
