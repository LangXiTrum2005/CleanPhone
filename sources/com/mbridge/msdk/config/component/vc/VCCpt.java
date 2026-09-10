package com.mbridge.msdk.config.component.vc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.view.ViewGroup;
import com.ironsource.X3;
import com.mbridge.msdk.config.activity.MBRewardVideoActivity;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class VCCpt extends com.mbridge.msdk.config.component.base.a {
    private static ConcurrentHashMap<String, VCCpt> l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final String f32452h = "1200001";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final String f32453i = "1200002";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f32454j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.config.component.vc.model.a f32455k;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b implements com.mbridge.msdk.config.activity.lifecycle.a, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f32456a;

        private b() {
        }

        public void a(String str) {
            this.f32456a = str;
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void b() {
            VCCpt vCCpt;
            if (VCCpt.l == null || VCCpt.l.isEmpty() || (vCCpt = (VCCpt) VCCpt.l.get(this.f32456a)) == null) {
                return;
            }
            vCCpt.a(vCCpt.a("902007", (Map<String, Object>) new HashMap()));
            vCCpt.c(X3.i.f27817u0);
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void c() {
            VCCpt vCCpt;
            if (VCCpt.l == null || VCCpt.l.isEmpty() || (vCCpt = (VCCpt) VCCpt.l.get(this.f32456a)) == null) {
                return;
            }
            vCCpt.a(vCCpt.a("902009", (Map<String, Object>) new HashMap()));
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void a(ViewGroup viewGroup) {
            VCCpt vCCpt;
            if (VCCpt.l == null || VCCpt.l.isEmpty() || (vCCpt = (VCCpt) VCCpt.l.get(this.f32456a)) == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                vCCpt.a(viewGroup);
            }
            Object objB = vCCpt.f31826d.b((Object) c.c("sdk_context"));
            if (objB instanceof Map) {
                ((Map) objB).put(c.c("rootView"), viewGroup);
            } else {
                HashMap map = new HashMap();
                map.put(c.c("rootView"), viewGroup);
                vCCpt.f31826d.a(c.c("sdk_context"), map);
            }
            HashMap map2 = new HashMap();
            try {
                Configuration configuration = viewGroup.getContext().getResources().getConfiguration();
                map2.put("current_orientation", String.valueOf(configuration == null ? 0 : configuration.orientation));
            } catch (Throwable th2) {
                q0.b("VCCpt", th2.getMessage());
            }
            vCCpt.a(vCCpt.a("902002", (Map<String, Object>) new HashMap(map2)));
            vCCpt.a(vCCpt.a("902003", (Map<String, Object>) new HashMap(map2)));
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void a() {
            VCCpt vCCpt;
            if (VCCpt.l == null || VCCpt.l.isEmpty() || (vCCpt = (VCCpt) VCCpt.l.get(this.f32456a)) == null) {
                return;
            }
            vCCpt.a(vCCpt.a("902006", (Map<String, Object>) new HashMap()));
            vCCpt.c("onStop");
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void e() {
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void f() {
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void onStart() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = this.f31826d;
        if (aVar == null) {
            return;
        }
        Object objB = aVar.b((Object) c.c("sdk_context"));
        try {
            if (objB instanceof Map) {
                Object obj = ((Map) objB).get("lifecycleListeners");
                if (obj instanceof List) {
                    List<com.mbridge.msdk.config.component.vc.inter.a> list = (List) obj;
                    if (list.isEmpty()) {
                        return;
                    }
                    synchronized (list) {
                        try {
                            for (com.mbridge.msdk.config.component.vc.inter.a aVar2 : list) {
                                if (aVar2 != null) {
                                    aVar2.a(str);
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            q0.b("VCCpt", th3.getMessage(), th3);
        }
    }

    private void h() {
        a(a("902005", (Map<String, Object>) new HashMap()));
        l();
        if (e() == null || !(e().getContext() instanceof Activity)) {
            return;
        }
        ((Activity) e().getContext()).finish();
    }

    private void i() {
        String strA = this.f32455k.a();
        try {
            if (strA.equals(c.c("319"))) {
                m();
            } else if (strA.equals(c.c("307"))) {
                h();
            }
            if (this.f32455k.f() == 1) {
                n();
            }
        } catch (Exception e10) {
            q0.b("VCCpt", "Error in doRenderTemplateAction", e10);
            a("1200002", "Root view render fail");
        }
    }

    private com.mbridge.msdk.config.activity.backdispatcher.a j() {
        try {
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = this.f31826d;
            if (aVar == null) {
                return null;
            }
            Object objB = aVar.b((Object) c.c("sdk_context"));
            if (objB instanceof Map) {
                Object obj = ((Map) objB).get("backInvocationCallback");
                if (obj instanceof com.mbridge.msdk.config.activity.backdispatcher.a) {
                    return (com.mbridge.msdk.config.activity.backdispatcher.a) obj;
                }
            }
        } catch (Throwable th2) {
            q0.b("VCCpt", th2.getMessage());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        a(a("902010", (Map<String, Object>) new HashMap()));
    }

    private void l() {
        try {
            Object objB = this.f31826d.b((Object) c.c("sdk_context"));
            if (objB instanceof Map) {
                Map map = (Map) objB;
                Object obj = map.get("lifecycleListeners");
                if (obj instanceof List) {
                    ((List) obj).clear();
                }
                Object obj2 = map.get(c.c("component_cache"));
                if (obj2 instanceof Map) {
                    ((Map) obj2).clear();
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    n();
                }
                map.remove("backInvocationCallback");
            }
            ConcurrentHashMap<String, VCCpt> concurrentHashMap = l;
            if (concurrentHashMap != null) {
                concurrentHashMap.remove(this.f32454j);
                if (l.isEmpty()) {
                    l = null;
                }
            }
        } catch (Throwable th2) {
            q0.b("VCCpt", th2.getMessage(), th2);
        }
    }

    private void m() {
        Intent intent = new Intent(com.mbridge.msdk.foundation.controller.c.n().d(), (Class<?>) MBRewardVideoActivity.class);
        intent.putExtra("155", this.f32455k.c());
        intent.putExtra("154", this.f32455k.d());
        intent.putExtra("157", this.f32455k.g());
        intent.putExtra("158", this.f32455k.b());
        intent.putExtra("156", this.f32455k.e());
        b bVar = new b();
        bVar.a(this.f32454j);
        intent.putExtra("lifecycleCallbackByActivity", bVar);
        try {
            if (com.mbridge.msdk.foundation.controller.c.n() != null && com.mbridge.msdk.foundation.controller.c.n().f() != null) {
                ((Activity) com.mbridge.msdk.foundation.controller.c.n().f()).startActivity(intent);
                return;
            }
        } catch (Throwable th2) {
            q0.b("VCCpt", th2.getMessage());
        }
        intent.addFlags(268435456);
        com.mbridge.msdk.foundation.controller.c.n().d().startActivity(intent);
    }

    private void n() {
        Context context;
        com.mbridge.msdk.config.activity.backdispatcher.a aVarJ;
        if (Build.VERSION.SDK_INT >= 33) {
            try {
                ViewGroup viewGroupE = e();
                if (viewGroupE != null && (context = viewGroupE.getContext()) != null && (context instanceof Activity) && (aVarJ = j()) != null) {
                    aVarJ.a(((Activity) context).getWindow());
                }
            } catch (Throwable th2) {
                q0.b("VCCpt", th2.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f31828f = "902001";
        this.f32455k = new com.mbridge.msdk.config.component.vc.model.a(map);
        this.f32454j = UUID.randomUUID().toString();
        if (l == null) {
            l = new ConcurrentHashMap<>();
        }
        l.put(this.f32454j, this);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        i();
        a("902011", (HashMap<String, Object>) null);
    }

    private void a(String str, String str2) {
        a("902008", str, str2);
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ViewGroup viewGroup) {
        com.mbridge.msdk.config.component.vc.model.a aVar;
        if (Build.VERSION.SDK_INT < 33 || viewGroup == null || (aVar = this.f32455k) == null || aVar.f() == 1) {
            return;
        }
        try {
            Context context = viewGroup.getContext();
            if (context != null && (context instanceof Activity)) {
                com.mbridge.msdk.config.activity.backdispatcher.a aVar2 = new com.mbridge.msdk.config.activity.backdispatcher.a();
                aVar2.a(((Activity) context).getWindow(), new a4.a(this, 19));
                a(aVar2);
            }
        } catch (Throwable th2) {
            q0.b("VCCpt", th2.getMessage());
        }
    }

    private void a(Object obj) {
        try {
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = this.f31826d;
            if (aVar == null) {
                return;
            }
            Object objB = aVar.b((Object) c.c("sdk_context"));
            if (objB instanceof Map) {
                ((Map) objB).put("backInvocationCallback", obj);
            }
        } catch (Throwable th2) {
            q0.b("VCCpt", th2.getMessage());
        }
    }
}
