package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.core.fco;
import com.bytedance.sdk.openadsdk.core.hkc;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.core.xmv;
import com.bytedance.sdk.openadsdk.utils.gy;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class jl implements com.bytedance.sdk.openadsdk.core.rq.lnr.mml.qdl, com.bytedance.sdk.openadsdk.core.rq.lnr.qdl, com.bytedance.sdk.openadsdk.core.tvp.bjy, xmv {
    private int jpc;
    private final com.bytedance.sdk.openadsdk.core.rq.lnr.ud lnr;
    private final com.bytedance.sdk.openadsdk.core.mo.lnr mml;
    private hkc mo;
    private final com.bytedance.sdk.openadsdk.core.lnr.qdl mzz;
    private final com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdl;
    private boolean rq;
    private boolean to;
    private final qdl ud;
    private int wd = 0;
    private int tvp = 1;

    public interface qdl {
        void lnr();

        int mml();

        void mo();

        void mzz();

        void qdl();

        void ud();
    }

    public jl(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar, qdl qdlVar2) {
        this.qdl = qdlVar;
        this.ud = qdlVar2;
        this.mml = new com.bytedance.sdk.openadsdk.core.mo.lnr(qdlVar.ag) { // from class: com.bytedance.sdk.openadsdk.core.widget.jl.1
            @Override // android.view.View
            public void onWindowFocusChanged(boolean z2) {
                super.onWindowFocusChanged(z2);
                jl.this.qdl(z2);
            }
        };
        com.bytedance.sdk.openadsdk.core.rq.lnr.ud udVar = new com.bytedance.sdk.openadsdk.core.rq.lnr.ud(qdlVar.om, qdlVar.ud, true);
        this.lnr = udVar;
        udVar.qdl((com.bytedance.sdk.openadsdk.core.tvp.bjy) this);
        udVar.qdl((com.bytedance.sdk.openadsdk.core.rq.lnr.qdl) this);
        com.bytedance.sdk.openadsdk.core.rq.lnr.lnr lnrVarQdl = udVar.qdl();
        if (lnrVarQdl instanceof com.bytedance.sdk.openadsdk.core.rq.lnr.mml) {
            com.bytedance.sdk.openadsdk.core.rq.lnr.mml mmlVar = (com.bytedance.sdk.openadsdk.core.rq.lnr.mml) lnrVarQdl;
            mmlVar.qdl((com.bytedance.sdk.openadsdk.core.rq.lnr.mml.qdl) this);
            hkc hkcVarMzz = mmlVar.mzz();
            this.mo = hkcVarMzz;
            if (hkcVarMzz != null) {
                hkcVarMzz.qdl((xmv) this);
                this.mo.ud(qdlVar.ud.mzz());
            }
        }
        Context context = qdlVar.om;
        ljh ljhVar = qdlVar.ud;
        com.bytedance.sdk.openadsdk.core.lnr.qdl qdlVar3 = new com.bytedance.sdk.openadsdk.core.lnr.qdl(context, ljhVar, ljhVar.mzz(), gy.ud(qdlVar.ud));
        this.mzz = qdlVar3;
        qdlVar3.qdl(com.bytedance.sdk.openadsdk.exc.qdl.qdl.wd.qdl(com.bytedance.sdk.openadsdk.core.yt.qdl(), qdlVar.ud.mzz()));
        HashMap map = new HashMap();
        if (vu.ud(qdlVar.ud)) {
            map.put("click_scence", 3);
        } else {
            map.put("click_scence", 2);
        }
        qdlVar3.qdl(map);
    }

    private void exu() {
        this.mml.setVisibility(8);
    }

    private boolean fs() {
        return this.mml.isAttachedToWindow() && this.mml.getVisibility() == 0;
    }

    private void rq() {
        this.wd++;
        qdl qdlVar = this.ud;
        if (qdlVar != null) {
            qdlVar.lnr();
        }
        qdl(true);
        hkc hkcVar = this.mo;
        if (hkcVar != null) {
            hkcVar.qdl("popupDidShow", (JSONObject) null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            qdl qdlVar2 = this.ud;
            if (qdlVar2 != null) {
                jSONObject2.put("click_countdown_remaining", Math.max(qdlVar2.mml(), 0));
            }
            jSONObject2.put("popup_sequence", this.wd);
            jSONObject.put("pag_json_data", jSONObject2.toString());
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.aaj.lnr("UserIdleAskDialog", e2.getMessage());
        }
        ljh ljhVar = this.qdl.ud;
        com.bytedance.sdk.openadsdk.mml.lnr.ud(ljhVar, ljhVar.mzz(), "show_popup", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.lnr.mml.qdl
    public void jpc() {
        this.jpc = 2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.xmv
    public void k_() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.xmv
    public void l_() {
        if (this.to || !fs()) {
            return;
        }
        exu();
        qdl qdlVar = this.ud;
        if (qdlVar != null) {
            qdlVar.ud();
        }
        qdl(false);
        hkc hkcVar = this.mo;
        if (hkcVar != null) {
            hkcVar.qdl("popupDidDismiss", (JSONObject) null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.bjy
    public long lnr() {
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.xmv
    public int m_() {
        qdl qdlVar = this.ud;
        if (qdlVar != null) {
            return qdlVar.mml();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.bjy
    public long mml() {
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.bjy
    public void mo() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.bjy
    public int mzz() {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.xmv
    public void n_() {
        qdl qdlVar = this.ud;
        if (qdlVar != null) {
            qdlVar.mzz();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.xmv
    public void o_() {
        qdl qdlVar = this.ud;
        if (qdlVar != null) {
            qdlVar.mo();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.xmv
    public void p_() {
        this.tvp = 2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.bjy
    public void qdl() {
    }

    public boolean to() {
        if (this.to || !fs()) {
            return false;
        }
        l_();
        return true;
    }

    public void tvp() {
        this.to = true;
        ViewParent parent = this.mml.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.mml);
        }
        com.bytedance.sdk.openadsdk.core.rq.lnr.ud udVar = this.lnr;
        if (udVar != null) {
            udVar.mml();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.bjy
    public void ud() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.lnr.mml.qdl
    public void wd() {
        if (this.jpc != 1) {
            return;
        }
        this.jpc = 3;
        View viewLnr = this.lnr.lnr();
        if (viewLnr != null) {
            ViewGroup viewGroup = (ViewGroup) viewLnr.getParent();
            if (viewGroup != null) {
                if (viewGroup == this.mml) {
                    return;
                } else {
                    viewGroup.removeView(viewLnr);
                }
            }
            if (this.mml != null) {
                viewLnr.setVisibility(0);
                this.mml.addView(viewLnr, new ViewGroup.LayoutParams(-1, -1));
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.bjy
    public void qdl(int i2) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.bjy
    public void ud(int i2) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.bjy
    public void qdl(int i2, com.bytedance.sdk.component.adexpress.ud.rdp rdpVar) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.bjy
    public boolean ud(JSONObject jSONObject) {
        return false;
    }

    private boolean ud(Activity activity) {
        if (!this.mml.isAttachedToWindow()) {
            Window window = activity.getWindow();
            if (window == null) {
                this.rq = false;
                return false;
            }
            this.rq = true;
            window.addContentView(this.mml, new WindowManager.LayoutParams(-1, -1));
        }
        this.mml.setVisibility(0);
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.bjy
    public void qdl(int i2, String str) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.bjy
    public void qdl(boolean z2, String str) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.bjy
    public boolean qdl(JSONObject jSONObject) {
        return false;
    }

    public void qdl(ViewGroup viewGroup) {
        View viewLnr = this.lnr.lnr();
        if (viewLnr == null) {
            return;
        }
        viewLnr.setVisibility(4);
        viewGroup.addView(viewLnr, new ViewGroup.LayoutParams(-1, -1));
        this.lnr.ud();
        this.jpc = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(boolean z2) {
        com.bytedance.sdk.openadsdk.core.rq.lnr.lnr lnrVarQdl = this.lnr.qdl();
        if (lnrVarQdl instanceof com.bytedance.sdk.openadsdk.core.rq.lnr.mml) {
            ((com.bytedance.sdk.openadsdk.core.rq.lnr.mml) lnrVarQdl).qdl(z2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tvp.bjy
    public void qdl(String str, JSONObject jSONObject) {
        qdl qdlVar;
        if (!"skipToNextAd".equals(str) || (qdlVar = this.ud) == null) {
            return;
        }
        qdlVar.qdl();
    }

    public boolean qdl(Activity activity) {
        if (!this.to && activity != null && !activity.isFinishing()) {
            if (this.jpc == 3 && this.tvp == 2) {
                if (this.mml.isAttachedToWindow() && this.mml.getVisibility() == 0) {
                    return true;
                }
                if (ud(activity)) {
                    rq();
                    return true;
                }
            }
            try {
                HashMap map = new HashMap();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("webview_status", this.jpc);
                jSONObject.put("js_finish", this.tvp);
                jSONObject.put("has_window", this.rq ? 1 : 0);
                map.put("pag_json_data", jSONObject.toString());
                ljh ljhVar = this.qdl.ud;
                com.bytedance.sdk.openadsdk.mml.lnr.qdl("show_popup_fail", ljhVar, ljhVar.mzz(), map);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.rq.lnr.qdl
    public void qdl(View view, int i2, com.bytedance.sdk.component.adexpress.lnr lnrVar) {
        if (i2 == 2) {
            com.bytedance.sdk.openadsdk.core.model.jtx jtxVar = (com.bytedance.sdk.openadsdk.core.model.jtx) lnrVar;
            String str = jtxVar.wd;
            if (jtxVar.fs > 0) {
                fco.qdl(true);
            }
            this.mzz.qdl(str);
            this.mzz.qdl(view, jtxVar.qdl, jtxVar.ud, jtxVar.lnr, jtxVar.mml, jtxVar.to, jtxVar.rq);
            this.qdl.wc.car();
            fco.qdl(false);
            com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(this.qdl.ud, 9);
        }
    }
}
