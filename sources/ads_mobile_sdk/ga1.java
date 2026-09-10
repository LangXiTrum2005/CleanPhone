package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class ga1 implements coi {
    public final coffeecake a;

    public ga1(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        r53 updateConsentAllowlistGmsgHandler = (r53) this.a.get();
        Intrinsics.checkNotNullParameter(updateConsentAllowlistGmsgHandler, "updateConsentAllowlistGmsgHandler");
        return new ea1(updateConsentAllowlistGmsgHandler);
    }
}
