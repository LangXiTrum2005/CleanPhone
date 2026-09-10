package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class fx implements coi {
    public final coffeecake a;

    public fx(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        go canOpenIntentsGmsgHandler = (go) this.a.get();
        Intrinsics.checkNotNullParameter(canOpenIntentsGmsgHandler, "canOpenIntentsGmsgHandler");
        return new bx(canOpenIntentsGmsgHandler);
    }
}
