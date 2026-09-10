package ads_mobile_sdk;

import com.google.gson.JsonObject;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.eliminate;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class w20 implements eliminate {
    public final JsonObject a;

    public w20(JsonObject consentStateJson) {
        Intrinsics.checkNotNullParameter(consentStateJson, "consentStateJson");
        this.a = consentStateJson;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.csrbEcoData = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w20) && Intrinsics.wireman(this.a, ((w20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CsrbEcoDataSignal(consentStateJson=" + this.a + ")";
    }
}
