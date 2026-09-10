package com.mbridge.msdk.mbbanner.common.communication;

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
public class BannerExpandDialog extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f34396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FrameLayout f34397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WindVaneWebView f34398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f34399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f34400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<CampaignEx> f34401h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.listener.a f34402i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.mraid.b f34403j;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BannerExpandDialog.this.dismiss();
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
            BannerExpandDialog.this.a();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            BannerExpandDialog.this.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements DialogInterface.OnDismissListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (BannerExpandDialog.this.f34402i != null) {
                BannerExpandDialog.this.f34402i.a(false);
            }
            BannerExpandDialog.this.f34398e.loadDataWithBaseURL(null, "", "text/html", B5.O, null);
            BannerExpandDialog.this.f34397d.removeView(BannerExpandDialog.this.f34398e);
            BannerExpandDialog.this.f34398e.release();
            BannerExpandDialog.this.f34398e = null;
            BannerExpandDialog.this.f34402i = null;
        }
    }

    public BannerExpandDialog(Context context, Bundle bundle, com.mbridge.msdk.mbbanner.common.listener.a aVar) {
        super(context);
        this.f34394a = "BannerExpandDialog";
        this.f34403j = new e();
        if (bundle != null) {
            this.f34395b = bundle.getString("url");
            this.f34396c = bundle.getBoolean("shouldUseCustomClose");
        }
        this.f34402i = aVar;
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
        this.f34400g = str;
        this.f34401h = list;
    }

    private void b() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f34397d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f34398e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f34397d.addView(this.f34398e);
        TextView textView = new TextView(getContext());
        this.f34399f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f34399f.setLayoutParams(layoutParams);
        this.f34399f.setVisibility(this.f34396c ? 4 : 0);
        this.f34399f.setOnClickListener(new a());
        BitmapDrawable bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.n().a(this.f34400g, 296);
        if (bitmapDrawableA != null) {
            ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
            v0.a(imageView, bitmapDrawableA, this.f34397d.getResources().getDisplayMetrics());
            this.f34397d.addView(imageView, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f34397d.addView(this.f34399f);
        setContentView(this.f34397d);
        a();
        this.f34398e.setWebViewListener(new b());
        this.f34398e.setObject(this.f34403j);
        this.f34398e.loadUrl(this.f34395b);
        List<CampaignEx> list = this.f34401h;
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = this.f34401h.get(0);
            if (campaignEx != null) {
                b1.a(this.f34398e, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
            }
            if (campaignEx != null && campaignEx.getPrivacyButtonTemplateVisibility() != 0) {
                MBAdChoice mBAdChoice = new MBAdChoice(com.mbridge.msdk.foundation.controller.c.n().d());
                mBAdChoice.setCampaign(campaignEx);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(f2.c(12.0f), f2.c(12.0f));
                layoutParams2.gravity = 85;
                layoutParams2.bottomMargin = layoutParams.topMargin;
                layoutParams2.rightMargin = layoutParams.rightMargin;
                mBAdChoice.setFeedbackDialogEventListener(new c());
                this.f34397d.addView(mBAdChoice, layoutParams2);
            }
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
            this.f34398e.getLocationInWindow(iArr);
            com.mbridge.msdk.mbsignalcommon.mraid.a aVarA = com.mbridge.msdk.mbsignalcommon.mraid.a.a();
            WindVaneWebView windVaneWebView = this.f34398e;
            aVarA.b(windVaneWebView, iArr[0], iArr[1], windVaneWebView.getWidth(), this.f34398e.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a aVarA2 = com.mbridge.msdk.mbsignalcommon.mraid.a.a();
            WindVaneWebView windVaneWebView2 = this.f34398e;
            aVarA2.a(windVaneWebView2, iArr[0], iArr[1], windVaneWebView2.getWidth(), this.f34398e.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f34398e, fN, fM);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f34398e, iIntValue, iIntValue2);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f34398e, map);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f34398e);
        } catch (Throwable th2) {
            q0.b("BannerExpandDialog", "notifyMraid", th2);
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
            BannerExpandDialog.this.c();
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
            BannerExpandDialog.this.dismiss();
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public CampaignEx getMraidCampaign() {
            return null;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void open(String str) {
            try {
                if (BannerExpandDialog.this.f34398e == null || System.currentTimeMillis() - BannerExpandDialog.this.f34398e.lastTouchTime <= com.mbridge.msdk.click.utils.a.f31780d || !com.mbridge.msdk.click.utils.a.a((CampaignEx) BannerExpandDialog.this.f34401h.get(0), BannerExpandDialog.this.f34398e.getUrl(), com.mbridge.msdk.click.utils.a.f31777a)) {
                    q0.b("BannerExpandDialog", str);
                    if (BannerExpandDialog.this.f34401h.size() > 1) {
                        com.mbridge.msdk.foundation.controller.c.n().d().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        str = null;
                    }
                    if (BannerExpandDialog.this.f34402i != null) {
                        BannerExpandDialog.this.f34402i.a(true, str);
                    }
                }
            } catch (Throwable th2) {
                q0.b("BannerExpandDialog", "open", th2);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void unload() {
            close();
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void useCustomClose(boolean z10) {
            try {
                BannerExpandDialog.this.f34399f.setVisibility(z10 ? 4 : 0);
            } catch (Throwable th2) {
                q0.b("BannerExpandDialog", "useCustomClose", th2);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void expand(String str, boolean z10) {
        }
    }
}
