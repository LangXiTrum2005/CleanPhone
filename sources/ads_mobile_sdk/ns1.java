package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ns1 {
    public final os1 a;

    public ns1(os1 networkPingStrategy) {
        Intrinsics.checkNotNullParameter(networkPingStrategy, "networkPingStrategy");
        this.a = networkPingStrategy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ns1) && Intrinsics.wireman(this.a, ((ns1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NetworkPingConfig(networkPingStrategy=" + this.a + ")";
    }
}
