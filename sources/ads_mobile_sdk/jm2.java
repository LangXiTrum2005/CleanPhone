package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class jm2 {
    public final bm2 a;
    public final fm2 b;

    public jm2(bm2 serverRequest, fm2 serverResponse) {
        Intrinsics.checkNotNullParameter(serverRequest, "serverRequest");
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        this.a = serverRequest;
        this.b = serverResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jm2)) {
            return false;
        }
        jm2 jm2Var = (jm2) obj;
        return Intrinsics.wireman(this.a, jm2Var.a) && Intrinsics.wireman(this.b, jm2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "ServerTransaction(serverRequest=" + this.a + ", serverResponse=" + this.b + ")";
    }
}
