package com.bytedance.sdk.openadsdk.component.reward.ud;

import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.koa;
import com.bytedance.sdk.openadsdk.component.reward.qdl.bjy;
import com.bytedance.sdk.openadsdk.component.reward.qdl.fs;
import com.bytedance.sdk.openadsdk.component.reward.qdl.jtx;
import com.bytedance.sdk.openadsdk.core.model.aaj;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    protected final fs jpc;
    protected int lnr;
    protected int mml;
    protected final com.bytedance.sdk.openadsdk.component.reward.view.fs mo;
    protected final bjy mzz;
    protected com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdl;
    protected koa to;
    protected com.bytedance.sdk.openadsdk.core.exu.mml.ud tvp;
    protected ljh ud;
    protected final jtx wd;

    public qdl(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        this.qdl = qdlVar;
        this.ud = qdlVar.ud;
        this.lnr = qdlVar.tid;
        this.mml = qdlVar.sy;
        this.mzz = qdlVar.bch;
        this.mo = qdlVar.gy;
        this.wd = qdlVar.hkc;
        this.jpc = qdlVar.fco;
    }

    public void lnr() {
        if (vu.ud(this.qdl.ud) && DeviceUtils.wd() == 0) {
            this.qdl.gt = true;
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
        qdlVar.fco.ud(qdlVar.gt);
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.exu.mml.ud udVar, koa koaVar) {
        this.tvp = udVar;
        this.to = koaVar;
    }

    public boolean ud() {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
        if (qdlVar.lq == null && qdlVar.bch.wd() && (aaj.lnr(this.qdl.ud) || !ljh.mzz(this.qdl.ud))) {
            return false;
        }
        if (!aaj.ud(this.qdl.ud) || !this.qdl.exc.get()) {
            return (this.qdl.to.get() || this.qdl.rq.get()) ? false : true;
        }
        FrameLayout frameLayoutMo = this.qdl.gy.mo();
        frameLayoutMo.setVisibility(4);
        frameLayoutMo.setVisibility(0);
        return false;
    }

    public boolean qdl() {
        return this.qdl.ud.uj() || this.qdl.ud.vxg() == 15 || this.qdl.ud.vxg() == 5 || this.qdl.ud.vxg() == 50;
    }

    public void qdl(boolean z2) {
        if (this.qdl.to.get()) {
            return;
        }
        ljh ljhVar = this.ud;
        if (ljhVar != null && ljhVar.au()) {
            this.jpc.lnr(false);
            this.jpc.qdl(true);
            this.qdl.gy.ud(8);
            this.qdl.gy.mml(8);
            return;
        }
        if (!z2) {
            this.jpc.lnr(false);
            this.jpc.qdl(false);
            this.jpc.mml(false);
            this.qdl.gy.mo(8);
        } else {
            this.jpc.qdl(this.qdl.ud.tvf());
            if (qdl()) {
                this.jpc.lnr(true);
            }
            if (!qdl() && (!(this instanceof wd) || !this.qdl.ud.mo())) {
                this.jpc.mzz();
                this.qdl.gy.mo(0);
            } else {
                this.jpc.mml(true);
            }
        }
        if (z2) {
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
            if (qdlVar.taz != com.bytedance.sdk.openadsdk.component.reward.view.mml.qdl) {
                qdlVar.gy.ud(8);
                this.qdl.gy.mml(8);
                return;
            } else {
                qdlVar.gy.ud(0);
                this.qdl.gy.lnr(0);
                this.qdl.gy.mml(0);
                return;
            }
        }
        this.qdl.gy.ud(4);
        this.qdl.gy.lnr(8);
        this.qdl.gy.mml(8);
    }
}
