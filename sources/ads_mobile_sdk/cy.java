package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class cy implements coi {
    public final coffeecake a;

    public cy(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        gk2 safeBrowsingManager = (gk2) this.a.get();
        Intrinsics.checkNotNullParameter(safeBrowsingManager, "safeBrowsingManager");
        return new tw(safeBrowsingManager);
    }
}
