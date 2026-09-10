package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class tx implements coi {
    public final coffeecake a;

    public tx(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        hg2 resultGmsgHandler = (hg2) this.a.get();
        Intrinsics.checkNotNullParameter(resultGmsgHandler, "resultGmsgHandler");
        return new bx(resultGmsgHandler);
    }
}
