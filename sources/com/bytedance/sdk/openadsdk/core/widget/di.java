package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.utils.qd;

/* JADX INFO: loaded from: classes2.dex */
public class di extends com.bytedance.sdk.openadsdk.core.di.ka {
    private int lr;
    private float ri;

    public di(Context context) {
        super(context);
        this.ri = 2.25f;
        this.lr = 12;
        ri();
    }

    public static com.bytedance.sdk.openadsdk.core.di.ka lr(Context context) {
        return new di(context, 28, 5.0f);
    }

    private void ri() {
        setBackground(ka.ri());
        setImageResource(uq.ka(getContext(), "tt_close_btn"));
        int iLr = qd.lr(getContext(), this.ri);
        setPadding(iLr, iLr, iLr, iLr);
        setScaleType(ImageView.ScaleType.FIT_XY);
    }

    @Override // com.bytedance.sdk.openadsdk.core.di.ka, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            int iLr = qd.lr(getContext(), this.lr);
            layoutParams.width = iLr;
            layoutParams.height = iLr;
        }
        super.setLayoutParams(layoutParams);
    }

    public di(Context context, int i, float f) {
        super(context);
        this.ri = f;
        this.lr = i;
        ri();
    }

    public static com.bytedance.sdk.openadsdk.core.di.ka ri(Context context) {
        return new di(context);
    }
}
