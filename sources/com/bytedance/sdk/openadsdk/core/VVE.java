package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.JProtect;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.utils.BcA;
import com.bytedance.sdk.openadsdk.utils.le;
import com.bytedance.sdk.openadsdk.utils.nJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class VVE {
    private So0 JVA;
    private com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc LD;
    private final com.bytedance.sdk.openadsdk.core.model.tD Lxb;
    private com.bytedance.sdk.openadsdk.core.LD.LD NXR;
    private long OY;
    private com.bytedance.sdk.openadsdk.core.LD.Lxb STP;
    private final PAGNativeAd ZU;
    private com.bytedance.sdk.openadsdk.Lxb.LD.lc ebl;
    private final String lc;
    private final Context lk;
    private final com.bytedance.sdk.openadsdk.Lxb.LD.Lxb nBu;
    private List<View> JXs = new ArrayList();
    private final com.bytedance.sdk.openadsdk.ZU.ebl QAg = new com.bytedance.sdk.openadsdk.ZU.ebl();
    private final AtomicBoolean sLN = new AtomicBoolean(false);

    public static class Lxb implements View.OnLayoutChangeListener {
        private final ViewGroup LD;
        private final com.bytedance.sdk.openadsdk.ZU.ebl Lxb;

        public Lxb(com.bytedance.sdk.openadsdk.ZU.ebl eblVar, ViewGroup viewGroup) {
            this.Lxb = eblVar;
            this.LD = viewGroup;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.Lxb.Lxb(System.currentTimeMillis(), nE.Lxb(this.LD));
        }
    }

    public VVE(Context context, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.model.tD tDVar, String str, com.bytedance.sdk.openadsdk.Lxb.LD.Lxb lxb) {
        this.ZU = pAGNativeAd;
        this.Lxb = tDVar;
        this.lk = context;
        this.lc = str;
        this.nBu = lxb;
        if (tDVar.sRq() == 4) {
            this.LD = com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.ebl.Lxb(context, tDVar, str);
        }
    }

    private ebl LD(@NonNull ViewGroup viewGroup, List<View> list, List<View> list2, @Nullable List<View> list3, com.bytedance.sdk.openadsdk.Lxb.LD.lc lcVar) {
        this.ebl = lcVar;
        viewGroup.addOnLayoutChangeListener(new Lxb(this.QAg, viewGroup));
        this.JXs = list;
        ebl eblVarZU = ZU(viewGroup);
        if (eblVarZU == null) {
            eblVarZU = new ebl(this.lk, viewGroup);
            viewGroup.addView(eblVarZU);
        }
        eblVarZU.Lxb();
        eblVarZU.setRefClickViews(list2);
        if (list != null) {
            for (View view : this.JXs) {
                if (view != null) {
                    view.setTag(520093762, Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        eblVarZU.setRefCreativeViews(list3);
        return eblVarZU;
    }

    private ebl ZU(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ebl) {
                return (ebl) childAt;
            }
        }
        return null;
    }

    private void lk(ViewGroup viewGroup) {
        com.bytedance.sdk.openadsdk.core.model.tD tDVar;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.JXs != null) {
                JSONArray jSONArray = new JSONArray();
                for (View view : this.JXs) {
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
            PAGMediaView pAGMediaViewOY = this.nBu.OY();
            if (pAGMediaViewOY != null) {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("width", le.ZU(this.lk, pAGMediaViewOY.getWidth()) * 1.0f);
                    jSONObject4.put("height", le.ZU(this.lk, pAGMediaViewOY.getHeight()) * 1.0f);
                } catch (Throwable unused3) {
                }
                jSONObject.put("media_view", jSONObject4.toString());
            }
            com.bytedance.sdk.openadsdk.core.OY.tD tDVarLD = this.nBu.LD();
            if (tDVarLD != null && (tDVar = this.Lxb) != null) {
                jSONObject.put("dynamic_show_type", tDVar.id());
                tDVarLD.Lxb(jSONObject, this.Lxb);
            }
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(this.Lxb, this.lc, jSONObject);
            com.bytedance.sdk.openadsdk.eK.Lxb.lk.Lxb(this.Lxb);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("InteractionManager", "onShowFun json error", e);
        }
    }

    public com.bytedance.sdk.openadsdk.ZU.ebl Lxb() {
        return this.QAg;
    }

    public void Lxb(View view, int i) {
        com.bytedance.sdk.openadsdk.Lxb.LD.lc lcVar = this.ebl;
        if (lcVar != null) {
            lcVar.onAdClicked();
        }
    }

    public void Lxb(@NonNull ViewGroup viewGroup, List<View> list, List<View> list2, @Nullable List<View> list3, @Nullable View view, com.bytedance.sdk.openadsdk.Lxb.LD.lc lcVar) {
        Lxb(viewGroup, list, list2, list3, lcVar);
        Lxb(viewGroup, view);
        Lxb(viewGroup, list2, list3);
    }

    private void Lxb(@NonNull ViewGroup viewGroup, List<View> list, List<View> list2, @Nullable List<View> list3, com.bytedance.sdk.openadsdk.Lxb.LD.lc lcVar) {
        this.ebl = lcVar;
        viewGroup.addOnLayoutChangeListener(new Lxb(this.QAg, viewGroup));
        this.JXs = list;
        Lxb(list2, (com.bytedance.sdk.openadsdk.core.LD.lk) null);
        if (list != null) {
            for (View view : this.JXs) {
                if (view != null) {
                    view.setTag(520093762, Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        Lxb(list3, (com.bytedance.sdk.openadsdk.core.LD.lk) null);
    }

    private void LD(com.bytedance.sdk.openadsdk.core.LD.LD ld, com.bytedance.sdk.openadsdk.core.LD.Lxb lxb) {
        com.bytedance.sdk.openadsdk.Lxb.LD.Lxb lxb2 = this.nBu;
        if (lxb2 != null && lxb2.LD() != null) {
            com.bytedance.sdk.openadsdk.core.OY.tD tDVarLD = this.nBu.LD();
            if ((ld instanceof com.bytedance.sdk.openadsdk.core.OY.QAg) && (lxb instanceof com.bytedance.sdk.openadsdk.core.OY.OY)) {
                tDVarLD.setClickListener((com.bytedance.sdk.openadsdk.core.OY.QAg) ld);
                tDVarLD.setClickCreativeListener((com.bytedance.sdk.openadsdk.core.OY.OY) lxb);
            }
            tDVarLD.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.lc() { // from class: com.bytedance.sdk.openadsdk.core.VVE.3
                @Override // com.bytedance.sdk.openadsdk.core.widget.lc
                public void Lxb() {
                    if (VVE.this.ebl != null) {
                        VVE.this.ebl.onAdClicked();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.Lxb.LD.Lxb lxb3 = this.nBu;
        if (lxb3 != null && lxb3.Lxb() != null) {
            this.nBu.Lxb().setOnClickListener(lxb);
            this.nBu.Lxb().setOnTouchListener(lxb);
        }
        com.bytedance.sdk.openadsdk.Lxb.LD.Lxb lxb4 = this.nBu;
        if (lxb4 != null) {
            lxb4.Lxb(lxb);
            this.nBu.Lxb(ld);
        }
    }

    private void Lxb(List<View> list, com.bytedance.sdk.openadsdk.core.LD.lk lkVar) {
        if (com.bytedance.sdk.component.utils.nBu.LD(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(lkVar);
                    view.setOnTouchListener(lkVar);
                }
            }
        }
    }

    public void Lxb(So0 so0) {
        this.JVA = so0;
        com.bytedance.sdk.openadsdk.core.LD.LD ld = this.NXR;
        if (ld != null) {
            ld.Lxb(so0);
        }
        com.bytedance.sdk.openadsdk.core.LD.Lxb lxb = this.STP;
        if (lxb != null) {
            lxb.Lxb(so0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(ViewGroup viewGroup) {
        this.QAg.Lxb(System.currentTimeMillis(), nE.Lxb(viewGroup));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD() {
        if (this.OY > 0) {
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(String.valueOf(SystemClock.elapsedRealtime() - this.OY), this.Lxb, this.lc, this.QAg);
            this.OY = 0L;
        }
    }

    private void Lxb(@NonNull ViewGroup viewGroup, @Nullable View view) {
        HashMap map = new HashMap();
        map.put("click_scence", 1);
        Context contextLxb = viewGroup != null ? com.bytedance.sdk.component.utils.LD.Lxb(viewGroup) : null;
        if (contextLxb == null) {
            contextLxb = this.lk;
        }
        if (this.Lxb.eK() == 2) {
            com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.Lxb;
            String str = this.lc;
            this.NXR = new com.bytedance.sdk.openadsdk.core.OY.QAg(contextLxb, tDVar, str, nJ.Lxb(str));
        } else {
            com.bytedance.sdk.openadsdk.core.model.tD tDVar2 = this.Lxb;
            String str2 = this.lc;
            this.NXR = new com.bytedance.sdk.openadsdk.core.LD.LD(contextLxb, tDVar2, str2, nJ.Lxb(str2));
        }
        this.NXR.Lxb(viewGroup);
        this.NXR.Lxb(this.JVA);
        this.NXR.LD(view);
        this.NXR.Lxb(this.LD);
        this.NXR.Lxb(this.ZU);
        this.NXR.Lxb(map);
        this.NXR.Lxb(new com.bytedance.sdk.openadsdk.core.LD.LD.Lxb() { // from class: com.bytedance.sdk.openadsdk.core.VVE.1
            @Override // com.bytedance.sdk.openadsdk.core.LD.LD.Lxb
            public void Lxb(View view2, int i) {
                if (VVE.this.ebl != null) {
                    VVE.this.ebl.onAdClicked();
                }
            }
        });
        if (this.Lxb.eK() == 2) {
            Context context = this.lk;
            com.bytedance.sdk.openadsdk.core.model.tD tDVar3 = this.Lxb;
            String str3 = this.lc;
            this.STP = new com.bytedance.sdk.openadsdk.core.OY.OY(context, tDVar3, str3, nJ.Lxb(str3));
        } else {
            Context context2 = this.lk;
            com.bytedance.sdk.openadsdk.core.model.tD tDVar4 = this.Lxb;
            String str4 = this.lc;
            this.STP = new com.bytedance.sdk.openadsdk.core.LD.Lxb(context2, tDVar4, str4, nJ.Lxb(str4));
        }
        this.STP.Lxb(viewGroup);
        this.STP.Lxb(this.JVA);
        this.STP.LD(view);
        this.STP.Lxb(this.LD);
        this.STP.Lxb(this.ZU);
        this.STP.Lxb(map);
        this.STP.Lxb(new com.bytedance.sdk.openadsdk.core.LD.LD.Lxb() { // from class: com.bytedance.sdk.openadsdk.core.VVE.2
            @Override // com.bytedance.sdk.openadsdk.core.LD.LD.Lxb
            public void Lxb(View view2, int i) {
                if (VVE.this.ebl != null) {
                    VVE.this.ebl.onAdClicked();
                }
                com.bytedance.sdk.openadsdk.eK.LD.JXs.Lxb(VVE.this.Lxb, 9);
                VVE.this.nBu.NXR();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(ViewGroup viewGroup, View view) {
        if (this.sLN.get()) {
            return;
        }
        this.sLN.set(true);
        if (this.ZU instanceof com.bytedance.sdk.openadsdk.Lxb.LD.Lxb.lk) {
            com.bytedance.sdk.openadsdk.core.OY.tD tDVarLD = this.nBu.LD();
            if (tDVarLD != null) {
                tDVarLD.OY();
            }
            ((com.bytedance.sdk.openadsdk.Lxb.LD.Lxb.lk) this.ZU).Lxb(true);
        }
        this.QAg.Lxb(System.currentTimeMillis(), nE.Lxb(viewGroup));
        this.OY = SystemClock.elapsedRealtime();
        lk(viewGroup);
        com.bytedance.sdk.openadsdk.Lxb.LD.lc lcVar = this.ebl;
        if (lcVar != null) {
            lcVar.Lxb(this.ZU);
        }
        if (this.Lxb.gS()) {
            nJ.Lxb(this.Lxb, view);
        }
        if (this.Lxb.SlV() != null) {
            this.Lxb.SlV().Lxb().Lxb(0L);
        }
    }

    private void Lxb(@NonNull ViewGroup viewGroup, ebl eblVar, List<View> list, @Nullable List<View> list2) {
        com.bytedance.sdk.openadsdk.core.LD.LD ld = this.NXR;
        if (ld == null || this.STP == null) {
            return;
        }
        eblVar.Lxb(list, ld);
        eblVar.Lxb(list2, this.STP);
        Lxb(this.NXR, this.STP);
        Lxb(eblVar, viewGroup);
    }

    private void Lxb(@NonNull ViewGroup viewGroup, List<View> list, @Nullable List<View> list2) {
        com.bytedance.sdk.openadsdk.core.LD.LD ld = this.NXR;
        if (ld == null || this.STP == null) {
            return;
        }
        Lxb(list, ld);
        Lxb(list2, this.STP);
        Lxb(this.NXR, this.STP);
        Lxb(viewGroup);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void Lxb(com.bytedance.sdk.openadsdk.core.LD.LD ld, com.bytedance.sdk.openadsdk.core.LD.Lxb lxb) {
        if (this.Lxb.eK() == 2) {
            LD(ld, lxb);
        } else {
            Lxb(lxb);
        }
    }

    private void Lxb(com.bytedance.sdk.openadsdk.core.LD.Lxb lxb) {
        if (com.bytedance.sdk.openadsdk.core.settings.VVE.TA().ZU(String.valueOf(this.Lxb.Td()))) {
            com.bytedance.sdk.openadsdk.Lxb.LD.Lxb lxb2 = this.nBu;
            if (lxb2 != null && lxb2.Lxb() != null) {
                this.nBu.Lxb().setOnClickListener(lxb);
                this.nBu.Lxb().setOnTouchListener(lxb);
            }
            com.bytedance.sdk.openadsdk.Lxb.LD.Lxb lxb3 = this.nBu;
            if (lxb3 != null) {
                lxb3.Lxb(lxb);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.Lxb.LD.Lxb lxb4 = this.nBu;
        if (lxb4 != null && lxb4.Lxb() != null) {
            PAGMediaView pAGMediaViewLxb = this.nBu.Lxb();
            com.bytedance.sdk.openadsdk.core.LD.lk lkVar = new com.bytedance.sdk.openadsdk.core.LD.lk() { // from class: com.bytedance.sdk.openadsdk.core.VVE.4
                @Override // com.bytedance.sdk.openadsdk.core.LD.lk
                public void Lxb(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.LD.lk.Lxb> sparseArray, boolean z) {
                    if (view instanceof PAGVideoMediaView) {
                        ((PAGVideoMediaView) view).handleInterruptVideo();
                    }
                }
            };
            pAGMediaViewLxb.setOnClickListener(lkVar);
            pAGMediaViewLxb.setOnTouchListener(lkVar);
        }
        com.bytedance.sdk.openadsdk.Lxb.LD.Lxb lxb5 = this.nBu;
        if (lxb5 != null) {
            lxb5.Lxb((com.bytedance.sdk.openadsdk.core.LD.Lxb) null);
        }
    }

    private void Lxb(ebl eblVar, final ViewGroup viewGroup) {
        eblVar.setCallback(new ebl.Lxb() { // from class: com.bytedance.sdk.openadsdk.core.VVE.5
            @Override // com.bytedance.sdk.openadsdk.core.ebl.Lxb
            public void LD() {
                VVE.this.LD();
            }

            @Override // com.bytedance.sdk.openadsdk.core.ebl.Lxb
            public void Lxb(boolean z) {
                VVE.this.Lxb(z, viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ebl.Lxb
            public void Lxb() {
                VVE.this.LD(viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ebl.Lxb
            @JProtect
            public void Lxb(View view) {
                VVE.this.LD(viewGroup, view);
            }
        });
    }

    private void Lxb(final ViewGroup viewGroup) {
        BcA.Lxb(viewGroup, true, 5, new BcA.LD() { // from class: com.bytedance.sdk.openadsdk.core.VVE.6
            @Override // com.bytedance.sdk.openadsdk.utils.BcA.LD
            public void LD() {
                VVE.this.LD();
            }

            @Override // com.bytedance.sdk.openadsdk.utils.BcA.LD
            public void Lxb(boolean z) {
                VVE.this.Lxb(z, viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.BcA.LD
            public void Lxb() {
                VVE.this.LD(viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.BcA.LD
            public void Lxb(View view, boolean z) {
                if (!z) {
                    com.bytedance.sdk.openadsdk.eK.Lxb.lk.Lxb(VVE.this.Lxb, 8);
                } else {
                    com.bytedance.sdk.openadsdk.eK.Lxb.lk.Lxb(VVE.this.Lxb, 4);
                    VVE.this.LD(viewGroup, view);
                }
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(boolean z, ViewGroup viewGroup) {
        if (z && this.Lxb.wVL() && !this.Lxb.aE()) {
            this.Lxb.ebl(true);
            com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.Lxb;
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(tDVar, this.lc, tDVar.Kue());
        }
        if (!z && this.OY > 0) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.OY);
            this.QAg.Lxb(System.currentTimeMillis(), nE.Lxb(viewGroup));
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(strValueOf, this.Lxb, this.lc, this.QAg);
            this.OY = 0L;
            return;
        }
        this.QAg.Lxb(System.currentTimeMillis(), nE.Lxb(viewGroup));
        this.OY = SystemClock.elapsedRealtime();
    }
}
