package ads_mobile_sdk;

import java.util.Optional;
import java.util.Set;
import p002kotlin.collections.creditor;
import p002kotlin.collections.privatdozent;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class kk1 implements coi {
    public final coffeecake a;

    public kk1(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        Optional nativeRequest = (Optional) this.a.get();
        Intrinsics.checkNotNullParameter(nativeRequest, "nativeRequest");
        return (Set) vilification.dern((!nativeRequest.isPresent() || ((com.google.android.libraries.ads.mobile.sdk.nativead.dern) nativeRequest.get()).getAdSize() == null) ? creditor.marial() : privatdozent.wireman(yf2.f));
    }
}
