package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.WebView;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class od extends sk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f41311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb f41312c;
    public final Handler d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f41313e;
    public final String f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f41315i;
    public final long j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Boolean f41316l;
    public final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Runnable f41317n;
    public long r;
    public boolean g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f41314h = false;
    public boolean o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f41318p = false;
    public final LinkedHashMap q = new LinkedHashMap();
    public final fd s = new fd(this);
    public final gd t = new gd(this);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final hd f41319u = new hd(this);
    public final id v = new id(this);

    public od(Context context, lb lbVar, lb lbVar2, Handler handler, long j, long j2, boolean z2, Boolean bool, String str, String str2, String str3, Runnable runnable) {
        this.f41310a = context;
        this.f41311b = lbVar;
        this.f41312c = new lb(new jd(lbVar2));
        this.d = handler;
        this.f41315i = j;
        this.j = j2;
        this.k = z2;
        this.f41316l = bool;
        this.f41313e = str;
        this.m = str2;
        this.f = str3;
        this.f41317n = runnable;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0068 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #0 {all -> 0x0065, blocks: (B:3:0x0002, B:5:0x0006, B:8:0x0016, B:10:0x001d, B:12:0x0023, B:14:0x0037, B:35:0x00df, B:37:0x00e3, B:17:0x0068, B:20:0x0079, B:24:0x0089, B:26:0x008d, B:32:0x00a6, B:34:0x00b2, B:27:0x009a), top: B:41:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0088  */
    /* JADX WARN: Code duplicated, block: B:26:0x008d A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:3:0x0002, B:5:0x0006, B:8:0x0016, B:10:0x001d, B:12:0x0023, B:14:0x0037, B:35:0x00df, B:37:0x00e3, B:17:0x0068, B:20:0x0079, B:24:0x0089, B:26:0x008d, B:32:0x00a6, B:34:0x00b2, B:27:0x009a), top: B:41:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x009a A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:3:0x0002, B:5:0x0006, B:8:0x0016, B:10:0x001d, B:12:0x0023, B:14:0x0037, B:35:0x00df, B:37:0x00e3, B:17:0x0068, B:20:0x0079, B:24:0x0089, B:26:0x008d, B:32:0x00a6, B:34:0x00b2, B:27:0x009a), top: B:41:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b2 A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:3:0x0002, B:5:0x0006, B:8:0x0016, B:10:0x001d, B:12:0x0023, B:14:0x0037, B:35:0x00df, B:37:0x00e3, B:17:0x0068, B:20:0x0079, B:24:0x0089, B:26:0x008d, B:32:0x00a6, B:34:0x00b2, B:27:0x009a), top: B:41:0x0002 }] */
    public final void a(String str, String str2, boolean z2) {
        Boolean bool;
        float fJ;
        try {
            if (this.o) {
                return;
            }
            boolean z3 = true;
            this.g = true;
            h0.d(this.f41310a);
            a();
            Context context = this.f41310a;
            if (z2) {
                str = str2;
            }
            h0.b(context, str);
            String str3 = this.m;
            if (str3 == null || str3.isEmpty()) {
                if (MetaData.E().h().l() || !((vf) this.f41311b.a()).getBoolean("firstSucceededSmartRedirect", true)) {
                    z3 = false;
                }
                bool = this.f41316l;
                if (bool == null) {
                    fJ = MetaData.E().h().j();
                } else if (bool.booleanValue()) {
                    fJ = 100.0f;
                } else {
                    fJ = 0.0f;
                }
                if (z3 || Math.random() * 100.0d < fJ) {
                    g9 g9Var = new g9(h9.f41043l);
                    g9Var.f = b();
                    g9Var.g = this.f;
                    g9Var.a();
                    uf ufVarEdit = ((vf) this.f41311b.a()).edit();
                    ufVarEdit.a("firstSucceededSmartRedirect", Boolean.FALSE);
                    ufVarEdit.f41545a.putBoolean("firstSucceededSmartRedirect", false);
                    ufVarEdit.apply();
                }
            } else {
                String str4 = this.f41313e;
                Locale locale = Locale.ROOT;
                if (str4.toLowerCase(locale).contains(this.m.toLowerCase(locale))) {
                    if (MetaData.E().h().l()) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    bool = this.f41316l;
                    if (bool == null) {
                        fJ = MetaData.E().h().j();
                    } else if (bool.booleanValue()) {
                        fJ = 100.0f;
                    } else {
                        fJ = 0.0f;
                    }
                    if (z3) {
                        g9 g9Var2 = new g9(h9.f41043l);
                        g9Var2.f = b();
                        g9Var2.g = this.f;
                        g9Var2.a();
                        uf ufVarEdit2 = ((vf) this.f41311b.a()).edit();
                        ufVarEdit2.a("firstSucceededSmartRedirect", Boolean.FALSE);
                        ufVarEdit2.f41545a.putBoolean("firstSucceededSmartRedirect", false);
                        ufVarEdit2.apply();
                    } else {
                        g9 g9Var3 = new g9(h9.f41043l);
                        g9Var3.f = b();
                        g9Var3.g = this.f;
                        g9Var3.a();
                        uf ufVarEdit3 = ((vf) this.f41311b.a()).edit();
                        ufVarEdit3.a("firstSucceededSmartRedirect", Boolean.FALSE);
                        ufVarEdit3.f41545a.putBoolean("firstSucceededSmartRedirect", false);
                        ufVarEdit3.apply();
                    }
                } else {
                    g9 g9Var4 = new g9(h9.f41040e);
                    g9Var4.d = "Wrong package reached";
                    g9Var4.f41002e = "Expected: " + this.m + ", Link: " + this.f41313e;
                    g9Var4.g = this.f;
                    g9Var4.a();
                }
            }
            Runnable runnable = this.f41317n;
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th) {
            g9.a(th);
        }
    }

    public final JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : this.q.entrySet()) {
            String str = (String) entry.getKey();
            Float f = (Float) entry.getValue();
            JSONObject jSONObject = new JSONObject();
            try {
                Float f2 = (Float) this.q.get(str);
                if (f2 == null || f2.floatValue() < 0.0f) {
                    this.q.put(str, Float.valueOf((System.currentTimeMillis() - this.r) / 1000.0f));
                }
                jSONObject.put("time", String.valueOf(f));
                jSONObject.put("url", str);
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
            }
        }
        return jSONArray;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        ((Executor) this.f41312c.a()).execute(new nd(this, str));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        ((Executor) this.f41312c.a()).execute(new kd(this, str));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        a();
        if (str2 != null && !h0.a(str2) && h0.b(str2)) {
            g9 g9Var = new g9(h9.f41040e);
            g9Var.d = android.support.v4.media.a.h(i2, "Failed smart redirect: ");
            g9Var.f41002e = str2;
            g9Var.g = this.f;
            g9Var.a();
        }
        super.onReceivedError(webView, i2, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (webView != null && str != null) {
            ((Executor) this.f41312c.a()).execute(new ld(this, str));
            if (vi.c(webView.getContext(), str)) {
                return true;
            }
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            boolean zA = h0.a(lowerCase);
            boolean zStartsWith = lowerCase.startsWith("intent://");
            if (!zA && !zStartsWith) {
                return false;
            }
            ((Executor) this.f41312c.a()).execute(new md(this, str, zStartsWith, webView.getUrl()));
        }
        return true;
    }

    public final void a() {
        synchronized (this.d) {
            this.d.removeCallbacks(this.f41319u);
        }
    }
}
