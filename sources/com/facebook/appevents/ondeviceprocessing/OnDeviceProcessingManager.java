package com.facebook.appevents.ondeviceprocessing;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.app.NotificationCompat;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.AppEventsConstants;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import j1.f;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.s;
import q7.e0;
import xj.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/facebook/appevents/ondeviceprocessing/OnDeviceProcessingManager;", "", "<init>", "()V", "", "isOnDeviceProcessingEnabled", "()Z", "", "applicationId", "preferencesName", "Lwj/r;", "sendInstallEventAsync", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/facebook/appevents/AppEvent;", NotificationCompat.CATEGORY_EVENT, "sendCustomEventAsync", "(Ljava/lang/String;Lcom/facebook/appevents/AppEvent;)V", "isEventEligibleForOnDeviceProcessing", "(Lcom/facebook/appevents/AppEvent;)Z", "", "ALLOWED_IMPLICIT_EVENTS", "Ljava/util/Set;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class OnDeviceProcessingManager {
    public static final OnDeviceProcessingManager INSTANCE = new OnDeviceProcessingManager();
    private static final Set<String> ALLOWED_IMPLICIT_EVENTS = k.E0(new String[]{AppEventsConstants.EVENT_NAME_PURCHASED, AppEventsConstants.EVENT_NAME_START_TRIAL, AppEventsConstants.EVENT_NAME_SUBSCRIBE});

    private OnDeviceProcessingManager() {
    }

    private final boolean isEventEligibleForOnDeviceProcessing(AppEvent event) {
        if (v7.a.b(this)) {
            return false;
        }
        try {
            return !event.isImplicit() || (event.isImplicit() && ALLOWED_IMPLICIT_EVENTS.contains(event.getName()));
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return false;
        }
    }

    public static final boolean isOnDeviceProcessingEnabled() {
        if (!v7.a.b(OnDeviceProcessingManager.class)) {
            try {
                if (!s.g(s.b()) && !e0.u() && RemoteServiceWrapper.isServiceAvailable()) {
                    return true;
                }
            } catch (Throwable th2) {
                v7.a.a(OnDeviceProcessingManager.class, th2);
                return false;
            }
        }
        return false;
    }

    public static final void sendCustomEventAsync(String applicationId, AppEvent event) {
        if (v7.a.b(OnDeviceProcessingManager.class)) {
            return;
        }
        try {
            n.f(applicationId, "applicationId");
            n.f(event, "event");
            if (INSTANCE.isEventEligibleForOnDeviceProcessing(event)) {
                s.d().execute(new com.facebook.appevents.gps.ara.a(applicationId, event, 1));
            }
        } catch (Throwable th2) {
            v7.a.a(OnDeviceProcessingManager.class, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendCustomEventAsync$lambda$1(String applicationId, AppEvent event) {
        if (v7.a.b(OnDeviceProcessingManager.class)) {
            return;
        }
        try {
            n.f(applicationId, "$applicationId");
            n.f(event, "$event");
            RemoteServiceWrapper.sendCustomEvents(applicationId, f.C(event));
        } catch (Throwable th2) {
            v7.a.a(OnDeviceProcessingManager.class, th2);
        }
    }

    public static final void sendInstallEventAsync(String applicationId, String preferencesName) {
        if (v7.a.b(OnDeviceProcessingManager.class)) {
            return;
        }
        try {
            Context contextB = s.b();
            if (applicationId == null || preferencesName == null) {
                return;
            }
            s.d().execute(new a(contextB, preferencesName, applicationId, 0));
        } catch (Throwable th2) {
            v7.a.a(OnDeviceProcessingManager.class, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendInstallEventAsync$lambda$0(Context context, String str, String str2) {
        if (v7.a.b(OnDeviceProcessingManager.class)) {
            return;
        }
        try {
            n.f(context, "$context");
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            String str3 = str2 + "pingForOnDevice";
            if (sharedPreferences.getLong(str3, 0L) == 0) {
                RemoteServiceWrapper.sendInstallEvent(str2);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putLong(str3, System.currentTimeMillis());
                editorEdit.apply();
            }
        } catch (Throwable th2) {
            v7.a.a(OnDeviceProcessingManager.class, th2);
        }
    }
}
