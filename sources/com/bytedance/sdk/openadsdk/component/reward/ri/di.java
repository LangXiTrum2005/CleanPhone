package com.bytedance.sdk.openadsdk.component.reward.ri;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.ac;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class di {
    private boolean lr;
    private ri ri;

    public di(ri riVar) {
        this.ri = riVar;
    }

    private void lr() {
        com.bytedance.sdk.openadsdk.activity.single.mj mjVar;
        ri riVar = this.ri;
        Activity activity = riVar.ig;
        wjv wjvVar = riVar.lr;
        String str = riVar.fi;
        com.bytedance.sdk.openadsdk.core.jbs.jbs jbsVar = new com.bytedance.sdk.openadsdk.core.jbs.jbs(activity, wjvVar, str, ig.ri(str)) { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.di.3
            @Override // com.bytedance.sdk.openadsdk.core.ik.lr, com.bytedance.sdk.openadsdk.core.ik.ik
            public void ri(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.ik.ik.ri> sparseArray, boolean z) {
                super.ri(view, f, f2, f3, f4, sparseArray, z);
            }
        };
        jbsVar.ri(new com.bytedance.sdk.openadsdk.core.ik.lr.ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.di.4
            @Override // com.bytedance.sdk.openadsdk.core.ik.lr.ri
            public void ri(View view, int i) {
                di.this.ri.qd.xd();
            }
        });
        HashMap map = new HashMap();
        map.put("click_scence", 1);
        ri riVar2 = this.ri;
        if (riVar2.xe && (mjVar = riVar2.ajz) != null) {
            int i = mjVar.sf + 1;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_show_order", i);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Throwable unused) {
            }
        }
        jbsVar.ri(map);
        ri riVar3 = this.ri;
        Activity activity2 = riVar3.ig;
        wjv wjvVar2 = riVar3.lr;
        String str2 = riVar3.fi;
        com.bytedance.sdk.openadsdk.core.jbs.mj mjVar2 = new com.bytedance.sdk.openadsdk.core.jbs.mj(activity2, wjvVar2, str2, ig.ri(str2)) { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.di.5
            @Override // com.bytedance.sdk.openadsdk.core.ik.ri, com.bytedance.sdk.openadsdk.core.ik.lr, com.bytedance.sdk.openadsdk.core.ik.ik
            public void ri(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.ik.ik.ri> sparseArray, boolean z) {
                HashMap map2 = new HashMap();
                map2.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(di.this.ri.ihz.aw()));
                if (di.this.ri.ajz != null) {
                    di.this.ri.ajz.ri(map2, f, f2);
                }
                ri(map2);
                super.ri(view, f, f2, f3, f4, sparseArray, z);
                di.this.ri.ihz.feb();
            }
        };
        mjVar2.ri(new com.bytedance.sdk.openadsdk.core.ik.lr.ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.di.6
            @Override // com.bytedance.sdk.openadsdk.core.ik.lr.ri
            public void ri(View view, int i2) {
                di.this.ri.qd.xd();
            }
        });
        HashMap map2 = new HashMap();
        map2.put("click_scence", 1);
        mjVar2.ri(map2);
        this.ri.ay.ri(jbsVar, mjVar2);
    }

    public void ri(float[] fArr) {
        com.bytedance.sdk.openadsdk.component.reward.view.jbs jbsVar;
        this.lr = true;
        Arrays.toString(fArr);
        AdSlot adSlotBuild = new AdSlot.Builder().setCodeId(String.valueOf(this.ri.lr.ur())).setExpressViewAcceptedSize(fArr[0], fArr[1]).build();
        ri riVar = this.ri;
        riVar.ay.ri(adSlotBuild, riVar.dzy.vr);
        ri riVar2 = this.ri;
        co coVar = riVar2.oh;
        if (coVar != null && (jbsVar = riVar2.ay) != null) {
            coVar.ri(jbsVar.ri());
        }
        this.ri.ay.ri(new com.bytedance.sdk.openadsdk.core.jbs.vr() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.di.1
            @Override // com.bytedance.sdk.openadsdk.core.jbs.vr
            public void di() {
                di.this.ri.zf.ri(di.this.ri.nd);
            }

            @Override // com.bytedance.sdk.openadsdk.core.jbs.vr
            public int fi() {
                if (di.this.ri.ay.ik()) {
                    return 4;
                }
                if (di.this.ri.ay.ka()) {
                    return 5;
                }
                if (di.this.ri.ihz.qt()) {
                    return 1;
                }
                if (di.this.ri.ihz.di()) {
                    return 2;
                }
                di.this.ri.ihz.jbs();
                return 3;
            }

            @Override // com.bytedance.sdk.openadsdk.core.jbs.vr
            public long ik() {
                return di.this.ri.ihz.bgr();
            }

            @Override // com.bytedance.sdk.openadsdk.core.jbs.vr
            public long ka() {
                return di.this.ri.ihz.ri();
            }

            @Override // com.bytedance.sdk.openadsdk.core.jbs.vr
            public boolean lr(JSONObject jSONObject) {
                return com.bytedance.sdk.openadsdk.component.reward.lr.ri(di.this.ri);
            }

            @Override // com.bytedance.sdk.openadsdk.core.jbs.vr
            public void ri(boolean z, String str) {
                if (di.this.ri.zyn != z) {
                    di.this.ri.oh.ri(str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.jbs.vr
            public void lr() {
                if (di.this.ri.dzy == null || di.this.ri.dzy.qt() == null) {
                    return;
                }
                di.this.ri.dzy.qt().performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.core.jbs.vr
            public void ri() {
                di.this.ri.oh.ka();
            }

            @Override // com.bytedance.sdk.openadsdk.core.jbs.vr
            public void lr(int i) {
                di.this.ri.fe = i;
            }

            @Override // com.bytedance.sdk.openadsdk.core.jbs.vr
            public void ri(String str, JSONObject jSONObject) {
                if (di.this.ri == null || di.this.ri.qd == null) {
                    return;
                }
                di.this.ri.qd.ri(str, jSONObject);
            }

            @Override // com.bytedance.sdk.openadsdk.core.jbs.vr
            public boolean ri(JSONObject jSONObject) {
                if (di.this.ri == null || di.this.ri.ihz == null) {
                    return false;
                }
                return di.this.ri.ihz.ri(jSONObject);
            }

            @Override // com.bytedance.sdk.openadsdk.core.jbs.vr
            public void ri(int i) {
                if (i != 1) {
                    if (i == 2) {
                        di.this.ri.ihz.pv();
                        return;
                    }
                    if (i == 3) {
                        di.this.ri.ihz.ri(di.this.ri.qd);
                        return;
                    } else if (i == 4) {
                        di.this.ri.ihz.tan();
                        return;
                    } else if (i != 5) {
                        return;
                    }
                }
                if (di.this.ri.ihz.di() || di.this.ri.ihz.jbs()) {
                    return;
                }
                di.this.ri.qd.ri(0L, false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.jbs.vr
            public void ri(int i, String str) {
                di.this.ri.ihz.ri(i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.jbs.vr
            public void ri(int i, com.bytedance.sdk.component.adexpress.lr.bgr bgrVar) {
                di.this.ri.dzy.ri(i, bgrVar);
            }
        });
        this.ri.ay.ri(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.di.2
            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
                if (di.this.ri == null || di.this.ri.lr == null || !di.this.ri.lr.zyu()) {
                    return;
                }
                di.this.ri.qd.xd();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i) {
                boolean z = -1024 == i;
                di.this.ri.ri(i, str, z ? 1002 : 1001);
                di.this.ri.su.ri();
                if (z) {
                    return;
                }
                if (!di.this.ri.lr.vgs()) {
                    di.this.ri.ory.ri(true);
                    di.this.ri.ory.fi();
                }
                di.this.ri.ay.fi().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.di.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        di.this.ri.nd.ri(false, false, false, 90);
                    }
                });
                di.this.ri.dzy.aw();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f, float f2) {
                ac acVar;
                if (!di.this.ri.lr.vgs()) {
                    if (di.this.ri.ay.jbs()) {
                        di.this.ri.nd.ri(true);
                        di.this.ri.ihz.ka(false);
                    } else {
                        di.this.ri.ihz.ka(true);
                    }
                    di.this.ri.dzy.ri(8);
                    di.this.ri.ory.ri(true);
                    di.this.ri.ory.fi();
                    if (di.this.ri.ay.jbs()) {
                        di.this.ri.ay.lr().setBackgroundColor(-16777216);
                        di.this.ri.nd.ri(di.this.ri.dzy.di());
                    } else if (di.this.ri.lr.eu() != null && di.this.ri.nd.ri()) {
                        di.this.ri.ta = true;
                    }
                }
                di.this.ri.nd.ay();
                if (ac.ik(di.this.ri.lr) && (acVar = di.this.ri.dzy.vr) != null) {
                    acVar.ik();
                }
                di.this.ri.dzy.aw();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i) {
            }
        });
        lr();
        FrameLayout.LayoutParams layoutParams = (this.ri.lr.vgs() || com.bytedance.sdk.openadsdk.core.co.fi.ri(this.ri.lr.hpn()) || ac.ik(this.ri.lr)) ? new FrameLayout.LayoutParams(-1, -1) : new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.ri.dzy.di().addView(this.ri.ay.ri(), layoutParams);
        if (!this.ri.ay.jbs()) {
            this.ri.nd.ri(false);
        }
        this.ri.ay.bgr();
    }

    public void ri(wjv wjvVar) {
        com.bytedance.sdk.openadsdk.component.reward.view.jbs jbsVar = this.ri.ay;
        if (jbsVar != null) {
            com.bytedance.sdk.openadsdk.component.reward.view.ik ikVarRi = jbsVar.ri();
            ViewParent parent = ikVarRi.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(ikVarRi);
            }
            this.ri.dzy.di().addView(ikVarRi);
            if (!this.ri.ay.jbs()) {
                this.ri.nd.ri(false);
            }
            this.ri.ay.ri(wjvVar);
            lr();
        }
    }

    public boolean ri() {
        return this.lr;
    }

    public void ri(ri riVar) {
        this.ri = riVar;
    }
}
