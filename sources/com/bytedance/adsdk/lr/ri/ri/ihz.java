package com.bytedance.adsdk.lr.ri.ri;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ihz implements com.bytedance.adsdk.lr.ri.lr.ri.InterfaceC0185ri, ik {
    private final com.bytedance.adsdk.lr.ri.lr.ri<?, Float> di;
    private final com.bytedance.adsdk.lr.ri.lr.ri<?, Float> fi;
    private final List<com.bytedance.adsdk.lr.ri.lr.ri.InterfaceC0185ri> ik = new ArrayList();
    private final com.bytedance.adsdk.lr.ik.lr.tan.ri ka;
    private final boolean lr;
    private final String ri;
    private final com.bytedance.adsdk.lr.ri.lr.ri<?, Float> xha;

    public ihz(com.bytedance.adsdk.lr.ik.ik.ri riVar, com.bytedance.adsdk.lr.ik.lr.tan tanVar) {
        this.ri = tanVar.ri();
        this.lr = tanVar.di();
        this.ka = tanVar.lr();
        com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> riVarRi = tanVar.ka().ri();
        this.fi = riVarRi;
        com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> riVarRi2 = tanVar.ik().ri();
        this.di = riVarRi2;
        com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> riVarRi3 = tanVar.fi().ri();
        this.xha = riVarRi3;
        riVar.ri(riVarRi);
        riVar.ri(riVarRi2);
        riVar.ri(riVarRi3);
        riVarRi.ri(this);
        riVarRi2.ri(this);
        riVarRi3.ri(this);
    }

    public boolean di() {
        return this.lr;
    }

    public com.bytedance.adsdk.lr.ri.lr.ri<?, Float> fi() {
        return this.xha;
    }

    public com.bytedance.adsdk.lr.ri.lr.ri<?, Float> ik() {
        return this.fi;
    }

    public com.bytedance.adsdk.lr.ri.lr.ri<?, Float> ka() {
        return this.di;
    }

    public com.bytedance.adsdk.lr.ik.lr.tan.ri lr() {
        return this.ka;
    }

    @Override // com.bytedance.adsdk.lr.ri.ri.ik
    public void ri(List<ik> list, List<ik> list2) {
    }

    @Override // com.bytedance.adsdk.lr.ri.lr.ri.InterfaceC0185ri
    public void ri() {
        for (int i = 0; i < this.ik.size(); i++) {
            this.ik.get(i).ri();
        }
    }

    public void ri(com.bytedance.adsdk.lr.ri.lr.ri.InterfaceC0185ri interfaceC0185ri) {
        this.ik.add(interfaceC0185ri);
    }
}
