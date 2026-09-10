package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.licking;

/* JADX INFO: loaded from: classes.dex */
public final class m22 {
    public final boolean a;
    public final String b;
    public final boolean c;

    public m22(boolean z, String prefetchUrl, boolean z2) {
        Intrinsics.checkNotNullParameter(prefetchUrl, "prefetchUrl");
        this.a = z;
        this.b = prefetchUrl;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m22)) {
            return false;
        }
        m22 m22Var = (m22) obj;
        return this.a == m22Var.a && Intrinsics.wireman(this.b, m22Var.b) && this.c == m22Var.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iAttabal = licking.attabal(this.b, r0 * 31, 31);
        boolean z2 = this.c;
        return iAttabal + (z2 ? 1 : z2);
    }

    public final String toString() {
        return "PlayPrewarmOptions(enablePrewarming=" + this.a + ", prefetchUrl=" + this.b + ", skipOfflineNotificationFlow=" + this.c + ")";
    }
}
