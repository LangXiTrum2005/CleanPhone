package ads_mobile_sdk;

import complexometry.formularize;
import java.util.concurrent.atomic.AtomicLong;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a22 {
    public final AtomicLong a;

    public a22(formularize baseRequest) {
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        this.a = new AtomicLong(baseRequest.getPlacementId());
    }

    public final AtomicLong a() {
        return this.a;
    }
}
