package ads_mobile_sdk;

import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class fq2 {
    public final String a;
    public final List b;

    public fq2(String signalBlob, List list) {
        Intrinsics.checkNotNullParameter(signalBlob, "signalBlob");
        this.a = signalBlob;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fq2)) {
            return false;
        }
        fq2 fq2Var = (fq2) obj;
        return Intrinsics.wireman(this.a, fq2Var.a) && Intrinsics.wireman(this.b, fq2Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        List list = this.b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "SignalResponse(signalBlob=" + this.a + ", csrbErrors=" + this.b + ")";
    }
}
