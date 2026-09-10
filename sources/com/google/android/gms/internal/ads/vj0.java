package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzds;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vj0 extends zzds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f21183a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f21184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f21185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oj0 f21186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fe1 f21187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public lj0 f21188f;

    public vj0(Context context, WeakReference weakReference, oj0 oj0Var, fe1 fe1Var) {
        this.f21184b = context;
        this.f21185c = weakReference;
        this.f21186d = oj0Var;
        this.f21187e = fe1Var;
    }

    public static String B1(Object obj) {
        ResponseInfo responseInfo;
        zzdx zzdxVarZzd;
        if (obj instanceof LoadAdError) {
            responseInfo = ((LoadAdError) obj).getResponseInfo();
        } else if (obj instanceof AppOpenAd) {
            responseInfo = ((AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof InterstitialAd) {
            responseInfo = ((InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedAd) {
            responseInfo = ((RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfo = ((RewardedInterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof AdView) {
            responseInfo = ((AdView) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return "";
            }
            responseInfo = ((NativeAd) obj).getResponseInfo();
        }
        if (responseInfo == null || (zzdxVarZzd = responseInfo.zzd()) == null) {
            return "";
        }
        try {
            return zzdxVarZzd.zzj();
        } catch (RemoteException unused) {
            return "";
        }
    }

    public final Context A1() {
        Context context = (Context) this.f21185c.get();
        return context == null ? this.f21184b : context;
    }

    public final synchronized void x1(Object obj, String str) {
        this.f21183a.put(str, obj);
        y1(B1(obj));
    }

    public final synchronized void y1(String str) {
        try {
            m00 m00VarD = this.f21188f.d(str);
            b21 b21Var = new b21(this, 21);
            m00VarD.addListener(new zd1(0, m00VarD, b21Var), this.f21187e);
        } catch (NullPointerException e10) {
            zzt.zzh().d("OutOfContextTester.setAdAsOutOfContext", e10);
            this.f21186d.b();
        }
    }

    public final synchronized void z1(String str) {
        try {
            m00 m00VarD = this.f21188f.d(str);
            vf vfVar = new vf(this, 22);
            m00VarD.addListener(new zd1(0, m00VarD, vfVar), this.f21187e);
        } catch (NullPointerException e10) {
            zzt.zzh().d("OutOfContextTester.setAdAsShown", e10);
            this.f21186d.b();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zze(String str, s9.a aVar, s9.a aVar2) {
        Context context = (Context) s9.b.y1(aVar);
        ViewGroup viewGroup = (ViewGroup) s9.b.y1(aVar2);
        if (context == null || viewGroup == null) {
            return;
        }
        HashMap map = this.f21183a;
        Object obj = map.get(str);
        if (obj != null) {
            map.remove(str);
        }
        if (obj instanceof AdView) {
            AdView adView = (AdView) obj;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setTag(TtmlNode.TAG_LAYOUT);
            wj0.b(linearLayout, -1, -1);
            linearLayout.setGravity(17);
            linearLayout.addView(adView);
            adView.setTag("ad_view");
            viewGroup.addView(linearLayout);
            return;
        }
        if (obj instanceof NativeAd) {
            NativeAd nativeAd = (NativeAd) obj;
            NativeAdView nativeAdView = new NativeAdView(context);
            nativeAdView.setTag("ad_view_tag");
            wj0.b(nativeAdView, -1, -1);
            viewGroup.addView(nativeAdView);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setTag("layout_tag");
            linearLayout2.setOrientation(1);
            wj0.b(linearLayout2, -1, -1);
            linearLayout2.setBackgroundColor(-1);
            nativeAdView.addView(linearLayout2);
            Resources resourcesC = zzt.zzh().c();
            linearLayout2.addView(wj0.a(context, resourcesC == null ? "Headline" : resourcesC.getString(R.string.native_headline), android.R.style.TextAppearance.Small, -9210245, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, "headline_header_tag"));
            String headline = nativeAd.getHeadline();
            if (headline == null) {
                headline = "";
            }
            View viewA = wj0.a(context, headline, android.R.style.TextAppearance.Medium, -16777216, 12.0f, "headline_tag");
            nativeAdView.setHeadlineView(viewA);
            linearLayout2.addView(viewA);
            linearLayout2.addView(wj0.a(context, resourcesC == null ? "Body" : resourcesC.getString(R.string.native_body), android.R.style.TextAppearance.Small, -9210245, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, "body_header_tag"));
            String body = nativeAd.getBody();
            if (body == null) {
                body = "";
            }
            View viewA2 = wj0.a(context, body, android.R.style.TextAppearance.Medium, -16777216, 12.0f, "body_tag");
            nativeAdView.setBodyView(viewA2);
            linearLayout2.addView(viewA2);
            linearLayout2.addView(wj0.a(context, resourcesC == null ? "Media View" : resourcesC.getString(R.string.native_media_view), android.R.style.TextAppearance.Small, -9210245, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, "media_view_header_tag"));
            MediaView mediaView = new MediaView(context);
            mediaView.setTag("media_view_tag");
            nativeAdView.setMediaView(mediaView);
            linearLayout2.addView(mediaView);
            nativeAdView.setNativeAd(nativeAd);
        }
    }
}
