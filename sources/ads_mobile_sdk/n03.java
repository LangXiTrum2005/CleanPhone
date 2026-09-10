package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.eliminate;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class n03 implements eliminate {
    public final Integer a;
    public final String b;

    public /* synthetic */ n03(int i, Integer num) {
        this((i & 1) != 0 ? null : num, (String) null);
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.topics = this.b;
        signals.topicsApiStatus = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n03)) {
            return false;
        }
        n03 n03Var = (n03) obj;
        return Intrinsics.wireman(this.a, n03Var.a) && Intrinsics.wireman(this.b, n03Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "TopicsSignal(topicsApiStatus=" + this.a + ", topics=" + this.b + ")";
    }

    public n03(Integer num, String str) {
        this.a = num;
        this.b = str;
    }
}
