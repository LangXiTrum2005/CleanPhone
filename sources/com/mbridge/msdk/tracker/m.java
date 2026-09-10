package com.mbridge.msdk.tracker;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap<String, m> f36890b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f36891a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                u.a().b();
                m.this.f36891a.q().b();
            } catch (Exception e10) {
                if (com.mbridge.msdk.tracker.a.f36843a) {
                    Log.e("TrackManager", "flush error", e10);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f36893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f36894b;

        public b(e eVar, JSONObject jSONObject) {
            this.f36893a = eVar;
            this.f36894b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m.this.f36891a.h().a(this.f36893a);
                JSONObject jSONObject = this.f36894b;
                if (jSONObject != null) {
                    jSONObject.put("session_id", m.this.d());
                    long[] jArrE = m.this.e();
                    this.f36894b.put("track_time", jArrE[0]);
                    this.f36894b.put("track_count", jArrE[1]);
                    this.f36893a.a(this.f36894b);
                }
                this.f36893a.b(m.this.f36891a.c().f37089f);
                m.this.f36891a.h().b(this.f36893a);
            } catch (Exception e10) {
                Log.d("TrackManager", "trackEvent error", e10);
            }
        }
    }

    private m(String str, Context context, x xVar) {
        k kVar = new k(str, this);
        this.f36891a = kVar;
        kVar.a(context);
        kVar.a(xVar);
    }

    public static m[] b() {
        ConcurrentHashMap<String, m> concurrentHashMap = f36890b;
        m[] mVarArr = new m[concurrentHashMap.size()];
        try {
            Iterator<Map.Entry<String, m>> it = concurrentHashMap.entrySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                mVarArr[i10] = it.next().getValue();
                i10++;
            }
        } catch (Exception e10) {
            if (com.mbridge.msdk.tracker.a.f36843a) {
                Log.e("TrackManager", "getAllTrackManager error", e10);
            }
        }
        return mVarArr;
    }

    public JSONObject c() {
        return this.f36891a.p();
    }

    public String d() {
        return this.f36891a.t();
    }

    public long[] e() {
        return this.f36891a.h().a();
    }

    public String f() {
        return this.f36891a.w();
    }

    public boolean g() {
        return !this.f36891a.x();
    }

    public String h() {
        if (!g()) {
            return this.f36891a.y();
        }
        if (com.mbridge.msdk.tracker.a.f36843a) {
            Log.e("TrackManager", "MBridgeTrackManager is already running");
        }
        return d();
    }

    public void i() {
        this.f36891a.b();
    }

    public static m a(String str, Context context, x xVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ConcurrentHashMap<String, m> concurrentHashMap = f36890b;
        m mVar = concurrentHashMap.get(str);
        if (!y.b(mVar)) {
            return mVar;
        }
        m mVar2 = new m(str, context, xVar);
        concurrentHashMap.put(str, mVar2);
        return mVar2;
    }

    public void c(e eVar) {
        d(eVar);
    }

    public void d(e eVar) {
        if (this.f36891a.x()) {
            if (com.mbridge.msdk.tracker.a.f36843a) {
                Log.d("TrackManager", "SDK is shutdown, track event will not be processed");
                return;
            }
            return;
        }
        if (eVar != null && b(eVar)) {
            JSONObject jSONObjectI = eVar.i();
            if (jSONObjectI != null && !jSONObjectI.has("ts")) {
                try {
                    jSONObjectI.put("ts", System.currentTimeMillis());
                } catch (Exception e10) {
                    Log.e("TrackManager", "trackEvent error", e10);
                }
            }
            try {
                this.f36891a.i().a(new b(eVar, jSONObjectI));
            } catch (Exception e11) {
                if (com.mbridge.msdk.tracker.a.f36843a) {
                    Log.e("TrackManager", "trackEvent error", e11);
                }
            }
        }
    }

    public static m b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return f36890b.remove(str);
        } catch (Exception e10) {
            if (com.mbridge.msdk.tracker.a.f36843a) {
                Log.e("TrackManager", "removeTrackManager error", e10);
            }
            return null;
        }
    }

    public void a() {
        try {
            this.f36891a.i().a(new a());
        } catch (Exception e10) {
            if (com.mbridge.msdk.tracker.a.f36843a) {
                Log.e("TrackManager", "flush error", e10);
            }
        }
    }

    private boolean b(e eVar) {
        if (y.b(eVar) || TextUtils.isEmpty(eVar.g())) {
            return false;
        }
        return this.f36891a.a(eVar);
    }

    public void a(JSONObject jSONObject) {
        this.f36891a.a(jSONObject);
    }

    public boolean a(String str) {
        return a(new e(str));
    }

    public boolean a(e eVar) {
        try {
            return b(eVar);
        } catch (Exception unused) {
            return false;
        }
    }
}
