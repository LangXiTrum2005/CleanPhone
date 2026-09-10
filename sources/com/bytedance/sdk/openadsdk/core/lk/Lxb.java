package com.bytedance.sdk.openadsdk.core.lk;

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
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.OY.OY;
import com.bytedance.sdk.openadsdk.core.OY.brP;
import com.bytedance.sdk.openadsdk.core.OY.kqm;
import com.bytedance.sdk.openadsdk.core.OY.tD;
import com.bytedance.sdk.openadsdk.core.model.IeN;
import com.bytedance.sdk.openadsdk.core.model.STP;
import com.bytedance.sdk.openadsdk.core.widget.NXR;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.VVE;
import com.bytedance.sdk.openadsdk.core.widget.sLN;
import com.bytedance.sdk.openadsdk.utils.QAg;
import com.bytedance.sdk.openadsdk.utils.le;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb extends com.bytedance.sdk.openadsdk.core.OY.Lxb {
    public static kqm[] Lxb = {new kqm(1, 6.4f, EnumC4719u30.WEBVIEW_ERROR_VALUE, 50), new kqm(4, 1.2f, 300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION)};
    private String IeN;
    private C0107Lxb NXR;
    private tD STP;
    private PAGBannerAdWrapperListener VVE;

    public Lxb(@NonNull Context context) {
        super(context);
        this.LD = context;
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.VVE = pAGBannerAdWrapperListener;
    }

    public void setClosedListenerKey(String str) {
        this.IeN = str;
    }

    private void JXs() {
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.lk;
        if (tDVar != null) {
            int iFGm = tDVar.FGm();
            float fLk = (this.OY * 1.0f) / le.lk(this.LD, 250.0f);
            if (this.lk.JJ() == null) {
                C0107Lxb c0107LxbOY = OY();
                this.NXR = c0107LxbOY;
                NXR nxr = c0107LxbOY.Lxb;
                ImageView imageView = c0107LxbOY.lk;
                TextView textView = c0107LxbOY.LD;
                TextView textView2 = c0107LxbOY.ebl;
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = (int) (le.lk(this.LD, 45.0f) * fLk);
                    layoutParams.height = (int) (le.lk(this.LD, 45.0f) * fLk);
                }
                textView.setTextSize(2, le.LD(this.LD, textView.getTextSize()) * fLk);
                textView2.setTextSize(2, le.LD(this.LD, textView2.getTextSize()) * fLk);
                View view = this.NXR.lc;
                if (view != null) {
                    view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.lk.Lxb.3
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            TTWebsiteActivity.Lxb(((com.bytedance.sdk.openadsdk.core.OY.Lxb) Lxb.this).LD, ((com.bytedance.sdk.openadsdk.core.OY.Lxb) Lxb.this).lk, ((com.bytedance.sdk.openadsdk.core.OY.Lxb) Lxb.this).lc);
                        }
                    });
                }
                if (iFGm == 33) {
                    nxr.setRatio(1.0f);
                } else {
                    nxr.setRatio(1.91f);
                }
                List<IeN> listUxf = this.lk.uxf();
                if (listUxf != null && !listUxf.isEmpty()) {
                    com.bytedance.sdk.openadsdk.kqm.lk.Lxb().Lxb(listUxf.get(0), nxr, this.lk);
                    com.bytedance.sdk.openadsdk.kqm.lk.Lxb().Lxb(listUxf.get(0).Lxb(), this.NXR.JXs);
                }
                if (this.lk.Lpq() != null && !TextUtils.isEmpty(this.lk.Lpq().Lxb())) {
                    com.bytedance.sdk.openadsdk.kqm.lk.Lxb().Lxb(this.lk.Lpq().Lxb(), this.lk.Lpq().LD(), this.lk.Lpq().lk(), imageView, this.lk);
                }
                textView.setText(this.lk.FD());
                if (TextUtils.isEmpty(this.lk.xr())) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setText(this.lk.xr());
                }
                le.Lxb((TextView) null, this.NXR.ZU, this.lk);
                Lxb((View) nxr, true);
                nxr.setTag(520093762, Boolean.TRUE);
                Lxb((View) this, true);
                Lxb((View) textView2, true);
                return;
            }
            C0107Lxb c0107LxbQAg = QAg();
            this.NXR = c0107LxbQAg;
            TextView textView3 = c0107LxbQAg.LD;
            TextView textView4 = c0107LxbQAg.ebl;
            sLN sln = c0107LxbQAg.OY;
            textView3.setTextSize(2, le.LD(this.LD, textView3.getTextSize()) * fLk);
            textView4.setTextSize(2, le.LD(this.LD, textView4.getTextSize()) * fLk);
            com.bytedance.sdk.openadsdk.kqm.lk.Lxb().Lxb(this.lk.JJ().f, this.NXR.JXs);
            View view2 = this.NXR.lc;
            if (view2 != null) {
                view2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.lk.Lxb.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view3) {
                        TTWebsiteActivity.Lxb(((com.bytedance.sdk.openadsdk.core.OY.Lxb) Lxb.this).LD, ((com.bytedance.sdk.openadsdk.core.OY.Lxb) Lxb.this).lk, ((com.bytedance.sdk.openadsdk.core.OY.Lxb) Lxb.this).lc);
                    }
                });
            }
            if (iFGm == 15) {
                sln.setRatio(0.5625f);
            } else if (iFGm == 5) {
                sln.setRatio(1.7777778f);
            } else {
                sln.setRatio(1.0f);
            }
            sln.removeAllViews();
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            com.bytedance.sdk.openadsdk.core.NXR.LD.lc videoView = getVideoView();
            if (videoView != null) {
                tD tDVar2 = this.STP;
                if (tDVar2 instanceof brP) {
                    videoView.setVideoAdInteractionListener((brP) tDVar2);
                }
                sln.addView(videoView, layoutParams2);
                videoView.setAdCreativeClickListener(new com.bytedance.sdk.openadsdk.core.NXR.LD.lc.Lxb() { // from class: com.bytedance.sdk.openadsdk.core.lk.Lxb.5
                    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.lc.Lxb
                    public void Lxb(View view3, int i) {
                        if (Lxb.this.VVE != null) {
                            Lxb.this.VVE.onAdClicked();
                        }
                    }
                });
                OY clickCreativeListener = this.STP.getClickCreativeListener();
                if (clickCreativeListener != null) {
                    clickCreativeListener.Lxb(videoView.getNativeVideoController());
                }
            }
            if (this.lk.Lpq() != null && !TextUtils.isEmpty(this.lk.Lpq().Lxb())) {
                com.bytedance.sdk.openadsdk.kqm.lk.Lxb().Lxb(this.lk.Lpq().Lxb(), this.lk.Lpq().LD(), this.lk.Lpq().lk(), this.NXR.lk, this.lk);
            }
            textView3.setText(this.lk.FD());
            le.Lxb((TextView) null, this.NXR.ZU, this.lk);
            if (TextUtils.isEmpty(this.lk.xr())) {
                textView4.setVisibility(8);
            } else {
                textView4.setText(this.lk.xr());
            }
            Lxb((View) videoView, true);
            if (videoView != null) {
                videoView.setTag(520093762, Boolean.TRUE);
            }
            Lxb((View) this, true);
            Lxb((View) textView4, true);
            Lxb(sln);
        }
    }

    private void LD() {
        kqm kqmVarLxb = Lxb(this.STP.getExpectExpressWidth(), this.STP.getExpectExpressHeight());
        if (this.STP.getExpectExpressWidth() <= 0 || this.STP.getExpectExpressHeight() <= 0) {
            int iLk = le.lk(this.LD);
            this.ebl = iLk;
            this.OY = Float.valueOf(iLk / kqmVarLxb.LD).intValue();
        } else {
            this.ebl = le.lk(this.LD, this.STP.getExpectExpressWidth());
            this.OY = le.lk(this.LD, this.STP.getExpectExpressHeight());
        }
        int i = this.ebl;
        if (i > 0 && i > le.lk(this.LD)) {
            float fLk = le.lk(this.LD) / this.ebl;
            this.ebl = le.lk(this.LD);
            this.OY = Float.valueOf(this.OY * fLk).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.ebl, this.OY);
        }
        layoutParams.width = this.ebl;
        layoutParams.height = this.OY;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.lk;
        if (tDVar != null) {
            int iFGm = tDVar.FGm();
            if (iFGm == 1010 || iFGm == 1011 || iFGm == 1012) {
                ZU();
            } else {
                Lxb(kqmVarLxb);
            }
        }
    }

    private C0107Lxb OY() {
        int iLk = le.lk(this.LD, 8.0f);
        int iLk2 = le.lk(this.LD, 21.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.LD);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        relativeLayout.setPadding(iLk, iLk, iLk, iLk2);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this.LD);
        linearLayout.setId(520093737);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(layoutParams2);
        relativeLayout.addView(linearLayout);
        com.bytedance.sdk.openadsdk.core.widget.kqm kqmVar = new com.bytedance.sdk.openadsdk.core.widget.kqm(this.LD);
        kqmVar.setId(520093738);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(le.lk(this.LD, 52.0f), le.lk(this.LD, 52.0f));
        kqmVar.setScaleType(ImageView.ScaleType.FIT_XY);
        kqmVar.setLayoutParams(layoutParams3);
        linearLayout.addView(kqmVar);
        LinearLayout linearLayout2 = new LinearLayout(this.LD);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.leftMargin = iLk;
        layoutParams4.rightMargin = iLk;
        layoutParams4.setMarginStart(iLk);
        layoutParams4.setMarginEnd(iLk);
        linearLayout.addView(linearLayout2, layoutParams4);
        TextView textView = new TextView(this.LD);
        textView.setId(520093730);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView.setTextSize(12.0f);
        textView.setLayoutParams(layoutParams5);
        linearLayout2.addView(textView);
        VVE vve = new VVE(this.LD);
        vve.setId(520093735);
        linearLayout2.addView(vve, new LinearLayout.LayoutParams(-2, -2));
        TextView textView2 = new TextView(this.LD);
        textView2.setId(520093703);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(le.lk(this.LD, 76.0f), le.lk(this.LD, 36.0f));
        textView2.setBackground(QAg.Lxb(this.LD, 18));
        textView2.setEllipsize(truncateAt);
        textView2.setMaxLines(1);
        textView2.setGravity(17);
        textView2.setText(com.bytedance.sdk.component.utils.tD.Lxb(this.LD, "tt_video_download_apk"));
        textView2.setTextColor(-1);
        textView2.setTextSize(14.0f);
        textView2.setLayoutParams(layoutParams6);
        linearLayout.addView(textView2);
        FrameLayout frameLayout = new FrameLayout(this.LD);
        frameLayout.setLayoutDirection(3);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams7.addRule(2, linearLayout.getId());
        layoutParams7.bottomMargin = iLk2;
        frameLayout.setLayoutParams(layoutParams7);
        relativeLayout.addView(frameLayout);
        NXR nxr = new NXR(this.LD);
        nxr.setId(520093736);
        nxr.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams8.gravity = 17;
        frameLayout.addView(nxr, layoutParams8);
        View pAGLogoView = new PAGLogoView(this.LD);
        pAGLogoView.setId(520093739);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams9.addRule(10);
        layoutParams9.addRule(9);
        layoutParams9.setMargins(iLk, iLk, 0, 0);
        pAGLogoView.setLayoutParams(layoutParams9);
        relativeLayout.addView(pAGLogoView);
        return new C0107Lxb(kqmVar, pAGLogoView, textView2, textView, nxr, vve, frameLayout);
    }

    private C0107Lxb QAg() {
        int iLk = le.lk(this.LD, 8.0f);
        int iLk2 = le.lk(this.LD, 21.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.LD);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        relativeLayout.setPadding(iLk, iLk, iLk, iLk2);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this.LD);
        linearLayout.setId(520093737);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(layoutParams2);
        relativeLayout.addView(linearLayout);
        com.bytedance.sdk.openadsdk.core.widget.kqm kqmVar = new com.bytedance.sdk.openadsdk.core.widget.kqm(this.LD);
        kqmVar.setId(520093738);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(le.lk(this.LD, 52.0f), le.lk(this.LD, 52.0f));
        kqmVar.setScaleType(ImageView.ScaleType.FIT_XY);
        kqmVar.setLayoutParams(layoutParams3);
        linearLayout.addView(kqmVar);
        LinearLayout linearLayout2 = new LinearLayout(this.LD);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.leftMargin = iLk;
        layoutParams4.rightMargin = iLk;
        layoutParams4.setMarginStart(iLk);
        layoutParams4.setMarginEnd(iLk);
        linearLayout.addView(linearLayout2, layoutParams4);
        TextView textView = new TextView(this.LD);
        textView.setId(520093730);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView.setTextSize(12.0f);
        textView.setLayoutParams(layoutParams5);
        linearLayout2.addView(textView);
        VVE vve = new VVE(this.LD);
        vve.setId(520093735);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.topMargin = le.lk(this.LD, 4.0f);
        linearLayout2.addView(vve, layoutParams6);
        TextView textView2 = new TextView(this.LD);
        textView2.setId(520093703);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(le.lk(this.LD, 76.0f), le.lk(this.LD, 36.0f));
        textView2.setBackground(QAg.Lxb(this.LD, 18));
        textView2.setEllipsize(truncateAt);
        textView2.setMaxLines(1);
        textView2.setGravity(17);
        textView2.setText(com.bytedance.sdk.component.utils.tD.Lxb(this.LD, "tt_video_download_apk"));
        textView2.setTextColor(-1);
        textView2.setTextSize(14.0f);
        textView2.setLayoutParams(layoutParams7);
        linearLayout.addView(textView2);
        FrameLayout frameLayout = new FrameLayout(this.LD);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams8.addRule(2, linearLayout.getId());
        layoutParams8.bottomMargin = iLk2;
        frameLayout.setLayoutParams(layoutParams8);
        relativeLayout.addView(frameLayout);
        sLN sln = new sLN(this.LD);
        sln.setId(520093736);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams9.gravity = 17;
        sln.setLayoutParams(layoutParams9);
        frameLayout.addView(sln);
        View pAGLogoView = new PAGLogoView(this.LD);
        pAGLogoView.setId(520093739);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams10.addRule(10);
        layoutParams10.addRule(9);
        layoutParams10.setMargins(iLk, iLk, 0, 0);
        pAGLogoView.setLayoutParams(layoutParams10);
        relativeLayout.addView(pAGLogoView);
        return new C0107Lxb(kqmVar, pAGLogoView, textView2, textView, sln, vve, frameLayout);
    }

    private void ZU() {
        C0107Lxb c0107LxbLc = lc();
        this.NXR = c0107LxbLc;
        View view = c0107LxbLc.lc;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.lk.Lxb.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    TTWebsiteActivity.Lxb(((com.bytedance.sdk.openadsdk.core.OY.Lxb) Lxb.this).LD, ((com.bytedance.sdk.openadsdk.core.OY.Lxb) Lxb.this).lk, ((com.bytedance.sdk.openadsdk.core.OY.Lxb) Lxb.this).lc);
                }
            });
        }
        NXR nxr = this.NXR.Lxb;
        if (nxr != null) {
            List<IeN> listUxf = this.lk.uxf();
            if (listUxf != null && !listUxf.isEmpty()) {
                com.bytedance.sdk.openadsdk.kqm.lk.Lxb().Lxb(listUxf.get(0), nxr, this.lk);
            }
            Lxb((View) nxr, true);
            nxr.setTag(520093762, Boolean.TRUE);
        }
    }

    private C0107Lxb ebl() {
        int iLk = le.lk(this.LD, 38.0f);
        int iLk2 = (int) (((double) le.lk(this.LD, 25.0f)) / 5.0d);
        int iLk3 = le.lk(this.LD, 10.0f);
        int iLk4 = le.lk(this.LD, 2.0f);
        int iLk5 = le.lk(this.LD, 6.0f);
        int iLk6 = le.lk(this.LD, 8.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.LD);
        addView(relativeLayout, -1, -1);
        com.bytedance.sdk.openadsdk.core.widget.kqm kqmVar = new com.bytedance.sdk.openadsdk.core.widget.kqm(this.LD);
        kqmVar.setId(520093738);
        TextView textView = new TextView(this.LD);
        textView.setId(520093730);
        VVE vve = new VVE(this.LD);
        vve.setId(520093735);
        View pAGLogoView = new PAGLogoView(this.LD);
        pAGLogoView.setId(520093739);
        TextView textView2 = new TextView(this.LD);
        textView2.setId(520093703);
        C0107Lxb c0107Lxb = new C0107Lxb(kqmVar, textView, vve, pAGLogoView, textView2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iLk, iLk);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        layoutParams.addRule(20);
        layoutParams.setMarginStart(iLk5);
        layoutParams.setMargins(iLk5, 0, 0, 0);
        kqmVar.setLayoutParams(layoutParams);
        kqmVar.setBackgroundColor(-1);
        kqmVar.setScaleType(ImageView.ScaleType.FIT_XY);
        relativeLayout.addView(kqmVar);
        LinearLayout linearLayout = new LinearLayout(this.LD);
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(16, textView2.getId());
        layoutParams2.addRule(17, kqmVar.getId());
        layoutParams2.setMarginStart(iLk6);
        layoutParams2.setMarginEnd(iLk6);
        layoutParams2.addRule(0, textView2.getId());
        layoutParams2.addRule(1, kqmVar.getId());
        layoutParams2.setMargins(iLk6, 0, iLk6, 0);
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
        layoutParams4.topMargin = iLk4;
        vve.setLayoutParams(layoutParams4);
        linearLayout.addView(vve);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(20);
        layoutParams5.addRule(9);
        layoutParams5.addRule(12);
        pAGLogoView.setLayoutParams(layoutParams5);
        relativeLayout.addView(pAGLogoView);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(11);
        layoutParams6.addRule(15);
        layoutParams6.setMarginEnd(iLk5);
        layoutParams6.addRule(21);
        layoutParams6.rightMargin = iLk5;
        textView2.setBackground(QAg.Lxb(this.LD, 12));
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setMaxLines(1);
        textView2.setPadding(iLk3, iLk2, iLk3, iLk2);
        textView2.setText(com.bytedance.sdk.component.utils.tD.Lxb(this.LD, "tt_video_download_apk"));
        textView2.setTextColor(Color.parseColor("#f0f0f0"));
        textView2.setTextSize(10.0f);
        textView2.setLayoutParams(layoutParams6);
        relativeLayout.addView(textView2);
        return c0107Lxb;
    }

    private C0107Lxb lc() {
        int iLk = le.lk(this.LD, 8.0f);
        NXR nxr = new NXR(this.LD);
        nxr.setId(520093736);
        nxr.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(nxr, layoutParams);
        View pAGLogoView = new PAGLogoView(this.LD);
        pAGLogoView.setId(520093739);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(iLk, iLk, 0, 0);
        layoutParams2.gravity = 8388659;
        pAGLogoView.setLayoutParams(layoutParams2);
        addView(pAGLogoView);
        return new C0107Lxb(pAGLogoView, nxr);
    }

    private void lk() {
        float fLk = (this.OY * 1.0f) / le.lk(this.LD, 50.0f);
        float f = this.OY * 1.0f;
        int i = this.ebl;
        if (f / i > 0.21875f) {
            fLk = (i * 1.0f) / le.lk(this.LD, 320.0f);
        }
        C0107Lxb c0107LxbEbl = ebl();
        this.NXR = c0107LxbEbl;
        ImageView imageView = c0107LxbEbl.lk;
        TextView textView = c0107LxbEbl.LD;
        VVE vve = c0107LxbEbl.ZU;
        TextView textView2 = c0107LxbEbl.ebl;
        textView.setTextSize(2, le.LD(this.LD, textView.getTextSize()) * fLk);
        textView2.setTextSize(2, le.LD(this.LD, textView2.getTextSize()) * fLk);
        View view = this.NXR.lc;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.lk.Lxb.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    TTWebsiteActivity.Lxb(((com.bytedance.sdk.openadsdk.core.OY.Lxb) Lxb.this).LD, ((com.bytedance.sdk.openadsdk.core.OY.Lxb) Lxb.this).lk, ((com.bytedance.sdk.openadsdk.core.OY.Lxb) Lxb.this).lc);
                }
            });
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) (le.lk(this.LD, 38.0f) * fLk);
            layoutParams.height = (int) (le.lk(this.LD, 38.0f) * fLk);
        }
        if (this.lk.Lpq() != null && !TextUtils.isEmpty(this.lk.Lpq().Lxb())) {
            com.bytedance.sdk.openadsdk.kqm.lk.Lxb().Lxb(this.lk.Lpq().Lxb(), this.lk.Lpq().LD(), this.lk.Lpq().lk(), imageView, this.lk);
        }
        textView.setText(this.lk.FD());
        if (TextUtils.isEmpty(this.lk.xr())) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(this.lk.xr());
        }
        le.Lxb((TextView) null, vve, this.lk);
        Lxb((View) imageView, true);
        imageView.setTag(520093762, Boolean.TRUE);
        Lxb((View) this, true);
        Lxb((View) textView2, true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.Lxb
    public void Lxb(View view, int i, STP stp) {
        tD tDVar = this.STP;
        if (tDVar != null) {
            tDVar.Lxb(view, i, stp);
        }
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.model.tD tDVar, tD tDVar2, com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc lcVar) {
        setBackgroundColor(-1);
        this.lk = tDVar;
        this.STP = tDVar2;
        this.lc = "banner_ad";
        tDVar2.addView(this, new ViewGroup.LayoutParams(-2, -2));
        LD();
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.lk.Lxb$Lxb, reason: collision with other inner class name */
    public static class C0107Lxb {
        FrameLayout JXs;
        public TextView LD;
        public NXR Lxb;
        private sLN OY;
        VVE ZU;
        TextView ebl;
        View lc;
        ImageView lk;

        public C0107Lxb(ImageView imageView, TextView textView, VVE vve, View view, TextView textView2) {
            this.lk = imageView;
            this.LD = textView;
            this.ZU = vve;
            this.lc = view;
            this.ebl = textView2;
        }

        public C0107Lxb(ImageView imageView, View view, TextView textView, TextView textView2, NXR nxr, VVE vve, FrameLayout frameLayout) {
            this.lk = imageView;
            this.lc = view;
            this.ebl = textView;
            this.LD = textView2;
            this.Lxb = nxr;
            this.ZU = vve;
            this.JXs = frameLayout;
        }

        public C0107Lxb(ImageView imageView, View view, TextView textView, TextView textView2, sLN sln, VVE vve, FrameLayout frameLayout) {
            this.lk = imageView;
            this.lc = view;
            this.ebl = textView;
            this.LD = textView2;
            this.OY = sln;
            this.ZU = vve;
            this.JXs = frameLayout;
        }

        public C0107Lxb(View view, NXR nxr) {
            this.lc = view;
            this.Lxb = nxr;
        }
    }

    private void Lxb(kqm kqmVar) {
        if (kqmVar.Lxb == 1) {
            lk();
        } else {
            JXs();
        }
    }

    public static kqm Lxb(int i, int i2) {
        try {
            return ((double) i2) >= Math.floor((((double) i) * 450.0d) / 600.0d) ? Lxb[1] : Lxb[0];
        } catch (Throwable unused) {
            return Lxb[0];
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.OY.Lxb
    public void Lxb() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.JXs;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.lk.lk lkVar = this.ZU;
        if (lkVar != null) {
            lkVar.Lxb();
        } else {
            TTDelegateActivity.Lxb(this.lk, this.IeN);
        }
    }
}
