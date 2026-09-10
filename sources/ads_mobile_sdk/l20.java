package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l20 {
    public final String a;
    public final b03 b;
    public final long c;

    public l20(String event, b03 label, long j) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(label, "label");
        this.a = event;
        this.b = label;
        this.c = j;
    }

    public final long a() {
        return this.c;
    }
}
