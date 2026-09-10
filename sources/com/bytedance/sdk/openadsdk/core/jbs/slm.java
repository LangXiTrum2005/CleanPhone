package com.bytedance.sdk.openadsdk.core.jbs;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.utils.qd;

/* JADX INFO: loaded from: classes2.dex */
public class slm extends com.bytedance.sdk.openadsdk.core.bgr.lr.di implements View.OnClickListener {
    private boolean bu;

    public slm(Context context, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str, com.bytedance.sdk.openadsdk.ka.xha xhaVar, boolean z) {
        super(context, wjvVar, false, str, false, false, xhaVar);
        this.bu = false;
        setOnClickListener(this);
        setNeedNativeVideoPlayBtnVisible(false);
        setNeedSelfManagerVideo(!z);
    }

    private void nr() {
        qd.ri((View) this.xha, 0);
        qd.ri((View) this.mj, 0);
        qd.ri((View) this.qt, 8);
    }

    private void tan() {
        xha();
        RelativeLayout relativeLayout = this.xha;
        if (relativeLayout != null) {
            if (relativeLayout.getVisibility() == 0) {
                return;
            } else {
                com.bytedance.sdk.openadsdk.ac.lr.lr().ri(this.ri.eu().cuirassed(), this.ri.eu().impassible(), this.ri.eu().adultoid(), this.mj, this.ri);
            }
        }
        nr();
    }

    public void fi() {
        xha();
        qd.ri((View) this.xha, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.di
    public void ik() {
        if (this.bu) {
            super.ik();
        }
    }

    public void ka() {
        ImageView imageView = this.qt;
        if (imageView != null) {
            qd.ri((View) imageView, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.di
    public void lr() {
        if (!this.fi || !ay.lr(this.f18103co)) {
            this.ka = false;
        }
        super.lr();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ImageView imageView = this.jbs;
        if (imageView != null && imageView.getVisibility() == 0) {
            qd.fi(this.xha);
        }
        ik();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.di, android.view.View
    public void onWindowFocusChanged(boolean z) {
        ImageView imageView = this.jbs;
        if (imageView == null || imageView.getVisibility() != 0) {
            super.onWindowFocusChanged(z);
        } else {
            tan();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.di, android.view.View
    public void onWindowVisibilityChanged(int i) {
        ImageView imageView = this.jbs;
        if (imageView == null || imageView.getVisibility() != 0) {
            super.onWindowVisibilityChanged(i);
        } else {
            tan();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.di
    public void ri(boolean z) {
    }

    public void setCanInterruptVideoPlay(boolean z) {
        this.bu = z;
    }

    public void setShouldCheckNetChange(boolean z) {
        com.bytedance.sdk.openadsdk.core.bgr.lr.ik ikVar = this.lr;
        if (ikVar != null) {
            ikVar.fi(z);
        }
    }

    public void setShowAdInteractionView(boolean z) {
        com.bytedance.sdk.openadsdk.core.bgr.lr.fi fiVarCo;
        com.bytedance.sdk.openadsdk.core.bgr.lr.ik ikVar = this.lr;
        if (ikVar == null || (fiVarCo = ikVar.co()) == null) {
            return;
        }
        fiVarCo.ri(z);
    }

    public void ri(int i, int i2) {
        com.bytedance.sdk.openadsdk.core.bgr.lr.ik ikVar = this.lr;
        if (ikVar != null) {
            ikVar.lr(i, i2);
        }
    }
}
