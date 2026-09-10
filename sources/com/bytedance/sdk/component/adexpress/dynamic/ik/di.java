package com.bytedance.sdk.component.adexpress.dynamic.ik;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.di.ihz;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class di extends bu<com.bytedance.sdk.component.adexpress.di.di> {
    public di(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi fiVar, com.bytedance.sdk.component.adexpress.dynamic.ka.xha xhaVar, int i, int i2, int i3, JSONObject jSONObject) {
        super(context, fiVar, xhaVar);
        this.lr = context;
        this.ka = xhaVar;
        this.ik = fiVar;
        ri(i, i2, i3, jSONObject, xhaVar);
    }

    private void ri(int i, int i2, int i3, JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.ka.xha xhaVar) {
        int iFe;
        this.ri = new com.bytedance.sdk.component.adexpress.di.di(this.lr, i, i2, i3, jSONObject);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.lr, 300.0f));
        layoutParams.gravity = 81;
        Context context = this.lr;
        if (xhaVar.fe() > 0) {
            iFe = xhaVar.fe();
        } else {
            iFe = com.bytedance.sdk.component.adexpress.ka.lr() ? 0 : 120;
        }
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(context, iFe);
        this.ri.setLayoutParams(layoutParams);
        this.ri.setClipChildren(false);
        this.ri.setSlideText(this.ka.whw());
        ihz ihzVar = this.ri;
        if (ihzVar instanceof com.bytedance.sdk.component.adexpress.di.di) {
            ((com.bytedance.sdk.component.adexpress.di.di) ihzVar).setShakeText(this.ka.rzk());
            final com.bytedance.sdk.component.adexpress.di.tan shakeView = ((com.bytedance.sdk.component.adexpress.di.di) this.ri).getShakeView();
            if (shakeView != null) {
                shakeView.setOnShakeViewListener(new com.bytedance.sdk.component.adexpress.di.nr.ri() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ik.di.1
                });
                shakeView.setOnClickListener((View.OnClickListener) this.ik.getDynamicClickListener());
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik.bu
    public void ka() {
    }
}
