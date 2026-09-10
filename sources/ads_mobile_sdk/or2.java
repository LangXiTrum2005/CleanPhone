package ads_mobile_sdk;

import complexometry.formularize;
import java.util.Set;
import p002kotlin.collections.creditor;
import p002kotlin.collections.privatdozent;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;
import saneness.vilification;

/* JADX INFO: loaded from: classes.dex */
public final class or2 implements coi {
    public final coffeecake a;

    public or2(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        Object baseRequest = (formularize) this.a.get();
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        com.google.android.libraries.ads.mobile.sdk.nativead.dern dernVar = baseRequest instanceof com.google.android.libraries.ads.mobile.sdk.nativead.dern ? (com.google.android.libraries.ads.mobile.sdk.nativead.dern) baseRequest : null;
        return (Set) vilification.dern((dernVar != null ? dernVar.getAdSize() : null) != null ? privatdozent.wireman(yf2.f) : creditor.marial());
    }
}
