package ads_mobile_sdk;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    public final saran a;
    public final jk0 b;
    public final AtomicInteger c;
    public final ConcurrentHashMap d;

    public c0(saran backgroundScope, jk0 flags) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.a = backgroundScope;
        this.b = flags;
        this.c = new AtomicInteger(0);
        this.d = new ConcurrentHashMap();
    }
}
