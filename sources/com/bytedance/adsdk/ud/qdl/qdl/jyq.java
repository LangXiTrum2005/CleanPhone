package com.bytedance.adsdk.ud.qdl.qdl;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class jyq implements lnr, com.bytedance.adsdk.ud.qdl.ud.qdl.InterfaceC0060qdl {
    private final List<com.bytedance.adsdk.ud.qdl.ud.qdl.InterfaceC0060qdl> lnr = new ArrayList();
    private final com.bytedance.adsdk.ud.lnr.ud.exc.qdl mml;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> mo;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> mzz;
    private final String qdl;
    private final boolean ud;
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> wd;

    public jyq(com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar, com.bytedance.adsdk.ud.lnr.ud.exc excVar) {
        this.qdl = excVar.qdl();
        this.ud = excVar.mo();
        this.mml = excVar.ud();
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVarQdl = excVar.mml().qdl();
        this.mzz = qdlVarQdl;
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVarQdl2 = excVar.lnr().qdl();
        this.mo = qdlVarQdl2;
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVarQdl3 = excVar.mzz().qdl();
        this.wd = qdlVarQdl3;
        qdlVar.qdl(qdlVarQdl);
        qdlVar.qdl(qdlVarQdl2);
        qdlVar.qdl(qdlVarQdl3);
        qdlVarQdl.qdl(this);
        qdlVarQdl2.qdl(this);
        qdlVarQdl3.qdl(this);
    }

    public com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> lnr() {
        return this.mzz;
    }

    public com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> mml() {
        return this.mo;
    }

    public boolean mo() {
        return this.ud;
    }

    public com.bytedance.adsdk.ud.qdl.ud.qdl<?, Float> mzz() {
        return this.wd;
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.lnr
    public void qdl(List<lnr> list, List<lnr> list2) {
    }

    public com.bytedance.adsdk.ud.lnr.ud.exc.qdl ud() {
        return this.mml;
    }

    @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.InterfaceC0060qdl
    public void qdl() {
        for (int i2 = 0; i2 < this.lnr.size(); i2++) {
            this.lnr.get(i2).qdl();
        }
    }

    public void qdl(com.bytedance.adsdk.ud.qdl.ud.qdl.InterfaceC0060qdl interfaceC0060qdl) {
        this.lnr.add(interfaceC0060qdl);
    }
}
