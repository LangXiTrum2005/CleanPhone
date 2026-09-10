package com.bytedance.sdk.openadsdk.core.ka;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.jbs.ac;
import com.bytedance.sdk.openadsdk.core.jbs.nr;
import com.bytedance.sdk.openadsdk.core.jbs.tan;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.aw;
import com.bytedance.sdk.openadsdk.core.widget.bu;
import com.bytedance.sdk.openadsdk.core.widget.co;
import com.bytedance.sdk.openadsdk.core.widget.slm;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.bytedance.sdk.openadsdk.utils.sf;
import com.google.android.gms.ads.AdSize;
import com.google.android.material.card.MaterialCardView;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends com.bytedance.sdk.openadsdk.core.jbs.ri {
    public static nr[] ri = {new nr(1, 6.4f, 320, 50), new nr(4, 1.2f, AdSize.MEDIUM_RECTANGLE_WIDTH, AdSize.MEDIUM_RECTANGLE_HEIGHT)};
    private ac aw;
    private String bgr;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private ri f18129co;
    private PAGBannerAdWrapperListener vr;

    public lr(Context context) {
        super(context);
        this.lr = context;
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.vr = pAGBannerAdWrapperListener;
    }

    public void setClosedListenerKey(String str) {
        this.bgr = str;
    }

    private ri di() {
        int iLr = qd.lr(this.lr, 8.0f);
        aw awVar = new aw(this.lr);
        awVar.setId(520093736);
        awVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(awVar, layoutParams);
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.lr, this.ik);
        viewCreatePAGLogoViewByMaterial.setId(520093739);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(iLr, iLr, 0, 0);
        layoutParams2.gravity = MaterialCardView.CHECKED_ICON_GRAVITY_TOP_START;
        viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams2);
        addView(viewCreatePAGLogoViewByMaterial);
        return new ri(viewCreatePAGLogoViewByMaterial, awVar);
    }

    private void fi() {
        TextView textView;
        wjv wjvVar = this.ik;
        if (wjvVar != null) {
            int iVz = wjvVar.vz();
            if (this.ik.eu() == null) {
                ri riVarMj = mj();
                this.f18129co = riVarMj;
                aw awVar = riVarMj.ri;
                ImageView imageView = riVarMj.ik;
                TextView textView2 = riVarMj.lr;
                TextView textView3 = riVarMj.xha;
                View view = riVarMj.di;
                if (view != null) {
                    view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.ka.lr.3
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            TTWebsiteActivity.ri(((com.bytedance.sdk.openadsdk.core.jbs.ri) lr.this).lr, ((com.bytedance.sdk.openadsdk.core.jbs.ri) lr.this).ik, ((com.bytedance.sdk.openadsdk.core.jbs.ri) lr.this).di);
                        }
                    });
                }
                ViewGroup.LayoutParams layoutParams = awVar.getLayoutParams();
                if (this.xha - (qd.lr(this.lr, 8.0f) * 2) >= ((this.mj - qd.lr(this.lr, 8.0f)) - (qd.lr(this.lr, 21.0f) * 2)) - qd.lr(this.lr, 52.0f)) {
                    layoutParams.width = -2;
                    layoutParams.height = -1;
                } else {
                    layoutParams.width = -1;
                    layoutParams.height = -2;
                }
                awVar.setLayoutParams(layoutParams);
                if (iVz == 33) {
                    awVar.setRatio(1.0f);
                } else {
                    awVar.setRatio(1.91f);
                }
                List<com.bytedance.sdk.openadsdk.core.model.nr> listRbz = this.ik.rbz();
                if (listRbz != null && !listRbz.isEmpty()) {
                    com.bytedance.sdk.openadsdk.ac.lr.lr().ri(listRbz.get(0), awVar, this.ik);
                    com.bytedance.sdk.openadsdk.ac.lr.lr().ri(listRbz.get(0).ri(), this.f18129co.fi);
                }
                if (this.ik.fb() == null || TextUtils.isEmpty(this.ik.fb().ri())) {
                    textView = textView2;
                } else {
                    textView = textView2;
                    com.bytedance.sdk.openadsdk.ac.lr.lr().ri(this.ik.fb().ri(), this.ik.fb().lr(), this.ik.fb().ik(), imageView, this.ik);
                }
                textView.setText(this.ik.xh());
                if (TextUtils.isEmpty(this.ik.skk())) {
                    textView3.setVisibility(8);
                } else {
                    textView3.setText(this.ik.skk());
                }
                qd.ri((TextView) null, this.f18129co.ka, this.ik);
                ri((View) awVar, true);
                awVar.setTag(520093762, Boolean.TRUE);
                ri((View) this, true);
                ri((View) textView3, true);
                return;
            }
            ri riVarJbs = jbs();
            this.f18129co = riVarJbs;
            TextView textView4 = riVarJbs.lr;
            TextView textView5 = riVarJbs.xha;
            co coVar = riVarJbs.mj;
            com.bytedance.sdk.openadsdk.ac.lr.lr().ri(this.ik.eu().cuirassed(), this.f18129co.fi);
            View view2 = this.f18129co.di;
            if (view2 != null) {
                view2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.ka.lr.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view3) {
                        TTWebsiteActivity.ri(((com.bytedance.sdk.openadsdk.core.jbs.ri) lr.this).lr, ((com.bytedance.sdk.openadsdk.core.jbs.ri) lr.this).ik, ((com.bytedance.sdk.openadsdk.core.jbs.ri) lr.this).di);
                    }
                });
            }
            ViewGroup.LayoutParams layoutParams2 = coVar.getLayoutParams();
            if (iVz == 15) {
                layoutParams2.width = -2;
                layoutParams2.height = -1;
                coVar.setLayoutParams(layoutParams2);
                coVar.setRatio(0.5625f);
            } else if (iVz == 5) {
                layoutParams2.width = -1;
                layoutParams2.height = -2;
                coVar.setLayoutParams(layoutParams2);
                coVar.setRatio(1.7777778f);
            } else {
                if (this.xha - (qd.lr(this.lr, 8.0f) * 2) >= ((this.mj - qd.lr(this.lr, 8.0f)) - (qd.lr(this.lr, 21.0f) * 2)) - qd.lr(this.lr, 52.0f)) {
                    layoutParams2.width = -2;
                    layoutParams2.height = -1;
                } else {
                    layoutParams2.width = -1;
                    layoutParams2.height = -2;
                }
                coVar.setLayoutParams(layoutParams2);
                coVar.setRatio(1.0f);
            }
            coVar.removeAllViews();
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            com.bytedance.sdk.openadsdk.core.bgr.lr.di videoView = getVideoView();
            if (videoView != null) {
                ac acVar = this.aw;
                if (acVar instanceof tan) {
                    videoView.setNeedSelfManagerVideo(!((tan) acVar).aw());
                    ((tan) this.aw).setBackupVideoView(videoView);
                    videoView.setVideoAdInteractionListener((tan) this.aw);
                }
                coVar.addView(videoView, layoutParams3);
                videoView.setAdCreativeClickListener(new com.bytedance.sdk.openadsdk.core.bgr.lr.di.ri() { // from class: com.bytedance.sdk.openadsdk.core.ka.lr.5
                    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.di.ri
                    public void ri(View view3, int i) {
                        if (lr.this.vr != null) {
                            lr.this.vr.onAdClicked();
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.core.jbs.mj clickCreativeListener = this.aw.getClickCreativeListener();
                if (clickCreativeListener != null) {
                    clickCreativeListener.ri(videoView.getNativeVideoController());
                }
            }
            if (this.ik.fb() != null && !TextUtils.isEmpty(this.ik.fb().ri())) {
                com.bytedance.sdk.openadsdk.ac.lr.lr().ri(this.ik.fb().ri(), this.ik.fb().lr(), this.ik.fb().ik(), this.f18129co.ik, this.ik);
            }
            textView4.setText(this.ik.xh());
            qd.ri((TextView) null, this.f18129co.ka, this.ik);
            if (TextUtils.isEmpty(this.ik.skk())) {
                textView5.setVisibility(8);
            } else {
                textView5.setText(this.ik.skk());
            }
            ri((View) videoView, true);
            if (videoView != null) {
                videoView.setTag(520093762, Boolean.TRUE);
            }
            ri((View) this, true);
            ri((View) textView5, true);
            ri(coVar);
        }
    }

    private void ik() {
        qd.lr(this.lr, 50.0f);
        ri riVarXha = xha();
        this.f18129co = riVarXha;
        ImageView imageView = riVarXha.ik;
        TextView textView = riVarXha.lr;
        slm slmVar = riVarXha.ka;
        TextView textView2 = riVarXha.xha;
        View view = riVarXha.di;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.ka.lr.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    TTWebsiteActivity.ri(((com.bytedance.sdk.openadsdk.core.jbs.ri) lr.this).lr, ((com.bytedance.sdk.openadsdk.core.jbs.ri) lr.this).ik, ((com.bytedance.sdk.openadsdk.core.jbs.ri) lr.this).di);
                }
            });
        }
        if (this.ik.fb() != null && !TextUtils.isEmpty(this.ik.fb().ri())) {
            com.bytedance.sdk.openadsdk.ac.lr.lr().ri(this.ik.fb().ri(), this.ik.fb().lr(), this.ik.fb().ik(), imageView, this.ik);
        }
        textView.setText(this.ik.xh());
        if (TextUtils.isEmpty(this.ik.skk())) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(this.ik.skk());
        }
        qd.ri((TextView) null, slmVar, this.ik);
        ri((View) imageView, true);
        imageView.setTag(520093762, Boolean.TRUE);
        ri((View) this, true);
        ri((View) textView2, true);
    }

    private ri jbs() {
        int iLr = qd.lr(this.lr, 8.0f);
        int iLr2 = qd.lr(this.lr, 21.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.lr);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        relativeLayout.setPadding(iLr, iLr, iLr, iLr2);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this.lr);
        linearLayout.setId(520093737);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(layoutParams2);
        relativeLayout.addView(linearLayout);
        bu buVar = new bu(this.lr);
        buVar.setId(520093738);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(qd.lr(this.lr, 52.0f), qd.lr(this.lr, 52.0f));
        buVar.setScaleType(ImageView.ScaleType.FIT_XY);
        buVar.setLayoutParams(layoutParams3);
        linearLayout.addView(buVar);
        LinearLayout linearLayout2 = new LinearLayout(this.lr);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.leftMargin = iLr;
        layoutParams4.rightMargin = iLr;
        layoutParams4.setMarginStart(iLr);
        layoutParams4.setMarginEnd(iLr);
        linearLayout.addView(linearLayout2, layoutParams4);
        TextView textView = new TextView(this.lr);
        textView.setId(520093730);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView.setTextSize(16.0f);
        textView.setLayoutParams(layoutParams5);
        linearLayout2.addView(textView);
        slm slmVar = new slm(this.lr);
        slmVar.setId(520093735);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.topMargin = qd.lr(this.lr, 4.0f);
        linearLayout2.addView(slmVar, layoutParams6);
        TextView textView2 = new TextView(this.lr);
        textView2.setId(520093703);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(qd.lr(this.lr, 76.0f), qd.lr(this.lr, 36.0f));
        textView2.setBackground(sf.ri(this.lr, 18));
        textView2.setEllipsize(truncateAt);
        textView2.setMaxLines(1);
        textView2.setGravity(17);
        textView2.setText(uq.ri(this.lr, "tt_video_download_apk"));
        textView2.setTextColor(-1);
        textView2.setTextSize(14.0f);
        textView2.setLayoutParams(layoutParams7);
        linearLayout.addView(textView2);
        FrameLayout frameLayout = new FrameLayout(this.lr);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams8.addRule(2, linearLayout.getId());
        layoutParams8.bottomMargin = iLr2;
        frameLayout.setLayoutParams(layoutParams8);
        relativeLayout.addView(frameLayout);
        co coVar = new co(this.lr);
        coVar.setId(520093736);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams9.gravity = 17;
        coVar.setLayoutParams(layoutParams9);
        frameLayout.addView(coVar);
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.lr, this.ik);
        viewCreatePAGLogoViewByMaterial.setId(520093739);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams10.addRule(10);
        layoutParams10.addRule(9);
        layoutParams10.setMargins(iLr, iLr, 0, 0);
        viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams10);
        relativeLayout.addView(viewCreatePAGLogoViewByMaterial);
        return new ri(buVar, viewCreatePAGLogoViewByMaterial, textView2, textView, coVar, slmVar, frameLayout);
    }

    private void ka() {
        ri riVarDi = di();
        this.f18129co = riVarDi;
        View view = riVarDi.di;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.ka.lr.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    TTWebsiteActivity.ri(((com.bytedance.sdk.openadsdk.core.jbs.ri) lr.this).lr, ((com.bytedance.sdk.openadsdk.core.jbs.ri) lr.this).ik, ((com.bytedance.sdk.openadsdk.core.jbs.ri) lr.this).di);
                }
            });
        }
        aw awVar = this.f18129co.ri;
        if (awVar != null) {
            List<com.bytedance.sdk.openadsdk.core.model.nr> listRbz = this.ik.rbz();
            if (listRbz != null && !listRbz.isEmpty()) {
                com.bytedance.sdk.openadsdk.ac.lr.lr().ri(listRbz.get(0), awVar, this.ik);
            }
            ri((View) awVar, true);
            awVar.setTag(520093762, Boolean.TRUE);
        }
    }

    private void lr() {
        nr nrVarRi = ri(this.aw.getExpectExpressWidth(), this.aw.getExpectExpressHeight());
        if (this.aw.getExpectExpressWidth() <= 0 || this.aw.getExpectExpressHeight() <= 0) {
            int iIk = qd.ik(this.lr);
            this.xha = iIk;
            this.mj = Float.valueOf(iIk / nrVarRi.lr).intValue();
        } else {
            this.xha = qd.lr(this.lr, this.aw.getExpectExpressWidth());
            this.mj = qd.lr(this.lr, this.aw.getExpectExpressHeight());
        }
        int i = this.xha;
        if (i > 0 && i > qd.ik(this.lr)) {
            float fIk = qd.ik(this.lr) / this.xha;
            this.xha = qd.ik(this.lr);
            this.mj = Float.valueOf(this.mj * fIk).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.xha, this.mj);
        }
        layoutParams.width = this.xha;
        layoutParams.height = this.mj;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        wjv wjvVar = this.ik;
        if (wjvVar != null) {
            int iVz = wjvVar.vz();
            if (iVz == 1010 || iVz == 1011 || iVz == 1012) {
                ka();
            } else {
                ri(nrVarRi);
            }
        }
    }

    private ri mj() {
        int iLr = qd.lr(this.lr, 8.0f);
        int iLr2 = qd.lr(this.lr, 21.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.lr);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        relativeLayout.setPadding(iLr, iLr, iLr, iLr2);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this.lr);
        linearLayout.setId(520093737);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(layoutParams2);
        relativeLayout.addView(linearLayout);
        bu buVar = new bu(this.lr);
        buVar.setId(520093738);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(qd.lr(this.lr, 52.0f), qd.lr(this.lr, 52.0f));
        buVar.setScaleType(ImageView.ScaleType.FIT_XY);
        buVar.setLayoutParams(layoutParams3);
        linearLayout.addView(buVar);
        LinearLayout linearLayout2 = new LinearLayout(this.lr);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.leftMargin = iLr;
        layoutParams4.rightMargin = iLr;
        layoutParams4.setMarginStart(iLr);
        layoutParams4.setMarginEnd(iLr);
        linearLayout.addView(linearLayout2, layoutParams4);
        TextView textView = new TextView(this.lr);
        textView.setId(520093730);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView.setTextSize(16.0f);
        textView.setLayoutParams(layoutParams5);
        linearLayout2.addView(textView);
        slm slmVar = new slm(this.lr);
        slmVar.setId(520093735);
        linearLayout2.addView(slmVar, new LinearLayout.LayoutParams(-2, -2));
        TextView textView2 = new TextView(this.lr);
        textView2.setId(520093703);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(qd.lr(this.lr, 76.0f), qd.lr(this.lr, 36.0f));
        textView2.setBackground(sf.ri(this.lr, 18));
        textView2.setEllipsize(truncateAt);
        textView2.setMaxLines(1);
        textView2.setGravity(17);
        textView2.setText(uq.ri(this.lr, "tt_video_download_apk"));
        textView2.setTextColor(-1);
        textView2.setTextSize(14.0f);
        textView2.setLayoutParams(layoutParams6);
        linearLayout.addView(textView2);
        FrameLayout frameLayout = new FrameLayout(this.lr);
        frameLayout.setLayoutDirection(3);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams7.addRule(2, linearLayout.getId());
        layoutParams7.bottomMargin = iLr2;
        frameLayout.setLayoutParams(layoutParams7);
        relativeLayout.addView(frameLayout);
        aw awVar = new aw(this.lr);
        awVar.setId(520093736);
        awVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams8.gravity = 17;
        frameLayout.addView(awVar, layoutParams8);
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.lr, this.ik);
        viewCreatePAGLogoViewByMaterial.setId(520093739);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams9.addRule(10);
        layoutParams9.addRule(9);
        layoutParams9.setMargins(iLr, iLr, 0, 0);
        viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams9);
        relativeLayout.addView(viewCreatePAGLogoViewByMaterial);
        return new ri(buVar, viewCreatePAGLogoViewByMaterial, textView2, textView, awVar, slmVar, frameLayout);
    }

    private ri xha() {
        int iLr = qd.lr(this.lr, 38.0f);
        int iLr2 = (int) (((double) qd.lr(this.lr, 25.0f)) / 5.0d);
        int iLr3 = qd.lr(this.lr, 10.0f);
        int iLr4 = qd.lr(this.lr, 2.0f);
        int iLr5 = qd.lr(this.lr, 6.0f);
        int iLr6 = qd.lr(this.lr, 8.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.lr);
        addView(relativeLayout, -1, -1);
        bu buVar = new bu(this.lr);
        buVar.setId(520093738);
        TextView textView = new TextView(this.lr);
        textView.setId(520093730);
        slm slmVar = new slm(this.lr);
        slmVar.setId(520093735);
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.lr, this.ik);
        viewCreatePAGLogoViewByMaterial.setId(520093739);
        TextView textView2 = new TextView(this.lr);
        textView2.setId(520093703);
        ri riVar = new ri(buVar, textView, slmVar, viewCreatePAGLogoViewByMaterial, textView2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iLr, iLr);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        layoutParams.addRule(20);
        layoutParams.setMarginStart(iLr5);
        layoutParams.setMargins(iLr5, 0, 0, 0);
        buVar.setLayoutParams(layoutParams);
        buVar.setBackgroundColor(-1);
        buVar.setScaleType(ImageView.ScaleType.FIT_XY);
        relativeLayout.addView(buVar);
        LinearLayout linearLayout = new LinearLayout(this.lr);
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(16, textView2.getId());
        layoutParams2.addRule(17, buVar.getId());
        layoutParams2.setMarginStart(iLr6);
        layoutParams2.setMarginEnd(iLr6);
        layoutParams2.addRule(0, textView2.getId());
        layoutParams2.addRule(1, buVar.getId());
        layoutParams2.setMargins(iLr6, 0, iLr6, 0);
        relativeLayout.addView(linearLayout, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        textView.setTextDirection(5);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity(80);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF333333"));
        textView.setTextSize(12.0f);
        textView.setLayoutParams(layoutParams3);
        linearLayout.addView(textView);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = iLr4;
        slmVar.setLayoutParams(layoutParams4);
        linearLayout.addView(slmVar);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(20);
        layoutParams5.addRule(9);
        layoutParams5.addRule(12);
        viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams5);
        relativeLayout.addView(viewCreatePAGLogoViewByMaterial);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(11);
        layoutParams6.addRule(15);
        layoutParams6.setMarginEnd(iLr5);
        layoutParams6.addRule(21);
        layoutParams6.rightMargin = iLr5;
        textView2.setBackground(sf.ri(this.lr, 12));
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setMaxLines(1);
        textView2.setPadding(iLr3, iLr2, iLr3, iLr2);
        textView2.setText(uq.ri(this.lr, "tt_video_download_apk"));
        textView2.setTextColor(Color.parseColor("#f0f0f0"));
        textView2.setTextSize(10.0f);
        textView2.setLayoutParams(layoutParams6);
        relativeLayout.addView(textView2);
        return riVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ri
    public void ri(View view, int i, com.bytedance.sdk.openadsdk.core.model.slm slmVar) {
        ac acVar = this.aw;
        if (acVar != null) {
            acVar.ri(view, i, slmVar);
        }
    }

    public void ri(wjv wjvVar, ac acVar, com.bytedance.sdk.openadsdk.ihz.ri.ri.ik ikVar) {
        setBackgroundColor(-1);
        this.ik = wjvVar;
        this.aw = acVar;
        this.di = "banner_ad";
        acVar.addView(this, new ViewGroup.LayoutParams(-2, -2));
        lr();
    }

    public static class ri {
        View di;
        FrameLayout fi;
        ImageView ik;
        slm ka;
        public TextView lr;
        private co mj;
        public aw ri;
        TextView xha;

        public ri(ImageView imageView, TextView textView, slm slmVar, View view, TextView textView2) {
            this.ik = imageView;
            this.lr = textView;
            this.ka = slmVar;
            this.di = view;
            this.xha = textView2;
        }

        public ri(ImageView imageView, View view, TextView textView, TextView textView2, aw awVar, slm slmVar, FrameLayout frameLayout) {
            this.ik = imageView;
            this.di = view;
            this.xha = textView;
            this.lr = textView2;
            this.ri = awVar;
            this.ka = slmVar;
            this.fi = frameLayout;
        }

        public ri(ImageView imageView, View view, TextView textView, TextView textView2, co coVar, slm slmVar, FrameLayout frameLayout) {
            this.ik = imageView;
            this.di = view;
            this.xha = textView;
            this.lr = textView2;
            this.mj = coVar;
            this.ka = slmVar;
            this.fi = frameLayout;
        }

        public ri(View view, aw awVar) {
            this.di = view;
            this.ri = awVar;
        }
    }

    private void ri(nr nrVar) {
        if (nrVar.ri == 1) {
            ik();
        } else {
            fi();
        }
    }

    public static nr ri(int i, int i2) {
        try {
            return ((double) i2) >= Math.floor((((double) i) * 450.0d) / 600.0d) ? ri[1] : ri[0];
        } catch (Throwable unused) {
            return ri[0];
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.ri
    public void ri() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.fi;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.ik.ik ikVar = this.ka;
        if (ikVar != null) {
            ikVar.ri();
        } else {
            TTDelegateActivity.ri(this.ik, this.bgr);
        }
    }
}
