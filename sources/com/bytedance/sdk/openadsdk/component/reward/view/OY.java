package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.OY.STP;
import com.bytedance.sdk.openadsdk.core.model.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.le;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class OY {
    private boolean JVA;
    Handler LD;
    com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc Lxb;
    private final String OY;
    private LD QAg;
    private final tD ebl;
    private final Activity lc;
    private final com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb nBu;
    boolean lk = false;
    boolean ZU = false;
    boolean JXs = false;

    public OY(com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb) {
        this.nBu = lxb;
        this.lc = lxb.Pw;
        this.ebl = lxb.LD;
        this.OY = lxb.JXs;
    }

    public void JVA() {
        LD ld = this.QAg;
        if (ld == null) {
            return;
        }
        ld.QAg();
        this.QAg.nBu();
    }

    public Handler JXs() {
        if (this.LD == null) {
            this.LD = new Handler(Looper.getMainLooper());
        }
        return this.LD;
    }

    public FrameLayout LD() {
        LD ld = this.QAg;
        if (ld == null) {
            return null;
        }
        FrameLayout videoFrameLayout = ld.getVideoFrameLayout();
        if (this.QAg.NXR()) {
            sLN();
        }
        return videoFrameLayout;
    }

    public void Lxb(AdSlot adSlot, kqm kqmVar) {
        if (this.JXs) {
            return;
        }
        this.JXs = true;
        LD ld = new LD(this.nBu, adSlot, this.OY);
        this.QAg = ld;
        kqmVar.Lxb(ld, ld.getVideoFrameLayout());
    }

    public boolean OY() {
        LD ld = this.QAg;
        if (ld == null) {
            return false;
        }
        return ld.NXR();
    }

    public int QAg() {
        LD ld = this.QAg;
        if (ld != null) {
            return ld.getDynamicShowType();
        }
        return 0;
    }

    public boolean ZU() {
        return this.ZU;
    }

    public void ebl() {
        LD ld = this.QAg;
        if (ld != null) {
            ld.nBu();
        }
    }

    public void lc() {
        if (this.JVA) {
            return;
        }
        this.JVA = true;
        LD ld = this.QAg;
        if (ld != null) {
            ld.JVA();
        }
        Handler handler = this.LD;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public boolean lk() {
        return this.lk;
    }

    public void nBu() {
        LD ld = this.QAg;
        if (ld == null) {
            return;
        }
        ld.OY();
    }

    public void sLN() {
        if (tD.JXs(this.ebl) && this.ebl.Ivz() == 3 && this.ebl.nE() == 0) {
            try {
                if (this.ebl.wCT() == 1) {
                    int iLk = le.lk(com.bytedance.sdk.openadsdk.core.kqm.Lxb(), 90.0f);
                    FrameLayout frameLayout = (FrameLayout) this.QAg.getBackupContainerBackgroundView();
                    if (frameLayout != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                        layoutParams.bottomMargin = iLk;
                        frameLayout.setLayoutParams(layoutParams);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void LD(boolean z) {
        this.ZU = z;
    }

    public LD Lxb() {
        return this.QAg;
    }

    public void Lxb(boolean z) {
        this.lk = z;
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.OY.QAg qAg, com.bytedance.sdk.openadsdk.core.OY.OY oy) {
        tD tDVar;
        if (this.QAg == null || (tDVar = this.ebl) == null) {
            return;
        }
        this.Lxb = Lxb(tDVar);
        qAg.Lxb(this.QAg);
        qAg.Lxb(this.Lxb);
        this.QAg.setClickListener(qAg);
        oy.Lxb((View) this.QAg);
        oy.Lxb(this.Lxb);
        this.QAg.setClickCreativeListener(oy);
    }

    private com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc Lxb(tD tDVar) {
        if (tDVar.sRq() == 4) {
            return com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.ebl.Lxb(this.lc, tDVar, this.OY);
        }
        return null;
    }

    public void Lxb(STP stp) {
        LD ld = this.QAg;
        if (ld == null) {
            return;
        }
        ld.setExpressVideoListenerProxy(stp);
    }

    public void Lxb(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        LD ld = this.QAg;
        if (ld == null) {
            return;
        }
        ld.setExpressInteractionListener(pAGExpressAdWrapperListener);
    }

    public JSONObject Lxb(JSONObject jSONObject) {
        LD ld = this.QAg;
        if (ld != null) {
            return ld.Lxb(jSONObject, this.nBu.LD);
        }
        return null;
    }

    public void Lxb(int i, boolean z) {
        LD ld = this.QAg;
        if (ld != null) {
            ld.Lxb(i, z, false);
        }
    }

    public void Lxb(int i, String str) {
        LD ld = this.QAg;
        if (ld != null) {
            ld.LD(i, str);
        }
    }
}
