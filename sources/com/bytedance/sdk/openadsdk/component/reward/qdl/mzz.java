package com.bytedance.sdk.openadsdk.component.reward.qdl;

import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.hkc;
import com.bytedance.sdk.openadsdk.core.model.aaj;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.oth;
import java.util.HashMap;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mzz {
    private qdl lnr;
    private final com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdl;
    private final com.bytedance.sdk.openadsdk.component.reward.view.jpc ud;

    public interface qdl {
        void qdl(boolean z2, boolean z3, boolean z4, com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar, int i2);
    }

    public mzz(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        this.qdl = qdlVar;
        this.ud = new com.bytedance.sdk.openadsdk.component.reward.view.jpc(qdlVar);
    }

    private int mo() {
        int iGuw = this.qdl.ud.guw();
        if (iGuw <= 5000 && iGuw >= 0) {
            if (iGuw < 1000) {
                iGuw += 1000;
            }
            int iQdl = com.bytedance.sdk.openadsdk.core.yt.mml().qdl(this.qdl.ud.fz());
            if (iQdl <= 5000 && iQdl >= 0) {
                if (iQdl < 1000) {
                    iQdl += 1000;
                }
                return Math.min(iGuw, iQdl);
            }
        }
        return -1;
    }

    public void lnr() {
        this.ud.mml();
    }

    public void mml() {
        qdl(true);
    }

    public boolean mzz() {
        return this.ud.mzz();
    }

    public void qdl() {
        this.ud.qdl();
    }

    public void ud() {
        this.ud.lnr();
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.lnr.mzz mzzVar) {
        this.ud.qdl(mzzVar);
    }

    public boolean ud(com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar) {
        boolean z2;
        this.qdl.jpc = mo();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
        int i2 = qdlVar.jpc;
        if (qdlVar.ud.jtx()) {
            return false;
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.qdl;
        int i3 = qdlVar2.jpc;
        if (i3 != -1) {
            if (i3 >= 0) {
                qdlVar2.jyq.set(false);
                Message messageObtain = Message.obtain();
                messageObtain.what = 700;
                com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar3 = this.qdl;
                messageObtain.arg1 = qdlVar3.jpc;
                qdlVar3.cx.sendMessage(messageObtain);
                if (!vu.wd(this.qdl.ud)) {
                    z2 = true;
                }
            }
            z2 = false;
        } else if (qdlVar2.lq == null && vu.jpc(qdlVar2.ud) && this.qdl.hkc.exu()) {
            udVar.ljh();
            z2 = false;
        } else {
            udVar.bjy();
            z2 = true;
        }
        if (this.qdl.hkc.aaj() ? false : z2) {
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar4 = this.qdl;
            if (qdlVar4.kab == null || !qdlVar4.mml()) {
                return true;
            }
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar5 = this.qdl;
            qdlVar5.kab.qdl(qdlVar5.jpc);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0138  */
    public void qdl(boolean z2, boolean z3, boolean z4, com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar, int i2) {
        if (this.qdl != null) {
            com.bytedance.sdk.openadsdk.mo.ud.qdl().qdl("videoForceBreak", this.qdl.ud);
            com.bytedance.sdk.openadsdk.bch.qdl.lnr.ud(this.qdl.ud);
        }
        Objects.toString(udVar);
        if (this.qdl.ag.isFinishing() || udVar == null) {
            return;
        }
        this.qdl.gy.fs();
        if (z3) {
            this.qdl.bjy.set(true);
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
        boolean z5 = false;
        if (qdlVar.nz && !qdlVar.jtx.get() && !aaj.fs(this.qdl.ud) && !aaj.rq(this.qdl.ud) && (!aaj.ud(this.qdl.ud) || !this.qdl.bjy.get() || !this.qdl.yt.get())) {
            if ((aaj.ud(this.qdl.ud) && z4) || !ud(z3)) {
                return;
            }
            if (aaj.ud(this.qdl.ud) || aaj.mml(this.qdl.ud) || aaj.wd(this.qdl.ud)) {
                this.qdl.fco.lnr(false);
                udVar.bjy();
                return;
            }
        }
        if (this.qdl.ag.isDestroyed() || this.qdl.ag.isFinishing()) {
            return;
        }
        if (this.qdl.ud.au()) {
            com.bytedance.sdk.openadsdk.component.reward.view.to toVar = this.qdl.bqt;
            com.bytedance.sdk.openadsdk.core.tvp.lnr brandBannerController = (toVar == null || toVar.qdl() == null) ? null : toVar.qdl().getBrandBannerController();
            if (brandBannerController != null) {
                brandBannerController.ud();
            }
            this.qdl.ag.finish();
            return;
        }
        qdl qdlVar2 = this.lnr;
        if (qdlVar2 != null) {
            qdlVar2.qdl(z2, z3, z4, udVar, i2);
            return;
        }
        this.qdl.bch.exc();
        this.qdl.hkc.oth();
        this.qdl.rq.set(false);
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar3 = this.qdl;
        if (qdlVar3.qk) {
            com.bytedance.sdk.openadsdk.activity.jpc jpcVar = qdlVar3.lq;
            if (!(jpcVar instanceof com.bytedance.sdk.openadsdk.activity.mzz) || jpcVar.ag()) {
                this.qdl.fs.set(false);
            }
        } else {
            this.qdl.fs.set(false);
        }
        this.qdl.kdv.qdl();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar4 = this.qdl;
        fs fsVar = qdlVar4.fco;
        if (!qdlVar4.wd && qdlVar4.ud.tvf()) {
            z5 = true;
        }
        fsVar.qdl(z5);
        if (this.qdl.to.getAndSet(true)) {
            return;
        }
        if (vu.ud(this.qdl.ud) && this.qdl.rzg) {
            qdl(z2, z3, z4, i2);
            this.qdl.gy.mml(8);
            this.qdl.fco.lnr(true);
            this.qdl.gy.lnr();
            com.bytedance.sdk.openadsdk.component.reward.view.to toVar2 = this.qdl.bqt;
            if (toVar2 != null) {
                toVar2.mo();
            }
            this.qdl.xmv.to();
            return;
        }
        qdl(z2, udVar);
    }

    private boolean ud(boolean z2) {
        com.bytedance.sdk.openadsdk.component.reward.view.mml mmlVarQdl;
        if (!aaj.lnr(this.qdl.ud) || (mmlVarQdl = this.qdl.bqt.qdl()) == null || mmlVarQdl.mml != 0 || z2) {
            return true;
        }
        this.qdl.fco.lnr(false);
        return false;
    }

    private void qdl(boolean z2, boolean z3, boolean z4, int i2) {
        int i3;
        HashMap map = new HashMap();
        if (this.qdl.hkc.koa()) {
            i3 = 1;
        } else {
            i3 = !this.qdl.hkc.rdp() ? -1 : 2;
        }
        map.put("webview_state", Integer.valueOf(i3));
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(qdlVar.ud, qdlVar.mzz, z2, z3, z4, qdlVar.ag.isFinishing(), i2, map);
    }

    public void qdl(boolean z2, com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar) {
        exu exuVar;
        this.qdl.jl.set(z2);
        udVar.rdp();
        this.qdl.ud.uj();
        this.qdl.fco.mml(false);
        this.qdl.fco.lnr(false);
        this.qdl.hkc.ljh();
        aaj aajVar = this.qdl.gy.bjy;
        if (aajVar != null) {
            aajVar.mzz();
        }
        this.qdl.gy.lnr();
        com.bytedance.sdk.openadsdk.component.reward.view.to toVar = this.qdl.bqt;
        if (toVar != null) {
            toVar.mo();
        }
        jpc jpcVar = this.qdl.xmv;
        if (jpcVar != null) {
            jpcVar.lnr(jpc.ud);
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
        if (!TextUtils.isEmpty(ljh.qdl(qdlVar.om, qdlVar.ud))) {
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.qdl;
            oth.qdl(qdlVar2.ag, vu.fs(qdlVar2.ud), this.qdl.ud, com.bytedance.sdk.openadsdk.mml.ud.qdl.lnr);
            return;
        }
        if (ljh.lnr(this.qdl.ud) && (exuVar = this.qdl.hzv) != null) {
            exuVar.mo();
        }
        if (!ljh.qdl(this.qdl.ud) && (ljh.lnr(this.qdl.ud) || !this.qdl.hkc.rc())) {
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar3 = this.qdl;
            if (ljh.qdl(qdlVar3.ud, qdlVar3.hkc.exu(), this.qdl.hkc.hkc(), this.qdl.hzv.fs(), this.qdl.hkc.bch())) {
                if (!ljh.mml(this.qdl.ud) && !ljh.lnr(this.qdl.ud)) {
                    this.qdl.hkc.qdl(true, 0, (String) null);
                }
                ud(udVar);
                qdl(udVar);
                return;
            }
        }
        mml();
    }

    public void qdl(com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar) {
        if (!ljh.lnr(this.qdl.ud)) {
            this.qdl.hzv.qdl(8);
            this.qdl.hkc.qdl(0);
            this.qdl.hkc.kdv();
        } else {
            this.qdl.hkc.qdl(8);
            this.qdl.hzv.qdl(0);
            this.qdl.hzv.wd();
        }
        if (this.qdl.wd) {
            ax.qdl((View) udVar.rdp, 0);
            this.qdl.gy.mo(8);
        }
        this.qdl.gy.mml(8);
        this.qdl.gy.wd();
        if (ljh.lnr(this.qdl.ud)) {
            this.qdl.cx.sendEmptyMessageDelayed(800, 100L);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
        qdlVar.hkc.qdl(qdlVar.gt, true);
        this.qdl.hkc.lnr(true);
        this.qdl.hkc.ud(true);
        hkc hkcVarTvp = this.qdl.hkc.tvp();
        if (hkcVarTvp != null) {
            hkcVarTvp.qdl("prerender_page_show", (JSONObject) null);
        }
        if (!vu.ud(this.qdl.ud)) {
            this.qdl.fco.lnr(false);
        }
        com.bytedance.sdk.component.tvp.mo moVarJpc = this.qdl.hkc.jpc();
        if (moVarJpc == null || moVarJpc.getWebView() == null) {
            return;
        }
        moVarJpc.exu();
        moVarJpc.getWebView().resumeTimers();
    }

    public void qdl(boolean z2) {
        if (!ljh.mml(this.qdl.ud)) {
            this.qdl.hkc.qdl(false, 408, "end_card_timeout");
        }
        this.qdl.hkc.uw();
        this.qdl.hkc.qdl(8);
        this.qdl.hzv.qdl(8);
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
        if (qdlVar.wd) {
            ax.qdl((View) qdlVar.en.rdp, 8);
            this.qdl.gy.mo(0);
        }
        this.qdl.gy.mml(8);
        if (this.qdl.ud.uj()) {
            if (!this.ud.qdl(this.qdl.bch)) {
                this.qdl.ag.finish();
            }
        } else {
            com.bytedance.sdk.openadsdk.activity.jpc jpcVar = this.qdl.lq;
            if (jpcVar != null) {
                this.ud.qdl(jpcVar.cx().tvp());
            }
            this.ud.ud();
        }
        this.qdl.gy.wd();
        if (z2) {
            ud(this.qdl.en);
        }
        this.qdl.fco.lnr(false);
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.qdl;
        qdlVar2.vu.qdl(qdlVar2.ud.mq());
    }

    public void qdl(qdl qdlVar) {
        this.lnr = qdlVar;
    }
}
