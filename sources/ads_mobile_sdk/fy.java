package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class fy implements coi {
    public final coffeecake a;

    public fy(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        cb3 webviewFirebaseAnalyticsEventsHandler = (cb3) this.a.get();
        Intrinsics.checkNotNullParameter(webviewFirebaseAnalyticsEventsHandler, "webviewFirebaseAnalyticsEventsHandler");
        return new ax(webviewFirebaseAnalyticsEventsHandler);
    }
}
