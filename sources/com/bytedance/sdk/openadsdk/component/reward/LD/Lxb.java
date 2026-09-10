package com.bytedance.sdk.openadsdk.component.reward.LD;

import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.aH;
import com.bytedance.sdk.openadsdk.component.reward.Lxb.STP;
import com.bytedance.sdk.openadsdk.component.reward.Lxb.brP;
import com.bytedance.sdk.openadsdk.component.reward.Lxb.kqm;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    protected final kqm JXs;
    protected tD LD;
    protected com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb Lxb;
    protected final STP OY;
    protected com.bytedance.sdk.openadsdk.core.NXR.ZU.LD QAg;
    protected int ZU;
    protected final brP ebl;
    protected final com.bytedance.sdk.openadsdk.component.reward.view.nBu lc;
    protected int lk;
    protected aH nBu;

    public Lxb(com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb) {
        this.Lxb = lxb;
        this.LD = lxb.LD;
        this.lk = lxb.uxf;
        this.ZU = lxb.Nu;
        this.JXs = lxb.eK;
        this.lc = lxb.BcA;
        this.ebl = lxb.hg;
        this.OY = lxb.nJ;
    }

    public boolean LD() {
        if (!com.bytedance.sdk.openadsdk.core.model.kqm.LD(this.Lxb.LD) || !this.Lxb.tD.get()) {
            return (this.Lxb.nBu.get() || this.Lxb.JVA.get() || eK.brP(this.Lxb.LD)) ? false : true;
        }
        FrameLayout frameLayoutLc = this.Lxb.BcA.lc();
        frameLayoutLc.setVisibility(4);
        frameLayoutLc.setVisibility(0);
        return false;
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.NXR.ZU.LD ld, aH aHVar) {
        this.QAg = ld;
        this.nBu = aHVar;
    }

    public void lk() {
        if (eK.LD(this.Lxb.LD) && DeviceUtils.ebl() == 0) {
            this.Lxb.Of = true;
        }
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.Lxb;
        lxb.nJ.LD(lxb.Of);
    }

    public boolean Lxb() {
        return this.Lxb.LD.chu() || this.Lxb.LD.FGm() == 15 || this.Lxb.LD.FGm() == 5 || this.Lxb.LD.FGm() == 50;
    }

    public void Lxb(boolean z) {
        if (this.Lxb.nBu.get()) {
            return;
        }
        tD tDVar = this.LD;
        if (tDVar != null && tDVar.JP()) {
            this.OY.lk(false);
            this.OY.Lxb(true);
            this.Lxb.BcA.LD(8);
            this.Lxb.BcA.lk(8);
            return;
        }
        if (!z) {
            this.OY.lk(false);
            this.OY.Lxb(false);
            this.OY.ZU(false);
            this.Lxb.BcA.JXs(8);
        } else {
            this.OY.Lxb(this.Lxb.LD.FV());
            if (eK.brP(this.Lxb.LD) || Lxb()) {
                this.OY.lk(true);
            }
            if (!Lxb() && (!(this instanceof OY) || !this.Lxb.LD.Lxb())) {
                this.OY.lc();
                this.Lxb.BcA.JXs(0);
            } else {
                this.OY.ZU(true);
            }
        }
        if (z) {
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.Lxb;
            if (lxb.Sv != com.bytedance.sdk.openadsdk.component.reward.view.LD.Lxb) {
                lxb.BcA.LD(8);
                this.Lxb.BcA.lk(8);
                return;
            } else {
                lxb.BcA.LD(0);
                this.Lxb.BcA.lk(0);
                return;
            }
        }
        this.Lxb.BcA.LD(4);
        this.Lxb.BcA.lk(8);
    }
}
