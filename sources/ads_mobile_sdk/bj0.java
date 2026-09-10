package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class bj0 implements coi {
    public final coffeecake a;

    public bj0(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        w2 adMetadataGmsgHandler = (w2) this.a.get();
        Intrinsics.checkNotNullParameter(adMetadataGmsgHandler, "adMetadataGmsgHandler");
        return new bx(adMetadataGmsgHandler);
    }
}
