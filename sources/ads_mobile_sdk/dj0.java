package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.astaticism;
import saneness.coffeecake;
import saneness.coi;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class dj0 implements coi {
    public final coffeecake a;

    public dj0(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        wb0 listener = (wb0) this.a.get();
        Intrinsics.checkNotNullParameter(listener, "listener");
        return (astaticism) vilification.dern(listener);
    }
}
