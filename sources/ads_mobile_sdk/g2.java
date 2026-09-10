package ads_mobile_sdk;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.eliminate;
import svd.PersonallyIdentifiableInformation;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class g2 implements eliminate {
    public final AdvertisingIdClient.Info a;

    public g2(AdvertisingIdClient.Info info) {
        this.a = info;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        AdvertisingIdClient.Info info = this.a;
        if (info != null) {
            PersonallyIdentifiableInformation personallyIdentifiableInformation = signals.personallyIdentifiableInformation;
            personallyIdentifiableInformation.adId = info.getId();
            personallyIdentifiableInformation.isLimitedAdTracking = Boolean.valueOf(this.a.isLimitAdTrackingEnabled());
            personallyIdentifiableInformation.idTypeParameter = "adid";
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2) && Intrinsics.wireman(this.a, ((g2) obj).a);
    }

    public final int hashCode() {
        AdvertisingIdClient.Info info = this.a;
        if (info == null) {
            return 0;
        }
        return info.hashCode();
    }

    public final String toString() {
        return "AdIdInfoSignal(adIdInfo=" + this.a + ")";
    }
}
