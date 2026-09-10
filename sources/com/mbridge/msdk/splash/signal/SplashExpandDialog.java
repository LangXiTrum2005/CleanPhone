package com.mbridge.msdk.splash.signal;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.B5;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.widget.MBAdChoice;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class SplashExpandDialog extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FrameLayout f35940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WindVaneWebView f35941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f35942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f35943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<CampaignEx> f35944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.splash.middle.a f35945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.mraid.b f35946j;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SplashExpandDialog.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements com.mbridge.msdk.foundation.feedback.a {
        public c() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            SplashExpandDialog.this.a();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            SplashExpandDialog.this.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements DialogInterface.OnDismissListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (SplashExpandDialog.this.f35945i != null) {
                SplashExpandDialog.this.f35945i.a(false);
                SplashExpandDialog.this.f35945i.close();
            }
            SplashExpandDialog.this.f35941e.loadDataWithBaseURL(null, "", "text/html", B5.O, null);
            SplashExpandDialog.this.f35940d.removeView(SplashExpandDialog.this.f35941e);
            SplashExpandDialog.this.f35941e.release();
            SplashExpandDialog.this.f35941e = null;
            SplashExpandDialog.this.f35945i = null;
        }
    }

    public SplashExpandDialog(Context context, Bundle bundle, com.mbridge.msdk.splash.middle.a aVar) {
        super(context);
        this.f35937a = "SplashExpandDialog";
        this.f35946j = new e();
        if (bundle != null) {
            this.f35938b = bundle.getString("url");
            this.f35939c = bundle.getBoolean("shouldUseCustomClose");
        }
        this.f35945i = aVar;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        b();
    }

    public void setCampaignList(String str, List<CampaignEx> list) {
        this.f35943g = str;
        this.f35944h = list;
    }

    private void b() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f35940d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f35941e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f35940d.addView(this.f35941e);
        TextView textView = new TextView(getContext());
        this.f35942f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f35942f.setLayoutParams(layoutParams);
        this.f35942f.setVisibility(this.f35939c ? 4 : 0);
        this.f35942f.setOnClickListener(new a());
        this.f35940d.addView(this.f35942f);
        setContentView(this.f35940d);
        a();
        this.f35941e.setWebViewListener(new b());
        this.f35941e.setObject(this.f35946j);
        this.f35941e.loadUrl(this.f35938b);
        List<CampaignEx> list = this.f35944h;
        if (list != null && !list.isEmpty()) {
            CampaignEx campaignEx = this.f35944h.get(0);
            if (campaignEx != null) {
                b1.a(this.f35941e, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
            }
            if (campaignEx != null && campaignEx.getPrivacyButtonTemplateVisibility() != 0) {
                MBAdChoice mBAdChoice = new MBAdChoice(com.mbridge.msdk.foundation.controller.c.n().d());
                mBAdChoice.setCampaign(campaignEx);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(f2.c(12.0f), f2.c(12.0f));
                layoutParams2.gravity = 85;
                layoutParams2.bottomMargin = layoutParams.topMargin;
                layoutParams2.rightMargin = layoutParams.rightMargin;
                mBAdChoice.setFeedbackDialogEventListener(new c());
                this.f35940d.addView(mBAdChoice, layoutParams2);
            }
        }
        BitmapDrawable bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.n().a(this.f35943g, 297);
        if (bitmapDrawableA != null) {
            ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
            v0.a(imageView, bitmapDrawableA, this.f35940d.getResources().getDisplayMetrics());
            this.f35940d.addView(imageView, new ViewGroup.LayoutParams(-1, -1));
        }
        setOnDismissListener(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        String str;
        try {
            int i10 = com.mbridge.msdk.foundation.controller.c.n().d().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            if (i10 == 2) {
                str = X3.i.C;
            } else {
                str = i10 == 1 ? X3.i.D : AdError.UNDEFINED_DOMAIN;
            }
            jSONObject.put("orientation", str);
            jSONObject.put("locked", com.ironsource.mediationsdk.metadata.a.f29610g);
            float fN = m0.n(com.mbridge.msdk.foundation.controller.c.n().d());
            float fM = m0.m(com.mbridge.msdk.foundation.controller.c.n().d());
            HashMap mapV = m0.v(com.mbridge.msdk.foundation.controller.c.n().d());
            int iIntValue = ((Integer) mapV.get("width")).intValue();
            int iIntValue2 = ((Integer) mapV.get("height")).intValue();
            HashMap map = new HashMap();
            map.put("placementType", "Interstitial");
            map.put("state", "expanded");
            map.put("viewable", com.ironsource.mediationsdk.metadata.a.f29610g);
            map.put("currentAppOrientation", jSONObject);
            int[] iArr = new int[2];
            this.f35941e.getLocationInWindow(iArr);
            com.mbridge.msdk.mbsignalcommon.mraid.a aVarA = com.mbridge.msdk.mbsignalcommon.mraid.a.a();
            WindVaneWebView windVaneWebView = this.f35941e;
            aVarA.b(windVaneWebView, iArr[0], iArr[1], windVaneWebView.getWidth(), this.f35941e.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a aVarA2 = com.mbridge.msdk.mbsignalcommon.mraid.a.a();
            WindVaneWebView windVaneWebView2 = this.f35941e;
            aVarA2.a(windVaneWebView2, iArr[0], iArr[1], windVaneWebView2.getWidth(), this.f35941e.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f35941e, fN, fM);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f35941e, iIntValue, iIntValue2);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f35941e, map);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f35941e);
        } catch (Throwable th2) {
            q0.b("SplashExpandDialog", "notifyMraid", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b extends com.mbridge.msdk.mbsignalcommon.listener.b {
        public b() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            webView.evaluateJavascript("javascript:" + com.mbridge.msdk.setting.util.a.a().b(), new a());
            SplashExpandDialog.this.c();
        }

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class a implements ValueCallback<String> {
            public a() {
            }

            @Override // android.webkit.ValueCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(String str) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements com.mbridge.msdk.mbsignalcommon.mraid.b {
        public e() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void close() {
            SplashExpandDialog.this.dismiss();
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public CampaignEx getMraidCampaign() {
            return null;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void open(String str) {
            try {
                if (SplashExpandDialog.this.f35941e == null || System.currentTimeMillis() - SplashExpandDialog.this.f35941e.lastTouchTime <= com.mbridge.msdk.click.utils.a.f31780d || !com.mbridge.msdk.click.utils.a.a((CampaignEx) SplashExpandDialog.this.f35944h.get(0), SplashExpandDialog.this.f35941e.getUrl(), com.mbridge.msdk.click.utils.a.f31777a)) {
                    q0.b("SplashExpandDialog", str);
                    if (SplashExpandDialog.this.f35944h.size() > 1) {
                        com.mbridge.msdk.foundation.controller.c.n().d().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        str = null;
                    }
                    if (SplashExpandDialog.this.f35945i != null) {
                        SplashExpandDialog.this.f35945i.a(true, str);
                    }
                }
            } catch (Throwable th2) {
                q0.b("SplashExpandDialog", "open", th2);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void unload() {
            close();
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void useCustomClose(boolean z10) {
            try {
                SplashExpandDialog.this.f35942f.setVisibility(z10 ? 4 : 0);
            } catch (Throwable th2) {
                q0.b("SplashExpandDialog", "useCustomClose", th2);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void expand(String str, boolean z10) {
        }
    }
}
