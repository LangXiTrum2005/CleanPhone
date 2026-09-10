package com.bytedance.sdk.openadsdk.component.reward.ri;

import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;

/* JADX INFO: loaded from: classes2.dex */
public class mj {
    public static int ik = 2;
    public static int lr = 1;
    public static int ri;
    private jbs fi;
    private final boolean ka;

    public mj(ri riVar, wjv wjvVar) {
        this.ka = wjvVar.tp();
        this.fi = dw.di(wjvVar) ? new xha(riVar) : new jbs(riVar);
    }

    public void di() {
        jbs jbsVar = this.fi;
        if (jbsVar != null) {
            jbsVar.jbs();
        }
    }

    public void fi() {
        jbs jbsVar = this.fi;
        if (jbsVar != null) {
            jbsVar.ka();
        }
    }

    public com.bytedance.sdk.openadsdk.aw.fi ik() {
        return null;
    }

    public void jbs() {
        jbs jbsVar = this.fi;
        if (jbsVar != null) {
            jbsVar.bgr();
        }
    }

    public boolean ka() {
        jbs jbsVar = this.fi;
        if (jbsVar != null) {
            return jbsVar.qt();
        }
        return false;
    }

    public boolean lr() {
        return false;
    }

    public void mj() {
        jbs jbsVar = this.fi;
        if (jbsVar != null) {
            jbsVar.fi();
        }
    }

    public void qt() {
        jbs jbsVar = this.fi;
        if (jbsVar != null) {
            jbsVar.ik();
        }
    }

    public com.bytedance.sdk.openadsdk.uq.mj ri() {
        return null;
    }

    public boolean sf() {
        jbs jbsVar = this.fi;
        if (jbsVar != null) {
            return jbsVar.vr();
        }
        return false;
    }

    public void xha() {
        jbs jbsVar = this.fi;
        if (jbsVar != null) {
            jbsVar.ri();
        }
    }

    public void ik(int i) {
        jbs jbsVar;
        if (i == ik || (jbsVar = this.fi) == null) {
            return;
        }
        jbsVar.di();
    }

    public void lr(int i) {
        jbs jbsVar = this.fi;
        if (jbsVar != null) {
            jbsVar.ri(i);
        }
    }

    public void ri(int i) {
        jbs jbsVar = this.fi;
        if (jbsVar != null) {
            jbsVar.ri(i);
        }
    }

    public boolean ka(int i) {
        jbs jbsVar;
        if (i != lr || (jbsVar = this.fi) == null) {
            return false;
        }
        return jbsVar.aw();
    }

    public void lr(boolean z) {
        jbs jbsVar = this.fi;
        if (jbsVar != null) {
            jbsVar.ik(z);
        }
    }

    public void ri(com.bytedance.sdk.openadsdk.core.ik.fi fiVar) {
        jbs jbsVar = this.fi;
        if (jbsVar != null) {
            jbsVar.ri(fiVar);
        }
    }

    public void ri(boolean z) {
        jbs jbsVar = this.fi;
        if (jbsVar != null) {
            jbsVar.lr(z);
        }
    }
}
