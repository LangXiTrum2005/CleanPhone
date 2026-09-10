package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b03 {
    public final String a;
    public final long b;

    public b03(long j, String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.a = label;
        this.b = j;
    }

    public final long a() {
        return this.b;
    }
}
