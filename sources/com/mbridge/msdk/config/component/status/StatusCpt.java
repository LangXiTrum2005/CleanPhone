package com.mbridge.msdk.config.component.status;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class StatusCpt extends com.mbridge.msdk.config.component.base.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static c f32383k;
    private static e l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static d f32384m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static a f32385n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f32386h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Map<String, Object> f32387i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Map<String, Object> f32388j = null;

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f31828f = "916001";
        if (map == null) {
            return;
        }
        this.f32388j = map;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void c(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.f32387i = map;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        String strValueOf;
        List<String> list;
        super.d();
        Map<String, Object> map = this.f32387i;
        if (map == null || map.isEmpty()) {
            return;
        }
        if (f32385n == null) {
            f32385n = new a() { // from class: com.mbridge.msdk.config.component.status.f
                @Override // com.mbridge.msdk.config.component.status.a
                public final void a(com.mbridge.msdk.config.component.base.b bVar) {
                    this.f32413a.b(bVar);
                }
            };
        }
        if (d("916002")) {
            if (!c("916002")) {
                c cVar = f32383k;
                if (cVar != null) {
                    cVar.b(f32385n);
                    f32383k.d();
                }
                f32383k = null;
            } else if (f32383k == null) {
                c cVar2 = new c();
                f32383k = cVar2;
                cVar2.a(f32385n);
            }
        }
        if (d("916003") || d("916004")) {
            if (c("916003") || c("916004")) {
                b bVar = com.mbridge.msdk.foundation.controller.a.f33386s;
                if (bVar != null) {
                    bVar.a(f32385n);
                }
            } else {
                b bVar2 = com.mbridge.msdk.foundation.controller.a.f33386s;
                if (bVar2 != null) {
                    bVar2.b(f32385n);
                }
            }
        }
        if (d("916005")) {
            if (!c("916005")) {
                e eVar = l;
                if (eVar != null) {
                    eVar.b(f32385n);
                    l.d();
                }
                l = null;
            } else if (l == null) {
                e eVar2 = new e();
                l = eVar2;
                eVar2.a(f32385n);
            }
        }
        if (d("916006")) {
            Map<String, Object> map2 = this.f32388j;
            if (map2 != null) {
                Object obj = map2.get(com.mbridge.msdk.config.component.common.util.c.c(DownloadModel.FILE_NAME));
                if (obj == null) {
                    obj = "";
                }
                strValueOf = String.valueOf(obj);
                list = (this.f32388j.containsKey(com.mbridge.msdk.config.component.common.util.c.c("key_list")) && (this.f32388j.get(com.mbridge.msdk.config.component.common.util.c.c("key_list")) instanceof List)) ? (List) this.f32388j.get(com.mbridge.msdk.config.component.common.util.c.c("key_list")) : null;
            } else {
                strValueOf = null;
                list = null;
            }
            if (!c("916006")) {
                d dVar = f32384m;
                if (dVar != null) {
                    dVar.b(f32385n);
                }
                f32384m = null;
            } else if (f32384m == null) {
                d dVar2 = new d(strValueOf);
                f32384m = dVar2;
                dVar2.a(list);
                f32384m.a(f32385n);
            }
        }
        g();
        a(a("916007", (Map<String, Object>) null));
    }

    private boolean c(String str) {
        Object obj = this.f32387i.get(str);
        if (obj instanceof Map) {
            return String.valueOf(((Map) obj).get(com.mbridge.msdk.config.component.common.util.c.c("17"))).equals("1");
        }
        return false;
    }

    private void g() {
        boolean zC = c("916002");
        boolean zC2 = c("916005");
        boolean z10 = c("916004") || c("916003");
        boolean zC3 = c("916006");
        if (zC || zC2 || z10 || zC3) {
            return;
        }
        f32385n = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.mbridge.msdk.config.component.base.b bVar) {
        String strC = bVar.c();
        strC.getClass();
        switch (strC) {
            case "916002":
                String strValueOf = String.valueOf(bVar.b().get("networkType"));
                if (TextUtils.isEmpty(this.f32386h)) {
                    this.f32386h = strValueOf;
                    break;
                } else if (!this.f32386h.equals(strValueOf)) {
                    this.f32386h = strValueOf;
                    a(a(bVar.c(), bVar.b()));
                    break;
                }
                break;
            case "916003":
            case "916004":
            case "916005":
            case "916006":
                a(a(bVar.c(), bVar.b()));
                break;
        }
    }

    private boolean d(String str) {
        Object obj;
        Object obj2 = this.f32387i.get(str);
        if (!(obj2 instanceof Map) || (obj = ((Map) obj2).get(com.mbridge.msdk.config.component.common.util.c.c("17"))) == null) {
            return false;
        }
        String strValueOf = String.valueOf(obj);
        return strValueOf.equals("1") || strValueOf.equals("0");
    }
}
