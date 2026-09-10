package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class wx implements coi {
    public final coffeecake a;

    public wx(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        f73 videoMetadataGmsgHandler = (f73) this.a.get();
        Intrinsics.checkNotNullParameter(videoMetadataGmsgHandler, "videoMetadataGmsgHandler");
        return new bx(videoMetadataGmsgHandler);
    }
}
