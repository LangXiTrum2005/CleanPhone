package com.bytedance.sdk.openadsdk.component.reward.qdl;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.aaj;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.gy;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mo {
    private qdl qdl;
    private boolean ud;

    public mo(qdl qdlVar) {
        this.qdl = qdlVar;
    }

    private void ud() {
        com.bytedance.sdk.openadsdk.activity.jpc jpcVar;
        qdl qdlVar = this.qdl;
        Activity activity = qdlVar.ag;
        ljh ljhVar = qdlVar.ud;
        String str = qdlVar.mzz;
        com.bytedance.sdk.openadsdk.core.tvp.tvp tvpVar = new com.bytedance.sdk.openadsdk.core.tvp.tvp(activity, ljhVar, str, gy.qdl(str)) { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.mo.3
            @Override // com.bytedance.sdk.openadsdk.core.lnr.ud, com.bytedance.sdk.openadsdk.core.lnr.lnr
            public void qdl(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl> sparseArray, boolean z2) {
                super.qdl(view, f, f2, f3, f4, sparseArray, z2);
            }
        };
        tvpVar.qdl(new com.bytedance.sdk.openadsdk.core.lnr.ud.qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.mo.4
            @Override // com.bytedance.sdk.openadsdk.core.lnr.ud.qdl
            public void qdl(View view, int i2) {
                mo.this.qdl.wc.mrf();
            }
        });
        HashMap map = new HashMap();
        map.put("click_scence", 1);
        qdl qdlVar2 = this.qdl;
        if (qdlVar2.ra && (jpcVar = qdlVar2.lq) != null) {
            int i2 = jpcVar.rq + 1;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_show_order", i2);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Throwable unused) {
            }
        }
        tvpVar.qdl(map);
        qdl qdlVar3 = this.qdl;
        Activity activity2 = qdlVar3.ag;
        ljh ljhVar2 = qdlVar3.ud;
        String str2 = qdlVar3.mzz;
        com.bytedance.sdk.openadsdk.core.tvp.jpc jpcVar2 = new com.bytedance.sdk.openadsdk.core.tvp.jpc(activity2, ljhVar2, str2, gy.qdl(str2)) { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.mo.5
            @Override // com.bytedance.sdk.openadsdk.core.lnr.qdl, com.bytedance.sdk.openadsdk.core.lnr.ud, com.bytedance.sdk.openadsdk.core.lnr.lnr
            public void qdl(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl> sparseArray, boolean z2) {
                HashMap map2 = new HashMap();
                map2.put("duration", Long.valueOf(mo.this.qdl.bch.fs()));
                if (mo.this.qdl.lq != null) {
                    mo.this.qdl.lq.qdl(map2, f, f2);
                }
                qdl(map2);
                super.qdl(view, f, f2, f3, f4, sparseArray, z2);
            }
        };
        jpcVar2.qdl(new com.bytedance.sdk.openadsdk.core.lnr.ud.qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.mo.6
            @Override // com.bytedance.sdk.openadsdk.core.lnr.ud.qdl
            public void qdl(View view, int i3) {
                mo.this.qdl.wc.mrf();
            }
        });
        HashMap map2 = new HashMap();
        map2.put("click_scence", 1);
        jpcVar2.qdl(map2);
        this.qdl.bqt.qdl(tvpVar, jpcVar2);
    }

    public void qdl(float[] fArr) {
        com.bytedance.sdk.openadsdk.component.reward.view.to toVar;
        this.ud = true;
        Arrays.toString(fArr);
        AdSlot adSlotBuild = new AdSlot.Builder().setCodeId(String.valueOf(this.qdl.ud.fz())).setExpressViewAcceptedSize(fArr[0], fArr[1]).build();
        qdl qdlVar = this.qdl;
        qdlVar.bqt.qdl(adSlotBuild, qdlVar.gy.bjy);
        qdl qdlVar2 = this.qdl;
        fs fsVar = qdlVar2.fco;
        if (fsVar != null && (toVar = qdlVar2.bqt) != null) {
            fsVar.qdl(toVar.qdl());
        }
        this.qdl.bqt.qdl(new com.bytedance.sdk.openadsdk.core.tvp.bjy() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.mo.1
            @Override // com.bytedance.sdk.openadsdk.core.tvp.bjy
            public long lnr() {
                return mo.this.qdl.bch.exu();
            }

            @Override // com.bytedance.sdk.openadsdk.core.tvp.bjy
            public long mml() {
                return mo.this.qdl.bch.qdl();
            }

            @Override // com.bytedance.sdk.openadsdk.core.tvp.bjy
            public void mo() {
                mo.this.qdl.kdv.qdl(mo.this.qdl.en);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tvp.bjy
            public int mzz() {
                if (mo.this.qdl.bqt.lnr()) {
                    return 4;
                }
                if (mo.this.qdl.bqt.mml()) {
                    return 5;
                }
                if (mo.this.qdl.bch.to()) {
                    return 1;
                }
                if (mo.this.qdl.bch.mo()) {
                    return 2;
                }
                mo.this.qdl.bch.tvp();
                return 3;
            }

            @Override // com.bytedance.sdk.openadsdk.core.tvp.bjy
            public void qdl(boolean z2, String str) {
                if (mo.this.qdl.gt != z2) {
                    mo.this.qdl.fco.qdl(str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.tvp.bjy
            public boolean ud(JSONObject jSONObject) {
                return com.bytedance.sdk.openadsdk.component.reward.qdl.qdl(mo.this.qdl);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tvp.bjy
            public void ud() {
                if (mo.this.qdl.gy == null || mo.this.qdl.gy.to() == null) {
                    return;
                }
                mo.this.qdl.gy.to().performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.core.tvp.bjy
            public void qdl() {
                mo.this.qdl.fco.mml();
            }

            @Override // com.bytedance.sdk.openadsdk.core.tvp.bjy
            public void qdl(String str, JSONObject jSONObject) {
                if (mo.this.qdl == null || mo.this.qdl.wc == null) {
                    return;
                }
                mo.this.qdl.wc.qdl(str, jSONObject);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tvp.bjy
            public void ud(int i2) {
                mo.this.qdl.xi = i2;
            }

            @Override // com.bytedance.sdk.openadsdk.core.tvp.bjy
            public boolean qdl(JSONObject jSONObject) {
                if (mo.this.qdl == null || mo.this.qdl.bch == null) {
                    return false;
                }
                return mo.this.qdl.bch.qdl(jSONObject);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tvp.bjy
            public void qdl(int i2) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        mo.this.qdl.bch.hkc();
                        return;
                    }
                    if (i2 == 3) {
                        mo.this.qdl.bch.qdl(mo.this.qdl.wc);
                        return;
                    } else if (i2 == 4) {
                        mo.this.qdl.bch.jl();
                        return;
                    } else if (i2 != 5) {
                        return;
                    }
                }
                if (mo.this.qdl.bch.mo() || mo.this.qdl.bch.tvp()) {
                    return;
                }
                mo.this.qdl.wc.qdl(0L, false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tvp.bjy
            public void qdl(int i2, String str) {
                mo.this.qdl.bch.qdl(i2, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tvp.bjy
            public void qdl(int i2, com.bytedance.sdk.component.adexpress.ud.rdp rdpVar) {
                mo.this.qdl.gy.qdl(i2, rdpVar);
            }
        });
        this.qdl.bqt.qdl(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.mo.2
            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
                if (mo.this.qdl == null || mo.this.qdl.ud == null || !mo.this.qdl.ud.vxm()) {
                    return;
                }
                mo.this.qdl.wc.mrf();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i2) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i2) {
                if (!mo.this.qdl.ud.au()) {
                    mo.this.qdl.hkc.qdl(true);
                    mo.this.qdl.hkc.mzz();
                }
                mo.this.qdl.bqt.mzz().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.mo.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        mo.this.qdl.en.qdl(false, false, false, 90);
                    }
                });
                mo.this.qdl.gy.exu();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f, float f2) {
                aaj aajVar;
                if (!mo.this.qdl.ud.au()) {
                    if (mo.this.qdl.bqt.tvp()) {
                        mo.this.qdl.en.qdl(true);
                        mo.this.qdl.bch.mml(false);
                    } else {
                        mo.this.qdl.bch.mml(true);
                    }
                    mo.this.qdl.gy.qdl(8);
                    mo.this.qdl.hkc.qdl(true);
                    mo.this.qdl.hkc.mzz();
                    if (mo.this.qdl.bqt.tvp()) {
                        mo.this.qdl.bqt.ud().setBackgroundColor(-16777216);
                        mo.this.qdl.en.qdl(mo.this.qdl.gy.mo());
                    } else if (mo.this.qdl.ud.tdy() != null && mo.this.qdl.en.qdl()) {
                        mo.this.qdl.jjk = true;
                    }
                }
                mo.this.qdl.en.uw();
                if (aaj.lnr(mo.this.qdl.ud) && (aajVar = mo.this.qdl.gy.bjy) != null) {
                    aajVar.lnr();
                }
                mo.this.qdl.gy.exu();
            }
        });
        ud();
        FrameLayout.LayoutParams layoutParams = (this.qdl.ud.au() || com.bytedance.sdk.openadsdk.core.rq.mml.qdl(this.qdl.ud.ra()) || aaj.lnr(this.qdl.ud)) ? new FrameLayout.LayoutParams(-1, -1) : new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.qdl.gy.mo().addView(this.qdl.bqt.qdl(), layoutParams);
        if (!this.qdl.bqt.tvp()) {
            this.qdl.en.qdl(false);
        }
        this.qdl.bqt.rdp();
    }

    public void qdl(ljh ljhVar) {
        com.bytedance.sdk.openadsdk.component.reward.view.to toVar = this.qdl.bqt;
        if (toVar != null) {
            com.bytedance.sdk.openadsdk.component.reward.view.mml mmlVarQdl = toVar.qdl();
            ViewParent parent = mmlVarQdl.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(mmlVarQdl);
            }
            this.qdl.gy.mo().addView(mmlVarQdl);
            if (!this.qdl.bqt.tvp()) {
                this.qdl.en.qdl(false);
            }
            this.qdl.bqt.qdl(ljhVar);
            ud();
        }
    }

    public boolean qdl() {
        return this.ud;
    }

    public void qdl(qdl qdlVar) {
        this.qdl = qdlVar;
    }
}
