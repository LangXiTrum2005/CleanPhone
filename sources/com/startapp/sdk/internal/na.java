package com.startapp.sdk.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.ActivityExtra;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.vungle.ads.internal.Constants;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class na extends o8 implements com.startapp.sdk.adsbase.f {
    public na(Context context, AdPreferences.Placement placement, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, lb lbVar5, lb lbVar6, lb lbVar7, lb lbVar8, lb lbVar9) {
        super(context, placement, lbVar, lbVar2, lbVar3, lbVar4, lbVar5, lbVar6, lbVar7, lbVar8, lbVar9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.io.Serializable, java.lang.Boolean[]] */
    @Override // com.startapp.sdk.adsbase.f
    public final boolean a(String str) {
        int i2;
        String strA = h0.a();
        if (b() && AdsCommonMetaData.k().F().a().equals(VideoConfig.BackMode.DISABLED) && strA.equals("back")) {
            setNotDisplayedReason(NotDisplayedReason.VIDEO_BACK);
            return false;
        }
        if (!i0.f.booleanValue()) {
            setState(Ad.AdState.UN_INITIALIZED);
        }
        if (a() == null) {
            setNotDisplayedReason(NotDisplayedReason.INTERNAL_ERROR);
            return false;
        }
        if (super.hasAdCacheTtlPassed()) {
            setNotDisplayedReason(NotDisplayedReason.AD_EXPIRED);
            return false;
        }
        ActivityExtra activityExtra = this.activityExtra;
        boolean z2 = activityExtra != null && activityExtra.a();
        Intent intent = new Intent(this.context, (Class<?>) OverlayActivity.class);
        intent.putExtra(com.ironsource.vc.c.f27493a, "exit.html");
        String[] strArr = this.f41302i;
        String strConcat = "&position=".concat(h0.a());
        for (int i3 = 0; i3 < strArr.length; i3++) {
            String str2 = strArr[i3];
            if (str2 != null && !"".equals(str2)) {
                strArr[i3] = android.support.v4.media.a.r(new StringBuilder(), strArr[i3], strConcat);
            }
        }
        synchronized (kh.class) {
            int i4 = kh.f41188a;
            i2 = i4 < Integer.MAX_VALUE ? i4 + 1 : 1;
            kh.f41188a = i2;
            HashMap map = kh.f41189b;
            if (map.containsKey(Integer.valueOf(i2))) {
                throw new IllegalStateException();
            }
            map.put(Integer.valueOf(i2), this);
        }
        intent.putExtra("tracking", strArr);
        intent.putExtra("trackingClickUrl", this.g);
        intent.putExtra("packageNames", this.f41297a);
        intent.putExtra("htmlUuid", this.f41298b);
        intent.putExtra("smartRedirect", this.f41301h);
        intent.putExtra("browserEnabled", this.f41305p);
        intent.putExtra("placement", this.placement.getIndex());
        intent.putExtra("adInfoOverride", getAdInfoOverride());
        intent.putExtra("ad", i2);
        intent.putExtra("videoAd", b());
        intent.putExtra(Constants.TEMPLATE_TYPE_FULLSCREEN, z2);
        int i5 = this.f41300e;
        if (i5 == 0) {
            i5 = this.context.getResources().getConfiguration().orientation;
        }
        intent.putExtra("orientation", i5);
        intent.putExtra("activityShouldLockOrientation", this.f);
        intent.putExtra("adTag", str);
        intent.putExtra("lastLoadTime", super.getLastLoadTime());
        intent.putExtra("adCacheTtl", super.getAdCacheTtl());
        intent.putExtra("closingUrl", this.f41304n);
        intent.putExtra("rewardDuration", this.f41303l);
        intent.putExtra("rewardedHideTimer", this.m);
        Long l2 = this.j;
        if (l2 != null) {
            intent.putExtra("delayImpressionSeconds", l2);
        }
        Long l3 = this.k;
        if (l3 != null) {
            intent.putExtra("delayCloseInterval", l3);
        }
        intent.putExtra("sendRedirectHops", (Serializable) this.o);
        intent.putExtra("position", strA);
        intent.addFlags(343932928);
        if (((h6) this.consentManager.a()).f41036e) {
            ((h6) this.consentManager.a()).d = intent;
            return true;
        }
        try {
            this.context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e2) {
            Log.e("StartAppSDK", "Failed to show Ad for placement " + this.placement, e2);
            ((p) this.adCacheManager.a()).a(this.placement);
            return false;
        } catch (Throwable th) {
            kh.a(i2, Object.class);
            g9.a(th);
            return false;
        }
    }

    public boolean b() {
        return false;
    }

    @Override // com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f
    public final Long getAdCacheTtl() {
        return super.getAdCacheTtl();
    }

    @Override // com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f
    public final Long getLastLoadTime() {
        return super.getLastLoadTime();
    }

    @Override // com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f
    public final boolean getVideoCancelCallBack() {
        return super.getVideoCancelCallBack();
    }

    @Override // com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f
    public final boolean hasAdCacheTtlPassed() {
        return super.hasAdCacheTtlPassed();
    }

    @Override // com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f
    public final void setVideoCancelCallBack(boolean z2) {
        super.setVideoCancelCallBack(z2);
    }
}
