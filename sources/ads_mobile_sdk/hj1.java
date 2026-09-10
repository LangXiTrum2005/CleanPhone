package ads_mobile_sdk;

import android.os.Bundle;
import android.view.View;
import com.google.android.libraries.ads.mobile.sdk.common.AdChoicesPlacement;
import com.unity3d.services.UnityAdsConstants;
import complexometry.adultoid;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.walach;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.moveable;

/* JADX INFO: loaded from: classes.dex */
public final class hj1 {
    public int a;
    public fj1 b;
    public String c;
    public final Map d;
    public Double e;
    public g61 f;
    public g61 g;
    public b41 h;
    public final Map i;
    public gq0 j;
    public View k;
    public er0 l;
    public adultoid m;
    public ay1 n;
    public walach o;
    public final List p;
    public d61 q;
    public Bundle r;
    public float s;
    public View t;
    public AdChoicesPlacement u;
    public String v;

    public /* synthetic */ hj1() {
        this(-1, null, null, new LinkedHashMap(), null, null, null, null, new LinkedHashMap(), null, null, null, null, null, null, new ArrayList(), null, new Bundle(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj1)) {
            return false;
        }
        hj1 hj1Var = (hj1) obj;
        return this.a == hj1Var.a && this.b == hj1Var.b && Intrinsics.wireman(this.c, hj1Var.c) && Intrinsics.wireman(this.d, hj1Var.d) && Intrinsics.wireman(this.e, hj1Var.e) && Intrinsics.wireman(this.f, hj1Var.f) && Intrinsics.wireman(this.g, hj1Var.g) && Intrinsics.wireman(this.h, hj1Var.h) && Intrinsics.wireman(this.i, hj1Var.i) && Intrinsics.wireman(this.j, hj1Var.j) && Intrinsics.wireman(this.k, hj1Var.k) && Intrinsics.wireman(this.l, hj1Var.l) && Intrinsics.wireman(this.m, hj1Var.m) && Intrinsics.wireman(this.n, hj1Var.n) && Intrinsics.wireman(this.o, hj1Var.o) && Intrinsics.wireman(this.p, hj1Var.p) && Intrinsics.wireman(this.q, hj1Var.q) && Intrinsics.wireman(this.r, hj1Var.r) && Float.compare(this.s, hj1Var.s) == 0 && Intrinsics.wireman(this.t, hj1Var.t) && this.u == hj1Var.u && Intrinsics.wireman(this.v, hj1Var.v);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        fj1 fj1Var = this.b;
        int iHashCode2 = (iHashCode + (fj1Var == null ? 0 : fj1Var.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (this.d.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Double d = this.e;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        g61 g61Var = this.f;
        int iHashCode5 = (iHashCode4 + (g61Var == null ? 0 : g61Var.hashCode())) * 31;
        g61 g61Var2 = this.g;
        int iHashCode6 = (iHashCode5 + (g61Var2 == null ? 0 : g61Var2.hashCode())) * 31;
        b41 b41Var = this.h;
        int iHashCode7 = (this.i.hashCode() + ((iHashCode6 + (b41Var == null ? 0 : b41Var.hashCode())) * 31)) * 31;
        gq0 gq0Var = this.j;
        int iHashCode8 = (iHashCode7 + (gq0Var == null ? 0 : gq0Var.hashCode())) * 31;
        View view = this.k;
        int iHashCode9 = (iHashCode8 + (view == null ? 0 : view.hashCode())) * 31;
        er0 er0Var = this.l;
        int iHashCode10 = (iHashCode9 + (er0Var == null ? 0 : er0Var.hashCode())) * 31;
        adultoid adultoidVar = this.m;
        int iHashCode11 = (iHashCode10 + (adultoidVar == null ? 0 : adultoidVar.hashCode())) * 31;
        ay1 ay1Var = this.n;
        int iHashCode12 = (iHashCode11 + (ay1Var == null ? 0 : ay1Var.hashCode())) * 31;
        walach walachVar = this.o;
        int iAttabal = moveable.attabal(this.p, (iHashCode12 + (walachVar == null ? 0 : walachVar.hashCode())) * 31, 31);
        d61 d61Var = this.q;
        int iHashCode13 = (Float.hashCode(this.s) + ((this.r.hashCode() + ((iAttabal + (d61Var == null ? 0 : d61Var.hashCode())) * 31)) * 31)) * 31;
        View view2 = this.t;
        int iHashCode14 = (iHashCode13 + (view2 == null ? 0 : view2.hashCode())) * 31;
        AdChoicesPlacement adChoicesPlacement = this.u;
        int iHashCode15 = (iHashCode14 + (adChoicesPlacement == null ? 0 : adChoicesPlacement.hashCode())) * 31;
        String str2 = this.v;
        return iHashCode15 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "NativeAdAssets(templateId=" + this.a + ", nativeAdType=" + this.b + ", customTemplateId=" + this.c + ", stringAssets=" + this.d + ", starRating=" + this.e + ", image=" + this.f + ", icon=" + this.g + ", attributionInfo=" + this.h + ", customImageAssets=" + this.i + ", mediaWebView=" + this.j + ", mediaView=" + this.k + ", gmaWebViewVideoController=" + this.l + ", videoController=" + this.m + ", omidSettings=" + this.n + ", omidDisplayWebView=" + this.o + ", muteThisAdReasons=" + this.p + ", defaultMuteThisAdReason=" + this.q + ", extras=" + this.r + ", mediaContentAspectRatio=" + this.s + ", adChoicesContent=" + this.t + ", pubProvidedAttributionInfoPlacement=" + this.u + ", watermark=" + this.v + ")";
    }

    public hj1(int i, fj1 fj1Var, String str, Map stringAssets, Double d, g61 g61Var, g61 g61Var2, b41 b41Var, Map customImageAssets, gq0 gq0Var, View view, er0 er0Var, adultoid adultoidVar, ay1 ay1Var, walach walachVar, List muteThisAdReasons, d61 d61Var, Bundle extras, float f, View view2, AdChoicesPlacement adChoicesPlacement, String str2) {
        Intrinsics.checkNotNullParameter(stringAssets, "stringAssets");
        Intrinsics.checkNotNullParameter(customImageAssets, "customImageAssets");
        Intrinsics.checkNotNullParameter(muteThisAdReasons, "muteThisAdReasons");
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.a = i;
        this.b = fj1Var;
        this.c = str;
        this.d = stringAssets;
        this.e = d;
        this.f = g61Var;
        this.g = g61Var2;
        this.h = b41Var;
        this.i = customImageAssets;
        this.j = gq0Var;
        this.k = view;
        this.l = er0Var;
        this.m = adultoidVar;
        this.n = ay1Var;
        this.o = walachVar;
        this.p = muteThisAdReasons;
        this.q = d61Var;
        this.r = extras;
        this.s = f;
        this.t = view2;
        this.u = adChoicesPlacement;
        this.v = str2;
    }
}
