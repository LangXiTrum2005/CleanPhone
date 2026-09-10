package com.bytedance.sdk.openadsdk.core.co.lr.lr;

import android.content.Context;
import com.bytedance.adsdk.lr.di;
import com.bytedance.adsdk.ugeno.ka;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends di {
    private ka ri;

    public lr(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.lr.di, android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ka kaVar = this.ri;
        if (kaVar != null) {
            kaVar.xha();
        }
    }

    @Override // com.bytedance.adsdk.lr.di, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ka kaVar = this.ri;
        if (kaVar != null) {
            kaVar.mj();
        }
    }

    public void ri(ka kaVar) {
        this.ri = kaVar;
    }
}
