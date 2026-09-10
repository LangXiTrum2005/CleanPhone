package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class ka1 implements coi {
    public final coffeecake a;

    public ka1(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        p12 persistentSdkCoreDataGmsgHandler = (p12) this.a.get();
        Intrinsics.checkNotNullParameter(persistentSdkCoreDataGmsgHandler, "persistentSdkCoreDataGmsgHandler");
        return new ea1(persistentSdkCoreDataGmsgHandler);
    }
}
