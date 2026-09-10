package com.bytedance.sdk.component.adexpress.dynamic.lnr;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.mo.aaj;
import com.bytedance.sdk.component.adexpress.mo.oth;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class mo extends yt<com.bytedance.sdk.component.adexpress.mo.mo> {
    public mo(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz mzzVar, com.bytedance.sdk.component.adexpress.dynamic.mml.wd wdVar, int i2, int i3, int i4, JSONObject jSONObject) {
        super(context, mzzVar, wdVar);
        this.ud = context;
        this.mml = wdVar;
        this.lnr = mzzVar;
        qdl(i2, i3, i4, jSONObject, wdVar);
    }

    private void qdl(int i2, int i3, int i4, JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.mml.wd wdVar) {
        int iWak;
        this.qdl = new com.bytedance.sdk.component.adexpress.mo.mo(this.ud, i2, i3, i4, jSONObject);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.ud, 300.0f));
        layoutParams.gravity = 81;
        Context context = this.ud;
        if (wdVar.wak() > 0) {
            iWak = wdVar.wak();
        } else {
            iWak = com.bytedance.sdk.component.adexpress.mml.ud() ? 0 : 120;
        }
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(context, iWak);
        this.qdl.setLayoutParams(layoutParams);
        this.qdl.setClipChildren(false);
        this.qdl.setSlideText(this.mml.jjk());
        oth othVar = this.qdl;
        if (othVar instanceof com.bytedance.sdk.component.adexpress.mo.mo) {
            ((com.bytedance.sdk.component.adexpress.mo.mo) othVar).setShakeText(this.mml.taz());
            final aaj shakeView = ((com.bytedance.sdk.component.adexpress.mo.mo) this.qdl).getShakeView();
            if (shakeView != null) {
                shakeView.setOnShakeViewListener(new com.bytedance.sdk.component.adexpress.mo.exc.qdl() { // from class: com.bytedance.sdk.component.adexpress.dynamic.lnr.mo.1
                });
                shakeView.setOnClickListener((View.OnClickListener) this.lnr.getDynamicClickListener());
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr.yt
    public void mml() {
    }
}
