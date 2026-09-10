package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hv0 {
    public final Integer a;
    public final Integer b;
    public final Integer c;

    public hv0(Integer num, Integer num2, Integer num3) {
        this.a = num;
        this.b = num2;
        this.c = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv0)) {
            return false;
        }
        hv0 hv0Var = (hv0) obj;
        return Intrinsics.wireman(this.a, hv0Var.a) && Intrinsics.wireman(this.b, hv0Var.b) && Intrinsics.wireman(this.c, hv0Var.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "ImpressionSequences(impressionSequence=" + this.a + ", formatImpressionSequence=" + this.b + ", slotFormatImpressionSequence=" + this.c + ")";
    }
}
