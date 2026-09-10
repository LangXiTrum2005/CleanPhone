package com.bytedance.sdk.component.adexpress.dynamic.lk;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class IeN implements ebl<com.bytedance.sdk.component.adexpress.lc.tD> {
    private String JXs;
    private Context LD;
    private com.bytedance.sdk.component.adexpress.lc.tD Lxb;
    private int OY;
    private JSONObject QAg;
    private com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl ZU;
    private int ebl;
    private int lc;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs lk;

    public IeN(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs jXs, com.bytedance.sdk.component.adexpress.dynamic.ZU.ebl eblVar, String str, int i, int i2, int i3, JSONObject jSONObject) {
        this.LD = context;
        this.lk = jXs;
        this.ZU = eblVar;
        this.JXs = str;
        this.lc = i;
        this.ebl = i2;
        this.OY = i3;
        this.QAg = jSONObject;
        JXs();
    }

    private void JXs() {
        final com.bytedance.sdk.component.adexpress.dynamic.lc.Lxb dynamicClickListener = this.lk.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 1);
        } catch (Throwable unused) {
        }
        if ("16".equals(this.JXs)) {
            Context context = this.LD;
            com.bytedance.sdk.component.adexpress.lc.tD tDVar = new com.bytedance.sdk.component.adexpress.lc.tD(context, com.bytedance.sdk.component.adexpress.lk.Lxb.OY(context), this.lc, this.ebl, this.OY, this.QAg);
            this.Lxb = tDVar;
            if (tDVar.getShakeLayout() != null) {
                this.Lxb.getShakeLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
        } else {
            Context context2 = this.LD;
            this.Lxb = new com.bytedance.sdk.component.adexpress.lc.tD(context2, com.bytedance.sdk.component.adexpress.lk.Lxb.ebl(context2), this.lc, this.ebl, this.OY, this.QAg);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.Lxb.setGravity(17);
        layoutParams.gravity = 17;
        this.Lxb.setLayoutParams(layoutParams);
        this.Lxb.setTranslationY(com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.LD, this.ZU.bG()));
        this.Lxb.setShakeText(this.ZU.Ns());
        this.Lxb.setClipChildren(false);
        this.Lxb.setOnShakeViewListener(new com.bytedance.sdk.component.adexpress.lc.tD.Lxb() { // from class: com.bytedance.sdk.component.adexpress.dynamic.lk.IeN.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk.ebl
    public void LD() {
        this.Lxb.clearAnimation();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk.ebl
    public void Lxb() {
        this.Lxb.Lxb();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lk.ebl
    /* JADX INFO: renamed from: ZU, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.lc.tD lk() {
        return this.Lxb;
    }
}
