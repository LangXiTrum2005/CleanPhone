package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class ju2 implements coi {
    public final coffeecake a;

    public ju2(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        cu0 httpTrackGmsgHandler = (cu0) this.a.get();
        Intrinsics.checkNotNullParameter(httpTrackGmsgHandler, "httpTrackGmsgHandler");
        return new fu2(httpTrackGmsgHandler);
    }
}
