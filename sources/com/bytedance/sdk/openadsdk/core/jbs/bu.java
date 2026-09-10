package com.bytedance.sdk.openadsdk.core.jbs;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.utils.qd;

/* JADX INFO: loaded from: classes2.dex */
public class bu extends ri {
    private FrameLayout aw;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private ac f18124co;
    private FrameLayout ri;

    public bu(Context context) {
        super(context);
        this.lr = context;
    }

    private void ik() {
        com.bytedance.sdk.openadsdk.core.di.ik ikVar = new com.bytedance.sdk.openadsdk.core.di.ik(this.lr);
        this.ri = ikVar;
        addView(ikVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.di.ik ikVar2 = new com.bytedance.sdk.openadsdk.core.di.ik(this.lr);
        this.aw = ikVar2;
        this.ri.addView(ikVar2, new FrameLayout.LayoutParams(-1, -1));
        this.aw.removeAllViews();
    }

    private void lr() {
        this.xha = qd.lr(this.lr, this.f18124co.getExpectExpressWidth());
        this.mj = qd.lr(this.lr, this.f18124co.getExpectExpressWidth());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.xha, this.mj);
        }
        layoutParams.width = this.xha;
        layoutParams.height = this.mj;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        this.ik.jxw();
        ik();
    }

    public View getBackupContainerBackgroundView() {
        return this.ri;
    }

    public FrameLayout getVideoContainer() {
        return this.aw;
    }

    public void ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, ac acVar, ViewGroup viewGroup) {
        if (wjvVar == null) {
            return;
        }
        setBackgroundColor(-1);
        this.ik = wjvVar;
        this.f18124co = acVar;
        if (wjvVar.lji() == 7) {
            this.di = "rewarded_video";
        } else {
            this.di = "fullscreen_interstitial_ad";
        }
        lr();
        if (com.bytedance.sdk.openadsdk.core.model.ac.ik(wjvVar)) {
            this.f18124co.addView(this, new ViewGroup.LayoutParams(-1, -1));
        } else {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.f18124co.addView(this, layoutParams);
        }
        int i = com.bytedance.sdk.openadsdk.utils.slm.ar;
        View viewFindViewById = viewGroup.findViewById(i);
        if (viewFindViewById != null) {
            Object tag = viewFindViewById.getTag(i);
            if (tag instanceof String) {
                String str = (String) tag;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.ac.lr.lr().ri(str, viewFindViewById);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ri
    public void ri(View view, int i, com.bytedance.sdk.openadsdk.core.model.slm slmVar) {
        ac acVar = this.f18124co;
        if (acVar != null) {
            acVar.ri(view, i, slmVar);
        }
    }
}
