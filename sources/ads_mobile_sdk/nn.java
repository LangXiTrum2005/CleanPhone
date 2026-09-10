package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.amphitheatre;
import saneness.eliminate;

/* JADX INFO: loaded from: classes.dex */
public final class nn extends mn {
    public final eliminate c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn(eliminate result, amphitheatre clock, long j) {
        super(clock, j, 0);
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.c = result;
    }
}
