package com.facebook.appevents;

import android.content.Context;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.s;
import q7.f;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\bR \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/facebook/appevents/AppEventCollection;", "", "<init>", "()V", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "accessTokenAppId", "Lcom/facebook/appevents/SessionEventsState;", "getSessionEventsState", "(Lcom/facebook/appevents/AccessTokenAppIdPair;)Lcom/facebook/appevents/SessionEventsState;", "Lcom/facebook/appevents/PersistedEvents;", "persistedEvents", "Lwj/r;", "addPersistedEvents", "(Lcom/facebook/appevents/PersistedEvents;)V", "accessTokenAppIdPair", "Lcom/facebook/appevents/AppEvent;", "appEvent", "addEvent", "(Lcom/facebook/appevents/AccessTokenAppIdPair;Lcom/facebook/appevents/AppEvent;)V", "", "keySet", "()Ljava/util/Set;", "get", "Ljava/util/HashMap;", "stateMap", "Ljava/util/HashMap;", "", "getEventCount", "()I", "eventCount", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AppEventCollection {
    private final HashMap<AccessTokenAppIdPair, SessionEventsState> stateMap = new HashMap<>();

    private final synchronized SessionEventsState getSessionEventsState(AccessTokenAppIdPair accessTokenAppId) {
        Context contextB;
        q7.b bVarB;
        SessionEventsState sessionEventsState = this.stateMap.get(accessTokenAppId);
        if (sessionEventsState == null && (bVarB = f.b((contextB = s.b()))) != null) {
            sessionEventsState = new SessionEventsState(bVarB, AppEventsLogger.INSTANCE.getAnonymousAppDeviceGUID(contextB));
        }
        if (sessionEventsState == null) {
            return null;
        }
        this.stateMap.put(accessTokenAppId, sessionEventsState);
        return sessionEventsState;
    }

    public final synchronized void addEvent(AccessTokenAppIdPair accessTokenAppIdPair, AppEvent appEvent) {
        n.f(accessTokenAppIdPair, "accessTokenAppIdPair");
        n.f(appEvent, "appEvent");
        SessionEventsState sessionEventsState = getSessionEventsState(accessTokenAppIdPair);
        if (sessionEventsState != null) {
            sessionEventsState.addEvent(appEvent);
        }
    }

    public final synchronized void addPersistedEvents(PersistedEvents persistedEvents) {
        if (persistedEvents == null) {
            return;
        }
        for (Map.Entry<AccessTokenAppIdPair, List<AppEvent>> entry : persistedEvents.entrySet()) {
            SessionEventsState sessionEventsState = getSessionEventsState(entry.getKey());
            if (sessionEventsState != null) {
                Iterator<AppEvent> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    sessionEventsState.addEvent(it.next());
                }
            }
        }
    }

    public final synchronized SessionEventsState get(AccessTokenAppIdPair accessTokenAppIdPair) {
        n.f(accessTokenAppIdPair, "accessTokenAppIdPair");
        return this.stateMap.get(accessTokenAppIdPair);
    }

    public final synchronized int getEventCount() {
        int accumulatedEventCount;
        Iterator<SessionEventsState> it = this.stateMap.values().iterator();
        accumulatedEventCount = 0;
        while (it.hasNext()) {
            accumulatedEventCount += it.next().getAccumulatedEventCount();
        }
        return accumulatedEventCount;
    }

    public final synchronized Set<AccessTokenAppIdPair> keySet() {
        Set<AccessTokenAppIdPair> setKeySet;
        setKeySet = this.stateMap.keySet();
        n.e(setKeySet, "stateMap.keys");
        return setKeySet;
    }
}
