package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.extractor.text.ttml.a;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.internal.gatekeeper.GateKeeper;
import com.facebook.internal.gatekeeper.GateKeeperRuntimeCache;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.thinkup.core.common.om.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/internal/FetchedAppGateKeepersManager;", "", "Callback", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class FetchedAppGateKeepersManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f16289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentLinkedQueue f16290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f16291c;
    public static Long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static GateKeeperRuntimeCache f16292e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/FetchedAppGateKeepersManager$Callback;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface Callback {
        void a();
    }

    static {
        Reflection.f43333a.b(FetchedAppGateKeepersManager.class).l();
        f16289a = new AtomicBoolean(false);
        f16290b = new ConcurrentLinkedQueue();
        f16291c = new ConcurrentHashMap();
    }

    public static JSONObject a(String str) {
        Bundle bundleD = a.d("platform", "android");
        HashSet hashSet = FacebookSdk.f15915a;
        bundleD.putString(com.smartdigimkt.b0.a.s1, "12.1.0");
        bundleD.putString("fields", "gatekeepers");
        String str2 = GraphRequest.j;
        GraphRequest graphRequest = new GraphRequest(null, String.format("%s/%s", Arrays.copyOf(new Object[]{str, "mobile_sdk_gk"}, 2)), null, null, null, 32);
        graphRequest.f15937h = true;
        graphRequest.d = bundleD;
        JSONObject jSONObject = graphRequest.c().f15950a;
        return jSONObject != null ? jSONObject : new JSONObject();
    }

    public static final boolean b(String name, String str, boolean z2) {
        HashMap map;
        ConcurrentHashMap concurrentHashMap;
        Boolean bool;
        Intrinsics.f(name, "name");
        ArrayList<GateKeeper> arrayList = null;
        c(null);
        ConcurrentHashMap concurrentHashMap2 = f16291c;
        if (concurrentHashMap2.containsKey(str)) {
            GateKeeperRuntimeCache gateKeeperRuntimeCache = f16292e;
            if (gateKeeperRuntimeCache != null && (concurrentHashMap = (ConcurrentHashMap) gateKeeperRuntimeCache.f16410a.get(str)) != null) {
                arrayList = new ArrayList(concurrentHashMap.size());
                Iterator it = concurrentHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add((GateKeeper) ((Map.Entry) it.next()).getValue());
                }
            }
            if (arrayList != null) {
                map = new HashMap();
                for (GateKeeper gateKeeper : arrayList) {
                    map.put(gateKeeper.f16408a, Boolean.valueOf(gateKeeper.f16409b));
                }
            } else {
                HashMap map2 = new HashMap();
                JSONObject jSONObject = (JSONObject) concurrentHashMap2.get(str);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String key = itKeys.next();
                    Intrinsics.e(key, "key");
                    map2.put(key, Boolean.valueOf(jSONObject.optBoolean(key)));
                }
                GateKeeperRuntimeCache gateKeeperRuntimeCache2 = f16292e;
                if (gateKeeperRuntimeCache2 == null) {
                    gateKeeperRuntimeCache2 = new GateKeeperRuntimeCache();
                }
                ArrayList<GateKeeper> arrayList2 = new ArrayList(map2.size());
                for (Map.Entry entry : map2.entrySet()) {
                    arrayList2.add(new GateKeeper((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
                for (GateKeeper gateKeeper2 : arrayList2) {
                    concurrentHashMap3.put(gateKeeper2.f16408a, gateKeeper2);
                }
                gateKeeperRuntimeCache2.f16410a.put(str, concurrentHashMap3);
                f16292e = gateKeeperRuntimeCache2;
                map = map2;
            }
        } else {
            map = new HashMap();
        }
        return (map.containsKey(name) && (bool = (Boolean) map.get(name)) != null) ? bool.booleanValue() : z2;
    }

    public static final synchronized void c(FeatureManager$checkFeature$1 featureManager$checkFeature$1) {
        if (featureManager$checkFeature$1 != null) {
            try {
                f16290b.add(featureManager$checkFeature$1);
            } catch (Throwable th) {
                throw th;
            }
        }
        final String strC = FacebookSdk.c();
        Long l2 = d;
        if (l2 != null && System.currentTimeMillis() - l2.longValue() < n.m && f16291c.containsKey(strC)) {
            e();
            return;
        }
        final Context contextB = FacebookSdk.b();
        final String str = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{strC}, 1));
        if (contextB == null) {
            return;
        }
        JSONObject jSONObject = null;
        String string = contextB.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(str, null);
        if (!Utility.C(string)) {
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException unused) {
                HashSet hashSet = FacebookSdk.f15915a;
            }
            if (jSONObject != null) {
                d(strC, jSONObject);
            }
        }
        Executor executorE = FacebookSdk.e();
        if (f16289a.compareAndSet(false, true)) {
            executorE.execute(new Runnable() { // from class: com.facebook.internal.FetchedAppGateKeepersManager$loadAppGateKeepersAsync$1
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = strC;
                    if (CrashShieldHandler.b(this)) {
                        return;
                    }
                    try {
                        JSONObject jSONObjectA = FetchedAppGateKeepersManager.a(str2);
                        if (jSONObjectA.length() != 0) {
                            FetchedAppGateKeepersManager.d(str2, jSONObjectA);
                            contextB.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str, jSONObjectA.toString()).apply();
                            FetchedAppGateKeepersManager.d = Long.valueOf(System.currentTimeMillis());
                        }
                        FetchedAppGateKeepersManager.e();
                        FetchedAppGateKeepersManager.f16289a.set(false);
                    } catch (Throwable th2) {
                        CrashShieldHandler.a(this, th2);
                    }
                }
            });
        }
    }

    public static final synchronized JSONObject d(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        try {
            jSONObject2 = (JSONObject) f16291c.get(str);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
            if (jSONArrayOptJSONArray == null || (jSONObject3 = jSONArrayOptJSONArray.optJSONObject(0)) == null) {
                jSONObject3 = new JSONObject();
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject3.optJSONArray("gatekeepers");
            if (jSONArrayOptJSONArray2 == null) {
                jSONArrayOptJSONArray2 = new JSONArray();
            }
            int length = jSONArrayOptJSONArray2.length();
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    JSONObject jSONObject4 = jSONArrayOptJSONArray2.getJSONObject(i2);
                    jSONObject2.put(jSONObject4.getString("key"), jSONObject4.getBoolean("value"));
                } catch (JSONException unused) {
                    HashSet hashSet = FacebookSdk.f15915a;
                }
            }
            f16291c.put(str, jSONObject2);
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject2;
    }

    public static void e() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = f16290b;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            final Callback callback = (Callback) concurrentLinkedQueue.poll();
            if (callback != null) {
                handler.post(new Runnable() { // from class: com.facebook.internal.FetchedAppGateKeepersManager$pollCallbacks$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (CrashShieldHandler.b(this)) {
                            return;
                        }
                        try {
                            callback.a();
                        } catch (Throwable th) {
                            CrashShieldHandler.a(this, th);
                        }
                    }
                });
            }
        }
    }
}
