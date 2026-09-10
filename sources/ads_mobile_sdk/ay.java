package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class ay implements coi {
    public final coffeecake a;

    public ay(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        gh1 mraidRequestHandler = (gh1) this.a.get();
        Intrinsics.checkNotNullParameter(mraidRequestHandler, "mraidRequestHandler");
        return new qw(mraidRequestHandler);
    }
}
