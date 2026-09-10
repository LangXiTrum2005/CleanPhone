package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class la1 implements coi {
    public final coffeecake a;

    public la1(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        jv0 inMemorySdkCoreDataGmsgHandler = (jv0) this.a.get();
        Intrinsics.checkNotNullParameter(inMemorySdkCoreDataGmsgHandler, "inMemorySdkCoreDataGmsgHandler");
        return new ea1(inMemorySdkCoreDataGmsgHandler);
    }
}
