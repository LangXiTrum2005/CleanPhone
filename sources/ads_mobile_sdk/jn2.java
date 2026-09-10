package ads_mobile_sdk;

import android.os.Bundle;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.eliminate;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class jn2 implements eliminate {
    public final Bundle a;

    public jn2(Bundle sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.a = sharedPreferences;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.sharedPreferenceSignals = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jn2) && Intrinsics.wireman(this.a, ((jn2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SharedPreferenceSignal(sharedPreferences=" + this.a + ")";
    }
}
