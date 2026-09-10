package com.startapp.sdk.internal;

import com.startapp.sdk.ads.external.config.ExternalAdConfig;
import com.startapp.sdk.ads.external.config.ExternalConfig;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest$VideoRequestMode;
import com.startapp.sdk.adsbase.model.GetAdRequest$VideoRequestType;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f9 extends com.startapp.sdk.adsbase.model.a {
    public boolean V0;
    public boolean W0;
    public String X0;
    public String Y0;
    public String Z0;
    public int a1;
    public Integer b1;
    public String c1;

    public f9() {
        ExternalAdConfig googleads;
        ExternalConfig externalConfigU = MetaData.E().u();
        if (externalConfigU != null && (googleads = externalConfigU.getGoogleads()) != null) {
            googleads.getDparam();
        }
        this.b1 = 0;
    }

    @Override // com.startapp.sdk.adsbase.model.a, com.startapp.sdk.internal.z1
    public final void a(ve requestParamsHolder) {
        Intrinsics.f(requestParamsHolder, "requestParamsHolder");
        super.a(requestParamsHolder);
        requestParamsHolder.a("googleAd", Boolean.TRUE, true, true);
        requestParamsHolder.a("served", Boolean.valueOf(this.W0), true, true);
        requestParamsHolder.a(JsonStorageKeyNames.SESSION_ID_KEY, this.X0, false, true);
        requestParamsHolder.a("requestTs", this.Z0, false, true);
        if (this.j0 == AdPreferences.Placement.INAPP_BANNER) {
            Integer num = this.b1;
            requestParamsHolder.a("bnrt", Integer.valueOf(num != null ? num.intValue() : 0), false, true);
            requestParamsHolder.a("fixedSize", Boolean.FALSE, false, true);
            requestParamsHolder.a("type", 1, false, true);
        } else {
            requestParamsHolder.a("video", this.V0 ? GetAdRequest$VideoRequestType.FORCED : GetAdRequest$VideoRequestType.ENABLED, false, true);
            requestParamsHolder.a("videoMode", this.V0 ? GetAdRequest$VideoRequestMode.REWARDED : GetAdRequest$VideoRequestMode.INTERSTITIAL, false, true);
            requestParamsHolder.a("type", Integer.valueOf(this.V0 ? 11 : 4), false, true);
        }
        requestParamsHolder.a("price", this.Y0, false, true);
        requestParamsHolder.a("bidPrice", this.c1, false, true);
        requestParamsHolder.a("reason", Integer.valueOf(this.a1), false, true);
    }
}
