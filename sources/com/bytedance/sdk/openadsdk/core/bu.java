package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import euthanasia.attabal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class bu {
    private com.bytedance.sdk.openadsdk.core.ik.lr aw;
    private com.bytedance.sdk.openadsdk.core.ik.ri bgr;
    private final String di;
    private final Context ik;
    private final PAGNativeAd ka;
    private com.bytedance.sdk.openadsdk.ihz.ri.ri.ik lr;
    private long mj;
    private final com.bytedance.sdk.openadsdk.ri.lr.ri qt;
    private final com.bytedance.sdk.openadsdk.core.model.wjv ri;
    private attabal sf;
    private com.bytedance.sdk.openadsdk.ri.lr.di xha;
    private List<View> fi = new ArrayList();
    private final com.bytedance.sdk.openadsdk.ka.xha jbs = new com.bytedance.sdk.openadsdk.ka.xha();

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private final AtomicBoolean f18106co = new AtomicBoolean(false);

    public static class ri implements View.OnLayoutChangeListener {
        private final ViewGroup lr;
        private final com.bytedance.sdk.openadsdk.ka.xha ri;

        public ri(com.bytedance.sdk.openadsdk.ka.xha xhaVar, ViewGroup viewGroup) {
            this.ri = xhaVar;
            this.lr = viewGroup;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.ri.ri(System.currentTimeMillis(), pv.ri(this.lr));
        }
    }

    public bu(Context context, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str, com.bytedance.sdk.openadsdk.ri.lr.ri riVar) {
        this.ka = pAGNativeAd;
        this.ri = wjvVar;
        this.ik = context;
        this.di = str;
        this.qt = riVar;
        if (wjvVar.adz() == 4) {
            this.lr = com.bytedance.sdk.openadsdk.ihz.ri.ri.ka.ri(context, str);
        }
    }

    private mj fi(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof mj) {
                return (mj) childAt;
            }
        }
        return null;
    }

    private mj ik(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, com.bytedance.sdk.openadsdk.ri.lr.di diVar) {
        this.xha = diVar;
        viewGroup.addOnLayoutChangeListener(new ri(this.jbs, viewGroup));
        this.fi = list;
        mj mjVarFi = fi(viewGroup);
        if (mjVarFi == null) {
            mjVarFi = new mj(this.ik, viewGroup, false);
            viewGroup.addView(mjVarFi);
        }
        mjVarFi.ri();
        mjVarFi.setRefClickViews(list2);
        if (list != null) {
            for (View view : this.fi) {
                if (view != null) {
                    view.setTag(520093762, Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        mjVarFi.setRefCreativeViews(list3);
        return mjVarFi;
    }

    private void ka(ViewGroup viewGroup) {
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.fi != null) {
                JSONArray jSONArray = new JSONArray();
                for (View view : this.fi) {
                    if (view != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("width", view.getWidth());
                            jSONObject2.put("height", view.getHeight());
                            jSONObject2.put("alpha", view.getAlpha());
                        } catch (Throwable unused) {
                        }
                        jSONArray.put(jSONObject2);
                    }
                }
                jSONObject.put("image_view", jSONArray.toString());
            }
            if (viewGroup != null) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("width", viewGroup.getWidth());
                    jSONObject3.put("height", viewGroup.getHeight());
                    jSONObject3.put("alpha", viewGroup.getAlpha());
                } catch (Throwable unused2) {
                }
                jSONObject.put("root_view", jSONObject3.toString());
            }
            PAGMediaView pAGMediaViewMj = this.qt.mj();
            if (pAGMediaViewMj != null) {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("width", com.bytedance.sdk.openadsdk.utils.qd.ik(this.ik, pAGMediaViewMj.getWidth()) * 1.0f);
                    jSONObject4.put("height", com.bytedance.sdk.openadsdk.utils.qd.ik(this.ik, pAGMediaViewMj.getHeight()) * 1.0f);
                } catch (Throwable unused3) {
                }
                jSONObject.put("media_view", jSONObject4.toString());
            }
            com.bytedance.sdk.openadsdk.core.jbs.ac acVarLr = this.qt.lr();
            if (acVarLr != null && (wjvVar = this.ri) != null) {
                jSONObject.put("dynamic_show_type", wjvVar.hpn());
                acVarLr.ri(jSONObject, this.ri);
            }
            com.bytedance.sdk.openadsdk.ka.ik.ri(this.ri, this.di, jSONObject, (JSONObject) null);
            com.bytedance.sdk.openadsdk.ay.ri.ik.ri(this.ri);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.ac.ri("InteractionManager", "onShowFun json error", e);
        }
    }

    private void lr(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, com.bytedance.sdk.openadsdk.ri.lr.di diVar) {
        this.xha = diVar;
        viewGroup.addOnLayoutChangeListener(new ri(this.jbs, viewGroup));
        this.fi = list;
        ri(list2, (com.bytedance.sdk.openadsdk.core.ik.ik) null);
        if (list != null) {
            for (View view : this.fi) {
                if (view != null) {
                    view.setTag(520093762, Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        ri(list3, (com.bytedance.sdk.openadsdk.core.ik.ik) null);
    }

    public com.bytedance.sdk.openadsdk.ka.xha ri() {
        return this.jbs;
    }

    public void ri(View view, int i) {
        com.bytedance.sdk.openadsdk.ri.lr.di diVar = this.xha;
        if (diVar != null) {
            diVar.onAdClicked();
        }
    }

    public void ri(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, com.bytedance.sdk.openadsdk.ri.lr.di diVar) {
        lr(viewGroup, list, list2, list3, diVar);
        ri(viewGroup);
        ri(viewGroup, list2, list3);
    }

    private void lr(com.bytedance.sdk.openadsdk.core.ik.lr lrVar, com.bytedance.sdk.openadsdk.core.ik.ri riVar) {
        com.bytedance.sdk.openadsdk.ri.lr.ri riVar2 = this.qt;
        if (riVar2 != null && riVar2.lr() != null) {
            com.bytedance.sdk.openadsdk.core.jbs.ac acVarLr = this.qt.lr();
            if ((lrVar instanceof com.bytedance.sdk.openadsdk.core.jbs.jbs) && (riVar instanceof com.bytedance.sdk.openadsdk.core.jbs.mj)) {
                acVarLr.setClickListener((com.bytedance.sdk.openadsdk.core.jbs.jbs) lrVar);
                acVarLr.setClickCreativeListener((com.bytedance.sdk.openadsdk.core.jbs.mj) riVar);
            }
            acVarLr.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.fi() { // from class: com.bytedance.sdk.openadsdk.core.bu.3
                @Override // com.bytedance.sdk.openadsdk.core.widget.fi
                public void ri() {
                    if (bu.this.xha != null) {
                        bu.this.xha.onAdClicked();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.ri.lr.ri riVar3 = this.qt;
        if (riVar3 != null && riVar3.ri() != null) {
            this.qt.ri().setOnClickListener(riVar);
            this.qt.ri().setOnTouchListener(riVar);
        }
        com.bytedance.sdk.openadsdk.ri.lr.ri riVar4 = this.qt;
        if (riVar4 != null) {
            riVar4.ri(riVar);
            this.qt.ri(lrVar);
        }
    }

    private void ri(List<View> list, com.bytedance.sdk.openadsdk.core.ik.ik ikVar) {
        if (com.bytedance.sdk.component.utils.aw.lr(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(ikVar);
                    view.setOnTouchListener(ikVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ik(ViewGroup viewGroup) {
        this.jbs.ri(System.currentTimeMillis(), pv.ri(viewGroup));
    }

    public void ri(attabal attabalVar) {
        this.sf = attabalVar;
        com.bytedance.sdk.openadsdk.core.ik.lr lrVar = this.aw;
        if (lrVar != null) {
            lrVar.ri(attabalVar);
        }
        com.bytedance.sdk.openadsdk.core.ik.ri riVar = this.bgr;
        if (riVar != null) {
            riVar.ri(attabalVar);
        }
    }

    private void ri(ViewGroup viewGroup) {
        HashMap map = new HashMap();
        map.put("click_scence", 1);
        Context contextRi = viewGroup != null ? com.bytedance.sdk.component.utils.lr.ri(viewGroup) : null;
        if (contextRi == null) {
            contextRi = this.ik;
        }
        if (this.ri.ajz() == 2) {
            com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.ri;
            String str = this.di;
            this.aw = new com.bytedance.sdk.openadsdk.core.jbs.jbs(contextRi, wjvVar, str, com.bytedance.sdk.openadsdk.utils.ig.ri(str));
        } else {
            com.bytedance.sdk.openadsdk.core.model.wjv wjvVar2 = this.ri;
            String str2 = this.di;
            this.aw = new com.bytedance.sdk.openadsdk.core.ik.lr(contextRi, wjvVar2, str2, com.bytedance.sdk.openadsdk.utils.ig.ri(str2));
        }
        this.aw.ri(viewGroup);
        this.aw.ri(this.sf);
        this.aw.ri(this.lr);
        this.aw.ri(this.ka);
        this.aw.ri(map);
        this.aw.ri(new com.bytedance.sdk.openadsdk.core.ik.lr.ri() { // from class: com.bytedance.sdk.openadsdk.core.bu.1
            @Override // com.bytedance.sdk.openadsdk.core.ik.lr.ri
            public void ri(View view, int i) {
                if (bu.this.xha != null) {
                    bu.this.xha.onAdClicked();
                }
            }
        });
        if (this.ri.ajz() == 2) {
            Context context = this.ik;
            com.bytedance.sdk.openadsdk.core.model.wjv wjvVar3 = this.ri;
            String str3 = this.di;
            this.bgr = new com.bytedance.sdk.openadsdk.core.jbs.mj(context, wjvVar3, str3, com.bytedance.sdk.openadsdk.utils.ig.ri(str3));
        } else {
            Context context2 = this.ik;
            com.bytedance.sdk.openadsdk.core.model.wjv wjvVar4 = this.ri;
            String str4 = this.di;
            this.bgr = new com.bytedance.sdk.openadsdk.core.ik.ri(context2, wjvVar4, str4, com.bytedance.sdk.openadsdk.utils.ig.ri(str4));
        }
        this.bgr.ri(viewGroup);
        this.bgr.ri(this.sf);
        this.bgr.ri(this.lr);
        this.bgr.ri(this.ka);
        this.bgr.ri(map);
        this.bgr.ri(new com.bytedance.sdk.openadsdk.core.ik.lr.ri() { // from class: com.bytedance.sdk.openadsdk.core.bu.2
            @Override // com.bytedance.sdk.openadsdk.core.ik.lr.ri
            public void ri(View view, int i) {
                if (bu.this.xha != null) {
                    bu.this.xha.onAdClicked();
                }
                com.bytedance.sdk.openadsdk.ay.lr.fi.ri(bu.this.ri, 9);
                bu.this.qt.aw();
            }
        });
    }

    private void lr(final ViewGroup viewGroup) {
        com.bytedance.sdk.openadsdk.utils.srn.ri(viewGroup, true, 5, false, new com.bytedance.sdk.openadsdk.utils.srn.lr() { // from class: com.bytedance.sdk.openadsdk.core.bu.6
            @Override // com.bytedance.sdk.openadsdk.utils.srn.lr
            public void lr() {
                bu.this.lr();
            }

            @Override // com.bytedance.sdk.openadsdk.utils.srn.lr
            public void ri(boolean z) {
                bu.this.ri(z, viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.srn.lr
            public void ri() {
                bu.this.ik(viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.srn.lr
            public void ri(View view, boolean z) {
                if (!z) {
                    com.bytedance.sdk.openadsdk.ay.ri.ik.ri(bu.this.ri, 8);
                } else {
                    com.bytedance.sdk.openadsdk.ay.ri.ik.ri(bu.this.ri, 4);
                    bu.this.ri(viewGroup, view);
                }
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr() {
        if (this.mj > 0) {
            com.bytedance.sdk.openadsdk.ka.ik.ri(String.valueOf(SystemClock.elapsedRealtime() - this.mj), this.ri, this.di, this.jbs);
            this.mj = 0L;
        }
    }

    private void ri(ViewGroup viewGroup, mj mjVar, List<View> list, List<View> list2) {
        com.bytedance.sdk.openadsdk.core.ik.lr lrVar = this.aw;
        if (lrVar == null || this.bgr == null) {
            return;
        }
        mjVar.ri(list, lrVar);
        mjVar.ri(list2, this.bgr);
        ri(this.aw, this.bgr);
        ri(mjVar, viewGroup);
    }

    private void ri(ViewGroup viewGroup, List<View> list, List<View> list2) {
        com.bytedance.sdk.openadsdk.core.ik.lr lrVar = this.aw;
        if (lrVar == null || this.bgr == null) {
            return;
        }
        ri(list, lrVar);
        ri(list2, this.bgr);
        ri(this.aw, this.bgr);
        lr(viewGroup);
    }

    private void ri(com.bytedance.sdk.openadsdk.core.ik.lr lrVar, com.bytedance.sdk.openadsdk.core.ik.ri riVar) {
        if (this.ri.ajz() == 2) {
            lr(lrVar, riVar);
        } else {
            ri(riVar);
        }
    }

    private void ri(com.bytedance.sdk.openadsdk.core.ik.ri riVar) {
        if (com.bytedance.sdk.openadsdk.core.settings.sf.lr().ka(String.valueOf(this.ri.ur()))) {
            com.bytedance.sdk.openadsdk.ri.lr.ri riVar2 = this.qt;
            if (riVar2 != null && riVar2.ri() != null) {
                this.qt.ri().setOnClickListener(riVar);
                this.qt.ri().setOnTouchListener(riVar);
            }
            com.bytedance.sdk.openadsdk.ri.lr.ri riVar3 = this.qt;
            if (riVar3 != null) {
                riVar3.ri(riVar);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.ri.lr.ri riVar4 = this.qt;
        if (riVar4 != null && riVar4.ri() != null) {
            PAGMediaView pAGMediaViewRi = this.qt.ri();
            com.bytedance.sdk.openadsdk.core.ik.ik ikVar = new com.bytedance.sdk.openadsdk.core.ik.ik() { // from class: com.bytedance.sdk.openadsdk.core.bu.4
                @Override // com.bytedance.sdk.openadsdk.core.ik.ik
                public void ri(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.ik.ik.ri> sparseArray, boolean z) {
                    if (view instanceof PAGVideoMediaView) {
                        ((PAGVideoMediaView) view).handleInterruptVideo();
                    }
                }
            };
            pAGMediaViewRi.setOnClickListener(ikVar);
            pAGMediaViewRi.setOnTouchListener(ikVar);
        }
        com.bytedance.sdk.openadsdk.ri.lr.ri riVar5 = this.qt;
        if (riVar5 != null) {
            riVar5.ri((com.bytedance.sdk.openadsdk.core.ik.ri) null);
        }
    }

    private void ri(mj mjVar, final ViewGroup viewGroup) {
        mjVar.setCallback(new mj.ri() { // from class: com.bytedance.sdk.openadsdk.core.bu.5
            @Override // com.bytedance.sdk.openadsdk.core.mj.ri
            public void lr() {
                bu.this.lr();
            }

            @Override // com.bytedance.sdk.openadsdk.core.mj.ri
            public void ri(boolean z) {
                bu.this.ri(z, viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.core.mj.ri
            public void ri() {
                bu.this.ik(viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.core.mj.ri
            public void ri(View view) {
                bu.this.ri(viewGroup, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(boolean z, ViewGroup viewGroup) {
        if (z && this.ri.nhl() && !this.ri.igq()) {
            this.ri.xha(true);
            com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.ri;
            com.bytedance.sdk.openadsdk.ka.ik.ri(wjvVar, this.di, wjvVar.wzv());
        }
        if (!z && this.mj > 0) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.mj);
            this.jbs.ri(System.currentTimeMillis(), pv.ri(viewGroup));
            com.bytedance.sdk.openadsdk.ka.ik.ri(strValueOf, this.ri, this.di, this.jbs);
            this.mj = 0L;
            return;
        }
        this.jbs.ri(System.currentTimeMillis(), pv.ri(viewGroup));
        this.mj = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(ViewGroup viewGroup, View view) {
        com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi;
        if (this.f18106co.get()) {
            return;
        }
        this.f18106co.set(true);
        if (this.ka instanceof com.bytedance.sdk.openadsdk.ri.lr.ri.ik) {
            com.bytedance.sdk.openadsdk.core.jbs.ac acVarLr = this.qt.lr();
            if (acVarLr != null) {
                acVarLr.nr();
            }
            ((com.bytedance.sdk.openadsdk.ri.lr.ri.ik) this.ka).ri(true);
        }
        this.jbs.ri(System.currentTimeMillis(), pv.ri(viewGroup));
        this.mj = SystemClock.elapsedRealtime();
        ka(viewGroup);
        com.bytedance.sdk.openadsdk.ri.lr.di diVar = this.xha;
        if (diVar != null) {
            diVar.ri(this.ka);
        }
        if (this.ri.du()) {
            com.bytedance.sdk.openadsdk.utils.ig.ri(this.ri, view);
        }
        com.bytedance.sdk.openadsdk.core.model.ka kaVarQc = this.ri.qc();
        if (kaVarQc == null || (kaVarRi = kaVarQc.ri()) == null) {
            return;
        }
        kaVarRi.ri(0L);
    }
}
