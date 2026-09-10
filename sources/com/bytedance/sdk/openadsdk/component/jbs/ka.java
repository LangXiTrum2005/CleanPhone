package com.bytedance.sdk.openadsdk.component.jbs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.bu;
import com.bytedance.sdk.openadsdk.core.widget.slm;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.bytedance.sdk.openadsdk.utils.sf;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class ka extends ik {
    private final com.bytedance.sdk.openadsdk.core.di.ik aw;
    private final slm bgr;
    private final com.bytedance.sdk.openadsdk.core.di.fi bu;
    private final com.bytedance.sdk.openadsdk.core.di.ka slm;
    private final com.bytedance.sdk.openadsdk.core.di.mj vr;

    public ka(Context context, wjv wjvVar) {
        super(context);
        setId(520093753);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(0);
        int iLr = qd.lr(context, 8.0f);
        int iLr2 = qd.lr(context, 9.0f);
        int iLr3 = qd.lr(context, 10.0f);
        int iLr4 = qd.lr(context, 40.0f);
        com.bytedance.sdk.openadsdk.core.widget.ik ikVar = new com.bytedance.sdk.openadsdk.core.widget.ik(context);
        this.f18092co = ikVar;
        ikVar.setPadding(iLr2, 0, iLr2, 0);
        this.f18092co.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(qd.lr(context, 32.0f), qd.lr(context, 14.0f));
        layoutParams.addRule(12);
        layoutParams.addRule(11);
        layoutParams.setMargins(0, 0, iLr3, iLr3);
        this.f18092co.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.di.ik ikVar2 = new com.bytedance.sdk.openadsdk.core.di.ik(context);
        this.aw = ikVar2;
        ikVar2.setBackgroundColor(-1);
        ikVar2.setId(520093758);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, qd.lr(context, 107.0f));
        layoutParams2.addRule(12);
        ikVar2.setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.di.fi fiVar = new com.bytedance.sdk.openadsdk.core.di.fi(context);
        fiVar.setOrientation(0);
        fiVar.setGravity(16);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        fiVar.setLayoutParams(layoutParams3);
        ikVar2.addView(fiVar);
        bu buVar = new bu(context);
        this.di = buVar;
        buVar.setId(520093759);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(iLr4, iLr4);
        layoutParams4.rightMargin = iLr;
        layoutParams4.setMarginEnd(iLr);
        this.di.setLayoutParams(layoutParams4);
        com.bytedance.sdk.openadsdk.core.di.mj mjVar = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        this.xha = mjVar;
        mjVar.setId(520093761);
        this.xha.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.di.mj mjVar2 = this.xha;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        mjVar2.setEllipsize(truncateAt);
        this.xha.setMaxLines(2);
        this.xha.setTextColor(Color.parseColor("#161823"));
        this.xha.setTextSize(30.0f);
        fiVar.addView(this.di);
        fiVar.addView(this.xha);
        com.bytedance.sdk.openadsdk.core.di.ik ikVar3 = new com.bytedance.sdk.openadsdk.core.di.ik(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams5.addRule(2, ikVar2.getId());
        layoutParams5.addRule(10);
        ikVar3.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.di.ka kaVar = new com.bytedance.sdk.openadsdk.core.di.ka(context);
        this.ri = kaVar;
        kaVar.setId(520093754);
        this.ri.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ikVar3.addView(this.ri, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.di.ik ikVar4 = new com.bytedance.sdk.openadsdk.core.di.ik(context);
        this.lr = ikVar4;
        ikVar4.setId(520093755);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams6.gravity = 17;
        ikVar3.addView(this.lr, layoutParams6);
        com.bytedance.sdk.openadsdk.core.di.ka kaVar2 = new com.bytedance.sdk.openadsdk.core.di.ka(context);
        this.ik = kaVar2;
        kaVar2.setId(520093756);
        ikVar3.addView(this.ik, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.di.mj mjVar3 = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        this.fi = mjVar3;
        mjVar3.setId(520093717);
        this.fi.setBackground(sf.ri(context, Color.parseColor("#b3000000"), 24));
        this.fi.setEllipsize(truncateAt);
        this.fi.setGravity(17);
        this.fi.setSingleLine(true);
        this.fi.setText(uq.ri(context, "tt_video_download_apk"));
        this.fi.setTextColor(-1);
        this.fi.setTextSize(1, 16.0f);
        this.fi.setTag("open_ad_click_button_tag");
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(qd.lr(context, 236.0f), qd.lr(context, 48.0f));
        layoutParams7.gravity = 81;
        layoutParams7.bottomMargin = qd.lr(context, 32.0f);
        ikVar3.addView(this.fi, layoutParams7);
        com.bytedance.sdk.openadsdk.core.di.fi fiVar2 = new com.bytedance.sdk.openadsdk.core.di.fi(context);
        this.bu = fiVar2;
        fiVar2.setOrientation(0);
        fiVar2.setGravity(16);
        fiVar2.setBackground(new ri(context));
        fiVar2.setPadding(qd.lr(context, 16.0f), qd.lr(context, 8.0f), qd.lr(context, 16.0f), qd.lr(context, 8.0f));
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(10);
        layoutParams8.topMargin = qd.lr(context, 90.0f);
        fiVar2.setLayoutParams(layoutParams8);
        bu buVar2 = new bu(context);
        this.slm = buVar2;
        fiVar2.addView(buVar2, new LinearLayout.LayoutParams(qd.lr(context, 36.0f), qd.lr(context, 36.0f)));
        com.bytedance.sdk.openadsdk.core.di.fi fiVar3 = new com.bytedance.sdk.openadsdk.core.di.fi(context);
        fiVar3.setOrientation(1);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams9.leftMargin = qd.lr(context, 8.0f);
        fiVar2.addView(fiVar3, layoutParams9);
        com.bytedance.sdk.openadsdk.core.di.mj mjVar4 = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        this.vr = mjVar4;
        mjVar4.setTextColor(-1);
        fiVar3.addView(mjVar4, new LinearLayout.LayoutParams(-2, -2));
        slm slmVar = new slm(context, true);
        this.bgr = slmVar;
        fiVar3.addView(slmVar, new LinearLayout.LayoutParams(-2, -2));
        PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(context, wjvVar);
        this.ka = pAGLogoViewCreatePAGLogoViewByMaterial;
        pAGLogoViewCreatePAGLogoViewByMaterial.setId(520093757);
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-2, qd.lr(context, 14.0f));
        layoutParams10.gravity = 83;
        ikVar3.addView(this.ka, layoutParams10);
        addView(ikVar3);
        addView(this.f18092co);
        addView(ikVar2);
        addView(this.mj);
        addView(fiVar2);
    }

    @Override // com.bytedance.sdk.openadsdk.component.jbs.ik
    public com.bytedance.sdk.openadsdk.core.di.ka getAdIconView() {
        return this.slm;
    }

    @Override // com.bytedance.sdk.openadsdk.component.jbs.ik
    public com.bytedance.sdk.openadsdk.core.di.mj getAdTitleTextView() {
        return this.vr;
    }

    @Override // com.bytedance.sdk.openadsdk.component.jbs.ik
    public com.bytedance.sdk.openadsdk.core.di.fi getOverlayLayout() {
        return this.bu;
    }

    @Override // com.bytedance.sdk.openadsdk.component.jbs.ik
    public slm getScoreBar() {
        return this.bgr;
    }

    @Override // com.bytedance.sdk.openadsdk.component.jbs.ik
    public View getUserInfo() {
        return this.aw;
    }

    public static final class ri extends Drawable {
        private final boolean ka;
        private static final int fi = Color.parseColor("#b0000000");
        private static final int di = Color.parseColor("#40000000");
        private final RectF ri = new RectF();
        private final Paint lr = new Paint();
        private final Path ik = new Path();

        public ri(Context context) {
            this.ka = com.bytedance.sdk.component.adexpress.ka.lr.ri(context);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            canvas.drawPath(this.ik, this.lr);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void onBoundsChange(Rect rect) {
            float[] fArr;
            super.onBoundsChange(rect);
            this.ri.set(rect);
            this.ik.reset();
            int iHeight = rect.height() / 2;
            Path path = this.ik;
            RectF rectF = this.ri;
            if (this.ka) {
                float f = iHeight;
                fArr = new float[]{f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f};
            } else {
                float f2 = iHeight;
                fArr = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f2, f2, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
            }
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            float f3 = rect.right;
            boolean z = this.ka;
            this.lr.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new int[]{z ? di : fi, z ? fi : di}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
