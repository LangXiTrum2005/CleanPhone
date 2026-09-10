package com.bytedance.sdk.openadsdk.component.mj;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.ka.fi.lr.vr;
import euthanasia.attabal;

/* JADX INFO: loaded from: classes2.dex */
public class ik implements com.bytedance.sdk.openadsdk.core.ik.ri.InterfaceC0250ri {
    private boolean fi = false;
    private wjv ik;
    private lr ka;
    private FrameLayout lr;
    private Context ri;

    public ik(Context context) {
        this.ri = context.getApplicationContext();
    }

    public long aw() {
        lr lrVar = this.ka;
        if (lrVar != null) {
            return lrVar.di();
        }
        return 0L;
    }

    public long bgr() {
        lr lrVar = this.ka;
        if (lrVar != null) {
            return lrVar.xha();
        }
        return 0L;
    }

    public void co() {
        lr lrVar = this.ka;
        if (lrVar == null) {
            return;
        }
        this.ri = null;
        lrVar.ka();
        this.ka = null;
    }

    public boolean di() {
        lr lrVar = this.ka;
        return (lrVar == null || lrVar.sf() == null || !this.ka.sf().xha()) ? false : true;
    }

    public boolean fi() {
        lr lrVar = this.ka;
        return (lrVar == null || lrVar.sf() == null || !this.ka.sf().di()) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ik.ri.InterfaceC0250ri
    public long getVideoProgress() {
        return aw();
    }

    public boolean ik() {
        return this.fi;
    }

    public void jbs() {
        try {
            if (di()) {
                sf();
            }
        } catch (Throwable th) {
            ac.ik("TTAppOpenVideoManager", "onContinue throw Exception :" + th.getMessage());
        }
    }

    public boolean ka() {
        lr lrVar = this.ka;
        return (lrVar == null || lrVar.sf() == null || !this.ka.sf().lr()) ? false : true;
    }

    public lr lr() {
        return this.ka;
    }

    public void mj() {
        try {
            if (fi()) {
                this.ka.lr();
            }
        } catch (Throwable th) {
            ac.ik("TTAppOpenVideoManager", "open_ad", "AppOpenVideoManager onPause throw Exception :" + th.getMessage());
        }
    }

    public void qt() {
        lr lrVar = this.ka;
        if (lrVar == null) {
            return;
        }
        lrVar.ka();
        this.ka = null;
    }

    public void ri(FrameLayout frameLayout, wjv wjvVar) {
        this.lr = frameLayout;
        this.ik = wjvVar;
        this.ka = new lr(this.ri, frameLayout, wjvVar);
    }

    public void sf() {
        lr lrVar = this.ka;
        if (lrVar != null) {
            lrVar.ik();
        }
    }

    public void slm() {
        lr lrVar = this.ka;
        if (lrVar != null) {
            lrVar.srn();
        }
    }

    public long vr() {
        lr lrVar = this.ka;
        if (lrVar != null) {
            return lrVar.jbs() + this.ka.xha();
        }
        return 0L;
    }

    public boolean xha() {
        lr lrVar = this.ka;
        return lrVar != null && lrVar.bgr();
    }

    public boolean ri() {
        com.bytedance.sdk.openadsdk.core.bgr.ri.lr lrVarRi = wjv.ri(CacheDirFactory.getICacheDir(0).lr(), this.ik);
        lrVarRi.lr(this.ik.tn());
        lrVarRi.lr(this.lr.getWidth());
        lrVarRi.ik(this.lr.getHeight());
        lrVarRi.ik(this.ik.yjg());
        lrVarRi.ri(0L);
        lrVarRi.ri(true);
        return this.ka.ri(lrVarRi);
    }

    public void ri(boolean z) {
        this.fi = z;
    }

    public void ri(attabal.wireman wiremanVar) {
        lr lrVar = this.ka;
        if (lrVar != null) {
            lrVar.ri(wiremanVar);
        }
    }

    public boolean ri(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.ri riVar, wjv wjvVar) {
        ri(frameLayout, wjvVar);
        ri(riVar);
        try {
            return ri();
        } catch (Throwable th) {
            ac.ik("TTAppOpenVideoManager", "open_ad", "ttAppOpenAd playVideo error: " + th.getMessage());
            return false;
        }
    }

    public boolean ri(float f) {
        try {
            lr lrVar = this.ka;
            if (lrVar != null) {
                return lrVar.ri(f);
            }
            return false;
        } catch (Throwable th) {
            ac.ik("TTAppOpenVideoManager", "open_ad", "setPlaybackSpeed error: " + th.getMessage());
            return false;
        }
    }

    public void ri(int i) {
        if (this.ka != null) {
            vr.ri riVar = new vr.ri();
            riVar.lr(aw());
            riVar.ka(vr());
            riVar.ik(bgr());
            riVar.ik(i);
            riVar.ka(this.ka.mj());
            riVar.ri(this.ka.bu());
            this.ka.ri(riVar);
        }
    }
}
