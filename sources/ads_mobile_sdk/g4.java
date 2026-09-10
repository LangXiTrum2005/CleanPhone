package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.common.RequestConfiguration;
import com.ironsource.X3;
import complexometry.formularize;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.bonny;
import saneness.eliminate;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class g4 implements eliminate {
    public final formularize a;
    public final long b;
    public final RequestConfiguration.TagForChildDirectedTreatment c;
    public final RequestConfiguration.TagForUnderAgeOfConsent d;
    public final RequestConfiguration.MaxAdContentRating e;
    public final boolean f;
    public final yf2 g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final jk0 k;
    public final long l;
    public final boolean m;

    public g4(formularize adRequest, long j, RequestConfiguration.TagForChildDirectedTreatment tfcd, RequestConfiguration.TagForUnderAgeOfConsent tfuac, RequestConfiguration.MaxAdContentRating maxAdContentRating, boolean z, yf2 requestType, int i, boolean z2, boolean z3, jk0 flags, long j2, boolean z4) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(tfcd, "tfcd");
        Intrinsics.checkNotNullParameter(tfuac, "tfuac");
        Intrinsics.checkNotNullParameter(maxAdContentRating, "maxAdContentRating");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.a = adRequest;
        this.b = j;
        this.c = tfcd;
        this.d = tfuac;
        this.e = maxAdContentRating;
        this.f = z;
        this.g = requestType;
        this.h = i;
        this.i = z2;
        this.j = z3;
        this.k = flags;
        this.l = j2;
        this.m = z4;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.requestTimeMilliseconds = this.b;
        signals.adUnitId = this.a.getAdUnitId();
        signals.contentUrl = this.a.getContentUrl();
        if (!this.a.monoploid().isEmpty() || !this.a.kowloon().isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(this.a.monoploid());
            if (!this.a.kowloon().isEmpty()) {
                linkedHashMap.put("excl_cat", CollectionsKt.preterite(this.a.kowloon(), ",", null, null, 0, null, null, 62, null));
            }
            signals.customTargeting = linkedHashMap;
        }
        signals.googleExtrasBundle = this.a.getGoogleExtrasBundle();
        if (!this.a.molybdenite().isEmpty()) {
            signals.keywords = new ArrayList<>(this.a.molybdenite());
        }
        if (!this.a.graveside().isEmpty()) {
            signals.neighboringContentUrls = CollectionsKt.prefect(this.a.graveside());
        }
        signals.publisherProvidedId = this.a.getPublisherProvidedId();
        signals.requestAgent = this.a.getRequestAgent();
        signals.tagForChildDirectedTreatment = this.c.getValue() == 1 ? 1 : 0;
        signals.tagForUnderAgeOfConsent = this.d.getValue() == 1 ? 1 : 0;
        if (this.e.getValue().length() > 0) {
            signals.maxAdContentRating = this.e.getValue();
        }
        signals.isTestRequest = this.f;
        signals.publisherPrivacyPersonalizationState = Integer.valueOf(this.h);
        yf2 yf2Var = this.g;
        if (yf2Var == yf2.j) {
            signals.isRewarded = Boolean.TRUE;
        }
        if (yf2Var == yf2.k) {
            signals.isRewardedInterstitial = Boolean.TRUE;
        }
        signals.manualImpressionsEnabled = this.i;
        if (this.j) {
            signals.isPrefetchRequest = Boolean.TRUE;
        }
        jk0 jk0Var = this.k;
        jk0Var.getClass();
        Intrinsics.checkNotNullParameter("gads:enable_time_since_sdk_init:enabled", X3.i.W);
        if (((Boolean) jk0Var.a("gads:enable_time_since_sdk_init:enabled", Boolean.FALSE, zk.b)).booleanValue()) {
            signals.saneness(Long.valueOf(this.l));
        }
        if (this.m) {
            signals.wireman();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4)) {
            return false;
        }
        g4 g4Var = (g4) obj;
        return Intrinsics.wireman(this.a, g4Var.a) && this.b == g4Var.b && this.c == g4Var.c && this.d == g4Var.d && this.e == g4Var.e && this.f == g4Var.f && this.g == g4Var.g && this.h == g4Var.h && this.i == g4Var.i && this.j == g4Var.j && Intrinsics.wireman(this.k, g4Var.k) && this.l == g4Var.l && this.m == g4Var.m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17, types: [int] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((Long.hashCode(this.b) + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        boolean z = this.f;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int iAttabal = bonny.attabal(this.h, (this.g.hashCode() + ((iHashCode + r2) * 31)) * 31, 31);
        boolean z2 = this.i;
        ?? r3 = z2;
        if (z2) {
            r3 = 1;
        }
        int i = (iAttabal + r3) * 31;
        boolean z3 = this.j;
        ?? r4 = z3;
        if (z3) {
            r4 = 1;
        }
        int iHashCode2 = (Long.hashCode(this.l) + ((this.k.hashCode() + ((i + r4) * 31)) * 31)) * 31;
        boolean z4 = this.m;
        return iHashCode2 + (z4 ? 1 : z4);
    }

    public final String toString() {
        return "AdRequestSignal(adRequest=" + this.a + ", timestamp=" + this.b + ", tfcd=" + this.c + ", tfuac=" + this.d + ", maxAdContentRating=" + this.e + ", isTestRequest=" + this.f + ", requestType=" + this.g + ", publisherPrivacyPersonalizationState=" + this.h + ", manualImpressionsRequested=" + this.i + ", isPrefetchRequest=" + this.j + ", flags=" + this.k + ", timeSinceSdkInitMs=" + this.l + ", isS2SRecursiveRequest=" + this.m + ")";
    }
}
