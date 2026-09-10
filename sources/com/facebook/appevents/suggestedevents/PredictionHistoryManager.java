package com.facebook.appevents.suggestedevents;

import android.content.SharedPreferences;
import android.view.View;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q7.e0;
import v7.a;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/facebook/appevents/suggestedevents/PredictionHistoryManager;", "", "<init>", "()V", "Lwj/r;", "initAndWait", "", "pathID", "predictedEvent", "addPrediction", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/view/View;", "view", "text", "getPathID", "(Landroid/view/View;Ljava/lang/String;)Ljava/lang/String;", "queryEvent", "(Ljava/lang/String;)Ljava/lang/String;", "", "clickedViewPaths", "Ljava/util/Map;", PredictionHistoryManager.SUGGESTED_EVENTS_HISTORY, "Ljava/lang/String;", "CLICKED_PATH_STORE", "Landroid/content/SharedPreferences;", "shardPreferences", "Landroid/content/SharedPreferences;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class PredictionHistoryManager {
    private static final String CLICKED_PATH_STORE = "com.facebook.internal.SUGGESTED_EVENTS_HISTORY";
    private static final String SUGGESTED_EVENTS_HISTORY = "SUGGESTED_EVENTS_HISTORY";
    private static SharedPreferences shardPreferences;
    public static final PredictionHistoryManager INSTANCE = new PredictionHistoryManager();
    private static final Map<String, String> clickedViewPaths = new LinkedHashMap();
    private static final AtomicBoolean initialized = new AtomicBoolean(false);

    private PredictionHistoryManager() {
    }

    public static final void addPrediction(String pathID, String predictedEvent) {
        if (a.b(PredictionHistoryManager.class)) {
            return;
        }
        try {
            n.f(pathID, "pathID");
            n.f(predictedEvent, "predictedEvent");
            if (!initialized.get()) {
                INSTANCE.initAndWait();
            }
            Map<String, String> map = clickedViewPaths;
            map.put(pathID, predictedEvent);
            SharedPreferences sharedPreferences = shardPreferences;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(SUGGESTED_EVENTS_HISTORY, e0.D(b0.X(map))).apply();
            } else {
                n.l("shardPreferences");
                throw null;
            }
        } catch (Throwable th2) {
            a.a(PredictionHistoryManager.class, th2);
        }
    }

    public static final String getPathID(View view, String text) {
        if (a.b(PredictionHistoryManager.class)) {
            return null;
        }
        try {
            n.f(view, "view");
            n.f(text, "text");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", text);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = ViewHierarchy.getParentOfView(view);
                }
                jSONObject.put(ViewHierarchyConstants.CLASS_NAME_KEY, jSONArray);
            } catch (JSONException unused) {
            }
            return e0.J(jSONObject.toString());
        } catch (Throwable th2) {
            a.a(PredictionHistoryManager.class, th2);
            return null;
        }
    }

    private final void initAndWait() {
        String str = "";
        if (a.b(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = initialized;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = s.b().getSharedPreferences(CLICKED_PATH_STORE, 0);
            n.e(sharedPreferences, "getApplicationContext()\n…RE, Context.MODE_PRIVATE)");
            shardPreferences = sharedPreferences;
            Map<String, String> map = clickedViewPaths;
            String string = sharedPreferences.getString(SUGGESTED_EVENTS_HISTORY, "");
            if (string != null) {
                str = string;
            }
            map.putAll(e0.z(str));
            atomicBoolean.set(true);
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    public static final String queryEvent(String pathID) {
        if (a.b(PredictionHistoryManager.class)) {
            return null;
        }
        try {
            n.f(pathID, "pathID");
            Map<String, String> map = clickedViewPaths;
            if (map.containsKey(pathID)) {
                return map.get(pathID);
            }
            return null;
        } catch (Throwable th2) {
            a.a(PredictionHistoryManager.class, th2);
            return null;
        }
    }
}
