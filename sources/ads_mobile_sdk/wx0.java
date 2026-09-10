package ads_mobile_sdk;

import com.google.gson.JsonObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class wx0 {
    public final String a;
    public final String b;
    public final JsonObject c;
    public final String d;
    public final boolean e;

    public wx0(String str, String str2, JsonObject jsonObject, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = jsonObject;
        this.d = str3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wx0)) {
            return false;
        }
        wx0 wx0Var = (wx0) obj;
        return Intrinsics.wireman(this.a, wx0Var.a) && Intrinsics.wireman(this.b, wx0Var.b) && Intrinsics.wireman(this.c, wx0Var.c) && Intrinsics.wireman(this.d, wx0Var.d) && this.e == wx0Var.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        JsonObject jsonObject = this.c;
        int iHashCode3 = (iHashCode2 + (jsonObject == null ? 0 : jsonObject.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.e;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode4 + r1;
    }

    public final String toString() {
        return "InlineAd(html=" + this.a + ", baseUrl=" + this.b + ", adJson=" + this.c + ", adConfigKey=" + this.d + ", hasMultiAdConfigKey=" + this.e + ")";
    }
}
