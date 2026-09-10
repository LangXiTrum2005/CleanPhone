package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.jbs.ac;
import com.bytedance.sdk.openadsdk.core.jbs.jbs;
import com.bytedance.sdk.openadsdk.core.jbs.mj;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.ironsource.X3;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends ik {
    private final com.bytedance.sdk.openadsdk.component.di.lr aw;
    private com.bytedance.sdk.openadsdk.component.jbs.lr bgr;
    private boolean vr;

    public lr(Activity activity, wjv wjvVar, FrameLayout frameLayout, ri riVar, int i, boolean z, com.bytedance.sdk.openadsdk.component.mj.ri riVar2, com.bytedance.sdk.openadsdk.component.di.lr lrVar) {
        super(activity, wjvVar, frameLayout, riVar, i, z, riVar2);
        this.aw = lrVar;
    }

    @Override // com.bytedance.sdk.openadsdk.component.ik
    public void fi() {
        com.bytedance.sdk.openadsdk.component.jbs.lr lrVar = this.bgr;
        if (lrVar != null) {
            lrVar.nr();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.ik
    public int ka() {
        return this.bgr.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.component.ik
    public void ik() {
        super.ik();
        com.bytedance.sdk.openadsdk.component.jbs.lr lrVar = this.bgr;
        if (lrVar != null) {
            lrVar.co();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.ik
    public void lr() {
        this.bgr.tan();
    }

    @Override // com.bytedance.sdk.openadsdk.component.ik
    public void ri(ViewGroup viewGroup) {
        Pair<Float, Float> pairRi = com.bytedance.sdk.openadsdk.core.jbs.ri.ri.ri(this.ri.getWindow(), this.xha);
        com.bytedance.sdk.openadsdk.component.jbs.lr lrVar = new com.bytedance.sdk.openadsdk.component.jbs.lr(this.ri, this.lr, new AdSlot.Builder().setCodeId(String.valueOf(this.lr.ur())).setExpressViewAcceptedSize(((Float) pairRi.first).floatValue(), ((Float) pairRi.second).floatValue()).build(), "open_ad", this.fi, this.aw, this.f18091co);
        this.bgr = lrVar;
        lrVar.setTopListener(this.fi);
        this.bgr.setExpressVideoListenerProxy(this.fi);
        this.bgr.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.lr.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i) {
                lr.this.fi.ka();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f, float f2) {
                if (lr.this.bgr.ihz()) {
                    lr.this.vr = true;
                    lr lrVar2 = lr.this;
                    lr.super.ri((ViewGroup) lrVar2.ka);
                    lr.super.ri();
                    lr.super.lr();
                    return;
                }
                if (lr.this.lr.ory()) {
                    lr.this.fi.ik();
                    return;
                }
                lr lrVar3 = lr.this;
                if (!lrVar3.ik) {
                    lrVar3.fi.ik();
                } else if (!lrVar3.ri(lrVar3.bgr.getVideoFrameLayout())) {
                    lr.this.fi.ka();
                } else {
                    lr.this.bgr.setVideoManager(lr.this.xha());
                    lr.this.fi.ik();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i) {
            }
        });
        this.lr.tan(1);
        this.ka.addView(this.bgr, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.bytedance.sdk.openadsdk.component.ik
    public void ri() {
        jbs jbsVarRi = com.bytedance.sdk.openadsdk.component.ri.lr.ri(this.lr, this.ri, this.f18091co, this.bgr);
        jbsVarRi.ri(new com.bytedance.sdk.openadsdk.core.ik.lr.ri() { // from class: com.bytedance.sdk.openadsdk.component.lr.2
            @Override // com.bytedance.sdk.openadsdk.core.ik.lr.ri
            public void ri(View view, int i) {
                lr.this.fi.fi();
            }
        });
        this.bgr.setClickListener(jbsVarRi);
        mj mjVarLr = com.bytedance.sdk.openadsdk.component.ri.lr.lr(this.lr, this.ri, this.f18091co, this.bgr);
        this.bgr.setClickCreativeListener(mjVarLr);
        mjVarLr.ri(new com.bytedance.sdk.openadsdk.core.ik.lr.ri() { // from class: com.bytedance.sdk.openadsdk.component.lr.3
            @Override // com.bytedance.sdk.openadsdk.core.ik.lr.ri
            public void ri(View view, int i) {
                lr.this.fi.fi();
            }
        });
        this.bgr.setBackupListener(new com.bytedance.sdk.component.adexpress.lr.ik() { // from class: com.bytedance.sdk.openadsdk.component.lr.4
            @Override // com.bytedance.sdk.component.adexpress.lr.ik
            public boolean ri(ViewGroup viewGroup, int i) {
                StringBuilder sb = new StringBuilder("isUseBackup() called with: view = [");
                sb.append(viewGroup);
                sb.append("], errCode = [");
                sb.append(i);
                sb.append(X3.j.e);
                try {
                    ((ac) viewGroup).ac();
                    new com.bytedance.sdk.openadsdk.component.jbs.ri(lr.this.ri).ri((ac) lr.this.bgr);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.component.ik
    public void ri(int i, boolean z) {
        super.ri(i, z);
        com.bytedance.sdk.openadsdk.component.jbs.lr lrVar = this.bgr;
        if (lrVar != null) {
            lrVar.setTime(String.valueOf(i), (int) (this.f18091co.ik() / 1000), i, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.ik
    public JSONObject ri(JSONObject jSONObject) {
        return this.bgr.ri(jSONObject, this.lr);
    }

    public void ri(long j, long j2) {
        com.bytedance.sdk.openadsdk.component.jbs.lr lrVar = this.bgr;
        if (lrVar != null) {
            lrVar.ri(j, j2);
        }
    }
}
