package ads_mobile_sdk;

import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.licking;
import saneness.vocationalize;

/* JADX INFO: loaded from: classes.dex */
public final class xm {
    public static final vocationalize h = new vocationalize();
    public final List a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public String f;
    public final List g;

    public xm(List list, String str, String str2, boolean z, String url, String str3, List list2) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = url;
        this.f = str3;
        this.g = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm)) {
            return false;
        }
        xm xmVar = (xm) obj;
        return Intrinsics.wireman(this.a, xmVar.a) && Intrinsics.wireman(this.b, xmVar.b) && Intrinsics.wireman(this.c, xmVar.c) && this.d == xmVar.d && Intrinsics.wireman(this.e, xmVar.e) && Intrinsics.wireman(this.f, xmVar.f) && Intrinsics.wireman(this.g, xmVar.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    public final int hashCode() {
        List list = this.a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.d;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        int iAttabal = licking.attabal(this.e, (iHashCode3 + r3) * 31, 31);
        String str3 = this.f;
        int iHashCode4 = (iAttabal + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list2 = this.g;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "BuildAdUrlResult(errors=" + this.a + ", baseUri=" + this.b + ", postParameters=" + this.c + ", includeCookies=" + this.d + ", url=" + this.e + ", queryWithFlattenedBlobParams=" + this.f + ", csrbErrors=" + this.g + ")";
    }
}
