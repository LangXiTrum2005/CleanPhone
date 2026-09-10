package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public class xha extends di {
    public xha(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ka.mj mjVar) {
        super(context, dynamicRootView, mjVar);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.ri riVar = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.ri(context);
        this.vr = riVar;
        riVar.setTag(Integer.valueOf(getClickArea()));
        addView(this.vr, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        if (!com.bytedance.sdk.component.adexpress.ka.lr() || !"fillButton".equals(this.aw.qt().lr())) {
            return super.getWidgetLayoutParams();
        }
        ((TextView) this.vr).setEllipsize(TextUtils.TruncateAt.END);
        ((TextView) this.vr).setMaxLines(1);
        FrameLayout.LayoutParams widgetLayoutParams = super.getWidgetLayoutParams();
        widgetLayoutParams.width -= this.f18035co.nr() * 2;
        widgetLayoutParams.height -= this.f18035co.nr() * 2;
        widgetLayoutParams.topMargin += this.f18035co.nr();
        int iNr = widgetLayoutParams.leftMargin + this.f18035co.nr();
        widgetLayoutParams.leftMargin = iNr;
        widgetLayoutParams.setMarginStart(iNr);
        widgetLayoutParams.setMarginEnd(widgetLayoutParams.rightMargin);
        return widgetLayoutParams;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xd
    public boolean jbs() {
        super.jbs();
        if (TextUtils.equals("download-progress-button", this.aw.qt().lr()) && TextUtils.isEmpty(this.f18035co.qt())) {
            this.vr.setVisibility(4);
            return true;
        }
        this.vr.setTextAlignment(this.f18035co.mj());
        ((TextView) this.vr).setText(this.f18035co.qt());
        ((TextView) this.vr).setTextColor(this.f18035co.xha());
        ((TextView) this.vr).setTextSize(this.f18035co.fi());
        ((TextView) this.vr).setGravity(17);
        ((TextView) this.vr).setIncludeFontPadding(false);
        if ("fillButton".equals(this.aw.qt().lr())) {
            this.vr.setPadding(0, 0, 0, 0);
        } else {
            this.vr.setPadding(this.f18035co.ik(), this.f18035co.lr(), this.f18035co.ka(), this.f18035co.ri());
        }
        return true;
    }
}
