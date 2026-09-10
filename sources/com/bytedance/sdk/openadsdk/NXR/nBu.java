package com.bytedance.sdk.openadsdk.NXR;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.tD;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.kqm;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nBu extends com.bytedance.sdk.openadsdk.core.JXs.lk {
    protected com.bytedance.sdk.openadsdk.core.JXs.OY JXs;
    protected com.bytedance.sdk.openadsdk.core.JXs.ZU LD;
    protected com.bytedance.sdk.openadsdk.core.JXs.lk Lxb;
    protected com.bytedance.sdk.openadsdk.core.JXs.OY ZU;
    protected com.bytedance.sdk.openadsdk.core.JXs.OY lc;
    protected kqm lk;

    public nBu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Lxb(context);
    }

    public com.bytedance.sdk.openadsdk.core.JXs.lk JXs(Context context) {
        return new com.bytedance.sdk.openadsdk.core.JXs.lk(context);
    }

    public com.bytedance.sdk.openadsdk.core.JXs.OY LD(Context context) {
        com.bytedance.sdk.openadsdk.core.JXs.OY oy = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        oy.setEllipsize(TextUtils.TruncateAt.END);
        oy.setMaxLines(1);
        oy.setTextColor(Color.parseColor("#FF999999"));
        oy.setTextSize(2, 16.0f);
        return oy;
    }

    public abstract void Lxb(Context context);

    public PAGLogoView OY(Context context) {
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        pAGLogoView.setId(520093739);
        return pAGLogoView;
    }

    public com.bytedance.sdk.openadsdk.core.JXs.OY ZU(Context context) {
        com.bytedance.sdk.openadsdk.core.JXs.OY oy = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        oy.setBackground(com.bytedance.sdk.openadsdk.utils.QAg.Lxb(context, "tt_backup_btn_1"));
        oy.setGravity(17);
        oy.setText(tD.Lxb(context, "tt_video_download_apk"));
        oy.setTextColor(-1);
        oy.setTextSize(2, 14.0f);
        return oy;
    }

    public kqm ebl(Context context) {
        kqm kqmVar = new kqm(context);
        kqmVar.setScaleType(ImageView.ScaleType.FIT_XY);
        kqmVar.setBackgroundColor(0);
        return kqmVar;
    }

    public FrameLayout getTtAdContainer() {
        return this.Lxb;
    }

    public TextView getTtFullAdAppName() {
        return this.ZU;
    }

    public TextView getTtFullAdDesc() {
        return this.JXs;
    }

    public TextView getTtFullAdDownload() {
        return this.lc;
    }

    public kqm getTtFullAdIcon() {
        return this.lk;
    }

    public ImageView getTtFullImg() {
        return this.LD;
    }

    public com.bytedance.sdk.openadsdk.core.JXs.ZU lc(Context context) {
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu = new com.bytedance.sdk.openadsdk.core.JXs.ZU(context);
        zu.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return zu;
    }

    public com.bytedance.sdk.openadsdk.core.JXs.OY lk(Context context) {
        com.bytedance.sdk.openadsdk.core.JXs.OY oy = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        oy.setEllipsize(TextUtils.TruncateAt.END);
        oy.setMaxLines(1);
        oy.setSingleLine();
        oy.setTextColor(Color.parseColor("#FF999999"));
        oy.setTextSize(2, 12.0f);
        return oy;
    }
}
