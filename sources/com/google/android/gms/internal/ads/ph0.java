package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ph0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONObject f18653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f18654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public JSONObject f18656e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f18652a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f18657f = new AtomicBoolean(false);

    public ph0(k00 k00Var) {
        this.f18654c = k00Var;
    }

    public final synchronized void a() {
        JSONObject jSONObject;
        Map map;
        try {
            this.f18655d = true;
            c00 c00VarZzi = zzt.zzh().g().zzi();
            if (c00VarZzi != null && (jSONObject = c00VarZzi.f12963g) != null) {
                this.f18653b = ((Boolean) zzba.zzc().a(am.f12147f5)).booleanValue() ? jSONObject.optJSONObject("common_settings") : null;
                this.f18656e = jSONObject.optJSONObject("ad_unit_patterns");
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
                if (jSONArrayOptJSONArray != null) {
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("ad_unit_id");
                            String strOptString2 = jSONObjectOptJSONObject.optString("format");
                            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("request_signals");
                            if (strOptString != null && jSONObjectOptJSONObject2 != null && strOptString2 != null) {
                                ConcurrentHashMap concurrentHashMap = this.f18652a;
                                if (concurrentHashMap.containsKey(strOptString2)) {
                                    map = (Map) concurrentHashMap.get(strOptString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                                    concurrentHashMap.put(strOptString2, concurrentHashMap2);
                                    map = concurrentHashMap2;
                                }
                                map.put(strOptString, jSONObjectOptJSONObject2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
