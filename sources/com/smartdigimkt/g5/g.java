package com.smartdigimkt.g5;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdError;
import com.p004ironsource.d9;
import com.smartdigimkt.sdk.basead.mraid.MraidBaseWebView;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class g extends Dialog {
    private final String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private String f35451Y;
    private boolean Z;
    private FrameLayout e0;
    private MraidBaseWebView f0;
    private TextView g0;
    private e h0;
    private com.smartdigimkt.s4.b i0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g.this.dismiss();
        }
    }

    public class b extends com.smartdigimkt.g5.b {

        public class a implements ValueCallback<String> {
            public a() {
            }

            @Override // android.webkit.ValueCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(String str) {
            }
        }

        public b() {
        }

        @Override // com.smartdigimkt.g5.b, com.smartdigimkt.u4.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            webView.evaluateJavascript("javascript:" + com.smartdigimkt.j5.b.a().b(), new a());
            g.this.b();
        }
    }

    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            g.this.f0.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
            g.this.e0.removeView(g.this.f0);
            g.this.f0.release();
            g.this.f0 = null;
            g.this.h0 = null;
        }
    }

    public class d implements com.smartdigimkt.s4.b {
        public d() {
        }

        @Override // com.smartdigimkt.s4.b
        public void close() {
            g.this.dismiss();
        }

        @Override // com.smartdigimkt.s4.b
        public void expand(String str, boolean z2) {
        }

        @Override // com.smartdigimkt.s4.b
        public void open(String str) {
            try {
                if (g.this.h0 != null) {
                    g.this.h0.open(str);
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
                g.this.g0.setVisibility(z2 ? 4 : 0);
            } catch (Throwable unused) {
            }
        }
    }

    public g(Context context, Bundle bundle, e eVar) {
        super(context);
        this.X = "BannerExpandDialog";
        this.i0 = new d();
        if (bundle != null) {
            this.f35451Y = bundle.getString("url");
            this.Z = bundle.getBoolean("shouldUseCustomClose");
        }
        this.h0 = eVar;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        String str;
        try {
            int i2 = com.smartdigimkt.m6.b.p().k().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            if (i2 == 2) {
                str = d9.h.C;
            } else {
                str = i2 == 1 ? d9.h.D : AdError.UNDEFINED_DOMAIN;
            }
            jSONObject.put("orientation", str);
            jSONObject.put("locked", com.p004ironsource.mediationsdk.metadata.a.g);
            float fD = com.smartdigimkt.n8.h.d(com.smartdigimkt.m6.b.p().k());
            float fC = com.smartdigimkt.n8.h.c(com.smartdigimkt.m6.b.p().k());
            HashMap mapE = com.smartdigimkt.n8.h.e(com.smartdigimkt.m6.b.p().k());
            int iIntValue = ((Integer) mapE.get("width")).intValue();
            int iIntValue2 = ((Integer) mapE.get("height")).intValue();
            HashMap map = new HashMap();
            map.put("placementType", "Interstitial");
            map.put("state", "expanded");
            map.put("viewable", com.p004ironsource.mediationsdk.metadata.a.g);
            map.put("currentAppOrientation", jSONObject);
            int[] iArr = new int[2];
            this.f0.getLocationInWindow(iArr);
            com.smartdigimkt.s4.a aVarA = com.smartdigimkt.s4.a.a();
            MraidBaseWebView mraidBaseWebView = this.f0;
            aVarA.b(mraidBaseWebView, iArr[0], iArr[1], mraidBaseWebView.getWidth(), this.f0.getHeight());
            com.smartdigimkt.s4.a aVarA2 = com.smartdigimkt.s4.a.a();
            MraidBaseWebView mraidBaseWebView2 = this.f0;
            aVarA2.a(mraidBaseWebView2, iArr[0], iArr[1], mraidBaseWebView2.getWidth(), this.f0.getHeight());
            com.smartdigimkt.s4.a.a().b(this.f0, fD, fC);
            com.smartdigimkt.s4.a.a().a(this.f0, iIntValue, iIntValue2);
            com.smartdigimkt.s4.a.a().a(this.f0, map);
            com.smartdigimkt.s4.a.a().a(this.f0);
        } catch (Throwable unused) {
        }
    }

    private void a() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.e0 = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        MraidBaseWebView mraidBaseWebView = new MraidBaseWebView(getContext().getApplicationContext());
        this.f0 = mraidBaseWebView;
        mraidBaseWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.e0.addView(this.f0);
        TextView textView = new TextView(getContext());
        this.g0 = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.g0.setLayoutParams(layoutParams);
        this.g0.setVisibility(this.Z ? 4 : 0);
        this.g0.setOnClickListener(new a());
        this.e0.addView(this.g0);
        setContentView(this.e0);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
        this.f0.setWebViewListener(new b());
        this.f0.setObject(this.i0);
        this.f0.loadUrl(this.f35451Y);
        setOnDismissListener(new c());
    }
}
