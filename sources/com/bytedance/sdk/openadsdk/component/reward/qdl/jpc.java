package com.bytedance.sdk.openadsdk.component.reward.qdl;

import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;

/* JADX INFO: loaded from: classes3.dex */
public class jpc {
    public static int lnr = 2;
    public static int qdl = 0;
    public static int ud = 1;
    private final boolean mml;
    private tvp mzz;

    public jpc(qdl qdlVar, ljh ljhVar) {
        this.mml = ljhVar.ip();
        this.mzz = vu.mo(ljhVar) ? new wd(qdlVar) : new tvp(qdlVar);
    }

    public void jpc() {
        tvp tvpVar = this.mzz;
        if (tvpVar != null) {
            tvpVar.mzz();
        }
    }

    public com.bytedance.sdk.openadsdk.fs.mzz lnr() {
        return null;
    }

    public boolean mml() {
        tvp tvpVar = this.mzz;
        if (tvpVar != null) {
            return tvpVar.to();
        }
        return false;
    }

    public void mo() {
        tvp tvpVar = this.mzz;
        if (tvpVar != null) {
            tvpVar.tvp();
        }
    }

    public void mzz() {
        tvp tvpVar = this.mzz;
        if (tvpVar != null) {
            tvpVar.mml();
        }
    }

    public com.bytedance.sdk.openadsdk.aaj.jpc qdl() {
        return null;
    }

    public boolean rq() {
        tvp tvpVar = this.mzz;
        if (tvpVar != null) {
            return tvpVar.bjy();
        }
        return false;
    }

    public void to() {
        tvp tvpVar = this.mzz;
        if (tvpVar != null) {
            tvpVar.lnr();
        }
    }

    public void tvp() {
        tvp tvpVar = this.mzz;
        if (tvpVar != null) {
            tvpVar.rdp();
        }
    }

    public boolean ud() {
        return false;
    }

    public void wd() {
        tvp tvpVar = this.mzz;
        if (tvpVar != null) {
            tvpVar.qdl();
        }
    }

    public void lnr(int i2) {
        tvp tvpVar;
        if (i2 == lnr || (tvpVar = this.mzz) == null) {
            return;
        }
        tvpVar.mo();
    }

    public void qdl(int i2) {
        tvp tvpVar = this.mzz;
        if (tvpVar != null) {
            tvpVar.qdl(i2);
        }
    }

    public void ud(int i2) {
        tvp tvpVar = this.mzz;
        if (tvpVar != null) {
            tvpVar.qdl(i2);
        }
    }

    public boolean mml(int i2) {
        tvp tvpVar;
        if (i2 != ud || (tvpVar = this.mzz) == null) {
            return false;
        }
        return tvpVar.exu();
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.lnr.mzz mzzVar) {
        tvp tvpVar = this.mzz;
        if (tvpVar != null) {
            tvpVar.qdl(mzzVar);
        }
    }

    public void ud(boolean z2) {
        tvp tvpVar = this.mzz;
        if (tvpVar != null) {
            tvpVar.lnr(z2);
        }
    }

    public void qdl(boolean z2) {
        tvp tvpVar = this.mzz;
        if (tvpVar != null) {
            tvpVar.ud(z2);
        }
    }
}
