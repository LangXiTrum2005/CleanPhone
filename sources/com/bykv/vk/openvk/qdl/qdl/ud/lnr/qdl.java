package com.bykv.vk.openvk.qdl.qdl.ud.lnr;

/* JADX INFO: loaded from: classes.dex */
public abstract class qdl implements lnr {
    private lnr.mml jpc;
    private lnr.ud lnr;
    private lnr.qdl mml;
    private lnr.wd mo;
    private lnr.mo mzz;
    protected boolean qdl = false;
    private lnr.mzz ud;
    private lnr.InterfaceC0058lnr wd;

    public final void lnr() {
        try {
            lnr.ud udVar = this.lnr;
            if (udVar != null) {
                udVar.qdl(this);
            }
        } catch (Throwable unused) {
        }
    }

    public final void mml() {
        try {
            lnr.mo moVar = this.mzz;
            if (moVar != null) {
                moVar.lnr(this);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public final void qdl(lnr.mzz mzzVar) {
        this.ud = mzzVar;
    }

    public final void ud() {
        try {
            lnr.mzz mzzVar = this.ud;
            if (mzzVar != null) {
                mzzVar.ud(this);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public final void qdl(lnr.ud udVar) {
        this.lnr = udVar;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public final void qdl(lnr.qdl qdlVar) {
        this.mml = qdlVar;
    }

    public final boolean ud(int i2, int i3) {
        try {
            lnr.mml mmlVar = this.jpc;
            return mmlVar != null && mmlVar.ud(this, i2, i3);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public final void qdl(lnr.mo moVar) {
        this.mzz = moVar;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public final void qdl(lnr.InterfaceC0058lnr interfaceC0058lnr) {
        this.wd = interfaceC0058lnr;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public final void qdl(lnr.mml mmlVar) {
        this.jpc = mmlVar;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public final void qdl(lnr.wd wdVar) {
        this.mo = wdVar;
    }

    public void qdl() {
        this.ud = null;
        this.mml = null;
        this.lnr = null;
        this.mzz = null;
        this.mo = null;
        this.wd = null;
        this.jpc = null;
    }

    public final void qdl(int i2) {
        try {
            lnr.qdl qdlVar = this.mml;
            if (qdlVar != null) {
                qdlVar.qdl(this, i2);
            }
        } catch (Throwable unused) {
        }
    }

    public final void qdl(int i2, int i3, int i4, int i5) {
        try {
            lnr.wd wdVar = this.mo;
            if (wdVar != null) {
                wdVar.qdl(this, i2, i3, i4, i5);
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean qdl(int i2, int i3) {
        try {
            lnr.InterfaceC0058lnr interfaceC0058lnr = this.wd;
            return interfaceC0058lnr != null && interfaceC0058lnr.qdl(this, i2, i3);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.lnr.lnr
    public void qdl(boolean z2) {
        this.qdl = z2;
    }
}
