package com.facebook.appevents;

import com.facebook.appevents.internal.AppEventUtility;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\t\u0010\rR\u001c\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/facebook/appevents/AppEventStore;", "", "<init>", "()V", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "accessTokenAppIdPair", "Lcom/facebook/appevents/SessionEventsState;", "appEvents", "Lwj/r;", "persistEvents", "(Lcom/facebook/appevents/AccessTokenAppIdPair;Lcom/facebook/appevents/SessionEventsState;)V", "Lcom/facebook/appevents/AppEventCollection;", "eventsToPersist", "(Lcom/facebook/appevents/AppEventCollection;)V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AppEventStore {
    public static final AppEventStore INSTANCE = new AppEventStore();
    private static final String TAG = AppEventStore.class.getName();

    private AppEventStore() {
    }

    public static final synchronized void persistEvents(AccessTokenAppIdPair accessTokenAppIdPair, SessionEventsState appEvents) {
        if (v7.a.b(AppEventStore.class)) {
            return;
        }
        try {
            n.f(accessTokenAppIdPair, "accessTokenAppIdPair");
            n.f(appEvents, "appEvents");
            AppEventUtility.assertIsNotMainThread();
            PersistedEvents andClearStore = AppEventDiskStore.readAndClearStore();
            andClearStore.addEvents(accessTokenAppIdPair, appEvents.getEventsToPersist());
            AppEventDiskStore.saveEventsToDisk$facebook_core_release(andClearStore);
        } catch (Throwable th2) {
            v7.a.a(AppEventStore.class, th2);
        }
    }

    public static final synchronized void persistEvents(AppEventCollection eventsToPersist) {
        if (v7.a.b(AppEventStore.class)) {
            return;
        }
        try {
            n.f(eventsToPersist, "eventsToPersist");
            AppEventUtility.assertIsNotMainThread();
            PersistedEvents andClearStore = AppEventDiskStore.readAndClearStore();
            for (AccessTokenAppIdPair accessTokenAppIdPair : eventsToPersist.keySet()) {
                SessionEventsState sessionEventsState = eventsToPersist.get(accessTokenAppIdPair);
                if (sessionEventsState != null) {
                    andClearStore.addEvents(accessTokenAppIdPair, sessionEventsState.getEventsToPersist());
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            AppEventDiskStore.saveEventsToDisk$facebook_core_release(andClearStore);
        } catch (Throwable th2) {
            v7.a.a(AppEventStore.class, th2);
        }
    }
}
