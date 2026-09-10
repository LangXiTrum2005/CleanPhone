package com.mbridge.msdk.config.component.sen;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class SenCpt extends com.mbridge.msdk.config.component.base.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static b f32374k;
    private static Map<String, a> l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f32375h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f32376i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f32377j;

    private String c(String str) {
        if (com.mbridge.msdk.config.component.common.util.c.c("331").equals(str)) {
            return "accelerometer";
        }
        if (com.mbridge.msdk.config.component.common.util.c.c("332").equals(str)) {
            return "magnetic";
        }
        if (com.mbridge.msdk.config.component.common.util.c.c("333").equals(str)) {
            return "gyroscope";
        }
        return com.mbridge.msdk.config.component.common.util.c.c("334").equals(str) ? "rotation" : str;
    }

    private void h() {
        if (f32374k == null) {
            f32374k = new b();
        }
        if (l == null) {
            l = new HashMap();
        }
        a aVar = new a() { // from class: com.mbridge.msdk.config.component.sen.c
            @Override // com.mbridge.msdk.config.component.sen.a
            public final void a(com.mbridge.msdk.config.component.base.b bVar) {
                this.f32382a.b(bVar);
            }
        };
        l.put(this.f32376i, aVar);
        f32374k.a(aVar);
        f32374k.a(g(), c(this.f32376i), this.f32377j);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f31828f = "917001";
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key)) {
                if (key.equals(com.mbridge.msdk.config.component.common.util.c.c("149"))) {
                    this.f32376i = String.valueOf(entry.getValue());
                } else if (key.equals(com.mbridge.msdk.config.component.common.util.c.c("150"))) {
                    double d10 = Double.parseDouble(String.valueOf(entry.getValue()));
                    if (d10 > 0.0d) {
                        this.f32377j = (int) (d10 * 1000.0d * 1000.0d);
                    }
                } else if (key.equals(com.mbridge.msdk.config.component.common.util.c.c("100"))) {
                    this.f32375h = String.valueOf(entry.getValue());
                }
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        Map<String, a> map;
        super.d();
        if (this.f32375h.equals(com.mbridge.msdk.config.component.common.util.c.c("310"))) {
            h();
        }
        if (this.f32375h.equals(com.mbridge.msdk.config.component.common.util.c.c("318")) && f32374k != null && (map = l) != null) {
            f32374k.b(map.get(this.f32376i));
            l.remove(this.f32376i);
            if (l.isEmpty()) {
                f32374k.a();
                f32374k = null;
            }
        }
        a("917003", (HashMap<String, Object>) null);
    }

    private int g() {
        if (com.mbridge.msdk.config.component.common.util.c.c("331").equals(this.f32376i)) {
            return 1;
        }
        if (com.mbridge.msdk.config.component.common.util.c.c("332").equals(this.f32376i)) {
            return 2;
        }
        if (com.mbridge.msdk.config.component.common.util.c.c("333").equals(this.f32376i)) {
            return 4;
        }
        return com.mbridge.msdk.config.component.common.util.c.c("334").equals(this.f32376i) ? 11 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.mbridge.msdk.config.component.base.b bVar) {
        a(a(bVar.c(), bVar.b()));
    }
}
