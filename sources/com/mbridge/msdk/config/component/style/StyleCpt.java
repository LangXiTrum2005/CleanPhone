package com.mbridge.msdk.config.component.style;

import android.animation.Animator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.X3;
import com.mbridge.msdk.config.component.animation.b;
import com.mbridge.msdk.config.component.animation.g;
import com.mbridge.msdk.config.component.base.d;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.config.component.info.provider.subprovider.f;
import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class StyleCpt extends com.mbridge.msdk.config.component.base.a implements com.mbridge.msdk.config.component.vc.inter.a, d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b f32414h = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.animation.d f32415i = new com.mbridge.msdk.config.component.animation.d();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.config.component.style.model.b f32416j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private XMLView f32417k;
    private com.mbridge.msdk.config.component.style.inter.a l;

    private void c(View view) {
        if (view != null) {
            view.setVisibility(0);
            HashMap map = new HashMap();
            map.put(c.c("view_tag"), view.getTag());
            a(a("903008", (Map<String, Object>) map));
        }
    }

    private void h() {
        String strA = this.f32416j.a();
        if (TextUtils.isEmpty(strA)) {
            a("2000005", "Component command is null");
            return;
        }
        try {
            if (strA.equals(c.c("319"))) {
                q();
                return;
            }
            if (strA.equals(c.c("325"))) {
                l();
            } else if (strA.equals(c.c("326"))) {
                a(8);
            } else if (strA.equals(c.c("307"))) {
                g();
            }
        } catch (Exception e10) {
            q0.b("StyleCpt", "Error in doRenderTemplateAction", e10);
            a("", "Command execute error " + e10.getMessage());
        }
    }

    private void i() {
        com.mbridge.msdk.config.component.style.model.b bVar = this.f32416j;
        if (bVar == null || bVar.e() == null) {
            return;
        }
        for (com.mbridge.msdk.config.component.style.model.a aVar : this.f32416j.e()) {
            if (aVar != null) {
                String strA = aVar.a();
                String strH = aVar.h();
                if (!TextUtils.isEmpty(strA) && !TextUtils.isEmpty(strH)) {
                    View viewC = c(strH);
                    if (viewC == null) {
                        f2.s("Widget view not found: ", strH, "StyleCpt");
                    } else {
                        try {
                            if (strA.equals(c.c("319"))) {
                                c(viewC);
                            } else if (strA.equals(c.c("325"))) {
                                a(viewC);
                            } else if (strA.equals(c.c("328"))) {
                                a(viewC, aVar);
                            } else if (strA.equals(c.c("327"))) {
                                b(viewC);
                            } else if ("animate".equalsIgnoreCase(strA)) {
                                b(viewC, aVar);
                            }
                            d(viewC, aVar);
                            c(viewC, aVar);
                        } catch (Exception e10) {
                            q0.b("StyleCpt", "Error in doWidgetViewAction", e10);
                        }
                    }
                }
            }
        }
    }

    private void j() {
        com.mbridge.msdk.config.component.style.model.b bVar = this.f32416j;
        if (bVar == null || TextUtils.isEmpty(bVar.d())) {
            return;
        }
        this.f32417k = com.mbridge.msdk.config.dynamic.utils.d.a(e(), SameMD5.getMD5(this.f32416j.d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> k() {
        String strF;
        List<com.mbridge.msdk.config.component.style.model.a> listE = this.f32416j.e();
        if (listE != null && !listE.isEmpty()) {
            for (com.mbridge.msdk.config.component.style.model.a aVar : listE) {
                if (aVar != null && (strF = aVar.f()) != null) {
                    strF.equals("1");
                }
            }
        }
        return com.mbridge.msdk.config.dynamic.utils.d.a((ViewGroup) this.f32417k);
    }

    private void l() {
        XMLView xMLView = this.f32417k;
        if (xMLView == null) {
            return;
        }
        xMLView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        h();
        i();
    }

    private void p() {
        if (this.l != null) {
            return;
        }
        this.l = new a();
    }

    private void q() {
        a(a("903002", new HashMap<>()));
        XMLView xMLView = this.f32417k;
        if (xMLView == null) {
            a(0);
        } else if (xMLView.getVisibility() != 0) {
            this.f32417k.setVisibility(0);
        }
        HashMap map = new HashMap();
        Map<String, Object> mapK = k();
        if (!mapK.isEmpty()) {
            map.putAll(mapK);
        }
        a(a("903006", (Map<String, Object>) map));
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f31828f = "903001";
        this.f32416j = new com.mbridge.msdk.config.component.style.model.b(map);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        j();
        com.mbridge.msdk.foundation.same.threadpool.a.c().post(new f(this, 2));
        a("903011", (HashMap<String, Object>) null);
    }

    public void n() {
        a(a("903004", (Map<String, Object>) new HashMap()));
    }

    public void o() {
        a(a("903003", (Map<String, Object>) new HashMap()));
    }

    private void g() {
        XMLView xMLView = this.f32417k;
        if (xMLView != null) {
            this.f32415i.a(xMLView);
            HashMap map = new HashMap();
            if (e() != null) {
                e().removeView(this.f32417k);
            }
            Map<String, Object> mapK = k();
            if (!mapK.isEmpty()) {
                map.putAll(mapK);
            }
            a(a("903005", (Map<String, Object>) map));
            this.f32417k = null;
        }
        Object objB = this.f31826d.b((Object) c.c("sdk_context"));
        if (objB instanceof Map) {
            Object obj = ((Map) objB).get("lifecycleListeners");
            if (obj instanceof List) {
                ((List) obj).clear();
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void a() {
        super.a();
        p();
    }

    private void b(View view) {
        if (view == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) view.getParent()).removeView(view);
    }

    @Override // com.mbridge.msdk.config.component.base.d
    public boolean a(Map<?, ?> map) {
        if (map != null && !map.isEmpty()) {
            Object obj = map.get(c.c("16"));
            if (obj instanceof Map) {
                Object obj2 = ((Map) obj).get(c.c("116"));
                if (obj2 instanceof String) {
                    String strValueOf = String.valueOf(obj2);
                    if (!TextUtils.isEmpty(strValueOf)) {
                        return strValueOf.equals(this.f32416j.d());
                    }
                }
            }
        }
        return false;
    }

    private void b(View view, com.mbridge.msdk.config.component.style.model.a aVar) {
        g gVarC;
        if (view == null || aVar == null) {
            return;
        }
        String strD = aVar.d();
        if (TextUtils.isEmpty(strD)) {
            strD = aVar.h();
        }
        String strC = aVar.c();
        Object objE = aVar.e();
        if (objE instanceof com.mbridge.msdk.config.component.animation.a) {
            com.mbridge.msdk.config.component.animation.a aVar2 = (com.mbridge.msdk.config.component.animation.a) objE;
            if (!TextUtils.isEmpty(aVar2.a())) {
                strD = aVar2.a();
            }
            strC = aVar2.b();
        }
        String str = strD;
        if (TextUtils.isEmpty(strC)) {
            strC = "start";
        }
        if (objE instanceof g) {
            gVarC = (g) objE;
        } else {
            gVarC = objE instanceof com.mbridge.msdk.config.component.animation.c ? ((com.mbridge.msdk.config.component.animation.c) objE).c() : null;
        }
        g gVar = gVarC;
        if (a(strC, str, gVar != null)) {
            return;
        }
        if (gVar != null) {
            boolean z10 = "1".equals(aVar.g()) || Boolean.parseBoolean(aVar.g());
            Animator animatorA = this.f32414h.a(gVar, view);
            if (animatorA == null) {
                return;
            }
            this.f32415i.a(str, gVar, view, animatorA, z10);
            return;
        }
        if (objE != null) {
            q0.b("StyleCpt", "Unsupported animationSpec type: " + objE.getClass().getName() + ", viewTag=" + aVar.h() + ", animationId=" + str);
        }
    }

    private void c(View view, com.mbridge.msdk.config.component.style.model.a aVar) {
        try {
            if (view == null) {
                q0.b("StyleCpt", "Widget view is null");
                return;
            }
            String strI = aVar.i();
            if (TextUtils.isEmpty(strI)) {
                return;
            }
            String[] strArrD = d(strI);
            if (strArrD.length != 2) {
                q0.b("StyleCpt", "Invalid widget location format: " + strI);
            } else {
                int i10 = Integer.parseInt(strArrD[0]);
                int i11 = Integer.parseInt(strArrD[1]);
                view.setX(i10);
                view.setY(i11);
            }
        } catch (Exception e10) {
            f2.q(e10, new StringBuilder("Error relocating widget: "), "StyleCpt");
        }
    }

    private void d(View view, com.mbridge.msdk.config.component.style.model.a aVar) {
        try {
            if (view == null) {
                q0.b("StyleCpt", "Widget view is null");
                return;
            }
            String strJ = aVar.j();
            if (TextUtils.isEmpty(strJ)) {
                return;
            }
            String[] strArrD = d(strJ);
            if (strArrD.length != 2) {
                q0.b("StyleCpt", "Invalid widget size format: " + strJ);
                return;
            }
            int i10 = Integer.parseInt(strArrD[0]);
            int i11 = Integer.parseInt(strArrD[1]);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = i10;
                layoutParams.height = i11;
                view.setLayoutParams(layoutParams);
            }
        } catch (Exception e10) {
            f2.q(e10, new StringBuilder("Error resizing widget: "), "StyleCpt");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements com.mbridge.msdk.config.component.style.inter.a {
        public a() {
        }

        @Override // com.mbridge.msdk.config.component.style.inter.a
        public void a(String str, Map<String, Object> map) {
            if (TextUtils.isEmpty(str)) {
                q0.b("StyleCpt", "Click tag is empty");
                return;
            }
            HashMap map2 = new HashMap();
            map2.put(c.c("view_tag"), str);
            if (map != null && !map.isEmpty()) {
                map2.putAll(map);
            }
            Map mapK = StyleCpt.this.k();
            if (!mapK.isEmpty()) {
                map2.put("all_properties", mapK);
            }
            StyleCpt styleCpt = StyleCpt.this;
            styleCpt.a(styleCpt.a("903010", (Map<String, Object>) map2));
        }

        @Override // com.mbridge.msdk.config.component.style.inter.a
        public void a(Map<String, Object> map) {
            if (map != null) {
                StyleCpt styleCpt = StyleCpt.this;
                styleCpt.a(styleCpt.a("903008", map));
            }
        }
    }

    private void a(String str, String str2) {
        q0.b("StyleCpt", str2);
        HashMap map = new HashMap();
        map.put(c.c("reason"), str2);
        map.put(c.c("code"), str);
        if (this.f32416j.e() != null) {
            q0.b("StyleCpt", map.toString());
        } else {
            a(a("903007", (Map<String, Object>) map));
        }
    }

    private void a(View view, com.mbridge.msdk.config.component.style.model.a aVar) {
        try {
            Object objB = aVar.b();
            View view2 = objB instanceof View ? (View) objB : null;
            if (view2 == null) {
                q0.b("StyleCpt", "Action view is null");
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (view2.getParent() != null) {
                    ((ViewGroup) view2.getParent()).removeView(view2);
                }
                viewGroup.addView(view2);
            }
        } catch (Exception e10) {
            f2.q(e10, new StringBuilder("Error adding widget: "), "StyleCpt");
        }
    }

    private View c(String str) {
        XMLView xMLView = this.f32417k;
        if (xMLView == null) {
            return e().findViewWithTag(str);
        }
        return xMLView.findViewWithTag(str);
    }

    private String[] d(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return str.replaceAll("[\\[\\]]", "").split(",");
    }

    private void b(int i10) {
        XMLView xMLView;
        String strD = this.f32416j.d();
        if (!TextUtils.isEmpty(strD) && !TextUtils.isEmpty(this.f32416j.b())) {
            try {
                XMLView xMLView2 = (XMLView) new com.mbridge.msdk.config.dynamic.a().a(this.f32416j.b(), e(), this.f31826d);
                this.f32417k = xMLView2;
                if (xMLView2 == null) {
                    a("2000004", "xml render fail");
                    return;
                }
                xMLView2.setRenderMap(strD);
                this.f32417k.setXmlViewActionListener(this.l);
                if (e() == null || (xMLView = this.f32417k) == null) {
                    return;
                }
                xMLView.setVisibility(i10);
                return;
            } catch (Exception e10) {
                a("2000004", e10.getMessage());
                return;
            }
        }
        a("2000001", "Template Url or path is empty");
    }

    private boolean a(String str, String str2, boolean z10) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (!"stop".equalsIgnoreCase(str) && !c.c("311").equals(str)) {
            if ("start".equalsIgnoreCase(str) || "animationStart".equalsIgnoreCase(str)) {
                if (z10) {
                    return false;
                }
                this.f32415i.d(str2);
                return true;
            }
            if (!CampaignEx.JSON_NATIVE_VIDEO_PAUSE.equalsIgnoreCase(str) && !"animationPause".equalsIgnoreCase(str)) {
                if (!CampaignEx.JSON_NATIVE_VIDEO_RESUME.equalsIgnoreCase(str) && !"animationResume".equalsIgnoreCase(str)) {
                    if (!"cancel".equalsIgnoreCase(str) && !"animationCancel".equalsIgnoreCase(str)) {
                        if (!"destroy".equalsIgnoreCase(str) && !"animationDestroy".equalsIgnoreCase(str)) {
                            return false;
                        }
                        this.f32415i.a(str2);
                        return true;
                    }
                    this.f32415i.a(str2, true);
                    return true;
                }
                this.f32415i.c(str2);
                return true;
            }
            this.f32415i.b(str2);
            return true;
        }
        this.f32415i.e(str2);
        return true;
    }

    private void a(View view) {
        if (view != null) {
            view.setVisibility(4);
            HashMap map = new HashMap();
            map.put(c.c("view_tag"), view.getTag());
            a(a("903009", (Map<String, Object>) map));
        }
    }

    private void a(int i10) {
        b(i10);
    }

    @Override // com.mbridge.msdk.config.component.vc.inter.a
    public void a(String str) {
        str.getClass();
        if (str.equals("onStop")) {
            o();
        } else if (str.equals(X3.i.f27817u0)) {
            n();
        }
    }
}
