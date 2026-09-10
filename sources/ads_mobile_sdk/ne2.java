package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ne2 {
    public final h1 a;
    public me2 b;
    public final long c;
    public final Integer d;

    public ne2(h1 adConfiguration, me2 fillStatus, long j, Integer num) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(fillStatus, "fillStatus");
        this.a = adConfiguration;
        this.b = fillStatus;
        this.c = j;
        this.d = num;
    }

    public final String toString() {
        String str = this.a.n + "." + this.b.a() + "." + p002kotlin.time.saneness.adultoid(this.c);
        if (this.a.k0.length() > 0) {
            str = str + "." + this.a.k0;
            Integer num = this.d;
            if (num != null) {
                return str + "." + num;
            }
        }
        return str;
    }
}
