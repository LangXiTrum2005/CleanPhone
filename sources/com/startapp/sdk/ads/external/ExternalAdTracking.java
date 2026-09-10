package com.startapp.sdk.ads.external;

import android.graphics.Point;
import android.support.v4.media.a;
import com.p004ironsource.d9;
import com.p004ironsource.dc;
import com.startapp.sdk.ads.external.config.ExternalAdConfig;
import com.startapp.sdk.ads.external.config.ExternalConfig;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.AbstractC3396g;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u001f\u0010\u0006R\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0006¨\u0006\""}, d2 = {"Lcom/startapp/sdk/ads/external/ExternalAdTracking;", "Lcom/startapp/sdk/adsbase/commontracking/TrackingParams;", "", JsonStorageKeyNames.SESSION_ID_KEY, "Ljava/lang/String;", "getSessionId", "()Ljava/lang/String;", "sioPrice", "getSioPrice", "mappedPrice", "getMappedPrice", "Lcom/startapp/sdk/adsbase/model/AdPreferences$Placement;", "placement", "Lcom/startapp/sdk/adsbase/model/AdPreferences$Placement;", "getPlacement", "()Lcom/startapp/sdk/adsbase/model/AdPreferences$Placement;", "requestTimeStamp", "getRequestTimeStamp", "", "videoMode", "Ljava/lang/Boolean;", "getVideoMode", "()Ljava/lang/Boolean;", "video", "getVideo", "Landroid/graphics/Point;", "size", "Landroid/graphics/Point;", "getSize", "()Landroid/graphics/Point;", "newAdType", "getNewAdType", "dparam", "getDparam", "sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExternalAdTracking extends TrackingParams {
    private static final long serialVersionUID = 8119468204117511007L;
    private final String dparam;
    private final String mappedPrice;
    private final String newAdType;
    private final AdPreferences.Placement placement;
    private final String requestTimeStamp;
    private final String sessionId;
    private final String sioPrice;
    private final Point size;
    private final String video;
    private final Boolean videoMode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalAdTracking(String sessionId, String str, String str2, String str3, AdPreferences.Placement placement, String str4, Boolean bool, String str5, Point point, String str6) {
        ExternalAdConfig googleads;
        super(str);
        Intrinsics.f(sessionId, "sessionId");
        this.sessionId = sessionId;
        this.sioPrice = str2;
        this.mappedPrice = str3;
        this.placement = placement;
        this.requestTimeStamp = str4;
        this.videoMode = bool;
        this.video = str5;
        this.size = point;
        this.newAdType = str6;
        ExternalConfig externalConfigU = MetaData.E().u();
        this.dparam = (externalConfigU == null || (googleads = externalConfigU.getGoogleads()) == null) ? null : googleads.getDparam();
    }

    @Override // com.startapp.sdk.adsbase.commontracking.TrackingParams
    public final String e() {
        String strE = super.e();
        Intrinsics.e(strE, "getQueryString(...)");
        if (!StringsKt.l(strE, "?", false) || !StringsKt.M(strE, "?", false)) {
            if (StringsKt.l(strE, d9.i.f24749c, false) && StringsKt.M(strE, d9.i.f24749c, false)) {
                strE = strE.substring(1);
                Intrinsics.e(strE, "substring(...)");
            }
            strE = "?".concat(strE);
        }
        StringBuilder sbX = a.x(strE, "&sessionId=");
        sbX.append(this.sessionId);
        sbX.append('&');
        sbX.append(AbstractC3396g.f40988b);
        sbX.append(dc.T);
        sbX.append(AbstractC3396g.a());
        String string = sbX.toString();
        String str = this.dparam;
        if (str != null) {
            string = a.D(string, "&d=", str);
        }
        String str2 = this.sioPrice;
        if (str2 != null) {
            string = a.D(a.D(string, "&supplyBidFloor=", str2), "&bidPrice=", str2);
        }
        String str3 = this.mappedPrice;
        if (str3 != null) {
            string = a.D(a.D(a.D(string, "&originalPrice=", str3), "&price=", str3), "&cpmPred=", str3);
        }
        AdPreferences.Placement placement = this.placement;
        if (placement != null) {
            StringBuilder sbX2 = a.x(string, "&placement=");
            sbX2.append(placement.name());
            string = sbX2.toString();
        }
        String str4 = this.requestTimeStamp;
        if (str4 != null) {
            string = a.D(string, "&requestTs=", str4);
        }
        Boolean bool = this.videoMode;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            StringBuilder sbX3 = a.x(string, "&videoMode=");
            sbX3.append(zBooleanValue ? "REWARDED" : "INTERSTITIAL");
            string = sbX3.toString();
        }
        String str5 = this.video;
        if (str5 != null) {
            string = a.D(string, "&video=", str5);
        }
        Point point = this.size;
        if (point != null) {
            StringBuilder sbX4 = a.x(string, "&formatWidth=");
            sbX4.append(point.x);
            sbX4.append("&formatHeight=");
            sbX4.append(point.y);
            string = sbX4.toString();
        }
        String str6 = this.newAdType;
        return str6 != null ? a.D(string, "&newAdType=", str6) : string;
    }
}
