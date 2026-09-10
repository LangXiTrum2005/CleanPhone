package com.smartdigimkt.expressad.splash.js;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdError;
import com.p004ironsource.d9;
import com.smartdigimkt.expressad.atsignalcommon.mraid.IMraidJSBridge;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.smartdigimkt.m6.b;
import com.smartdigimkt.u1.a;
import com.smartdigimkt.v0.n;
import com.smartdigimkt.x.d;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class SplashExpandDialog extends Dialog {
    private final String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private String f34719Y;
    private boolean Z;
    private FrameLayout e0;
    private WindVaneWebView f0;
    private TextView g0;
    private String h0;
    private List<d> i0;
    private a j0;
    private IMraidJSBridge k0;

    public SplashExpandDialog(Context context, Bundle bundle, a aVar) {
        super(context);
        this.X = "SplashExpandDialog";
        this.k0 = new IMraidJSBridge() { // from class: com.smartdigimkt.expressad.splash.js.SplashExpandDialog.4
            @Override // com.smartdigimkt.s4.b
            public void close() {
                SplashExpandDialog.this.dismiss();
            }

            @Override // com.smartdigimkt.s4.b
            public void expand(String str, boolean z2) {
            }

            @Override // com.smartdigimkt.expressad.atsignalcommon.mraid.IMraidJSBridge
            public d getMraidCampaign() {
                return null;
            }

            @Override // com.smartdigimkt.s4.b
            public void open(String str) {
                try {
                    if (SplashExpandDialog.this.f0 == null || System.currentTimeMillis() - SplashExpandDialog.this.f0.lastTouchTime <= com.smartdigimkt.r.a.f37982e || !com.smartdigimkt.r.a.a((d) SplashExpandDialog.this.i0.get(0), SplashExpandDialog.this.f0.getUrl(), com.smartdigimkt.r.a.f37981c)) {
                        if (SplashExpandDialog.this.i0.size() > 1) {
                            b.p().k().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            str = null;
                        }
                        if (SplashExpandDialog.this.j0 != null) {
                            SplashExpandDialog.this.j0.a(true, str);
                        }
                    }
                } catch (Throwable unused) {
                }
            }

            @Override // com.smartdigimkt.s4.b
            public void unload() {
                close();
            }

            @Override // com.smartdigimkt.s4.b
            public void useCustomClose(boolean z2) {
                try {
                    SplashExpandDialog.this.g0.setVisibility(z2 ? 4 : 0);
                } catch (Throwable unused) {
                }
            }
        };
        if (bundle != null) {
            this.f34719Y = bundle.getString("url");
            this.Z = bundle.getBoolean("shouldUseCustomClose");
        }
        this.j0 = aVar;
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

    public void setCampaignList(String str, List<d> list) {
        this.h0 = str;
        this.i0 = list;
    }

    private void b() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.e0 = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f0 = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.e0.addView(this.f0);
        TextView textView = new TextView(getContext());
        this.g0 = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.g0.setLayoutParams(layoutParams);
        this.g0.setVisibility(this.Z ? 4 : 0);
        this.g0.setOnClickListener(new View.OnClickListener() { // from class: com.smartdigimkt.expressad.splash.js.SplashExpandDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SplashExpandDialog.this.dismiss();
            }
        });
        this.e0.addView(this.g0);
        setContentView(this.e0);
        a();
        this.f0.setWebViewListener(new com.smartdigimkt.k.b() { // from class: com.smartdigimkt.expressad.splash.js.SplashExpandDialog.2
            @Override // com.smartdigimkt.k.b, com.smartdigimkt.u4.c
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                webView.evaluateJavascript("javascript:" + com.smartdigimkt.j5.b.a().b(), new ValueCallback<String>() { // from class: com.smartdigimkt.expressad.splash.js.SplashExpandDialog.2.1
                    @Override // android.webkit.ValueCallback
                    public void onReceiveValue(String str2) {
                    }
                });
                SplashExpandDialog.this.c();
            }
        });
        this.f0.setObject(this.k0);
        this.f0.loadUrl(this.f34719Y);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.smartdigimkt.expressad.splash.js.SplashExpandDialog.3
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                if (SplashExpandDialog.this.j0 != null) {
                    SplashExpandDialog.this.j0.a(false);
                    SplashExpandDialog.this.j0.close();
                }
                SplashExpandDialog.this.f0.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
                SplashExpandDialog.this.e0.removeView(SplashExpandDialog.this.f0);
                SplashExpandDialog.this.f0.release();
                SplashExpandDialog.this.f0 = null;
                SplashExpandDialog.this.j0 = null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        String str;
        try {
            int i2 = b.p().k().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            if (i2 == 2) {
                str = d9.h.C;
            } else {
                str = i2 == 1 ? d9.h.D : AdError.UNDEFINED_DOMAIN;
            }
            jSONObject.put("orientation", str);
            jSONObject.put("locked", com.p004ironsource.mediationsdk.metadata.a.g);
            float fG = n.g(b.p().k());
            float f = n.f(b.p().k());
            HashMap mapJ = n.j(b.p().k());
            int iIntValue = ((Integer) mapJ.get("width")).intValue();
            int iIntValue2 = ((Integer) mapJ.get("height")).intValue();
            HashMap map = new HashMap();
            map.put("placementType", "Interstitial");
            map.put("state", "expanded");
            map.put("viewable", com.p004ironsource.mediationsdk.metadata.a.g);
            map.put("currentAppOrientation", jSONObject);
            int[] iArr = new int[2];
            this.f0.getLocationInWindow(iArr);
            com.smartdigimkt.s4.a aVarA = com.smartdigimkt.s4.a.a();
            WindVaneWebView windVaneWebView = this.f0;
            aVarA.b(windVaneWebView, iArr[0], iArr[1], windVaneWebView.getWidth(), this.f0.getHeight());
            com.smartdigimkt.s4.a aVarA2 = com.smartdigimkt.s4.a.a();
            WindVaneWebView windVaneWebView2 = this.f0;
            aVarA2.a(windVaneWebView2, iArr[0], iArr[1], windVaneWebView2.getWidth(), this.f0.getHeight());
            com.smartdigimkt.s4.a.a().b(this.f0, fG, f);
            com.smartdigimkt.s4.a.a().a(this.f0, iIntValue, iIntValue2);
            com.smartdigimkt.s4.a.a().a(this.f0, map);
            com.smartdigimkt.s4.a.a().a(this.f0);
        } catch (Throwable unused) {
        }
    }

    private void a() {
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
}
