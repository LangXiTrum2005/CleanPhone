package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.utils.le;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KG;

/* JADX INFO: loaded from: classes2.dex */
public class tD {
    private LD JXs;
    private TextView LD;
    private View Lxb;
    private ViewGroup OY;
    private com.bytedance.sdk.openadsdk.core.NXR.LD.Lxb ZU;
    private KG ebl;
    private boolean lc = false;
    private Context lk;

    public interface LD {
        void JVA();

        boolean nBu();
    }

    public enum Lxb {
        PAUSE_VIDEO,
        RELEASE_VIDEO,
        START_VIDEO
    }

    private void Lxb(KG kg, boolean z) {
        View view;
        String str;
        View view2;
        if (kg == null || (view = this.Lxb) == null || this.lk == null || view.getVisibility() == 0) {
            return;
        }
        LD ld = this.JXs;
        if (ld != null) {
            ld.JVA();
        }
        double dCeil = Math.ceil((kg.c * 1.0d) / 1048576.0d);
        if (z) {
            str = String.format(com.bytedance.sdk.component.utils.tD.Lxb(this.lk, "tt_video_without_wifi_tips"), Float.valueOf(Double.valueOf(dCeil).floatValue()));
        } else {
            str = com.bytedance.sdk.component.utils.tD.Lxb(this.lk, "tt_video_without_wifi_tips") + com.bytedance.sdk.component.utils.tD.Lxb(this.lk, "tt_video_bytesize");
        }
        le.Lxb(this.Lxb, 0);
        le.Lxb(this.LD, str);
        if (!le.ZU(this.Lxb) || (view2 = this.Lxb) == null) {
            return;
        }
        view2.bringToFront();
    }

    private void ZU() {
        View view = this.Lxb;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lk() {
        if (this.lk == null) {
            return;
        }
        ZU();
    }

    private void LD() {
        this.ebl = null;
    }

    public void Lxb(Context context, ViewGroup viewGroup) {
        if (context == null || !(viewGroup instanceof ViewGroup)) {
            return;
        }
        this.OY = viewGroup;
        this.lk = com.bytedance.sdk.openadsdk.core.kqm.Lxb().getApplicationContext();
    }

    private void Lxb(Context context, View view, boolean z) {
        ViewGroup.LayoutParams layoutParamsLxb;
        if (context == null || view == null || this.Lxb != null || (layoutParamsLxb = Lxb(this.OY)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.NXR.IeN ieN = new com.bytedance.sdk.openadsdk.NXR.IeN(context);
        this.Lxb = ieN;
        ieN.setLayoutParams(layoutParamsLxb);
        this.OY.addView(this.Lxb);
        this.LD = (TextView) this.Lxb.findViewById(com.bytedance.sdk.openadsdk.utils.STP.IG);
        View viewFindViewById = this.Lxb.findViewById(com.bytedance.sdk.openadsdk.utils.STP.qEi);
        if (z) {
            viewFindViewById.setClickable(true);
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.tD.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    tD.this.lk();
                    if (tD.this.ZU != null) {
                        tD.this.ZU.Lxb(Lxb.START_VIDEO, (String) null);
                    }
                }
            });
        } else {
            viewFindViewById.setOnClickListener(null);
            viewFindViewById.setClickable(false);
        }
    }

    private ViewGroup.LayoutParams Lxb(ViewGroup viewGroup) {
        if (viewGroup instanceof RelativeLayout) {
            return new RelativeLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof LinearLayout) {
            return new LinearLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof FrameLayout) {
            return new FrameLayout.LayoutParams(-1, -1);
        }
        return null;
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.NXR.LD.Lxb lxb, LD ld) {
        this.JXs = ld;
        this.ZU = lxb;
    }

    public boolean Lxb(int i, KG kg, boolean z) {
        Context context = this.lk;
        if (context == null || kg == null) {
            return true;
        }
        Lxb(context, this.OY, z);
        this.ebl = kg;
        if (i == 1 || i == 2) {
            return Lxb(i);
        }
        return true;
    }

    private boolean Lxb(int i) {
        LD ld;
        if (Lxb() || this.lc) {
            return true;
        }
        if (this.ZU != null && (ld = this.JXs) != null) {
            if (ld.nBu()) {
                this.ZU.JXs(null, null);
            }
            this.ZU.Lxb(Lxb.PAUSE_VIDEO, (String) null);
        }
        Lxb(this.ebl, true);
        return false;
    }

    public void Lxb(boolean z) {
        if (z) {
            LD();
        }
        ZU();
    }

    public boolean Lxb() {
        View view = this.Lxb;
        return view != null && view.getVisibility() == 0;
    }
}
