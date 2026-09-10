package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class l43 implements coi {
    public final coffeecake a;

    public l43(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        d73 videoGmsgHandler = (d73) this.a.get();
        Intrinsics.checkNotNullParameter(videoGmsgHandler, "videoGmsgHandler");
        return new z33(videoGmsgHandler);
    }
}
