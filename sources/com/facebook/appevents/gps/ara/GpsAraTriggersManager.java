package com.facebook.appevents.gps.ara;

import an.h;
import android.adservices.measurement.MeasurementManager;
import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.gps.GpsDebugLogger;
import com.facebook.appevents.internal.Constants;
import com.ironsource.B5;
import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.net.URLEncoder;
import java.util.Iterator;
import jk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import l7.s;
import org.json.JSONObject;
import zm.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/facebook/appevents/gps/ara/GpsAraTriggersManager;", "", "<init>", "()V", "Lwj/r;", com.ironsource.mediationsdk.metadata.a.f29613j, "", "canRegisterTrigger", "()Z", "Lcom/facebook/appevents/AppEvent;", NotificationCompat.CATEGORY_EVENT, "", "getEventParameters", "(Lcom/facebook/appevents/AppEvent;)Ljava/lang/String;", "isValidEvent", "(Lcom/facebook/appevents/AppEvent;)Z", "applicationId", "registerTriggerAsync", "(Ljava/lang/String;Lcom/facebook/appevents/AppEvent;)V", "registerTrigger", "GPS_PREFIX", "Ljava/lang/String;", "REPLACEMENT_STRING", "TAG", "enabled", "Z", "Lcom/facebook/appevents/gps/GpsDebugLogger;", "gpsDebugLogger", "Lcom/facebook/appevents/gps/GpsDebugLogger;", "serverUri", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class GpsAraTriggersManager {
    private static final String GPS_PREFIX = "gps";
    public static final GpsAraTriggersManager INSTANCE = new GpsAraTriggersManager();
    private static final String REPLACEMENT_STRING = "_removed_";
    private static final String TAG;
    private static boolean enabled;
    private static GpsDebugLogger gpsDebugLogger;
    private static String serverUri;

    /* JADX INFO: renamed from: com.facebook.appevents.gps.ara.GpsAraTriggersManager$getEventParameters$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", X3.i.W, "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends o implements b {
        final /* synthetic */ JSONObject $params;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(JSONObject jSONObject) {
            super(1);
            this.$params = jSONObject;
        }

        @Override // jk.b
        public final String invoke(String str) {
            Object objOpt = this.$params.opt(str);
            if (objOpt == null) {
                return null;
            }
            try {
                return URLEncoder.encode(str, "UTF-8") + B5.U + URLEncoder.encode(objOpt.toString(), "UTF-8");
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static {
        String string = GpsAraTriggersManager.class.toString();
        n.e(string, "GpsAraTriggersManager::class.java.toString()");
        TAG = string;
    }

    private GpsAraTriggersManager() {
    }

    public static final /* synthetic */ GpsDebugLogger access$getGpsDebugLogger$p() {
        if (v7.a.b(GpsAraTriggersManager.class)) {
            return null;
        }
        try {
            return gpsDebugLogger;
        } catch (Throwable th2) {
            v7.a.a(GpsAraTriggersManager.class, th2);
            return null;
        }
    }

    public static final /* synthetic */ String access$getTAG$p() {
        if (v7.a.b(GpsAraTriggersManager.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th2) {
            v7.a.a(GpsAraTriggersManager.class, th2);
            return null;
        }
    }

    private final boolean canRegisterTrigger() {
        if (v7.a.b(this)) {
            return false;
        }
        try {
            if (!enabled || Build.VERSION.SDK_INT < 33) {
                return false;
            }
            try {
                Class.forName("android.adservices.measurement.MeasurementManager");
                Class.forName("android.os.OutcomeReceiver");
                return true;
            } catch (Error e10) {
                Log.i(TAG, "FAILURE_NO_MEASUREMENT_MANAGER_CLASS");
                GpsDebugLogger gpsDebugLogger2 = gpsDebugLogger;
                if (gpsDebugLogger2 == null) {
                    n.l("gpsDebugLogger");
                    throw null;
                }
                Bundle bundle = new Bundle();
                bundle.putString(Constants.GPS_ARA_FAILED_REASON, e10.toString());
                gpsDebugLogger2.log(Constants.GPS_ARA_FAILED, bundle);
                return false;
            } catch (Exception e11) {
                Log.i(TAG, "FAILURE_NO_MEASUREMENT_MANAGER_CLASS");
                GpsDebugLogger gpsDebugLogger3 = gpsDebugLogger;
                if (gpsDebugLogger3 == null) {
                    n.l("gpsDebugLogger");
                    throw null;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString(Constants.GPS_ARA_FAILED_REASON, e11.toString());
                gpsDebugLogger3.log(Constants.GPS_ARA_FAILED, bundle2);
                return false;
            }
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return false;
        }
    }

    public static final void enable() {
        if (v7.a.b(GpsAraTriggersManager.class)) {
            return;
        }
        try {
            enabled = true;
            gpsDebugLogger = new GpsDebugLogger(s.b());
            serverUri = "https://www." + s.f45228r + "/privacy_sandbox/mobile/register/trigger";
        } catch (Throwable th2) {
            v7.a.a(GpsAraTriggersManager.class, th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    private final String getEventParameters(AppEvent event) {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            JSONObject jsonObject = event.getJsonObject();
            if (jsonObject != null && jsonObject.length() != 0) {
                Iterator<String> itKeys = jsonObject.keys();
                n.e(itKeys, "params.keys()");
                this = l.T(l.V(l.M(itKeys), new AnonymousClass1(jsonObject)), X3.j.f27832c);
                return this;
            }
            return "";
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    private final boolean isValidEvent(AppEvent event) {
        if (!v7.a.b(this)) {
            try {
                String eventName = event.getJsonObject().getString(Constants.EVENT_NAME_EVENT_KEY);
                if (!n.a(eventName, REPLACEMENT_STRING)) {
                    n.e(eventName, "eventName");
                    if (!h.q0(eventName, GPS_PREFIX, false)) {
                        return true;
                    }
                }
            } catch (Throwable th2) {
                v7.a.a(this, th2);
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerTriggerAsync$lambda$0(String applicationId, AppEvent event) {
        if (v7.a.b(GpsAraTriggersManager.class)) {
            return;
        }
        try {
            n.f(applicationId, "$applicationId");
            n.f(event, "$event");
            INSTANCE.registerTrigger(applicationId, event);
        } catch (Throwable th2) {
            v7.a.a(GpsAraTriggersManager.class, th2);
        }
    }

    @TargetApi(34)
    public final void registerTrigger(String applicationId, AppEvent event) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            n.f(applicationId, "applicationId");
            n.f(event, "event");
            if (isValidEvent(event) && canRegisterTrigger()) {
                Context contextB = s.b();
                try {
                    MeasurementManager measurementManagerC = com.unity3d.ads.adplayer.b.c(contextB.getSystemService(com.unity3d.ads.adplayer.b.g()));
                    if (measurementManagerC == null) {
                        measurementManagerC = MeasurementManager.get(contextB.getApplicationContext());
                    }
                    if (measurementManagerC == null) {
                        Log.w(TAG, "FAILURE_GET_MEASUREMENT_MANAGER");
                        GpsDebugLogger gpsDebugLogger2 = gpsDebugLogger;
                        if (gpsDebugLogger2 == null) {
                            n.l("gpsDebugLogger");
                            throw null;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString(Constants.GPS_ARA_FAILED_REASON, "Failed to get measurement manager");
                        gpsDebugLogger2.log(Constants.GPS_ARA_FAILED, bundle);
                        return;
                    }
                    String eventParameters = getEventParameters(event);
                    StringBuilder sb2 = new StringBuilder();
                    String str = serverUri;
                    if (str == null) {
                        n.l("serverUri");
                        throw null;
                    }
                    sb2.append(str);
                    sb2.append("?app_id=");
                    sb2.append(applicationId);
                    sb2.append('&');
                    sb2.append(eventParameters);
                    Uri uri = Uri.parse(sb2.toString());
                    n.e(uri, "parse(\"$serverUri?$appId…=$applicationId&$params\")");
                    measurementManagerC.registerTrigger(uri, s.d(), new OutcomeReceiver() { // from class: com.facebook.appevents.gps.ara.GpsAraTriggersManager$registerTrigger$outcomeReceiver$1
                        public void onResult(Object result) {
                            n.f(result, "result");
                            Log.d(GpsAraTriggersManager.access$getTAG$p(), "OUTCOME_RECEIVER_TRIGGER_SUCCESS");
                            GpsDebugLogger gpsDebugLoggerAccess$getGpsDebugLogger$p = GpsAraTriggersManager.access$getGpsDebugLogger$p();
                            if (gpsDebugLoggerAccess$getGpsDebugLogger$p != null) {
                                gpsDebugLoggerAccess$getGpsDebugLogger$p.log(Constants.GPS_ARA_SUCCEED, null);
                            } else {
                                n.l("gpsDebugLogger");
                                throw null;
                            }
                        }

                        public void onError(Exception error) {
                            n.f(error, "error");
                            Log.d(GpsAraTriggersManager.access$getTAG$p(), "OUTCOME_RECEIVER_TRIGGER_FAILURE");
                            GpsDebugLogger gpsDebugLoggerAccess$getGpsDebugLogger$p = GpsAraTriggersManager.access$getGpsDebugLogger$p();
                            if (gpsDebugLoggerAccess$getGpsDebugLogger$p == null) {
                                n.l("gpsDebugLogger");
                                throw null;
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putString(Constants.GPS_ARA_FAILED_REASON, error.toString());
                            gpsDebugLoggerAccess$getGpsDebugLogger$p.log(Constants.GPS_ARA_FAILED, bundle2);
                        }
                    });
                } catch (Error e10) {
                    Log.w(TAG, "FAILURE_TRIGGER_REGISTRATION_FAILED");
                    GpsDebugLogger gpsDebugLogger3 = gpsDebugLogger;
                    if (gpsDebugLogger3 == null) {
                        n.l("gpsDebugLogger");
                        throw null;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(Constants.GPS_ARA_FAILED_REASON, e10.toString());
                    gpsDebugLogger3.log(Constants.GPS_ARA_FAILED, bundle2);
                } catch (Exception e11) {
                    Log.w(TAG, "FAILURE_TRIGGER_REGISTRATION_FAILED");
                    GpsDebugLogger gpsDebugLogger4 = gpsDebugLogger;
                    if (gpsDebugLogger4 == null) {
                        n.l("gpsDebugLogger");
                        throw null;
                    }
                    Bundle bundle3 = new Bundle();
                    bundle3.putString(Constants.GPS_ARA_FAILED_REASON, e11.toString());
                    gpsDebugLogger4.log(Constants.GPS_ARA_FAILED, bundle3);
                }
            }
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public final void registerTriggerAsync(String applicationId, AppEvent event) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            n.f(applicationId, "applicationId");
            n.f(event, "event");
            s.d().execute(new a(applicationId, event, 0));
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }
}
