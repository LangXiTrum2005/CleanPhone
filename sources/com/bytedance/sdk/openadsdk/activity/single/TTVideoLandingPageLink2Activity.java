package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.bu;
import com.bytedance.sdk.openadsdk.common.co;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.vr;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.bgr;
import com.bytedance.sdk.openadsdk.ka.aw;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.bytedance.sdk.openadsdk.utils.sf;
import com.bytedance.sdk.openadsdk.utils.slm;
import com.ironsource.Ua;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TTVideoLandingPageLink2Activity extends TTVideoLandingPageActivity implements com.bytedance.sdk.openadsdk.sf.ka {
    TTAdDislikeToast bnj;
    private boolean gcp;
    private TextView nd;
    private View qh;
    private View rzk;
    private com.bytedance.sdk.openadsdk.core.widget.ri.fi saa;
    bu ta;
    private TextView tw;
    private com.bytedance.sdk.openadsdk.common.fi xe;
    private co xm;
    private PAGLogoView yjm;
    private long zb;
    private boolean aac = false;
    final AtomicBoolean siy = new AtomicBoolean(false);
    final AtomicBoolean whw = new AtomicBoolean(false);

    private void bu() {
        TTAdDislikeToast tTAdDislikeToast = this.bnj;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
    }

    private void nr() {
        try {
            if (this.ta == null) {
                bu buVar = new bu(this.fi, this.slm);
                this.ta = buVar;
                buVar.setDislikeSource("landing_page");
                this.ta.setCallback(new bu.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.4
                    @Override // com.bytedance.sdk.openadsdk.common.bu.ri
                    public void lr(View view) {
                        TTVideoLandingPageLink2Activity.this.siy.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.bu.ri
                    public void ri(View view) {
                        TTVideoLandingPageLink2Activity.this.siy.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.bu.ri
                    public void ri(FilterWord filterWord) {
                        if (TTVideoLandingPageLink2Activity.this.whw.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTVideoLandingPageLink2Activity.this.whw.set(true);
                        TTVideoLandingPageLink2Activity.this.tan();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.ta);
            if (this.bnj == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.fi);
                this.bnj = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "TTVideoLandingPageLink2Activity", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void slm() {
        co coVar = this.xm;
        if (coVar != null) {
            coVar.lr();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tan() {
        TTAdDislikeToast tTAdDislikeToast;
        if (isFinishing() || (tTAdDislikeToast = this.bnj) == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vr() {
        com.bytedance.sdk.openadsdk.ka.ik.ri(this.slm, "landingpage_split_screen", "click_video", (JSONObject) null);
    }

    public void bgr() {
        if (isFinishing()) {
            return;
        }
        if (this.whw.get()) {
            bu();
            return;
        }
        if (this.ta == null) {
            nr();
        }
        bu buVar = this.ta;
        if (buVar != null) {
            buVar.ri();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        co coVar = this.xm;
        if (coVar != null) {
            coVar.ri();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        wjv wjvVar;
        com.bytedance.sdk.component.jbs.di diVar;
        super.onCreate(bundle);
        if (!vr.fi() || (wjvVar = this.slm) == null || (diVar = ((TTVideoLandingPageActivity) this).ri) == null) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.common.fi fiVarRi = ig.ri(wjvVar, diVar, this.fi, this.hcw);
        this.xe = fiVarRi;
        if (fiVarRi != null) {
            fiVarRi.ri("landingpage_split_screen");
        }
        if (((TTVideoLandingPageActivity) this).ri.getWebView() != null) {
            ((TTVideoLandingPageActivity) this).ri.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.1
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    aw awVar = TTVideoLandingPageLink2Activity.this.srn;
                    if (awVar != null) {
                        awVar.lr(i2);
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.widget.ri.fi fiVar = new com.bytedance.sdk.openadsdk.core.widget.ri.fi(this.fi, this.mj, this.di, this.xe, this.srn, true) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                try {
                    if (TTVideoLandingPageLink2Activity.this.rzk != null && !TTVideoLandingPageLink2Activity.this.gcp) {
                        TTVideoLandingPageLink2Activity.this.rzk.setVisibility(8);
                    }
                    TTVideoLandingPageLink2Activity.this.aac = true;
                    TTVideoLandingPageLink2Activity.this.slm();
                    TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                    com.bytedance.sdk.openadsdk.ka.ik.ri(tTVideoLandingPageLink2Activity.slm, tTVideoLandingPageLink2Activity.hcw, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.zb, true);
                } catch (Throwable unused) {
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                TTVideoLandingPageLink2Activity.this.zb = System.currentTimeMillis();
            }
        };
        this.saa = fiVar;
        fiVar.ri(this.slm);
        ((TTVideoLandingPageActivity) this).ri.setWebViewClient(this.saa);
        ((TTVideoLandingPageActivity) this).ri.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.ri.ka(this.mj, this.srn, this.xe) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.ri.ka, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (TTVideoLandingPageLink2Activity.this.xm != null) {
                    TTVideoLandingPageLink2Activity.this.xm.ri(i);
                }
            }
        });
        TextView textView = (TextView) findViewById(slm.yj);
        if (textView != null && this.slm.ay() != null) {
            textView.setText(this.slm.ay().fi());
        }
        wjv wjvVar2 = this.slm;
        vr.ik().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.7
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTVideoLandingPageLink2Activity.this.gcp = true;
                    if (TTVideoLandingPageLink2Activity.this.xm != null) {
                        TTVideoLandingPageLink2Activity.this.xm.lr();
                    }
                    TTVideoLandingPageLink2Activity.this.qh.setVisibility(0);
                    if (TTVideoLandingPageLink2Activity.this.yjm != null) {
                        TTVideoLandingPageLink2Activity.this.yjm.setVisibility(0);
                    }
                    if (TTVideoLandingPageLink2Activity.this.aac) {
                        return;
                    }
                    TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                    com.bytedance.sdk.openadsdk.ka.ik.ri(tTVideoLandingPageLink2Activity.slm, tTVideoLandingPageLink2Activity.hcw, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.zb, false);
                } catch (Exception unused) {
                }
            }
        }, (wjvVar2 == null || wjvVar2.ay() == null) ? Ua.s : this.slm.ay().ri() * 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        slm();
        if (!this.gcp && this.srn != null && ((TTVideoLandingPageActivity) this).ri != null && this.xm.getVisibility() == 8) {
            this.srn.ri(((TTVideoLandingPageActivity) this).ri);
        }
        super.onDestroy();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    public void di() {
        if (!xha()) {
            try {
                ImageView imageView = new ImageView(this);
                imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                com.bytedance.sdk.openadsdk.ac.lr.lr().ri(this.slm.rbz().get(0), imageView, this.slm);
                this.f18067co.setVisibility(0);
                this.f18067co.removeAllViews();
                this.f18067co.addView(imageView);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        com.bytedance.sdk.openadsdk.ka.ik.lr(TTVideoLandingPageLink2Activity.this.slm, "landingpage_split_screen");
                    }
                });
                return;
            } catch (Exception unused) {
                return;
            }
        }
        super.di();
        com.bytedance.sdk.openadsdk.core.bgr.lr.di diVar = this.bgr;
        if (diVar != null) {
            if (diVar.getNativeVideoController() != null) {
                this.bgr.getNativeVideoController().ri(false);
                this.bgr.getNativeVideoController().di(false);
                this.f18067co.setClickable(true);
                this.f18067co.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.12
                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() != 0) {
                            return false;
                        }
                        TTVideoLandingPageLink2Activity.this.vr();
                        return false;
                    }
                });
            }
            this.bgr.getNativeVideoController().ri(new euthanasia.attabal.wireman() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.2
                @Override // euthanasia.attabal.wireman
                public void ri() {
                }

                @Override // euthanasia.attabal.wireman
                public void ri(long j, int i) {
                }

                @Override // euthanasia.attabal.wireman
                public void ri(long j, long j2) {
                    if (TTVideoLandingPageLink2Activity.this.tw != null) {
                        int iMax = (int) Math.max(0L, (j2 - j) / 1000);
                        TTVideoLandingPageLink2Activity.this.tw.setText(String.valueOf(iMax));
                        if (iMax <= 0) {
                            TTVideoLandingPageLink2Activity.this.tw.setVisibility(8);
                        }
                    }
                }

                @Override // euthanasia.attabal.wireman
                public void lr(long j, int i) {
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    public void fi() {
        super.fi();
        TextView textView = (TextView) findViewById(520093713);
        if (textView != null) {
            textView.setText(uq.ri(nr.ri(), "tt_reward_feedback"));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTVideoLandingPageLink2Activity.this.bgr();
                }
            });
        }
        this.tw = (TextView) findViewById(520093714);
        this.xm = (co) findViewById(slm.bnj);
        this.rzk = findViewById(slm.ta);
        this.qh = findViewById(slm.ig);
        TextView textView2 = (TextView) findViewById(slm.whw);
        TextView textView3 = (TextView) findViewById(slm.xm);
        com.bytedance.sdk.openadsdk.core.widget.bu buVar = (com.bytedance.sdk.openadsdk.core.widget.bu) findViewById(slm.siy);
        this.nd = (TextView) findViewById(slm.rzk);
        if (this.slm.fb() != null && !TextUtils.isEmpty(this.slm.fb().ri())) {
            com.bytedance.sdk.openadsdk.ac.lr.lr().ri(this.slm.fb(), buVar, this.slm);
        }
        textView2.setText(this.slm.tpb());
        textView3.setText(this.slm.tq());
        View viewFindViewById = findViewById(slm.qh);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                TTWebsiteActivity.ri(tTVideoLandingPageLink2Activity.fi, tTVideoLandingPageLink2Activity.slm, tTVideoLandingPageLink2Activity.hcw);
            }
        });
        if (viewFindViewById instanceof PAGLogoView) {
            ((PAGLogoView) viewFindViewById).initData(this.slm);
        }
        com.bytedance.sdk.component.jbs.di diVar = ((TTVideoLandingPageActivity) this).ri;
        if (diVar != null && diVar.getWebView() != null) {
            ig.ri(this.slm, ((TTVideoLandingPageActivity) this).ri);
        }
        if (((TTVideoLandingPageActivity) this).ri.getWebView() != null) {
            ((TTVideoLandingPageActivity) this).ri.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.11
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    aw awVar = TTVideoLandingPageLink2Activity.this.srn;
                    if (awVar != null) {
                        awVar.ri(motionEvent);
                    }
                    if (TTVideoLandingPageLink2Activity.this.xe == null) {
                        return false;
                    }
                    TTVideoLandingPageLink2Activity.this.xe.ri(motionEvent);
                    return false;
                }
            });
        }
        co coVar = this.xm;
        if (coVar != null) {
            coVar.ri(this.slm);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    public View ik() {
        com.bytedance.sdk.openadsdk.core.di.fi fiVar = new com.bytedance.sdk.openadsdk.core.di.fi(this);
        if (Build.VERSION.SDK_INT >= 35) {
            fiVar.setFitsSystemWindows(true);
        }
        fiVar.setOrientation(1);
        fiVar.setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.di.ik ikVar = new com.bytedance.sdk.openadsdk.core.di.ik(this);
        fiVar.addView(ikVar, new LinearLayout.LayoutParams(-1, qd.lr(this, 220.0f)));
        View ikVar2 = new com.bytedance.sdk.openadsdk.core.di.ik(this);
        ikVar2.setId(slm.qd);
        ikVar.addView(ikVar2, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.di.fi fiVar2 = new com.bytedance.sdk.openadsdk.core.di.fi(this);
        fiVar2.setOrientation(0);
        fiVar2.setPadding(0, qd.lr(this, 20.0f), 0, 0);
        ikVar.addView(fiVar2, new FrameLayout.LayoutParams(-1, -2));
        View view = new View(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        fiVar2.addView(view, layoutParams);
        com.bytedance.sdk.openadsdk.core.widget.vr vrVar = new com.bytedance.sdk.openadsdk.core.widget.vr(this);
        vrVar.setId(520093713);
        vrVar.setGravity(17);
        vrVar.setText(uq.ri(this, "tt_reward_feedback"));
        vrVar.setTextColor(-1);
        vrVar.setTextSize(2, 14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, qd.lr(this, 28.0f));
        int iLr = qd.lr(this, 16.0f);
        layoutParams2.rightMargin = iLr;
        layoutParams2.leftMargin = iLr;
        fiVar2.addView(vrVar, layoutParams2);
        bgr bgrVar = new bgr(this);
        bgrVar.setId(slm.srn);
        bgrVar.setPadding(qd.lr(this, 7.0f), qd.lr(this, 7.0f), qd.lr(this, 7.0f), qd.lr(this, 7.0f));
        bgrVar.setImageResource(uq.ka(this, "tt_video_close_drawable"));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(qd.lr(this, 28.0f), qd.lr(this, 28.0f));
        layoutParams3.rightMargin = qd.lr(this, 12.0f);
        fiVar2.addView(bgrVar, layoutParams3);
        com.bytedance.sdk.openadsdk.core.di.xha xhaVar = new com.bytedance.sdk.openadsdk.core.di.xha(this);
        xhaVar.setVisibility(8);
        xhaVar.setId(slm.jc);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = qd.lr(this, 10.0f);
        fiVar.addView(xhaVar, layoutParams4);
        com.bytedance.sdk.openadsdk.core.widget.ri riVar = new com.bytedance.sdk.openadsdk.core.widget.ri(this);
        riVar.setId(slm.kt);
        riVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        riVar.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(qd.lr(this, 44.0f), qd.lr(this, 44.0f));
        layoutParams5.addRule(9);
        layoutParams5.leftMargin = qd.lr(this, 5.0f);
        xhaVar.addView(riVar, layoutParams5);
        com.bytedance.sdk.openadsdk.core.di.mj mjVar = new com.bytedance.sdk.openadsdk.core.di.mj(this);
        int i = slm.feb;
        mjVar.setId(i);
        mjVar.setBackground(sf.ri(this, "tt_circle_solid_mian"));
        mjVar.setGravity(17);
        mjVar.setTextColor(-1);
        mjVar.setTextSize(2, 19.0f);
        mjVar.setTypeface(Typeface.DEFAULT_BOLD);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(qd.lr(this, 44.0f), qd.lr(this, 44.0f));
        layoutParams6.addRule(9);
        layoutParams6.leftMargin = qd.lr(this, 5.0f);
        xhaVar.addView(mjVar, layoutParams6);
        com.bytedance.sdk.openadsdk.core.di.mj mjVar2 = new com.bytedance.sdk.openadsdk.core.di.mj(this);
        mjVar2.setId(slm.zyn);
        mjVar2.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        mjVar2.setEllipsize(truncateAt);
        mjVar2.setTextColor(Color.parseColor("#e5000000"));
        mjVar2.setTextSize(2, 12.0f);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(15);
        layoutParams7.leftMargin = qd.lr(this, 5.0f);
        layoutParams7.rightMargin = qd.lr(this, 80.0f);
        layoutParams7.addRule(1, i);
        xhaVar.addView(mjVar2, layoutParams7);
        com.bytedance.sdk.openadsdk.core.di.mj mjVar3 = new com.bytedance.sdk.openadsdk.core.di.mj(this);
        mjVar3.setId(slm.tnn);
        mjVar3.setClickable(true);
        mjVar3.setMaxLines(1);
        mjVar3.setEllipsize(truncateAt);
        mjVar3.setFocusable(true);
        mjVar3.setGravity(17);
        mjVar3.setText(uq.ri(this, "tt_video_mobile_go_detail"));
        mjVar3.setTextColor(-1);
        mjVar3.setTextSize(2, 14.0f);
        mjVar3.setPadding(qd.lr(this, 2.0f), qd.lr(this, 2.0f), qd.lr(this, 2.0f), qd.lr(this, 2.0f));
        mjVar3.setBackground(sf.ri(this, "tt_ad_cover_btn_begin_bg"));
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(qd.lr(this, 90.0f), qd.lr(this, 36.0f));
        layoutParams8.addRule(11);
        layoutParams8.addRule(15);
        layoutParams8.rightMargin = qd.lr(this, 5.0f);
        xhaVar.addView(mjVar3, layoutParams8);
        com.bytedance.sdk.openadsdk.core.di.ik ikVar3 = new com.bytedance.sdk.openadsdk.core.di.ik(this);
        fiVar.addView(ikVar3, new LinearLayout.LayoutParams(-1, -1));
        View diVar = new com.bytedance.sdk.component.jbs.di(this, com.bytedance.sdk.component.jbs.di.ik.LANDING_PAGE);
        diVar.setId(slm.fe);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams9.topMargin = qd.lr(this, 2.0f);
        ikVar3.addView(diVar, layoutParams9);
        com.bytedance.sdk.openadsdk.core.di.xha xhaVar2 = new com.bytedance.sdk.openadsdk.core.di.xha(this);
        xhaVar2.setId(slm.ta);
        xhaVar2.setBackgroundColor(Color.parseColor("#F8F8F8"));
        ikVar3.addView(xhaVar2, new FrameLayout.LayoutParams(-1, -1));
        View coVar = new co(this);
        coVar.setId(slm.bnj);
        xhaVar2.addView(coVar, new RelativeLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.di.fi fiVar3 = new com.bytedance.sdk.openadsdk.core.di.fi(this);
        fiVar3.setId(slm.ig);
        fiVar3.setOrientation(1);
        fiVar3.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams10.addRule(13);
        xhaVar2.addView(fiVar3, layoutParams10);
        com.bytedance.sdk.openadsdk.core.widget.bu buVar = new com.bytedance.sdk.openadsdk.core.widget.bu(this);
        buVar.setId(slm.siy);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(qd.lr(this, 80.0f), qd.lr(this, 80.0f));
        layoutParams11.gravity = 17;
        fiVar3.addView(buVar, layoutParams11);
        com.bytedance.sdk.openadsdk.core.di.mj mjVar4 = new com.bytedance.sdk.openadsdk.core.di.mj(this);
        mjVar4.setId(slm.whw);
        mjVar4.setTextColor(Color.parseColor("#161823"));
        mjVar4.setTextSize(0, qd.lr(this, 24.0f));
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams12.gravity = 17;
        layoutParams12.topMargin = qd.lr(this, 12.0f);
        fiVar3.addView(mjVar4, layoutParams12);
        com.bytedance.sdk.openadsdk.core.di.mj mjVar5 = new com.bytedance.sdk.openadsdk.core.di.mj(this);
        mjVar5.setId(slm.xm);
        mjVar5.setTextColor(Color.parseColor("#80161823"));
        mjVar5.setTextSize(0, qd.lr(this, 16.0f));
        mjVar5.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams13.gravity = 17;
        int iLr2 = qd.lr(this, 60.0f);
        layoutParams13.rightMargin = iLr2;
        layoutParams13.leftMargin = iLr2;
        layoutParams13.topMargin = qd.lr(this, 8.0f);
        fiVar3.addView(mjVar5, layoutParams13);
        com.bytedance.sdk.openadsdk.core.di.mj mjVar6 = new com.bytedance.sdk.openadsdk.core.di.mj(this);
        mjVar6.setId(slm.rzk);
        mjVar6.setGravity(17);
        mjVar6.setTextColor(-1);
        mjVar6.setText(uq.ri(this, "tt_video_mobile_go_detail"));
        mjVar6.setBackground(sf.ri(this, "tt_reward_video_download_btn_bg"));
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(qd.lr(this, 255.0f), qd.lr(this, 44.0f));
        layoutParams14.gravity = 17;
        layoutParams14.topMargin = qd.lr(this, 32.0f);
        fiVar3.addView(mjVar6, layoutParams14);
        PAGLogoView pAGLogoView = new PAGLogoView(this);
        this.yjm = pAGLogoView;
        pAGLogoView.setId(slm.qh);
        this.yjm.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-2, qd.lr(this, 14.0f));
        layoutParams15.addRule(12);
        layoutParams15.leftMargin = qd.lr(this, 18.0f);
        layoutParams15.bottomMargin = qd.lr(this, 61.0f);
        xhaVar2.addView(this.yjm, layoutParams15);
        View vrVar2 = new com.bytedance.sdk.openadsdk.common.vr(this, new com.bytedance.sdk.openadsdk.common.vr.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageLink2Activity.8
            @Override // com.bytedance.sdk.openadsdk.common.vr.ri
            public View ri(Context context) {
                return new com.bytedance.sdk.openadsdk.common.mj(context);
            }
        });
        vrVar2.setId(slm.gcp);
        FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-1, qd.lr(this, 48.0f));
        layoutParams16.gravity = 81;
        ikVar3.addView(vrVar2, layoutParams16);
        return fiVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    public void sf() {
        super.sf();
        wjv wjvVar = this.slm;
        if (wjvVar != null) {
            wjvVar.bgr(true);
        }
        TextView textView = this.nd;
        if (textView != null) {
            textView.setText(ka());
            this.nd.setClickable(true);
            this.nd.setOnClickListener(this.fe);
            this.nd.setOnTouchListener(this.fe);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity
    public boolean xha() {
        int i = this.aw;
        return i == 5 || i == 15 || i == 50;
    }
}
