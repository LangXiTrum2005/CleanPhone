package ads_mobile_sdk;

import complexometry.formularize;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class bm2 {
    public final formularize a;

    public bm2(formularize baseRequest) {
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        this.a = baseRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bm2) && Intrinsics.wireman(this.a, ((bm2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ServerRequest(baseRequest=" + this.a + ")";
    }
}
