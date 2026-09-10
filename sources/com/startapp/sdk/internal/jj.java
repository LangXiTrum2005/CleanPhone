package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.json.JsonParser;
import com.startapp.sdk.ads.video.VideoAdDetails;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* JADX INFO: loaded from: classes6.dex */
public final class jj extends na {
    public VideoAdDetails r;

    public jj(Context context, AdPreferences.Placement placement, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, lb lbVar5, lb lbVar6, lb lbVar7, lb lbVar8, lb lbVar9) {
        super(context, placement, lbVar, lbVar2, lbVar3, lbVar4, lbVar5, lbVar6, lbVar7, lbVar8, lbVar9);
    }

    @Override // com.startapp.sdk.internal.na
    public final boolean b() {
        return this.r != null;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final b2 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        return str == null ? new l8(this.context, this, adPreferences, adEventListener, this.placement, this.adCacheManager, this.videoAdCacheManager, this.webViewFactory, this.httpClient, this.networkApiExecutor, this.eventTracer, this.motionProcessor, this.webViewCacheLoader) : new k8(this.context, this, adEventListener, this.webViewFactory, this.networkApiExecutor, this.eventTracer, this.webViewCacheLoader, str, this.httpClient);
    }

    @Override // com.startapp.sdk.internal.o8
    public final void d(String str) {
        super.d(str);
        String strA = vi.a(str, "@videoJson@", "@videoJson@");
        if (strA != null) {
            VideoAdDetails videoAdDetails = (VideoAdDetails) JsonParser.fromJson(strA, VideoAdDetails.class);
            this.r = videoAdDetails;
            if (videoAdDetails != null) {
                videoAdDetails.setup();
            }
        }
    }
}
