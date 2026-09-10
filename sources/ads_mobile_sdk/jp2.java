package ads_mobile_sdk;

import java.util.LinkedHashSet;
import p002kotlin.jvm.internal.Intrinsics;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class jp2 {
    public final long a;
    public final adjudge.saneness b;
    public final arytenoidectomy c;
    public final LinkedHashSet d;

    public jp2(long j, String requestId, adjudge.saneness signalRequest, arytenoidectomy signals) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(signalRequest, "signalRequest");
        Intrinsics.checkNotNullParameter(signals, "signals");
        this.a = j;
        this.b = signalRequest;
        this.c = signals;
        this.d = new LinkedHashSet();
    }
}
