package com.facebook.appevents.ondeviceprocessing;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.eventdeactivation.EventDeactivationManager;
import com.mbridge.msdk.MBridgeConstans;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import q7.r;
import q7.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007J\u001e\u0010\u000e\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u0004H\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceParametersHelper;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "buildEventsBundle", "Landroid/os/Bundle;", "eventType", "Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$EventType;", "applicationId", "appEvents", "", "Lcom/facebook/appevents/AppEvent;", "buildEventsJson", "Lorg/json/JSONArray;", "includeImplicitEvents", "", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class RemoteServiceParametersHelper {
    public static final RemoteServiceParametersHelper INSTANCE = new RemoteServiceParametersHelper();
    private static final String TAG = "RemoteServiceWrapper";

    private RemoteServiceParametersHelper() {
    }

    public static final Bundle buildEventsBundle(RemoteServiceWrapper.EventType eventType, String applicationId, List<AppEvent> appEvents) {
        if (v7.a.b(RemoteServiceParametersHelper.class)) {
            return null;
        }
        try {
            n.f(eventType, "eventType");
            n.f(applicationId, "applicationId");
            n.f(appEvents, "appEvents");
            Bundle bundle = new Bundle();
            bundle.putString(NotificationCompat.CATEGORY_EVENT, eventType.getEventType());
            bundle.putString(MBridgeConstans.APP_ID, applicationId);
            if (RemoteServiceWrapper.EventType.CUSTOM_APP_EVENTS != eventType) {
                return bundle;
            }
            JSONArray jSONArrayBuildEventsJson = INSTANCE.buildEventsJson(appEvents, applicationId);
            if (jSONArrayBuildEventsJson.length() == 0) {
                return null;
            }
            bundle.putString("custom_events", jSONArrayBuildEventsJson.toString());
            return bundle;
        } catch (Throwable th2) {
            v7.a.a(RemoteServiceParametersHelper.class, th2);
            return null;
        }
    }

    private final JSONArray buildEventsJson(List<AppEvent> appEvents, String applicationId) {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList<AppEvent> arrayListO0 = xj.n.O0(appEvents);
            EventDeactivationManager.processEvents(arrayListO0);
            boolean zIncludeImplicitEvents = includeImplicitEvents(applicationId);
            for (AppEvent appEvent : arrayListO0) {
                if (!appEvent.isImplicit() || (appEvent.isImplicit() && zIncludeImplicitEvents)) {
                    jSONArray.put(appEvent.getJsonObject());
                }
            }
            return jSONArray;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    private final boolean includeImplicitEvents(String applicationId) {
        if (v7.a.b(this)) {
            return false;
        }
        try {
            r rVarK = u.k(applicationId, false);
            if (rVarK != null) {
                return rVarK.f48757a;
            }
            return false;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return false;
        }
    }
}
