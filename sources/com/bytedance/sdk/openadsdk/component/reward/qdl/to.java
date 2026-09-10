package com.bytedance.sdk.openadsdk.component.reward.qdl;

import android.R;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.ax;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class to {
    private final com.bytedance.sdk.openadsdk.core.lnr.mzz lnr;
    private final qdl qdl;
    private final com.bytedance.sdk.openadsdk.core.lnr.ud ud;

    public to(qdl qdlVar) {
        this.qdl = qdlVar;
        this.lnr = qdl(qdlVar, qdlVar.ud);
        this.ud = new com.bytedance.sdk.openadsdk.core.lnr.ud(qdlVar.ag, qdlVar.ud, qdlVar.mzz, qdlVar.mml ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.to.1
            @Override // com.bytedance.sdk.openadsdk.core.lnr.ud, com.bytedance.sdk.openadsdk.core.lnr.lnr
            public void qdl(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl> sparseArray, boolean z2) {
                try {
                    to.this.qdl(view, f, f2, f3, f4, sparseArray, this.koa, this.xmv, this.bqt);
                } catch (Exception e2) {
                    aaj.lnr("TTAD.RFReportManager", "onClickReport error :" + e2.getMessage());
                }
                com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(to.this.qdl.ud, 9);
                to.this.qdl.bch.ag();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject jpc() {
        com.bytedance.sdk.openadsdk.activity.jpc jpcVar;
        qdl qdlVar = this.qdl;
        if (!qdlVar.ra || (jpcVar = qdlVar.lq) == null) {
            return null;
        }
        try {
            return com.bytedance.sdk.openadsdk.mml.lnr.qdl(jpcVar.rq + 1);
        } catch (Throwable unused) {
            return null;
        }
    }

    private JSONObject to() {
        try {
            long jOth = this.qdl.bch.oth();
            int iLjh = this.qdl.bch.ljh();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", jOth);
                jSONObject.put("percent", iLjh);
                return jSONObject;
            } catch (Throwable unused) {
                return jSONObject;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    private boolean tvp() {
        ljh ljhVar = this.qdl.ud;
        return ljhVar != null && ljhVar.syy() == 1;
    }

    public com.bytedance.sdk.openadsdk.core.lnr.mzz lnr() {
        this.lnr.qdl(this.qdl.ag.findViewById(R.id.content));
        if (this.qdl.uw.lnr() != null) {
            this.lnr.qdl(this.qdl.uw.lnr());
        }
        this.qdl.xmv.qdl(this.lnr);
        this.lnr.qdl(new com.bytedance.sdk.openadsdk.core.lnr.qdl.InterfaceC0118qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.to.3
            @Override // com.bytedance.sdk.openadsdk.core.lnr.qdl.InterfaceC0118qdl
            public long getVideoProgress() {
                return to.this.qdl.bch.fs();
            }
        });
        com.bytedance.sdk.openadsdk.component.reward.view.fs fsVar = this.qdl.gy;
        com.bytedance.sdk.openadsdk.core.lnr.mzz mzzVar = this.lnr;
        fsVar.qdl(mzzVar, mzzVar, this.ud);
        this.qdl.mrf.qdl(this.lnr);
        return this.lnr;
    }

    public com.bytedance.sdk.openadsdk.core.lnr.ud mml() {
        return this.ud;
    }

    public void mo() {
        JSONObject jSONObject = new JSONObject();
        int i2 = 1;
        try {
            if (this.qdl.to.get()) {
                if (!this.qdl.hkc.lnr()) {
                    if (this.qdl.hzv.mml()) {
                        i2 = 3;
                    } else {
                        i2 = this.qdl.hkc.mml() ? 2 : 0;
                    }
                }
                jSONObject.put("endcard_content", i2);
            } else {
                jSONObject.put("endCardNotShow", 1);
            }
        } catch (JSONException unused) {
        }
        qdl qdlVar = this.qdl;
        com.bytedance.sdk.openadsdk.mml.lnr.ud(qdlVar.ud, qdlVar.mzz, "click_close", jSONObject);
    }

    public com.bytedance.sdk.openadsdk.core.lnr.mzz mzz() {
        return this.lnr;
    }

    public void wd() {
        qdl qdlVar = this.qdl;
        com.bytedance.sdk.openadsdk.mml.lnr.ud(qdlVar.ud, qdlVar.mzz, (JSONObject) null, jpc());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    public void ud() {
        boolean z2;
        if (this.qdl.exu.get()) {
            return;
        }
        com.bytedance.sdk.openadsdk.activity.jpc jpcVar = this.qdl.lq;
        if (jpcVar != null && jpcVar.cx().bch()) {
            qdl qdlVar = this.qdl;
            if (!qdlVar.irn && !qdlVar.lq.taz()) {
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.qdl.ud.mo()) {
                qdl qdlVar2 = this.qdl;
                if (qdlVar2.bqt == null || qdlVar2.ud.dk() != 2) {
                    z2 = false;
                } else {
                    jSONObject.put("dynamic_show_type", this.qdl.bqt.rq());
                    this.qdl.bqt.qdl(jSONObject);
                    z2 = true;
                }
            } else {
                z2 = false;
            }
            ljh ljhVar = this.qdl.ud;
            JSONObject jSONObjectJpc = jpc();
            View viewFindViewById = this.qdl.ag.findViewById(R.id.content);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("width", viewFindViewById.getWidth());
                jSONObject2.put("height", viewFindViewById.getHeight());
                jSONObject2.put("alpha", viewFindViewById.getAlpha());
            } catch (Throwable unused) {
            }
            jSONObject.put("root_view", jSONObject2.toString());
            if (this.qdl.exu.compareAndSet(false, true)) {
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, this.qdl.mzz, jSONObject, jSONObjectJpc);
                this.qdl.wc.rq();
                com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl qdlVar3 = new com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(z2 ? this.qdl.bqt.rq() : -1);
                qdl(qdlVar3);
                com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(this.qdl.ag.findViewById(R.id.content), ljhVar, qdlVar3);
                com.bytedance.sdk.openadsdk.bch.qdl.lnr.qdl(ljhVar);
            }
        } catch (JSONException e2) {
            aaj.qdl("TTAD.RFReportManager", "reportShowWhenBindVideoAd error", e2);
        }
    }

    public void qdl() {
        com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl;
        if (this.qdl.exu.get()) {
            return;
        }
        com.bytedance.sdk.openadsdk.activity.jpc jpcVar = this.qdl.lq;
        if (jpcVar != null && jpcVar.cx().bch()) {
            qdl qdlVar = this.qdl;
            if (!qdlVar.irn && !qdlVar.lq.taz()) {
                return;
            }
        }
        JSONObject jSONObject = new JSONObject();
        ljh ljhVar = this.qdl.ud;
        JSONObject jSONObjectJpc = jpc();
        if (this.qdl.exu.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, this.qdl.mzz, jSONObject, jSONObjectJpc);
            this.qdl.wc.rq();
            com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl qdlVar2 = new com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(-1);
            qdl(qdlVar2);
            com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(this.qdl.ag.findViewById(R.id.content), ljhVar, qdlVar2);
            com.bytedance.sdk.openadsdk.bch.qdl.lnr.qdl(ljhVar);
            com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm = ljhVar.zm();
            if (mmlVarZm == null || (mmlVarQdl = mmlVarZm.qdl()) == null) {
                return;
            }
            mmlVarQdl.qdl(0L);
        }
    }

    public void lnr(boolean z2) {
        qdl qdlVar = this.qdl;
        if (qdlVar != null && z2 && qdlVar.ud.jwd() && !this.qdl.ud.ljh()) {
            this.qdl.ud.mo(true);
            qdl qdlVar2 = this.qdl;
            ljh ljhVar = qdlVar2.ud;
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, qdlVar2.mzz, ljhVar.fo());
        }
    }

    public void qdl(final Map<String, Object> map) {
        if (this.qdl.exu.get()) {
            return;
        }
        com.bytedance.sdk.openadsdk.activity.jpc jpcVar = this.qdl.lq;
        if (jpcVar != null && jpcVar.cx().bch()) {
            qdl qdlVar = this.qdl;
            if (!qdlVar.irn && !qdlVar.lq.taz()) {
                return;
            }
        }
        this.qdl.exu.set(true);
        final View viewFindViewById = this.qdl.ag.findViewById(R.id.content);
        if (viewFindViewById == null) {
            viewFindViewById = this.qdl.ag.getWindow().getDecorView();
        }
        viewFindViewById.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.to.2
            @Override // java.lang.Runnable
            public void run() {
                Map map2;
                ljh ljhVar = to.this.qdl.ud;
                JSONObject jSONObject = null;
                try {
                    jSONObject = map != null ? new JSONObject(map) : new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("width", viewFindViewById.getWidth());
                    jSONObject2.put("height", viewFindViewById.getHeight());
                    jSONObject2.put("alpha", viewFindViewById.getAlpha());
                    jSONObject.put("root_view", jSONObject2.toString());
                } catch (Throwable th) {
                    aaj.qdl("TTAD.RFReportManager", "run: ", th);
                }
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, to.this.qdl.mzz, jSONObject, to.this.jpc());
                to.this.qdl.wc.rq();
                com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl qdlVar2 = new com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(to.this.qdl.bqt != null && (map2 = map) != null && map2.containsKey("dynamic_show_type") ? to.this.qdl.bqt.rq() : -1);
                to.this.qdl(qdlVar2);
                com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(to.this.qdl.ag.findViewById(R.id.content), ljhVar, qdlVar2);
                com.bytedance.sdk.openadsdk.bch.qdl.lnr.qdl(ljhVar);
            }
        });
    }

    public void ud(boolean z2) {
        qdl qdlVar = this.qdl;
        if (qdlVar == null) {
            return;
        }
        if (!z2 && qdlVar.exu.get() && this.qdl.dk > 0) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.qdl.dk);
            qdl qdlVar2 = this.qdl;
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(strValueOf, qdlVar2.ud, qdlVar2.mzz, qdlVar2.bch.mzz());
            this.qdl.dk = 0L;
        } else {
            this.qdl.dk = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(this.qdl.ud, z2 ? 4 : 8);
        com.bytedance.sdk.openadsdk.bch.qdl.lnr.qdl(this.qdl.ud, z2 ? 4 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl qdlVar) {
        com.bytedance.sdk.openadsdk.activity.jpc jpcVar;
        qdl qdlVar2 = this.qdl;
        if (!qdlVar2.ra || (jpcVar = qdlVar2.lq) == null) {
            return;
        }
        qdlVar.ud = jpcVar.rq;
    }

    public void qdl(boolean z2) {
        ljh ljhVar = this.qdl.ud;
        if (ljhVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.bjy.qdl.mml mmlVarMzz = com.bytedance.sdk.openadsdk.bjy.qdl.mml.ud().qdl(z2 ? 7 : 8).lnr(String.valueOf(ljhVar.fz())).mzz(this.qdl.ud.cev());
        mmlVarMzz.ud(this.qdl.hkc.jl()).mo(this.qdl.hkc.exc());
        mmlVarMzz.wd(this.qdl.ud.ir()).mml(this.qdl.ud.yre());
        com.bytedance.sdk.openadsdk.bjy.lnr.qdl().ud(mmlVarMzz);
    }

    private void ud(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl> sparseArray, int i2, int i3, int i4) {
        if (!tvp() || this.qdl.ud == null || view == null) {
            return;
        }
        int id = view.getId();
        if (id == com.bytedance.sdk.openadsdk.utils.jtx.mzz || id == com.bytedance.sdk.openadsdk.utils.jtx.mml || id == com.bytedance.sdk.openadsdk.utils.jtx.lnr || id == com.bytedance.sdk.openadsdk.utils.jtx.ud || id == com.bytedance.sdk.openadsdk.utils.jtx.fs || id == com.bytedance.sdk.openadsdk.utils.jtx.blf || id == com.bytedance.sdk.openadsdk.utils.jtx.jtx || id == 520093705 || id == com.bytedance.sdk.openadsdk.utils.jtx.rq || id == 520093707 || id == com.bytedance.sdk.openadsdk.utils.jtx.wd) {
            int i5 = ax.to(com.bytedance.sdk.openadsdk.core.yt.qdl());
            com.bytedance.sdk.openadsdk.core.model.fs fsVarQdl = new com.bytedance.sdk.openadsdk.core.model.fs.qdl().mo(f).mzz(f2).mml(f3).lnr(f4).ud(System.currentTimeMillis()).qdl(0L).qdl(ax.qdl(this.qdl.gy.rq())).ud(ax.lnr(this.qdl.gy.rq())).mml(i3).mzz(i4).mo(i2).qdl(sparseArray).ud(com.bytedance.sdk.openadsdk.core.tvp.ud().qdl() ? 1 : 2).lnr(i5).qdl(ax.jpc(com.bytedance.sdk.openadsdk.core.yt.qdl())).ud(ax.tvp(com.bytedance.sdk.openadsdk.core.yt.qdl())).qdl();
            HashMap map = new HashMap();
            map.put("duration", Long.valueOf(this.qdl.bch.fs()));
            qdl qdlVar = this.qdl;
            com.bytedance.sdk.openadsdk.mml.lnr.qdl("click_other", qdlVar.ud, fsVarQdl, qdlVar.mzz, true, (Map<String, Object>) map, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl> sparseArray, int i2, int i3, int i4) {
        if (view == null) {
            return;
        }
        if (view.getId() == com.bytedance.sdk.openadsdk.utils.jtx.mzz) {
            qdl("click_play_star_level", (JSONObject) null);
        } else if (view.getId() != com.bytedance.sdk.openadsdk.utils.jtx.mml && view.getId() != com.bytedance.sdk.openadsdk.utils.jtx.wd) {
            if (view.getId() == com.bytedance.sdk.openadsdk.utils.jtx.lnr) {
                qdl("click_play_source", (JSONObject) null);
            } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.jtx.ud) {
                qdl("click_play_logo", (JSONObject) null);
            } else if (view.getId() != com.bytedance.sdk.openadsdk.utils.jtx.fs && view.getId() != com.bytedance.sdk.openadsdk.utils.jtx.blf && view.getId() != com.bytedance.sdk.openadsdk.utils.jtx.jtx) {
                if (view.getId() == 520093705) {
                    qdl("click_start_play", to());
                } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.jtx.rq) {
                    qdl("click_video", to());
                } else if (view.getId() == 520093707 || view.getId() == com.bytedance.sdk.openadsdk.utils.jtx.jpc) {
                    qdl("fallback_endcard_click", to());
                }
            } else {
                qdl("click_start_play_bar", to());
            }
        } else {
            qdl("click_play_star_nums", (JSONObject) null);
        }
        ud(view, f, f2, f3, f4, sparseArray, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(String str, JSONObject jSONObject) {
        qdl qdlVar = this.qdl;
        ljh ljhVar = qdlVar.ud;
        String str2 = qdlVar.mzz;
        if (!qdlVar.mml) {
            jSONObject = null;
        }
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, str2, str, jSONObject);
    }

    public com.bytedance.sdk.openadsdk.core.lnr.mzz qdl(final qdl qdlVar, final ljh ljhVar) {
        return new com.bytedance.sdk.openadsdk.core.lnr.mzz(qdlVar.ag, ljhVar, qdlVar.mzz, qdlVar.mml ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.to.4
            @Override // com.bytedance.sdk.openadsdk.core.lnr.mzz
            public void qdl(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl> sparseArray, int i2, int i3, int i4, boolean z2) {
                if (ljhVar.uj() && view != null) {
                    Object tag = view.getTag(570425345);
                    if (tag instanceof String) {
                        qdl((String) tag);
                    }
                }
                HashMap map = new HashMap();
                map.put("duration", Long.valueOf(qdlVar.bch.fs()));
                if (qdlVar.to.get()) {
                    map.put("click_scence", 2);
                } else {
                    map.put("click_scence", 1);
                }
                com.bytedance.sdk.openadsdk.activity.jpc jpcVar = qdlVar.lq;
                if (jpcVar != null) {
                    jpcVar.qdl(map, f, f2);
                }
                qdl(map);
                qdlVar.wc.mrf();
                qdlVar.uw.qdl(view, f, f2, f3, f4, sparseArray, i2, i3, i4, new mml.qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.to.4.1
                    @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.mml.qdl
                    public void qdl(String str, JSONObject jSONObject) {
                        to.this.qdl(str, jSONObject);
                    }

                    @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.mml.qdl
                    public void qdl(View view2, float f5, float f6, float f7, float f8, SparseArray<com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl> sparseArray2, int i5, int i6, int i7) {
                        to.this.qdl(view2, f5, f6, f7, f8, sparseArray2, i5, i6, i7);
                    }
                });
                com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(ljhVar, 9);
                qdlVar.bch.ag();
            }
        };
    }
}
