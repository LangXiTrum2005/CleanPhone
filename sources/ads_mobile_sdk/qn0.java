package ads_mobile_sdk;

import complexometry.MediationAdError;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class qn0 extends nn0 {
    public final MediationAdError c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn0(MediationAdError mediationAdError) {
        super(k41.MEDIATION_NO_FILL, 0);
        Intrinsics.checkNotNullParameter(mediationAdError, "mediationAdError");
        this.c = mediationAdError;
    }

    public final MediationAdError c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qn0) && Intrinsics.wireman(this.c, ((qn0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "InternalMediationAdError(mediationAdError=" + this.c + ")";
    }
}
