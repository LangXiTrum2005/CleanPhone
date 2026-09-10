package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.bonny;
import saneness.licking;

/* JADX INFO: loaded from: classes.dex */
public final class j71 {
    public String a;
    public String b;
    public int c;
    public so0 d;
    public int e;

    public /* synthetic */ j71() {
        this("", "", 0, so0.SCAR_REQUEST_TYPE_UNSPECIFIED, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j71)) {
            return false;
        }
        j71 j71Var = (j71) obj;
        return Intrinsics.wireman(this.a, j71Var.a) && Intrinsics.wireman(this.b, j71Var.b) && this.c == j71Var.c && this.d == j71Var.d && this.e == j71Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ((this.d.hashCode() + bonny.attabal(this.c, licking.attabal(this.b, this.a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "InternalRequestTraceMeta(internalRequestId=" + this.a + ", gwsQueryId=" + this.b + ", sequenceNumber=" + this.c + ", scarRequestType=" + this.d + ", mediationChainLength=" + this.e + ")";
    }

    public j71(String internalRequestId, String gwsQueryId, int i, so0 scarRequestType, int i2) {
        Intrinsics.checkNotNullParameter(internalRequestId, "internalRequestId");
        Intrinsics.checkNotNullParameter(gwsQueryId, "gwsQueryId");
        Intrinsics.checkNotNullParameter(scarRequestType, "scarRequestType");
        this.a = internalRequestId;
        this.b = gwsQueryId;
        this.c = i;
        this.d = scarRequestType;
        this.e = i2;
    }
}
