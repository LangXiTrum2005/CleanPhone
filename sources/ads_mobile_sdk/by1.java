package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.eliminate;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class by1 implements eliminate {
    public final String a;
    public final String b;
    public final String c;

    public by1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.omidVersion = this.a;
        signals.omidPartnerName = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by1)) {
            return false;
        }
        by1 by1Var = (by1) obj;
        return Intrinsics.wireman(this.a, by1Var.a) && Intrinsics.wireman(this.b, by1Var.b) && Intrinsics.wireman(this.c, by1Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "OmidSignal(omidVersion=" + this.a + ", clientOmidVersion=" + this.b + ", omidPartnerName=" + this.c + ")";
    }
}
