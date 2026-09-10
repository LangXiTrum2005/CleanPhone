package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.backstairs;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class gw0 implements coi {
    public final coffeecake a;

    public gw0(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        coffeecake adServicesExtensionVersionSignalSource = this.a;
        Intrinsics.checkNotNullParameter(adServicesExtensionVersionSignalSource, "adServicesExtensionVersionSignalSource");
        return new backstairs(adServicesExtensionVersionSignalSource);
    }
}
