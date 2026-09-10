package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class g01 implements coi {
    public final coffeecake a;

    public g01(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        hn2 shareSheetGmsgHandler = (hn2) this.a.get();
        Intrinsics.checkNotNullParameter(shareSheetGmsgHandler, "shareSheetGmsgHandler");
        return new a01(shareSheetGmsgHandler);
    }
}
