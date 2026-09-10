package com.bytedance.sdk.openadsdk.activity.single;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.component.utils.zf;
import com.bytedance.sdk.openadsdk.core.dw;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.model.tan;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.vr;
import com.bytedance.sdk.openadsdk.ka.aw;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes2.dex */
public class TTCeilingLandingPageActivity extends TTBaseLandingPageActivity {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private com.bytedance.sdk.component.jbs.di f18064co;
    private int di;
    private String fi;
    private dzy ik;
    private String ka;
    private wjv lr;
    private aw mj;
    ri ri;
    private com.bytedance.sdk.openadsdk.common.fi sf;
    private String xha;

    public interface ri {
        void ri();
    }

    private void ik() {
        dzy dzyVar = new dzy(this);
        this.ik = dzyVar;
        dzyVar.lr(this.f18064co).ik(this.ka).ka(this.fi).ri(this.lr).lr(this.di).ri(this.lr.hd()).fi(this.lr.uo()).ri(this.f18064co).lr("landingpage_split_ceiling");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!vr.fi()) {
            finish();
            return;
        }
        Intent intent = getIntent();
        this.di = intent.getIntExtra("source", -1);
        wjv wjvVarRi = dw.ri().ri(dw.ri(intent));
        this.lr = wjvVarRi;
        if (wjvVarRi == null) {
            finish();
            return;
        }
        this.xha = wjvVarRi.sf();
        this.ka = this.lr.tn();
        this.fi = this.lr.yjg();
        this.di = this.lr.eb().getDurationSlotType() != 7 ? 5 : 7;
        com.bytedance.sdk.openadsdk.core.di.ik ikVar = new com.bytedance.sdk.openadsdk.core.di.ik(this);
        ri(this, ikVar);
        setContentView(ikVar);
        ik();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.bytedance.sdk.component.jbs.di diVar = this.f18064co;
        if (diVar != null) {
            zf.ri(diVar);
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        aw awVar = this.mj;
        if (awVar != null) {
            awVar.mj();
        }
    }

    private void ri(Context context, FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.core.di.ka kaVar;
        this.f18064co = new com.bytedance.sdk.component.jbs.di(context, com.bytedance.sdk.component.jbs.di.ik.LANDING_PAGE);
        frameLayout.addView(this.f18064co, new FrameLayout.LayoutParams(-1, -1));
        View viewLr = com.bytedance.sdk.openadsdk.core.widget.di.lr(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = MaterialCardView.CHECKED_ICON_GRAVITY_TOP_END;
        layoutParams.topMargin = qd.lr(context, 18.0f);
        layoutParams.rightMargin = qd.lr(context, 18.0f);
        frameLayout.addView(viewLr, layoutParams);
        final int iXha = this.lr.su().xha();
        if (iXha != 3) {
            kaVar = new com.bytedance.sdk.openadsdk.core.di.ka(context);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(qd.lr(context, 28.0f), qd.lr(context, 28.0f));
            layoutParams2.gravity = MaterialCardView.CHECKED_ICON_GRAVITY_TOP_START;
            layoutParams2.topMargin = qd.lr(context, 18.0f);
            layoutParams2.leftMargin = qd.lr(context, 18.0f);
            int iLr = qd.lr(context, 5.0f);
            kaVar.setPadding(iLr, iLr, iLr, iLr);
            kaVar.setScaleType(ImageView.ScaleType.FIT_XY);
            kaVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.ka.ri());
            kaVar.setImageDrawable(uq.ik(context, "tt_white_lefterbackicon_titlebar"));
            frameLayout.addView(kaVar, layoutParams2);
        } else {
            kaVar = null;
        }
        com.bytedance.sdk.openadsdk.utils.uq.ri(this.f18064co, this.xha);
        final WebView webView = this.f18064co.getWebView();
        viewLr.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTCeilingLandingPageActivity.this.finish();
            }
        });
        aw awVar = new aw(this.lr, webView, true);
        this.mj = awVar;
        awVar.ri("landingpage_split_ceiling");
        final com.bytedance.sdk.openadsdk.core.widget.ri.di.ri riVar = this.mj.ri;
        if (kaVar != null) {
            kaVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    int i = iXha;
                    if (i == 1) {
                        TTCeilingLandingPageActivity.this.finish();
                    } else if (i != 2) {
                        return;
                    }
                    WebView webView2 = webView;
                    if (webView2 == null || !webView2.canGoBack()) {
                        TTCeilingLandingPageActivity.this.finish();
                        return;
                    }
                    webView.goBack();
                    com.bytedance.sdk.openadsdk.core.widget.ri.di.ri riVar2 = riVar;
                    if (riVar2 != null) {
                        riVar2.ri();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.common.fi fiVarRi = ig.ri(this.lr, this.f18064co, this, "landingpage_split_ceiling");
        this.sf = fiVarRi;
        if (fiVarRi != null) {
            fiVarRi.ri("landingpage_split_ceiling");
            this.sf.ri();
        }
        ig.ri(this.lr, this.f18064co, true);
        this.ri = new ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.3
            @Override // com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.ri
            public void ri() {
                if (TTCeilingLandingPageActivity.this.lr.su().mj() == tan.lr) {
                    TTCeilingLandingPageActivity.this.finish();
                }
            }
        };
        com.bytedance.sdk.openadsdk.core.widget.ri.fi fiVar = new com.bytedance.sdk.openadsdk.core.widget.ri.fi(this, this.ik, this.ka, this.sf, this.mj, true, true, this.ri) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.4
            @Override // com.bytedance.sdk.openadsdk.core.widget.ri.fi, android.webkit.WebViewClient
            public void onPageFinished(WebView webView2, String str) {
                super.onPageFinished(webView2, str);
            }
        };
        fiVar.ri(this.lr);
        com.bytedance.sdk.openadsdk.core.widget.ri.ka kaVar2 = new com.bytedance.sdk.openadsdk.core.widget.ri.ka(this.ik, this.mj, this.sf) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.ri.ka, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView2, int i) {
                super.onProgressChanged(webView2, i);
            }
        };
        com.bytedance.sdk.component.jbs.di diVar = this.f18064co;
        if (diVar != null) {
            diVar.setWebViewClient(fiVar);
            this.f18064co.setWebChromeClient(kaVar2);
        }
        if (webView != null) {
            webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.6
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (TTCeilingLandingPageActivity.this.mj == null) {
                        return false;
                    }
                    TTCeilingLandingPageActivity.this.mj.ri(motionEvent);
                    return false;
                }
            });
            webView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity.7
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    if (TTCeilingLandingPageActivity.this.mj != null) {
                        TTCeilingLandingPageActivity.this.mj.lr(i2);
                    }
                }
            });
        }
    }
}
