package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.utils.ag;
import com.bytedance.sdk.openadsdk.utils.ax;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class jtx {
    private com.bytedance.sdk.openadsdk.core.lnr.ud exu;
    private long jpc;
    private final Context lnr;
    private final PAGNativeAd mml;
    private final String mo;
    private final com.bytedance.sdk.openadsdk.core.model.ljh qdl;
    private com.bytedance.sdk.openadsdk.core.lnr.qdl rdp;
    private com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr rq;
    private final com.bytedance.sdk.openadsdk.qdl.ud.qdl to;
    private com.bytedance.sdk.openadsdk.exc.qdl.qdl.mo ud;
    private com.bytedance.sdk.openadsdk.qdl.ud.mo wd;
    private List<View> mzz = new ArrayList();
    private final com.bytedance.sdk.openadsdk.mml.wd tvp = new com.bytedance.sdk.openadsdk.mml.wd();
    private final AtomicBoolean fs = new AtomicBoolean(false);

    public static class qdl implements View.OnLayoutChangeListener {
        private final com.bytedance.sdk.openadsdk.mml.wd qdl;
        private final ViewGroup ud;

        public qdl(com.bytedance.sdk.openadsdk.mml.wd wdVar, ViewGroup viewGroup) {
            this.qdl = wdVar;
            this.ud = viewGroup;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.qdl.qdl(System.currentTimeMillis(), hzv.qdl(this.ud));
        }
    }

    public jtx(Context context, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, String str, com.bytedance.sdk.openadsdk.qdl.ud.qdl qdlVar) {
        this.mml = pAGNativeAd;
        this.qdl = ljhVar;
        this.lnr = context;
        this.mo = str;
        this.to = qdlVar;
        if (ljhVar.ygv() == 4) {
            this.ud = com.bytedance.sdk.openadsdk.exc.qdl.qdl.wd.qdl(context, str);
        }
    }

    private wd mzz(ViewGroup viewGroup) {
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof wd) {
                return (wd) childAt;
            }
        }
        return null;
    }

    private wd lnr(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, com.bytedance.sdk.openadsdk.qdl.ud.mo moVar) {
        this.wd = moVar;
        viewGroup.addOnLayoutChangeListener(new qdl(this.tvp, viewGroup));
        this.mzz = list;
        wd wdVarMzz = mzz(viewGroup);
        if (wdVarMzz == null) {
            wdVarMzz = new wd(this.lnr, viewGroup, false);
            viewGroup.addView(wdVarMzz);
        }
        wdVarMzz.qdl();
        wdVarMzz.setRefClickViews(list2);
        if (list != null) {
            for (View view : this.mzz) {
                if (view != null) {
                    view.setTag(520093762, Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        wdVarMzz.setRefCreativeViews(list3);
        return wdVarMzz;
    }

    private void mml(ViewGroup viewGroup) {
        com.bytedance.sdk.openadsdk.core.model.ljh ljhVar;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.mzz != null) {
                JSONArray jSONArray = new JSONArray();
                for (View view : this.mzz) {
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
            PAGMediaView pAGMediaViewJpc = this.to.jpc();
            if (pAGMediaViewJpc != null) {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("width", ax.lnr(this.lnr, pAGMediaViewJpc.getWidth()) * 1.0f);
                    jSONObject4.put("height", ax.lnr(this.lnr, pAGMediaViewJpc.getHeight()) * 1.0f);
                } catch (Throwable unused3) {
                }
                jSONObject.put("media_view", jSONObject4.toString());
            }
            com.bytedance.sdk.openadsdk.core.tvp.aaj aajVarUd = this.to.ud();
            if (aajVarUd != null && (ljhVar = this.qdl) != null) {
                jSONObject.put("dynamic_show_type", ljhVar.ra());
                aajVarUd.qdl(jSONObject, this.qdl);
            }
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(this.qdl, this.mo, jSONObject, (JSONObject) null);
            com.bytedance.sdk.openadsdk.bch.qdl.lnr.qdl(this.qdl);
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.aaj.qdl("InteractionManager", "onShowFun json error", e2);
        }
    }

    private void ud(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, com.bytedance.sdk.openadsdk.qdl.ud.mo moVar) {
        this.wd = moVar;
        viewGroup.addOnLayoutChangeListener(new qdl(this.tvp, viewGroup));
        this.mzz = list;
        qdl(list2, (com.bytedance.sdk.openadsdk.core.lnr.lnr) null);
        if (list != null) {
            for (View view : this.mzz) {
                if (view != null) {
                    view.setTag(520093762, Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        qdl(list3, (com.bytedance.sdk.openadsdk.core.lnr.lnr) null);
    }

    public com.bytedance.sdk.openadsdk.mml.wd qdl() {
        return this.tvp;
    }

    public void qdl(View view, int i2) {
        com.bytedance.sdk.openadsdk.qdl.ud.mo moVar = this.wd;
        if (moVar != null) {
            moVar.onAdClicked();
        }
    }

    public void qdl(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, com.bytedance.sdk.openadsdk.qdl.ud.mo moVar) {
        ud(viewGroup, list, list2, list3, moVar);
        qdl(viewGroup);
        qdl(viewGroup, list2, list3);
    }

    private void ud(com.bytedance.sdk.openadsdk.core.lnr.ud udVar, com.bytedance.sdk.openadsdk.core.lnr.qdl qdlVar) {
        com.bytedance.sdk.openadsdk.qdl.ud.qdl qdlVar2 = this.to;
        if (qdlVar2 != null && qdlVar2.ud() != null) {
            com.bytedance.sdk.openadsdk.core.tvp.aaj aajVarUd = this.to.ud();
            if ((udVar instanceof com.bytedance.sdk.openadsdk.core.tvp.tvp) && (qdlVar instanceof com.bytedance.sdk.openadsdk.core.tvp.jpc)) {
                aajVarUd.setClickListener((com.bytedance.sdk.openadsdk.core.tvp.tvp) udVar);
                aajVarUd.setClickCreativeListener((com.bytedance.sdk.openadsdk.core.tvp.jpc) qdlVar);
            }
            aajVarUd.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.mzz() { // from class: com.bytedance.sdk.openadsdk.core.jtx.3
                @Override // com.bytedance.sdk.openadsdk.core.widget.mzz
                public void qdl() {
                    if (jtx.this.wd != null) {
                        jtx.this.wd.onAdClicked();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.qdl.ud.qdl qdlVar3 = this.to;
        if (qdlVar3 != null && qdlVar3.qdl() != null) {
            this.to.qdl().setOnClickListener(qdlVar);
            this.to.qdl().setOnTouchListener(qdlVar);
        }
        com.bytedance.sdk.openadsdk.qdl.ud.qdl qdlVar4 = this.to;
        if (qdlVar4 != null) {
            qdlVar4.qdl(qdlVar);
            this.to.qdl(udVar);
        }
    }

    private void qdl(List<View> list, com.bytedance.sdk.openadsdk.core.lnr.lnr lnrVar) {
        if (com.bytedance.sdk.component.utils.exu.ud(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(lnrVar);
                    view.setOnTouchListener(lnrVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lnr(ViewGroup viewGroup) {
        this.tvp.qdl(System.currentTimeMillis(), hzv.qdl(viewGroup));
    }

    public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr lnrVar) {
        this.rq = lnrVar;
        com.bytedance.sdk.openadsdk.core.lnr.ud udVar = this.exu;
        if (udVar != null) {
            udVar.qdl(lnrVar);
        }
        com.bytedance.sdk.openadsdk.core.lnr.qdl qdlVar = this.rdp;
        if (qdlVar != null) {
            qdlVar.qdl(lnrVar);
        }
    }

    private void qdl(ViewGroup viewGroup) {
        HashMap map = new HashMap();
        map.put("click_scence", 1);
        Context contextQdl = viewGroup != null ? com.bytedance.sdk.component.utils.ud.qdl(viewGroup) : null;
        if (contextQdl == null) {
            contextQdl = this.lnr;
        }
        if (this.qdl.dk() == 2) {
            com.bytedance.sdk.openadsdk.core.model.ljh ljhVar = this.qdl;
            String str = this.mo;
            this.exu = new com.bytedance.sdk.openadsdk.core.tvp.tvp(contextQdl, ljhVar, str, com.bytedance.sdk.openadsdk.utils.gy.qdl(str));
        } else {
            com.bytedance.sdk.openadsdk.core.model.ljh ljhVar2 = this.qdl;
            String str2 = this.mo;
            this.exu = new com.bytedance.sdk.openadsdk.core.lnr.ud(contextQdl, ljhVar2, str2, com.bytedance.sdk.openadsdk.utils.gy.qdl(str2));
        }
        this.exu.qdl(viewGroup);
        this.exu.qdl(this.rq);
        this.exu.qdl(this.ud);
        this.exu.qdl(this.mml);
        this.exu.qdl(map);
        this.exu.qdl(new com.bytedance.sdk.openadsdk.core.lnr.ud.qdl() { // from class: com.bytedance.sdk.openadsdk.core.jtx.1
            @Override // com.bytedance.sdk.openadsdk.core.lnr.ud.qdl
            public void qdl(View view, int i2) {
                if (jtx.this.wd != null) {
                    jtx.this.wd.onAdClicked();
                }
            }
        });
        if (this.qdl.dk() == 2) {
            Context context = this.lnr;
            com.bytedance.sdk.openadsdk.core.model.ljh ljhVar3 = this.qdl;
            String str3 = this.mo;
            this.rdp = new com.bytedance.sdk.openadsdk.core.tvp.jpc(context, ljhVar3, str3, com.bytedance.sdk.openadsdk.utils.gy.qdl(str3));
        } else {
            Context context2 = this.lnr;
            com.bytedance.sdk.openadsdk.core.model.ljh ljhVar4 = this.qdl;
            String str4 = this.mo;
            this.rdp = new com.bytedance.sdk.openadsdk.core.lnr.qdl(context2, ljhVar4, str4, com.bytedance.sdk.openadsdk.utils.gy.qdl(str4));
        }
        this.rdp.qdl(viewGroup);
        this.rdp.qdl(this.rq);
        this.rdp.qdl(this.ud);
        this.rdp.qdl(this.mml);
        this.rdp.qdl(map);
        this.rdp.qdl(new com.bytedance.sdk.openadsdk.core.lnr.ud.qdl() { // from class: com.bytedance.sdk.openadsdk.core.jtx.2
            @Override // com.bytedance.sdk.openadsdk.core.lnr.ud.qdl
            public void qdl(View view, int i2) {
                if (jtx.this.wd != null) {
                    jtx.this.wd.onAdClicked();
                }
                com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(jtx.this.qdl, 9);
                jtx.this.to.exu();
            }
        });
    }

    private void ud(final ViewGroup viewGroup) {
        ag.qdl(viewGroup, true, 5, false, new ag.ud() { // from class: com.bytedance.sdk.openadsdk.core.jtx.6
            @Override // com.bytedance.sdk.openadsdk.utils.ag.ud
            public void qdl(boolean z2) {
                jtx.this.qdl(z2, viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.ag.ud
            public void ud() {
                jtx.this.ud();
            }

            @Override // com.bytedance.sdk.openadsdk.utils.ag.ud
            public void qdl() {
                jtx.this.lnr(viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.ag.ud
            public void qdl(View view, boolean z2) {
                if (!z2) {
                    com.bytedance.sdk.openadsdk.bch.qdl.lnr.qdl(jtx.this.qdl, 8);
                } else {
                    com.bytedance.sdk.openadsdk.bch.qdl.lnr.qdl(jtx.this.qdl, 4);
                    jtx.this.qdl(viewGroup, view);
                }
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud() {
        if (this.jpc > 0) {
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(String.valueOf(SystemClock.elapsedRealtime() - this.jpc), this.qdl, this.mo, this.tvp);
            this.jpc = 0L;
        }
    }

    private void qdl(ViewGroup viewGroup, wd wdVar, List<View> list, List<View> list2) {
        com.bytedance.sdk.openadsdk.core.lnr.ud udVar = this.exu;
        if (udVar == null || this.rdp == null) {
            return;
        }
        wdVar.qdl(list, udVar);
        wdVar.qdl(list2, this.rdp);
        qdl(this.exu, this.rdp);
        qdl(wdVar, viewGroup);
    }

    private void qdl(ViewGroup viewGroup, List<View> list, List<View> list2) {
        com.bytedance.sdk.openadsdk.core.lnr.ud udVar = this.exu;
        if (udVar == null || this.rdp == null) {
            return;
        }
        qdl(list, udVar);
        qdl(list2, this.rdp);
        qdl(this.exu, this.rdp);
        ud(viewGroup);
    }

    private void qdl(com.bytedance.sdk.openadsdk.core.lnr.ud udVar, com.bytedance.sdk.openadsdk.core.lnr.qdl qdlVar) {
        if (this.qdl.dk() == 2) {
            ud(udVar, qdlVar);
        } else {
            qdl(qdlVar);
        }
    }

    private void qdl(com.bytedance.sdk.openadsdk.core.lnr.qdl qdlVar) {
        if (com.bytedance.sdk.openadsdk.core.settings.rq.lnr().mml(String.valueOf(this.qdl.fz()))) {
            com.bytedance.sdk.openadsdk.qdl.ud.qdl qdlVar2 = this.to;
            if (qdlVar2 != null && qdlVar2.qdl() != null) {
                this.to.qdl().setOnClickListener(qdlVar);
                this.to.qdl().setOnTouchListener(qdlVar);
            }
            com.bytedance.sdk.openadsdk.qdl.ud.qdl qdlVar3 = this.to;
            if (qdlVar3 != null) {
                qdlVar3.qdl(qdlVar);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.qdl.ud.qdl qdlVar4 = this.to;
        if (qdlVar4 != null && qdlVar4.qdl() != null) {
            PAGMediaView pAGMediaViewQdl = this.to.qdl();
            com.bytedance.sdk.openadsdk.core.lnr.lnr lnrVar = new com.bytedance.sdk.openadsdk.core.lnr.lnr() { // from class: com.bytedance.sdk.openadsdk.core.jtx.4
                @Override // com.bytedance.sdk.openadsdk.core.lnr.lnr
                public void qdl(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl> sparseArray, boolean z2) {
                    if (view instanceof PAGVideoMediaView) {
                        ((PAGVideoMediaView) view).handleInterruptVideo();
                    }
                }
            };
            pAGMediaViewQdl.setOnClickListener(lnrVar);
            pAGMediaViewQdl.setOnTouchListener(lnrVar);
        }
        com.bytedance.sdk.openadsdk.qdl.ud.qdl qdlVar5 = this.to;
        if (qdlVar5 != null) {
            qdlVar5.qdl((com.bytedance.sdk.openadsdk.core.lnr.qdl) null);
        }
    }

    private void qdl(wd wdVar, final ViewGroup viewGroup) {
        wdVar.setCallback(new wd.qdl() { // from class: com.bytedance.sdk.openadsdk.core.jtx.5
            @Override // com.bytedance.sdk.openadsdk.core.wd.qdl
            public void qdl(boolean z2) {
                jtx.this.qdl(z2, viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.core.wd.qdl
            public void ud() {
                jtx.this.ud();
            }

            @Override // com.bytedance.sdk.openadsdk.core.wd.qdl
            public void qdl() {
                jtx.this.lnr(viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.core.wd.qdl
            public void qdl(View view) {
                jtx.this.qdl(viewGroup, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(boolean z2, ViewGroup viewGroup) {
        if (z2 && this.qdl.jwd() && !this.qdl.ljh()) {
            this.qdl.mo(true);
            com.bytedance.sdk.openadsdk.core.model.ljh ljhVar = this.qdl;
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, this.mo, ljhVar.fo());
        }
        if (!z2 && this.jpc > 0) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.jpc);
            this.tvp.qdl(System.currentTimeMillis(), hzv.qdl(viewGroup));
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(strValueOf, this.qdl, this.mo, this.tvp);
            this.jpc = 0L;
            return;
        }
        this.tvp.qdl(System.currentTimeMillis(), hzv.qdl(viewGroup));
        this.jpc = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(ViewGroup viewGroup, View view) {
        com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl;
        if (this.fs.get()) {
            return;
        }
        this.fs.set(true);
        if (this.mml instanceof com.bytedance.sdk.openadsdk.qdl.ud.qdl.lnr) {
            com.bytedance.sdk.openadsdk.core.tvp.aaj aajVarUd = this.to.ud();
            if (aajVarUd != null) {
                aajVarUd.jl();
            }
            ((com.bytedance.sdk.openadsdk.qdl.ud.qdl.lnr) this.mml).qdl(true);
        }
        this.tvp.qdl(System.currentTimeMillis(), hzv.qdl(viewGroup));
        this.jpc = SystemClock.elapsedRealtime();
        mml(viewGroup);
        com.bytedance.sdk.openadsdk.qdl.ud.mo moVar = this.wd;
        if (moVar != null) {
            moVar.qdl(this.mml);
        }
        if (this.qdl.rfx()) {
            com.bytedance.sdk.openadsdk.utils.gy.qdl(this.qdl, view);
        }
        com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm = this.qdl.zm();
        if (mmlVarZm == null || (mmlVarQdl = mmlVarZm.qdl()) == null) {
            return;
        }
        mmlVarQdl.qdl(0L);
    }
}
