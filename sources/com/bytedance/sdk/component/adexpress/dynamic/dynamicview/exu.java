package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class exu extends mo {
    public exu(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        super(context, dynamicRootView, jpcVar);
        TextView textView = new TextView(context);
        this.bjy = textView;
        textView.setTag(Integer.valueOf(getClickArea()));
        addView(this.bjy, getWidgetLayoutParams());
    }

    private boolean qdl() {
        if (com.bytedance.sdk.component.adexpress.mml.ud()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.fs.ud) && this.fs.ud.contains("adx:")) || com.bytedance.sdk.component.adexpress.dynamic.mzz.rq.ud();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mzz
    public void mo() {
        com.bytedance.sdk.component.adexpress.ud.exu renderRequest = this.rdp.getRenderRequest();
        if (renderRequest == null || !TextUtils.isEmpty(renderRequest.bqt())) {
            super.mo();
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.wd, this.jpc);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0080  */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mo, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hkc
    public boolean tvp() {
        com.bytedance.sdk.component.adexpress.ud.exu renderRequest;
        super.tvp();
        this.bjy.setTextAlignment(this.fs.jpc());
        ((TextView) this.bjy).setTextColor(this.fs.wd());
        ((TextView) this.bjy).setTextSize(this.fs.mzz());
        if (!com.bytedance.sdk.component.adexpress.mml.ud()) {
            if (!qdl()) {
                ((TextView) this.bjy).setText(com.bytedance.sdk.component.utils.ljh.ud(getContext(), "tt_logo_cn"));
                return true;
            }
            if (com.bytedance.sdk.component.adexpress.dynamic.mzz.rq.ud()) {
                ((TextView) this.bjy).setText(com.bytedance.sdk.component.adexpress.dynamic.mzz.rq.qdl());
                return true;
            }
            ((TextView) this.bjy).setText(com.bytedance.sdk.component.adexpress.dynamic.mzz.rq.qdl(this.fs.ud));
            return true;
        }
        int i2 = 0;
        ((TextView) this.bjy).setIncludeFontPadding(false);
        ((TextView) this.bjy).setTextSize(Math.min(((com.bytedance.sdk.component.adexpress.mml.wd.ud(com.bytedance.sdk.component.adexpress.mml.qdl(), this.jpc) - this.fs.ud()) - this.fs.qdl()) - 0.5f, this.fs.mzz()));
        DynamicRootView dynamicRootView = this.rdp;
        if (dynamicRootView == null || (renderRequest = dynamicRootView.getRenderRequest()) == null) {
            i2 = 8;
        } else {
            String strKoa = renderRequest.koa();
            if (TextUtils.isEmpty(strKoa)) {
                i2 = 8;
            } else {
                ((TextView) this.bjy).setText(strKoa);
            }
        }
        ((TextView) this.bjy).setVisibility(i2);
        return true;
    }
}
