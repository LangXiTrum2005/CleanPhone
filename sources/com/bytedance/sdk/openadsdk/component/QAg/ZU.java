package com.bytedance.sdk.openadsdk.component.QAg;

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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.tD;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.VVE;
import com.bytedance.sdk.openadsdk.core.widget.kqm;
import com.bytedance.sdk.openadsdk.utils.QAg;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class ZU extends lk {
    private final com.bytedance.sdk.openadsdk.core.JXs.OY IeN;
    private final com.bytedance.sdk.openadsdk.core.JXs.lk NXR;
    private final VVE STP;
    private final com.bytedance.sdk.openadsdk.core.JXs.ZU VVE;
    private final com.bytedance.sdk.openadsdk.core.JXs.JXs kqm;

    public static final class Lxb extends Drawable {
        private static final int JXs = Color.parseColor("#b0000000");
        private static final int lc = Color.parseColor("#40000000");
        private final boolean ZU;
        private final RectF Lxb = new RectF();
        private final Paint LD = new Paint();
        private final Path lk = new Path();

        public Lxb(Context context) {
            this.ZU = com.bytedance.sdk.component.adexpress.ZU.LD.Lxb(context);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
            canvas.drawPath(this.lk, this.LD);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void onBoundsChange(@NonNull Rect rect) {
            super.onBoundsChange(rect);
            this.Lxb.set(rect);
            this.lk.reset();
            int iHeight = rect.height() / 2;
            Path path = this.lk;
            RectF rectF = this.Lxb;
            float f = iHeight;
            float[] fArr = new float[8];
            if (this.ZU) {
                fArr[0] = f;
                fArr[1] = f;
                fArr[2] = 0.0f;
                fArr[3] = 0.0f;
                fArr[4] = 0.0f;
                fArr[5] = 0.0f;
                fArr[6] = f;
                fArr[7] = f;
            } else {
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = f;
                fArr[3] = f;
                fArr[4] = f;
                fArr[5] = f;
                fArr[6] = 0.0f;
                fArr[7] = 0.0f;
            }
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            float f2 = rect.right;
            int[] iArr = new int[2];
            boolean z = this.ZU;
            iArr[0] = z ? lc : JXs;
            iArr[1] = z ? JXs : lc;
            this.LD.setShader(new LinearGradient(0.0f, 0.0f, f2, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@Nullable ColorFilter colorFilter) {
        }
    }

    public ZU(Context context) {
        super(context);
        setId(520093753);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(0);
        int iLk = le.lk(context, 8.0f);
        int iLk2 = le.lk(context, 9.0f);
        int iLk3 = le.lk(context, 10.0f);
        int iLk4 = le.lk(context, 40.0f);
        com.bytedance.sdk.openadsdk.core.widget.lk lkVar = new com.bytedance.sdk.openadsdk.core.widget.lk(context);
        this.sLN = lkVar;
        lkVar.setPadding(iLk2, 0, iLk2, 0);
        this.sLN.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(le.lk(context, 32.0f), le.lk(context, 14.0f));
        layoutParams.addRule(12);
        layoutParams.addRule(11);
        layoutParams.setMargins(0, 0, iLk3, iLk3);
        this.sLN.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.JXs.lk lkVar2 = new com.bytedance.sdk.openadsdk.core.JXs.lk(context);
        this.NXR = lkVar2;
        lkVar2.setBackgroundColor(-1);
        lkVar2.setId(520093758);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, le.lk(context, 107.0f));
        layoutParams2.addRule(12);
        lkVar2.setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        jXs.setOrientation(0);
        jXs.setGravity(16);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        jXs.setLayoutParams(layoutParams3);
        lkVar2.addView(jXs);
        kqm kqmVar = new kqm(context);
        this.lc = kqmVar;
        kqmVar.setId(520093759);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(iLk4, iLk4);
        layoutParams4.rightMargin = iLk;
        layoutParams4.setMarginEnd(iLk);
        this.lc.setLayoutParams(layoutParams4);
        com.bytedance.sdk.openadsdk.core.JXs.OY oy = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        this.ebl = oy;
        oy.setId(520093761);
        this.ebl.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.JXs.OY oy2 = this.ebl;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        oy2.setEllipsize(truncateAt);
        this.ebl.setMaxLines(2);
        this.ebl.setTextColor(Color.parseColor("#161823"));
        this.ebl.setTextSize(30.0f);
        jXs.addView(this.lc);
        jXs.addView(this.ebl);
        com.bytedance.sdk.openadsdk.core.JXs.lk lkVar3 = new com.bytedance.sdk.openadsdk.core.JXs.lk(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams5.addRule(2, lkVar2.getId());
        layoutParams5.addRule(10);
        lkVar3.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu = new com.bytedance.sdk.openadsdk.core.JXs.ZU(context);
        this.Lxb = zu;
        zu.setId(520093754);
        this.Lxb.setScaleType(ImageView.ScaleType.CENTER_CROP);
        lkVar3.addView(this.Lxb, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.JXs.lk lkVar4 = new com.bytedance.sdk.openadsdk.core.JXs.lk(context);
        this.LD = lkVar4;
        lkVar4.setId(520093755);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams6.gravity = 17;
        lkVar3.addView(this.LD, layoutParams6);
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu2 = new com.bytedance.sdk.openadsdk.core.JXs.ZU(context);
        this.lk = zu2;
        zu2.setId(520093756);
        lkVar3.addView(this.lk, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.JXs.OY oy3 = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        this.JXs = oy3;
        oy3.setId(520093717);
        this.JXs.setBackground(QAg.Lxb(context, Color.parseColor("#b3000000"), 24));
        this.JXs.setEllipsize(truncateAt);
        this.JXs.setGravity(17);
        this.JXs.setSingleLine(true);
        this.JXs.setText(tD.Lxb(context, "tt_video_download_apk"));
        this.JXs.setTextColor(-1);
        this.JXs.setTextSize(1, 16.0f);
        this.JXs.setTag("open_ad_click_button_tag");
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(le.lk(context, 236.0f), le.lk(context, 48.0f));
        layoutParams7.gravity = 81;
        layoutParams7.bottomMargin = le.lk(context, 32.0f);
        lkVar3.addView(this.JXs, layoutParams7);
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs2 = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        this.kqm = jXs2;
        jXs2.setOrientation(0);
        jXs2.setGravity(16);
        jXs2.setBackground(new Lxb(context));
        jXs2.setPadding(le.lk(context, 16.0f), le.lk(context, 8.0f), le.lk(context, 16.0f), le.lk(context, 8.0f));
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(10);
        layoutParams8.topMargin = le.lk(context, 90.0f);
        jXs2.setLayoutParams(layoutParams8);
        kqm kqmVar2 = new kqm(context);
        this.VVE = kqmVar2;
        jXs2.addView(kqmVar2, new LinearLayout.LayoutParams(le.lk(context, 36.0f), le.lk(context, 36.0f)));
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs3 = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        jXs3.setOrientation(1);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams9.leftMargin = le.lk(context, 8.0f);
        jXs2.addView(jXs3, layoutParams9);
        com.bytedance.sdk.openadsdk.core.JXs.OY oy4 = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        this.IeN = oy4;
        oy4.setTextColor(-1);
        jXs3.addView(oy4, new LinearLayout.LayoutParams(-2, -2));
        VVE vve = new VVE(context, true);
        this.STP = vve;
        jXs3.addView(vve, new LinearLayout.LayoutParams(-2, -2));
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        this.ZU = pAGLogoView;
        pAGLogoView.setId(520093757);
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-2, le.lk(context, 14.0f));
        layoutParams10.gravity = 83;
        lkVar3.addView(this.ZU, layoutParams10);
        addView(lkVar3);
        addView(this.sLN);
        addView(lkVar2);
        addView(this.OY);
        addView(jXs2);
    }

    @Override // com.bytedance.sdk.openadsdk.component.QAg.lk
    public com.bytedance.sdk.openadsdk.core.JXs.ZU getAdIconView() {
        return this.VVE;
    }

    @Override // com.bytedance.sdk.openadsdk.component.QAg.lk
    public com.bytedance.sdk.openadsdk.core.JXs.OY getAdTitleTextView() {
        return this.IeN;
    }

    @Override // com.bytedance.sdk.openadsdk.component.QAg.lk
    public com.bytedance.sdk.openadsdk.core.JXs.JXs getOverlayLayout() {
        return this.kqm;
    }

    @Override // com.bytedance.sdk.openadsdk.component.QAg.lk
    public VVE getScoreBar() {
        return this.STP;
    }

    @Override // com.bytedance.sdk.openadsdk.component.QAg.lk
    public View getUserInfo() {
        return this.NXR;
    }
}
