package com.bytedance.sdk.openadsdk.ri.lr.ri;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.core.co.fi;
import com.bytedance.sdk.openadsdk.core.jbs.ac;
import com.bytedance.sdk.openadsdk.core.jbs.tan;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.ri.lr.mj;
import com.bytedance.sdk.openadsdk.utils.qd;

/* JADX INFO: loaded from: classes2.dex */
public class ik extends mj {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private boolean f18162co;
    protected AdSlot jbs;
    protected final Context mj;
    protected ac qt;
    protected String sf;

    public ik(Context context, wjv wjvVar, AdSlot adSlot) {
        super(context, wjvVar, 5, true);
        this.sf = "embeded_ad";
        this.f18162co = false;
        this.lr.tan(1);
        this.ka.ri(this);
        this.mj = context;
        this.jbs = adSlot;
        ri();
        lr();
    }

    private void lr() {
        ac acVar = this.qt;
        if (acVar != null) {
            acVar.setBackupListener(new com.bytedance.sdk.component.adexpress.lr.ik() { // from class: com.bytedance.sdk.openadsdk.ri.lr.ri.ik.1
                @Override // com.bytedance.sdk.component.adexpress.lr.ik
                public boolean ri(ViewGroup viewGroup, int i) {
                    ri riVar = new ri(ik.this.qt.getContext());
                    riVar.setExtraFuncationHelper(((mj) ik.this).ka);
                    riVar.ri(ik.this.qt);
                    return true;
                }
            });
        }
    }

    public void fi() {
        ac acVar = this.qt;
        if (acVar != null) {
            acVar.tan();
        }
    }

    public void ik() {
        ac acVar = this.qt;
        if (acVar != null) {
            acVar.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.ri.lr.ri.ik.2
                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(View view, float f, float f2) {
                    if (!ik.this.qt.ihz()) {
                        ik.this.ri(f, f2);
                        if (ik.this.f18162co) {
                            ik.this.qt.nr();
                            return;
                        }
                        return;
                    }
                    ik ikVar = ik.this;
                    Context context = ikVar.mj;
                    wjv wjvVar = ((mj) ikVar).lr;
                    ik ikVar2 = ik.this;
                    com.bytedance.sdk.openadsdk.ri.lr.lr lrVar = new com.bytedance.sdk.openadsdk.ri.lr.lr(context, wjvVar, 5, ikVar2.jbs, ((mj) ikVar2).ka, ((mj) ik.this).ri);
                    ik ikVar3 = ik.this;
                    if (ikVar3 instanceof lr) {
                        lrVar.ri(((tan) ikVar3.ka()).getVideoAdListener());
                    }
                    ((mj) ik.this).ka.ri((com.bytedance.sdk.openadsdk.core.ik.ri) ik.this.qt.getClickCreativeListener());
                    PAGMediaView pAGMediaViewJbs = ((mj) ik.this).ka.jbs();
                    if (pAGMediaViewJbs == null) {
                        pAGMediaViewJbs = new PAGMediaView(ik.this.mj);
                    }
                    ik.this.qt.addView(pAGMediaViewJbs);
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

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderFail(View view, String str, int i) {
                }
            });
        }
    }

    public ac ka() {
        return this.qt;
    }

    public void ri() {
        this.qt = new ac(this.mj, this.lr, this.jbs, this.sf);
        ik();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(float f, float f2) {
        ac acVar = this.qt;
        if (acVar != null && fi.ri(acVar.getDynamicShowType())) {
            ViewGroup.LayoutParams layoutParams = this.qt.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            } else {
                layoutParams.width = -1;
                layoutParams.height = -1;
            }
            this.qt.setLayoutParams(layoutParams);
            return;
        }
        int iLr = qd.lr(this.mj, f);
        int iLr2 = qd.lr(this.mj, f2);
        ViewGroup.LayoutParams layoutParams2 = this.qt.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new ViewGroup.LayoutParams(iLr, iLr2);
        } else {
            layoutParams2.width = iLr;
            layoutParams2.height = iLr2;
        }
        this.qt.setLayoutParams(layoutParams2);
    }

    public void ri(boolean z) {
        this.f18162co = z;
    }
}
