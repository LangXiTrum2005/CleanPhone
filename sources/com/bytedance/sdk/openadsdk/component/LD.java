package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.OY.OY;
import com.bytedance.sdk.openadsdk.core.OY.QAg;
import com.bytedance.sdk.openadsdk.core.model.tD;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LD extends lk {
    private com.bytedance.sdk.openadsdk.component.QAg.ebl IeN;
    private com.bytedance.sdk.openadsdk.component.QAg.LD NXR;
    private boolean STP;
    private final com.bytedance.sdk.openadsdk.component.lc.LD sLN;

    public LD(Activity activity, tD tDVar, FrameLayout frameLayout, Lxb lxb, int i, boolean z, com.bytedance.sdk.openadsdk.component.OY.Lxb lxb2, com.bytedance.sdk.openadsdk.component.lc.LD ld) {
        super(activity, tDVar, frameLayout, lxb, i, z, lxb2);
        this.sLN = ld;
    }

    @Override // com.bytedance.sdk.openadsdk.component.lk
    public void JXs() {
        com.bytedance.sdk.openadsdk.component.QAg.LD ld = this.NXR;
        if (ld != null) {
            ld.OY();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.lk
    public void LD() {
        this.NXR.QAg();
    }

    @Override // com.bytedance.sdk.openadsdk.component.lk
    public int ZU() {
        return this.NXR.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.component.lk
    public void lk() {
        super.lk();
        com.bytedance.sdk.openadsdk.component.QAg.LD ld = this.NXR;
        if (ld != null) {
            ld.JVA();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.lk
    public void Lxb(ViewGroup viewGroup) {
        Pair<Float, Float> pairLxb = com.bytedance.sdk.openadsdk.core.OY.Lxb.Lxb.Lxb(this.Lxb.getWindow(), this.ebl);
        com.bytedance.sdk.openadsdk.component.QAg.LD ld = new com.bytedance.sdk.openadsdk.component.QAg.LD(this.Lxb, this.LD, new AdSlot.Builder().setCodeId(String.valueOf(this.LD.Td())).setExpressViewAcceptedSize(((Float) pairLxb.first).floatValue(), ((Float) pairLxb.second).floatValue()).build(), "open_ad", this.JXs, this.sLN, this.JVA);
        this.NXR = ld;
        ld.setTopListener(this.JXs);
        this.NXR.setExpressVideoListenerProxy(this.JXs);
        this.NXR.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.LD.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i) {
                LD.this.JXs.ZU();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f, float f2) {
                if (LD.this.NXR.NXR()) {
                    LD.this.STP = true;
                    if (LD.this.IeN != null) {
                        LD ld2 = LD.this;
                        if (ld2.ZU == ld2.IeN.getParent()) {
                            LD ld3 = LD.this;
                            ld3.ZU.removeView(ld3.IeN);
                        }
                    }
                    LD ld4 = LD.this;
                    LD.super.Lxb((ViewGroup) ld4.ZU);
                    LD.super.Lxb();
                    LD.super.LD();
                    return;
                }
                if (LD.this.LD.kVf()) {
                    LD.this.JXs.lk();
                    return;
                }
                LD ld5 = LD.this;
                if (!ld5.lk) {
                    ld5.JXs.lk();
                } else if (!ld5.Lxb(ld5.NXR.getVideoFrameLayout())) {
                    LD.this.JXs.ZU();
                } else {
                    LD.this.NXR.setVideoManager(LD.this.ebl());
                    LD.this.JXs.lk();
                }
            }
        });
        this.LD.OY(1);
        this.ZU.addView(this.NXR, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.QAg.ebl eblVar = new com.bytedance.sdk.openadsdk.component.QAg.ebl(this.Lxb);
        this.IeN = eblVar;
        this.ZU.addView(eblVar);
        this.QAg = this.IeN.getTopDislike();
        com.bytedance.sdk.openadsdk.core.JXs.ZU topSkip = this.IeN.getTopSkip();
        this.nBu = topSkip;
        topSkip.setVisibility(4);
    }

    @Override // com.bytedance.sdk.openadsdk.component.lk
    public void Lxb() {
        QAg qAgLxb = com.bytedance.sdk.openadsdk.component.Lxb.LD.Lxb(this.LD, this.Lxb, this.JVA, this.NXR);
        qAgLxb.Lxb(new com.bytedance.sdk.openadsdk.core.LD.LD.Lxb() { // from class: com.bytedance.sdk.openadsdk.component.LD.2
            @Override // com.bytedance.sdk.openadsdk.core.LD.LD.Lxb
            public void Lxb(View view, int i) {
                LD.this.JXs.JXs();
            }
        });
        this.NXR.setClickListener(qAgLxb);
        OY oyLD = com.bytedance.sdk.openadsdk.component.Lxb.LD.LD(this.LD, this.Lxb, this.JVA, this.NXR);
        this.NXR.setClickCreativeListener(oyLD);
        oyLD.Lxb(new com.bytedance.sdk.openadsdk.core.LD.LD.Lxb() { // from class: com.bytedance.sdk.openadsdk.component.LD.3
            @Override // com.bytedance.sdk.openadsdk.core.LD.LD.Lxb
            public void Lxb(View view, int i) {
                LD.this.JXs.JXs();
            }
        });
        super.lc();
        this.NXR.setBackupListener(new com.bytedance.sdk.component.adexpress.LD.lk() { // from class: com.bytedance.sdk.openadsdk.component.LD.4
            @Override // com.bytedance.sdk.component.adexpress.LD.lk
            public boolean Lxb(ViewGroup viewGroup, int i) {
                StringBuilder sb = new StringBuilder("isUseBackup() called with: view = [");
                sb.append(viewGroup);
                sb.append("], errCode = [");
                sb.append(i);
                sb.append("]");
                try {
                    ((com.bytedance.sdk.openadsdk.core.OY.tD) viewGroup).sLN();
                    new com.bytedance.sdk.openadsdk.component.QAg.Lxb(LD.this.Lxb).Lxb((com.bytedance.sdk.openadsdk.core.OY.tD) LD.this.NXR);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.component.lk
    public void Lxb(int i, int i2, boolean z) {
        super.Lxb(i, i2, z);
    }

    @Override // com.bytedance.sdk.openadsdk.component.lk
    public JSONObject Lxb(JSONObject jSONObject) {
        return this.NXR.Lxb(jSONObject, this.LD);
    }
}
