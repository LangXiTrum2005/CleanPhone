package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class dy implements coi {
    public final coffeecake a;

    public dy(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        x83 webViewInputEventStore = (x83) this.a.get();
        Intrinsics.checkNotNullParameter(webViewInputEventStore, "webViewInputEventStore");
        return new ww(webViewInputEventStore);
    }
}
