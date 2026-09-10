package ads_mobile_sdk;

import android.content.Context;
import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ih {
    public final Context a;
    public final saran b;

    public ih(Context context, saran backgroundScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        this.a = context;
        this.b = backgroundScope;
    }
}
