package com.bytedance.sdk.openadsdk.activity;

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
import androidx.media3.extractor.text.ttml.a;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.bjy;
import com.bytedance.sdk.openadsdk.common.fs;
import com.bytedance.sdk.openadsdk.common.jtx;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.rdp;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.bytedance.sdk.openadsdk.utils.rq;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class TTVideoLandingPageLink2Activity extends TTVideoLandingPageActivity implements com.bytedance.sdk.openadsdk.to.mml {
    private TextView car;
    private LinearLayout en;
    bjy gt;
    private boolean ijp;
    TTAdDislikeToast irn;
    private PAGLogoView kab;
    private long lte;
    private TextView mlb;
    private com.bytedance.sdk.openadsdk.common.mml nz;
    private com.bytedance.sdk.openadsdk.core.widget.qdl.mzz ra;
    private boolean sy;
    private View taz;
    private View tid;
    private fs zlt;
    private jtx zy;
    private boolean dk = false;
    final AtomicBoolean xi = new AtomicBoolean(false);
    final AtomicBoolean jjk = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public void exc() {
        TTAdDislikeToast tTAdDislikeToast;
        if (isFinishing() || (tTAdDislikeToast = this.irn) == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
    }

    private void jl() {
        try {
            if (this.gt == null) {
                bjy bjyVar = new bjy(this.mzz, this.jtx);
                this.gt = bjyVar;
                bjyVar.setDislikeSource("landing_page");
                this.gt.setCallback(new bjy.qdl() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.6
                    @Override // com.bytedance.sdk.openadsdk.common.bjy.qdl
                    public void qdl(View view) {
                        TTVideoLandingPageLink2Activity.this.xi.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.bjy.qdl
                    public void ud(View view) {
                        TTVideoLandingPageLink2Activity.this.xi.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.bjy.qdl
                    public void qdl(FilterWord filterWord) {
                        if (TTVideoLandingPageLink2Activity.this.jjk.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTVideoLandingPageLink2Activity.this.jjk.set(true);
                        TTVideoLandingPageLink2Activity.this.exc();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.gt);
            if (this.irn == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.mzz);
                this.irn = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "TTVideoLandingPageLink2Activity", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jtx() {
        fs fsVar = this.zlt;
        if (fsVar != null) {
            fsVar.ud();
        }
    }

    private void yt() {
        TTAdDislikeToast tTAdDislikeToast = this.irn;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        fs fsVar = this.zlt;
        if (fsVar != null) {
            fsVar.qdl();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        ljh ljhVar;
        com.bytedance.sdk.component.tvp.mo moVar;
        super.onCreate(bundle);
        if (!rdp.mzz() || (ljhVar = this.jtx) == null || (moVar = ((TTVideoLandingPageActivity) this).qdl) == null) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.common.mml mmlVarQdl = gy.qdl(ljhVar, moVar, this.mzz, this.kdv);
        this.nz = mmlVarQdl;
        if (mmlVarQdl != null) {
            mmlVarQdl.qdl("landingpage_split_screen");
        }
        this.ijp = yt.mml().kdv();
        if (((TTVideoLandingPageActivity) this).qdl.getWebView() != null) {
            ((TTVideoLandingPageActivity) this).qdl.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.1
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i2, int i3, int i4, int i5) {
                    com.bytedance.sdk.openadsdk.mml.fs fsVar = TTVideoLandingPageLink2Activity.this.ax;
                    if (fsVar != null) {
                        fsVar.ud(i3);
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.widget.qdl.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.widget.qdl.mzz(this.mzz, this.to, this.mo, this.nz, this.ax, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.7
            @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                try {
                    if (TTVideoLandingPageLink2Activity.this.taz != null && !TTVideoLandingPageLink2Activity.this.sy) {
                        TTVideoLandingPageLink2Activity.this.taz.setVisibility(8);
                    }
                    if (TTVideoLandingPageLink2Activity.this.en != null) {
                        TTVideoLandingPageLink2Activity.this.en.setVisibility(0);
                    }
                    TTVideoLandingPageLink2Activity.this.dk = true;
                    TTVideoLandingPageLink2Activity.this.jtx();
                    TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                    com.bytedance.sdk.openadsdk.mml.lnr.qdl(tTVideoLandingPageLink2Activity.jtx, tTVideoLandingPageLink2Activity.kdv, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.lte, true);
                } catch (Throwable unused) {
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                TTVideoLandingPageLink2Activity.this.lte = System.currentTimeMillis();
            }
        };
        this.ra = mzzVar;
        mzzVar.qdl(this.jtx);
        ((TTVideoLandingPageActivity) this).qdl.setWebViewClient(this.ra);
        ((TTVideoLandingPageActivity) this).qdl.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.qdl.mml(this.to, this.ax, this.nz) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.8
            @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mml, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i2) {
                super.onProgressChanged(webView, i2);
                if (TTVideoLandingPageLink2Activity.this.ijp && TTVideoLandingPageLink2Activity.this.zy != null && i2 == 100) {
                    TTVideoLandingPageLink2Activity.this.zy.qdl(webView, TTVideoLandingPageLink2Activity.this.cx);
                }
                if (TTVideoLandingPageLink2Activity.this.zlt != null) {
                    TTVideoLandingPageLink2Activity.this.zlt.qdl(i2);
                }
            }
        });
        TextView textView = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.jtx.djz);
        if (textView != null && this.jtx.aaj() != null) {
            textView.setText(this.jtx.aaj().mzz());
        }
        ljh ljhVar2 = this.jtx;
        rdp.lnr().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.9
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTVideoLandingPageLink2Activity.this.sy = true;
                    if (TTVideoLandingPageLink2Activity.this.zlt != null) {
                        TTVideoLandingPageLink2Activity.this.zlt.ud();
                    }
                    TTVideoLandingPageLink2Activity.this.tid.setVisibility(0);
                    if (TTVideoLandingPageLink2Activity.this.kab != null) {
                        TTVideoLandingPageLink2Activity.this.kab.setVisibility(0);
                    }
                    if (TTVideoLandingPageLink2Activity.this.dk) {
                        return;
                    }
                    TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                    com.bytedance.sdk.openadsdk.mml.lnr.qdl(tTVideoLandingPageLink2Activity.jtx, tTVideoLandingPageLink2Activity.kdv, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.lte, false);
                } catch (Exception unused) {
                }
            }
        }, (ljhVar2 == null || ljhVar2.aaj() == null) ? 10000L : this.jtx.aaj().qdl() * 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        jtx();
        if (!this.sy && this.ax != null && ((TTVideoLandingPageActivity) this).qdl != null && this.zlt.getVisibility() == 8) {
            this.ax.qdl(((TTVideoLandingPageActivity) this).qdl);
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bjy() {
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(this.jtx, "landingpage_split_screen", "click_video", (JSONObject) null);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    public View lnr() {
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.mo.mzz(this);
        if (Build.VERSION.SDK_INT >= 35) {
            mzzVar.setFitsSystemWindows(true);
        }
        mzzVar.setOrientation(1);
        mzzVar.setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar = new com.bytedance.sdk.openadsdk.core.mo.lnr(this);
        mzzVar.addView(lnrVar, new LinearLayout.LayoutParams(-1, ax.ud(this, 220.0f)));
        View lnrVar2 = new com.bytedance.sdk.openadsdk.core.mo.lnr(this);
        lnrVar2.setId(com.bytedance.sdk.openadsdk.utils.jtx.fco);
        lnrVar.addView(lnrVar2, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar2 = new com.bytedance.sdk.openadsdk.core.mo.mzz(this);
        mzzVar2.setOrientation(0);
        mzzVar2.setPadding(0, ax.ud(this, 20.0f), 0, 0);
        lnrVar.addView(mzzVar2, new FrameLayout.LayoutParams(-1, -2));
        View view = new View(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        mzzVar2.addView(view, layoutParams);
        com.bytedance.sdk.openadsdk.core.widget.bjy bjyVar = new com.bytedance.sdk.openadsdk.core.widget.bjy(this);
        bjyVar.setId(520093713);
        bjyVar.setGravity(17);
        bjyVar.setText(com.bytedance.sdk.component.utils.ljh.qdl(this, "tt_reward_feedback"));
        bjyVar.setTextColor(-1);
        bjyVar.setTextSize(2, 14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, ax.ud(this, 28.0f));
        int iUd = ax.ud(this, 16.0f);
        layoutParams2.rightMargin = iUd;
        layoutParams2.leftMargin = iUd;
        mzzVar2.addView(bjyVar, layoutParams2);
        com.bytedance.sdk.openadsdk.core.widget.rdp rdpVar = new com.bytedance.sdk.openadsdk.core.widget.rdp(this);
        rdpVar.setId(com.bytedance.sdk.openadsdk.utils.jtx.mrf);
        rdpVar.setPadding(ax.ud(this, 7.0f), ax.ud(this, 7.0f), ax.ud(this, 7.0f), ax.ud(this, 7.0f));
        rdpVar.setImageResource(com.bytedance.sdk.component.utils.ljh.mml(this, "tt_video_close_drawable"));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(ax.ud(this, 28.0f), ax.ud(this, 28.0f));
        layoutParams3.rightMargin = ax.ud(this, 12.0f);
        mzzVar2.addView(rdpVar, layoutParams3);
        com.bytedance.sdk.openadsdk.core.mo.wd wdVar = new com.bytedance.sdk.openadsdk.core.mo.wd(this);
        wdVar.setVisibility(8);
        wdVar.setId(com.bytedance.sdk.openadsdk.utils.jtx.gy);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = ax.ud(this, 10.0f);
        mzzVar.addView(wdVar, layoutParams4);
        com.bytedance.sdk.openadsdk.core.widget.qdl qdlVar = new com.bytedance.sdk.openadsdk.core.widget.qdl(this);
        qdlVar.setId(com.bytedance.sdk.openadsdk.utils.jtx.ax);
        qdlVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        qdlVar.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(ax.ud(this, 44.0f), ax.ud(this, 44.0f));
        layoutParams5.addRule(9);
        layoutParams5.leftMargin = ax.ud(this, 5.0f);
        wdVar.addView(qdlVar, layoutParams5);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(this);
        int i2 = com.bytedance.sdk.openadsdk.utils.jtx.ag;
        jpcVar.setId(i2);
        jpcVar.setBackground(rq.qdl(this, "tt_circle_solid_mian"));
        jpcVar.setGravity(17);
        jpcVar.setTextColor(-1);
        jpcVar.setTextSize(2, 19.0f);
        jpcVar.setTypeface(Typeface.DEFAULT_BOLD);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(ax.ud(this, 44.0f), ax.ud(this, 44.0f));
        layoutParams6.addRule(9);
        layoutParams6.leftMargin = ax.ud(this, 5.0f);
        wdVar.addView(jpcVar, layoutParams6);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar2 = new com.bytedance.sdk.openadsdk.core.mo.jpc(this);
        jpcVar2.setId(com.bytedance.sdk.openadsdk.utils.jtx.wc);
        jpcVar2.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        jpcVar2.setEllipsize(truncateAt);
        jpcVar2.setTextColor(Color.parseColor("#e5000000"));
        jpcVar2.setTextSize(2, 12.0f);
        RelativeLayout.LayoutParams layoutParamsF = a.f(-2, -2, 15);
        layoutParamsF.leftMargin = ax.ud(this, 5.0f);
        layoutParamsF.rightMargin = ax.ud(this, 80.0f);
        layoutParamsF.addRule(1, i2);
        wdVar.addView(jpcVar2, layoutParamsF);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar3 = new com.bytedance.sdk.openadsdk.core.mo.jpc(this);
        jpcVar3.setId(com.bytedance.sdk.openadsdk.utils.jtx.om);
        jpcVar3.setClickable(true);
        jpcVar3.setMaxLines(1);
        jpcVar3.setEllipsize(truncateAt);
        jpcVar3.setFocusable(true);
        jpcVar3.setGravity(17);
        jpcVar3.setText(com.bytedance.sdk.component.utils.ljh.qdl(this, "tt_video_mobile_go_detail"));
        jpcVar3.setTextColor(-1);
        jpcVar3.setTextSize(2, 14.0f);
        jpcVar3.setPadding(ax.ud(this, 2.0f), ax.ud(this, 2.0f), ax.ud(this, 2.0f), ax.ud(this, 2.0f));
        jpcVar3.setBackground(rq.qdl(this, "tt_ad_cover_btn_begin_bg"));
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(ax.ud(this, 90.0f), ax.ud(this, 36.0f));
        layoutParams7.addRule(11);
        layoutParams7.addRule(15);
        layoutParams7.rightMargin = ax.ud(this, 5.0f);
        wdVar.addView(jpcVar3, layoutParams7);
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar3 = new com.bytedance.sdk.openadsdk.core.mo.lnr(this);
        mzzVar.addView(lnrVar3, new LinearLayout.LayoutParams(-1, -1));
        View moVar = new com.bytedance.sdk.component.tvp.mo(this, com.bytedance.sdk.component.tvp.mo.lnr.LANDING_PAGE);
        moVar.setId(com.bytedance.sdk.openadsdk.utils.jtx.cx);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams8.topMargin = ax.ud(this, 2.0f);
        lnrVar3.addView(moVar, layoutParams8);
        com.bytedance.sdk.openadsdk.core.mo.wd wdVar2 = new com.bytedance.sdk.openadsdk.core.mo.wd(this);
        wdVar2.setId(com.bytedance.sdk.openadsdk.utils.jtx.yh);
        wdVar2.setBackgroundColor(Color.parseColor("#F8F8F8"));
        lnrVar3.addView(wdVar2, new FrameLayout.LayoutParams(-1, -1));
        View fsVar = new fs(this);
        fsVar.setId(com.bytedance.sdk.openadsdk.utils.jtx.wak);
        wdVar2.addView(fsVar, new RelativeLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar3 = new com.bytedance.sdk.openadsdk.core.mo.mzz(this);
        mzzVar3.setId(com.bytedance.sdk.openadsdk.utils.jtx.hzv);
        mzzVar3.setOrientation(1);
        mzzVar3.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams9.addRule(13);
        wdVar2.addView(mzzVar3, layoutParams9);
        com.bytedance.sdk.openadsdk.core.widget.yt ytVar = new com.bytedance.sdk.openadsdk.core.widget.yt(this);
        ytVar.setId(com.bytedance.sdk.openadsdk.utils.jtx.gt);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(ax.ud(this, 80.0f), ax.ud(this, 80.0f));
        layoutParams10.gravity = 17;
        mzzVar3.addView(ytVar, layoutParams10);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar4 = new com.bytedance.sdk.openadsdk.core.mo.jpc(this);
        jpcVar4.setId(com.bytedance.sdk.openadsdk.utils.jtx.irn);
        jpcVar4.setTextColor(Color.parseColor("#161823"));
        jpcVar4.setTextSize(0, ax.ud(this, 24.0f));
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams11.gravity = 17;
        layoutParams11.topMargin = ax.ud(this, 12.0f);
        mzzVar3.addView(jpcVar4, layoutParams11);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar5 = new com.bytedance.sdk.openadsdk.core.mo.jpc(this);
        jpcVar5.setId(com.bytedance.sdk.openadsdk.utils.jtx.xi);
        jpcVar5.setTextColor(Color.parseColor("#80161823"));
        jpcVar5.setTextSize(0, ax.ud(this, 16.0f));
        jpcVar5.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams12.gravity = 17;
        int iUd2 = ax.ud(this, 60.0f);
        layoutParams12.rightMargin = iUd2;
        layoutParams12.leftMargin = iUd2;
        layoutParams12.topMargin = ax.ud(this, 8.0f);
        mzzVar3.addView(jpcVar5, layoutParams12);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar6 = new com.bytedance.sdk.openadsdk.core.mo.jpc(this);
        jpcVar6.setId(com.bytedance.sdk.openadsdk.utils.jtx.jjk);
        jpcVar6.setGravity(17);
        jpcVar6.setTextColor(-1);
        jpcVar6.setText(com.bytedance.sdk.component.utils.ljh.qdl(this, "tt_video_mobile_go_detail"));
        jpcVar6.setBackground(rq.qdl(this, "tt_reward_video_download_btn_bg"));
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(ax.ud(this, 255.0f), ax.ud(this, 44.0f));
        layoutParams13.gravity = 17;
        layoutParams13.topMargin = ax.ud(this, 32.0f);
        mzzVar3.addView(jpcVar6, layoutParams13);
        PAGLogoView pAGLogoView = new PAGLogoView(this);
        this.kab = pAGLogoView;
        pAGLogoView.setId(com.bytedance.sdk.openadsdk.utils.jtx.zlt);
        this.kab.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams14 = new RelativeLayout.LayoutParams(-2, ax.ud(this, 14.0f));
        layoutParams14.addRule(12);
        layoutParams14.leftMargin = ax.ud(this, 18.0f);
        layoutParams14.bottomMargin = ax.ud(this, 61.0f);
        wdVar2.addView(this.kab, layoutParams14);
        View rdpVar2 = new com.bytedance.sdk.openadsdk.common.rdp(this, new com.bytedance.sdk.openadsdk.common.rdp.qdl() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.10
            @Override // com.bytedance.sdk.openadsdk.common.rdp.qdl
            public View qdl(Context context) {
                return new com.bytedance.sdk.openadsdk.common.wd(context);
            }
        });
        rdpVar2.setId(com.bytedance.sdk.openadsdk.utils.jtx.taz);
        FrameLayout.LayoutParams layoutParams15 = new FrameLayout.LayoutParams(-1, ax.ud(this, 48.0f));
        layoutParams15.gravity = 81;
        lnrVar3.addView(rdpVar2, layoutParams15);
        View rdpVar3 = new com.bytedance.sdk.openadsdk.common.rdp(this, new com.bytedance.sdk.openadsdk.common.rdp.qdl() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.11
            @Override // com.bytedance.sdk.openadsdk.common.rdp.qdl
            public View qdl(Context context) {
                return new com.bytedance.sdk.openadsdk.common.jpc(context);
            }
        });
        rdpVar3.setId(com.bytedance.sdk.openadsdk.utils.jtx.tid);
        FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-1, ax.ud(this, 44.0f));
        layoutParams16.gravity = 80;
        lnrVar3.addView(rdpVar3, layoutParams16);
        return mzzVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    public void mo() {
        if (!wd()) {
            try {
                ImageView imageView = new ImageView(this);
                imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                com.bytedance.sdk.openadsdk.jl.ud.ud().qdl(this.jtx.vm().get(0), imageView, this.jtx);
                this.fs.setVisibility(0);
                this.fs.removeAllViews();
                this.fs.addView(imageView);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        com.bytedance.sdk.openadsdk.mml.lnr.ud(TTVideoLandingPageLink2Activity.this.jtx, "landingpage_split_screen");
                    }
                });
                return;
            } catch (Exception unused) {
                return;
            }
        }
        super.mo();
        com.bytedance.sdk.openadsdk.core.exu.ud.mo moVar = this.rdp;
        if (moVar != null) {
            if (moVar.getNativeVideoController() != null) {
                this.rdp.getNativeVideoController().qdl(false);
                this.rdp.getNativeVideoController().mo(false);
                this.fs.setClickable(true);
                this.fs.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.3
                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() != 0) {
                            return false;
                        }
                        TTVideoLandingPageLink2Activity.this.bjy();
                        return false;
                    }
                });
            }
            this.rdp.getNativeVideoController().qdl(new com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.4
                @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl
                public void qdl() {
                }

                @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl
                public void ud(long j, int i2) {
                }

                @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl
                public void qdl(long j, int i2) {
                }

                @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl
                public void qdl(long j, long j2) {
                    if (TTVideoLandingPageLink2Activity.this.car != null) {
                        int iMax = (int) Math.max(0L, (j2 - j) / 1000);
                        TTVideoLandingPageLink2Activity.this.car.setText(String.valueOf(iMax));
                        if (iMax <= 0) {
                            TTVideoLandingPageLink2Activity.this.car.setVisibility(8);
                        }
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    public void mzz() {
        TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity;
        super.mzz();
        TextView textView = (TextView) findViewById(520093713);
        if (textView != null) {
            textView.setText(com.bytedance.sdk.component.utils.ljh.qdl(yt.qdl(), "tt_reward_feedback"));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.12
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTVideoLandingPageLink2Activity.this.rdp();
                }
            });
        }
        this.car = (TextView) findViewById(520093714);
        this.zlt = (fs) findViewById(com.bytedance.sdk.openadsdk.utils.jtx.wak);
        this.taz = findViewById(com.bytedance.sdk.openadsdk.utils.jtx.yh);
        this.tid = findViewById(com.bytedance.sdk.openadsdk.utils.jtx.hzv);
        TextView textView2 = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.jtx.irn);
        TextView textView3 = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.jtx.xi);
        com.bytedance.sdk.openadsdk.core.widget.yt ytVar = (com.bytedance.sdk.openadsdk.core.widget.yt) findViewById(com.bytedance.sdk.openadsdk.utils.jtx.gt);
        this.mlb = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.jtx.jjk);
        if (this.jtx.hcs() != null && !TextUtils.isEmpty(this.jtx.hcs().qdl())) {
            com.bytedance.sdk.openadsdk.jl.ud.ud().qdl(this.jtx.hcs(), ytVar, this.jtx);
        }
        textView2.setText(this.jtx.ca());
        textView3.setText(this.jtx.hvi());
        View viewFindViewById = findViewById(com.bytedance.sdk.openadsdk.utils.jtx.zlt);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.13
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity2 = TTVideoLandingPageLink2Activity.this;
                TTWebsiteActivity.qdl(tTVideoLandingPageLink2Activity2.mzz, tTVideoLandingPageLink2Activity2.jtx, tTVideoLandingPageLink2Activity2.kdv);
            }
        });
        if (viewFindViewById instanceof PAGLogoView) {
            ((PAGLogoView) viewFindViewById).initData(this.jtx);
        }
        com.bytedance.sdk.component.tvp.mo moVar = ((TTVideoLandingPageActivity) this).qdl;
        if (moVar != null && moVar.getWebView() != null) {
            gy.qdl(this.jtx, ((TTVideoLandingPageActivity) this).qdl);
        }
        boolean zKdv = yt.mml().kdv();
        this.ijp = zKdv;
        if (zKdv) {
            ((com.bytedance.sdk.openadsdk.common.rdp) findViewById(com.bytedance.sdk.openadsdk.utils.jtx.tid)).setVisibility(0);
            LinearLayout linearLayout = (LinearLayout) findViewById(com.bytedance.sdk.openadsdk.utils.jtx.kab);
            this.en = linearLayout;
            linearLayout.setVisibility(8);
            tTVideoLandingPageLink2Activity = this;
            tTVideoLandingPageLink2Activity.zy = new jtx(tTVideoLandingPageLink2Activity, this.en, ((TTVideoLandingPageActivity) this).qdl, this.jtx, "landingpage_split_screen");
            if (((TTVideoLandingPageActivity) tTVideoLandingPageLink2Activity).qdl.getWebView() != null) {
                ((TTVideoLandingPageActivity) tTVideoLandingPageLink2Activity).qdl.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.14
                    float qdl = 0.0f;

                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 0) {
                            this.qdl = motionEvent.getY();
                        }
                        com.bytedance.sdk.openadsdk.mml.fs fsVar = TTVideoLandingPageLink2Activity.this.ax;
                        if (fsVar != null) {
                            fsVar.qdl(motionEvent);
                        }
                        if (TTVideoLandingPageLink2Activity.this.nz != null) {
                            TTVideoLandingPageLink2Activity.this.nz.qdl(motionEvent);
                        }
                        if (motionEvent.getAction() == 2) {
                            float y = motionEvent.getY();
                            float f = this.qdl;
                            if (y - f > 8.0f) {
                                if (TTVideoLandingPageLink2Activity.this.zy != null) {
                                    TTVideoLandingPageLink2Activity.this.zy.qdl();
                                }
                                return false;
                            }
                            if (y - f < -8.0f && TTVideoLandingPageLink2Activity.this.zy != null) {
                                TTVideoLandingPageLink2Activity.this.zy.ud();
                            }
                        }
                        return false;
                    }
                });
            }
        } else {
            tTVideoLandingPageLink2Activity = this;
            if (((TTVideoLandingPageActivity) tTVideoLandingPageLink2Activity).qdl.getWebView() != null) {
                ((TTVideoLandingPageActivity) tTVideoLandingPageLink2Activity).qdl.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.2
                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        com.bytedance.sdk.openadsdk.mml.fs fsVar = TTVideoLandingPageLink2Activity.this.ax;
                        if (fsVar != null) {
                            fsVar.qdl(motionEvent);
                        }
                        if (TTVideoLandingPageLink2Activity.this.nz == null) {
                            return false;
                        }
                        TTVideoLandingPageLink2Activity.this.nz.qdl(motionEvent);
                        return false;
                    }
                });
            }
        }
        fs fsVar = tTVideoLandingPageLink2Activity.zlt;
        if (fsVar != null) {
            fsVar.qdl(tTVideoLandingPageLink2Activity.jtx);
        }
    }

    public void rdp() {
        if (isFinishing()) {
            return;
        }
        if (this.jjk.get()) {
            yt();
            return;
        }
        if (this.gt == null) {
            jl();
        }
        bjy bjyVar = this.gt;
        if (bjyVar != null) {
            bjyVar.qdl();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    public void rq() {
        super.rq();
        ljh ljhVar = this.jtx;
        if (ljhVar != null) {
            ljhVar.rq(true);
        }
        TextView textView = this.mlb;
        if (textView != null) {
            textView.setText(mml());
            this.mlb.setClickable(true);
            this.mlb.setOnClickListener(this.wak);
            this.mlb.setOnTouchListener(this.wak);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    public boolean wd() {
        int i2 = this.exu;
        return i2 == 5 || i2 == 15 || i2 == 50;
    }
}
