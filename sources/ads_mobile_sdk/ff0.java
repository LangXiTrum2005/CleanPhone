package ads_mobile_sdk;

import java.util.Map;
import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class ff0 {
    public final saran a;
    public final Map b;

    public ff0(saran scope, Map listeners) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        this.a = scope;
        this.b = listeners;
    }
}
