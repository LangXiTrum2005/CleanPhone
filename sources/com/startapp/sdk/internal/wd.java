package com.startapp.sdk.internal;

import android.content.Context;
import android.content.Intent;
import com.startapp.sdk.ads.list3d.List3DActivity;
import com.startapp.sdk.adsbase.ActivityExtra;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.vungle.ads.internal.Constants;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public final class wd extends gb implements com.startapp.sdk.adsbase.f {
    public static String d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb f41633c;

    public wd(Context context, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, lb lbVar5, lb lbVar6, lb lbVar7, lb lbVar8, lb lbVar9, lb lbVar10) {
        super(context, AdPreferences.Placement.INAPP_OFFER_WALL, lbVar, lbVar2, lbVar3, lbVar4, lbVar5, lbVar6, lbVar7, lbVar8, lbVar9);
        this.f41632b = UUID.randomUUID().toString();
        this.f41633c = lbVar10;
        if (d == null) {
            d = vi.a(context);
        }
    }

    @Override // com.startapp.sdk.adsbase.f
    public final boolean a(String str) {
        ((vb) this.f41633c.a()).a(this.f41632b).f41543c = "&position=".concat(h0.a());
        ActivityExtra activityExtra = this.activityExtra;
        boolean z2 = activityExtra != null && activityExtra.a();
        if (super.hasAdCacheTtlPassed()) {
            setNotDisplayedReason(NotDisplayedReason.AD_EXPIRED);
            return false;
        }
        Intent intent = new Intent(this.context, (Class<?>) List3DActivity.class);
        intent.putExtra("adInfoOverride", getAdInfoOverride());
        intent.putExtra(Constants.TEMPLATE_TYPE_FULLSCREEN, z2);
        intent.putExtra("adTag", str);
        intent.putExtra("lastLoadTime", super.getLastLoadTime());
        intent.putExtra("adCacheTtl", super.getAdCacheTtl());
        intent.putExtra("position", h0.a());
        intent.putExtra("listModelUuid", this.f41632b);
        intent.addFlags(343932928);
        try {
            this.context.startActivity(intent);
            if (!i0.f.booleanValue()) {
                setState(Ad.AdState.UN_INITIALIZED);
            }
            return true;
        } catch (Throwable th) {
            g9.a(th);
            return false;
        }
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final b2 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        return new f8(this.context, this, adPreferences, adEventListener, this.httpClient, this.networkApiExecutor, this.eventTracer, this.motionProcessor, this.f41633c);
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
