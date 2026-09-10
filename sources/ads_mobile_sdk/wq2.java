package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class wq2 {
    public final to0 a;
    public final mo0 b;
    public final wo2 c;

    public /* synthetic */ wq2(to0 to0Var, mo0 mo0Var, int i) {
        this(to0Var, (i & 2) != 0 ? null : mo0Var, (wo2) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq2)) {
            return false;
        }
        wq2 wq2Var = (wq2) obj;
        return this.a == wq2Var.a && this.b == wq2Var.b && Intrinsics.wireman(this.c, wq2Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        mo0 mo0Var = this.b;
        int iHashCode2 = (iHashCode + (mo0Var == null ? 0 : mo0Var.hashCode())) * 31;
        wo2 wo2Var = this.c;
        return iHashCode2 + (wo2Var != null ? wo2Var.hashCode() : 0);
    }

    public final String toString() {
        return "SignalMeta(signalId=" + this.a + ", cacheState=" + this.b + ", signalData=" + this.c + ")";
    }

    public wq2(to0 signalId, mo0 mo0Var, wo2 wo2Var) {
        Intrinsics.checkNotNullParameter(signalId, "signalId");
        this.a = signalId;
        this.b = mo0Var;
        this.c = wo2Var;
    }
}
