package com.thinkup.core.basead.ui.web;

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
import com.smartdigimkt.v0.k;
import com.thinkup.core.api.IOfferClickHandler;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.oo0o;
import com.thinkup.core.common.on.oom;
import com.thinkup.core.common.on.oon;
import com.thinkup.core.common.on.ooo;
import com.thinkup.core.common.oo0.oo;
import com.thinkup.core.common.ooo.moo;
import com.thinkup.core.common.ooo.o00;
import com.thinkup.core.common.ooo.om0;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
public class WebLandPageActivity extends Activity implements m {
    private static final int on = 343452;
    JSONArray m;
    private n m00;
    private int m0o;
    private WebProgressBarView n0;
    private ImageView nm;
    private ImageView nn;
    private WebView no;
    private TextView o00;
    private Random o0m;
    private int o0n;
    private ValueAnimator o0o;
    private WebLoadFailRefrshView om0;
    private RelativeLayout omo;
    private ooo on0;
    private String onm;
    private IOfferClickHandler onn;
    private oom ono;
    long oo;
    private long oo0;
    private Map<String, JSONArray> ooo;
    private final int m0 = 1;
    private final int mo = 2;
    private final int mm = 3;
    private final int mn = 0;
    int o = 8;
    private String oom = "";
    private int oon = 0;
    private boolean omm = false;
    private boolean omn = true;
    private ValueCallback<Uri[]> m0m = null;
    private final int m0n = 512;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f41806n = 0;
    int o0 = 0;
    final long om = 2500;

    /* JADX INFO: renamed from: com.thinkup.core.basead.ui.web.WebLandPageActivity$3, reason: invalid class name */
    public class AnonymousClass3 implements DownloadListener {
        public AnonymousClass3() {
        }

