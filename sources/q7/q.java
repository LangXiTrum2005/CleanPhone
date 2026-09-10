package q7;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.ironsource.O6;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f48751a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f48752b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentLinkedQueue f48753c = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f48754d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile Long f48755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile oa.k0 f48756f;

    public static JSONObject a() {
        Bundle bundle = new Bundle();
        bundle.putString(O6.H, "android");
        l7.s sVar = l7.s.f45212a;
        bundle.putString("sdk_version", "18.3.0");
        bundle.putString("fields", "gatekeepers");
        String str = l7.b0.f45085j;
        l7.b0 b0VarZ = j2.n.z(null, String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1)), null);
        b0VarZ.f45090d = bundle;
        JSONObject jSONObject = b0VarZ.c().f45112d;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public static final boolean b(String name, String str, boolean z10) {
        HashMap map;
        ConcurrentHashMap concurrentHashMap;
        Boolean bool;
        kotlin.jvm.internal.n.f(name, "name");
        q qVar = f48751a;
        ArrayList<r7.a> arrayList = null;
        d(null);
        if (qVar.c(str) == null) {
            map = new HashMap();
        } else {
            oa.k0 k0Var = f48756f;
            if (k0Var != null && (concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) k0Var.f47269b).get(str)) != null) {
                arrayList = new ArrayList(concurrentHashMap.size());
                Iterator it = concurrentHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add((r7.a) ((Map.Entry) it.next()).getValue());
                }
            }
            if (arrayList != null) {
                map = new HashMap();
                for (r7.a aVar : arrayList) {
                    map.put(aVar.f49457a, Boolean.valueOf(aVar.f49458b));
                }
            } else {
                HashMap map2 = new HashMap();
                JSONObject jSONObjectC = qVar.c(str);
                if (jSONObjectC == null) {
                    jSONObjectC = new JSONObject();
                }
                Iterator<String> itKeys = jSONObjectC.keys();
                while (itKeys.hasNext()) {
                    String key = itKeys.next();
                    kotlin.jvm.internal.n.e(key, "key");
                    map2.put(key, Boolean.valueOf(jSONObjectC.optBoolean(key)));
                }
                oa.k0 k0Var2 = f48756f;
                if (k0Var2 == null) {
                    k0Var2 = new oa.k0(6);
                }
                ArrayList<r7.a> arrayList2 = new ArrayList(map2.size());
                for (Map.Entry entry : map2.entrySet()) {
                    arrayList2.add(new r7.a((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                for (r7.a aVar2 : arrayList2) {
                    concurrentHashMap2.put(aVar2.f49457a, aVar2);
                }
                ((ConcurrentHashMap) k0Var2.f47269b).put(str, concurrentHashMap2);
                f48756f = k0Var2;
                map = map2;
            }
        }
        return (map.containsKey(name) && (bool = (Boolean) map.get(name)) != null) ? bool.booleanValue() : z10;
    }

    public static final synchronized void d(o oVar) {
        if (oVar != null) {
            try {
                f48753c.add(oVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        String strC = l7.s.c();
        q qVar = f48751a;
        Long l = f48755e;
        if (l != null && System.currentTimeMillis() - l.longValue() < 3600000 && qVar.c(strC) != null) {
            f();
            return;
        }
        Context contextB = l7.s.b();
        String str = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{strC}, 1));
        JSONObject jSONObject = null;
        String string = contextB.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(str, null);
        if (!e0.w(string)) {
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e10) {
                e0.A("FacebookSDK", e10);
            }
            if (jSONObject != null) {
                e(strC, jSONObject);
            }
        }
        Executor executorD = l7.s.d();
        if (f48752b.compareAndSet(false, true)) {
            executorD.execute(new com.facebook.appevents.ondeviceprocessing.a(contextB, strC, str));
        }
    }

    public static final synchronized JSONObject e(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        try {
            JSONObject jSONObjectC = f48751a.c(str);
            jSONObject2 = jSONObjectC != null ? new JSONObject(jSONObjectC.toString()) : new JSONObject();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.optJSONObject(0) : null;
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("gatekeepers");
            if (jSONArrayOptJSONArray2 == null) {
                jSONArrayOptJSONArray2 = new JSONArray();
            }
            int length = jSONArrayOptJSONArray2.length();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i10);
                    jSONObject2.put(jSONObject3.getString(X3.i.W), jSONObject3.getBoolean(X3.i.X));
                } catch (JSONException e10) {
                    e0.A("FacebookSDK", e10);
                }
            }
            synchronized (f48751a) {
                f48754d.put(str, jSONObject2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jSONObject2;
    }

    public static void f() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = f48753c;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            o oVar = (o) concurrentLinkedQueue.poll();
            if (oVar != null) {
                handler.post(new q1.c(oVar, 2));
            }
        }
    }

    public final synchronized JSONObject c(String str) {
        return (JSONObject) f48754d.get(str);
    }
}
