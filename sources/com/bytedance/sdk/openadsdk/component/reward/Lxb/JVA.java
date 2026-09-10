package com.bytedance.sdk.openadsdk.component.reward.Lxb;

import android.R;
import android.annotation.SuppressLint;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.DY;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.utils.le;
import com.pgl.ssdk.ces.out.DungeonFlag;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class JVA {
    private final com.bytedance.sdk.openadsdk.core.LD.LD LD;
    private final Lxb Lxb;
    private final com.bytedance.sdk.openadsdk.core.LD.JXs lk;

    @DungeonFlag
    public JVA(Lxb lxb) {
        this.Lxb = lxb;
        this.lk = Lxb(lxb, lxb.LD);
        this.LD = new com.bytedance.sdk.openadsdk.core.LD.LD(lxb.Pw, lxb.LD, lxb.JXs, lxb.ZU ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.JVA.1
            @Override // com.bytedance.sdk.openadsdk.core.LD.LD, com.bytedance.sdk.openadsdk.core.LD.lk
            public void Lxb(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.LD.lk.Lxb> sparseArray, boolean z) {
                try {
                    JVA.this.Lxb(view, f, f2, f3, f4, sparseArray, this.Ivz, this.foI, this.KPU);
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.RFReportManager", "onClickReport error :" + e.getMessage());
                }
                com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(JVA.this.Lxb.LD, 9);
                JVA.this.Lxb.eK.hg();
            }
        };
    }

    private boolean OY() {
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.Lxb.LD;
        return tDVar != null && tDVar.NDz() == 1;
    }

    private JSONObject QAg() {
        try {
            long jVVE = this.Lxb.eK.VVE();
            int iKqm = this.Lxb.eK.kqm();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", jVVE);
                jSONObject.put("percent", iKqm);
                return jSONObject;
            } catch (Throwable unused) {
                return jSONObject;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public com.bytedance.sdk.openadsdk.core.LD.JXs JXs() {
        return this.lk;
    }

    @DungeonFlag
    public void LD() {
        boolean z;
        com.bytedance.sdk.openadsdk.activity.lc lcVar;
        com.bytedance.sdk.openadsdk.component.reward.view.OY oy;
        if (this.Lxb.NXR.get()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (!this.Lxb.LD.Lxb() || (oy = this.Lxb.id) == null) {
                z = false;
            } else {
                jSONObject.put("dynamic_show_type", oy.QAg());
                this.Lxb.id.Lxb(jSONObject);
                z = true;
            }
            com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.Lxb.LD;
            Lxb(jSONObject);
            View viewFindViewById = this.Lxb.Pw.findViewById(R.id.content);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("width", viewFindViewById.getWidth());
                jSONObject2.put("height", viewFindViewById.getHeight());
                jSONObject2.put("alpha", viewFindViewById.getAlpha());
            } catch (Throwable unused) {
            }
            jSONObject.put("root_view", jSONObject2.toString());
            if (this.Lxb.NXR.compareAndSet(false, true)) {
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar, this.Lxb.JXs, jSONObject);
                this.Lxb.dR.lc();
                com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb lxb = new com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(z ? this.Lxb.id.QAg() : -1);
                Lxb lxb2 = this.Lxb;
                if (lxb2.nTb && (lcVar = lxb2.FGm) != null) {
                    lxb.LD = lcVar.QAg;
                }
                com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(lxb2.Pw.findViewById(R.id.content), tDVar, lxb);
                com.bytedance.sdk.openadsdk.eK.Lxb.lk.Lxb(tDVar);
            }
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.RFReportManager", "reportShowWhenBindVideoAd error", e);
        }
    }

    public com.bytedance.sdk.openadsdk.core.LD.LD ZU() {
        return this.LD;
    }

    public void ebl() {
        JSONObject jSONObject = new JSONObject();
        Lxb(jSONObject);
        Lxb lxb = this.Lxb;
        com.bytedance.sdk.openadsdk.ZU.lk.JXs(lxb.LD, lxb.JXs, jSONObject);
    }

    public void lc() {
        JSONObject jSONObject = new JSONObject();
        if (eK.brP(this.Lxb.LD)) {
            this.Lxb.CSn.Lxb(jSONObject);
        }
        int i = 1;
        try {
            if (this.Lxb.nBu.get()) {
                if (!this.Lxb.hg.lk()) {
                    if (this.Lxb.CG.ZU()) {
                        i = 3;
                    } else {
                        i = this.Lxb.hg.ZU() ? 2 : 0;
                    }
                }
                jSONObject.put("endcard_content", i);
            } else {
                jSONObject.put("endCardNotShow", 1);
            }
        } catch (JSONException unused) {
        }
        Lxb lxb = this.Lxb;
        com.bytedance.sdk.openadsdk.ZU.lk.LD(lxb.LD, lxb.JXs, "click_close", jSONObject);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public com.bytedance.sdk.openadsdk.core.LD.JXs lk() {
        this.lk.Lxb(this.Lxb.Pw.findViewById(R.id.content));
        this.lk.LD(this.Lxb.rW.findViewById(520093713));
        if (this.Lxb.aH.lk() != null) {
            this.lk.Lxb(this.Lxb.aH.lk());
        }
        this.Lxb.CSn.Lxb(this.lk);
        this.lk.Lxb(new com.bytedance.sdk.openadsdk.core.LD.Lxb.InterfaceC0093Lxb() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.JVA.3
            @Override // com.bytedance.sdk.openadsdk.core.LD.Lxb.InterfaceC0093Lxb
            public long getVideoProgress() {
                return JVA.this.Lxb.eK.ebl();
            }
        });
        com.bytedance.sdk.openadsdk.component.reward.view.nBu nbu = this.Lxb.BcA;
        com.bytedance.sdk.openadsdk.core.LD.JXs jXs = this.lk;
        nbu.Lxb(jXs, jXs, this.LD);
        this.Lxb.le.Lxb(this.lk);
        return this.lk;
    }

    @DungeonFlag
    public void Lxb() {
        com.bytedance.sdk.openadsdk.activity.lc lcVar;
        if (this.Lxb.NXR.get()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.Lxb.LD;
        Lxb(jSONObject);
        if (this.Lxb.NXR.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar, this.Lxb.JXs, jSONObject);
            this.Lxb.dR.lc();
            com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb lxb = new com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(-1);
            Lxb lxb2 = this.Lxb;
            if (lxb2.nTb && (lcVar = lxb2.FGm) != null) {
                lxb.LD = lcVar.QAg;
            }
            com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(lxb2.Pw.findViewById(R.id.content), tDVar, lxb);
            com.bytedance.sdk.openadsdk.eK.Lxb.lk.Lxb(tDVar);
        }
    }

    public void lk(boolean z) {
        Lxb lxb = this.Lxb;
        if (lxb != null && z && lxb.LD.wVL() && !this.Lxb.LD.aE()) {
            this.Lxb.LD.ebl(true);
            Lxb lxb2 = this.Lxb;
            com.bytedance.sdk.openadsdk.core.model.tD tDVar = lxb2.LD;
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar, lxb2.JXs, tDVar.Kue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.activity.lc lcVar;
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.Lxb.LD;
        if ((tDVar instanceof DY) && ((DY) tDVar).UQi()) {
            try {
                jSONObject.put("choose_one_ad_real_show", true);
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.RFReportManager", "reportShow json error", e);
            }
        }
        Lxb lxb = this.Lxb;
        if (!lxb.nTb || (lcVar = lxb.FGm) == null) {
            return;
        }
        try {
            jSONObject.put("ad_show_order", lcVar.QAg + 1);
        } catch (JSONException unused) {
        }
    }

    @DungeonFlag
    public void LD(boolean z) {
        Lxb lxb = this.Lxb;
        if (lxb == null) {
            return;
        }
        if (!z && lxb.NXR.get() && this.Lxb.FD > 0) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.Lxb.FD);
            Lxb lxb2 = this.Lxb;
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(strValueOf, lxb2.LD, lxb2.JXs, lxb2.eK.Lxb());
            this.Lxb.FD = 0L;
        } else {
            this.Lxb.FD = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(this.Lxb.LD, z ? 4 : 8);
        com.bytedance.sdk.openadsdk.eK.Lxb.lk.Lxb(this.Lxb.LD, z ? 4 : 8);
    }

    @DungeonFlag
    public void Lxb(final Map<String, Object> map) {
        if (this.Lxb.NXR.get()) {
            return;
        }
        this.Lxb.NXR.set(true);
        final View viewFindViewById = this.Lxb.Pw.findViewById(R.id.content);
        if (viewFindViewById == null) {
            viewFindViewById = this.Lxb.Pw.getWindow().getDecorView();
        }
        viewFindViewById.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.JVA.2
            @Override // java.lang.Runnable
            public void run() {
                Map map2;
                boolean z = false;
                if (JVA.this.Lxb.STP.compareAndSet(false, true)) {
                    com.bytedance.sdk.openadsdk.core.model.tD tDVar = JVA.this.Lxb.LD;
                    JSONObject jSONObject = null;
                    try {
                        jSONObject = map != null ? new JSONObject(map) : new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("width", viewFindViewById.getWidth());
                        jSONObject2.put("height", viewFindViewById.getHeight());
                        jSONObject2.put("alpha", viewFindViewById.getAlpha());
                        jSONObject.put("root_view", jSONObject2.toString());
                        JVA.this.Lxb(jSONObject);
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.RFReportManager", "run: ", th);
                    }
                    com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar, JVA.this.Lxb.JXs, jSONObject);
                    JVA.this.Lxb.dR.lc();
                    if (JVA.this.Lxb.id != null && (map2 = map) != null && map2.containsKey("dynamic_show_type")) {
                        z = true;
                    }
                    com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb lxb = new com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(z ? JVA.this.Lxb.id.QAg() : -1);
                    if (JVA.this.Lxb.nTb && JVA.this.Lxb.FGm != null) {
                        lxb.LD = JVA.this.Lxb.FGm.QAg;
                    }
                    com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(JVA.this.Lxb.Pw.findViewById(R.id.content), tDVar, lxb);
                    com.bytedance.sdk.openadsdk.eK.Lxb.lk.Lxb(tDVar);
                }
            }
        });
    }

    public void Lxb(boolean z) {
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.Lxb.LD;
        if (tDVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.STP.Lxb.ZU zuJXs = com.bytedance.sdk.openadsdk.STP.Lxb.ZU.LD().Lxb(z ? 7 : 8).lk(String.valueOf(tDVar.Td())).JXs(this.Lxb.LD.xNP());
        zuJXs.LD(this.Lxb.hg.eK()).lc(this.Lxb.hg.aH());
        zuJXs.ebl(this.Lxb.LD.Lv()).ZU(this.Lxb.LD.bG());
        com.bytedance.sdk.openadsdk.STP.lk.Lxb().LD(zuJXs);
    }

    private void LD(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.LD.lk.Lxb> sparseArray, int i, int i2, int i3) {
        if (!OY() || this.Lxb.LD == null || view == null) {
            return;
        }
        int id = view.getId();
        if (id == com.bytedance.sdk.openadsdk.utils.STP.JXs || id == com.bytedance.sdk.openadsdk.utils.STP.ZU || id == com.bytedance.sdk.openadsdk.utils.STP.lk || id == com.bytedance.sdk.openadsdk.utils.STP.LD || id == com.bytedance.sdk.openadsdk.utils.STP.sLN || id == com.bytedance.sdk.openadsdk.utils.STP.Za || id == com.bytedance.sdk.openadsdk.utils.STP.kqm || id == 520093705 || id == com.bytedance.sdk.openadsdk.utils.STP.JVA || id == 520093707 || id == com.bytedance.sdk.openadsdk.utils.STP.ebl) {
            int iEbl = le.ebl(com.bytedance.sdk.openadsdk.core.kqm.Lxb());
            com.bytedance.sdk.openadsdk.core.model.nBu nbuLxb = new com.bytedance.sdk.openadsdk.core.model.nBu.Lxb().lc(f).JXs(f2).ZU(f3).lk(f4).LD(System.currentTimeMillis()).Lxb(0L).LD(le.Lxb(this.Lxb.BcA.JVA())).Lxb(le.Lxb((View) null)).lk(le.lk(this.Lxb.BcA.JVA())).ZU(le.lk((View) null)).ZU(i2).JXs(i3).lc(i).Lxb(sparseArray).LD(com.bytedance.sdk.openadsdk.core.QAg.LD().Lxb() ? 1 : 2).lk(iEbl).Lxb(le.JXs(com.bytedance.sdk.openadsdk.core.kqm.Lxb())).LD(le.lc(com.bytedance.sdk.openadsdk.core.kqm.Lxb())).Lxb();
            HashMap map = new HashMap();
            map.put("duration", Long.valueOf(this.Lxb.eK.ebl()));
            Lxb lxb = this.Lxb;
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb("click_other", lxb.LD, nbuLxb, lxb.JXs, true, (Map<String, Object>) map, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @DungeonFlag
    public void Lxb(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.LD.lk.Lxb> sparseArray, int i, int i2, int i3) {
        if (view == null) {
            return;
        }
        if (view.getId() == com.bytedance.sdk.openadsdk.utils.STP.JXs) {
            Lxb("click_play_star_level", (JSONObject) null);
        } else if (view.getId() != com.bytedance.sdk.openadsdk.utils.STP.ZU && view.getId() != com.bytedance.sdk.openadsdk.utils.STP.ebl) {
            if (view.getId() == com.bytedance.sdk.openadsdk.utils.STP.lk) {
                Lxb("click_play_source", (JSONObject) null);
            } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.STP.LD) {
                Lxb("click_play_logo", (JSONObject) null);
            } else if (view.getId() != com.bytedance.sdk.openadsdk.utils.STP.sLN && view.getId() != com.bytedance.sdk.openadsdk.utils.STP.Za && view.getId() != com.bytedance.sdk.openadsdk.utils.STP.kqm) {
                if (view.getId() == 520093705) {
                    Lxb("click_start_play", QAg());
                } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.STP.JVA) {
                    Lxb("click_video", QAg());
                } else if (view.getId() == 520093707 || view.getId() == com.bytedance.sdk.openadsdk.utils.STP.OY) {
                    Lxb("fallback_endcard_click", QAg());
                }
            } else {
                Lxb("click_start_play_bar", QAg());
            }
        } else {
            Lxb("click_play_star_nums", (JSONObject) null);
        }
        LD(view, f, f2, f3, f4, sparseArray, i, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(String str, JSONObject jSONObject) {
        Lxb lxb = this.Lxb;
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = lxb.LD;
        String str2 = lxb.JXs;
        if (!lxb.ZU) {
            jSONObject = null;
        }
        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar, str2, str, jSONObject);
    }

    public com.bytedance.sdk.openadsdk.core.LD.JXs Lxb(final Lxb lxb, final com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        return new com.bytedance.sdk.openadsdk.core.LD.JXs(lxb.Pw, tDVar, lxb.JXs, lxb.ZU ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.JVA.4
            @Override // com.bytedance.sdk.openadsdk.core.LD.JXs
            public void Lxb(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.LD.lk.Lxb> sparseArray, int i, int i2, int i3, boolean z) {
                if (tDVar.chu() && view != null) {
                    Object tag = view.getTag(570425345);
                    if (tag instanceof String) {
                        Lxb((String) tag);
                    }
                }
                HashMap map = new HashMap();
                map.put("duration", Long.valueOf(lxb.eK.ebl()));
                if (lxb.nBu.get()) {
                    map.put("click_scence", 2);
                } else if (eK.brP(tDVar)) {
                    map.put("click_scence", 3);
                } else {
                    map.put("click_scence", 1);
                }
                Lxb(map);
                lxb.dR.c_();
                if (view.getId() == com.bytedance.sdk.openadsdk.utils.STP.kRz && eK.brP(tDVar)) {
                    JSONObject jSONObject = new JSONObject();
                    if (tDVar.JJ() != null) {
                        try {
                            jSONObject.put("playable_url", tDVar.JJ().h);
                        } catch (JSONException e) {
                            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.RFReportManager", "onRewardBarClick json error", e);
                        }
                    }
                    com.bytedance.sdk.openadsdk.ZU.lk.LD(tDVar, lxb.JXs, "click_playable_download_button_loading", jSONObject);
                }
                lxb.aH.Lxb(view, f, f2, f3, f4, sparseArray, i, i2, i3, new ZU.Lxb() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.JVA.4.1
                    @Override // com.bytedance.sdk.openadsdk.component.reward.Lxb.ZU.Lxb
                    public void Lxb(String str, JSONObject jSONObject2) {
                        JVA.this.Lxb(str, jSONObject2);
                    }

                    @Override // com.bytedance.sdk.openadsdk.component.reward.Lxb.ZU.Lxb
                    public void Lxb(View view2, float f5, float f6, float f7, float f8, SparseArray<com.bytedance.sdk.openadsdk.core.LD.lk.Lxb> sparseArray2, int i4, int i5, int i6) {
                        JVA.this.Lxb(view2, f5, f6, f7, f8, sparseArray2, i4, i5, i6);
                    }
                });
                com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(tDVar, 9);
                lxb.eK.hg();
            }
        };
    }
}
