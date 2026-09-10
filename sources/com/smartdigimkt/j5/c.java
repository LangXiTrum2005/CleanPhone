package com.smartdigimkt.j5;

import android.content.Context;
import android.text.TextUtils;
import com.smartdigimkt.b8.f;
import com.smartdigimkt.n8.l;
import com.smartdigimkt.n8.p;
import com.smartdigimkt.sdk.api.AdError;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static volatile c f36088u;
    private volatile String f;
    private volatile String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile String f36093h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile String f36094i;
    private File k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36089a = "c";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36090b = com.smartdigimkt.n8.b.a("aHR0cHM6Ly9kMnExeTd0aXIyODF4Ni5jbG91ZGZyb250Lm5ldC9vbXNkay9vbXNka192MS41LjIuanM=");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f36091c = com.smartdigimkt.n8.b.a("aHR0cHM6Ly9kMnExeTd0aXIyODF4Ni5jbG91ZGZyb250Lm5ldC9vbXNkay9vbXNka193ZWJ2aWV3X2luamVjdGlvbl9jb250ZW50LnR4dA==");
    private final String d = "omsdk_sdk_js.txt";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f36092e = "omsdk_webview_injection_content.txt";
    private final String j = "sdm_omsdk/";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f36095l = false;
    boolean m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final String f36096n = "omsdk_sdk_js_url";
    final String o = "omsdk_webview_injection_content_url";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Object f36097p = new Object();
    private String q = "";
    private String r = "";
    private String s = "";
    private String t = "";

    public class a implements Runnable {
        final /* synthetic */ Context X;

        public a(Context context) {
            this.X = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.f(this.X);
            c.this.g(this.X);
            c cVar = c.this;
            cVar.g = cVar.a("omsdk_sdk_js.txt");
            c cVar2 = c.this;
            cVar2.f36094i = cVar2.a("omsdk_webview_injection_content.txt");
        }
    }

    public class d implements Runnable {
        final /* synthetic */ String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f36103Y;

        public d(String str, String str2) {
            this.X = str;
            this.f36103Y = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.this.f36097p) {
                try {
                    if (!c.this.k.exists()) {
                        c.this.k.mkdirs();
                    }
                    File file = new File(c.this.k, this.X);
                    if (file.exists()) {
                        file.delete();
                    }
                    l.a(this.f36103Y.getBytes(), file);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void g(Context context) {
        if (context == null) {
            try {
                context = com.smartdigimkt.m6.b.p().k();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.s = p.a(context, "sdm_sdk", "omsdk_webview_injection_content_url", "");
    }

    public boolean f() {
        return com.smartdigimkt.k8.a.e().b().b0() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void f(Context context) {
        if (context == null) {
            try {
                context = com.smartdigimkt.m6.b.p().k();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.q = p.a(context, "sdm_sdk", "omsdk_sdk_js_url", "");
    }

    public void c(Context context) {
        try {
            this.k = new File(com.smartdigimkt.m6.b.p().k().getFilesDir().getAbsoluteFile().getAbsolutePath() + "/sdm_omsdk/");
        } catch (Throwable unused) {
        }
        com.smartdigimkt.l7.b.a().g(new a(context));
    }

    public boolean d(Context context) {
        boolean zF;
        String strA0;
        if (this.f36095l) {
            return false;
        }
        com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
        if (aVarB != null && !aVarB.M0()) {
            zF = f();
        } else {
            zF = !com.smartdigimkt.m6.b.p().y();
        }
        if (!zF) {
            return false;
        }
        if (aVarB != null && !aVarB.M0()) {
            strA0 = aVarB.a0();
        } else {
            strA0 = "";
        }
        if (TextUtils.isEmpty(strA0)) {
            strA0 = this.f36090b;
        }
        if (TextUtils.isEmpty(strA0) || TextUtils.equals(this.r, strA0)) {
            return false;
        }
        String strB = b();
        if (!TextUtils.isEmpty(strB) && TextUtils.equals(strB, strA0)) {
            if (TextUtils.isEmpty(this.g)) {
                this.g = a("omsdk_sdk_js.txt");
            }
            return false;
        }
        this.f = strA0;
        return true;
    }

    public boolean e(Context context) {
        boolean zF;
        String strC0;
        if (this.m) {
            return false;
        }
        com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
        if (aVarB != null && !aVarB.M0()) {
            zF = f();
        } else {
            zF = !com.smartdigimkt.m6.b.p().y();
        }
        if (!zF) {
            return false;
        }
        if (aVarB != null && !aVarB.M0()) {
            strC0 = aVarB.c0();
        } else {
            strC0 = "";
        }
        if (TextUtils.isEmpty(strC0)) {
            strC0 = this.f36091c;
        }
        if (TextUtils.isEmpty(strC0) || TextUtils.equals(this.t, strC0)) {
            return false;
        }
        String strC = c();
        if (!TextUtils.isEmpty(strC) && TextUtils.equals(strC, strC0)) {
            if (TextUtils.isEmpty(this.f36094i)) {
                this.f36094i = a("omsdk_webview_injection_content.txt");
            }
            return false;
        }
        this.f36093h = strC0;
        return true;
    }

    private synchronized String c() {
        return this.s;
    }

    public void b(Context context) {
        if (e(context)) {
            this.m = true;
            try {
                new f(this.f36093h).a(1, (com.smartdigimkt.w7.c) new C0514c(context));
            } catch (Throwable unused) {
                this.m = false;
            }
        }
    }

    public static c a() {
        if (f36088u == null) {
            synchronized (c.class) {
                try {
                    if (f36088u == null) {
                        f36088u = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f36088u;
    }

    public class b implements com.smartdigimkt.w7.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f36099a;

        public b(Context context) {
            this.f36099a = context;
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2, Object obj) {
            String string = obj != null ? obj.toString() : "";
            String unused = c.this.f36089a;
            String unused2 = c.this.f;
            string.length();
            if (!TextUtils.isEmpty(string)) {
                c cVar = c.this;
                cVar.a(this.f36099a, cVar.f);
                c.this.g = string;
                c.this.a(string, "omsdk_sdk_js.txt");
            }
            c.this.f36095l = false;
        }

        @Override // com.smartdigimkt.w7.c
        public void b(int i2) {
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2, String str, AdError adError) {
            c cVar = c.this;
            cVar.r = cVar.f;
            c cVar2 = c.this;
            cVar2.f36095l = false;
            com.smartdigimkt.i7.d.a(1, cVar2.f, adError != null ? adError.getErrorInfo() : "");
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2) {
            c.this.f36095l = false;
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.j5.c$c, reason: collision with other inner class name */
    public class C0514c implements com.smartdigimkt.w7.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f36101a;

        public C0514c(Context context) {
            this.f36101a = context;
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2, Object obj) {
            String string = obj != null ? obj.toString() : "";
            String unused = c.this.f36089a;
            String unused2 = c.this.f36093h;
            string.length();
            if (!TextUtils.isEmpty(string)) {
                c cVar = c.this;
                cVar.b(this.f36101a, cVar.f36093h);
                c.this.f36094i = string;
                c.this.a(string, "omsdk_webview_injection_content.txt");
            }
            c.this.m = false;
        }

        @Override // com.smartdigimkt.w7.c
        public void b(int i2) {
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2, String str, AdError adError) {
            c cVar = c.this;
            cVar.t = cVar.f36093h;
            c cVar2 = c.this;
            cVar2.m = false;
            com.smartdigimkt.i7.d.a(2, cVar2.f36093h, adError != null ? adError.getErrorInfo() : "");
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2) {
            c.this.m = false;
        }
    }

    private synchronized String b() {
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(Context context, String str) {
        this.s = str;
        p.b(context, "sdm_sdk", "omsdk_webview_injection_content_url", str);
    }

    public void a(Context context) {
        if (d(context)) {
            this.f36095l = true;
            try {
                new f(this.f).a(1, (com.smartdigimkt.w7.c) new b(context));
            } catch (Throwable unused) {
                this.f36095l = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized String a(String str) {
        String strD;
        synchronized (this.f36097p) {
            strD = "";
            try {
                File file = new File(this.k, str);
                if (file.exists() && file.canRead()) {
                    strD = l.d(file);
                }
            } catch (Throwable unused) {
            }
        }
        return strD;
    }

    public String d() {
        if (!f()) {
            return "";
        }
        return this.g;
    }

    public String e() {
        if (!f()) {
            return "";
        }
        return this.f36094i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        com.smartdigimkt.l7.b.a().g(new d(str2, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(Context context, String str) {
        this.q = str;
        p.b(context, "sdm_sdk", "omsdk_sdk_js_url", str);
    }
}
