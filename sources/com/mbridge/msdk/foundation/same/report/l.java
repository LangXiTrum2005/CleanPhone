package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import com.ironsource.B5;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.tools.q0;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f33948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33949b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, String> f33950a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f33951b;

        public b(String str) {
            this.f33951b = str;
        }

        public l a() {
            return new l(this);
        }
    }

    private void a(Map<String, String> map, JSONObject jSONObject) {
        if (map == null || map.isEmpty() || jSONObject == null) {
            return;
        }
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, a(map.get(str)));
            }
        } catch (Exception e10) {
            q0.b("SameCommonReporter", e10.getMessage());
        }
    }

    public void b(String str) {
        if (TextUtils.isEmpty(this.f33949b)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(X3.i.W, this.f33949b);
            a(this.f33948a, jSONObject);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Throwable th2) {
            q0.b("SameCommonReporter", th2.getMessage());
        }
    }

    private l(b bVar) {
        this.f33949b = bVar.f33951b;
        this.f33948a = bVar.f33950a;
    }

    private String a(String str) {
        try {
            return URLEncoder.encode(str, B5.O);
        } catch (Exception unused) {
            return str;
        }
    }
}
