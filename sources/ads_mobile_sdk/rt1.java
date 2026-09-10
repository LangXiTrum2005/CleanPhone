package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class rt1 {
    public final qt1 a;
    public final qt1 b;
    public final boolean c;

    public rt1(qt1 impressionPrerequisite, qt1 clickPrerequisite, boolean z) {
        Intrinsics.checkNotNullParameter(impressionPrerequisite, "impressionPrerequisite");
        Intrinsics.checkNotNullParameter(clickPrerequisite, "clickPrerequisite");
        this.a = impressionPrerequisite;
        this.b = clickPrerequisite;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt1)) {
            return false;
        }
        rt1 rt1Var = (rt1) obj;
        return this.a == rt1Var.a && this.b == rt1Var.b && this.c == rt1Var.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        boolean z = this.c;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return iHashCode + r0;
    }

    public final String toString() {
        return "OfflineAdConfig(impressionPrerequisite=" + this.a + ", clickPrerequisite=" + this.b + ", notificationFlowEnabled=" + this.c + ")";
    }
}
