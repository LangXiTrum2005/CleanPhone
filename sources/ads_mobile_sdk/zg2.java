package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class zg2 implements scarbroite.attabal {
    public final int a;
    public final String b;

    public zg2(String type, int i) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.a = i;
        this.b = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zg2)) {
            return false;
        }
        zg2 zg2Var = (zg2) obj;
        return this.a == zg2Var.a && Intrinsics.wireman(this.b, zg2Var.b);
    }

    @Override // scarbroite.attabal
    public final int getAmount() {
        return this.a;
    }

    @Override // scarbroite.attabal
    public final String getType() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "RewardItemImpl(amount=" + this.a + ", type=" + this.b + ")";
    }
}
