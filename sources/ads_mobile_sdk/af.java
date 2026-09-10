package ads_mobile_sdk;

import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.eliminate;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class af implements eliminate {
    public final List a;

    public af(List grantedPermissionsList) {
        Intrinsics.checkNotNullParameter(grantedPermissionsList, "grantedPermissionsList");
        this.a = grantedPermissionsList;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.grantedPermissions.addAll(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof af) && Intrinsics.wireman(this.a, ((af) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AppPermissionsSignal(grantedPermissionsList=" + this.a + ")";
    }
}
