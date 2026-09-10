package com.facebook.appevents.integrity;

import com.ironsource.X3;
import com.ironsource.mediationsdk.metadata.a;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.s;
import org.json.JSONArray;
import org.json.JSONObject;
import q7.e0;
import q7.r;
import q7.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR2\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0011j\b\u0012\u0004\u0012\u00020\b`\u00120\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/facebook/appevents/integrity/RedactedEventsManager;", "", "<init>", "()V", "Lwj/r;", a.f29613j, "disable", "loadRedactedEvents", "", X3.i.f27798j0, "processEventsRedaction", "(Ljava/lang/String;)Ljava/lang/String;", "getRedactionString", "", "enabled", "Z", "", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "redactedEvents", "Ljava/util/Map;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class RedactedEventsManager {
    private static boolean enabled;
    public static final RedactedEventsManager INSTANCE = new RedactedEventsManager();
    private static Map<String, HashSet<String>> redactedEvents = new HashMap();

    private RedactedEventsManager() {
    }

    public static final void disable() {
        if (v7.a.b(RedactedEventsManager.class)) {
            return;
        }
        try {
            enabled = false;
            redactedEvents = new HashMap();
        } catch (Throwable th2) {
            v7.a.a(RedactedEventsManager.class, th2);
        }
    }

    public static final void enable() {
        if (v7.a.b(RedactedEventsManager.class)) {
            return;
        }
        try {
            INSTANCE.loadRedactedEvents();
            if (redactedEvents.isEmpty()) {
                return;
            }
            enabled = true;
        } catch (Throwable th2) {
            v7.a.a(RedactedEventsManager.class, th2);
        }
    }

    private final String getRedactionString(String eventName) {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            for (String str : redactedEvents.keySet()) {
                HashSet<String> hashSet = redactedEvents.get(str);
                if (hashSet != null && hashSet.contains(eventName)) {
                    return str;
                }
            }
            return null;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    private final void loadRedactedEvents() {
        HashSet<String> hashSetE;
        if (v7.a.b(this)) {
            return;
        }
        try {
            r rVarK = u.k(s.c(), false);
            if (rVarK == null) {
                return;
            }
            try {
                redactedEvents = new HashMap();
                JSONArray jSONArray = rVarK.f48771p;
                if (jSONArray == null || jSONArray.length() == 0) {
                    return;
                }
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    boolean zHas = jSONObject.has(X3.i.W);
                    boolean zHas2 = jSONObject.has(X3.i.X);
                    if (zHas && zHas2) {
                        String string = jSONObject.getString(X3.i.W);
                        JSONArray jSONArray2 = jSONObject.getJSONArray(X3.i.X);
                        if (string != null && (hashSetE = e0.e(jSONArray2)) != null) {
                            redactedEvents.put(string, hashSetE);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public static final String processEventsRedaction(String eventName) {
        String redactionString;
        if (v7.a.b(RedactedEventsManager.class)) {
            return null;
        }
        try {
            n.f(eventName, "eventName");
            return (!enabled || (redactionString = INSTANCE.getRedactionString(eventName)) == null) ? eventName : redactionString;
        } catch (Throwable th2) {
            v7.a.a(RedactedEventsManager.class, th2);
            return null;
        }
    }
}
