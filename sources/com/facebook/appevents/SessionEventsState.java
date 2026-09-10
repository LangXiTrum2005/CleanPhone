package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.facebook.appevents.eventdeactivation.EventDeactivationManager;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.b0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q7.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\r\b\u0001\u0018\u0000 02\u00020\u0001:\u00010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J?\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\u0014\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u001eJ\u001b\u0010 \u001a\u00020\u00132\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00160\u001f¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00160$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00160$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0016\u0010(\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0011\u0010,\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00160\u001f8F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/facebook/appevents/SessionEventsState;", "", "Lq7/b;", "attributionIdentifiers", "", "anonymousAppDeviceGUID", "<init>", "(Lq7/b;Ljava/lang/String;)V", "Ll7/b0;", "request", "Landroid/content/Context;", "applicationContext", "", "numSkipped", "Lorg/json/JSONArray;", "events", "operationalParameters", "", "limitEventUsage", "Lwj/r;", "populateRequest", "(Ll7/b0;Landroid/content/Context;ILorg/json/JSONArray;Lorg/json/JSONArray;Z)V", "Lcom/facebook/appevents/AppEvent;", NotificationCompat.CATEGORY_EVENT, "addEvent", "(Lcom/facebook/appevents/AppEvent;)V", "moveToAccumulated", "clearInFlightAndStats", "(Z)V", "includeImplicitEvents", "(Ll7/b0;Landroid/content/Context;ZZ)I", "", "accumulatePersistedEvents", "(Ljava/util/List;)V", "Lq7/b;", "Ljava/lang/String;", "", "accumulatedEvents", "Ljava/util/List;", "inFlightEvents", "numSkippedEventsDueToFullBuffer", "I", "getAccumulatedEventCount", "()I", "accumulatedEventCount", "getEventsToPersist", "()Ljava/util/List;", "eventsToPersist", "Companion", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class SessionEventsState {
    private List<AppEvent> accumulatedEvents;
    private final String anonymousAppDeviceGUID;
    private final q7.b attributionIdentifiers;
    private final List<AppEvent> inFlightEvents;
    private int numSkippedEventsDueToFullBuffer;
    private static final String TAG = "SessionEventsState";
    private static final int MAX_ACCUMULATED_LOG_EVENTS = 1000;

    public SessionEventsState(q7.b attributionIdentifiers, String anonymousAppDeviceGUID) {
        n.f(attributionIdentifiers, "attributionIdentifiers");
        n.f(anonymousAppDeviceGUID, "anonymousAppDeviceGUID");
        this.attributionIdentifiers = attributionIdentifiers;
        this.anonymousAppDeviceGUID = anonymousAppDeviceGUID;
        this.accumulatedEvents = new ArrayList();
        this.inFlightEvents = new ArrayList();
    }

    public final synchronized void accumulatePersistedEvents(List<AppEvent> events) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            n.f(events, "events");
            this.accumulatedEvents.addAll(events);
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public final synchronized void addEvent(AppEvent event) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            n.f(event, "event");
            if (this.accumulatedEvents.size() + this.inFlightEvents.size() >= MAX_ACCUMULATED_LOG_EVENTS) {
                this.numSkippedEventsDueToFullBuffer++;
            } else {
                this.accumulatedEvents.add(event);
            }
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public final synchronized void clearInFlightAndStats(boolean moveToAccumulated) {
        if (v7.a.b(this)) {
            return;
        }
        if (moveToAccumulated) {
            try {
                this.accumulatedEvents.addAll(this.inFlightEvents);
            } catch (Throwable th2) {
                v7.a.a(this, th2);
                return;
            }
        }
        this.inFlightEvents.clear();
        this.numSkippedEventsDueToFullBuffer = 0;
    }

    public final synchronized int getAccumulatedEventCount() {
        if (v7.a.b(this)) {
            return 0;
        }
        try {
            return this.accumulatedEvents.size();
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return 0;
        }
    }

    public final synchronized List<AppEvent> getEventsToPersist() {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            List<AppEvent> list = this.accumulatedEvents;
            this.accumulatedEvents = new ArrayList();
            return list;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    public final int populateRequest(b0 request, Context applicationContext, boolean includeImplicitEvents, boolean limitEventUsage) {
        Throwable th2;
        Throwable th3;
        if (v7.a.b(this)) {
            return 0;
        }
        try {
            n.f(request, "request");
            n.f(applicationContext, "applicationContext");
            try {
                synchronized (this) {
                    try {
                        int i10 = this.numSkippedEventsDueToFullBuffer;
                        EventDeactivationManager.processEvents(this.accumulatedEvents);
                        this.inFlightEvents.addAll(this.accumulatedEvents);
                        this.accumulatedEvents.clear();
                        JSONArray jSONArray = new JSONArray();
                        JSONArray jSONArray2 = new JSONArray();
                        for (AppEvent appEvent : this.inFlightEvents) {
                            try {
                                if (includeImplicitEvents || !appEvent.isImplicit()) {
                                    jSONArray.put(appEvent.getJsonObject());
                                    jSONArray2.put(appEvent.getOperationalJsonObject());
                                }
                            } catch (Throwable th4) {
                                th3 = th4;
                                throw th3;
                            }
                        }
                        if (jSONArray.length() != 0) {
                            populateRequest(request, applicationContext, i10, jSONArray, jSONArray2, limitEventUsage);
                            return jSONArray.length();
                        }
                        try {
                            return 0;
                        } catch (Throwable th5) {
                            th2 = th5;
                        }
                    } catch (Throwable th6) {
                        th3 = th6;
                    }
                    th2 = th;
                    v7.a.a(this, th2);
                    return 0;
                }
            } catch (Throwable th7) {
                th = th7;
                th2 = th;
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }

    private final void populateRequest(b0 request, Context applicationContext, int numSkipped, JSONArray events, JSONArray operationalParameters, boolean limitEventUsage) {
        JSONObject jSONObject;
        try {
            if (v7.a.b(this)) {
                return;
            }
            try {
                jSONObject = AppEventsLoggerUtility.getJSONObjectForGraphAPICall(AppEventsLoggerUtility.GraphAPIActivityType.CUSTOM_APP_EVENTS, this.attributionIdentifiers, this.anonymousAppDeviceGUID, limitEventUsage, applicationContext);
                if (this.numSkippedEventsDueToFullBuffer > 0) {
                    jSONObject.put("num_skipped_events", numSkipped);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            request.f45089c = jSONObject;
            Bundle bundle = request.f45090d;
            String string = events.toString();
            n.e(string, "events.toString()");
            bundle.putString("custom_events", string);
            if (p.b(q7.n.IapLoggingLib5To7)) {
                bundle.putString("operational_parameters", operationalParameters.toString());
            }
            request.f45091e = string;
            request.f45090d = bundle;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }
}
