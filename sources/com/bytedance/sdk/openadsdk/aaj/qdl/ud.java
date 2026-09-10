package com.bytedance.sdk.openadsdk.aaj.qdl;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.fs.mo;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes3.dex */
public class ud extends qdl {
    private mo lnr;
    private final FrameLayout mml;
    private String mo;
    private FrameLayout mzz;
    private volatile boolean ud;

    public ud(Context context, ljh ljhVar, int i2, boolean z2, FrameLayout frameLayout, String str) {
        super(context, ljhVar, i2, z2, frameLayout);
        this.mml = frameLayout;
        this.mo = str;
        ud(false);
        int iLnr = ax.lnr(context);
        int iMzz = ax.mzz(context);
        if (i2 == 1) {
            if (iLnr <= iMzz) {
                this.qdl.layout(0, 0, iLnr, iMzz);
                return;
            }
        } else {
            if (i2 != 2) {
                return;
            }
            if (iLnr > iMzz) {
                this.qdl.layout(0, 0, iLnr, iMzz);
                return;
            }
        }
        this.qdl.layout(0, 0, iMzz, iLnr);
    }

    public void jpc() {
        super.qdl(true, new mo() { // from class: com.bytedance.sdk.openadsdk.aaj.qdl.ud.1
            @Override // com.bytedance.sdk.openadsdk.fs.mo
            public void qdl() {
                if (ud.this.lnr != null) {
                    ud.this.lnr.qdl();
                } else {
                    ud.this.ud = true;
                }
            }
        });
    }

    public String tvp() {
        return this.mo;
    }

    public void qdl(FrameLayout frameLayout, mo moVar) {
        this.mzz = frameLayout;
        frameLayout.addView(this.mml);
        this.lnr = moVar;
        if (this.ud) {
            this.lnr.qdl();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.aaj.qdl.qdl
    public void qdl() {
        this.mzz.setVisibility(0);
        super.qdl();
    }
}
