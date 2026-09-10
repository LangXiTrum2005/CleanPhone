package com.facebook.appevents.gps.pa;

import an.h;
import android.adservices.common.AdData;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.CustomAudienceManager;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.TrustedBiddingData;
import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.gps.GpsDebugLogger;
import com.facebook.appevents.internal.Constants;
import com.ironsource.X3;
import com.ironsource.mediationsdk.metadata.a;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import j1.f;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.s;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J#\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\nJ!\u0010\r\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\r\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010\u0012¨\u0006#"}, d2 = {"Lcom/facebook/appevents/gps/pa/PACustomAudienceClient;", "", "<init>", "()V", "Lwj/r;", a.f29613j, "", "appId", X3.i.f27798j0, "joinCustomAudienceImpl", "(Ljava/lang/String;Ljava/lang/String;)V", "validateAndCreateCAName", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "joinCustomAudience", "Lcom/facebook/appevents/AppEvent;", NotificationCompat.CATEGORY_EVENT, "(Ljava/lang/String;Lcom/facebook/appevents/AppEvent;)V", "TAG", "Ljava/lang/String;", "BUYER", "DELIMITER", "GPS_PREFIX", "EVENT_NAME_CONFIG_VERSION", "REPLACEMENT_STRING", "", "enabled", "Z", "isInitialized", "Landroid/adservices/customaudience/CustomAudienceManager;", "customAudienceManager", "Landroid/adservices/customaudience/CustomAudienceManager;", "Lcom/facebook/appevents/gps/GpsDebugLogger;", "gpsDebugLogger", "Lcom/facebook/appevents/gps/GpsDebugLogger;", "baseUri", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class PACustomAudienceClient {
    private static final String BUYER = "facebook.com";
    private static final String DELIMITER = "@";
    private static final String EVENT_NAME_CONFIG_VERSION = "1";
    private static final String GPS_PREFIX = "gps";
    private static final String REPLACEMENT_STRING = "_removed_";
    private static String baseUri;
    private static CustomAudienceManager customAudienceManager;
    private static boolean enabled;
    private static GpsDebugLogger gpsDebugLogger;
    private static boolean isInitialized;
    public static final PACustomAudienceClient INSTANCE = new PACustomAudienceClient();
    private static final String TAG = "Fledge: PACustomAudienceClient";

    private PACustomAudienceClient() {
    }

    public static final /* synthetic */ GpsDebugLogger access$getGpsDebugLogger$p() {
        if (v7.a.b(PACustomAudienceClient.class)) {
            return null;
        }
        try {
            return gpsDebugLogger;
        } catch (Throwable th2) {
            v7.a.a(PACustomAudienceClient.class, th2);
            return null;
        }
    }

    public static final /* synthetic */ String access$getTAG$p() {
        if (v7.a.b(PACustomAudienceClient.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th2) {
            v7.a.a(PACustomAudienceClient.class, th2);
            return null;
        }
    }

    @TargetApi(34)
    public static final void enable() {
        String string;
        if (v7.a.b(PACustomAudienceClient.class)) {
            return;
        }
        try {
            isInitialized = true;
            Context contextB = s.b();
            gpsDebugLogger = new GpsDebugLogger(contextB);
            baseUri = "https://www." + s.f45228r + "/privacy_sandbox/pa/logic";
            try {
                CustomAudienceManager customAudienceManager2 = CustomAudienceManager.get(contextB);
                customAudienceManager = customAudienceManager2;
                if (customAudienceManager2 != null) {
                    enabled = true;
                }
                string = null;
            } catch (Error e10) {
                string = e10.toString();
                Log.w(TAG, "Failed to get CustomAudienceManager: " + e10);
            } catch (Exception e11) {
                string = e11.toString();
                Log.w(TAG, "Failed to get CustomAudienceManager: " + e11);
            }
            if (enabled) {
                return;
            }
            GpsDebugLogger gpsDebugLogger2 = gpsDebugLogger;
            if (gpsDebugLogger2 == null) {
                n.l("gpsDebugLogger");
                throw null;
            }
            Bundle bundle = new Bundle();
            bundle.putString(Constants.GPS_PA_FAILED_REASON, string);
            gpsDebugLogger2.log(Constants.GPS_PA_FAILED, bundle);
        } catch (Throwable th2) {
            v7.a.a(PACustomAudienceClient.class, th2);
        }
    }

    @TargetApi(34)
    private final void joinCustomAudienceImpl(String appId, String eventName) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            String strValidateAndCreateCAName = validateAndCreateCAName(appId, eventName);
            if (strValidateAndCreateCAName == null) {
                return;
            }
            try {
                try {
                    OutcomeReceiver<Object, Exception> outcomeReceiver = new OutcomeReceiver() { // from class: com.facebook.appevents.gps.pa.PACustomAudienceClient$joinCustomAudienceImpl$callback$1
                        public void onResult(Object result) {
                            n.f(result, "result");
                            Log.i(PACustomAudienceClient.access$getTAG$p(), "Successfully joined custom audience");
                            GpsDebugLogger gpsDebugLoggerAccess$getGpsDebugLogger$p = PACustomAudienceClient.access$getGpsDebugLogger$p();
                            if (gpsDebugLoggerAccess$getGpsDebugLogger$p != null) {
                                gpsDebugLoggerAccess$getGpsDebugLogger$p.log(Constants.GPS_PA_SUCCEED, null);
                            } else {
                                n.l("gpsDebugLogger");
                                throw null;
                            }
                        }

                        public void onError(Exception error) {
                            n.f(error, "error");
                            Log.e(PACustomAudienceClient.access$getTAG$p(), error.toString());
                            GpsDebugLogger gpsDebugLoggerAccess$getGpsDebugLogger$p = PACustomAudienceClient.access$getGpsDebugLogger$p();
                            if (gpsDebugLoggerAccess$getGpsDebugLogger$p == null) {
                                n.l("gpsDebugLogger");
                                throw null;
                            }
                            Bundle bundle = new Bundle();
                            bundle.putString(Constants.GPS_PA_FAILED_REASON, error.toString());
                            gpsDebugLoggerAccess$getGpsDebugLogger$p.log(Constants.GPS_PA_FAILED, bundle);
                        }
                    };
                    AdData.Builder builder = new AdData.Builder();
                    String str = baseUri;
                    if (str == null) {
                        n.l("baseUri");
                        throw null;
                    }
                    Uri uri = Uri.parse(str.concat("/ad"));
                    n.b(uri);
                    AdData adDataBuild = builder.setRenderUri(uri).setMetadata("{'isRealAd': false}").build();
                    n.e(adDataBuild, "Builder()\n              …\n                .build()");
                    TrustedBiddingData.Builder builder2 = new TrustedBiddingData.Builder();
                    String str2 = baseUri;
                    if (str2 == null) {
                        n.l("baseUri");
                        throw null;
                    }
                    Uri uri2 = Uri.parse(str2.concat("?trusted_bidding"));
                    n.b(uri2);
                    TrustedBiddingData trustedBiddingDataBuild = builder2.setTrustedBiddingUri(uri2).setTrustedBiddingKeys(f.C("")).build();
                    n.e(trustedBiddingDataBuild, "Builder()\n              …\n                .build()");
                    CustomAudience.Builder buyer = new CustomAudience.Builder().setName(strValidateAndCreateCAName).setBuyer(AdTechIdentifier.fromString(BUYER));
                    StringBuilder sb2 = new StringBuilder();
                    String str3 = baseUri;
                    if (str3 == null) {
                        n.l("baseUri");
                        throw null;
                    }
                    sb2.append(str3);
                    sb2.append("?daily&app_id=");
                    sb2.append(appId);
                    Uri uri3 = Uri.parse(sb2.toString());
                    n.b(uri3);
                    CustomAudience.Builder dailyUpdateUri = buyer.setDailyUpdateUri(uri3);
                    String str4 = baseUri;
                    if (str4 == null) {
                        n.l("baseUri");
                        throw null;
                    }
                    Uri uri4 = Uri.parse(str4.concat("?bidding"));
                    n.b(uri4);
                    CustomAudience customAudienceBuild = dailyUpdateUri.setBiddingLogicUri(uri4).setTrustedBiddingData(trustedBiddingDataBuild).setUserBiddingSignals(AdSelectionSignals.fromString(JsonUtils.EMPTY_JSON)).setAds(f.C(adDataBuild)).build();
                    n.e(customAudienceBuild, "Builder()\n              …(listOf(dummyAd)).build()");
                    JoinCustomAudienceRequest joinCustomAudienceRequestBuild = new JoinCustomAudienceRequest.Builder().setCustomAudience(customAudienceBuild).build();
                    n.e(joinCustomAudienceRequestBuild, "Builder().setCustomAudience(ca).build()");
                    CustomAudienceManager customAudienceManager2 = customAudienceManager;
                    if (customAudienceManager2 != null) {
                        customAudienceManager2.joinCustomAudience(joinCustomAudienceRequestBuild, Executors.newSingleThreadExecutor(), outcomeReceiver);
                    }
                } catch (Error e10) {
                    Log.w(TAG, "Failed to join Custom Audience: " + e10);
                    GpsDebugLogger gpsDebugLogger2 = gpsDebugLogger;
                    if (gpsDebugLogger2 == null) {
                        n.l("gpsDebugLogger");
                        throw null;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString(Constants.GPS_PA_FAILED_REASON, e10.toString());
                    gpsDebugLogger2.log(Constants.GPS_PA_FAILED, bundle);
                }
            } catch (Exception e11) {
                Log.w(TAG, "Failed to join Custom Audience: " + e11);
                GpsDebugLogger gpsDebugLogger3 = gpsDebugLogger;
                if (gpsDebugLogger3 == null) {
                    n.l("gpsDebugLogger");
                    throw null;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString(Constants.GPS_PA_FAILED_REASON, e11.toString());
                gpsDebugLogger3.log(Constants.GPS_PA_FAILED, bundle2);
            }
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    private final String validateAndCreateCAName(String appId, String eventName) {
        if (!v7.a.b(this) && appId != null && eventName != null) {
            try {
                if (!eventName.equals(REPLACEMENT_STRING) && !h.q0(eventName, GPS_PREFIX, false)) {
                    return appId + '@' + eventName + '@' + (System.currentTimeMillis() / ((long) 1000)) + "@1";
                }
            } catch (Throwable th2) {
                v7.a.a(this, th2);
            }
        }
        return null;
    }

    public final void joinCustomAudience(String appId, String eventName) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            if (!isInitialized) {
                enable();
            }
            if (enabled) {
                joinCustomAudienceImpl(appId, eventName);
            }
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public final void joinCustomAudience(String appId, AppEvent event) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            if (!isInitialized) {
                enable();
            }
            if (enabled) {
                String string = null;
                if (event != null) {
                    try {
                        JSONObject jsonObject = event.getJsonObject();
                        if (jsonObject != null) {
                            string = jsonObject.getString(Constants.EVENT_NAME_EVENT_KEY);
                        }
                    } catch (JSONException unused) {
                        Log.w(TAG, "Failed to get event name from event.");
                    }
                }
                joinCustomAudienceImpl(appId, string);
            }
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }
}
