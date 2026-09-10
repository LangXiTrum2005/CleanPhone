package ads_mobile_sdk;

import com.google.android.gms.appset.AppSetIdInfo;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.eliminate;
import svd.PersonallyIdentifiableInformation;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class jf implements eliminate {
    public final AppSetIdInfo a;

    public jf(AppSetIdInfo appSetIdInfo) {
        this.a = appSetIdInfo;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        AppSetIdInfo appSetIdInfo = this.a;
        if (appSetIdInfo != null) {
            PersonallyIdentifiableInformation personallyIdentifiableInformation = signals.personallyIdentifiableInformation;
            personallyIdentifiableInformation.appSetId = appSetIdInfo.getId();
            personallyIdentifiableInformation.appSetIdScope = Integer.valueOf(this.a.getScope());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jf) && Intrinsics.wireman(this.a, ((jf) obj).a);
    }

    public final int hashCode() {
        AppSetIdInfo appSetIdInfo = this.a;
        if (appSetIdInfo == null) {
            return 0;
        }
        return appSetIdInfo.hashCode();
    }

    public final String toString() {
        return "AppSetIdInfoSignal(appSetIdInfo=" + this.a + ")";
    }
}
