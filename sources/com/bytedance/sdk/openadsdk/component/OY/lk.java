package com.bytedance.sdk.openadsdk.component.OY;

import android.content.Context;
import android.os.Build;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.ZU.JXs.LD.IeN;
import com.bytedance.sdk.openadsdk.core.model.tD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.OK;

/* JADX INFO: loaded from: classes2.dex */
public class lk implements com.bytedance.sdk.openadsdk.core.LD.Lxb.InterfaceC0093Lxb {
    private boolean JXs = false;
    private FrameLayout LD;
    private Context Lxb;
    private LD ZU;
    private tD lk;

    public lk(Context context) {
        this.Lxb = context.getApplicationContext();
    }

    public void JVA() {
        LD ld = this.ZU;
        if (ld == null) {
            return;
        }
        this.Lxb = null;
        ld.lk();
        this.ZU = null;
    }

    public boolean JXs() {
        LD ld = this.ZU;
        return (ld == null || ld.sLN() == null || !this.ZU.sLN().ebl()) ? false : true;
    }

    public boolean LD() {
        return this.JXs;
    }

    public void Lxb(FrameLayout frameLayout, tD tDVar) {
        this.LD = frameLayout;
        this.lk = tDVar;
        this.ZU = new LD(this.Lxb, frameLayout, tDVar);
    }

    public long NXR() {
        LD ld = this.ZU;
        if (ld != null) {
            return ld.lc();
        }
        return 0L;
    }

    public void OY() {
        try {
            if (JXs()) {
                nBu();
            }
        } catch (Throwable th) {
            sLN.Lxb("TTAppOpenVideoManager", "onContinue throw Exception :" + th.getMessage());
        }
    }

    public void QAg() {
        LD ld = this.ZU;
        if (ld == null) {
            return;
        }
        ld.lk();
        this.ZU = null;
    }

    public long STP() {
        LD ld = this.ZU;
        if (ld == null) {
            return 0L;
        }
        return this.ZU.lc() + ld.OY();
    }

    public boolean ZU() {
        LD ld = this.ZU;
        return (ld == null || ld.sLN() == null || !this.ZU.sLN().lc()) ? false : true;
    }

    public void ebl() {
        try {
            if (ZU()) {
                this.ZU.Lxb();
            }
        } catch (Throwable th) {
            sLN.Lxb("TTAppOpenVideoManager", "open_ad", AbstractC3888ke0.l(th, new StringBuilder("AppOpenVideoManager onPause throw Exception :")));
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.LD.Lxb.InterfaceC0093Lxb
    public long getVideoProgress() {
        return sLN();
    }

    public boolean lc() {
        LD ld = this.ZU;
        return ld != null && ld.VVE();
    }

    public boolean lk() {
        LD ld = this.ZU;
        return (ld == null || ld.sLN() == null || !this.ZU.sLN().LD()) ? false : true;
    }

    public void nBu() {
        LD ld = this.ZU;
        if (ld != null) {
            ld.LD();
        }
    }

    public long sLN() {
        LD ld = this.ZU;
        if (ld != null) {
            return ld.JXs();
        }
        return 0L;
    }

    public boolean Lxb() {
        String strLxb;
        if (Build.VERSION.SDK_INT >= 23) {
            strLxb = ((OK) CacheDirFactory.getICacheDir(0)).a();
        } else {
            try {
                strLxb = com.bytedance.sdk.openadsdk.component.ebl.Lxb.Lxb();
            } catch (Throwable unused) {
                strLxb = "";
            }
        }
        com.bytedance.sdk.openadsdk.core.NXR.Lxb.LD ldLxb = tD.Lxb(strLxb, this.lk);
        ldLxb.LD(this.lk.bG());
        ldLxb.Lxb(this.LD.getWidth());
        ldLxb.LD(this.LD.getHeight());
        ldLxb.lk(this.lk.Lv());
        ldLxb.Lxb(0L);
        ldLxb.Lxb(true);
        return this.ZU.Lxb(ldLxb);
    }

    public void Lxb(boolean z) {
        this.JXs = z;
    }

    public void Lxb(Fo0 fo0) {
        LD ld = this.ZU;
        if (ld != null) {
            ld.Lxb(fo0);
        }
    }

    public boolean Lxb(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.Lxb lxb, tD tDVar) {
        Lxb(frameLayout, tDVar);
        Lxb(lxb);
        try {
            return Lxb();
        } catch (Throwable th) {
            sLN.Lxb("TTAppOpenVideoManager", "open_ad", AbstractC3888ke0.l(th, new StringBuilder("ttAppOpenAd playVideo error: ")));
            return false;
        }
    }

    public void Lxb(int i) {
        if (this.ZU != null) {
            IeN.Lxb lxb = new IeN.Lxb();
            lxb.Lxb(sLN());
            lxb.lk(STP());
            lxb.LD(NXR());
            lxb.lk(i);
            lxb.ZU(this.ZU.ebl());
            this.ZU.Lxb(lxb);
        }
    }
}
