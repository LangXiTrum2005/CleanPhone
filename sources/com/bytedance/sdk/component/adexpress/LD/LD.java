package com.bytedance.sdk.component.adexpress.LD;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;

/* JADX INFO: loaded from: classes2.dex */
public class LD implements nBu {
    private NXR JXs;
    private com.bytedance.sdk.component.adexpress.dynamic.Lxb.Lxb LD;
    private Context Lxb;
    private OY ZU;
    private int lc;
    private ThemeStatusBroadcastReceiver lk;

    public LD(Context context, NXR nxr, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, com.bytedance.sdk.component.adexpress.dynamic.JXs.OY oy, OY oy2, com.bytedance.sdk.component.adexpress.dynamic.lc.Lxb lxb, com.bytedance.sdk.component.adexpress.dynamic.Lxb.Lxb lxb2) {
        this.Lxb = context;
        this.JXs = nxr;
        this.lk = themeStatusBroadcastReceiver;
        this.ZU = oy2;
        if (lxb2 != null) {
            this.LD = lxb2;
        } else {
            this.LD = new com.bytedance.sdk.component.adexpress.dynamic.Lxb.Lxb(context, themeStatusBroadcastReceiver, z, oy, nxr, lxb);
        }
        this.LD.Lxb(this.ZU);
        if (oy instanceof com.bytedance.sdk.component.adexpress.dynamic.JXs.ebl) {
            this.lc = 3;
        } else {
            this.lc = 2;
        }
    }

    public com.bytedance.sdk.component.adexpress.dynamic.ZU LD() {
        com.bytedance.sdk.component.adexpress.dynamic.Lxb.Lxb lxb = this.LD;
        if (lxb != null) {
            return lxb.ZU();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.nBu
    public boolean Lxb(final nBu.Lxb lxb) {
        this.JXs.JXs().Lxb(this.lc);
        this.LD.Lxb(new ebl() { // from class: com.bytedance.sdk.component.adexpress.LD.LD.1
            @Override // com.bytedance.sdk.component.adexpress.LD.ebl
            public void Lxb(View view, STP stp) {
                if (lxb.lk()) {
                    return;
                }
                LD.this.JXs.JXs().JXs(LD.this.lc);
                LD.this.JXs.JXs().lc(LD.this.lc);
                LD.this.JXs.JXs().nBu();
                IeN ieNLD = lxb.LD();
                if (ieNLD == null) {
                    return;
                }
                ieNLD.Lxb(LD.this.LD, stp);
                lxb.Lxb(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.LD.ebl
            public void Lxb(int i, String str) {
                LD.this.JXs.JXs().Lxb(LD.this.lc, i, str, lxb.LD(LD.this));
                if (lxb.LD(LD.this)) {
                    lxb.Lxb(LD.this);
                    return;
                }
                IeN ieNLD = lxb.LD();
                if (ieNLD == null) {
                    return;
                }
                ieNLD.a_(i);
            }
        });
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.nBu
    public void Lxb() {
        com.bytedance.sdk.component.adexpress.dynamic.Lxb.Lxb lxb = this.LD;
        if (lxb != null) {
            lxb.LD();
        }
    }
}
