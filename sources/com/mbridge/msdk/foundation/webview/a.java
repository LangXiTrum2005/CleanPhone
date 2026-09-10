package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.activity.MBCommonActivity;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.out.BaseTrackingListener;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a implements BrowserView.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static String f34257o = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f34258a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f34260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f34261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BaseTrackingListener f34262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private BrowserView f34263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CampaignEx f34264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.click.a f34265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Context f34266i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private JumpLoaderResult f34268k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f34270n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f34259b = true;
    private boolean l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Runnable f34269m = new RunnableC0133a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Handler f34267j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.webview.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class RunnableC0133a implements Runnable {
        public RunnableC0133a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q0.b(a.f34257o, "webview js！超时上限：" + a.this.f34258a + "ms");
            if (a.this.f34265h != null && a.this.f34268k != null) {
                a.this.f34268k.setSuccess(false);
                a.this.f34268k.setUrl(a.this.f34260c);
                a.this.f34268k.setType(2);
                a.this.f34268k.setExceptionMsg("linktype 8 time out");
                a.this.f34265h.a(a.this.f34268k, a.this.f34264g, 1, false);
            }
            a aVar = a.this;
            if (aVar.b(null, aVar.f34260c) && !a.this.l) {
                a.this.l = true;
                a aVar2 = a.this;
                aVar2.a(aVar2.f34266i, a.this.f34260c, a.this.f34264g);
            }
            if (a.this.f34262e != null) {
                a.this.f34262e.onFinishRedirection(a.this.f34264g, a.this.f34260c);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f34272a;

        public b(String str) {
            this.f34272a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f34265h != null && a.this.f34268k != null) {
                a.this.f34268k.setSuccess(true);
                a.this.f34268k.setUrl(this.f34272a);
                a.this.f34268k.setType(2);
                a.this.f34265h.a(a.this.f34268k, a.this.f34264g, 1, true);
            }
            if (a.this.f34262e != null) {
                a.this.f34262e.onFinishRedirection(a.this.f34264g, this.f34272a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f34274a;

        public c(String str) {
            this.f34274a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f34262e != null) {
                a.this.f34262e.onFinishRedirection(a.this.f34264g, this.f34274a);
            }
            if (a.this.f34265h == null || a.this.f34268k == null) {
                return;
            }
            a.this.f34268k.setSuccess(true);
            a.this.f34268k.setUrl(this.f34274a);
            a.this.f34268k.setType(2);
            a.this.f34265h.a(a.this.f34268k, a.this.f34264g, 1, true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f34276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34277b;

        public d(String str, String str2) {
            this.f34276a = str;
            this.f34277b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f34262e != null) {
                a.this.f34262e.onFinishRedirection(a.this.f34264g, this.f34276a);
            }
            if (a.this.f34265h == null || a.this.f34268k == null) {
                return;
            }
            a.this.f34268k.setSuccess(false);
            a.this.f34268k.setUrl(this.f34276a);
            a.this.f34268k.setType(2);
            a.this.f34268k.setExceptionMsg(this.f34277b);
            a.this.f34265h.a(a.this.f34268k, a.this.f34264g, 1, true);
        }
    }

    public a(Context context, CampaignEx campaignEx, com.mbridge.msdk.click.a aVar, BrowserView browserView, BaseTrackingListener baseTrackingListener) {
        this.f34258a = 10000;
        this.f34268k = null;
        this.f34266i = context;
        this.f34264g = campaignEx;
        this.f34263f = browserView;
        this.f34262e = baseTrackingListener;
        g gVarI = f2.i(i.b());
        gVarI = gVarI == null ? i.b().a() : gVarI;
        this.f34265h = aVar;
        this.f34268k = new JumpLoaderResult();
        this.f34258a = (int) gVarI.u0();
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void a() {
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void onPageFinished(WebView webView, String str) {
        f2.s("onPageFinished1  ", str, f34257o);
        if (this.f34259b) {
            this.f34270n = 0L;
            this.f34259b = false;
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new c(str));
            if (TextUtils.isEmpty(str)) {
                return;
            }
            c();
            Uri uri = Uri.parse(str);
            if ((uri.getScheme().equals("http") || uri.getScheme().equals("https")) && !this.l) {
                this.l = true;
                a(this.f34266i, str, this.f34264g);
            }
        }
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (this.f34270n == 0) {
            this.f34270n = System.currentTimeMillis();
            if (!this.f34261d) {
                this.f34261d = true;
                d();
            }
            this.l = false;
        }
        this.f34260c = str;
        this.f34259b = true;
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        q0.d(f34257o, str);
        c();
        com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new d(str2, str));
        if (!b(webView, str2) || this.l) {
            return;
        }
        this.l = true;
        a(this.f34266i, str2, this.f34264g);
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        f2.s("shouldOverrideUrlLoading1  ", str, f34257o);
        this.f34259b = false;
        if (u0.a.b(str) && u0.a.a(this.f34266i, str, null)) {
            this.l = true;
        }
        boolean zC = c(webView, str);
        if (zC) {
            this.f34270n = 0L;
            this.f34259b = false;
            c();
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new b(str));
        }
        return zC;
    }

    private boolean c(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri uri = Uri.parse(str);
            if (!uri.getScheme().equals("http") && !uri.getScheme().equals("https")) {
                if (uri.getScheme().equals("intent")) {
                    Intent uri2 = Intent.parseUri(str, 1);
                    try {
                        String str2 = uri2.getPackage();
                        if (!TextUtils.isEmpty(str2) && this.f34266i.getPackageManager().getLaunchIntentForPackage(str2) != null) {
                            uri2.setFlags(268435456);
                            this.f34266i.startActivity(uri2);
                            this.l = true;
                            return true;
                        }
                        try {
                            String stringExtra = uri2.getStringExtra("browser_fallback_url");
                            if (!TextUtils.isEmpty(stringExtra)) {
                                Uri uri3 = Uri.parse(str);
                                if (!uri3.getScheme().equals("http") && !uri3.getScheme().equals("https")) {
                                    str = stringExtra;
                                }
                                webView.loadUrl(stringExtra);
                                return false;
                            }
                        } catch (Throwable th2) {
                            q0.b(f34257o, th2.getMessage());
                        }
                    } catch (Throwable th3) {
                        q0.b(f34257o, th3.getMessage());
                    }
                    q0.b(f34257o, th.getMessage());
                    return false;
                }
                if (com.mbridge.msdk.click.c.d(this.f34266i, str)) {
                    q0.b(f34257o, "openDeepLink");
                    this.l = true;
                    return true;
                }
            }
            return false;
        } catch (Throwable th4) {
            q0.b(f34257o, th4.getMessage());
            return false;
        }
    }

    private void d() {
        this.f34267j.postDelayed(this.f34269m, this.f34258a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            Uri uri = Uri.parse(str);
            if (!uri.getScheme().equals("http") && !uri.getScheme().equals("https")) {
                if (uri.getScheme().equals("intent")) {
                    Intent uri2 = Intent.parseUri(str, 1);
                    try {
                        String str2 = uri2.getPackage();
                        if (!TextUtils.isEmpty(str2) && this.f34266i.getPackageManager().getLaunchIntentForPackage(str2) != null) {
                            return false;
                        }
                    } catch (Throwable th2) {
                        q0.b(f34257o, th2.getMessage());
                    }
                    try {
                        String stringExtra = uri2.getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            Uri uri3 = Uri.parse(str);
                            if (uri3.getScheme().equals("http") || uri3.getScheme().equals("https")) {
                                return true;
                            }
                            str = stringExtra;
                        }
                    } catch (Throwable th3) {
                        q0.b(f34257o, th3.getMessage());
                    }
                }
                if (com.mbridge.msdk.click.c.d(this.f34266i, str)) {
                    q0.b(f34257o, "openDeepLink");
                    return false;
                }
            }
            return true;
        } catch (Throwable th4) {
            q0.b(f34257o, th4.getMessage());
            return true;
        }
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void a(WebView webView, String str) {
        if (this.f34270n == 0) {
            this.f34270n = System.currentTimeMillis();
            if (!this.f34261d) {
                this.f34261d = true;
                d();
            }
        }
        this.f34260c = str;
        this.f34259b = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, CampaignEx campaignEx) {
        if (context == null) {
            return;
        }
        if (campaignEx != null) {
            campaignEx.getCurrentLocalRid();
        }
        try {
            int i10 = MBCommonActivity.f31378e;
            Intent intent = new Intent(context, (Class<?>) MBCommonActivity.class);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.mbridge.msdk.foundation.webview.b.f34279a.put(str, this.f34263f);
            if (u0.a.d(str)) {
                str = "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", "");
            }
            intent.putExtra("url", str);
            q0.c("url", "webview url = " + str);
            intent.setFlags(805306368);
            intent.putExtra("mvcommon", campaignEx);
            context.startActivity(intent);
        } catch (Exception unused) {
            u0.a(context, str, this.f34262e, campaignEx, new ArrayList());
        }
    }

    private void c() {
        this.f34267j.removeCallbacks(this.f34269m);
    }
}
