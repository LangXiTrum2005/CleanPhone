package sg.bigo.ads.core.mraid;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.applovin.sdk.AppLovinMediationProvider;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p004ironsource.d9;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    b f48626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    sg.bigo.ads.common.ac.a f48627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f48628c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n f48629e;
    private final h f;
    private C0874c g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final WebViewClient f48630h;

    /* JADX INFO: renamed from: sg.bigo.ads.core.mraid.c$6, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f48637a;

        static {
            int[] iArr = new int[g.values().length];
            f48637a = iArr;
            try {
                iArr[g.CLOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48637a[g.RESIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f48637a[g.UNLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f48637a[g.EXPAND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f48637a[g.USE_CUSTOM_CLOSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f48637a[g.OPEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f48637a[g.SET_ORIENTATION_PROPERTIES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f48637a[g.PLAY_VIDEO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f48637a[g.STORE_PICTURE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f48637a[g.CREATE_CALENDAR_EVENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f48637a[g.UNSPECIFIED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public interface a extends b {
        void a(String str, String str2);
    }

    public interface b {
        void a();

        void a(int i2, int i3, int i4, int i5, sg.bigo.ads.core.mraid.a.a.EnumC0873a enumC0873a, boolean z2);

        void a(String str);

        void a(String str, sg.bigo.ads.common.i iVar);

        void a(String str, boolean z2);

        void a(sg.bigo.ads.core.mraid.b bVar);

        void a(boolean z2);

        void a(boolean z2, i iVar);

        boolean a(JsResult jsResult);

        void b();

        void b(boolean z2);

        void c();

        boolean d();

        void e();

        void f();
    }

    /* JADX INFO: renamed from: sg.bigo.ads.core.mraid.c$c, reason: collision with other inner class name */
    public static class C0874c extends sg.bigo.ads.core.h.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f48638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a f48639b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private p f48640c;
        private sg.bigo.ads.common.i d;

        /* JADX INFO: renamed from: sg.bigo.ads.core.mraid.c$c$a */
        public interface a {
            void a(sg.bigo.ads.core.mraid.b bVar);

            void a(boolean z2);
        }

        private C0874c(Context context) {
            super(context);
            this.d = new sg.bigo.ads.common.i();
            this.f48640c = new p(this);
            this.f48640c.d = new p.b() { // from class: sg.bigo.ads.core.mraid.c.c.1
                @Override // sg.bigo.ads.core.mraid.p.b
                public final void a(boolean z2, sg.bigo.ads.core.mraid.b bVar) {
                    C0874c.this.setMraidViewable(z2);
                    C0874c.a(C0874c.this, bVar);
                }
            };
        }

        public static /* synthetic */ void a(C0874c c0874c, sg.bigo.ads.core.mraid.b bVar) {
            a aVar = c0874c.f48639b;
            if (aVar != null) {
                aVar.a(bVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMraidViewable(boolean z2) {
            if (this.f48638a == z2) {
                return;
            }
            this.f48638a = z2;
            a aVar = this.f48639b;
            if (aVar != null) {
                aVar.a(z2);
            }
        }

        @Override // sg.bigo.ads.core.h.e, android.webkit.WebView
        public final void destroy() {
            super.destroy();
            setWebChromeClient(null);
            setWebViewClient(null);
            this.f48640c = null;
            this.f48639b = null;
        }

        public final sg.bigo.ads.common.i getClickPoints() {
            return this.d;
        }

        @Override // android.webkit.WebView, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getActionMasked() == 1) {
                this.d.f47309b = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            }
            if (motionEvent.getActionMasked() == 0) {
                this.d.f47308a = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override // android.webkit.WebView, android.view.View
        public final void onVisibilityChanged(View view, int i2) {
            super.onVisibilityChanged(view, i2);
            if (this.f48640c == null) {
                setMraidViewable(i2 == 0);
            } else if (i2 != 0) {
                setMraidViewable(false);
            }
        }

        public final void setVisibilityChangedListener(a aVar) {
            this.f48639b = aVar;
        }

        public /* synthetic */ C0874c(Context context, byte b2) {
            this(context);
        }
    }

    public c(n nVar) {
        this(nVar, new h());
    }

    private static int a(int i2, int i3) throws d {
        if (i2 < i3 || i2 > 100000) {
            throw new d("Integer parameter out of range: ".concat(String.valueOf(i2)));
        }
        return i2;
    }

    private static String b(Rect rect) {
        return rect.width() + "," + rect.height();
    }

    private boolean d() {
        sg.bigo.ads.common.ac.a aVar = this.f48627b;
        if (aVar == null) {
            return false;
        }
        if (this.d) {
            return aVar.f47107a.f47110a;
        }
        return aVar.a();
    }

    private static String e(String str) throws d {
        if (str != null) {
            return str;
        }
        throw new d("Parameter cannot be null");
    }

    private static int f(String str) throws d {
        try {
            return Integer.parseInt(str, 10);
        } catch (NumberFormatException unused) {
            throw new d("Invalid numeric parameter: ".concat(String.valueOf(str)));
        }
    }

    private static boolean g(String str) throws d {
        if (com.p004ironsource.mediationsdk.metadata.a.g.equals(str)) {
            return true;
        }
        if ("false".equals(str)) {
            return false;
        }
        throw new d("Invalid boolean parameter: ".concat(String.valueOf(str)));
    }

    public final void c(String str) {
        if (this.g == null) {
            sg.bigo.ads.common.t.a.a(0, "MraidBridge", "Attempted to inject Javascript into MRAID WebView while was not attached:\n\t".concat(String.valueOf(str)));
        } else {
            p005e.a.d(0, 3, str, "Injecting Javascript into MRAID WebView:\n\t", "MraidBridge");
            this.g.loadUrl("javascript:".concat(String.valueOf(str)));
        }
    }

    private c(n nVar, h hVar) {
        this.d = false;
        this.f48630h = new k() { // from class: sg.bigo.ads.core.mraid.c.4
            @Override // sg.bigo.ads.core.mraid.k, sg.bigo.ads.core.h.d
            public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
                c cVar = c.this;
                sg.bigo.ads.common.t.a.a(0, "MraidBridge", (renderProcessGoneDetail == null || !renderProcessGoneDetail.didCrash()) ? "Render process is gone" : "Render process has crashed");
                cVar.a();
                b bVar = cVar.f48626a;
                if (bVar != null) {
                    bVar.c();
                }
            }

            @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                c cVar = c.this;
                if (cVar.f48628c) {
                    return;
                }
                cVar.f48628c = true;
                b bVar = cVar.f48626a;
                if (bVar != null) {
                    bVar.a();
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView, int i2, String str, String str2) {
                sg.bigo.ads.common.t.a.a(0, "MraidBridge", "Error: ".concat(String.valueOf(str)));
                super.onReceivedError(webView, i2, str, str2);
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                return c.this.d(str);
            }
        };
        this.f48629e = nVar;
        this.f = hVar;
    }

    private static String a(Rect rect) {
        return rect.left + "," + rect.top + "," + rect.width() + "," + rect.height();
    }

    public final void b(String str) {
        C0874c c0874c = this.g;
        if (c0874c == null) {
            sg.bigo.ads.common.t.a.a(0, "MraidBridge", "MRAID bridge called setContentHtml while WebView was not attached");
        } else {
            this.f48628c = false;
            c0874c.loadUrl(str);
        }
    }

    public final boolean d(String str) {
        i iVar;
        String str2;
        b bVar;
        try {
            Uri uri = Uri.parse(str);
            if (uri == null) {
                return true;
            }
            String scheme = uri.getScheme();
            String host = uri.getHost();
            if (AppLovinMediationProvider.MOPUB.equals(scheme)) {
                if ("failLoad".equals(host) && this.f48629e == n.INLINE && (bVar = this.f48626a) != null) {
                    bVar.b();
                }
                return true;
            }
            if (d() && !"mraid".equals(scheme)) {
                try {
                    StringBuilder sb = new StringBuilder("mraid://open?url=");
                    str2 = str;
                    try {
                        sb.append(URLEncoder.encode(str2, "UTF-8"));
                        uri = Uri.parse(sb.toString());
                        host = uri.getHost();
                        scheme = uri.getScheme();
                    } catch (UnsupportedEncodingException unused) {
                        sg.bigo.ads.common.t.a.a(0, "MraidBridge", "Invalid MRAID URL encoding: ".concat(String.valueOf(str2)));
                        a(g.OPEN, "Non-mraid URL is invalid");
                        return false;
                    }
                } catch (UnsupportedEncodingException unused2) {
                    str2 = str;
                }
            }
            if (!"mraid".equals(scheme)) {
                sg.bigo.ads.common.ac.a aVar = this.f48627b;
                return aVar != null && aVar.a();
            }
            final g gVarA = g.a(host);
            try {
                Map<String, String> mapA = a(uri);
                if (gVarA.a(this.f48629e) && !d()) {
                    throw new d("Cannot execute this command unless the user clicks");
                }
                if (this.f48626a == null) {
                    throw new d("Invalid state to execute this command");
                }
                if (this.g == null) {
                    throw new d("The current WebView is being destroyed");
                }
                switch (AnonymousClass6.f48637a[gVarA.ordinal()]) {
                    case 1:
                        this.f48626a.f();
                        break;
                    case 2:
                        int iA = a(f(mapA.get("width")), 0);
                        int iA2 = a(f(mapA.get("height")), 0);
                        int iA3 = a(f(mapA.get("offsetX")), -100000);
                        int iA4 = a(f(mapA.get("offsetY")), -100000);
                        String str3 = mapA.get("customClosePosition");
                        sg.bigo.ads.core.mraid.a.a.EnumC0873a enumC0873a = sg.bigo.ads.core.mraid.a.a.EnumC0873a.TOP_RIGHT;
                        if (!TextUtils.isEmpty(str3)) {
                            if (str3.equals(d9.e.f24671c)) {
                                enumC0873a = sg.bigo.ads.core.mraid.a.a.EnumC0873a.TOP_LEFT;
                            } else if (!str3.equals(d9.e.f24670b)) {
                                if (str3.equals(TtmlNode.CENTER)) {
                                    enumC0873a = sg.bigo.ads.core.mraid.a.a.EnumC0873a.CENTER;
                                } else if (str3.equals(d9.e.f24672e)) {
                                    enumC0873a = sg.bigo.ads.core.mraid.a.a.EnumC0873a.BOTTOM_LEFT;
                                } else if (str3.equals(d9.e.d)) {
                                    enumC0873a = sg.bigo.ads.core.mraid.a.a.EnumC0873a.BOTTOM_RIGHT;
                                } else if (str3.equals("top-center")) {
                                    enumC0873a = sg.bigo.ads.core.mraid.a.a.EnumC0873a.TOP_CENTER;
                                } else {
                                    if (!str3.equals("bottom-center")) {
                                        throw new d("Invalid close position: ".concat(str3));
                                    }
                                    enumC0873a = sg.bigo.ads.core.mraid.a.a.EnumC0873a.BOTTOM_CENTER;
                                }
                            }
                        }
                        this.f48626a.a(iA, iA2, iA3, iA4, enumC0873a, a(mapA.get("allowOffscreen"), true));
                        this.f48626a.b(false);
                        break;
                    case 3:
                        this.f48626a.e();
                        break;
                    case 4:
                        this.f48626a.a(mapA.get("url"), a(mapA));
                        break;
                    case 5:
                        this.f48626a.b(a(mapA));
                        break;
                    case 6:
                        this.f48626a.a(e(mapA.get("url")), this.g.getClickPoints());
                        break;
                    case 7:
                        boolean zG = g(mapA.get("allowOrientationChange"));
                        String str4 = mapA.get("forceOrientation");
                        if (d9.h.D.equals(str4)) {
                            iVar = i.PORTRAIT;
                        } else if (d9.h.C.equals(str4)) {
                            iVar = i.LANDSCAPE;
                        } else {
                            if (!"none".equals(str4)) {
                                throw new d("Invalid orientation: ".concat(String.valueOf(str4)));
                            }
                            iVar = i.NONE;
                        }
                        this.f48626a.a(zG, iVar);
                        break;
                    case 8:
                        this.f48626a.a(e(mapA.get("uri")));
                        break;
                    case 9:
                        String strE = e(mapA.get("uri"));
                        h hVar = this.f;
                        Context context = this.g.getContext();
                        h.c cVar = new h.c() { // from class: sg.bigo.ads.core.mraid.c.5
                            @Override // sg.bigo.ads.core.mraid.h.c
                            public final void a(d dVar) {
                                c.this.a(gVarA, dVar.getMessage());
                            }
                        };
                        if (!h.c(context)) {
                            sg.bigo.ads.common.t.a.a(0, "MraidBridge", "Error downloading file - the device does not have an SD card mounted, or the Android permission is not granted.");
                            throw new d("Error downloading file  - the device does not have an SD card mounted, or the Android permission is not granted.");
                        }
                        if (!(context instanceof Activity)) {
                            Toast.makeText(context, "Downloading image", 0).show();
                            hVar.a(context, strE, cVar);
                        } else {
                            new AlertDialog.Builder(context).setTitle("Save Image").setMessage("Download image to Picture gallery?").setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).setPositiveButton("Okay", new DialogInterface.OnClickListener() { // from class: sg.bigo.ads.core.mraid.h.3

                                /* JADX INFO: renamed from: a */
                                final /* synthetic */ Context f48692a;

                                /* JADX INFO: renamed from: b */
                                final /* synthetic */ String f48693b;

                                /* JADX INFO: renamed from: c */
                                final /* synthetic */ c f48694c;

                                public AnonymousClass3() {
                                    context = context;
                                    str = strE;
                                    cVar = cVar;
                                }

                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i2) {
                                    h.this.a(context, str, cVar);
                                }
                            }).setCancelable(true).show();
                        }
                        break;
                        break;
                    case 10:
                        h.a(this.g.getContext(), mapA);
                        break;
                    case 11:
                        throw new d("Unspecified MRAID Javascript command");
                }
                c("window.mraidbridge.nativeCallComplete(" + JSONObject.quote(gVarA.f48684l) + ")");
                return true;
            } catch (IllegalArgumentException e2) {
                e = e2;
                a(gVarA, e.getMessage());
            } catch (d e3) {
                e = e3;
                a(gVarA, e.getMessage());
            }
        } catch (Exception unused3) {
            return true;
        }
    }

    private static Map<String, String> a(Uri uri) {
        HashMap map = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            map.put(str, TextUtils.join(",", uri.getQueryParameters(str)));
        }
        return map;
    }

    public final boolean b() {
        C0874c c0874c = this.g;
        return c0874c != null && c0874c.f48638a;
    }

    public static C0874c a(Context context) {
        try {
            return new C0874c(context, (byte) 0);
        } catch (Exception e2) {
            sg.bigo.ads.core.d.b.a(3000, 10100, Log.getStackTraceString(e2));
            return null;
        }
    }

    public final void a() {
        C0874c c0874c = this.g;
        if (c0874c != null) {
            c0874c.setOnTouchListener(null);
            this.g.setVisibilityChangedListener(null);
            this.g.destroy();
            this.g = null;
        }
    }

    public final void a(String str) {
        if (this.g == null) {
            sg.bigo.ads.common.t.a.a(0, "MraidBridge", "MRAID bridge called setContentHtml before WebView was attached");
            return;
        }
        this.f48628c = false;
        sg.bigo.ads.common.t.a.a(0, 3, "MraidBridge", "MraidBridge setContentHtml");
        this.g.loadDataWithBaseURL("https://mraid.bigo.sg", str, "text/html", null, null);
    }

    public final boolean c() {
        return this.g != null;
    }

    public final void a(sg.bigo.ads.core.mraid.b bVar) {
        StringBuilder sb = new StringBuilder("mraidbridge.notifyExposureChangeEvent(");
        sb.append(String.valueOf(bVar.f48623a) + ", " + sg.bigo.ads.core.mraid.b.a(bVar.f48624b) + ", " + sg.bigo.ads.core.mraid.b.a(bVar.f48625c));
        sb.append(");");
        c(sb.toString());
    }

    public final void a(C0874c c0874c) {
        this.g = c0874c;
        c0874c.getSettings().setJavaScriptEnabled(true);
        if (this.f48629e == n.INTERSTITIAL) {
            c0874c.getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        this.g.setScrollContainer(false);
        this.g.setVerticalScrollBarEnabled(false);
        this.g.setHorizontalScrollBarEnabled(false);
        this.g.setBackgroundColor(0);
        this.g.setWebViewClient(this.f48630h);
        this.g.setWebChromeClient(new sg.bigo.ads.core.h.c() { // from class: sg.bigo.ads.core.mraid.c.1
            @Override // sg.bigo.ads.core.h.c
            public final void a(WebView webView, String str, String str2) {
                super.a(webView, str, str2);
                b bVar = c.this.f48626a;
                if (bVar == null || !(bVar instanceof a)) {
                    return;
                }
                ((a) bVar).a(str, str2);
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                b bVar = c.this.f48626a;
                return bVar != null ? bVar.d() : super.onConsoleMessage(consoleMessage);
            }

            @Override // sg.bigo.ads.core.h.c, android.webkit.WebChromeClient
            public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
                b bVar = c.this.f48626a;
                return bVar != null ? bVar.a(jsResult) : super.onJsAlert(webView, str, str2, jsResult);
            }

            @Override // android.webkit.WebChromeClient
            public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                super.onShowCustomView(view, customViewCallback);
            }
        });
        this.f48627b = new sg.bigo.ads.common.ac.a(this.g.getContext());
        this.g.setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.core.mraid.c.2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                c.this.f48627b.onTouchEvent(motionEvent);
                int action = motionEvent.getAction();
                if ((action != 0 && action != 1) || view.hasFocus()) {
                    return false;
                }
                view.requestFocus();
                return false;
            }
        });
        this.g.setVisibilityChangedListener(new C0874c.a() { // from class: sg.bigo.ads.core.mraid.c.3
            @Override // sg.bigo.ads.core.mraid.c.C0874c.a
            public final void a(sg.bigo.ads.core.mraid.b bVar) {
                b bVar2 = c.this.f48626a;
                if (bVar2 != null) {
                    bVar2.a(bVar);
                }
            }

            @Override // sg.bigo.ads.core.mraid.c.C0874c.a
            public final void a(boolean z2) {
                b bVar = c.this.f48626a;
                if (bVar != null) {
                    bVar.a(z2);
                }
            }
        });
    }

    public final void a(g gVar, String str) {
        c("window.mraidbridge.notifyErrorEvent(" + JSONObject.quote(gVar.f48684l) + ", " + JSONObject.quote(str) + ")");
    }

    public final void a(j jVar) {
        String str;
        StringBuilder sb = new StringBuilder("mraidbridge.setScreenSize(");
        sb.append(b(jVar.f48705b));
        sb.append(");mraidbridge.setMaxSize(");
        sb.append(b(jVar.d));
        sb.append(");mraidbridge.setCurrentPosition(");
        sb.append(a(jVar.f));
        sb.append(");mraidbridge.setDefaultPosition(");
        sb.append(a(jVar.f48708h));
        sb.append(");mraidbridge.setCurrentAppOrientation(");
        C0874c c0874c = this.g;
        if (c0874c == null) {
            str = "";
        } else {
            Context context = c0874c.getContext();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            String str2 = context.getResources().getConfiguration().orientation == 2 ? d9.h.C : d9.h.D;
            boolean z2 = false;
            if (activity == null) {
                sg.bigo.ads.common.t.a.a(0, 3, "MraidBridge", "Context is not an Activity, set locked to false");
            } else if (activity.getRequestedOrientation() != -1) {
                z2 = true;
            }
            str = "'" + str2 + "', " + z2;
        }
        sb.append(str);
        sb.append(")");
        c(sb.toString());
        c("mraidbridge.notifySizeChangeEvent(" + b(jVar.f) + ")");
    }

    public final void a(n nVar) {
        c("mraidbridge.setPlacementType(" + JSONObject.quote(nVar.toString().toLowerCase(Locale.US)) + ")");
    }

    public final void a(o oVar) {
        c("mraidbridge.setState(" + JSONObject.quote(oVar.toString().toLowerCase(Locale.US)) + ")");
    }

    public final void a(boolean z2) {
        c("mraidbridge.setIsViewable(" + z2 + ")");
    }

    public final void a(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        c("mraidbridge.setSupports(" + z2 + "," + z3 + "," + z4 + "," + z5 + "," + z6 + ")");
    }

    private static boolean a(String str, boolean z2) {
        return str == null ? z2 : g(str);
    }

    private static boolean a(Map<String, String> map) {
        return a(map.get("shouldUseCustomClose"), false);
    }
}
