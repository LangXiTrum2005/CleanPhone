package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class je2 implements coi {
    public final coffeecake a;

    public je2(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        ld2 refreshGmsgHandler = (ld2) this.a.get();
        Intrinsics.checkNotNullParameter(refreshGmsgHandler, "refreshGmsgHandler");
        return new bx(refreshGmsgHandler);
    }
}
