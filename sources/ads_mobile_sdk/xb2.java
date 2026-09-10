package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.licking;

/* JADX INFO: loaded from: classes.dex */
public final class xb2 {
    public String a;
    public String b;
    public yf2 c;
    public String d;
    public String e;

    public /* synthetic */ xb2() {
        this("", "", yf2.d, "", "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb2)) {
            return false;
        }
        xb2 xb2Var = (xb2) obj;
        return Intrinsics.wireman(this.a, xb2Var.a) && Intrinsics.wireman(this.b, xb2Var.b) && this.c == xb2Var.c && Intrinsics.wireman(this.d, xb2Var.d) && Intrinsics.wireman(this.e, xb2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + licking.attabal(this.d, (this.c.hashCode() + licking.attabal(this.b, this.a.hashCode() * 31, 31)) * 31, 31);
    }

    public final String toString() {
        return "PublisherRequestTraceMeta(publisherRequestId=" + this.a + ", adUnitId=" + this.b + ", publisherRequestType=" + this.c + ", signalGenerationRequestId=" + this.d + ", preloadId=" + this.e + ")";
    }

    public xb2(String publisherRequestId, String adUnitId, yf2 publisherRequestType, String signalGenerationRequestId, String preloadId) {
        Intrinsics.checkNotNullParameter(publisherRequestId, "publisherRequestId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(publisherRequestType, "publisherRequestType");
        Intrinsics.checkNotNullParameter(signalGenerationRequestId, "signalGenerationRequestId");
        Intrinsics.checkNotNullParameter(preloadId, "preloadId");
        this.a = publisherRequestId;
        this.b = adUnitId;
        this.c = publisherRequestType;
        this.d = signalGenerationRequestId;
        this.e = preloadId;
    }
}
