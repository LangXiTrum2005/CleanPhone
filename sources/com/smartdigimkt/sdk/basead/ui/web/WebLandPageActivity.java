package com.smartdigimkt.sdk.basead.ui.web;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieSyncManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.applovin.impl.Z;
import com.smartdigimkt.sdk.api.IOfferClickHandler;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.w6.o;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
public class WebLandPageActivity extends Activity implements com.smartdigimkt.b6.b {
    private static final int J0 = 343452;
    private com.smartdigimkt.b6.c A0;
    private int B0;
    JSONArray E0;
    long H0;
    private WebProgressBarView f0;
    private WebView g0;
    private ImageView h0;
    private ImageView i0;
    private TextView j0;
    private ValueAnimator l0;
    private Random m0;
    private int n0;
    private long o0;
    private Map<String, JSONArray> p0;
    private WebLoadFailRefrshView s0;
    private RelativeLayout t0;
    private com.smartdigimkt.w6.f w0;
    private com.smartdigimkt.v6.a x0;
    private String y0;
    private IOfferClickHandler z0;
    private final int X = 1;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final int f38574Y = 2;
    private final int Z = 3;
    private final int e0 = 0;
    int k0 = 8;
    private String q0 = "";
    private int r0 = 0;
    private boolean u0 = false;
    private boolean v0 = true;
    private ValueCallback<Uri[]> C0 = null;
    private final int D0 = 512;
    int F0 = 0;
    int G0 = 0;
    final long I0 = 2500;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (WebLandPageActivity.this.f0 == null || iIntValue % WebLandPageActivity.this.n0 != 0) {
                return;
            }
            WebLandPageActivity webLandPageActivity = WebLandPageActivity.this;
            webLandPageActivity.n0 = webLandPageActivity.m0.nextInt(12) + 3;
            WebLandPageActivity.this.f0.setProgress(iIntValue);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.j7.c.a(WebLandPageActivity.this.s0);
            if (WebLandPageActivity.this.g0 != null) {
                WebLandPageActivity.this.g0.reload();
            }
        }
    }

    public class c implements DownloadListener {
        public c() {
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            if (!com.smartdigimkt.m6.b.p().y() && WebLandPageActivity.this.x0 != null && WebLandPageActivity.this.x0.t != null && WebLandPageActivity.this.x0.t.p0() != 2) {
                WebLandPageActivity.this.u0 = true;
                try {
                    Toast.makeText(WebLandPageActivity.this.getApplicationContext(), com.smartdigimkt.n8.h.a(WebLandPageActivity.this.getApplicationContext(), "myoffer_intercept_web_file_download", k.f38992h), 0).show();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            if (WebLandPageActivity.this.w0 == null || WebLandPageActivity.this.x0 == null || TextUtils.isEmpty(WebLandPageActivity.this.w0.X())) {
                if (WebLandPageActivity.this.e()) {
                    WebLandPageActivity.this.b(str, 11);
                    return;
                }
                WebLandPageActivity.this.a(str, 11);
            } else if (WebLandPageActivity.this.z0 != null && WebLandPageActivity.this.z0 != null && WebLandPageActivity.this.z0.startDataFetchApp(WebLandPageActivity.this.getApplicationContext(), WebLandPageActivity.this.w0, WebLandPageActivity.this.x0, str)) {
                WebLandPageActivity webLandPageActivity = WebLandPageActivity.this;
                webLandPageActivity.k0 = 6;
                webLandPageActivity.G0 = 1;
            } else if (WebLandPageActivity.this.e()) {
                WebLandPageActivity.this.b(str, 7);
                return;
            } else {
                WebLandPageActivity webLandPageActivity2 = WebLandPageActivity.this;
                webLandPageActivity2.G0 = 2;
                webLandPageActivity2.a(str, 7);
            }
            WebLandPageActivity.this.r0 = 2;
            WebLandPageActivity.this.d();
        }
    }

    public class d implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38577a;

        public d(String str) {
            this.f38577a = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            com.smartdigimkt.i7.d.a(WebLandPageActivity.this.w0, WebLandPageActivity.this.x0, 3, WebLandPageActivity.this.H0 > 0, 2, this.f38577a);
        }
    }

    public class e implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f38579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f38580b;

        public e(int i2, String str) {
            this.f38579a = i2;
            this.f38580b = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            int i3 = this.f38579a;
            if (i3 == 7) {
                WebLandPageActivity.this.G0 = 2;
            }
            WebLandPageActivity.this.a(this.f38580b, i3);
            WebLandPageActivity.this.r0 = 2;
            com.smartdigimkt.i7.d.a(WebLandPageActivity.this.w0, WebLandPageActivity.this.x0, 3, WebLandPageActivity.this.H0 > 0, 1, this.f38580b);
            WebLandPageActivity.this.d();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (WebLandPageActivity.this.g0 == null || !WebLandPageActivity.this.g0.canGoBack()) {
                WebLandPageActivity.this.finish();
            } else {
                WebLandPageActivity.this.g0.goBack();
            }
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WebLandPageActivity.this.finish();
        }
    }

    public class h extends WebChromeClient {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                WebLandPageActivity.this.f0.setVisibility(8);
            }
        }

        public h() {
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            com.smartdigimkt.a6.f.a(WebLandPageActivity.this, str, callback);
            super.onGeolocationPermissionsShowPrompt(str, callback);
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i2) {
            if (WebLandPageActivity.this.f0 != null) {
                if (!WebLandPageActivity.this.l0.isRunning()) {
                    WebLandPageActivity.this.f0.setProgress(((i2 * 30) / 100) + 70);
                }
                if (i2 == 100) {
                    if (WebLandPageActivity.this.l0.isRunning()) {
                        WebLandPageActivity.this.l0.cancel();
                        WebLandPageActivity.this.f0.setProgress(100);
                    }
                    com.smartdigimkt.l7.b.a().b((Runnable) new a(), 200L);
                }
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            if (TextUtils.isEmpty(str) || WebLandPageActivity.this.j0 == null || WebLandPageActivity.this.j0.getText().toString().length() != 0) {
                return;
            }
            WebLandPageActivity.this.j0.setText(str);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            try {
                WebLandPageActivity.this.C0 = valueCallback;
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*", "audio/*"});
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("image/* video/* audio/*");
                WebLandPageActivity.this.startActivityForResult(Intent.createChooser(intent, "File Chooser"), 512);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    public class i implements DialogInterface.OnClickListener {
        public i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
            com.smartdigimkt.v6.a aVar = WebLandPageActivity.this.x0;
            int iO = WebLandPageActivity.this.w0.O();
            String strL = WebLandPageActivity.this.w0.L();
            WebLandPageActivity webLandPageActivity = WebLandPageActivity.this;
            com.smartdigimkt.i7.d.a(aVar, iO, strL, webLandPageActivity.E0, webLandPageActivity.q0, 1);
            WebLandPageActivity.this.d();
        }
    }

    public class j implements DialogInterface.OnClickListener {
        public j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
            com.smartdigimkt.v6.a aVar = WebLandPageActivity.this.x0;
            int iO = WebLandPageActivity.this.w0.O();
            String strL = WebLandPageActivity.this.w0.L();
            WebLandPageActivity webLandPageActivity = WebLandPageActivity.this;
            com.smartdigimkt.i7.d.a(aVar, iO, strL, webLandPageActivity.E0, webLandPageActivity.q0, 0);
        }
    }

    private void a(boolean z2) {
    }

    private void b(boolean z2) {
    }

    @Override // com.smartdigimkt.b6.b
    public void callbackClickResult(o oVar) {
        this.k0 = oVar.f39601a;
        if (oVar.f39603c) {
            if (oVar.f39602b) {
                this.F0 = 1;
                this.r0 = 2;
                d();
            } else {
                this.F0 = 2;
                if (oVar.f39604e) {
                    com.smartdigimkt.i7.d.a(this.w0, this.x0, 2, this.H0 > 0, 0, oVar.d);
                }
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.H0 = System.currentTimeMillis();
            this.v0 = true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public void finish() {
        com.smartdigimkt.w6.g gVar;
        com.smartdigimkt.v6.a aVar = this.x0;
        if (aVar == null || (gVar = aVar.t) == null || gVar.N1() != 1) {
            d();
            return;
        }
        try {
            AlertDialog.Builder builder = new AlertDialog.Builder(this, com.smartdigimkt.n8.h.a(this, "system_dialog", "style"));
            builder.setMessage(getString(com.smartdigimkt.n8.h.a(this, "web_land_page_dialog_title", k.f38992h))).setCancelable(true).setPositiveButton(getString(com.smartdigimkt.n8.h.a(this, "web_land_page_dialog_stay", k.f38992h)), new j()).setNegativeButton(getString(com.smartdigimkt.n8.h.a(this, "web_land_page_dialog_yes", k.f38992h)), new i());
            builder.create().show();
        } catch (Throwable unused) {
            d();
        }
    }

    @Override // com.smartdigimkt.b6.b
    public com.smartdigimkt.w6.f getBaseAdContent() {
        return this.w0;
    }

    @Override // com.smartdigimkt.b6.b
    public WebProgressBarView getWebProgressBarView() {
        return this.f0;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        Uri[] uriArr;
        if (i2 == 512) {
            try {
                if (this.C0 == null) {
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
                this.C0.onReceiveValue(uriArr);
                this.C0 = null;
            } catch (Throwable unused3) {
            }
            super.onActivityResult(i2, i3, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        WebView webView = this.g0;
        if (webView == null || !webView.canGoBack()) {
            super.onBackPressed();
        } else {
            this.g0.goBack();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o0 = SystemClock.elapsedRealtime();
        this.p0 = new LinkedHashMap();
        setResult(-1);
        f();
        String strK = this.y0;
        if (TextUtils.isEmpty(strK)) {
            com.smartdigimkt.w6.f fVar = this.w0;
            strK = fVar != null ? fVar.k() : "";
        }
        Context applicationContext = getApplicationContext();
        if (TextUtils.isEmpty(strK)) {
            Toast.makeText(applicationContext, com.smartdigimkt.n8.h.a(applicationContext, "basead_click_empty", k.f38992h), 0).show();
            this.r0 = 3;
            d();
            return;
        }
        if (this.v0) {
            o oVarA = com.smartdigimkt.q3.d.a(applicationContext, strK, getBaseAdContent());
            if (oVarA.f39602b) {
                callbackClickResult(oVarA);
                return;
            }
            callbackClickResult(oVarA);
        }
        RelativeLayout relativeLayoutA = a();
        this.t0 = relativeLayoutA;
        if (relativeLayoutA == null) {
            com.smartdigimkt.q3.d.f(strK);
            d();
        } else {
            setContentView(relativeLayoutA);
            c();
            com.smartdigimkt.a6.f.a(this);
            a(strK);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        com.smartdigimkt.v6.a aVar;
        super.onDestroy();
        ValueAnimator valueAnimator = this.l0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.l0 = null;
        }
        WebView webView = this.g0;
        if (webView != null) {
            webView.setDownloadListener(null);
            this.g0.destroy();
        }
        this.g0 = null;
        com.smartdigimkt.w6.f fVar = this.w0;
        if (fVar == null || (aVar = this.x0) == null) {
            return;
        }
        int iO = fVar.O();
        String strL = this.w0.L();
        Map<String, JSONArray> map = this.p0;
        int i2 = this.F0;
        int i3 = this.G0;
        int i4 = this.k0;
        String str = this.y0;
        int i5 = this.x0.f39164b;
        int i6 = this.B0;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.o0;
        String str2 = this.q0;
        int i7 = this.r0;
        if (i7 == 0) {
            i7 = 1;
        }
        com.smartdigimkt.i7.d.a(aVar, iO, strL, map, i2, i3, i4, str, i5, i6, jElapsedRealtime, str2, i7, this.u0);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        CookieSyncManager.getInstance().stopSync();
        WebView webView = this.g0;
        if (webView != null) {
            webView.setWebChromeClient(null);
            com.smartdigimkt.a6.f.a(this.g0, isFinishing());
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        CookieSyncManager.getInstance().startSync();
        WebView webView = this.g0;
        if (webView != null) {
            webView.setWebChromeClient(new h());
            this.g0.onResume();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // com.smartdigimkt.b6.b
    public void onWebFinish() {
        d();
    }

    @Override // com.smartdigimkt.b6.b
    public void onWebPageFinish(WebView webView, String str) {
        WebView webView2;
        WebLoadFailRefrshView webLoadFailRefrshView = this.s0;
        if (webLoadFailRefrshView != null && webLoadFailRefrshView.getParent() == null && (webView2 = this.g0) != null) {
            webView2.setVisibility(0);
        }
        a(webView.canGoBack());
        b(webView.canGoForward());
        if (!TextUtils.isEmpty(str) && this.r0 != 3 && TextUtils.equals(this.q0, str) && !isFinishing()) {
            this.r0 = 2;
            JSONArray jSONArray = this.p0.get(str);
            if (jSONArray != null) {
                try {
                    jSONArray.put(1, "" + System.currentTimeMillis());
                    this.p0.put(str, jSONArray);
                } catch (JSONException unused) {
                }
            }
        }
        com.smartdigimkt.b6.c cVar = this.A0;
        if (cVar != null) {
            cVar.a(webView, str);
        }
    }

    @Override // com.smartdigimkt.b6.b
    public void onWebPageLoadError(WebView webView, String str) {
        if (TextUtils.equals(this.q0, str)) {
            this.r0 = 3;
        }
        WebLoadFailRefrshView webLoadFailRefrshView = this.s0;
        if (webLoadFailRefrshView != null) {
            com.smartdigimkt.j7.c.a(webLoadFailRefrshView);
        } else {
            WebLoadFailRefrshView webLoadFailRefrshView2 = new WebLoadFailRefrshView(this);
            this.s0 = webLoadFailRefrshView2;
            WebView webView2 = this.g0;
            if (webView2 != null) {
                webLoadFailRefrshView2.setLayoutParams(webView2.getLayoutParams());
            }
            this.s0.setOnRefreshListener(new b());
        }
        WebView webView3 = this.g0;
        if (webView3 != null) {
            webView3.setVisibility(8);
        }
        this.t0.addView(this.s0);
    }

    @Override // com.smartdigimkt.b6.b
    public void onWebPageStart(WebView webView, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (TextUtils.equals(this.q0, str)) {
                this.r0 = 1;
            }
            JSONArray jSONArray = this.p0.get(str);
            if (jSONArray != null) {
                try {
                    jSONArray.put(0, "" + System.currentTimeMillis());
                    jSONArray.put(1, "");
                    this.p0.put(str, jSONArray);
                } catch (JSONException unused) {
                }
            }
        }
        WebLoadFailRefrshView webLoadFailRefrshView = this.s0;
        if (webLoadFailRefrshView != null) {
            com.smartdigimkt.j7.c.a(webLoadFailRefrshView);
        }
    }

    @Override // com.smartdigimkt.b6.b
    public void recordRedirectUrl(String str) {
        if (this.E0 == null) {
            this.E0 = new JSONArray();
        }
        this.E0.put(str);
        if (this.p0.size() > 0) {
            JSONArray jSONArray = this.p0.get(this.q0);
            try {
                if (this.r0 == 0 && jSONArray != null) {
                    if (TextUtils.isEmpty(jSONArray.getString(1))) {
                        jSONArray.put(1, "" + System.currentTimeMillis());
                    }
                    this.p0.put(this.q0, jSONArray);
                }
            } catch (Throwable unused) {
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put("" + System.currentTimeMillis());
        jSONArray2.put("");
        this.p0.put(str, jSONArray2);
        this.q0 = str;
        this.r0 = 0;
    }

    @Override // com.smartdigimkt.b6.b
    public boolean supportDeeplinkJump() {
        return this.v0;
    }

    private void c() {
        this.h0.setOnClickListener(new f());
        this.i0.setOnClickListener(new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            ((ViewGroup) getWindow().getDecorView()).removeAllViews();
        } catch (Throwable unused) {
        }
        super.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        return System.currentTimeMillis() - this.H0 > 2500;
    }

    private void f() {
        Intent intent = getIntent();
        if (intent != null) {
            try {
                Serializable serializableExtra = intent.getSerializableExtra("extra_offer_ad");
                if (serializableExtra != null && (serializableExtra instanceof com.smartdigimkt.w6.f)) {
                    com.smartdigimkt.w6.f fVar = (com.smartdigimkt.w6.f) serializableExtra;
                    this.w0 = fVar;
                    this.A0 = new com.smartdigimkt.b6.c(fVar);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                Serializable serializableExtra2 = intent.getSerializableExtra("extra_request_info");
                if (serializableExtra2 != null && (serializableExtra2 instanceof com.smartdigimkt.v6.a)) {
                    this.x0 = (com.smartdigimkt.v6.a) serializableExtra2;
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            try {
                Serializable serializableExtra3 = intent.getSerializableExtra("extra_click_handler");
                if (serializableExtra3 != null && (serializableExtra3 instanceof IOfferClickHandler)) {
                    this.z0 = (IOfferClickHandler) serializableExtra3;
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
            try {
                this.y0 = intent.getStringExtra("extra_target_url");
            } catch (Throwable th4) {
                th4.printStackTrace();
            }
            try {
                this.B0 = intent.getIntExtra("extra_enter_type", -1);
            } catch (Throwable th5) {
                th5.printStackTrace();
            }
            this.v0 = true;
            try {
                this.v0 = intent.getBooleanExtra("support_deeplink_jump", true);
            } catch (Throwable th6) {
                th6.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this, com.smartdigimkt.n8.h.a(this, "system_dialog", "style"));
        builder.setMessage(getString(com.smartdigimkt.n8.h.a(this, "web_download_file_confirm_title", k.f38992h))).setCancelable(true).setPositiveButton(getString(com.smartdigimkt.n8.h.a(this, "web_download_file_confirm", k.f38992h)), new e(i2, str)).setNegativeButton(getString(com.smartdigimkt.n8.h.a(this, "web_download_file_cancel", k.f38992h)), new d(str));
        builder.create().show();
    }

    public static void a(Context context, com.smartdigimkt.w6.c cVar) {
        Intent intent = new Intent();
        intent.setClass(context, WebLandPageActivity.class);
        intent.putExtra("extra_offer_ad", cVar.f39469c);
        intent.putExtra("extra_request_info", cVar.f39471h);
        intent.putExtra("extra_target_url", cVar.f);
        intent.putExtra("extra_enter_type", cVar.f39472i);
        intent.putExtra("support_deeplink_jump", cVar.k);
        IOfferClickHandler iOfferClickHandler = cVar.g;
        if (iOfferClickHandler != null) {
            intent.putExtra("extra_click_handler", iOfferClickHandler);
        }
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    private TextView b() {
        TextView textView = new TextView(this);
        new LinearLayout.LayoutParams(0, -2, 1.0f);
        textView.setPadding(com.smartdigimkt.n8.h.a((Context) this, 20.0f), 0, 0, com.smartdigimkt.n8.h.a((Context) this, 2.0f));
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(Color.parseColor("#666666"));
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        return textView;
    }

    public static void a(Context context, String str) {
        com.smartdigimkt.w6.c cVar = new com.smartdigimkt.w6.c();
        cVar.f = str;
        a(context, cVar);
    }

    private void a(String str) {
        com.smartdigimkt.a6.f.a(this.g0, this, this);
        this.g0.setDownloadListener(new c());
        o oVarG = com.smartdigimkt.q3.d.g(str);
        this.k0 = oVarG.f39601a;
        this.g0.loadUrl(oVarG.d);
        recordRedirectUrl(this.g0.getUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.smartdigimkt.o8.c.a(str);
        this.k0 = i2;
    }

    private RelativeLayout a() {
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setBackgroundColor(-1);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setId(J0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, com.smartdigimkt.n8.h.a((Context) this, 55.0f));
        layoutParams.addRule(10);
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
        int iA = com.smartdigimkt.n8.h.a((Context) this, 16.0f);
        linearLayout.setPadding(iA, 0, iA, 0);
        relativeLayout.addView(linearLayout);
        this.h0 = a(getResources().getDrawable(com.smartdigimkt.n8.h.a(this, "browser_left_icon", k.d)));
        this.i0 = a(getResources().getDrawable(com.smartdigimkt.n8.h.a(this, "browser_close_icon", k.d)));
        linearLayout.addView(this.h0);
        linearLayout.addView(this.i0);
        TextView textViewB = b();
        this.j0 = textViewB;
        linearLayout.addView(textViewB);
        try {
            this.g0 = new BaseWebView(getApplicationContext());
            this.g0.setLayoutParams(Z.g(-1, -1, 3, J0));
            relativeLayout.addView(this.g0);
            View view = new View(this);
            view.setBackgroundColor(-2434342);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, com.smartdigimkt.n8.h.a((Context) this, 1.0f));
            layoutParams2.addRule(3, J0);
            view.setLayoutParams(layoutParams2);
            relativeLayout.addView(view);
            WebProgressBarView webProgressBarView = new WebProgressBarView(this);
            this.f0 = webProgressBarView;
            webProgressBarView.setProgress(0);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, com.smartdigimkt.n8.h.a((Context) this, 4.0f));
            layoutParams3.addRule(3, J0);
            relativeLayout.addView(this.f0, layoutParams3);
            Random random = new Random();
            this.m0 = random;
            this.n0 = random.nextInt(12) + 3;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 70);
            this.l0 = valueAnimatorOfInt;
            valueAnimatorOfInt.setDuration(1000L);
            this.l0.addUpdateListener(new a());
            this.l0.start();
            return relativeLayout;
        } catch (Throwable unused) {
            return null;
        }
    }

    private ImageView a(Drawable drawable) {
        ImageView imageView = new ImageView(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(com.smartdigimkt.n8.h.a((Context) this, 48.0f), com.smartdigimkt.n8.h.a((Context) this, 48.0f));
        layoutParams.gravity = 16;
        layoutParams.rightMargin = com.smartdigimkt.n8.h.a((Context) this, 6.0f);
        imageView.setLayoutParams(layoutParams);
        int iA = com.smartdigimkt.n8.h.a((Context) this, 16.0f);
        imageView.setPadding(iA, iA, iA, iA);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(drawable);
        return imageView;
    }
}
