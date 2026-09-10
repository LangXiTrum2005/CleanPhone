package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class c43 implements coi {
    public final coffeecake a;

    public c43(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        cp clickGmsgHandler = (cp) this.a.get();
        Intrinsics.checkNotNullParameter(clickGmsgHandler, "clickGmsgHandler");
        return new z33(clickGmsgHandler);
    }
}
