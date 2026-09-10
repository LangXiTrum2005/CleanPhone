package com.bytedance.sdk.openadsdk.component.reward.ri;

import android.R;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class qt {
    private final com.bytedance.sdk.openadsdk.core.ik.fi ik;
    private final com.bytedance.sdk.openadsdk.core.ik.lr lr;
    private final ri ri;

    public qt(ri riVar) {
        this.ri = riVar;
        this.ik = ri(riVar, riVar.lr);
        this.lr = new com.bytedance.sdk.openadsdk.core.ik.lr(riVar.ig, riVar.lr, riVar.fi, riVar.ka ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.qt.1
            @Override // com.bytedance.sdk.openadsdk.core.ik.lr, com.bytedance.sdk.openadsdk.core.ik.ik
            public void ri(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.ik.ik.ri> sparseArray, boolean z) {
                try {
                    qt.this.ri(view, f, f2, f3, f4, sparseArray, this.zf, this.su, this.igq);
                } catch (Exception e) {
                    ac.ik("TTAD.RFReportManager", "onClickReport error :" + e.getMessage());
                }
                com.bytedance.sdk.openadsdk.ay.lr.fi.ri(qt.this.ri.lr, 9);
                qt.this.ri.ihz.feb();
            }
        };
    }

    private boolean jbs() {
        wjv wjvVar = this.ri.lr;
        return wjvVar != null && wjvVar.zxp() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject mj() {
        com.bytedance.sdk.openadsdk.activity.single.mj mjVar;
        ri riVar = this.ri;
        if (!riVar.xe || (mjVar = riVar.ajz) == null) {
            return null;
        }
        try {
            return com.bytedance.sdk.openadsdk.ka.ik.ri(mjVar.sf + 1);
        } catch (Throwable unused) {
            return null;
        }
    }

    private JSONObject qt() {
        try {
            long jWjv = this.ri.ihz.wjv();
            int iAy = this.ri.ihz.ay();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, jWjv);
                jSONObject.put("percent", iAy);
                return jSONObject;
            } catch (Throwable unused) {
                return jSONObject;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    private boolean xha() {
        ri riVar = this.ri;
        if (riVar == null) {
            return true;
        }
        com.bytedance.sdk.openadsdk.activity.single.mj mjVar = riVar.ajz;
        boolean z = mjVar != null && mjVar.jc().su();
        ri riVar2 = this.ri;
        boolean z2 = riVar2.tnn;
        com.bytedance.sdk.openadsdk.activity.single.mj mjVar2 = riVar2.ajz;
        return z && !z2 && (mjVar2 != null && !mjVar2.xm());
    }

    public void di() {
        JSONObject jSONObject = new JSONObject();
        int i = 1;
        try {
            if (this.ri.jbs.get()) {
                if (!this.ri.ory.ik()) {
                    if (this.ri.hcw.ka()) {
                        i = 3;
                    } else {
                        i = this.ri.ory.ka() ? 2 : 0;
                    }
                }
                jSONObject.put("endcard_content", i);
            } else {
                jSONObject.put("endCardNotShow", 1);
            }
        } catch (JSONException unused) {
        }
        ri riVar = this.ri;
        com.bytedance.sdk.openadsdk.ka.ik.lr(riVar.lr, riVar.fi, "click_close", jSONObject);
    }

    public com.bytedance.sdk.openadsdk.core.ik.fi fi() {
        return this.ik;
    }

    public com.bytedance.sdk.openadsdk.core.ik.fi ik() {
        com.bytedance.sdk.openadsdk.component.reward.top.ik ikVar;
        this.ik.ri(this.ri.ig.findViewById(R.id.content));
        if (this.ri.uq.ik() != null) {
            this.ik.ri(this.ri.uq.ik());
        }
        this.ri.wjv.ri(this.ik);
        this.ik.ri(new com.bytedance.sdk.openadsdk.core.ik.ri.InterfaceC0250ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.qt.3
            @Override // com.bytedance.sdk.openadsdk.core.ik.ri.InterfaceC0250ri
            public long getVideoProgress() {
                return qt.this.ri.ihz.aw();
            }
        });
        com.bytedance.sdk.openadsdk.component.reward.view.sf sfVar = this.ri.dzy;
        com.bytedance.sdk.openadsdk.core.ik.fi fiVar = this.ik;
        sfVar.ri(fiVar, fiVar, this.lr);
        this.ri.xd.ri(this.ik);
        if (com.bytedance.sdk.openadsdk.core.model.ac.co(this.ri.lr) && (ikVar = this.ri.oh.ri) != null && ikVar.getITopLayout() != null) {
            qd.ri(this.ri.oh.ri.getITopLayout(), (View.OnClickListener) this.lr, "LandPage#TopLayoutEmptyClick");
        }
        return this.ik;
    }

    public com.bytedance.sdk.openadsdk.core.ik.lr ka() {
        return this.lr;
    }

    public void lr() {
        if (xha()) {
            return;
        }
        wjv wjvVar = this.ri.lr;
        if (wjvVar == null || !wjvVar.feb()) {
            JSONObject jSONObject = new JSONObject();
            boolean z = false;
            int iSf = -1;
            try {
                if (this.ri.lr.di()) {
                    ri riVar = this.ri;
                    if (riVar.ay != null && riVar.lr.ajz() == 2) {
                        jSONObject.put("dynamic_show_type", this.ri.ay.sf());
                        this.ri.ay.ri(jSONObject);
                        iSf = this.ri.ay.sf();
                        z = true;
                    }
                }
                View viewFindViewById = this.ri.ig.findViewById(R.id.content);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("width", viewFindViewById.getWidth());
                jSONObject2.put("height", viewFindViewById.getHeight());
                jSONObject2.put("alpha", viewFindViewById.getAlpha());
                jSONObject.put("root_view", jSONObject2.toString());
            } catch (Throwable th) {
                ac.ri("TTAD.RFReportManager", "reportShowWhenBindVideoAd error", th);
            }
            ri(jSONObject, mj(), z, iSf, false);
        }
    }

    public void ri() {
        wjv wjvVar;
        if (xha() || (wjvVar = this.ri.lr) == null || wjvVar.feb()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObjectMj = mj();
        boolean z = false;
        int iSf = -1;
        try {
            if (this.ri.ik()) {
                if (jSONObjectMj == null) {
                    jSONObjectMj = new JSONObject();
                }
                int iRi = this.ri.ri();
                if (1001 == iRi) {
                    jSONObject.put("dynamic_show_type", iRi + this.ri.lr());
                } else {
                    jSONObject.put("dynamic_show_type", iRi);
                }
            } else if (this.ri.lr.di()) {
                ri riVar = this.ri;
                if (riVar.ay != null && riVar.lr.ajz() == 2) {
                    jSONObject.put("dynamic_show_type", this.ri.ay.sf());
                    this.ri.ay.ri(jSONObject);
                    iSf = this.ri.ay.sf();
                    z = true;
                }
            }
        } catch (JSONException unused) {
        }
        ri(jSONObject, jSONObjectMj, z, iSf, true);
    }

    public void ik(boolean z) {
        ri riVar = this.ri;
        if (riVar != null && z && riVar.lr.nhl() && !this.ri.lr.igq()) {
            this.ri.lr.xha(true);
            ri riVar2 = this.ri;
            wjv wjvVar = riVar2.lr;
            com.bytedance.sdk.openadsdk.ka.ik.ri(wjvVar, riVar2.fi, wjvVar.wzv());
        }
    }

    public void lr(boolean z) {
        wjv wjvVar;
        ri riVar = this.ri;
        if (riVar == null) {
            return;
        }
        if (!z && riVar.gcp > 0 && (wjvVar = riVar.lr) != null && wjvVar.feb()) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.ri.gcp);
            ri riVar2 = this.ri;
            com.bytedance.sdk.openadsdk.ka.ik.ri(strValueOf, riVar2.lr, riVar2.fi, riVar2.ihz.fi());
            this.ri.gcp = 0L;
        } else {
            this.ri.gcp = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.ay.lr.fi.ri(this.ri.lr, z ? 4 : 8);
        com.bytedance.sdk.openadsdk.ay.ri.ik.ri(this.ri.lr, z ? 4 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(JSONObject jSONObject, JSONObject jSONObject2, boolean z, int i, boolean z2) {
        com.bytedance.sdk.openadsdk.core.model.ka kaVarQc;
        ri riVar = this.ri;
        wjv wjvVar = riVar.lr;
        com.bytedance.sdk.openadsdk.ka.ik.ri(wjvVar, riVar.fi, jSONObject, jSONObject2);
        this.ri.qd.qt();
        if (!z) {
            i = -1;
        }
        com.bytedance.sdk.openadsdk.ay.lr.fi.ri riVar2 = new com.bytedance.sdk.openadsdk.ay.lr.fi.ri(i);
        ri(riVar2);
        com.bytedance.sdk.openadsdk.ay.lr.fi.ri(this.ri.ig.findViewById(R.id.content), wjvVar, riVar2);
        com.bytedance.sdk.openadsdk.ay.ri.ik.ri(wjvVar);
        if (!z2 || (kaVarQc = wjvVar.qc()) == null) {
            return;
        }
        kaVarQc.ri().ri(0L);
    }

    private void lr(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.ik.ik.ri> sparseArray, int i, int i2, int i3) {
        wjv wjvVar;
        if (!jbs() || (wjvVar = this.ri.lr) == null || view == null) {
            return;
        }
        boolean z = com.bytedance.sdk.openadsdk.core.model.ac.co(wjvVar) && (view instanceof TopLayoutDislike2) && this.ri.oh.ri.getITopLayout() == view;
        int id = view.getId();
        if (z || id == com.bytedance.sdk.openadsdk.utils.slm.xha || id == com.bytedance.sdk.openadsdk.utils.slm.di || id == com.bytedance.sdk.openadsdk.utils.slm.fi || id == com.bytedance.sdk.openadsdk.utils.slm.ka || id == com.bytedance.sdk.openadsdk.utils.slm.bgr || id == com.bytedance.sdk.openadsdk.utils.slm.iph || id == com.bytedance.sdk.openadsdk.utils.slm.nr || id == 520093705 || id == com.bytedance.sdk.openadsdk.utils.slm.aw || id == 520093707 || id == com.bytedance.sdk.openadsdk.utils.slm.jbs) {
            int iQt = qd.qt(nr.ri());
            com.bytedance.sdk.openadsdk.core.model.co coVarRi = new com.bytedance.sdk.openadsdk.core.model.co.ri().di(f).fi(f2).ka(f3).ik(f4).lr(System.currentTimeMillis()).ri(0L).ri(qd.ri(this.ri.dzy.sf())).lr(qd.ik(this.ri.dzy.sf())).ka(i2).fi(i3).di(i).ri(sparseArray).lr(com.bytedance.sdk.openadsdk.core.qt.lr().ri() ? 1 : 2).ik(iQt).ri(qd.mj(nr.ri())).lr(qd.jbs(nr.ri())).ri();
            HashMap map = new HashMap();
            map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(this.ri.ihz.aw()));
            ri riVar = this.ri;
            String str = riVar.fi;
            if (z) {
                str = "landingpage_endcard";
            }
            com.bytedance.sdk.openadsdk.ka.ik.ri("click_other", riVar.lr, coVarRi, str, true, (Map<String, Object>) map, -1);
        }
    }

    public void ri(final Map<String, Object> map) {
        if (xha()) {
            return;
        }
        wjv wjvVar = this.ri.lr;
        if (wjvVar == null || !wjvVar.feb()) {
            final View viewFindViewById = this.ri.ig.findViewById(R.id.content);
            if (viewFindViewById == null) {
                viewFindViewById = this.ri.ig.getWindow().getDecorView();
            }
            int width = viewFindViewById.getWidth();
            int height = viewFindViewById.getHeight();
            Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.qt.2
                @Override // java.lang.Runnable
                public void run() {
                    boolean z;
                    int iSf;
                    Map map2;
                    ri unused = qt.this.ri;
                    JSONObject jSONObject = null;
                    try {
                        jSONObject = map != null ? new JSONObject(map) : new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("width", viewFindViewById.getWidth());
                        jSONObject2.put("height", viewFindViewById.getHeight());
                        jSONObject2.put("alpha", viewFindViewById.getAlpha());
                        jSONObject.put("root_view", jSONObject2.toString());
                    } catch (Throwable th) {
                        ac.ri("TTAD.RFReportManager", "run: ", th);
                    }
                    JSONObject jSONObject3 = jSONObject;
                    if (qt.this.ri.ay == null || (map2 = map) == null || !map2.containsKey("dynamic_show_type")) {
                        z = false;
                        iSf = -1;
                    } else {
                        iSf = qt.this.ri.ay.sf();
                        z = true;
                    }
                    int i = iSf;
                    boolean z2 = z;
                    qt qtVar = qt.this;
                    qtVar.ri(jSONObject3, qtVar.mj(), z2, i, false);
                }
            };
            Thread.currentThread().getName();
            if (width > 0 && height > 0) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    runnable.run();
                    return;
                } else {
                    viewFindViewById.post(runnable);
                    return;
                }
            }
            viewFindViewById.post(runnable);
        }
    }

    private void ri(com.bytedance.sdk.openadsdk.ay.lr.fi.ri riVar) {
        com.bytedance.sdk.openadsdk.activity.single.mj mjVar;
        ri riVar2 = this.ri;
        if (!riVar2.xe || (mjVar = riVar2.ajz) == null) {
            return;
        }
        riVar.lr = mjVar.sf;
    }

    public void ri(boolean z) {
        wjv wjvVar = this.ri.lr;
        if (wjvVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.slm.ri.ka kaVarFi = com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri(z ? 7 : 8).ik(String.valueOf(wjvVar.ur())).fi(this.ri.lr.jf());
        kaVarFi.lr(this.ri.ory.nr()).di(this.ri.ory.tan());
        kaVarFi.xha(this.ri.lr.yjg()).ka(this.ri.lr.tn());
        com.bytedance.sdk.openadsdk.slm.ka.ri().lr(kaVarFi);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.ik.ik.ri> sparseArray, int i, int i2, int i3) {
        if (view == null) {
            return;
        }
        if (view.getId() == com.bytedance.sdk.openadsdk.utils.slm.xha) {
            ri("click_play_star_level", (JSONObject) null);
        } else if (view.getId() != com.bytedance.sdk.openadsdk.utils.slm.di && view.getId() != com.bytedance.sdk.openadsdk.utils.slm.jbs) {
            if (view.getId() == com.bytedance.sdk.openadsdk.utils.slm.fi) {
                ri("click_play_source", (JSONObject) null);
            } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.slm.ka) {
                ri("click_play_logo", (JSONObject) null);
            } else if (view.getId() != com.bytedance.sdk.openadsdk.utils.slm.bgr && view.getId() != com.bytedance.sdk.openadsdk.utils.slm.iph && view.getId() != com.bytedance.sdk.openadsdk.utils.slm.nr) {
                if (view.getId() == 520093705) {
                    ri("click_start_play", qt());
                } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.slm.aw) {
                    ri("click_video", qt());
                } else if (view.getId() == 520093707 || view.getId() == com.bytedance.sdk.openadsdk.utils.slm.qt) {
                    ri("fallback_endcard_click", qt());
                }
            } else {
                ri("click_start_play_bar", qt());
            }
        } else {
            ri("click_play_star_nums", (JSONObject) null);
        }
        lr(view, f, f2, f3, f4, sparseArray, i, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(String str, JSONObject jSONObject) {
        ri riVar = this.ri;
        wjv wjvVar = riVar.lr;
        String str2 = riVar.fi;
        if (!riVar.ka) {
            jSONObject = null;
        }
        com.bytedance.sdk.openadsdk.ka.ik.ri(wjvVar, str2, str, jSONObject);
    }

    public com.bytedance.sdk.openadsdk.core.ik.fi ri(final ri riVar, final wjv wjvVar) {
        return new com.bytedance.sdk.openadsdk.core.ik.fi(riVar.ig, wjvVar, riVar.fi, riVar.ka ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.qt.4
            @Override // com.bytedance.sdk.openadsdk.core.ik.fi
            public void ri(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.ik.ik.ri> sparseArray, int i, int i2, int i3, boolean z) {
                if (wjvVar.zz() && view != null) {
                    Object tag = view.getTag(570425345);
                    if (tag instanceof String) {
                        ri((String) tag);
                    }
                }
                HashMap map = new HashMap();
                map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(riVar.ihz.aw()));
                if (riVar.jbs.get()) {
                    map.put("click_scence", 2);
                } else {
                    map.put("click_scence", 1);
                }
                com.bytedance.sdk.openadsdk.activity.single.mj mjVar = riVar.ajz;
                if (mjVar != null) {
                    mjVar.ri(map, f, f2);
                }
                ri(map);
                riVar.qd.xd();
                riVar.uq.ri(view, f, f2, f3, f4, sparseArray, i, i2, i3, new ka.ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.qt.4.1
                    @Override // com.bytedance.sdk.openadsdk.component.reward.ri.ka.ri
                    public void ri(String str, JSONObject jSONObject) {
                        qt.this.ri(str, jSONObject);
                    }

                    @Override // com.bytedance.sdk.openadsdk.component.reward.ri.ka.ri
                    public void ri(View view2, float f5, float f6, float f7, float f8, SparseArray<com.bytedance.sdk.openadsdk.core.ik.ik.ri> sparseArray2, int i4, int i5, int i6) {
                        qt.this.ri(view2, f5, f6, f7, f8, sparseArray2, i4, i5, i6);
                    }
                });
                com.bytedance.sdk.openadsdk.ay.lr.fi.ri(wjvVar, 9);
                riVar.ihz.feb();
            }
        };
    }
}
