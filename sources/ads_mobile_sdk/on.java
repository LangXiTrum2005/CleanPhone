package ads_mobile_sdk;

import kotlinx.coroutines.walach;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.amphitheatre;

/* JADX INFO: loaded from: classes.dex */
public final class on extends mn {
    public final walach c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on(walach deferred, amphitheatre clock, long j) {
        super(clock, j, 0);
        Intrinsics.checkNotNullParameter(deferred, "deferred");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.c = deferred;
    }
}
