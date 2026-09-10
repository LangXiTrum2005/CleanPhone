package com.p004ironsource;

import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b+\u0010,J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u0013\u0010\u001aR\u0017\u0010\u001f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\b\u0010\u0015R\u0017\u0010!\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010\u0014\u001a\u0004\b\u001c\u0010\u0015R\u0017\u0010#\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b\"\u0010%R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b \u0010%R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010$\u001a\u0004\b(\u0010%R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b\u001e\u0010%¨\u0006-"}, d2 = {"Lcom/ironsource/f4;", "", "Lorg/json/JSONObject;", "applicationEvents", "", "key", "", "", "a", "", "Z", "k", "()Z", h4.f25212a, "b", "j", h4.f25213b, "c", h4.f25214c, "d", "I", "()I", h4.d, "e", "Ljava/lang/String;", "l", "()Ljava/lang/String;", h4.f25215e, f.j, "eventsType", g.f40227p, h4.g, h.f36614b, h4.f25216h, i.f37957c, h4.f25217i, "Ljava/util/List;", "()Ljava/util/List;", "optOutEvents", "optInEvents", "m", h4.f25218l, h4.m, "<init>", "(Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean sendUltraEvents;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean sendEventsToggle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean eventsCompression;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int eventsCompressionLevel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String serverEventsURL;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String eventsType;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int backupThreshold;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int maxNumberOfEvents;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int maxEventsPerBatch;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final List<Integer> optOutEvents;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final List<Integer> optInEvents;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final List<Integer> triggerEvents;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final List<Integer> nonConnectivityEvents;

    public f4(JSONObject applicationEvents) {
        Intrinsics.f(applicationEvents, "applicationEvents");
        this.sendUltraEvents = applicationEvents.optBoolean(h4.f25212a, false);
        this.sendEventsToggle = applicationEvents.optBoolean(h4.f25213b, false);
        this.eventsCompression = applicationEvents.optBoolean(h4.f25214c, false);
        this.eventsCompressionLevel = applicationEvents.optInt(h4.d, -1);
        String strOptString = applicationEvents.optString(h4.f25215e);
        Intrinsics.e(strOptString, "applicationEvents.optStr…(SERVER_EVENTS_URL_FIELD)");
        this.serverEventsURL = strOptString;
        String strOptString2 = applicationEvents.optString(h4.f);
        Intrinsics.e(strOptString2, "applicationEvents.optString(SERVER_EVENTS_TYPE)");
        this.eventsType = strOptString2;
        this.backupThreshold = applicationEvents.optInt(h4.g, -1);
        this.maxNumberOfEvents = applicationEvents.optInt(h4.f25216h, -1);
        this.maxEventsPerBatch = applicationEvents.optInt(h4.f25217i, 5000);
        this.optOutEvents = a(applicationEvents, h4.j);
        this.optInEvents = a(applicationEvents, h4.k);
        this.triggerEvents = a(applicationEvents, h4.f25218l);
        this.nonConnectivityEvents = a(applicationEvents, h4.m);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getBackupThreshold() {
        return this.backupThreshold;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getEventsCompression() {
        return this.eventsCompression;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getEventsCompressionLevel() {
        return this.eventsCompressionLevel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getEventsType() {
        return this.eventsType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMaxEventsPerBatch() {
        return this.maxEventsPerBatch;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getMaxNumberOfEvents() {
        return this.maxNumberOfEvents;
    }

    public final List<Integer> g() {
        return this.nonConnectivityEvents;
    }

    public final List<Integer> h() {
        return this.optInEvents;
    }

    public final List<Integer> i() {
        return this.optOutEvents;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getSendEventsToggle() {
        return this.sendEventsToggle;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getSendUltraEvents() {
        return this.sendUltraEvents;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getServerEventsURL() {
        return this.serverEventsURL;
    }

    public final List<Integer> m() {
        return this.triggerEvents;
    }

    private final List<Integer> a(JSONObject applicationEvents, String key) {
        JSONArray jSONArrayOptJSONArray = applicationEvents.optJSONArray(key);
        if (jSONArrayOptJSONArray == null) {
            return EmptyList.X;
        }
        IntRange intRangeE = RangesKt.e(0, jSONArrayOptJSONArray.length());
        ArrayList arrayList = new ArrayList(CollectionsKt.n(intRangeE, 10));
        Iterator<Integer> it = intRangeE.iterator();
        while (((IntProgressionIterator) it).Z) {
            arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.getInt(((IntIterator) it).a())));
        }
        return arrayList;
    }
}
