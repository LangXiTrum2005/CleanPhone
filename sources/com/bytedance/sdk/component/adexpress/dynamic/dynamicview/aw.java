package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public class aw extends di {
    public aw(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        super(context, dynamicRootView, mjVar);
        TextView textView = new TextView(context);
        this.vr = textView;
        textView.setTag(Integer.valueOf(getClickArea()));
        addView(this.vr, getWidgetLayoutParams());
    }

    private boolean ri() {
        if (com.bytedance.sdk.component.adexpress.ka.lr()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.f18035co.lr) && this.f18035co.lr.contains("adx:")) || com.bytedance.sdk.component.adexpress.dynamic.fi.sf.lr();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fi
    public void di() {
        com.bytedance.sdk.component.adexpress.lr.aw renderRequest = this.bgr.getRenderRequest();
        if (renderRequest == null || !TextUtils.isEmpty(renderRequest.igq())) {
            super.di();
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.xha, this.mj);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0080  */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xd
    public boolean jbs() {
        com.bytedance.sdk.component.adexpress.lr.aw renderRequest;
        super.jbs();
        this.vr.setTextAlignment(this.f18035co.mj());
        ((TextView) this.vr).setTextColor(this.f18035co.xha());
        ((TextView) this.vr).setTextSize(this.f18035co.fi());
        if (!com.bytedance.sdk.component.adexpress.ka.lr()) {
            if (!ri()) {
                ((TextView) this.vr).setText(com.bytedance.sdk.component.utils.uq.lr(getContext(), "tt_logo_cn"));
                return true;
            }
            if (com.bytedance.sdk.component.adexpress.dynamic.fi.sf.lr()) {
                ((TextView) this.vr).setText(com.bytedance.sdk.component.adexpress.dynamic.fi.sf.ri());
                return true;
            }
            ((TextView) this.vr).setText(com.bytedance.sdk.component.adexpress.dynamic.fi.sf.ri(this.f18035co.lr));
            return true;
        }
        int i = 0;
        ((TextView) this.vr).setIncludeFontPadding(false);
        ((TextView) this.vr).setTextSize(Math.min(((com.bytedance.sdk.component.adexpress.ka.xha.lr(com.bytedance.sdk.component.adexpress.ka.ri(), this.mj) - this.f18035co.lr()) - this.f18035co.ri()) - 0.5f, this.f18035co.fi()));
        DynamicRootView dynamicRootView = this.bgr;
        if (dynamicRootView == null || (renderRequest = dynamicRootView.getRenderRequest()) == null) {
            i = 8;
        } else {
            String strZf = renderRequest.zf();
            if (TextUtils.isEmpty(strZf)) {
                i = 8;
            } else {
                ((TextView) this.vr).setText(strZf);
            }
        }
        ((TextView) this.vr).setVisibility(i);
        return true;
    }
}
