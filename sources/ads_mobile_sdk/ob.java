package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.eliminate;
import svd.PersonallyIdentifiableInformation;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class ob implements eliminate {
    public final String a;
    public final Boolean b;

    public ob(String str, Boolean bool) {
        this.a = str;
        this.b = bool;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        String str = this.a;
        if (str != null) {
            PersonallyIdentifiableInformation personallyIdentifiableInformation = signals.personallyIdentifiableInformation;
            personallyIdentifiableInformation.amazonFireAdId = str;
            personallyIdentifiableInformation.isAmazonFireAdIdLimitAdTracking = this.b;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob)) {
            return false;
        }
        ob obVar = (ob) obj;
        return Intrinsics.wireman(this.a, obVar.a) && Intrinsics.wireman(this.b, obVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "AmazonFireAdIdSignal(advertisingId=" + this.a + ", limitAdTracking=" + this.b + ")";
    }
}
