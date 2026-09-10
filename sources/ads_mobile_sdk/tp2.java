package ads_mobile_sdk;

import liquory.competently;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class tp2 implements coi {
    public final coffeecake a;

    public tp2(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        adjudge.saneness signalRequest = (adjudge.saneness) this.a.get();
        Intrinsics.checkNotNullParameter(signalRequest, "signalRequest");
        if (signalRequest instanceof competently) {
            return yf2.f;
        }
        return signalRequest instanceof com.google.android.libraries.ads.mobile.sdk.nativead.wireman ? yf2.i : yf2.d;
    }
}
