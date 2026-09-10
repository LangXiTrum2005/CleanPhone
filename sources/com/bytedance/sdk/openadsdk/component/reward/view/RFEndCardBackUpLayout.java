package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.ljh;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.jtx;
import com.bytedance.sdk.openadsdk.core.widget.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class RFEndCardBackUpLayout extends com.bytedance.sdk.openadsdk.core.mo.lnr {
    private static final String TAG = "TTAD.RFEndCardBackUpL";
    private com.bytedance.sdk.openadsdk.component.reward.qdl.qdl adContext;
    private PAGLogoView adLogo;
    private yt ivIcon;
    private boolean mInit;
    private jtx rbScore;
    private int shownAdCount;
    private com.bytedance.sdk.openadsdk.core.mo.jpc tvDesc;
    private com.bytedance.sdk.openadsdk.core.mo.jpc tvDownload;
    private TextView tvTitle;

    public static final class qdl extends Drawable {
        private final int lnr;
        Path qdl = new Path();
        private final Drawable ud;

        public qdl(Context context) {
            this.ud = ljh.lnr(context, "tt_ad_bg_header_gradient");
            this.lnr = ax.ud(context, 8.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            canvas.clipPath(this.qdl);
            canvas.drawColor(-1);
            this.ud.draw(canvas);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i2) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setBounds(int i2, int i3, int i4, int i5) {
            super.setBounds(i2, i3, i4, i5);
            float f = i4;
            this.ud.setBounds(i2, i3, i4, (int) (((1.0f * f) / this.ud.getIntrinsicWidth()) * this.ud.getIntrinsicHeight()));
            this.qdl.reset();
            Path path = this.qdl;
            RectF rectF = new RectF(0.0f, 0.0f, f, i5);
            int i6 = this.lnr;
            path.addRoundRect(rectF, i6, i6, Path.Direction.CCW);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public RFEndCardBackUpLayout(Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.jtx.ji);
    }

    private void bindDescData(com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        if (jpcVar == null) {
            return;
        }
        String strHvi = ljhVar.hvi();
        if (TextUtils.isEmpty(strHvi)) {
            return;
        }
        jpcVar.setText(strHvi);
    }

    private void bindIconData(com.bytedance.sdk.openadsdk.core.mo.mml mmlVar, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        if (mmlVar == null || ljhVar.hcs() == null || TextUtils.isEmpty(ljhVar.hcs().qdl())) {
            return;
        }
        com.bytedance.sdk.openadsdk.jl.ud.ud().qdl(ljhVar.hcs(), mmlVar, ljhVar);
    }

    private void bindTitleData(TextView textView, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, String str) {
        if (textView != null) {
            if (ljhVar.fhs() == null || TextUtils.isEmpty(ljhVar.fhs().ud())) {
                textView.setText(str);
            } else {
                textView.setText(ljhVar.fhs().ud());
            }
        }
    }

    private void initData(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar) {
        setDownloadButtonData(jpcVar, ljhVar, -1);
        bindIconData(this.ivIcon, ljhVar);
        jtx jtxVar = this.rbScore;
        if (jtxVar != null) {
            ax.qdl((TextView) null, jtxVar, ljhVar);
            if (ljhVar.fhs() != null) {
                this.rbScore.setVisibility(0);
            }
        }
        if (this.tvTitle != null) {
            if (ljhVar.fhs() != null && !TextUtils.isEmpty(ljhVar.fhs().ud())) {
                this.tvTitle.setText(ljhVar.fhs().ud());
            } else if (TextUtils.isEmpty(ljhVar.ca())) {
                this.tvTitle.setVisibility(8);
            } else {
                this.tvTitle.setText(ljhVar.ca());
            }
        }
        if (this.tvDesc != null) {
            String strGsv = ljhVar.gsv();
            if (TextUtils.isEmpty(strGsv)) {
                this.tvDesc.setVisibility(8);
            } else {
                this.tvDesc.setText(strGsv);
            }
        }
        this.adLogo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.qdl(RFEndCardBackUpLayout.this.adContext.ag, RFEndCardBackUpLayout.this.adContext.ud, RFEndCardBackUpLayout.this.adContext.mzz);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void initOneSlotMultipleAdsLayout() {
        Context context = getContext();
        setBackgroundColor(Color.parseColor("#C2FFFFFF"));
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        mzzVar.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(ax.ud(context, 16.0f), 0, ax.ud(context, 16.0f), 0);
        layoutParams.gravity = 17;
        addView(mzzVar, layoutParams);
        if (this.adContext.zlt == 2) {
            com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar2 = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
            mzzVar2.setOrientation(0);
            mzzVar.addView(mzzVar2, new FrameLayout.LayoutParams(-1, -2));
            initOneSlotMultipleAdsLayoutLandscape(mzzVar2, this.shownAdCount);
        } else if (this.shownAdCount == 2) {
            initOneSlotMultipleAdsLayoutForTwoAdVertical(mzzVar);
        } else {
            initOneSlotMultipleAdsLayoutForThreeAdVertical(mzzVar);
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.adContext;
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(qdlVar.ag, qdlVar.ud);
        viewCreatePAGLogoViewByMaterial.setId(520093757);
        mzzVar.addView(viewCreatePAGLogoViewByMaterial);
        viewCreatePAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTWebsiteActivity.qdl(RFEndCardBackUpLayout.this.adContext.ag, RFEndCardBackUpLayout.this.adContext.ud, RFEndCardBackUpLayout.this.adContext.mzz);
            }
        });
    }

    private void initOneSlotMultipleAdsLayoutForThreeAdVertical(com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar) {
        com.bytedance.sdk.openadsdk.core.model.ljh ljhVar = this.adContext.ud;
        if (ljhVar != null) {
            List<com.bytedance.sdk.openadsdk.core.model.ljh> listMml = ljhVar.mml().mml();
            for (int i2 = 0; i2 < listMml.size() && i2 < 3; i2++) {
                initSingleCardInThreeCardStyle(mzzVar, listMml.get(i2), i2);
            }
        }
    }

    private void initOneSlotMultipleAdsLayoutForTwoAdVertical(com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar) {
        com.bytedance.sdk.openadsdk.core.model.ljh ljhVar = this.adContext.ud;
        if (ljhVar != null) {
            List<com.bytedance.sdk.openadsdk.core.model.ljh> listMml = ljhVar.mml().mml();
            for (int i2 = 0; i2 < listMml.size() && i2 < 2; i2++) {
                initSingleCardInTwoCardStyle(mzzVar, listMml.get(i2), i2);
            }
        }
    }

    private void initOneSlotMultipleAdsLayoutLandscape(com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar, int i2) {
        com.bytedance.sdk.openadsdk.core.model.ljh ljhVar = this.adContext.ud;
        if (ljhVar != null) {
            List<com.bytedance.sdk.openadsdk.core.model.ljh> listMml = ljhVar.mml().mml();
            for (int i3 = 0; i3 < listMml.size() && i3 < i2 && i3 < 3; i3++) {
                initSingleCardInTwoCardStyleLandscape(mzzVar, listMml.get(i3), i3, i2);
            }
        }
    }

    private void initSingleCardInThreeCardStyle(com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, int i2) {
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar2 = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        mzzVar2.setOrientation(1);
        mzzVar2.setGravity(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i2 > 0 ? ax.ud(context, 12.0f) : 0, 0, 0);
        mzzVar2.setBackground(new qdl(context));
        mzzVar.addView(mzzVar2, layoutParams);
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar3 = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        mzzVar3.setOrientation(0);
        mzzVar3.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = ax.ud(context, 20.0f);
        layoutParams2.leftMargin = ax.ud(context, 17.0f);
        layoutParams2.rightMargin = ax.ud(context, 30.0f);
        mzzVar2.addView(mzzVar3, layoutParams2);
        yt ytVar = new yt(context);
        mzzVar3.addView(ytVar, new FrameLayout.LayoutParams(ax.ud(context, 70.0f), ax.ud(context, 63.0f)));
        bindIconData(ytVar, ljhVar);
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar4 = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        mzzVar4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = ax.ud(context, 7.0f);
        mzzVar3.addView(mzzVar4, layoutParams3);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        jpcVar.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        jpcVar.setEllipsize(truncateAt);
        jpcVar.setTextSize(18.0f);
        jpcVar.setTextColor(Color.parseColor("#161823"));
        jpcVar.setGravity(8388611);
        jpcVar.setTypeface(null, 1);
        mzzVar4.addView(jpcVar, new FrameLayout.LayoutParams(-1, -2));
        bindTitleData(jpcVar, ljhVar, ljhVar.ca());
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar2 = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        jpcVar2.setSingleLine(true);
        jpcVar2.setEllipsize(truncateAt);
        jpcVar2.setTextSize(16.0f);
        jpcVar2.setTextColor(Color.parseColor("#80161823"));
        mzzVar4.addView(jpcVar2, new FrameLayout.LayoutParams(-1, -2));
        bindDescData(jpcVar2, ljhVar);
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar5 = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        mzzVar5.setOrientation(0);
        mzzVar5.setGravity(16);
        mzzVar4.addView(mzzVar5, new FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar3 = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        jpcVar3.setTextSize(16.0f);
        jpcVar3.setTextColor(Color.parseColor("#80161823"));
        mzzVar5.addView(jpcVar3, new ViewGroup.LayoutParams(-2, -2));
        jtx jtxVar = new jtx(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = ax.ud(context, 8.0f);
        mzzVar5.addView(jtxVar, layoutParams4);
        ax.qdl(jpcVar3, jtxVar, ljhVar, 18);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar4 = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        jpcVar4.setGravity(17);
        jpcVar4.setId(520093707);
        jpcVar4.setText(ljh.qdl(context, "tt_video_download_apk"));
        jpcVar4.setTextColor(-1);
        jpcVar4.setTextSize(2, 16.0f);
        jpcVar4.setBackground(com.bytedance.sdk.openadsdk.utils.rq.qdl(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, ax.ud(context, 36.0f));
        layoutParams5.setMargins(ax.ud(context, 20.0f), ax.ud(context, 22.0f), ax.ud(context, 20.0f), ax.ud(context, 20.0f));
        mzzVar2.addView(jpcVar4, layoutParams5);
        setDownloadButtonData(jpcVar4, ljhVar, i2);
    }

    private void initSingleCardInTwoCardStyle(com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, int i2) {
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar2 = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        mzzVar2.setOrientation(1);
        mzzVar2.setGravity(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i2 > 0 ? ax.ud(context, 12.0f) : 0, 0, 0);
        mzzVar2.setBackground(new qdl(context));
        mzzVar.addView(mzzVar2, layoutParams);
        yt ytVar = new yt(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(ax.ud(context, 70.0f), ax.ud(context, 63.0f));
        layoutParams2.setMargins(0, ax.ud(context, 24.0f), 0, ax.ud(context, 12.0f));
        mzzVar2.addView(ytVar, layoutParams2);
        bindIconData(ytVar, ljhVar);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        jpcVar.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        jpcVar.setEllipsize(truncateAt);
        jpcVar.setTextSize(18.0f);
        jpcVar.setTextColor(Color.parseColor("#161823"));
        jpcVar.setGravity(17);
        jpcVar.setTypeface(null, 1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(ax.ud(context, 56.0f), 0, ax.ud(context, 56.0f), 0);
        mzzVar2.addView(jpcVar, layoutParams3);
        bindTitleData(jpcVar, ljhVar, ljhVar.ca());
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar2 = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        jpcVar2.setSingleLine(true);
        jpcVar2.setEllipsize(truncateAt);
        jpcVar2.setTextSize(16.0f);
        jpcVar2.setTextColor(Color.parseColor("#80161823"));
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(ax.ud(context, 56.0f), ax.ud(context, 4.0f), ax.ud(context, 56.0f), 0);
        mzzVar2.addView(jpcVar2, layoutParams4);
        bindDescData(jpcVar2, ljhVar);
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar3 = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        mzzVar3.setOrientation(0);
        mzzVar3.setGravity(16);
        mzzVar2.addView(mzzVar3, new FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar3 = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        jpcVar3.setTextSize(16.0f);
        jpcVar3.setTextColor(Color.parseColor("#80161823"));
        mzzVar3.addView(jpcVar3, new ViewGroup.LayoutParams(-2, -2));
        jtx jtxVar = new jtx(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.leftMargin = ax.ud(context, 8.0f);
        mzzVar3.addView(jtxVar, layoutParams5);
        ax.qdl(jpcVar3, jtxVar, ljhVar, 18);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar4 = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        jpcVar4.setGravity(17);
        jpcVar4.setId(520093707);
        jpcVar4.setText(ljh.qdl(context, "tt_video_download_apk"));
        jpcVar4.setTextColor(-1);
        jpcVar4.setTextSize(2, 16.0f);
        jpcVar4.setBackground(com.bytedance.sdk.openadsdk.utils.rq.qdl(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, ax.ud(context, 36.0f));
        layoutParams6.setMargins(ax.ud(context, 20.0f), ax.ud(context, 36.0f), ax.ud(context, 20.0f), ax.ud(context, 20.0f));
        mzzVar2.addView(jpcVar4, layoutParams6);
        setDownloadButtonData(jpcVar4, ljhVar, i2);
    }

    private void initSingleCardInTwoCardStyleLandscape(com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, int i2, int i3) {
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar2 = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        mzzVar2.setOrientation(1);
        mzzVar2.setGravity(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        if (i2 > 0) {
            layoutParams.setMargins(ax.ud(context, 12.0f), 0, 0, 0);
        }
        mzzVar2.setBackground(new qdl(context));
        mzzVar.addView(mzzVar2, layoutParams);
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar3 = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        mzzVar3.setOrientation(0);
        mzzVar3.setGravity(48);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = ax.ud(context, 20.0f);
        layoutParams2.leftMargin = ax.ud(context, 17.0f);
        layoutParams2.rightMargin = ax.ud(context, 30.0f);
        mzzVar2.addView(mzzVar3, layoutParams2);
        yt ytVar = new yt(context);
        mzzVar3.addView(ytVar, new FrameLayout.LayoutParams(ax.ud(context, 44.0f), ax.ud(context, 44.0f)));
        bindIconData(ytVar, ljhVar);
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar4 = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        mzzVar4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = ax.ud(context, 7.0f);
        mzzVar3.addView(mzzVar4, layoutParams3);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        jpcVar.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        jpcVar.setEllipsize(truncateAt);
        jpcVar.setTextSize(18.0f);
        jpcVar.setTextColor(Color.parseColor("#161823"));
        jpcVar.setGravity(8388611);
        jpcVar.setTypeface(null, 1);
        mzzVar4.addView(jpcVar, new FrameLayout.LayoutParams(-1, -2));
        bindTitleData(jpcVar, ljhVar, ljhVar.ca());
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar5 = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        mzzVar5.setOrientation(0);
        mzzVar5.setGravity(16);
        mzzVar4.addView(mzzVar5, new FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar2 = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        jpcVar2.setTextSize(16.0f);
        jpcVar2.setTextColor(Color.parseColor("#80161823"));
        mzzVar5.addView(jpcVar2, new ViewGroup.LayoutParams(-2, -2));
        jtx jtxVar = new jtx(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = ax.ud(context, 8.0f);
        mzzVar5.addView(jtxVar, layoutParams4);
        ax.qdl(jpcVar2, jtxVar, ljhVar, 18);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar3 = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        if (i3 == 2) {
            jpcVar3.setSingleLine(true);
        } else {
            jpcVar3.setLines(2);
        }
        jpcVar3.setEllipsize(truncateAt);
        jpcVar3.setTextSize(16.0f);
        jpcVar3.setTextColor(Color.parseColor("#80161823"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        int i4 = layoutParams2.leftMargin;
        layoutParams5.rightMargin = i4;
        layoutParams5.leftMargin = i4;
        layoutParams5.topMargin = ax.ud(context, 12.0f);
        mzzVar2.addView(jpcVar3, layoutParams5);
        bindDescData(jpcVar3, ljhVar);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar4 = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        jpcVar4.setGravity(17);
        jpcVar4.setId(520093707);
        jpcVar4.setText(ljh.qdl(context, "tt_video_download_apk"));
        jpcVar4.setTextColor(-1);
        jpcVar4.setTextSize(2, 16.0f);
        jpcVar4.setBackground(com.bytedance.sdk.openadsdk.utils.rq.qdl(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, ax.ud(context, 36.0f));
        layoutParams6.setMargins(ax.ud(context, 20.0f), ax.ud(context, 22.0f), ax.ud(context, 20.0f), ax.ud(context, 20.0f));
        mzzVar2.addView(jpcVar4, layoutParams6);
        setDownloadButtonData(jpcVar4, ljhVar, i2);
    }

    private void initViews() {
        com.bytedance.sdk.openadsdk.activity.jpc jpcVar;
        if (this.mInit) {
            return;
        }
        this.mInit = true;
        if (this.adContext.ud.ax() && (jpcVar = this.adContext.lq) != null && jpcVar.ag() && this.shownAdCount > 1) {
            initOneSlotMultipleAdsLayout();
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.ljh ljhVar = this.adContext.ud;
        if (ljhVar.uj()) {
            initViewsForVast();
        } else {
            initViewsDefault();
            initData(ljhVar, this.tvDownload);
        }
    }

    private void initViewsDefault() {
        Context context = getContext();
        boolean z2 = this.adContext.ud.jb() == 1;
        setBackgroundColor(-16777216);
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        mzzVar.setGravity(1);
        mzzVar.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = z2 ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(ax.ud(context, 327.0f), -2);
        layoutParams.gravity = 17;
        int iUd = ax.ud(context, 24.0f);
        layoutParams.rightMargin = iUd;
        layoutParams.leftMargin = iUd;
        addView(mzzVar, layoutParams);
        yt ytVar = new yt(context);
        this.ivIcon = ytVar;
        ytVar.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(ax.ud(context, 80.0f), ax.ud(context, 80.0f));
        layoutParams2.bottomMargin = ax.ud(context, 12.0f);
        mzzVar.addView(this.ivIcon, layoutParams2);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        this.tvTitle = jpcVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        jpcVar.setEllipsize(truncateAt);
        this.tvTitle.setGravity(17);
        this.tvTitle.setMaxLines(2);
        this.tvTitle.setMaxWidth(ax.ud(context, 180.0f));
        this.tvTitle.setTextColor(-1);
        this.tvTitle.setTextSize(2, 24.0f);
        mzzVar.addView(this.tvTitle, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar2 = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        this.tvDesc = jpcVar2;
        jpcVar2.setEllipsize(truncateAt);
        this.tvDesc.setGravity(17);
        this.tvDesc.setMaxLines(2);
        this.tvDesc.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.tvDesc.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = ax.ud(context, 8.0f);
        mzzVar.addView(this.tvDesc, layoutParams3);
        this.rbScore = new jtx(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, ax.ud(context, 16.0f));
        layoutParams4.topMargin = ax.ud(context, 12.0f);
        this.rbScore.setVisibility(8);
        mzzVar.addView(this.rbScore, layoutParams4);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar3 = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        this.tvDownload = jpcVar3;
        jpcVar3.setId(520093707);
        this.tvDownload.setGravity(17);
        this.tvDownload.setText(ljh.qdl(context, "tt_video_download_apk"));
        this.tvDownload.setTextColor(-1);
        this.tvDownload.setTextSize(2, 16.0f);
        this.tvDownload.setBackground(com.bytedance.sdk.openadsdk.utils.rq.qdl(context, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, ax.ud(context, 44.0f));
        layoutParams5.topMargin = ax.ud(context, 54.0f);
        mzzVar.addView(this.tvDownload, layoutParams5);
        this.adLogo = PAGLogoView.createPAGLogoViewByMaterial(context, this.adContext.ud);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, ax.ud(context, 14.0f));
        layoutParams6.gravity = 8388691;
        layoutParams6.leftMargin = ax.ud(context, 18.0f);
        if (z2) {
            layoutParams6.bottomMargin = ax.ud(context, 61.0f);
        } else {
            layoutParams6.bottomMargin = ax.ud(context, 24.0f);
        }
        addView(this.adLogo, layoutParams6);
    }

    private void initViewsForVast() {
        Context context = getContext();
        setBackgroundColor(-16777216);
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar = new com.bytedance.sdk.openadsdk.core.mo.mml(context);
        mmlVar.setId(com.bytedance.sdk.openadsdk.utils.jtx.jpc);
        mmlVar.setVisibility(8);
        addView(mmlVar, new FrameLayout.LayoutParams(-1, -1));
        View moVar = new com.bytedance.sdk.component.tvp.mo(context, true, com.bytedance.sdk.component.tvp.mo.lnr.VAST_ENDCARD);
        moVar.setVisibility(8);
        moVar.setId(com.bytedance.sdk.openadsdk.utils.jtx.tvp);
        addView(moVar, new FrameLayout.LayoutParams(-1, -1));
    }

    private void setDownloadButtonData(com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, int i2) {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.adContext;
        com.bytedance.sdk.openadsdk.core.lnr.mzz mzzVarQdl = qdlVar.vu.qdl(qdlVar, ljhVar);
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.adContext;
        mzzVarQdl.qdl(com.bytedance.sdk.openadsdk.exc.qdl.qdl.wd.qdl(qdlVar2.ag, qdlVar2.mzz));
        if (i2 != -1) {
            HashMap map = new HashMap();
            int i3 = i2 + 1;
            map.put("ad_show_order", Integer.valueOf(i3));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_show_order", i3);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Throwable unused) {
            }
            mzzVarQdl.qdl(map);
        }
        jpcVar.setOnClickListener(mzzVarQdl);
        jpcVar.setOnTouchListener(mzzVarQdl);
        CharSequence charSequenceUvi = ljhVar.uvi();
        if (TextUtils.isEmpty(charSequenceUvi)) {
            return;
        }
        jpcVar.setText(charSequenceUvi);
    }

    public void init(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        this.adContext = qdlVar;
        if (qdlVar.ud.uj()) {
            initViews();
        }
    }

    public void setShownAdCount(int i2) {
        this.shownAdCount = i2;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        if (i2 == 0) {
            initViews();
        }
    }
}
