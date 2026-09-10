package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.oilcan;

/* JADX INFO: loaded from: classes.dex */
public final class ia1 implements coi {
    public final coffeecake a;

    public ia1(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        oilcan logGmsgHandler = (oilcan) this.a.get();
        Intrinsics.checkNotNullParameter(logGmsgHandler, "logGmsgHandler");
        return new ea1(logGmsgHandler);
    }
}
