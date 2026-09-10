package ads_mobile_sdk;

import kotlinx.coroutines.monroe;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.sunback;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    public final sunback a;
    public final monroe b;

    public a0(sunback delegate, monroe cleanupJob) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(cleanupJob, "cleanupJob");
        this.a = delegate;
        this.b = cleanupJob;
    }
}
