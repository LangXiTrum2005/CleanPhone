package com.bytedance.sdk.openadsdk.core.JVA.ZU;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.badlogic.gdx.Input;
import com.bytedance.adsdk.ugeno.core.NXR;
import com.bytedance.adsdk.ugeno.core.OY;
import com.bytedance.adsdk.ugeno.core.sLN;
import com.bytedance.sdk.component.adexpress.ZU.ebl;
import com.bytedance.sdk.openadsdk.core.JVA.LD.lc;
import com.bytedance.sdk.openadsdk.core.model.STP;
import com.bytedance.sdk.openadsdk.core.model.id;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.le;
import com.umeng.analytics.pro.bc;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class JXs extends lk {
    private com.bytedance.adsdk.ugeno.LD.lk CSn;
    private com.bytedance.adsdk.ugeno.LD.lk aH;
    private boolean id;

    public JXs(Context context, tD tDVar, boolean z, Lxb lxb, ViewGroup viewGroup) {
        super(context, tDVar, z, lxb, viewGroup);
        this.id = false;
    }

    private void OY() {
        com.bytedance.adsdk.ugeno.LD.lk lkVar = this.aH;
        if (lkVar != null) {
            lkVar.lk(8);
        }
        com.bytedance.adsdk.ugeno.LD.lk lkVar2 = this.CSn;
        if (lkVar2 != null) {
            lkVar2.lk(8);
        }
    }

    private void QAg() {
        OY oy = new OY();
        HashMap map = new HashMap();
        map.put("image_info", this.lc.JVA());
        map.put("cache_dir", this.lc.STP());
        oy.Lxb(map);
        oy.Lxb(this.LD);
        oy.Lxb(this.ZU);
        oy.LD(this.eK);
        this.Lxb.Lxb(bc.aC, oy);
    }

    @Override // com.bytedance.sdk.openadsdk.core.JVA.ZU.lk
    public JSONObject LD() {
        return this.lc.lk();
    }

    @Override // com.bytedance.sdk.openadsdk.core.JVA.ZU.lk
    public JSONObject Lxb() {
        JSONObject jSONObjectLk = this.lc.lk();
        if (jSONObjectLk != null) {
            return jSONObjectLk.optJSONObject("xTemplate");
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.JVA.ZU.lk
    public int ZU() {
        QAg();
        this.Lxb.Lxb((sLN) this);
        this.Lxb.Lxb((NXR) this);
        id idVarDR = this.JXs.dR();
        try {
            if (idVarDR != null) {
                this.lk = this.Lxb.Lxb(this.ZU, this.eK, idVarDR.JXs());
            } else {
                this.lk = this.Lxb.Lxb(this.ZU, this.eK, null);
            }
            if (this.lk != null) {
                if (TextUtils.equals(this.Sfi, "rewarded_video")) {
                    this.aH = this.lk.ZU("RVCountdown");
                    this.CSn = this.lk.ZU("RVSkipView");
                } else {
                    this.aH = this.lk.ZU("FVCountdown");
                    this.CSn = this.lk.ZU("FVSkipView");
                }
                OY();
            }
            this.lc.Ivz().LD();
            this.lc.Ivz().lk();
            return 0;
        } catch (UnsatisfiedLinkError unused) {
            return Input.Keys.F9;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.JVA.ZU.lk
    public com.bytedance.adsdk.ugeno.LD.lk ebl() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.JVA.ZU.lk
    public com.bytedance.adsdk.ugeno.LD.lk lc() {
        com.bytedance.adsdk.ugeno.LD.lk<View> lkVar = this.lk;
        if (lkVar == null) {
            return null;
        }
        return lkVar.ZU("VideoV3");
    }

    @Override // com.bytedance.sdk.openadsdk.core.JVA.ZU.lk, com.bytedance.sdk.component.adexpress.dynamic.ZU
    public void setSoundMute(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.JVA.ZU.lk, com.bytedance.sdk.component.adexpress.dynamic.ZU
    public void setTime(CharSequence charSequence, int i, int i2, boolean z) {
        if (this.lk == null) {
            return;
        }
        boolean z2 = i == 1;
        Lxb(charSequence, z2, i2, z);
        LD(charSequence, z2, i2, z);
    }

    private void LD(CharSequence charSequence, boolean z, int i, boolean z2) {
        com.bytedance.adsdk.ugeno.LD.lk lkVar = this.CSn;
        if (lkVar != null && (lkVar instanceof lc)) {
            int i2 = 0;
            if (!z && !z2) {
                i2 = 8;
            }
            lkVar.lk(i2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.JVA.ZU.lk, com.bytedance.adsdk.ugeno.core.sLN
    public void Lxb(com.bytedance.adsdk.ugeno.LD.lk lkVar, String str, com.bytedance.adsdk.ugeno.ZU.LD.Lxb lxb) {
        if (this.OY == null || lxb == null) {
            return;
        }
        String strLD = lxb.LD();
        strLD.getClass();
        int i = 6;
        boolean z = true;
        switch (strLD) {
            case "openPrivacy":
                i = 7;
                break;
            case "pauseVideo":
            case "videoControl":
                i = 4;
                break;
            case "skip":
                break;
            case "convert":
                i = 2;
                break;
            case "muteVideo":
                i = 5;
                break;
            case "dislike":
                i = 3;
                break;
            default:
                i = 0;
                break;
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        WeakReference<View> weakReference = this.DY;
        if (weakReference != null) {
            int[] iArrLxb = le.Lxb(weakReference.get());
            if (iArrLxb != null) {
                iArr = iArrLxb;
            }
            int[] iArrLk = le.lk(this.DY.get());
            if (iArrLk != null) {
                iArr2 = iArrLk;
            }
        }
        STP.Lxb Lxb = new STP.Lxb().ZU(this.sLN).lk(this.NXR).LD(this.STP).Lxb(this.IeN).LD(this.VVE).Lxb(this.kqm).lk(iArr[0]).ZU(iArr[1]).JXs(iArr2[0]).lc(iArr2[1]).Lxb(this.HD);
        if (str.equals("tap") && !this.brP) {
            z = false;
        }
        this.OY.Lxb(lkVar.QAg(), i, Lxb.Lxb(z).Lxb(lkVar.xan()).LD(false).Lxb());
    }

    private void Lxb(CharSequence charSequence, boolean z, int i, boolean z2) {
        int i2;
        com.bytedance.adsdk.ugeno.LD.lk lkVar = this.aH;
        if (lkVar != null && (lkVar instanceof com.bytedance.sdk.openadsdk.core.JVA.LD.LD)) {
            try {
                i2 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                com.bytedance.sdk.component.utils.sLN.Lxb("UGenRender", "parse duration exception", charSequence);
                i2 = 0;
            }
            if (!z2 && i2 > 0 && !this.id) {
                this.aH.lk(0);
                if (!z && this.lc.Lxb() && ebl.LD(this.lc.ZU())) {
                    ((com.bytedance.sdk.openadsdk.core.JVA.LD.LD) this.aH).ebl(String.valueOf(i));
                    return;
                } else if (!"open_ad".equals(this.lc.ZU()) && this.lc.Lxb()) {
                    this.id = true;
                    this.aH.lk(8);
                    return;
                } else {
                    ((com.bytedance.sdk.openadsdk.core.JVA.LD.LD) this.aH).ebl(String.valueOf(charSequence));
                    return;
                }
            }
            this.aH.lk(8);
        }
    }
}
