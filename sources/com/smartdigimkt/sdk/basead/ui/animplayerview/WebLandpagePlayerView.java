package com.smartdigimkt.sdk.basead.ui.animplayerview;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.TranslateAnimation;
import android.webkit.CookieSyncManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.api.IOfferClickHandler;
import com.smartdigimkt.sdk.basead.ui.web.BaseWebView;
import com.smartdigimkt.sdk.basead.ui.web.WebProgressBarView;
import com.smartdigimkt.sdk.core.common.res.image.RecycleImageView;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.w6.f;
import com.smartdigimkt.w6.g;
import com.smartdigimkt.w6.o;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
public class WebLandpagePlayerView extends BaseAnimPlayerView implements com.smartdigimkt.b6.b {
    private final int G0;
    private final int H0;
    private final int I0;
    private final int J0;
    LinearLayout K0;
    private TranslateAnimation L0;
    private TranslateAnimation M0;
    private TranslateAnimation N0;
    private WebView O0;
    int P0;
    int Q0;
    IOfferClickHandler R0;
    private com.smartdigimkt.b6.c S0;
    private ValueCallback<Uri[]> T0;
    private final int U0;
    int V0;
    String W0;
    boolean X0;
    private String Y0;
    private int Z0;
    private Map<String, JSONArray> a1;
    private boolean b1;

    public class a implements Runnable {
        final /* synthetic */ Context X;

        public a(Context context) {
            this.X = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            WebLandpagePlayerView.this.d(this.X);
            WebLandpagePlayerView.this.a(this.X);
        }
    }

