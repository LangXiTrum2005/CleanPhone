package com.facebook.appevents;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000  2\u00020\u0001:\u0002 !B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B9\b\u0016\u0012.\u0010\t\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004j\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006`\b¢\u0006\u0004\b\u0002\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0012\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00110\u000e¢\u0006\u0004\b\u0012\u0010\u0010J \u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00052\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0004\b\u001c\u0010\u001dR<\u0010\u001e\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004j\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/facebook/appevents/PersistedEvents;", "Ljava/io/Serializable;", "<init>", "()V", "Ljava/util/HashMap;", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "", "Lcom/facebook/appevents/AppEvent;", "Lkotlin/collections/HashMap;", "appEventMap", "(Ljava/util/HashMap;)V", "", "writeReplace", "()Ljava/lang/Object;", "", "keySet", "()Ljava/util/Set;", "", "entrySet", "accessTokenAppIdPair", "", "get", "(Lcom/facebook/appevents/AccessTokenAppIdPair;)Ljava/util/List;", "", "containsKey", "(Lcom/facebook/appevents/AccessTokenAppIdPair;)Z", "appEvents", "Lwj/r;", "addEvents", "(Lcom/facebook/appevents/AccessTokenAppIdPair;Ljava/util/List;)V", "events", "Ljava/util/HashMap;", "Companion", "SerializationProxyV1", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class PersistedEvents implements Serializable {
    private static final long serialVersionUID = 20160629001L;
    private final HashMap<AccessTokenAppIdPair, List<AppEvent>> events;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB5\u0012.\u0010\u0002\u001a*\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003j\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005`\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0002R6\u0010\u0002\u001a*\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003j\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/facebook/appevents/PersistedEvents$SerializationProxyV1;", "Ljava/io/Serializable;", "proxyEvents", "Ljava/util/HashMap;", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "", "Lcom/facebook/appevents/AppEvent;", "Lkotlin/collections/HashMap;", "(Ljava/util/HashMap;)V", "readResolve", "", "Companion", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class SerializationProxyV1 implements Serializable {
        private static final long serialVersionUID = 20160629001L;
        private final HashMap<AccessTokenAppIdPair, List<AppEvent>> proxyEvents;

        public SerializationProxyV1(HashMap<AccessTokenAppIdPair, List<AppEvent>> proxyEvents) {
            n.f(proxyEvents, "proxyEvents");
            this.proxyEvents = proxyEvents;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new PersistedEvents(this.proxyEvents);
        }
    }

    public PersistedEvents() {
        this.events = new HashMap<>();
    }

    private final Object writeReplace() throws ObjectStreamException {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            return new SerializationProxyV1(this.events);
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    public final void addEvents(AccessTokenAppIdPair accessTokenAppIdPair, List<AppEvent> appEvents) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            n.f(accessTokenAppIdPair, "accessTokenAppIdPair");
            n.f(appEvents, "appEvents");
            if (!this.events.containsKey(accessTokenAppIdPair)) {
                this.events.put(accessTokenAppIdPair, xj.n.O0(appEvents));
                return;
            }
            List<AppEvent> list = this.events.get(accessTokenAppIdPair);
            if (list != null) {
                list.addAll(appEvents);
            }
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public final boolean containsKey(AccessTokenAppIdPair accessTokenAppIdPair) {
        if (v7.a.b(this)) {
            return false;
        }
        try {
            n.f(accessTokenAppIdPair, "accessTokenAppIdPair");
            return this.events.containsKey(accessTokenAppIdPair);
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return false;
        }
    }

    public final Set<Map.Entry<AccessTokenAppIdPair, List<AppEvent>>> entrySet() {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            Set<Map.Entry<AccessTokenAppIdPair, List<AppEvent>>> setEntrySet = this.events.entrySet();
            n.e(setEntrySet, "events.entries");
            return setEntrySet;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    public final List<AppEvent> get(AccessTokenAppIdPair accessTokenAppIdPair) {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            n.f(accessTokenAppIdPair, "accessTokenAppIdPair");
            return this.events.get(accessTokenAppIdPair);
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    public final Set<AccessTokenAppIdPair> keySet() {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            Set<AccessTokenAppIdPair> setKeySet = this.events.keySet();
            n.e(setKeySet, "events.keys");
            return setKeySet;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    public PersistedEvents(HashMap<AccessTokenAppIdPair, List<AppEvent>> appEventMap) {
        n.f(appEventMap, "appEventMap");
        HashMap<AccessTokenAppIdPair, List<AppEvent>> map = new HashMap<>();
        this.events = map;
        map.putAll(appEventMap);
    }
}
