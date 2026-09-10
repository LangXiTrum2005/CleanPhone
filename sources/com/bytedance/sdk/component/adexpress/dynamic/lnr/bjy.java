package com.bytedance.sdk.component.adexpress.dynamic.lnr;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class bjy implements wd<com.bytedance.sdk.component.adexpress.mo.exc> {
    private int jpc;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz lnr;
    private com.bytedance.sdk.component.adexpress.dynamic.mml.wd mml;
    private int mo;
    private String mzz;
    private com.bytedance.sdk.component.adexpress.mo.exc qdl;
    private JSONObject tvp;
    private Context ud;
    private int wd;

    public bjy(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz mzzVar, com.bytedance.sdk.component.adexpress.dynamic.mml.wd wdVar, String str, int i2, int i3, int i4, JSONObject jSONObject) {
        this.ud = context;
        this.lnr = mzzVar;
        this.mml = wdVar;
        this.mzz = str;
        this.mo = i2;
        this.wd = i3;
        this.jpc = i4;
        this.tvp = jSONObject;
        mzz();
    }

    private void mzz() {
        final com.bytedance.sdk.component.adexpress.dynamic.mo.qdl dynamicClickListener = this.lnr.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 1);
        } catch (Throwable unused) {
        }
        if ("16".equals(this.mzz)) {
            Context context = this.ud;
            com.bytedance.sdk.component.adexpress.mo.exc excVar = new com.bytedance.sdk.component.adexpress.mo.exc(context, com.bytedance.sdk.component.adexpress.lnr.qdl.jpc(context), this.mo, this.wd, this.jpc, this.tvp);
            this.qdl = excVar;
            if (excVar.getShakeLayout() != null) {
                this.qdl.getShakeLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
        } else {
            Context context2 = this.ud;
            this.qdl = new com.bytedance.sdk.component.adexpress.mo.exc(context2, com.bytedance.sdk.component.adexpress.lnr.qdl.wd(context2), this.mo, this.wd, this.jpc, this.tvp);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.qdl.setGravity(17);
        layoutParams.gravity = 17;
        this.qdl.setLayoutParams(layoutParams);
        this.qdl.setTranslationY(com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.ud, this.mml.zy()));
        this.qdl.setShakeText(this.mml.jjk());
        this.qdl.setClipChildren(false);
        this.qdl.setOnShakeViewListener(new com.bytedance.sdk.component.adexpress.mo.exc.qdl() { // from class: com.bytedance.sdk.component.adexpress.dynamic.lnr.bjy.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr.wd
    /* JADX INFO: renamed from: mml, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.mo.exc lnr() {
        return this.qdl;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr.wd
    public void qdl() {
        this.qdl.qdl();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lnr.wd
    public void ud() {
        this.qdl.clearAnimation();
    }
}
