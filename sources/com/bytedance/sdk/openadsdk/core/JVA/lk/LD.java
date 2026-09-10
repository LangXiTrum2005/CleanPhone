package com.bytedance.sdk.openadsdk.core.JVA.lk;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.LD.lk;
import com.bytedance.adsdk.ugeno.core.NXR;
import com.bytedance.adsdk.ugeno.core.nBu;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.ZU;
import com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.ebl;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.xan;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LD implements NXR, Lxb.InterfaceC0092Lxb {
    protected static int Lxb = 8;
    private boolean DY = true;
    private float IeN;
    private com.bytedance.sdk.openadsdk.core.JVA.JXs.Lxb JVA;
    private final com.bytedance.sdk.openadsdk.core.JVA.lc.Lxb JXs;
    private Lxb LD;
    private View NXR;
    private String OY;
    private JSONObject QAg;
    private float STP;
    private float VVE;
    private final tD ZU;
    private long brP;
    private String ebl;
    private float kqm;
    private String lc;
    private final Activity lk;
    private final com.bytedance.sdk.openadsdk.core.JVA.JXs.LD nBu;
    private String sLN;
    private long tD;

    public LD(Activity activity, tD tDVar, com.bytedance.sdk.openadsdk.core.JVA.lc.Lxb lxb, String str, com.bytedance.sdk.openadsdk.core.JVA.JXs.LD ld) {
        this.lk = activity;
        this.sLN = str;
        this.ZU = tDVar;
        this.nBu = ld;
        this.JXs = lxb;
    }

    private void LD() {
        int iSRq = this.ZU.sRq();
        if (iSRq != 2 && iSRq != 3) {
            if (iSRq == 4) {
                ebl.Lxb(this.lk, this.ZU, this.sLN).ZU();
                return;
            } else {
                if (iSRq != 5) {
                    return;
                }
                nJ.lk(this.lk, this.ZU.Nu());
                return;
            }
        }
        if (iSRq == 3) {
            String strSv = this.ZU.Sv();
            if (!TextUtils.isEmpty(strSv) && strSv.contains("play.google.com/store")) {
                if (ZU.Lxb(this.lk, strSv, strSv.substring(strSv.indexOf("?id=") + 4), this.sLN, this.ZU)) {
                    return;
                }
            }
        }
        Activity activity = this.lk;
        tD tDVar = this.ZU;
        int iLxb = nJ.Lxb(this.sLN);
        String str = this.sLN;
        xan.Lxb((Context) activity, tDVar, iLxb, (PAGNativeAd) null, (PangleAd) null, str, ebl.Lxb(this.lk, this.ZU, str), true, 0);
    }

    public void Lxb() {
        if (this.ZU == null) {
            this.nBu.Lxb(1, "material is null", "net");
            return;
        }
        if (this.JXs == null) {
            this.nBu.Lxb(1, "material ugen template is null", "net");
            return;
        }
        this.LD = new Lxb(this.lk);
        this.OY = this.JXs.lk();
        this.lc = this.JXs.Lxb();
        this.ebl = this.JXs.LD();
        this.QAg = this.ZU.JD();
        this.nBu.Lxb(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
        com.bytedance.sdk.openadsdk.core.JVA.Lxb.LD.Lxb().Lxb(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, this.OY, this.lc, this.ebl, "", new com.bytedance.sdk.openadsdk.core.JVA.Lxb.LD.Lxb() { // from class: com.bytedance.sdk.openadsdk.core.JVA.lk.LD.1
            @Override // com.bytedance.sdk.openadsdk.core.JVA.Lxb.LD.Lxb
            public void Lxb(JSONObject jSONObject, String str) {
                LD ld = LD.this;
                ld.Lxb(jSONObject, ld.QAg);
                LD.this.nBu.LD(str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.JVA.Lxb.LD.Lxb
            public void Lxb(int i, String str, String str2) {
                LD.this.nBu.Lxb(i, str, str2);
            }
        });
    }

    public void Lxb(View view) {
        this.NXR = view;
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.JVA.JXs.Lxb lxb) {
        this.JVA = lxb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(JSONObject jSONObject, JSONObject jSONObject2) {
        this.LD.Lxb((Lxb.InterfaceC0092Lxb) this);
        this.LD.Lxb((NXR) this);
        this.nBu.Lxb();
        this.LD.Lxb(jSONObject, jSONObject2, new com.bytedance.sdk.openadsdk.core.JVA.JXs.ZU() { // from class: com.bytedance.sdk.openadsdk.core.JVA.lk.LD.2
            @Override // com.bytedance.sdk.openadsdk.core.JVA.JXs.ZU
            public void Lxb(int i, String str) {
                if (LD.this.nBu != null) {
                    LD.this.nBu.Lxb(i, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.JVA.JXs.ZU
            public void Lxb(lk<View> lkVar) {
                if (LD.this.nBu != null) {
                    LD.this.nBu.Lxb(lkVar);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.JVA.lk.Lxb.InterfaceC0092Lxb
    public void Lxb(nBu nbu) {
        String strOptString = nbu.lk().optString("type");
        strOptString.getClass();
        switch (strOptString) {
            case "privacy":
                if (this.lk != null && !TextUtils.isEmpty(kqm.ZU().nJ())) {
                    TTWebsiteActivity.Lxb(this.lk, this.ZU, this.sLN);
                    break;
                }
                break;
            case "close":
                com.bytedance.sdk.openadsdk.core.JVA.JXs.Lxb lxb = this.JVA;
                if (lxb != null) {
                    lxb.LD();
                    break;
                }
                break;
            case "creative":
                if (this.lk != null && this.ZU != null) {
                    LD();
                    ComponentCallbacks2 componentCallbacks2 = this.lk;
                    if (componentCallbacks2 instanceof com.bytedance.sdk.openadsdk.core.NXR.ZU.LD) {
                        ((com.bytedance.sdk.openadsdk.core.NXR.ZU.LD) componentCallbacks2).ZU();
                    }
                    Lxb(nbu, this.ZU);
                    break;
                }
                break;
        }
    }

    private void Lxb(nBu nbu, tD tDVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("down_x", this.STP);
            jSONObject.put("down_y", this.IeN);
            jSONObject.put("down_time", this.brP);
            jSONObject.put("up_x", this.VVE);
            jSONObject.put("up_y", this.kqm);
            jSONObject.put("up_time", this.tD);
            View viewQAg = nbu.Lxb().QAg();
            int i = 1;
            if (viewQAg != null) {
                JSONObject jSONObject2 = new JSONObject();
                int[] iArr = new int[2];
                float width = viewQAg.getWidth();
                float height = viewQAg.getHeight();
                viewQAg.getLocationOnScreen(iArr);
                float f = iArr[0];
                float f2 = iArr[1];
                jSONObject2.put("width", width);
                jSONObject2.put("height", height);
                jSONObject2.put(TtmlNode.LEFT, f);
                jSONObject2.put("top", f2);
                jSONObject.put("rectInfo", jSONObject2);
            }
            View view = this.NXR;
            if (view != null) {
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                jSONObject.put("button_x", iArr2[0]);
                jSONObject.put("button_y", iArr2[1]);
                jSONObject.put("button_width", this.NXR.getWidth());
                jSONObject.put("button_height", this.NXR.getHeight());
            }
            View viewFindViewById = this.lk.findViewById(R.id.content);
            if (viewFindViewById != null) {
                int[] iArr3 = new int[2];
                viewFindViewById.getLocationOnScreen(iArr3);
                jSONObject.put("ad_x", iArr3[0]);
                jSONObject.put("ad_y", iArr3[1]);
                jSONObject.put("width", viewFindViewById.getWidth());
                jSONObject.put("height", viewFindViewById.getHeight());
            }
            jSONObject.put("click_area_type", nbu.Lxb().xan());
            jSONObject.put("brick_id", nbu.Lxb().nE());
            jSONObject.put("endcard_id", this.lc);
            jSONObject.put("click_scence", 2);
            if (!this.DY) {
                i = 2;
            }
            jSONObject.put("user_behavior_type", i);
            com.bytedance.sdk.openadsdk.core.JVA.JXs.Lxb lxb = this.JVA;
            if (lxb != null) {
                jSONObject.put("endcard_type", lxb.Lxb());
            }
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar, this.sLN, CampaignEx.JSON_NATIVE_VIDEO_CLICK, jSONObject);
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.NXR
    public void Lxb(lk lkVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.brP = System.currentTimeMillis();
            this.STP = motionEvent.getRawX();
            this.IeN = motionEvent.getRawY();
            this.DY = true;
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            if (Math.abs(motionEvent.getRawX() - this.STP) >= Lxb || Math.abs(motionEvent.getRawY() - this.IeN) >= Lxb) {
                this.DY = false;
                return;
            }
            return;
        }
        this.VVE = motionEvent.getRawX();
        this.kqm = motionEvent.getRawY();
        if (Math.abs(this.VVE - this.STP) >= Lxb || Math.abs(this.kqm - this.IeN) >= Lxb) {
            this.DY = false;
        }
        this.tD = System.currentTimeMillis();
    }
}
