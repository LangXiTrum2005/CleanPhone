package ads_mobile_sdk;

import com.google.android.gms.appset.AppSetIdInfo;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ln {
    public final AppSetIdInfo a;
    public final long b;

    public ln(AppSetIdInfo appSetIdInfo, long j) {
        this.a = appSetIdInfo;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln)) {
            return false;
        }
        ln lnVar = (ln) obj;
        return Intrinsics.wireman(this.a, lnVar.a) && p002kotlin.time.saneness.kowloon(this.b, lnVar.b);
    }

    public final int hashCode() {
        AppSetIdInfo appSetIdInfo = this.a;
        return p002kotlin.time.saneness.trm(this.b) + ((appSetIdInfo == null ? 0 : appSetIdInfo.hashCode()) * 31);
    }

    public final String toString() {
        return "CachedAppSetIdInfo(appSetIdInfo=" + this.a + ", timestamp=" + p002kotlin.time.saneness.starveling(this.b) + ")";
    }
}
