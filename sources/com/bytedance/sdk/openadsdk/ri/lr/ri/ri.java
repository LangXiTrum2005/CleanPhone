package com.bytedance.sdk.openadsdk.ri.lr.ri;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.jbs.ac;
import com.bytedance.sdk.openadsdk.core.model.slm;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends com.bytedance.sdk.openadsdk.core.jbs.ri {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.ri.lr.ri f18163co;
    private ac ri;

    public ri(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ri
    public void ri(View view, int i, slm slmVar) {
        ac acVar = this.ri;
        if (acVar != null) {
            acVar.ri(view, i, slmVar);
        }
    }

    public void setExtraFuncationHelper(com.bytedance.sdk.openadsdk.ri.lr.ri riVar) {
        this.f18163co = riVar;
    }

    public void ri(ac acVar) {
        this.ri = acVar;
        acVar.addView(this, new FrameLayout.LayoutParams(-1, -1));
    }
}
