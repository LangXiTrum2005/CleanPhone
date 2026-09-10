package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class lu2 implements coi {
    public final coffeecake a;

    public lu2(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        zf2 resetPaidGmsgHandler = (zf2) this.a.get();
        Intrinsics.checkNotNullParameter(resetPaidGmsgHandler, "resetPaidGmsgHandler");
        return new fu2(resetPaidGmsgHandler);
    }
}
