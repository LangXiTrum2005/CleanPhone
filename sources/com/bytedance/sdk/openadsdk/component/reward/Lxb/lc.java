package com.bytedance.sdk.openadsdk.component.reward.Lxb;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.utils.nJ;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lc {
    private final Lxb Lxb;

    public lc(Lxb lxb) {
        this.Lxb = lxb;
    }

    public void Lxb(float[] fArr, final com.bytedance.sdk.openadsdk.core.NXR.ZU.LD ld, final com.bytedance.sdk.openadsdk.component.reward.LD.LD ld2) {
        com.bytedance.sdk.openadsdk.activity.lc lcVar;
        com.bytedance.sdk.openadsdk.component.reward.view.OY oy;
        Arrays.toString(fArr);
        AdSlot adSlotBuild = new AdSlot.Builder().setCodeId(String.valueOf(this.Lxb.LD.Td())).setExpressViewAcceptedSize(fArr[0], fArr[1]).build();
        Lxb lxb = this.Lxb;
        lxb.id.Lxb(adSlotBuild, lxb.BcA.IeN);
        Lxb lxb2 = this.Lxb;
        STP stp = lxb2.nJ;
        if (stp != null && (oy = lxb2.id) != null) {
            stp.Lxb(oy.Lxb());
        }
        this.Lxb.id.Lxb(new com.bytedance.sdk.openadsdk.core.OY.STP() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.lc.1
            @Override // com.bytedance.sdk.openadsdk.core.OY.STP
            public void JXs() {
                lc.this.Lxb.nE.Lxb(ld2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.OY.STP
            public void LD() {
                if (lc.this.Lxb.BcA == null || lc.this.Lxb.BcA.nBu() == null) {
                    return;
                }
                lc.this.Lxb.BcA.nBu().performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.core.OY.STP
            public void Lxb(boolean z) {
                if (lc.this.Lxb.Of != z) {
                    lc.this.Lxb.nJ.JXs();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.OY.STP
            public int ZU() {
                if (lc.this.Lxb.id.lk()) {
                    return 4;
                }
                if (lc.this.Lxb.id.ZU()) {
                    return 5;
                }
                if (lc.this.Lxb.eK.JXs()) {
                    return 1;
                }
                if (lc.this.Lxb.eK.LD()) {
                    return 2;
                }
                lc.this.Lxb.eK.ZU();
                return 3;
            }

            @Override // com.bytedance.sdk.openadsdk.core.OY.STP
            public long lk() {
                return lc.this.Lxb.eK.OY();
            }

            @Override // com.bytedance.sdk.openadsdk.core.OY.STP
            public void LD(int i) {
                lc.this.Lxb.JZE = i;
            }

            @Override // com.bytedance.sdk.openadsdk.core.OY.STP
            public void Lxb() {
                lc.this.Lxb.nJ.ZU();
            }

            @Override // com.bytedance.sdk.openadsdk.core.OY.STP
            public void Lxb(String str, JSONObject jSONObject) {
                if (lc.this.Lxb == null || lc.this.Lxb.dR == null) {
                    return;
                }
                lc.this.Lxb.dR.Lxb(str, jSONObject);
            }

            @Override // com.bytedance.sdk.openadsdk.core.OY.STP
            public void Lxb(int i) {
                if (i != 1) {
                    if (i == 2) {
                        lc.this.Lxb.eK.id();
                        return;
                    }
                    if (i == 3) {
                        lc.this.Lxb.eK.Lxb(ld);
                        return;
                    } else if (i == 4) {
                        lc.this.Lxb.eK.sLN();
                        return;
                    } else if (i != 5) {
                        return;
                    }
                }
                if (lc.this.Lxb.eK.LD() || lc.this.Lxb.eK.ZU()) {
                    return;
                }
                ld.Lxb(0L, false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.OY.STP
            public void Lxb(int i, String str) {
                lc.this.Lxb.eK.Lxb(i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.OY.STP
            public void Lxb(int i, com.bytedance.sdk.component.adexpress.LD.STP stp2) {
                lc.this.Lxb.BcA.Lxb(i, stp2);
            }
        });
        this.Lxb.id.Lxb(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.lc.2
            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
                if (lc.this.Lxb == null || lc.this.Lxb.LD == null || !lc.this.Lxb.LD.Iyd()) {
                    return;
                }
                ld.c_();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i) {
                if (!lc.this.Lxb.LD.JP()) {
                    lc.this.Lxb.hg.Lxb(true);
                    lc.this.Lxb.hg.JXs();
                }
                lc.this.Lxb.id.JXs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.lc.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ld2.Lxb(false, false, false, 90);
                    }
                });
                lc.this.Lxb.BcA.NXR();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f, float f2) {
                com.bytedance.sdk.openadsdk.core.model.kqm kqmVar;
                if (eK.brP(lc.this.Lxb.LD)) {
                    return;
                }
                if (!lc.this.Lxb.LD.JP()) {
                    if (lc.this.Lxb.id.OY()) {
                        ld2.Lxb(true);
                        lc.this.Lxb.eK.ZU(false);
                    } else {
                        lc.this.Lxb.eK.ZU(true);
                    }
                    lc.this.Lxb.BcA.Lxb(8);
                    lc.this.Lxb.hg.Lxb(true);
                    lc.this.Lxb.hg.JXs();
                    if (lc.this.Lxb.id.OY()) {
                        lc.this.Lxb.id.LD().setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                        ld2.Lxb(lc.this.Lxb.BcA.lc());
                    } else if (lc.this.Lxb.LD.JJ() != null && ld2.Lxb()) {
                        lc.this.Lxb.Lpq = true;
                    }
                }
                ld2.id();
                if (com.bytedance.sdk.openadsdk.core.model.kqm.lk(lc.this.Lxb.LD) && (kqmVar = lc.this.Lxb.BcA.IeN) != null) {
                    kqmVar.lk();
                }
                if (ld2 instanceof com.bytedance.sdk.openadsdk.component.reward.LD.lc) {
                    com.bytedance.sdk.openadsdk.component.reward.LD.lc.Lxb(lc.this.Lxb.LD, lc.this.Lxb.id.OY(), lc.this.Lxb.JXs);
                    if (!lc.this.Lxb.id.OY()) {
                        lc.this.Lxb.dR.lc();
                    }
                }
                lc.this.Lxb.BcA.NXR();
            }
        });
        Lxb lxb3 = this.Lxb;
        Activity activity = lxb3.Pw;
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = lxb3.LD;
        String str = lxb3.JXs;
        com.bytedance.sdk.openadsdk.core.OY.QAg qAg = new com.bytedance.sdk.openadsdk.core.OY.QAg(activity, tDVar, str, nJ.Lxb(str)) { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.lc.3
            @Override // com.bytedance.sdk.openadsdk.core.LD.LD, com.bytedance.sdk.openadsdk.core.LD.lk
            public void Lxb(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.LD.lk.Lxb> sparseArray, boolean z) {
                super.Lxb(view, f, f2, f3, f4, sparseArray, z);
            }
        };
        qAg.Lxb(new com.bytedance.sdk.openadsdk.core.LD.LD.Lxb() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.lc.4
            @Override // com.bytedance.sdk.openadsdk.core.LD.LD.Lxb
            public void Lxb(View view, int i) {
                ld.c_();
            }
        });
        HashMap map = new HashMap();
        if (eK.brP(this.Lxb.LD)) {
            map.put("click_scence", 3);
        } else {
            map.put("click_scence", 1);
        }
        Lxb lxb4 = this.Lxb;
        if (lxb4.nTb && (lcVar = lxb4.FGm) != null) {
            map.put("ad_show_order", Integer.valueOf(lcVar.QAg + 1));
        }
        qAg.Lxb(map);
        Lxb lxb5 = this.Lxb;
        Activity activity2 = lxb5.Pw;
        com.bytedance.sdk.openadsdk.core.model.tD tDVar2 = lxb5.LD;
        String str2 = lxb5.JXs;
        com.bytedance.sdk.openadsdk.core.OY.OY oy2 = new com.bytedance.sdk.openadsdk.core.OY.OY(activity2, tDVar2, str2, nJ.Lxb(str2)) { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.lc.5
            @Override // com.bytedance.sdk.openadsdk.core.LD.Lxb, com.bytedance.sdk.openadsdk.core.LD.LD, com.bytedance.sdk.openadsdk.core.LD.lk
            public void Lxb(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.LD.lk.Lxb> sparseArray, boolean z) {
                HashMap map2 = new HashMap();
                map2.put("duration", Long.valueOf(lc.this.Lxb.eK.ebl()));
                Lxb(map2);
                super.Lxb(view, f, f2, f3, f4, sparseArray, z);
            }
        };
        oy2.Lxb(new com.bytedance.sdk.openadsdk.core.LD.LD.Lxb() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.lc.6
            @Override // com.bytedance.sdk.openadsdk.core.LD.LD.Lxb
            public void Lxb(View view, int i) {
                ld.c_();
            }
        });
        HashMap map2 = new HashMap();
        if (eK.brP(this.Lxb.LD)) {
            map2.put("click_scence", 3);
        } else {
            map2.put("click_scence", 1);
        }
        oy2.Lxb(map2);
        this.Lxb.id.Lxb(qAg, oy2);
        FrameLayout.LayoutParams layoutParams = (this.Lxb.LD.JP() || com.bytedance.sdk.openadsdk.core.JVA.lk.Lxb(this.Lxb.LD.id()) || com.bytedance.sdk.openadsdk.core.model.kqm.lk(this.Lxb.LD)) ? new FrameLayout.LayoutParams(-1, -1) : new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.Lxb.BcA.lc().addView(this.Lxb.id.Lxb(), layoutParams);
        if (!this.Lxb.id.OY()) {
            ld2.Lxb(false);
        }
        this.Lxb.id.JVA();
    }
}
