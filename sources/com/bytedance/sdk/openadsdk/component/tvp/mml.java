package com.bytedance.sdk.openadsdk.component.tvp;

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
import androidx.media3.extractor.text.ttml.a;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.jtx;
import com.bytedance.sdk.openadsdk.core.widget.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.rq;

/* JADX INFO: loaded from: classes3.dex */
public class mml extends lnr {
    private final com.bytedance.sdk.openadsdk.core.mo.jpc bjy;
    private final com.bytedance.sdk.openadsdk.core.mo.lnr exu;
    private final com.bytedance.sdk.openadsdk.core.mo.mml jtx;
    private final jtx rdp;
    private final com.bytedance.sdk.openadsdk.core.mo.mzz yt;

    public static final class qdl extends Drawable {
        private final boolean mml;
        private static final int mzz = Color.parseColor("#b0000000");
        private static final int mo = Color.parseColor("#40000000");
        private final RectF qdl = new RectF();
        private final Paint ud = new Paint();
        private final Path lnr = new Path();

        public qdl(Context context) {
            this.mml = com.bytedance.sdk.component.adexpress.mml.ud.qdl(context);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            canvas.drawPath(this.lnr, this.ud);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void onBoundsChange(Rect rect) {
            float[] fArr;
            super.onBoundsChange(rect);
            this.qdl.set(rect);
            this.lnr.reset();
            int iHeight = rect.height() / 2;
            Path path = this.lnr;
            RectF rectF = this.qdl;
            if (this.mml) {
                float f = iHeight;
                fArr = new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f};
            } else {
                float f2 = iHeight;
                fArr = new float[]{0.0f, 0.0f, f2, f2, f2, f2, 0.0f, 0.0f};
            }
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            float f3 = rect.right;
            boolean z2 = this.mml;
            this.ud.setShader(new LinearGradient(0.0f, 0.0f, f3, 0.0f, new int[]{z2 ? mo : mzz, z2 ? mzz : mo}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i2) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public mml(Context context, ljh ljhVar) {
        super(context);
        setId(520093753);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(0);
        int iUd = ax.ud(context, 8.0f);
        int iUd2 = ax.ud(context, 9.0f);
        int iUd3 = ax.ud(context, 10.0f);
        int iUd4 = ax.ud(context, 40.0f);
        com.bytedance.sdk.openadsdk.core.widget.lnr lnrVar = new com.bytedance.sdk.openadsdk.core.widget.lnr(context);
        this.fs = lnrVar;
        lnrVar.setPadding(iUd2, 0, iUd2, 0);
        this.fs.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ax.ud(context, 32.0f), ax.ud(context, 14.0f));
        layoutParams.addRule(12);
        layoutParams.addRule(11);
        layoutParams.setMargins(0, 0, iUd3, iUd3);
        this.fs.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar2 = new com.bytedance.sdk.openadsdk.core.mo.lnr(context);
        this.exu = lnrVar2;
        lnrVar2.setBackgroundColor(-1);
        lnrVar2.setId(520093758);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, ax.ud(context, 107.0f));
        layoutParams2.addRule(12);
        lnrVar2.setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        mzzVar.setOrientation(0);
        mzzVar.setGravity(16);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        mzzVar.setLayoutParams(layoutParams3);
        lnrVar2.addView(mzzVar);
        yt ytVar = new yt(context);
        this.mo = ytVar;
        ytVar.setId(520093759);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(iUd4, iUd4);
        layoutParams4.rightMargin = iUd;
        layoutParams4.setMarginEnd(iUd);
        this.mo.setLayoutParams(layoutParams4);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        this.wd = jpcVar;
        jpcVar.setId(520093761);
        this.wd.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar2 = this.wd;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        jpcVar2.setEllipsize(truncateAt);
        this.wd.setMaxLines(2);
        this.wd.setTextColor(Color.parseColor("#161823"));
        this.wd.setTextSize(30.0f);
        mzzVar.addView(this.mo);
        mzzVar.addView(this.wd);
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar3 = new com.bytedance.sdk.openadsdk.core.mo.lnr(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams5.addRule(2, lnrVar2.getId());
        layoutParams5.addRule(10);
        lnrVar3.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar = new com.bytedance.sdk.openadsdk.core.mo.mml(context);
        this.qdl = mmlVar;
        mmlVar.setId(520093754);
        this.qdl.setScaleType(ImageView.ScaleType.CENTER_CROP);
        lnrVar3.addView(this.qdl, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar4 = new com.bytedance.sdk.openadsdk.core.mo.lnr(context);
        this.ud = lnrVar4;
        lnrVar4.setId(520093755);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams6.gravity = 17;
        lnrVar3.addView(this.ud, layoutParams6);
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar2 = new com.bytedance.sdk.openadsdk.core.mo.mml(context);
        this.lnr = mmlVar2;
        mmlVar2.setId(520093756);
        lnrVar3.addView(this.lnr, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar3 = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        this.mzz = jpcVar3;
        jpcVar3.setId(520093717);
        this.mzz.setBackground(rq.qdl(context, Color.parseColor("#b3000000"), 24));
        this.mzz.setEllipsize(truncateAt);
        this.mzz.setGravity(17);
        this.mzz.setSingleLine(true);
        this.mzz.setText(com.bytedance.sdk.component.utils.ljh.qdl(context, "tt_video_download_apk"));
        this.mzz.setTextColor(-1);
        this.mzz.setTextSize(1, 16.0f);
        this.mzz.setTag("open_ad_click_button_tag");
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(ax.ud(context, 236.0f), ax.ud(context, 48.0f));
        layoutParams7.gravity = 81;
        layoutParams7.bottomMargin = ax.ud(context, 32.0f);
        lnrVar3.addView(this.mzz, layoutParams7);
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar2 = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        this.yt = mzzVar2;
        mzzVar2.setOrientation(0);
        mzzVar2.setGravity(16);
        mzzVar2.setBackground(new qdl(context));
        mzzVar2.setPadding(ax.ud(context, 16.0f), ax.ud(context, 8.0f), ax.ud(context, 16.0f), ax.ud(context, 8.0f));
        RelativeLayout.LayoutParams layoutParamsF = a.f(-2, -2, 10);
        layoutParamsF.topMargin = ax.ud(context, 90.0f);
        mzzVar2.setLayoutParams(layoutParamsF);
        yt ytVar2 = new yt(context);
        this.jtx = ytVar2;
        mzzVar2.addView(ytVar2, new LinearLayout.LayoutParams(ax.ud(context, 36.0f), ax.ud(context, 36.0f)));
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar3 = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        mzzVar3.setOrientation(1);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams8.leftMargin = ax.ud(context, 8.0f);
        mzzVar2.addView(mzzVar3, layoutParams8);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar4 = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        this.bjy = jpcVar4;
        jpcVar4.setTextColor(-1);
        mzzVar3.addView(jpcVar4, new LinearLayout.LayoutParams(-2, -2));
        jtx jtxVar = new jtx(context, true);
        this.rdp = jtxVar;
        mzzVar3.addView(jtxVar, new LinearLayout.LayoutParams(-2, -2));
        PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(context, ljhVar);
        this.mml = pAGLogoViewCreatePAGLogoViewByMaterial;
        pAGLogoViewCreatePAGLogoViewByMaterial.setId(520093757);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, ax.ud(context, 14.0f));
        layoutParams9.gravity = 83;
        lnrVar3.addView(this.mml, layoutParams9);
        addView(lnrVar3);
        addView(this.fs);
        addView(lnrVar2);
        addView(this.jpc);
        addView(mzzVar2);
    }

    @Override // com.bytedance.sdk.openadsdk.component.tvp.lnr
    public com.bytedance.sdk.openadsdk.core.mo.mml getAdIconView() {
        return this.jtx;
    }

    @Override // com.bytedance.sdk.openadsdk.component.tvp.lnr
    public com.bytedance.sdk.openadsdk.core.mo.jpc getAdTitleTextView() {
        return this.bjy;
    }

    @Override // com.bytedance.sdk.openadsdk.component.tvp.lnr
    public com.bytedance.sdk.openadsdk.core.mo.mzz getOverlayLayout() {
        return this.yt;
    }

    @Override // com.bytedance.sdk.openadsdk.component.tvp.lnr
    public jtx getScoreBar() {
        return this.rdp;
    }

    @Override // com.bytedance.sdk.openadsdk.component.tvp.lnr
    public View getUserInfo() {
        return this.exu;
    }
}
