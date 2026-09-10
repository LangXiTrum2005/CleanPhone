package com.bytedance.sdk.component.adexpress.dynamic.lk;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.lc.DY;
import com.bytedance.sdk.component.adexpress.lc.HD;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lc extends kqm<com.bytedance.sdk.component.adexpress.lc.lc> {
    public lc(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs jXs, com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl eblVar, int i, int i2, int i3, JSONObject jSONObject) {
        super(context, jXs, eblVar);
        this.LD = context;
        this.ZU = eblVar;
        this.lk = jXs;
        Lxb(i, i2, i3, jSONObject, eblVar);
    }

    private void Lxb(int i, int i2, int i3, JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl eblVar) {
        int iOf;
        this.Lxb = new com.bytedance.sdk.component.adexpress.lc.lc(this.LD, i, i2, i3, jSONObject);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.LD, 300.0f));
        layoutParams.gravity = 81;
        Context context = this.LD;
        if (eblVar.Of() > 0) {
            iOf = eblVar.Of();
        } else {
            iOf = com.bytedance.sdk.component.adexpress.ZU.LD() ? 0 : 120;
        }
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(context, iOf);
        this.Lxb.setLayoutParams(layoutParams);
        this.Lxb.setClipChildren(false);
        this.Lxb.setSlideText(this.ZU.Ns());
        HD hd = this.Lxb;
        if (hd instanceof com.bytedance.sdk.component.adexpress.lc.lc) {
            ((com.bytedance.sdk.component.adexpress.lc.lc) hd).setShakeText(this.ZU.uxf());
            final DY shakeView = ((com.bytedance.sdk.component.adexpress.lc.lc) this.Lxb).getShakeView();
            if (shakeView != null) {
                shakeView.setOnShakeViewListener(new com.bytedance.sdk.component.adexpress.lc.tD.Lxb() { // from class: com.bytedance.sdk.component.adexpress.dynamic.lk.lc.1
                });
                shakeView.setOnClickListener((View.OnClickListener) this.lk.getDynamicClickListener());
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk.kqm
    public void ZU() {
    }
}
