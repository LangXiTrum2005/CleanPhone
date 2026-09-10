package com.bytedance.sdk.component.adexpress.LD;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class lc implements nBu {
    private Lxb LD;
    private Context Lxb;
    private NXR lk;

    public lc(Context context, NXR nxr, Lxb lxb) {
        this.Lxb = context;
        this.LD = lxb;
        this.lk = nxr;
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.nBu
    public void Lxb() {
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.nBu
    public boolean Lxb(final nBu.Lxb lxb) {
        this.lk.JXs().lc();
        this.LD.Lxb(new ebl() { // from class: com.bytedance.sdk.component.adexpress.LD.lc.1
            @Override // com.bytedance.sdk.component.adexpress.LD.ebl
            public void Lxb(View view, STP stp) {
                if (lxb.lk()) {
                    return;
                }
                IeN ieNLD = lxb.LD();
                if (ieNLD != null) {
                    ieNLD.Lxb(lc.this.LD, stp);
                }
                lxb.Lxb(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.LD.ebl
            public void Lxb(int i, String str) {
                IeN ieNLD = lxb.LD();
                if (ieNLD != null) {
                    ieNLD.a_(i);
                }
            }
        });
        return true;
    }

    public void Lxb(lk lkVar) {
        this.LD.Lxb(lkVar);
    }
}
