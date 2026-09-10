package com.bytedance.sdk.openadsdk.core.OY;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.utils.le;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0;

/* JADX INFO: loaded from: classes2.dex */
public class IeN extends com.bytedance.sdk.openadsdk.core.NXR.LD.lc implements View.OnClickListener {
    private boolean VVE;

    public IeN(@NonNull Context context, @NonNull com.bytedance.sdk.openadsdk.core.model.tD tDVar, String str, com.bytedance.sdk.openadsdk.ZU.ebl eblVar) {
        super(context, tDVar, false, str, false, false, eblVar);
        this.VVE = false;
        setOnClickListener(this);
        setNeedNativeVideoPlayBtnVisible(false);
    }

    private void brP() {
        ebl();
        RelativeLayout relativeLayout = this.ebl;
        if (relativeLayout != null) {
            if (relativeLayout.getVisibility() == 0) {
                return;
            } else {
                com.bytedance.sdk.openadsdk.kqm.lk.Lxb().Lxb(this.Lxb.JJ().f, this.Lxb.JJ().b, this.Lxb.JJ().f3307a, this.OY, this.Lxb);
            }
        }
        kqm();
    }

    private void kqm() {
        le.Lxb((View) this.ebl, 0);
        le.Lxb((View) this.OY, 0);
        le.Lxb((View) this.nBu, 8);
    }

    public void JXs() {
        ebl();
        le.Lxb((View) this.ebl, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.lc
    public void LD() {
        if (!this.JXs || !eK.LD(this.sLN)) {
            this.ZU = false;
        }
        super.LD();
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.lc
    public void Lxb(boolean z) {
    }

    public void ZU() {
        ImageView imageView = this.nBu;
        if (imageView != null) {
            le.Lxb((View) imageView, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.lc
    public void lk() {
        if (this.VVE) {
            super.lk();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ImageView imageView = this.QAg;
        if (imageView != null && imageView.getVisibility() == 0) {
            le.JXs(this.ebl);
        }
        lk();
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.lc, android.view.View
    public void onWindowFocusChanged(boolean z) {
        ImageView imageView = this.QAg;
        if (imageView == null || imageView.getVisibility() != 0) {
            super.onWindowFocusChanged(z);
        } else {
            brP();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.lc, android.view.View
    public void onWindowVisibilityChanged(int i) {
        ImageView imageView = this.QAg;
        if (imageView == null || imageView.getVisibility() != 0) {
            super.onWindowVisibilityChanged(i);
        } else {
            brP();
        }
    }

    public void setCanInterruptVideoPlay(boolean z) {
        this.VVE = z;
    }

    public void setShouldCheckNetChange(boolean z) {
        So0 so0 = this.LD;
        if (so0 != null) {
            so0.JXs(z);
        }
    }

    public void setShowAdInteractionView(boolean z) {
        RG rgNXR;
        So0 so0 = this.LD;
        if (so0 == null || (rgNXR = so0.NXR()) == null) {
            return;
        }
        rgNXR.Lxb(z);
    }
}
