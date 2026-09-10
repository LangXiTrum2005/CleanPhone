package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.licking;

/* JADX INFO: loaded from: classes.dex */
public final class ay1 {
    public final zx1 a;
    public final sz1 b;
    public final boolean c;
    public final String d;
    public final String e;

    public ay1(zx1 mediaType, sz1 videoEventsOwner, boolean z, String omidPartnerName, String omidHtml) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(videoEventsOwner, "videoEventsOwner");
        Intrinsics.checkNotNullParameter(omidPartnerName, "omidPartnerName");
        Intrinsics.checkNotNullParameter(omidHtml, "omidHtml");
        this.a = mediaType;
        this.b = videoEventsOwner;
        this.c = z;
        this.d = omidPartnerName;
        this.e = omidHtml;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay1)) {
            return false;
        }
        ay1 ay1Var = (ay1) obj;
        return this.a == ay1Var.a && this.b == ay1Var.b && this.c == ay1Var.c && Intrinsics.wireman(this.d, ay1Var.d) && Intrinsics.wireman(this.e, ay1Var.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        boolean z = this.c;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return this.e.hashCode() + licking.attabal(this.d, (iHashCode + r0) * 31, 31);
    }

    public final String toString() {
        return "OmidSettings(mediaType=" + this.a + ", videoEventsOwner=" + this.b + ", javascriptSessionServiceEnabled=" + this.c + ", omidPartnerName=" + this.d + ", omidHtml=" + this.e + ")";
    }
}
