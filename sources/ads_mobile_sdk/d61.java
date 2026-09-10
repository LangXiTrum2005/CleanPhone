package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d61 {
    public final String a;
    public final String b;

    public d61(String description, String muteUrl) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(muteUrl, "muteUrl");
        this.a = description;
        this.b = muteUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d61)) {
            return false;
        }
        d61 d61Var = (d61) obj;
        return Intrinsics.wireman(this.a, d61Var.a) && Intrinsics.wireman(this.b, d61Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InternalMuteThisAdReason(description=" + this.a + ", muteUrl=" + this.b + ")";
    }
}
