package com.bytedance.sdk.openadsdk.component.reward.lr;

import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.openadsdk.component.reward.ri.co;
import com.bytedance.sdk.openadsdk.component.reward.ri.slm;
import com.bytedance.sdk.openadsdk.component.reward.ri.vr;
import com.bytedance.sdk.openadsdk.component.reward.view.sf;
import com.bytedance.sdk.openadsdk.core.model.ac;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    protected final sf di;
    protected final vr fi;
    protected int ik;
    protected com.bytedance.sdk.openadsdk.core.bgr.ka.lr jbs;
    protected int ka;
    protected wjv lr;
    protected final co mj;
    protected igq qt;
    protected com.bytedance.sdk.openadsdk.component.reward.ri.ri ri;
    protected final slm xha;

    public ri(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        this.ri = riVar;
        this.lr = riVar.lr;
        this.ik = riVar.whw;
        this.ka = riVar.xm;
        this.fi = riVar.ihz;
        this.di = riVar.dzy;
        this.xha = riVar.ory;
        this.mj = riVar.oh;
    }

    public void ik() {
        if (dw.lr(this.ri.lr) && DeviceUtils.xha() == 0) {
            this.ri.zyn = true;
        }
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.ri;
        riVar.oh.lr(riVar.zyn);
    }

    public boolean lr() {
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.ri;
        boolean z = riVar.ajz == null;
        boolean zXha = riVar.ihz.xha();
        boolean z2 = ac.ik(this.ri.lr) || !wjv.fi(this.ri.lr);
        if (z && zXha && z2) {
            return false;
        }
        boolean zLr = ac.lr(this.ri.lr);
        boolean z3 = this.ri.slm.get();
        if (zLr && z3) {
            FrameLayout frameLayoutDi = this.ri.dzy.di();
            frameLayoutDi.setVisibility(4);
            frameLayoutDi.setVisibility(0);
            return false;
        }
        boolean z4 = this.ri.jbs.get();
        boolean z5 = this.ri.qt.get();
        if (z4 || z5) {
            return false;
        }
        return this.ri.ihz.jbs() || this.ri.ihz.hcw();
    }

    public void ri(com.bytedance.sdk.openadsdk.core.bgr.ka.lr lrVar, igq igqVar) {
        this.jbs = lrVar;
        this.qt = igqVar;
    }

    public boolean ri() {
        return this.ri.lr.zz() || this.ri.lr.vz() == 15 || this.ri.lr.vz() == 5 || this.ri.lr.vz() == 50;
    }

    public void ri(boolean z) {
        if (this.ri.jbs.get()) {
            return;
        }
        wjv wjvVar = this.lr;
        if (wjvVar != null && wjvVar.vgs()) {
            this.mj.ik(false);
            this.mj.ri(true);
            this.ri.dzy.lr(8);
            this.ri.dzy.ka(8);
            return;
        }
        if (!z) {
            this.mj.ik(false);
            this.mj.ri(false);
            this.mj.ka(false);
            this.ri.dzy.di(8);
        } else {
            this.mj.ri(this.ri.lr.nlk());
            if (ri()) {
                this.mj.ik(true);
            }
            if (!ri() && (!(this instanceof xha) || !this.ri.lr.di())) {
                this.mj.fi();
                this.ri.dzy.di(0);
            } else {
                this.mj.ka(true);
            }
        }
        if (z) {
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.ri;
            if (riVar.siy != com.bytedance.sdk.openadsdk.component.reward.view.ik.ri) {
                riVar.dzy.lr(8);
                this.ri.dzy.ka(8);
                return;
            } else {
                riVar.dzy.lr(0);
                this.ri.dzy.ik(0);
                this.ri.dzy.ka(0);
                return;
            }
        }
        this.ri.dzy.lr(4);
        this.ri.dzy.ik(8);
        this.ri.dzy.ka(8);
    }
}
