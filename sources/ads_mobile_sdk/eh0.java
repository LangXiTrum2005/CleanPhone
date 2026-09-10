package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class eh0 {
    public final String a;
    public final String b;
    public final String c;

    public eh0(String str, String str2, String firebaseAdEventId) {
        Intrinsics.checkNotNullParameter(firebaseAdEventId, "firebaseAdEventId");
        this.a = str;
        this.b = str2;
        this.c = firebaseAdEventId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh0)) {
            return false;
        }
        eh0 eh0Var = (eh0) obj;
        return Intrinsics.wireman(this.a, eh0Var.a) && Intrinsics.wireman(this.b, eh0Var.b) && Intrinsics.wireman(this.c, eh0Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "FirebaseAnalyticsIds(firebaseAppId=" + this.a + ", firebaseAppInstanceId=" + this.b + ", firebaseAdEventId=" + this.c + ")";
    }
}
