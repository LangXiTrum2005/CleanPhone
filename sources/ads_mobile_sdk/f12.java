package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.eliminate;
import svd.PersonallyIdentifiableInformation;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class f12 implements eliminate {
    public final ir0 a;

    public f12(ir0 ir0Var) {
        this.a = ir0Var;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        String str;
        Intrinsics.checkNotNullParameter(signals, "signals");
        ir0 ir0Var = this.a;
        if (ir0Var == null || (str = ir0Var.a) == null) {
            return;
        }
        long j = ir0Var.b;
        if (j > 0) {
            long j2 = (j - 978307200000L) / ((long) 1000);
            PersonallyIdentifiableInformation personallyIdentifiableInformation = signals.personallyIdentifiableInformation;
            personallyIdentifiableInformation.perAppIdV1 = str;
            personallyIdentifiableInformation.paidV1CreationTimeMilliseconds = Long.valueOf(j);
            personallyIdentifiableInformation.paidV1CreationTimeSeconds = j2 < 0 ? 0L : Long.valueOf(j2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f12) && Intrinsics.wireman(this.a, ((f12) obj).a);
    }

    public final int hashCode() {
        ir0 ir0Var = this.a;
        if (ir0Var == null) {
            return 0;
        }
        return ir0Var.hashCode();
    }

    public final String toString() {
        return "PerAppIdV1Signal(paidV1Info=" + this.a + ")";
    }
}
