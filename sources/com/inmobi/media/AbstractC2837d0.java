package com.inmobi.media;

import android.os.Build;
import com.google.ads.mediation.vungle.VungleConstants;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2837d0 {
    public static void a(String str, String str2, AdResponse adResponse, C3097n9 c3097n9) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        if (c3097n9 == null) {
            return;
        }
        try {
            int i = 0;
            AdSet adSet = adResponse.getAdSets().get(0);
            String value = adResponse.getRequestId();
            Intrinsics.checkNotNullParameter("requestID", com.ironsource.X3.i.W);
            Intrinsics.checkNotNullParameter(value, "value");
            Gh gh = c3097n9.a;
            if (gh != null) {
                gh.a("requestID", value);
            }
            String value2 = String.valueOf(adResponse.getPlacementId());
            Intrinsics.checkNotNullParameter(VungleConstants.KEY_PLACEMENT_ID, com.ironsource.X3.i.W);
            Intrinsics.checkNotNullParameter(value2, "value");
            Gh gh2 = c3097n9.a;
            if (gh2 != null) {
                gh2.a(VungleConstants.KEY_PLACEMENT_ID, value2);
            }
            String value3 = String.valueOf(str);
            Intrinsics.checkNotNullParameter("adType", com.ironsource.X3.i.W);
            Intrinsics.checkNotNullParameter(value3, "value");
            Gh gh3 = c3097n9.a;
            if (gh3 != null) {
                gh3.a("adType", value3);
            }
            String value4 = String.valueOf(str2);
            Intrinsics.checkNotNullParameter("placementType", com.ironsource.X3.i.W);
            Intrinsics.checkNotNullParameter(value4, "value");
            Gh gh4 = c3097n9.a;
            if (gh4 != null) {
                gh4.a("placementType", value4);
            }
            String value5 = String.valueOf(A1.a);
            Intrinsics.checkNotNullParameter("bundleID", com.ironsource.X3.i.W);
            Intrinsics.checkNotNullParameter(value5, "value");
            Gh gh5 = c3097n9.a;
            if (gh5 != null) {
                gh5.a("bundleID", value5);
            }
            C3342x5.a.getClass();
            String value6 = (String) C3342x5.i.getSecond();
            Intrinsics.checkNotNullParameter(com.ironsource.X3.j.n, com.ironsource.X3.i.W);
            Intrinsics.checkNotNullParameter(value6, "value");
            Gh gh6 = c3097n9.a;
            if (gh6 != null) {
                gh6.a(com.ironsource.X3.j.n, value6);
            }
            String value7 = C3342x5.m();
            Intrinsics.checkNotNullParameter("networkType", com.ironsource.X3.i.W);
            Intrinsics.checkNotNullParameter(value7, "value");
            Gh gh7 = c3097n9.a;
            if (gh7 != null) {
                gh7.a("networkType", value7);
            }
            String value8 = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(value8, "MODEL");
            Intrinsics.checkNotNullParameter("deviceModel", com.ironsource.X3.i.W);
            Intrinsics.checkNotNullParameter(value8, "value");
            Gh gh8 = c3097n9.a;
            if (gh8 != null) {
                gh8.a("deviceModel", value8);
            }
            String value9 = String.valueOf(Ji.c);
            Intrinsics.checkNotNullParameter("publisherID", com.ironsource.X3.i.W);
            Intrinsics.checkNotNullParameter(value9, "value");
            Gh gh9 = c3097n9.a;
            if (gh9 != null) {
                gh9.a("publisherID", value9);
            }
            Intrinsics.checkNotNullParameter("sdkVersion", com.ironsource.X3.i.W);
            Intrinsics.checkNotNullParameter("11.1.0", "value");
            Gh gh10 = c3097n9.a;
            if (gh10 != null) {
                gh10.a("sdkVersion", "11.1.0");
            }
            String value10 = String.valueOf(Ki.b);
            Intrinsics.checkNotNullParameter("tpName", com.ironsource.X3.i.W);
            Intrinsics.checkNotNullParameter(value10, "value");
            Gh gh11 = c3097n9.a;
            if (gh11 != null) {
                gh11.a("tpName", value10);
            }
            String value11 = String.valueOf(Ki.a);
            Intrinsics.checkNotNullParameter("tpVersion", com.ironsource.X3.i.W);
            Intrinsics.checkNotNullParameter(value11, "value");
            Gh gh12 = c3097n9.a;
            if (gh12 != null) {
                gh12.a("tpVersion", value11);
            }
            Intrinsics.checkNotNullParameter("source", com.ironsource.X3.i.W);
            Intrinsics.checkNotNullParameter("sdk_android", "value");
            Gh gh13 = c3097n9.a;
            if (gh13 != null) {
                gh13.a("source", "sdk_android");
            }
            String value12 = Ki.a();
            Intrinsics.checkNotNullParameter("mkVersion", com.ironsource.X3.i.W);
            Intrinsics.checkNotNullParameter(value12, "value");
            Gh gh14 = c3097n9.a;
            if (gh14 != null) {
                gh14.a("mkVersion", value12);
            }
            String value13 = Ji.c();
            Intrinsics.checkNotNullParameter("webViewUserAgent", com.ironsource.X3.i.W);
            Intrinsics.checkNotNullParameter(value13, "value");
            Gh gh15 = c3097n9.a;
            if (gh15 != null) {
                gh15.a("webViewUserAgent", value13);
            }
            String value14 = String.valueOf(adSet.getIsPod());
            Intrinsics.checkNotNullParameter("sdkAdPod", com.ironsource.X3.i.W);
            Intrinsics.checkNotNullParameter(value14, "value");
            Gh gh16 = c3097n9.a;
            if (gh16 != null) {
                gh16.a("sdkAdPod", value14);
            }
            String value15 = String.valueOf(adSet.getLogEnabled());
            Intrinsics.checkNotNullParameter("isServerSideLogging", com.ironsource.X3.i.W);
            Intrinsics.checkNotNullParameter(value15, "value");
            Gh gh17 = c3097n9.a;
            if (gh17 != null) {
                gh17.a("isServerSideLogging", value15);
            }
            String value16 = adSet.getTransactionId();
            if (value16 == null) {
                value16 = "Not Set";
            }
            Intrinsics.checkNotNullParameter("transactionID", com.ironsource.X3.i.W);
            Intrinsics.checkNotNullParameter(value16, "value");
            Gh gh18 = c3097n9.a;
            if (gh18 != null) {
                gh18.a("transactionID", value16);
            }
            String value17 = a();
            Intrinsics.checkNotNullParameter("configData", com.ironsource.X3.i.W);
            Intrinsics.checkNotNullParameter(value17, "value");
            Gh gh19 = c3097n9.a;
            if (gh19 != null) {
                gh19.a("configData", value17);
            }
            if (adSet.getIsPod()) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (adSet.getAds().isEmpty()) {
                    c3097n9.b("AdLogResponseHandler", "no ads. cannot update vitals");
                } else {
                    for (Object obj : adSet.getAds()) {
                        int i2 = i + 1;
                        if (i < 0) {
                            adultoid.dovishness();
                        }
                        com.inmobi.media.ads.network.common.model.Ad ad = (com.inmobi.media.ads.network.common.model.Ad) obj;
                        arrayList.add(i, ad.getCreativeId());
                        arrayList2.add(i, ad.getImpressionId());
                        i = i2;
                    }
                    String value18 = CollectionsKt.preterite(arrayList, " , ", null, null, 0, null, null, 62, null);
                    Intrinsics.checkNotNullParameter("creativeID", com.ironsource.X3.i.W);
                    Intrinsics.checkNotNullParameter(value18, "value");
                    Gh gh20 = c3097n9.a;
                    if (gh20 != null) {
                        gh20.a("creativeID", value18);
                    }
                    String value19 = CollectionsKt.preterite(arrayList2, " , ", null, null, 0, null, null, 62, null);
                    Intrinsics.checkNotNullParameter("impressionID", com.ironsource.X3.i.W);
                    Intrinsics.checkNotNullParameter(value19, "value");
                    Gh gh21 = c3097n9.a;
                    if (gh21 != null) {
                        gh21.a("impressionID", value19);
                    }
                }
            } else if (adSet.getAds().isEmpty()) {
                c3097n9.b("AdLogResponseHandler", "no ads. cannot update vitals");
            } else {
                com.inmobi.media.ads.network.common.model.Ad ad2 = adSet.getAds().get(0);
                String value20 = ad2.getCreativeId();
                Intrinsics.checkNotNullParameter("creativeID", com.ironsource.X3.i.W);
                Intrinsics.checkNotNullParameter(value20, "value");
                Gh gh22 = c3097n9.a;
                if (gh22 != null) {
                    gh22.a("creativeID", value20);
                }
                String value21 = ad2.getImpressionId();
                Intrinsics.checkNotNullParameter("impressionID", com.ironsource.X3.i.W);
                Intrinsics.checkNotNullParameter(value21, "value");
                Gh gh23 = c3097n9.a;
                if (gh23 != null) {
                    gh23.a("impressionID", value21);
                }
            }
        } catch (JSONException e) {
            c3097n9.a("AdLogResponseHandler", "error while update vitals", e);
        }
        a(adResponse, c3097n9);
    }

    public static void a(AdResponse adResponse, C3097n9 c3097n9) {
        try {
            boolean logEnabled = adResponse.getAdSets().get(0).getLogEnabled();
            c3097n9.a("AdLogResponseHandler", "server side logger lever - " + logEnabled);
            c3097n9.a(logEnabled);
        } catch (JSONException e) {
            c3097n9.a("AdLogResponseHandler", "error while setting server-side lever", e);
            c3097n9.a(false);
        }
    }

    public static String a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C2968i4 c2968i4 = Y3.a;
        Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
        C2968i4 c2968i5 = Y3.a;
        jSONObject.put("root", ((RootConfig) c2968i5.a(RootConfig.class)).getLastUpdateTimeStamp());
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        jSONObject.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, ((AdConfig) c2968i5.a(AdConfig.class)).getLastUpdateTimeStamp());
        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
        jSONObject.put("telemetry", ((TelemetryConfig) c2968i5.a(TelemetryConfig.class)).getLastUpdateTimeStamp());
        Intrinsics.checkNotNullParameter(CrashConfig.class, "clazz");
        jSONObject.put("crashReporting", ((CrashConfig) c2968i5.a(CrashConfig.class)).getLastUpdateTimeStamp());
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        jSONObject.put("signals", ((SignalsConfig) c2968i5.a(SignalsConfig.class)).getLastUpdateTimeStamp());
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