    public class b implements Animation.AnimationListener {
        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (WebLandpagePlayerView.this.O0 != null) {
                WebLandpagePlayerView.this.O0.setVisibility(0);
            }
        }
    }

    public class c implements DownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f38464a;

        public c(Context context) {
            this.f38464a = context;
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            com.smartdigimkt.v6.a aVar;
            g gVar;
            if (!com.smartdigimkt.m6.b.p().y() && (aVar = WebLandpagePlayerView.this.u0) != null && (gVar = aVar.t) != null && gVar.p0() != 2) {
                WebLandpagePlayerView.this.b1 = true;
                try {
                    Toast.makeText(com.smartdigimkt.m6.b.p().k(), h.a(com.smartdigimkt.m6.b.p().k(), "myoffer_intercept_web_file_download", k.f38992h), 0).show();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            WebLandpagePlayerView webLandpagePlayerView = WebLandpagePlayerView.this;
            f fVar = webLandpagePlayerView.t0;
            if (fVar == null || webLandpagePlayerView.u0 == null || TextUtils.isEmpty(fVar.X())) {
                WebLandpagePlayerView.this.P0 = 11;
                com.smartdigimkt.o8.c.a(str);
            } else {
                WebLandpagePlayerView webLandpagePlayerView2 = WebLandpagePlayerView.this;
                IOfferClickHandler iOfferClickHandler = webLandpagePlayerView2.R0;
                if (iOfferClickHandler == null || !iOfferClickHandler.startDataFetchApp(this.f38464a, webLandpagePlayerView2.t0, webLandpagePlayerView2.u0, str)) {
                    WebLandpagePlayerView.this.Q0 = 2;
                    com.smartdigimkt.o8.c.a(str);
                    WebLandpagePlayerView.this.P0 = 7;
                } else {
                    WebLandpagePlayerView webLandpagePlayerView3 = WebLandpagePlayerView.this;
                    webLandpagePlayerView3.P0 = 6;
                    webLandpagePlayerView3.Q0 = 1;
                }
            }
            WebLandpagePlayerView.this.Z0 = 2;
        }
    }

    public class d extends WebChromeClient {
        public d() {
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            com.smartdigimkt.a6.f.a(WebLandpagePlayerView.this.getContext(), str, callback);
            super.onGeolocationPermissionsShowPrompt(str, callback);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            try {
                WebLandpagePlayerView.this.T0 = valueCallback;
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*", "audio/*"});
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("image/* video/* audio/*");
                if (!(WebLandpagePlayerView.this.getContext() instanceof Activity)) {
                    return true;
                }
                ((Activity) WebLandpagePlayerView.this.getContext()).startActivityForResult(Intent.createChooser(intent, "File Chooser"), 512);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (WebLandpagePlayerView.this.O0 != null) {
                o oVarG = com.smartdigimkt.q3.d.g(WebLandpagePlayerView.this.W0);
                WebLandpagePlayerView webLandpagePlayerView = WebLandpagePlayerView.this;
                webLandpagePlayerView.P0 = oVarG.f39601a;
                webLandpagePlayerView.O0.loadUrl(oVarG.d);
                WebLandpagePlayerView webLandpagePlayerView2 = WebLandpagePlayerView.this;
                webLandpagePlayerView2.recordRedirectUrl(webLandpagePlayerView2.O0.getUrl());
                if (WebLandpagePlayerView.this.K0.getAnimation() != null) {
                    WebLandpagePlayerView.this.K0.getAnimation().cancel();
                }
                WebLandpagePlayerView webLandpagePlayerView3 = WebLandpagePlayerView.this;
                webLandpagePlayerView3.K0.startAnimation(webLandpagePlayerView3.M0);
                WebLandpagePlayerView.this.O0.startAnimation(WebLandpagePlayerView.this.N0);
            }
        }
    }

    public WebLandpagePlayerView(Context context) {
        super(context, null);
        this.G0 = 1;
        this.H0 = 2;
        this.I0 = 3;
        this.J0 = 0;
        this.P0 = 8;
        this.Q0 = 0;
        this.T0 = null;
        this.U0 = 512;
        this.V0 = 0;
        this.X0 = false;
        this.Y0 = "";
        this.Z0 = 0;
        this.b1 = false;
    }

    private void e(Context context) {
        com.smartdigimkt.a6.f.a(this.O0, context, this);
        this.O0.setDownloadListener(new c(context));
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseAnimPlayerView
    public void c() {
    }

    @Override // com.smartdigimkt.b6.b
    public void callbackClickResult(o oVar) {
        this.P0 = oVar.f39601a;
        if (oVar.f39603c) {
            if (!oVar.f39602b) {
                this.V0 = 2;
            } else {
                this.V0 = 1;
                this.Z0 = 2;
            }
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseAnimPlayerView
    public void d() {
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseAnimPlayerView
    public void f() {
    }

    @Override // com.smartdigimkt.b6.b
    public f getBaseAdContent() {
        return this.t0;
    }

    @Override // com.smartdigimkt.b6.b
    public WebProgressBarView getWebProgressBarView() {
        return null;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseAnimPlayerView
    public void h() {
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseAnimPlayerView, com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public void init(f fVar, com.smartdigimkt.v6.a aVar, boolean z2, List<Bitmap> list, com.smartdigimkt.k5.d dVar) {
        super.init(fVar, aVar, z2, list, dVar);
        c(getContext());
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        Uri[] uriArr;
        if (i2 == 512) {
            try {
                if (this.T0 == null) {
                    return;
                }
                if (i3 != -1 || intent == null) {
                    uriArr = null;
                } else {
                    String dataString = intent.getDataString();
                    try {
                        ClipData clipData = intent.getClipData();
                        if (clipData != null) {
                            uriArr = new Uri[clipData.getItemCount()];
                            for (int i4 = 0; i4 < clipData.getItemCount(); i4++) {
                                try {
                                    uriArr[i4] = clipData.getItemAt(i4).getUri();
                                } catch (Throwable unused) {
                                }
                            }
                        } else {
                            uriArr = null;
                        }
                    } catch (Throwable unused2) {
                    }
                    if (dataString != null) {
                        uriArr = new Uri[]{Uri.parse(dataString)};
                    }
                }
                this.T0.onReceiveValue(uriArr);
                this.T0 = null;
            } catch (Throwable unused3) {
            }
        }
    }

    @Override // com.smartdigimkt.b6.b
    public void onWebFinish() {
    }

    @Override // com.smartdigimkt.b6.b
    public void onWebPageFinish(WebView webView, String str) {
        if (!TextUtils.isEmpty(str) && this.Z0 != 3) {
            this.Z0 = 2;
            JSONArray jSONArray = this.a1.get(str);
            if (jSONArray != null) {
                try {
                    jSONArray.put(1, "" + System.currentTimeMillis());
                    this.a1.put(str, jSONArray);
                } catch (JSONException unused) {
                }
            }
        }
        com.smartdigimkt.b6.c cVar = this.S0;
        if (cVar != null) {
            cVar.a(webView, str);
        }
    }

    @Override // com.smartdigimkt.b6.b
    public void onWebPageLoadError(WebView webView, String str) {
        this.Z0 = 3;
    }

    @Override // com.smartdigimkt.b6.b
    public void onWebPageStart(WebView webView, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.Z0 = 1;
        JSONArray jSONArray = this.a1.get(str);
        if (jSONArray != null) {
            try {
                jSONArray.put(0, "" + System.currentTimeMillis());
                jSONArray.put(1, "");
                this.a1.put(str, jSONArray);
            } catch (JSONException unused) {
            }
        }
    }

    public synchronized boolean openInternalWebView(String str, IOfferClickHandler iOfferClickHandler) {
        try {
            if (TextUtils.isEmpty(this.W0)) {
                this.W0 = str;
                this.R0 = iOfferClickHandler;
                post(new e());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.X0;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseAnimPlayerView, com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public void pause() {
        super.pause();
        if (this.O0 != null) {
            CookieSyncManager.getInstance().stopSync();
            this.O0.setWebChromeClient(null);
            com.smartdigimkt.a6.f.a(this.O0, getContext() instanceof Activity ? ((Activity) getContext()).isFinishing() : false);
        }
    }

    @Override // com.smartdigimkt.b6.b
    public void recordRedirectUrl(String str) {
        if (this.a1.size() > 0) {
            JSONArray jSONArray = this.a1.get(this.Y0);
            try {
                if (this.Z0 == 0 && jSONArray != null) {
                    if (TextUtils.isEmpty(jSONArray.getString(1))) {
                        jSONArray.put(1, "" + System.currentTimeMillis());
                    }
                    this.a1.put(this.Y0, jSONArray);
                }
            } catch (Throwable unused) {
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put("" + System.currentTimeMillis());
        jSONArray2.put("");
        this.a1.put(str, jSONArray2);
        this.Y0 = str;
        this.Z0 = 0;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseAnimPlayerView, com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public void release(int i2) {
        com.smartdigimkt.v6.a aVar;
        super.release(i2);
        WebView webView = this.O0;
        if (webView != null) {
            webView.setDownloadListener(null);
            this.O0.destroy();
        }
        this.O0 = null;
        f fVar = this.t0;
        if (fVar == null || (aVar = this.u0) == null) {
            return;
        }
        int iO = fVar.O();
        String strL = this.t0.L();
        Map<String, JSONArray> map = this.a1;
        int i3 = this.V0;
        int i4 = this.Q0;
        int i5 = this.P0;
        String str = this.W0;
        int i6 = this.u0.f39164b;
        String str2 = this.Y0;
        int i7 = this.Z0;
        if (i7 == 0) {
            i7 = 1;
        }
        com.smartdigimkt.i7.d.a(aVar, iO, strL, map, i3, i4, i5, str, i6, 1, 0L, str2, i7, this.b1);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseAnimPlayerView, com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public void start() {
        super.start();
        if (this.O0 != null) {
            CookieSyncManager.getInstance().startSync();
            this.O0.setWebChromeClient(new d());
            this.O0.onResume();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BaseAnimPlayerView, com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView
    public void stop() {
        super.stop();
    }

    @Override // com.smartdigimkt.b6.b
    public boolean supportDeeplinkJump() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context) {
        try {
            this.O0 = new BaseWebView(context);
            this.S0 = new com.smartdigimkt.b6.c(this.t0);
            this.O0.setBackgroundColor(-1);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, getMeasuredHeight());
            this.O0.setVisibility(8);
            addView(this.O0, layoutParams);
            com.smartdigimkt.a6.f.a(context);
            e(context);
            this.X0 = true;
        } catch (Throwable unused) {
            this.X0 = false;
        }
    }

    private void b(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        this.K0 = linearLayout;
        linearLayout.setGravity(1);
        this.K0.setOrientation(1);
        this.K0.setBackgroundColor(-1);
        RecycleImageView recycleImageView = new RecycleImageView(context);
        recycleImageView.setImageResource(h.a(getContext(), "myoffer_arrow_up", k.d));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(h.a(context, 9.0f), h.a(context, 9.0f));
        layoutParams.topMargin = h.a(context, 3.0f);
        this.K0.addView(recycleImageView, layoutParams);
        TextView textView = new TextView(context);
        textView.setText(h.a(getContext(), "myoffer_slide_hint", k.f38992h));
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(Color.parseColor("#000000"));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = h.a(context, 1.0f);
        this.K0.addView(textView, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, h.a(context, 54.0f));
        layoutParams3.addRule(12);
        layoutParams3.setMargins(0, 0, 0, 0);
        addView(this.K0, layoutParams3);
        if (this.L0 == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, h.a(context, 18.0f), 0.0f);
            this.L0 = translateAnimation;
            translateAnimation.setFillAfter(true);
            this.L0.setRepeatMode(2);
            this.L0.setRepeatCount(-1);
            this.L0.setInterpolator(new AnticipateInterpolator());
            this.L0.setDuration(600L);
        }
        this.K0.startAnimation(this.L0);
    }

    private void c(Context context) {
        a(getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels - h.a(context, 40.0f));
        this.a1 = new LinkedHashMap();
        b(context);
        post(new a(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        if (this.M0 == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -getMeasuredHeight());
            this.M0 = translateAnimation;
            translateAnimation.setFillAfter(true);
            this.M0.setDuration(1200L);
        }
        if (this.N0 == null) {
            TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, getMeasuredHeight(), 0.0f);
            this.N0 = translateAnimation2;
            translateAnimation2.setFillAfter(true);
            this.N0.setDuration(1200L);
            this.N0.setAnimationListener(new b());
        }
    }

    public WebLandpagePlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.G0 = 1;
        this.H0 = 2;
        this.I0 = 3;
        this.J0 = 0;
        this.P0 = 8;
        this.Q0 = 0;
        this.T0 = null;
        this.U0 = 512;
        this.V0 = 0;
        this.X0 = false;
        this.Y0 = "";
        this.Z0 = 0;
        this.b1 = false;
    }

    public WebLandpagePlayerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.G0 = 1;
        this.H0 = 2;
        this.I0 = 3;
        this.J0 = 0;
        this.P0 = 8;
        this.Q0 = 0;
        this.T0 = null;
        this.U0 = 512;
        this.V0 = 0;
        this.X0 = false;
        this.Y0 = "";
        this.Z0 = 0;
        this.b1 = false;
    }
}
