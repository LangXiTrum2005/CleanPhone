package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.eliminate;
import svd.PersonallyIdentifiableInformation;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class k12 implements eliminate {
    public final j12 a;

    public k12(j12 j12Var) {
        this.a = j12Var;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        ir0 ir0Var;
        String str;
        Intrinsics.checkNotNullParameter(signals, "signals");
        j12 j12Var = this.a;
        if (j12Var == null || (ir0Var = j12Var.a) == null || (str = ir0Var.a) == null) {
            return;
        }
        long j = ir0Var.b;
        if (j > 0) {
            PersonallyIdentifiableInformation personallyIdentifiableInformation = signals.personallyIdentifiableInformation;
            personallyIdentifiableInformation.perAppIdV2 = str;
            personallyIdentifiableInformation.paidV2CreationTimeMilliseconds = Long.valueOf(j);
            personallyIdentifiableInformation.paidV2PubOption = Boolean.valueOf(this.a.b);
            personallyIdentifiableInformation.paidV2UserOption = Boolean.valueOf(this.a.b);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k12) && Intrinsics.wireman(this.a, ((k12) obj).a);
    }

    public final int hashCode() {
        j12 j12Var = this.a;
        if (j12Var == null) {
            return 0;
        }
        return j12Var.hashCode();
    }

    public final String toString() {
        return "PerAppIdV2Signal(paidV2=" + this.a + ")";
    }
}
