package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class hx implements coi {
    public final coffeecake a;

    public hx(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        cp clickGmsgHandler = (cp) this.a.get();
        Intrinsics.checkNotNullParameter(clickGmsgHandler, "clickGmsgHandler");
        return new bx(clickGmsgHandler);
    }
}
