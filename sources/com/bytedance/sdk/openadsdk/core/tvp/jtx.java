package com.bytedance.sdk.openadsdk.core.tvp;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes3.dex */
public class jtx extends com.bytedance.sdk.openadsdk.core.exu.ud.mo implements View.OnClickListener {
    private boolean yt;

    public jtx(Context context, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, String str, com.bytedance.sdk.openadsdk.mml.wd wdVar, boolean z2) {
        super(context, ljhVar, false, str, false, false, wdVar);
        this.yt = false;
        setOnClickListener(this);
        setNeedNativeVideoPlayBtnVisible(false);
        setNeedSelfManagerVideo(!z2);
    }

    private void exc() {
        wd();
        RelativeLayout relativeLayout = this.wd;
        if (relativeLayout != null) {
            if (relativeLayout.getVisibility() == 0) {
                return;
            } else {
                com.bytedance.sdk.openadsdk.jl.ud.ud().qdl(this.qdl.tdy().to(), this.qdl.tdy().lnr(), this.qdl.tdy().ud(), this.jpc, this.qdl);
            }
        }
        jl();
    }

    private void jl() {
        ax.qdl((View) this.wd, 0);
        ax.qdl((View) this.jpc, 0);
        ax.qdl((View) this.to, 8);
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.ud.mo
    public void lnr() {
        if (this.yt) {
            super.lnr();
        }
    }

    public void mml() {
        ImageView imageView = this.to;
        if (imageView != null) {
            ax.qdl((View) imageView, 8);
        }
    }

    public void mzz() {
        wd();
        ax.qdl((View) this.wd, 0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ImageView imageView = this.tvp;
        if (imageView != null && imageView.getVisibility() == 0) {
            ax.mzz(this.wd);
        }
        lnr();
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.ud.mo, android.view.View
    public void onWindowFocusChanged(boolean z2) {
        ImageView imageView = this.tvp;
        if (imageView == null || imageView.getVisibility() != 0) {
            super.onWindowFocusChanged(z2);
        } else {
            exc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.ud.mo, android.view.View
    public void onWindowVisibilityChanged(int i2) {
        ImageView imageView = this.tvp;
        if (imageView == null || imageView.getVisibility() != 0) {
            super.onWindowVisibilityChanged(i2);
        } else {
            exc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.ud.mo
    public void qdl(boolean z2) {
    }

    public void setCanInterruptVideoPlay(boolean z2) {
        this.yt = z2;
    }

    public void setShouldCheckNetChange(boolean z2) {
        com.bytedance.sdk.openadsdk.core.exu.ud.lnr lnrVar = this.ud;
        if (lnrVar != null) {
            lnrVar.mzz(z2);
        }
    }

    public void setShowAdInteractionView(boolean z2) {
        com.bytedance.sdk.openadsdk.core.exu.ud.mzz mzzVarFs;
        com.bytedance.sdk.openadsdk.core.exu.ud.lnr lnrVar = this.ud;
        if (lnrVar == null || (mzzVarFs = lnrVar.fs()) == null) {
            return;
        }
        mzzVarFs.qdl(z2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.ud.mo
    public void ud() {
        if (!this.mzz || !bch.ud(this.fs)) {
            this.mml = false;
        }
        super.ud();
    }

    public void qdl(int i2, int i3) {
        com.bytedance.sdk.openadsdk.core.exu.ud.lnr lnrVar = this.ud;
        if (lnrVar != null) {
            lnrVar.ud(i2, i3);
        }
    }
}
