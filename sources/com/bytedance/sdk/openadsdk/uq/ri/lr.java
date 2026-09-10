package com.bytedance.sdk.openadsdk.uq.ri;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.aw.di;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.qd;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends ri {
    private String di;
    private FrameLayout fi;
    private di ik;
    private final FrameLayout ka;
    private volatile boolean lr;

    public lr(Context context, wjv wjvVar, int i, boolean z, FrameLayout frameLayout, String str) {
        super(context, wjvVar, i, z, frameLayout);
        this.ka = frameLayout;
        this.di = str;
        lr(false);
        int iIk = qd.ik(context);
        int iFi = qd.fi(context);
        if (i == 1) {
            if (iIk <= iFi) {
                this.ri.layout(0, 0, iIk, iFi);
                return;
            }
        } else {
            if (i != 2) {
                return;
            }
            if (iIk > iFi) {
                this.ri.layout(0, 0, iIk, iFi);
                return;
            }
        }
        this.ri.layout(0, 0, iFi, iIk);
    }

    public String jbs() {
        return this.di;
    }

    public void mj() {
        super.ri(true, new di() { // from class: com.bytedance.sdk.openadsdk.uq.ri.lr.1
            @Override // com.bytedance.sdk.openadsdk.aw.di
            public void ri() {
                if (lr.this.ik != null) {
                    lr.this.ik.ri();
                } else {
                    lr.this.lr = true;
                }
            }
        });
    }

    public void ri(FrameLayout frameLayout, di diVar) {
        this.fi = frameLayout;
        frameLayout.addView(this.ka);
        this.ik = diVar;
        if (this.lr) {
            this.ik.ri();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.uq.ri.ri
    public void ri() {
        this.fi.setVisibility(0);
        super.ri();
    }
}
