package com.bytedance.sdk.component.adexpress.dynamic.ik;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class vr implements xha<com.bytedance.sdk.component.adexpress.di.nr> {
    private int di;
    private String fi;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi ik;
    private JSONObject jbs;
    private com.bytedance.sdk.component.adexpress.dynamic.ka.xha ka;
    private Context lr;
    private int mj;
    private com.bytedance.sdk.component.adexpress.di.nr ri;
    private int xha;

    public vr(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi fiVar, com.bytedance.sdk.component.adexpress.dynamic.ka.xha xhaVar, String str, int i, int i2, int i3, JSONObject jSONObject) {
        this.lr = context;
        this.ik = fiVar;
        this.ka = xhaVar;
        this.fi = str;
        this.di = i;
        this.xha = i2;
        this.mj = i3;
        this.jbs = jSONObject;
        fi();
    }

    private void fi() {
        final com.bytedance.sdk.component.adexpress.dynamic.di.ri dynamicClickListener = this.ik.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 1);
        } catch (Throwable unused) {
        }
        if ("16".equals(this.fi)) {
            Context context = this.lr;
            com.bytedance.sdk.component.adexpress.di.nr nrVar = new com.bytedance.sdk.component.adexpress.di.nr(context, com.bytedance.sdk.component.adexpress.ik.ri.mj(context), this.di, this.xha, this.mj, this.jbs);
            this.ri = nrVar;
            if (nrVar.getShakeLayout() != null) {
                this.ri.getShakeLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
        } else {
            Context context2 = this.lr;
            this.ri = new com.bytedance.sdk.component.adexpress.di.nr(context2, com.bytedance.sdk.component.adexpress.ik.ri.xha(context2), this.di, this.xha, this.mj, this.jbs);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.ri.setGravity(17);
        layoutParams.gravity = 17;
        this.ri.setLayoutParams(layoutParams);
        this.ri.setTranslationY(com.bytedance.sdk.component.adexpress.ka.xha.ri(this.lr, this.ka.yjm()));
        this.ri.setShakeText(this.ka.whw());
        this.ri.setClipChildren(false);
        this.ri.setOnShakeViewListener(new com.bytedance.sdk.component.adexpress.di.nr.ri() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ik.vr.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik.xha
    /* JADX INFO: renamed from: ka, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.di.nr ik() {
        return this.ri;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik.xha
    public void lr() {
        this.ri.clearAnimation();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ik.xha
    public void ri() {
        this.ri.ri();
    }
}
