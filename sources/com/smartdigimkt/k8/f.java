package com.smartdigimkt.k8;

import android.content.Context;
import android.text.TextUtils;
import com.smartdigimkt.n8.p;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f36285c = "PlaceStrategySaver";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f36286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, com.smartdigimkt.l8.e> f36287b = new ConcurrentHashMap<>();

    public class a implements Runnable {
        final /* synthetic */ JSONObject X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f36288Y;

        public a(JSONObject jSONObject, String str) {
            this.X = jSONObject;
            this.f36288Y = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObject = this.X;
            p.b(f.this.f36286a, "sdm_sdk", f.this.a(this.f36288Y, false), jSONObject == null ? "" : jSONObject.toString());
        }
    }

    public f(Context context) {
        this.f36286a = context;
    }

    public com.smartdigimkt.l8.e a(String str, String str2, int i2) {
        String strM = android.support.v4.media.a.m(str, str2);
        ConcurrentHashMap<String, com.smartdigimkt.l8.e> concurrentHashMap = this.f36287b;
        com.smartdigimkt.l8.e eVar = concurrentHashMap.get(strM);
        if (eVar != null) {
            return eVar;
        }
        String strA = p.a(this.f36286a, "sdm_sdk", a(strM, false), "");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        try {
            com.smartdigimkt.l8.e eVarB = com.smartdigimkt.l8.e.b(str2, new JSONObject(strA));
            concurrentHashMap.put(strM, eVarB);
            return eVarB;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void b(String str, String str2, int i2) {
        String strM = android.support.v4.media.a.m(str, str2);
        this.f36287b.remove(strM);
        p.a(this.f36286a, "sdm_sdk", a(strM, false));
    }

    public void a(String str, String str2, com.smartdigimkt.l8.e eVar, JSONObject jSONObject, int i2) {
        if (this.f36286a == null || eVar == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        String strM = android.support.v4.media.a.m(str, str2);
        this.f36287b.put(strM, eVar);
        boolean zA0 = eVar.a0();
        boolean zV = eVar.V();
        if (!zA0 || jSONObject == null || zV) {
            return;
        }
        com.smartdigimkt.l7.b.a().g(new a(jSONObject, strM));
    }

    public com.smartdigimkt.l8.e a(String str, String str2) {
        return a(str, str2, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, boolean z2) {
        return android.support.v4.media.a.D(str, "_", z2 ? "PL_SY_COLD_START" : "PL_SY");
    }
}
