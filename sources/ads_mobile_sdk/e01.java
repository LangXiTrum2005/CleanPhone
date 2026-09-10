package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class e01 implements coi {
    public final coffeecake a;

    public e01(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        wt2 singleAdSourceTestingGmsgHandler = (wt2) this.a.get();
        Intrinsics.checkNotNullParameter(singleAdSourceTestingGmsgHandler, "singleAdSourceTestingGmsgHandler");
        return new a01(singleAdSourceTestingGmsgHandler);
    }
}
