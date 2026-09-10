package ads_mobile_sdk;

import android.widget.ImageView;
import com.google.android.libraries.ads.mobile.sdk.common.AdChoicesPlacement;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import complexometry.competently;
import complexometry.dovishness;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.licking;

/* JADX INFO: loaded from: classes.dex */
public final class pz1 {
    public final String a;
    public final yf2 b;
    public final AdChoicesPlacement c;
    public final competently d;
    public final liquory.attabal e;
    public final boolean f;
    public final List g;
    public final boolean h;
    public final NativeAd.NativeMediaAspectRatio i;
    public final scarbroite.saneness j;
    public final dovishness k;
    public final String l;
    public final boolean m;
    public final ImageView.ScaleType n;
    public final int o;

    public pz1(String adUnitId, yf2 format, AdChoicesPlacement adChoicesPosition, competently competentlyVar, liquory.attabal adSize, boolean z, List list, boolean z2, NativeAd.NativeMediaAspectRatio mediaAspectRatio, scarbroite.saneness sanenessVar, dovishness dovishnessVar, String bannerPosition, boolean z3, ImageView.ScaleType imageScaleType, int i) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(adChoicesPosition, "adChoicesPosition");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        Intrinsics.checkNotNullParameter(mediaAspectRatio, "mediaAspectRatio");
        Intrinsics.checkNotNullParameter(bannerPosition, "bannerPosition");
        Intrinsics.checkNotNullParameter(imageScaleType, "imageScaleType");
        this.a = adUnitId;
        this.b = format;
        this.c = adChoicesPosition;
        this.d = competentlyVar;
        this.e = adSize;
        this.f = z;
        this.g = list;
        this.h = z2;
        this.i = mediaAspectRatio;
        this.j = sanenessVar;
        this.k = dovishnessVar;
        this.l = bannerPosition;
        this.m = z3;
        this.n = imageScaleType;
        this.o = i;
    }

    public final String a() {
        return this.a;
    }

    public final scarbroite.saneness b() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz1)) {
            return false;
        }
        pz1 pz1Var = (pz1) obj;
        return Intrinsics.wireman(this.a, pz1Var.a) && this.b == pz1Var.b && this.c == pz1Var.c && Intrinsics.wireman(this.d, pz1Var.d) && Intrinsics.wireman(this.e, pz1Var.e) && this.f == pz1Var.f && Intrinsics.wireman(this.g, pz1Var.g) && this.h == pz1Var.h && this.i == pz1Var.i && Intrinsics.wireman(this.j, pz1Var.j) && Intrinsics.wireman(this.k, pz1Var.k) && Intrinsics.wireman(this.l, pz1Var.l) && this.m == pz1Var.m && this.n == pz1Var.n && this.o == pz1Var.o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v25, types: [int] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        competently competentlyVar = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (competentlyVar == null ? 0 : competentlyVar.hashCode())) * 31)) * 31;
        boolean z = this.f;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = (iHashCode2 + r0) * 31;
        List list = this.g;
        int iHashCode3 = (i + (list == null ? 0 : list.hashCode())) * 31;
        boolean z2 = this.h;
        ?? r1 = z2;
        if (z2) {
            r1 = 1;
        }
        int iHashCode4 = (this.i.hashCode() + ((iHashCode3 + r1) * 31)) * 31;
        scarbroite.saneness sanenessVar = this.j;
        int iHashCode5 = (iHashCode4 + (sanenessVar == null ? 0 : sanenessVar.hashCode())) * 31;
        dovishness dovishnessVar = this.k;
        int iAttabal = licking.attabal(this.l, (iHashCode5 + (dovishnessVar != null ? dovishnessVar.hashCode() : 0)) * 31, 31);
        boolean z3 = this.m;
        return Integer.hashCode(this.o) + ((this.n.hashCode() + ((iAttabal + (z3 ? 1 : z3)) * 31)) * 31);
    }

    public final String toString() {
        return "OutOfContextTestingConfiguration(adUnitId=" + this.a + ", format=" + this.b + ", adChoicesPosition=" + this.c + ", adRequest=" + this.d + ", adSize=" + this.e + ", customMuteThisAd=" + this.f + ", customNativeTemplates=" + this.g + ", isImageLoadingDisabled=" + this.h + ", mediaAspectRatio=" + this.i + ", serverSideVerificationOptions=" + this.j + ", videoOptions=" + this.k + ", bannerPosition=" + this.l + ", isImmersiveMode=" + this.m + ", imageScaleType=" + this.n + ", widthConstraint=" + this.o + ")";
    }
}
