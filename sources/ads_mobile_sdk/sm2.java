package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.eliminate;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class sm2 implements eliminate {
    public final String a;

    public sm2(String str) {
        this.a = str;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY java.lang.String = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sm2) && Intrinsics.wireman(this.a, ((sm2) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "SessionIdSignal(sessionId=" + this.a + ")";
    }
}
