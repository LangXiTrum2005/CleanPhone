package com.mbridge.msdk.config.component.model;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class ModelCpt extends com.mbridge.msdk.config.component.base.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f32309h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, Object> f32310i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<String, Object> f32311j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f32312k;
    private int l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f32313m;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Map<String, Object> mapD;
            String strValueOf = String.valueOf(ModelCpt.this.f32313m);
            if (strValueOf.startsWith("SELECT") || strValueOf.startsWith("select")) {
                mapD = com.mbridge.msdk.config.component.database.a.a().d(strValueOf);
            } else {
                mapD = (strValueOf.startsWith("DELETE") || strValueOf.startsWith("delete")) ? com.mbridge.msdk.config.component.database.a.a().a(strValueOf) : com.mbridge.msdk.config.component.database.a.a().c(strValueOf);
            }
            Object obj = mapD.get(c.c("code"));
            if ((obj instanceof Integer ? ((Integer) obj).intValue() : 0) == 1) {
                ModelCpt.this.a(true, "", mapD.get(c.c("data")));
            } else {
                ModelCpt.this.a(false, f2.l("reason", mapD), (Object) null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (Map.Entry entry : ModelCpt.this.f32311j.entrySet()) {
                if (entry != null && !TextUtils.isEmpty((CharSequence) entry.getKey())) {
                    String str = (String) entry.getKey();
                    if (!TextUtils.isEmpty(str)) {
                        com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).b(str, String.valueOf(entry.getValue()));
                    }
                }
            }
        }
    }

    private void g() {
        if (TextUtils.isEmpty(this.f32313m)) {
            return;
        }
        a aVar = new a();
        if (this.l == 1) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
        } else {
            aVar.run();
        }
    }

    private void h() {
        Map<String, Object> map = this.f32310i;
        if (map == null || this.f31826d == null || this.f32311j == null) {
            a(false, "Config parameters is null", (Object) null);
            return;
        }
        String str = (String) map.get(c.c("120"));
        if (TextUtils.isEmpty(str)) {
            a(false, "Scope name is empty", (Object) null);
            return;
        }
        Iterator<Map.Entry<String, Object>> it = this.f32311j.entrySet().iterator();
        String str2 = "";
        while (true) {
            boolean z10 = false;
            while (true) {
                if (!it.hasNext()) {
                    a(z10, str2, (Object) null);
                    return;
                }
                Map.Entry<String, Object> next = it.next();
                if (next != null && !TextUtils.isEmpty(next.getKey()) && !c.c("120").equals(next.getKey())) {
                    try {
                        String key = next.getKey();
                        String str3 = str + "." + key;
                        com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVarA = c.a(this.f31826d, str3);
                        if (aVarA != null) {
                            if (aVarA.a(str3, key, next.getValue()).intValue() != 1) {
                                break;
                            } else {
                                z10 = true;
                            }
                        } else {
                            continue;
                        }
                    } catch (Exception e10) {
                        str2 = "Failed to modify data in scope: " + e10.getMessage();
                        q0.b("ModelCpt", str2);
                    }
                }
            }
        }
    }

    private void i() {
        Map<String, Object> map;
        if (this.f32310i == null || this.f31826d == null || (map = this.f32311j) == null) {
            a(false, "Config parameters is null", (Object) null);
            return;
        }
        String str = "";
        while (true) {
            boolean z10 = false;
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry != null && !TextUtils.isEmpty(entry.getKey())) {
                    try {
                        z10 = this.f31826d.a(entry.getKey(), entry.getValue()).intValue() == 1;
                        if (!z10) {
                            str = "Failed to modify data";
                        }
                    } catch (Exception e10) {
                        str = "Failed to modify data without scope: " + e10.getMessage();
                        q0.b("ModelCpt", str);
                    }
                }
            }
            a(z10, str, (Object) null);
            return;
        }
    }

    private void j() {
        b bVar = new b();
        if (this.l == 1) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(bVar);
        } else {
            bVar.run();
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        try {
            if (c.c("313").equals(this.f32312k)) {
                g();
                return;
            }
            if (c.c("314").equals(this.f32312k)) {
                j();
            } else if (this.f32309h.equals("withScope")) {
                h();
            } else {
                i();
            }
        } catch (Exception e10) {
            q0.b("ModelCpt", "Error during execution: " + e10.getMessage());
            a(false, "Execution failed: " + e10.getMessage(), (Object) null);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f31828f = "914001";
        this.f32310i = map;
        if (map.isEmpty()) {
            q0.b("ModelCpt", "Config parameters is null");
            return;
        }
        this.f32309h = map.containsKey(c.c("120")) ? "withScope" : "withoutScope";
        Object obj = map.get(c.c("121"));
        if (obj instanceof Map) {
            this.f32311j = (Map) obj;
        }
        Object obj2 = map.get(c.c("117"));
        if (obj2 != null) {
            this.f32312k = String.valueOf(obj2);
        }
        Object obj3 = map.get(c.c("background"));
        if (obj3 != null) {
            this.l = Integer.parseInt(String.valueOf(obj3));
        }
        Object obj4 = map.get(c.c("118"));
        if (obj4 != null) {
            this.f32313m = String.valueOf(obj4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, String str, Object obj) {
        HashMap map = new HashMap();
        map.put(c.c("500"), Integer.valueOf(z10 ? 1 : 0));
        map.put(c.c("code"), "");
        map.put(c.c("reason"), str);
        if (obj != null) {
            map.put(c.c("data"), obj);
        }
        a(a("914002", (Map<String, Object>) map));
    }
}
