package com.bytedance.sdk.openadsdk.tD.Lxb;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.sLN.JXs;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class LD extends Lxb {
    private FrameLayout JXs;
    private volatile boolean LD;
    private final FrameLayout ZU;
    private String lc;
    private JXs lk;

    public LD(Context context, tD tDVar, int i, boolean z, FrameLayout frameLayout, String str) {
        super(context, tDVar, i, z, frameLayout);
        this.ZU = frameLayout;
        this.lc = str;
        LD(false);
        int iLk = le.lk(context);
        int iZU = le.ZU(context);
        if (i == 1) {
            if (iLk <= iZU) {
                this.Lxb.layout(0, 0, iLk, iZU);
                return;
            }
        } else {
            if (i != 2) {
                return;
            }
            if (iLk > iZU) {
                this.Lxb.layout(0, 0, iLk, iZU);
                return;
            }
        }
        this.Lxb.layout(0, 0, iZU, iLk);
    }

    public String OY() {
        return this.lc;
    }

    public void ebl() {
        super.Lxb(true, new JXs() { // from class: com.bytedance.sdk.openadsdk.tD.Lxb.LD.1
            @Override // com.bytedance.sdk.openadsdk.sLN.JXs
            public void Lxb() {
                if (LD.this.lk != null) {
                    LD.this.lk.Lxb();
                } else {
                    LD.this.LD = true;
                }
            }
        });
    }

    public void Lxb(FrameLayout frameLayout, JXs jXs) {
        this.JXs = frameLayout;
        frameLayout.addView(this.ZU);
        this.lk = jXs;
        if (this.LD) {
            this.lk.Lxb();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.tD.Lxb.Lxb
    public void Lxb() {
        this.JXs.setVisibility(0);
        super.Lxb();
    }
}
