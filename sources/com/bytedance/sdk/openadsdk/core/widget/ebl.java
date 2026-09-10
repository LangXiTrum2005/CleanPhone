package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class ebl extends com.bytedance.sdk.openadsdk.core.JXs.ZU {
    private int LD;
    private float Lxb;

    public ebl(Context context) {
        super(context);
        this.Lxb = 2.25f;
        this.LD = 12;
        Lxb();
    }

    public static com.bytedance.sdk.openadsdk.core.JXs.ZU LD(Context context) {
        return new ebl(context, 28, 5.0f);
    }

    private void Lxb() {
        setBackground(ZU.Lxb());
        setImageResource(com.bytedance.sdk.component.utils.tD.ZU(getContext(), "tt_close_btn"));
        int iLk = le.lk(getContext(), this.Lxb);
        setPadding(iLk, iLk, iLk, iLk);
        setScaleType(ImageView.ScaleType.FIT_XY);
    }

    @Override // com.bytedance.sdk.openadsdk.core.JXs.ZU, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            int iLk = le.lk(getContext(), this.LD);
            layoutParams.width = iLk;
            layoutParams.height = iLk;
        }
        super.setLayoutParams(layoutParams);
    }

    public ebl(Context context, int i, float f) {
        super(context);
        this.Lxb = f;
        this.LD = i;
        Lxb();
    }

    public static com.bytedance.sdk.openadsdk.core.JXs.ZU Lxb(Context context) {
        return new ebl(context);
    }
}
