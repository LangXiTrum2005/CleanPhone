package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.igq;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.ig;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class nr implements com.bytedance.sdk.openadsdk.core.co.ik.ka.ri, com.bytedance.sdk.openadsdk.core.co.ik.ri, igq, com.bytedance.sdk.openadsdk.core.jbs.vr {
    private dzy di;
    private final com.bytedance.sdk.openadsdk.core.ik.ri fi;
    private final com.bytedance.sdk.openadsdk.core.co.ik.lr ik;
    private final com.bytedance.sdk.openadsdk.core.di.ik ka;
    private final ri lr;
    private int mj;
    private boolean qt;
    private final com.bytedance.sdk.openadsdk.component.reward.ri.ri ri;
    private boolean sf;
    private int xha = 0;
    private int jbs = 1;

    public interface ri {
        void di();

        void fi();

        void ik();

        int ka();

        void lr();

        void ri();
    }

    public nr(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar, ri riVar2) {
        this.ri = riVar;
        this.lr = riVar2;
        this.ka = new com.bytedance.sdk.openadsdk.core.di.ik(riVar.ig) { // from class: com.bytedance.sdk.openadsdk.core.widget.nr.1
            @Override // android.view.View
            public void onWindowFocusChanged(boolean z) {
                super.onWindowFocusChanged(z);
                nr.this.ri(z);
            }
        };
        com.bytedance.sdk.openadsdk.core.co.ik.lr lrVar = new com.bytedance.sdk.openadsdk.core.co.ik.lr(riVar.srn, riVar.lr, true);
        this.ik = lrVar;
        lrVar.ri((com.bytedance.sdk.openadsdk.core.jbs.vr) this);
        lrVar.ri((com.bytedance.sdk.openadsdk.core.co.ik.ri) this);
        com.bytedance.sdk.openadsdk.core.co.ik.ik ikVarRi = lrVar.ri();
        if (ikVarRi instanceof com.bytedance.sdk.openadsdk.core.co.ik.ka) {
            com.bytedance.sdk.openadsdk.core.co.ik.ka kaVar = (com.bytedance.sdk.openadsdk.core.co.ik.ka) ikVarRi;
            kaVar.ri((com.bytedance.sdk.openadsdk.core.co.ik.ka.ri) this);
            dzy dzyVarFi = kaVar.fi();
            this.di = dzyVarFi;
            if (dzyVarFi != null) {
                dzyVarFi.ri((igq) this);
                this.di.lr(riVar.lr.fi());
            }
        }
        Context context = riVar.srn;
        wjv wjvVar = riVar.lr;
        com.bytedance.sdk.openadsdk.core.ik.ri riVar3 = new com.bytedance.sdk.openadsdk.core.ik.ri(context, wjvVar, wjvVar.fi(), ig.lr(riVar.lr));
        this.fi = riVar3;
        riVar3.ri(com.bytedance.sdk.openadsdk.ihz.ri.ri.ka.ri(com.bytedance.sdk.openadsdk.core.nr.ri(), riVar.lr.fi()));
        HashMap map = new HashMap();
        if (dw.lr(riVar.lr)) {
            map.put("click_scence", 3);
        } else {
            map.put("click_scence", 2);
        }
        riVar3.ri(map);
    }

    private void co() {
        this.ka.setVisibility(8);
    }

    private void qt() {
        this.xha++;
        ri riVar = this.lr;
        if (riVar != null) {
            riVar.ik();
        }
        ri(true);
        dzy dzyVar = this.di;
        if (dzyVar != null) {
            dzyVar.ri("popupDidShow", (JSONObject) null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            ri riVar2 = this.lr;
            if (riVar2 != null) {
                jSONObject2.put("click_countdown_remaining", Math.max(riVar2.ka(), 0));
            }
            jSONObject2.put("popup_sequence", this.xha);
            jSONObject.put("pag_json_data", jSONObject2.toString());
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.ac.ik("UserIdleAskDialog", e.getMessage());
        }
        wjv wjvVar = this.ri.lr;
        com.bytedance.sdk.openadsdk.ka.ik.lr(wjvVar, wjvVar.fi(), "show_popup", jSONObject);
    }

    private boolean sf() {
        return this.ka.isAttachedToWindow() && this.ka.getVisibility() == 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.vr
    public int fi() {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.vr
    public long ik() {
        return 0L;
    }

    public boolean jbs() {
        if (this.qt || !sf()) {
            return false;
        }
        n_();
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.vr
    public long ka() {
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.vr
    public void lr() {
    }

    public void mj() {
        this.qt = true;
        ViewParent parent = this.ka.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.ka);
        }
        com.bytedance.sdk.openadsdk.core.co.ik.lr lrVar = this.ik;
        if (lrVar != null) {
            lrVar.ka();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.igq
    public void n_() {
        if (this.qt || !sf()) {
            return;
        }
        co();
        ri riVar = this.lr;
        if (riVar != null) {
            riVar.lr();
        }
        ri(false);
        dzy dzyVar = this.di;
        if (dzyVar != null) {
            dzyVar.ri("popupDidDismiss", (JSONObject) null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.igq
    public int o_() {
        ri riVar = this.lr;
        if (riVar != null) {
            return riVar.ka();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.igq
    public void p_() {
        ri riVar = this.lr;
        if (riVar != null) {
            riVar.fi();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.igq
    public void q_() {
        ri riVar = this.lr;
        if (riVar != null) {
            riVar.di();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.igq
    public void r_() {
        this.jbs = 2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.vr
    public void ri() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.co.ik.ka.ri
    public void xha() {
        if (this.mj != 1) {
            return;
        }
        this.mj = 3;
        View viewIk = this.ik.ik();
        if (viewIk != null) {
            ViewGroup viewGroup = (ViewGroup) viewIk.getParent();
            if (viewGroup != null) {
                if (viewGroup == this.ka) {
                    return;
                } else {
                    viewGroup.removeView(viewIk);
                }
            }
            if (this.ka != null) {
                viewIk.setVisibility(0);
                this.ka.addView(viewIk, new ViewGroup.LayoutParams(-1, -1));
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.vr
    public void lr(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.vr
    public void ri(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.vr
    public boolean lr(JSONObject jSONObject) {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.vr
    public void ri(int i, com.bytedance.sdk.component.adexpress.lr.bgr bgrVar) {
    }

    private boolean lr(Activity activity) {
        if (!this.ka.isAttachedToWindow()) {
            Window window = activity.getWindow();
            if (window == null) {
                this.sf = false;
                return false;
            }
            this.sf = true;
            window.addContentView(this.ka, new WindowManager.LayoutParams(-1, -1));
        }
        this.ka.setVisibility(0);
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.vr
    public void ri(int i, String str) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.vr
    public void ri(boolean z, String str) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.vr
    public boolean ri(JSONObject jSONObject) {
        return false;
    }

    public void ri(ViewGroup viewGroup) {
        View viewIk = this.ik.ik();
        if (viewIk == null) {
            return;
        }
        viewIk.setVisibility(4);
        viewGroup.addView(viewIk, new ViewGroup.LayoutParams(-1, -1));
        this.ik.lr();
        this.mj = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(boolean z) {
        com.bytedance.sdk.openadsdk.core.co.ik.ik ikVarRi = this.ik.ri();
        if (ikVarRi instanceof com.bytedance.sdk.openadsdk.core.co.ik.ka) {
            ((com.bytedance.sdk.openadsdk.core.co.ik.ka) ikVarRi).ri(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.vr
    public void ri(String str, JSONObject jSONObject) {
        ri riVar;
        if (!"skipToNextAd".equals(str) || (riVar = this.lr) == null) {
            return;
        }
        riVar.ri();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.vr
    public void di() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.igq
    public void m_() {
    }

    public boolean ri(Activity activity) {
        if (!this.qt && activity != null && !activity.isFinishing()) {
            if (this.mj == 3 && this.jbs == 2) {
                if (this.ka.isAttachedToWindow() && this.ka.getVisibility() == 0) {
                    return true;
                }
                if (lr(activity)) {
                    qt();
                    return true;
                }
            }
            try {
                HashMap map = new HashMap();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("webview_status", this.mj);
                jSONObject.put("js_finish", this.jbs);
                jSONObject.put("has_window", this.sf ? 1 : 0);
                map.put("pag_json_data", jSONObject.toString());
                wjv wjvVar = this.ri.lr;
                com.bytedance.sdk.openadsdk.ka.ik.ri("show_popup_fail", wjvVar, wjvVar.fi(), map);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.co.ik.ri
    public void ri(View view, int i, com.bytedance.sdk.component.adexpress.ik ikVar) {
        if (i == 2) {
            com.bytedance.sdk.openadsdk.core.model.slm slmVar = (com.bytedance.sdk.openadsdk.core.model.slm) ikVar;
            String str = slmVar.xha;
            if (slmVar.f18141co > 0) {
                com.bytedance.sdk.openadsdk.core.ig.ri(true);
            }
            this.fi.ri(str);
            this.fi.ri(view, slmVar.ri, slmVar.lr, slmVar.ik, slmVar.ka, slmVar.qt, slmVar.sf);
            this.ri.qd.gcp();
            com.bytedance.sdk.openadsdk.core.ig.ri(false);
            com.bytedance.sdk.openadsdk.ay.lr.fi.ri(this.ri.lr, 9);
        }
    }
}