        @Override // android.webkit.DownloadListener
        public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            o0n.m();
            if (WebLandPageActivity.this.ono != null && WebLandPageActivity.this.ono.oo0 != null && WebLandPageActivity.this.ono.oo0.mmo() != 2) {
                WebLandPageActivity.o0(WebLandPageActivity.this);
                try {
                    Toast.makeText(WebLandPageActivity.this.getApplicationContext(), o00.o(WebLandPageActivity.this.getApplicationContext(), "myoffer_intercept_web_file_download", k.f38992h), 0).show();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            if (WebLandPageActivity.this.on0 == null || WebLandPageActivity.this.ono == null || TextUtils.isEmpty(WebLandPageActivity.this.on0.oo0())) {
                if (WebLandPageActivity.on(WebLandPageActivity.this)) {
                    WebLandPageActivity.o(WebLandPageActivity.this, str, 11);
                    return;
                }
                WebLandPageActivity.m(WebLandPageActivity.this, str, 11);
            } else if (WebLandPageActivity.this.onn != null && WebLandPageActivity.this.onn != null && WebLandPageActivity.this.onn.startDataFetchApp(WebLandPageActivity.this.getApplicationContext(), WebLandPageActivity.this.on0, WebLandPageActivity.this.ono, str)) {
                WebLandPageActivity webLandPageActivity = WebLandPageActivity.this;
                webLandPageActivity.o = 6;
                webLandPageActivity.o0 = 1;
            } else if (WebLandPageActivity.on(WebLandPageActivity.this)) {
                WebLandPageActivity.o(WebLandPageActivity.this, str, 7);
                return;
            } else {
                WebLandPageActivity webLandPageActivity2 = WebLandPageActivity.this;
                webLandPageActivity2.o0 = 2;
                WebLandPageActivity.m(webLandPageActivity2, str, 7);
            }
            WebLandPageActivity.m0(WebLandPageActivity.this);
            WebLandPageActivity.this.mo();
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.basead.ui.web.WebLandPageActivity$4, reason: invalid class name */
    public class AnonymousClass4 implements DialogInterface.OnClickListener {
        final /* synthetic */ String o;

        public AnonymousClass4(String str) {
            this.o = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i2) {
            oo.o(WebLandPageActivity.this.on0, WebLandPageActivity.this.ono, 3, WebLandPageActivity.this.oo > 0, 2, this.o);
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.basead.ui.web.WebLandPageActivity$5, reason: invalid class name */
    public class AnonymousClass5 implements DialogInterface.OnClickListener {
        final /* synthetic */ String m;
        final /* synthetic */ int o;

        public AnonymousClass5(int i2, String str) {
            this.o = i2;
            this.m = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i2) {
            int i3 = this.o;
            if (i3 == 7) {
                WebLandPageActivity.this.o0 = 2;
            }
            WebLandPageActivity.m(WebLandPageActivity.this, this.m, i3);
            WebLandPageActivity.m0(WebLandPageActivity.this);
            oo.o(WebLandPageActivity.this.on0, WebLandPageActivity.this.ono, 3, WebLandPageActivity.this.oo > 0, 1, this.m);
            WebLandPageActivity.this.mo();
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.basead.ui.web.WebLandPageActivity$6, reason: invalid class name */
    public class AnonymousClass6 implements View.OnClickListener {
        public AnonymousClass6() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (WebLandPageActivity.this.no == null || !WebLandPageActivity.this.no.canGoBack()) {
                WebLandPageActivity.this.finish();
            } else {
                WebLandPageActivity.this.no.goBack();
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.basead.ui.web.WebLandPageActivity$7, reason: invalid class name */
    public class AnonymousClass7 implements View.OnClickListener {
        public AnonymousClass7() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            WebLandPageActivity.this.finish();
        }
    }

    public static /* synthetic */ int m0(WebLandPageActivity webLandPageActivity) {
        webLandPageActivity.oon = 2;
        return 2;
    }

    public static /* synthetic */ boolean o0(WebLandPageActivity webLandPageActivity) {
        webLandPageActivity.omm = true;
        return true;
    }

    private static void om() {
    }

    private static void on() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.oo = System.currentTimeMillis();
            this.omn = true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public void finish() {
        oon oonVar;
        oom oomVar = this.ono;
        if (oomVar != null && (oonVar = oomVar.oo0) != null && oonVar.on() == 1) {
            try {
                AlertDialog.Builder builder = new AlertDialog.Builder(this, o00.o(this, "system_dialog", "style"));
                builder.setMessage(getString(o00.o(this, "web_land_page_dialog_title", k.f38992h))).setCancelable(true).setPositiveButton(getString(o00.o(this, "web_land_page_dialog_stay", k.f38992h)), new DialogInterface.OnClickListener() { // from class: com.thinkup.core.basead.ui.web.WebLandPageActivity.10
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        dialogInterface.dismiss();
                        oom oomVar2 = WebLandPageActivity.this.ono;
                        int iO = WebLandPageActivity.this.on0.o();
                        String strMo = WebLandPageActivity.this.on0.mo();
                        WebLandPageActivity webLandPageActivity = WebLandPageActivity.this;
                        oo.o(oomVar2, iO, strMo, webLandPageActivity.m, webLandPageActivity.oom, 0);
                    }
                }).setNegativeButton(getString(o00.o(this, "web_land_page_dialog_yes", k.f38992h)), new DialogInterface.OnClickListener() { // from class: com.thinkup.core.basead.ui.web.WebLandPageActivity.9
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        dialogInterface.dismiss();
                        oom oomVar2 = WebLandPageActivity.this.ono;
                        int iO = WebLandPageActivity.this.on0.o();
                        String strMo = WebLandPageActivity.this.on0.mo();
                        WebLandPageActivity webLandPageActivity = WebLandPageActivity.this;
                        oo.o(oomVar2, iO, strMo, webLandPageActivity.m, webLandPageActivity.oom, 1);
                        WebLandPageActivity.this.mo();
                    }
                });
                builder.create().show();
                return;
            } catch (Throwable unused) {
            }
        }
        mo();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        Uri[] uriArr;
        if (i2 == 512) {
            try {
                if (this.m0m == null) {
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
                this.m0m.onReceiveValue(uriArr);
                this.m0m = null;
            } catch (Throwable unused3) {
            }
            super.onActivityResult(i2, i3, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        WebView webView = this.no;
        if (webView == null || !webView.canGoBack()) {
            super.onBackPressed();
        } else {
            this.no.goBack();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.oo0 = SystemClock.elapsedRealtime();
        this.ooo = new LinkedHashMap();
        setResult(-1);
        Intent intent = getIntent();
        if (intent != null) {
            try {
                Serializable serializableExtra = intent.getSerializableExtra("extra_offer_ad");
                if (serializableExtra != null && (serializableExtra instanceof ooo)) {
                    ooo oooVar = (ooo) serializableExtra;
                    this.on0 = oooVar;
                    this.m00 = new n(oooVar);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                Serializable serializableExtra2 = intent.getSerializableExtra("extra_request_info");
                if (serializableExtra2 != null && (serializableExtra2 instanceof oom)) {
                    this.ono = (oom) serializableExtra2;
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            try {
                Serializable serializableExtra3 = intent.getSerializableExtra("extra_click_handler");
                if (serializableExtra3 != null && (serializableExtra3 instanceof IOfferClickHandler)) {
                    this.onn = (IOfferClickHandler) serializableExtra3;
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
            try {
                this.onm = intent.getStringExtra("extra_target_url");
            } catch (Throwable th4) {
                th4.printStackTrace();
            }
            try {
                this.m0o = intent.getIntExtra("extra_enter_type", -1);
            } catch (Throwable th5) {
                th5.printStackTrace();
            }
            this.omn = true;
            try {
                this.omn = intent.getBooleanExtra("support_deeplink_jump", true);
            } catch (Throwable th6) {
                th6.printStackTrace();
            }
        }
        String strO0n = this.onm;
        if (TextUtils.isEmpty(strO0n)) {
            ooo oooVar2 = this.on0;
            strO0n = oooVar2 != null ? oooVar2.o0n() : "";
        }
        Context applicationContext = getApplicationContext();
        if (TextUtils.isEmpty(strO0n)) {
            Toast.makeText(applicationContext, o00.o(applicationContext, "basead_click_empty", k.f38992h), 0).show();
            this.oon = 3;
            mo();
            return;
        }
        if (this.omn) {
            oo0o oo0oVarO = com.thinkup.core.basead.o.n.o(applicationContext, strO0n, this.on0);
            if (oo0oVarO.no) {
                o(oo0oVarO);
                return;
            }
            o(oo0oVarO);
        }
        RelativeLayout relativeLayoutMm = mm();
        this.omo = relativeLayoutMm;
        if (relativeLayoutMm == null) {
            com.thinkup.core.basead.o.n.m(strO0n);
            mo();
            return;
        }
        setContentView(relativeLayoutMm);
        this.nm.setOnClickListener(new AnonymousClass6());
        this.nn.setOnClickListener(new AnonymousClass7());
        CookieSyncManager.createInstance(this);
        CookieSyncManager.getInstance().startSync();
        com.thinkup.core.basead.ui.o.o.o(this.no, this, this);
        this.no.setDownloadListener(new AnonymousClass3());
        oo0o oo0oVarO2 = com.thinkup.core.basead.o.n.o(strO0n);
        this.o = oo0oVarO2.n0;
        this.no.loadUrl(oo0oVarO2.nn);
        o(this.no.getUrl());
    }

    @Override // android.app.Activity
    public void onDestroy() {
        oom oomVar;
        super.onDestroy();
        ValueAnimator valueAnimator = this.o0o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.o0o = null;
        }
        WebView webView = this.no;
        if (webView != null) {
            webView.setDownloadListener(null);
            this.no.destroy();
        }
        this.no = null;
        ooo oooVar = this.on0;
        if (oooVar == null || (oomVar = this.ono) == null) {
            return;
        }
        int iO = oooVar.o();
        String strMo = this.on0.mo();
        Map<String, JSONArray> map = this.ooo;
        int i2 = this.f41806n;
        int i3 = this.o0;
        int i4 = this.o;
        String str = this.onm;
        int i5 = this.ono.m;
        int i6 = this.m0o;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.oo0;
        String str2 = this.oom;
        int i7 = this.oon;
        if (i7 == 0) {
            i7 = 1;
        }
        oo.o(oomVar, iO, strMo, map, i2, i3, i4, str, i5, i6, jElapsedRealtime, str2, i7, this.omm);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        CookieSyncManager.getInstance().stopSync();
        WebView webView = this.no;
        if (webView != null) {
            webView.setWebChromeClient(null);
            WebView webView2 = this.no;
            if (isFinishing()) {
                webView2.stopLoading();
                webView2.loadUrl("");
            }
            webView2.onPause();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        CookieSyncManager.getInstance().startSync();
        WebView webView = this.no;
        if (webView != null) {
            webView.setWebChromeClient(new WebChromeClient() { // from class: com.thinkup.core.basead.ui.web.WebLandPageActivity.8
                @Override // android.webkit.WebChromeClient
                public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
                    com.thinkup.core.basead.ui.o.o.o(WebLandPageActivity.this, str, callback);
                    super.onGeolocationPermissionsShowPrompt(str, callback);
                }

                @Override // android.webkit.WebChromeClient
                public final void onProgressChanged(WebView webView2, int i2) {
                    if (WebLandPageActivity.this.n0 != null) {
                        if (!WebLandPageActivity.this.o0o.isRunning()) {
                            WebLandPageActivity.this.n0.setProgress(((i2 * 30) / 100) + 70);
                        }
                        if (i2 == 100) {
                            if (WebLandPageActivity.this.o0o.isRunning()) {
                                WebLandPageActivity.this.o0o.cancel();
                                WebLandPageActivity.this.n0.setProgress(100);
                            }
                            o0n.m().o(new Runnable() { // from class: com.thinkup.core.basead.ui.web.WebLandPageActivity.8.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    WebLandPageActivity.this.n0.setVisibility(8);
                                }
                            }, 200L);
                        }
                    }
                }

                @Override // android.webkit.WebChromeClient
                public final void onReceivedTitle(WebView webView2, String str) {
                    super.onReceivedTitle(webView2, str);
                    if (TextUtils.isEmpty(str) || WebLandPageActivity.this.o00 == null || WebLandPageActivity.this.o00.getText().toString().length() != 0) {
                        return;
                    }
                    WebLandPageActivity.this.o00.setText(str);
                }

                @Override // android.webkit.WebChromeClient
                public final boolean onShowFileChooser(WebView webView2, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                    try {
                        WebLandPageActivity.this.m0m = valueCallback;
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
            });
            this.no.onResume();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
    }

    private void m0() {
        this.nm.setOnClickListener(new AnonymousClass6());
        this.nn.setOnClickListener(new AnonymousClass7());
    }

    private RelativeLayout mm() {
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setBackgroundColor(-1);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setId(on);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, o00.o((Context) this, 55.0f));
        layoutParams.addRule(10);
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
        int iO = o00.o((Context) this, 16.0f);
        linearLayout.setPadding(iO, 0, iO, 0);
        relativeLayout.addView(linearLayout);
        this.nm = o(getResources().getDrawable(o00.o(this, "browser_left_icon", k.d)));
        this.nn = o(getResources().getDrawable(o00.o(this, "browser_close_icon", k.d)));
        linearLayout.addView(this.nm);
        linearLayout.addView(this.nn);
        TextView textView = new TextView(this);
        new LinearLayout.LayoutParams(0, -2, 1.0f);
        textView.setPadding(o00.o((Context) this, 20.0f), 0, 0, o00.o((Context) this, 2.0f));
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(Color.parseColor("#666666"));
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        this.o00 = textView;
        linearLayout.addView(textView);
        try {
            this.no = new BaseWebView(getApplicationContext());
            this.no.setLayoutParams(Z.g(-1, -1, 3, on));
            relativeLayout.addView(this.no);
            View view = new View(this);
            view.setBackgroundColor(-2434342);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, o00.o((Context) this, 1.0f));
            layoutParams2.addRule(3, on);
            view.setLayoutParams(layoutParams2);
            relativeLayout.addView(view);
            WebProgressBarView webProgressBarView = new WebProgressBarView(this);
            this.n0 = webProgressBarView;
            webProgressBarView.setProgress(0);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, o00.o((Context) this, 4.0f));
            layoutParams3.addRule(3, on);
            relativeLayout.addView(this.n0, layoutParams3);
            Random random = new Random();
            this.o0m = random;
            this.o0n = random.nextInt(12) + 3;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 70);
            this.o0o = valueAnimatorOfInt;
            valueAnimatorOfInt.setDuration(1000L);
            this.o0o.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.thinkup.core.basead.ui.web.WebLandPageActivity.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (WebLandPageActivity.this.n0 == null || iIntValue % WebLandPageActivity.this.o0n != 0) {
                        return;
                    }
                    WebLandPageActivity webLandPageActivity = WebLandPageActivity.this;
                    webLandPageActivity.o0n = webLandPageActivity.o0m.nextInt(12) + 3;
                    WebLandPageActivity.this.n0.setProgress(iIntValue);
                }
            });
            this.o0o.start();
            return relativeLayout;
        } catch (Throwable unused) {
            return null;
        }
    }

    private TextView mn() {
        TextView textView = new TextView(this);
        new LinearLayout.LayoutParams(0, -2, 1.0f);
        textView.setPadding(o00.o((Context) this, 20.0f), 0, 0, o00.o((Context) this, 2.0f));
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(Color.parseColor("#666666"));
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        return textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mo() {
        try {
            ((ViewGroup) getWindow().getDecorView()).removeAllViews();
        } catch (Throwable unused) {
        }
        super.finish();
    }

    private boolean n0() {
        return System.currentTimeMillis() - this.oo > 2500;
    }

    private void o0(String str) {
        com.thinkup.core.basead.ui.o.o.o(this.no, this, this);
        this.no.setDownloadListener(new AnonymousClass3());
        oo0o oo0oVarO = com.thinkup.core.basead.o.n.o(str);
        this.o = oo0oVarO.n0;
        this.no.loadUrl(oo0oVarO.nn);
        o(this.no.getUrl());
    }

    public static /* synthetic */ boolean on(WebLandPageActivity webLandPageActivity) {
        return System.currentTimeMillis() - webLandPageActivity.oo > 2500;
    }

    private void oo() {
        Intent intent = getIntent();
        if (intent != null) {
            try {
                Serializable serializableExtra = intent.getSerializableExtra("extra_offer_ad");
                if (serializableExtra != null && (serializableExtra instanceof ooo)) {
                    ooo oooVar = (ooo) serializableExtra;
                    this.on0 = oooVar;
                    this.m00 = new n(oooVar);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                Serializable serializableExtra2 = intent.getSerializableExtra("extra_request_info");
                if (serializableExtra2 != null && (serializableExtra2 instanceof oom)) {
                    this.ono = (oom) serializableExtra2;
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            try {
                Serializable serializableExtra3 = intent.getSerializableExtra("extra_click_handler");
                if (serializableExtra3 != null && (serializableExtra3 instanceof IOfferClickHandler)) {
                    this.onn = (IOfferClickHandler) serializableExtra3;
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
            try {
                this.onm = intent.getStringExtra("extra_target_url");
            } catch (Throwable th4) {
                th4.printStackTrace();
            }
            try {
                this.m0o = intent.getIntExtra("extra_enter_type", -1);
            } catch (Throwable th5) {
                th5.printStackTrace();
            }
            this.omn = true;
            try {
                this.omn = intent.getBooleanExtra("support_deeplink_jump", true);
            } catch (Throwable th6) {
                th6.printStackTrace();
            }
        }
    }

    @Override // com.thinkup.core.basead.ui.web.m
    public final void m(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (TextUtils.equals(this.oom, str)) {
                this.oon = 1;
            }
            JSONArray jSONArray = this.ooo.get(str);
            if (jSONArray != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(System.currentTimeMillis());
                    jSONArray.put(0, sb.toString());
                    jSONArray.put(1, "");
                    this.ooo.put(str, jSONArray);
                } catch (JSONException unused) {
                }
            }
        }
        WebLoadFailRefrshView webLoadFailRefrshView = this.om0;
        if (webLoadFailRefrshView != null) {
            moo.o((View) webLoadFailRefrshView);
        }
    }

    @Override // com.thinkup.core.basead.ui.web.m
    public final void n(String str) {
        if (TextUtils.equals(this.oom, str)) {
            this.oon = 3;
        }
        WebLoadFailRefrshView webLoadFailRefrshView = this.om0;
        if (webLoadFailRefrshView != null) {
            moo.o((View) webLoadFailRefrshView);
        } else {
            WebLoadFailRefrshView webLoadFailRefrshView2 = new WebLoadFailRefrshView(this);
            this.om0 = webLoadFailRefrshView2;
            WebView webView = this.no;
            if (webView != null) {
                webLoadFailRefrshView2.setLayoutParams(webView.getLayoutParams());
            }
            this.om0.setOnRefreshListener(new View.OnClickListener() { // from class: com.thinkup.core.basead.ui.web.WebLandPageActivity.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    moo.o((View) WebLandPageActivity.this.om0);
                    if (WebLandPageActivity.this.no != null) {
                        WebLandPageActivity.this.no.reload();
                    }
                }
            });
        }
        WebView webView2 = this.no;
        if (webView2 != null) {
            webView2.setVisibility(8);
        }
        this.omo.addView(this.om0);
    }

    private static void o(Context context, com.thinkup.core.basead.m.o oVar) {
        Intent intent = new Intent();
        intent.setClass(context, WebLandPageActivity.class);
        intent.putExtra("extra_offer_ad", oVar.f41799n);
        intent.putExtra("extra_request_info", oVar.m0);
        intent.putExtra("extra_target_url", oVar.om);
        intent.putExtra("extra_enter_type", oVar.mo);
        intent.putExtra("support_deeplink_jump", oVar.mn);
        IOfferClickHandler iOfferClickHandler = oVar.on;
        if (iOfferClickHandler != null) {
            intent.putExtra("extra_click_handler", iOfferClickHandler);
        }
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    @Override // com.thinkup.core.basead.ui.web.m
    public final ooo o0() {
        return this.on0;
    }

    @Override // com.thinkup.core.basead.ui.web.m
    public final void m() {
        mo();
    }

    private void m(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        om0.o(str);
        this.o = i2;
    }

    @Override // com.thinkup.core.basead.ui.web.m
    public final boolean n() {
        return this.omn;
    }

    public static /* synthetic */ void m(WebLandPageActivity webLandPageActivity, String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        om0.o(str);
        webLandPageActivity.o = i2;
    }

    public static void o(Context context, String str) {
        com.thinkup.core.basead.m.o oVar = new com.thinkup.core.basead.m.o();
        oVar.om = str;
        Intent intent = new Intent();
        intent.setClass(context, WebLandPageActivity.class);
        intent.putExtra("extra_offer_ad", oVar.f41799n);
        intent.putExtra("extra_request_info", oVar.m0);
        intent.putExtra("extra_target_url", oVar.om);
        intent.putExtra("extra_enter_type", oVar.mo);
        intent.putExtra("support_deeplink_jump", oVar.mn);
        IOfferClickHandler iOfferClickHandler = oVar.on;
        if (iOfferClickHandler != null) {
            intent.putExtra("extra_click_handler", iOfferClickHandler);
        }
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    @Override // com.thinkup.core.basead.ui.web.m
    public final void o(WebView webView, String str) {
        WebView webView2;
        WebLoadFailRefrshView webLoadFailRefrshView = this.om0;
        if (webLoadFailRefrshView != null && webLoadFailRefrshView.getParent() == null && (webView2 = this.no) != null) {
            webView2.setVisibility(0);
        }
        webView.canGoBack();
        webView.canGoForward();
        if (!TextUtils.isEmpty(str) && this.oon != 3 && TextUtils.equals(this.oom, str) && !isFinishing()) {
            this.oon = 2;
            JSONArray jSONArray = this.ooo.get(str);
            if (jSONArray != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(System.currentTimeMillis());
                    jSONArray.put(1, sb.toString());
                    this.ooo.put(str, jSONArray);
                } catch (JSONException unused) {
                }
            }
        }
        n nVar = this.m00;
        if (nVar != null) {
            nVar.o(webView, str);
        }
    }

    private void o(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this, o00.o(this, "system_dialog", "style"));
        builder.setMessage(getString(o00.o(this, "web_download_file_confirm_title", k.f38992h))).setCancelable(true).setPositiveButton(getString(o00.o(this, "web_download_file_confirm", k.f38992h)), new AnonymousClass5(i2, str)).setNegativeButton(getString(o00.o(this, "web_download_file_cancel", k.f38992h)), new AnonymousClass4(str));
        builder.create().show();
    }

    @Override // com.thinkup.core.basead.ui.web.m
    public final WebProgressBarView o() {
        return this.n0;
    }

    private ImageView o(Drawable drawable) {
        ImageView imageView = new ImageView(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(o00.o((Context) this, 48.0f), o00.o((Context) this, 48.0f));
        layoutParams.gravity = 16;
        layoutParams.rightMargin = o00.o((Context) this, 6.0f);
        imageView.setLayoutParams(layoutParams);
        int iO = o00.o((Context) this, 16.0f);
        imageView.setPadding(iO, iO, iO, iO);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(drawable);
        return imageView;
    }

    @Override // com.thinkup.core.basead.ui.web.m
    public final void o(String str) {
        if (this.m == null) {
            this.m = new JSONArray();
        }
        this.m.put(str);
        if (this.ooo.size() > 0) {
            JSONArray jSONArray = this.ooo.get(this.oom);
            try {
                if (this.oon == 0 && jSONArray != null) {
                    if (TextUtils.isEmpty(jSONArray.getString(1))) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(System.currentTimeMillis());
                        jSONArray.put(1, sb.toString());
                    }
                    this.ooo.put(this.oom, jSONArray);
                }
            } catch (Throwable unused) {
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(System.currentTimeMillis());
        jSONArray2.put(sb2.toString());
        jSONArray2.put("");
        this.ooo.put(str, jSONArray2);
        this.oom = str;
        this.oon = 0;
    }

    @Override // com.thinkup.core.basead.ui.web.m
    public final void o(oo0o oo0oVar) {
        this.o = oo0oVar.n0;
        if (oo0oVar.nm) {
            if (oo0oVar.no) {
                this.f41806n = 1;
                this.oon = 2;
                mo();
            } else {
                this.f41806n = 2;
                if (oo0oVar.o00) {
                    oo.o(this.on0, this.ono, 2, this.oo > 0, 0, oo0oVar.nn);
                }
            }
        }
    }

    public static /* synthetic */ void o(WebLandPageActivity webLandPageActivity, String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(webLandPageActivity, o00.o(webLandPageActivity, "system_dialog", "style"));
        builder.setMessage(webLandPageActivity.getString(o00.o(webLandPageActivity, "web_download_file_confirm_title", k.f38992h))).setCancelable(true).setPositiveButton(webLandPageActivity.getString(o00.o(webLandPageActivity, "web_download_file_confirm", k.f38992h)), webLandPageActivity.new AnonymousClass5(i2, str)).setNegativeButton(webLandPageActivity.getString(o00.o(webLandPageActivity, "web_download_file_cancel", k.f38992h)), webLandPageActivity.new AnonymousClass4(str));
        builder.create().show();
    }
}
