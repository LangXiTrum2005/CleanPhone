package com.smartdigimkt.e;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.smartdigimkt.expressad.advanced.js.NativeAdvancedJSBridgeImpl;
import com.smartdigimkt.expressad.advanced.js.NativeAdvancedJsUtils;
import com.smartdigimkt.expressad.advanced.view.ATNativeAdvancedView;
import com.smartdigimkt.expressad.advanced.view.ATNativeAdvancedWebview;
import com.smartdigimkt.v0.l;
import com.smartdigimkt.v0.s;
import com.smartdigimkt.v0.v;
import com.smartdigimkt.v0.z;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final int f34536A = 1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final int f34537B = 2;
    private static final int C = 3;
    private static final int D = 4;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final int f34538E = 5;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static String f34539z = "NativeAdvancedLoadManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f34542c;
    private com.smartdigimkt.f.b d;
    private ATNativeAdvancedView f;
    private com.smartdigimkt.n1.c g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<com.smartdigimkt.x.d> f34544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.smartdigimkt.x.d f34545i;
    private int j;
    private int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f34546l;
    private int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f34547n;
    private int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f34548p;
    private volatile boolean q;
    private com.smartdigimkt.e3.c r;
    private com.smartdigimkt.c3.i.e s;
    private com.smartdigimkt.c3.i.e t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f34549u;
    private int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f34550w = "";
    private Handler x = new HandlerC0462b(Looper.getMainLooper());
    private Runnable y = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f34543e = com.smartdigimkt.m6.b.p().k();

    /* JADX INFO: renamed from: com.smartdigimkt.e.b$b, reason: collision with other inner class name */
    public class HandlerC0462b extends Handler {
        public HandlerC0462b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2;
            Object obj;
            super.handleMessage(message);
            int i3 = message.what;
            if (i3 == 1) {
                Object obj2 = message.obj;
                int i4 = message.arg1;
                if (obj2 == null || !(obj2 instanceof com.smartdigimkt.x.d)) {
                    return;
                }
                com.smartdigimkt.x.d dVar = (com.smartdigimkt.x.d) obj2;
                b.this.a(com.smartdigimkt.c3.i.a().c(dVar.U()), dVar, i4);
                return;
            }
            if (i3 == 2) {
                Object obj3 = message.obj;
                try {
                    if (obj3 instanceof Bundle) {
                        int i5 = ((Bundle) obj3).getInt("type");
                        if (i5 == 1) {
                            i2 = com.smartdigimkt.y.b.f39996e;
                        } else if (i5 == 2) {
                            i2 = com.smartdigimkt.y.b.f39997h;
                        } else {
                            i2 = i5 == 3 ? com.smartdigimkt.y.b.g : com.smartdigimkt.y.b.x;
                        }
                        com.smartdigimkt.y.c cVar = new com.smartdigimkt.y.c(i2);
                        String string = ((Bundle) obj3).getString("msg");
                        com.smartdigimkt.x.d dVar2 = (com.smartdigimkt.x.d) ((Bundle) obj3).getSerializable("campaignex");
                        cVar.f(string);
                        cVar.a(dVar2);
                        b bVar = b.this;
                        bVar.a(cVar, bVar.f34547n, b.this.o, dVar2);
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    com.smartdigimkt.y.c cVar2 = new com.smartdigimkt.y.c(com.smartdigimkt.y.b.f39990a);
                    cVar2.a((Throwable) e2);
                    b bVar2 = b.this;
                    bVar2.a(cVar2, bVar2.f34547n, b.this.o, (com.smartdigimkt.x.d) null);
                    return;
                }
            }
            if (i3 == 3) {
                Object obj4 = message.obj;
                if (obj4 == null || !(obj4 instanceof com.smartdigimkt.x.d)) {
                    return;
                }
                b bVar3 = b.this;
                bVar3.i((com.smartdigimkt.x.d) obj4, bVar3.o);
                return;
            }
            if (i3 != 4) {
                if (i3 == 5 && (obj = message.obj) != null && (obj instanceof com.smartdigimkt.x.d)) {
                    if (b.this.f != null) {
                        b.this.f.setVideoReady(true);
                    }
                    b bVar4 = b.this;
                    bVar4.i((com.smartdigimkt.x.d) obj, bVar4.o);
                    return;
                }
                return;
            }
            Object obj5 = message.obj;
            if (obj5 == null || !(obj5 instanceof com.smartdigimkt.x.d)) {
                return;
            }
            if (b.this.f != null) {
                b.this.f.setEndCardReady(true);
            }
            b bVar5 = b.this;
            bVar5.i((com.smartdigimkt.x.d) obj5, bVar5.o);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.smartdigimkt.y.c cVar = new com.smartdigimkt.y.c(com.smartdigimkt.y.b.k);
            b bVar = b.this;
            bVar.a(cVar, bVar.f34547n, b.this.o, (com.smartdigimkt.x.d) null);
        }
    }

    public class e implements com.smartdigimkt.c3.i.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.x.d f34557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f34558b;

        public e(com.smartdigimkt.x.d dVar, int i2) {
            this.f34557a = dVar;
            this.f34558b = i2;
        }

        @Override // com.smartdigimkt.c3.i.b
        public void a(String str, String str2, boolean z2) {
            String unused = b.f34539z;
            if (b.this.x != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 4;
                messageObtain.obj = this.f34557a;
                messageObtain.arg1 = this.f34558b;
                b.this.x.sendMessage(messageObtain);
            }
        }

        @Override // com.smartdigimkt.c3.i.b
        public void b(String str, String str2) {
            String unused = b.f34539z;
            if (b.this.f != null) {
                b.this.f.setEndCardReady(false);
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f34557a);
            bundle.putString("msg", str);
            bundle.putInt("type", 2);
            messageObtain.obj = bundle;
            b.this.x.sendMessage(messageObtain);
        }
    }

    public class g implements Runnable {
        final /* synthetic */ com.smartdigimkt.x.d X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ int f34563Y;

        public class a implements Runnable {
            final /* synthetic */ File X;

            public a(File file) {
                this.X = file;
            }

            @Override // java.lang.Runnable
            public void run() {
                b bVar = b.this;
                String str = "file:////" + this.X.getAbsolutePath();
                g gVar = g.this;
                bVar.a(str, gVar.X, gVar.f34563Y);
            }
        }

        public g(com.smartdigimkt.x.d dVar, int i2) {
            this.X = dVar;
            this.f34563Y = i2;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            FileOutputStream fileOutputStream;
            File file;
            File file2;
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    try {
                        file2 = new File(this.X.Q());
                        try {
                            if (!file2.exists()) {
                                String strB = com.smartdigimkt.e0.d.b(com.smartdigimkt.e0.a.ANYTHINK_700_HTML);
                                String strA = s.a(z.b(this.X.Q()));
                                if (TextUtils.isEmpty(strA)) {
                                    strA = String.valueOf(System.currentTimeMillis());
                                }
                                file = new File(strB, strA.concat(".html"));
                                try {
                                    if (!file.exists()) {
                                        fileOutputStream = new FileOutputStream(file);
                                        try {
                                            fileOutputStream.write(("<script>" + com.smartdigimkt.j5.b.a().b() + "</script>" + this.X.Q()).getBytes());
                                            fileOutputStream.flush();
                                            fileOutputStream2 = fileOutputStream;
                                        } catch (Exception e2) {
                                            e = e2;
                                            fileOutputStream2 = fileOutputStream;
                                            e.printStackTrace();
                                            this.X.e0("");
                                            file2 = file;
                                            if (fileOutputStream2 != null) {
                                            }
                                            if (!file2.exists()) {
                                            }
                                            String unused = b.f34539z;
                                            com.smartdigimkt.y.c cVar = new com.smartdigimkt.y.c(com.smartdigimkt.y.b.m);
                                            b bVar = b.this;
                                            bVar.a(cVar, bVar.f34547n, this.f34563Y, this.X);
                                        } catch (Throwable th) {
                                            th = th;
                                            if (fileOutputStream != null) {
                                                fileOutputStream.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    file2 = file;
                                } catch (Exception e3) {
                                    e = e3;
                                }
                            }
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                        } catch (Exception e4) {
                            e = e4;
                            file = file2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                    }
                } catch (Exception e5) {
                    e = e5;
                    file = null;
                }
                if (!file2.exists() && file2.isFile() && file2.canRead()) {
                    this.X.x(file2.getAbsolutePath());
                    String unused2 = b.f34539z;
                    com.smartdigimkt.l7.b.a().e(new a(file2));
                } else {
                    String unused3 = b.f34539z;
                    com.smartdigimkt.y.c cVar2 = new com.smartdigimkt.y.c(com.smartdigimkt.y.b.m);
                    b bVar2 = b.this;
                    bVar2.a(cVar2, bVar2.f34547n, this.f34563Y, this.X);
                }
            } catch (Exception unused4) {
                com.smartdigimkt.y.c cVar3 = new com.smartdigimkt.y.c(com.smartdigimkt.y.b.m);
                b bVar3 = b.this;
                bVar3.a(cVar3, bVar3.f34547n, this.f34563Y, this.X);
            }
        }
    }

    public class h implements com.smartdigimkt.c3.i.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.x.d f34565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f34566b;

        public h(com.smartdigimkt.x.d dVar, int i2) {
            this.f34565a = dVar;
            this.f34566b = i2;
        }

        @Override // com.smartdigimkt.c3.i.b
        public void a(String str, String str2, boolean z2) {
            String unused = b.f34539z;
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = this.f34565a;
            messageObtain.arg1 = this.f34566b;
            b.this.x.sendMessage(messageObtain);
        }

        @Override // com.smartdigimkt.c3.i.b
        public void b(String str, String str2) {
            String unused = b.f34539z;
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f34565a);
            bundle.putString("msg", str);
            bundle.putInt("type", 3);
            messageObtain.obj = bundle;
            b.this.x.sendMessage(messageObtain);
        }
    }

    public class i extends com.smartdigimkt.k.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.x.d f34568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f34569c;

        public i(com.smartdigimkt.x.d dVar, int i2) {
            this.f34568b = dVar;
            this.f34569c = i2;
        }

        @Override // com.smartdigimkt.k.b, com.smartdigimkt.u4.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!this.f34568b.I2()) {
                b.this.f.setH5Ready(true);
                com.smartdigimkt.c.a.a(this.f34568b.N1(), true);
                b.this.h(this.f34568b, this.f34569c);
            }
            NativeAdvancedJsUtils.fireOnJSBridgeConnected(webView);
        }

        @Override // com.smartdigimkt.k.b, com.smartdigimkt.u4.c
        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            super.onReceivedError(webView, i2, str, str2);
            b.this.a(this.f34568b, str, this.f34569c);
        }

        @Override // com.smartdigimkt.k.b, com.smartdigimkt.u4.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslError.getPrimaryError();
            b.this.a(this.f34568b, "onReceivedSslError:" + sslError.getUrl(), this.f34569c);
        }

        @Override // com.smartdigimkt.k.b, com.smartdigimkt.u4.c
        public void readyState(WebView webView, int i2) {
            super.readyState(webView, i2);
            if (i2 != 1) {
                b.this.a(this.f34568b, "readyState 2", this.f34569c);
                return;
            }
            b.this.f.setH5Ready(true);
            com.smartdigimkt.c.a.a(this.f34568b.N1(), true);
            b.this.h(this.f34568b, this.f34569c);
        }
    }

    public class j implements Runnable {
        final /* synthetic */ ATNativeAdvancedWebview X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f34570Y;

        public j(ATNativeAdvancedWebview aTNativeAdvancedWebview, String str) {
            this.X = aTNativeAdvancedWebview;
            this.f34570Y = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.loadUrl(z.d(this.f34570Y));
        }
    }

    public b(String str, String str2, long j2) {
        this.f34541b = str;
        this.f34540a = str2;
    }

    private void a(com.smartdigimkt.x.d dVar) {
    }

    private void b(com.smartdigimkt.x.d dVar, String str, int i2) {
    }

    private void h() {
        this.v = 0;
    }

    private void i() {
        try {
            int i2 = this.v + 1;
            this.v = i2;
            com.smartdigimkt.n1.c cVar = this.g;
            if (cVar != null && i2 <= cVar.A()) {
                return;
            }
            this.v = 0;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void j(com.smartdigimkt.x.d dVar, int i2) {
        this.f34545i = dVar;
        if (com.smartdigimkt.e.d.a(this.f, dVar, this.f34541b, this.f34540a)) {
            i(dVar, i2);
        } else {
            e(dVar, i2);
        }
    }

    public com.smartdigimkt.x.d e() {
        return this.f34545i;
    }

    public String f() {
        return this.f34550w;
    }

    public void g() {
        if (this.d != null) {
            this.d = null;
        }
        if (this.r != null) {
            this.r = null;
        }
        if (this.s != null) {
            this.s = null;
        }
    }

    private void e(com.smartdigimkt.x.d dVar, int i2) {
        ATNativeAdvancedView aTNativeAdvancedView = this.f;
        if (aTNativeAdvancedView != null) {
            aTNativeAdvancedView.clearResState();
        }
        if (!TextUtils.isEmpty(dVar.U())) {
            dVar.U();
            g(dVar, i2);
        }
        if (!TextUtils.isEmpty(dVar.Q())) {
            dVar.Q();
            d(dVar, i2);
        }
        if (!TextUtils.isEmpty(dVar.u2())) {
            dVar.u2();
            f(dVar, i2);
        }
        if (!TextUtils.isEmpty(dVar.k())) {
            dVar.k();
            c(dVar, i2);
        }
        if (!TextUtils.isEmpty(dVar.B2())) {
            dVar.B2();
            a(dVar, i2);
        }
        if (TextUtils.isEmpty(dVar.F0())) {
            return;
        }
        dVar.F0();
        b(dVar, i2);
    }

    private void f(com.smartdigimkt.x.d dVar, int i2) {
        this.r = new a(dVar);
        CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(dVar);
        com.smartdigimkt.c3.e.a().a(this.f34543e, this.f34540a, copyOnWriteArrayList, com.smartdigimkt.b0.a.b1, this.r);
        if (!com.smartdigimkt.c3.e.a().b(com.smartdigimkt.b0.a.b1, this.f34540a, dVar.D2())) {
            com.smartdigimkt.c3.e.a().f(this.f34540a);
        } else {
            this.f.setVideoReady(true);
            i(dVar, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(com.smartdigimkt.x.d dVar, int i2) {
        if (this.f.isH5Ready()) {
            i(dVar, i2);
            b(dVar, "", 1);
        }
    }

    public int c() {
        return this.k;
    }

    public String d() {
        return l.a(this.f34544h);
    }

    public class d implements com.smartdigimkt.f0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.x.d f34554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f34555b;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = d.this;
                b.this.i(dVar.f34554a, dVar.f34555b);
            }
        }

        /* JADX INFO: renamed from: com.smartdigimkt.e.b$d$b, reason: collision with other inner class name */
        public class RunnableC0463b implements Runnable {
            public RunnableC0463b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = d.this;
                b.this.i(dVar.f34554a, dVar.f34555b);
            }
        }

        public d(com.smartdigimkt.x.d dVar, int i2) {
            this.f34554a = dVar;
            this.f34555b = i2;
        }

        @Override // com.smartdigimkt.f0.c
        public void a(Bitmap bitmap, String str) {
            String unused = b.f34539z;
            if (b.this.x != null) {
                b.this.x.post(new a());
            }
        }

        @Override // com.smartdigimkt.f0.c
        public void a(String str, String str2) {
            String unused = b.f34539z;
            if (b.this.x != null) {
                b.this.x.post(new RunnableC0463b());
            }
        }
    }

    public class f implements com.smartdigimkt.f0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.x.d f34560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f34561b;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = f.this;
                b.this.i(fVar.f34560a, fVar.f34561b);
            }
        }

        /* JADX INFO: renamed from: com.smartdigimkt.e.b$f$b, reason: collision with other inner class name */
        public class RunnableC0464b implements Runnable {
            public RunnableC0464b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = f.this;
                b.this.i(fVar.f34560a, fVar.f34561b);
            }
        }

        public f(com.smartdigimkt.x.d dVar, int i2) {
            this.f34560a = dVar;
            this.f34561b = i2;
        }

        @Override // com.smartdigimkt.f0.c
        public void a(Bitmap bitmap, String str) {
            String unused = b.f34539z;
            if (b.this.x != null) {
                b.this.x.post(new a());
            }
        }

        @Override // com.smartdigimkt.f0.c
        public void a(String str, String str2) {
            String unused = b.f34539z;
            if (b.this.x != null) {
                b.this.x.post(new RunnableC0464b());
            }
        }
    }

    private void c(com.smartdigimkt.x.d dVar, int i2) {
        com.smartdigimkt.f0.b.a(com.smartdigimkt.m6.b.p().k()).a(dVar.k(), new f(dVar, i2));
    }

    private void d(com.smartdigimkt.x.d dVar, int i2) {
        com.smartdigimkt.l7.b.a().g(new g(dVar, i2));
    }

    public void b(int i2) {
        this.k = i2;
    }

    public class a implements com.smartdigimkt.e3.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.x.d f34551a;

        public a(com.smartdigimkt.x.d dVar) {
            this.f34551a = dVar;
        }

        @Override // com.smartdigimkt.e3.c
        public void a(String str) {
            String unused = b.f34539z;
            Message messageObtain = Message.obtain();
            messageObtain.obj = this.f34551a;
            messageObtain.what = 5;
            b.this.x.sendMessage(messageObtain);
        }

        @Override // com.smartdigimkt.e3.c
        public void a(String str, String str2) {
            String unused = b.f34539z;
            Message messageObtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putSerializable("campaignex", this.f34551a);
            bundle.putString("msg", str);
            bundle.putInt("type", 1);
            messageObtain.obj = bundle;
            messageObtain.what = 2;
            b.this.x.sendMessage(messageObtain);
        }
    }

    private List<com.smartdigimkt.x.d> b(com.smartdigimkt.x.e eVar) {
        if (eVar == null || eVar.f() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        com.smartdigimkt.x.d dVar = eVar.f().get(0);
        dVar.G(this.f34540a);
        a(dVar);
        this.f34549u = eVar.A();
        if (dVar.w1() != 99 && (!TextUtils.isEmpty(dVar.U()) || !TextUtils.isEmpty(dVar.Q()))) {
            if (v.b(dVar)) {
                dVar.h0(v.a(this.f34543e, dVar.n()) ? 1 : 2);
            }
            if (l.a(this.f34543e, dVar)) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(com.smartdigimkt.x.d dVar, int i2) {
        if (!com.smartdigimkt.e.d.a(this.f, dVar, this.f34541b, this.f34540a) || this.q) {
            return;
        }
        b();
        this.q = true;
        com.smartdigimkt.f.b bVar = this.d;
        if (bVar != null) {
            bVar.a(dVar, i2);
        }
    }

    private void g(com.smartdigimkt.x.d dVar, int i2) {
        String strU;
        this.s = new h(dVar, i2);
        com.smartdigimkt.q0.e eVar = new com.smartdigimkt.q0.e();
        eVar.a(dVar);
        int i3 = 0;
        if (dVar != null) {
            i3 = dVar.O() != null ? dVar.O().f39646a : 0;
            strU = dVar.U();
        } else {
            strU = "";
        }
        eVar.c(i3);
        eVar.b(2);
        com.smartdigimkt.c3.i.a().b(strU, (com.smartdigimkt.c3.i.b) this.s);
    }

    public void a(com.smartdigimkt.n1.c cVar) {
        this.g = cVar;
    }

    public void a(ATNativeAdvancedView aTNativeAdvancedView) {
        this.f = aTNativeAdvancedView;
    }

    public void a(int i2) {
        this.j = i2;
    }

    public void a(int i2, int i3) {
        this.m = i2;
        this.f34546l = i3;
    }

    private void a(long j2) {
        this.x.postDelayed(this.y, j2);
    }

    public void a(com.smartdigimkt.x.e eVar) {
        List<com.smartdigimkt.x.d> listB = b(eVar);
        if (listB != null && listB.size() > 0) {
            i();
            listB.size();
            com.smartdigimkt.x.d dVar = listB.get(0);
            if (TextUtils.isEmpty(dVar.U()) && (TextUtils.isEmpty(dVar.Q()) || !dVar.Q().contains("<MBTPLMARK>"))) {
                dVar.h(false);
                dVar.k(true);
            } else {
                dVar.h(true);
                dVar.k(false);
            }
            j(dVar, 2);
            return;
        }
        a(new com.smartdigimkt.y.c(com.smartdigimkt.y.b.G), "", 2, (eVar == null || eVar.f() == null || eVar.f().size() == 0) ? null : eVar.f().get(0));
    }

    private void b() {
        this.x.removeCallbacks(this.y);
    }

    private void b(com.smartdigimkt.x.d dVar, int i2) {
        com.smartdigimkt.f0.b.a(com.smartdigimkt.m6.b.p().k()).a(dVar.F0(), new d(dVar, i2));
    }

    public void a(com.smartdigimkt.f.b bVar) {
        this.d = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.smartdigimkt.y.c cVar, String str, int i2, com.smartdigimkt.x.d dVar) {
        if (cVar != null) {
            cVar.a(dVar);
        }
        a(cVar, i2, dVar);
    }

    private void a(com.smartdigimkt.y.c cVar, int i2, com.smartdigimkt.x.d dVar) {
        if (this.q) {
            return;
        }
        b();
        if (cVar != null) {
            cVar.j();
        }
        this.q = true;
        com.smartdigimkt.f.b bVar = this.d;
        if (bVar != null) {
            bVar.a(cVar, i2);
        }
    }

    private void a(com.smartdigimkt.x.d dVar, int i2) {
        String strB2;
        this.t = new e(dVar, i2);
        int i3 = 0;
        if (dVar != null) {
            i3 = dVar.O() != null ? dVar.O().f39646a : 0;
            strB2 = dVar.B2();
        } else {
            strB2 = "";
        }
        com.smartdigimkt.q0.e eVar = new com.smartdigimkt.q0.e();
        eVar.a(dVar);
        eVar.c(i3);
        com.smartdigimkt.c3.i.a().b(strB2, (com.smartdigimkt.c3.i.b) this.t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.smartdigimkt.x.d dVar, int i2) {
        ATNativeAdvancedView aTNativeAdvancedView = this.f;
        if (aTNativeAdvancedView == null || aTNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        NativeAdvancedJSBridgeImpl nativeAdvancedJSBridgeImpl = new NativeAdvancedJSBridgeImpl(this.f.getContext(), this.f34541b, this.f34540a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar);
        nativeAdvancedJSBridgeImpl.setCampaignList(arrayList);
        nativeAdvancedJSBridgeImpl.setAllowSkip(this.j);
        nativeAdvancedJSBridgeImpl.setCountdownS(this.k);
        this.f.setAdvancedNativeJSBridgeImpl(nativeAdvancedJSBridgeImpl);
        System.currentTimeMillis();
        ATNativeAdvancedWebview advancedNativeWebview = this.f.getAdvancedNativeWebview();
        if (advancedNativeWebview == null) {
            a(dVar, "webview is null", i2);
            return;
        }
        if (advancedNativeWebview.isDestroyed()) {
            a(dVar, "webview is destroyed", i2);
            return;
        }
        advancedNativeWebview.setWebViewListener(new i(dVar, i2));
        if (!advancedNativeWebview.isDestroyed()) {
            Handler handler = this.x;
            if (handler != null) {
                handler.post(new j(advancedNativeWebview, str));
                return;
            }
            return;
        }
        a(new com.smartdigimkt.y.c(com.smartdigimkt.y.b.f39979E), this.f34547n, i2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.smartdigimkt.x.d dVar, String str, int i2) {
        com.smartdigimkt.y.c cVar = new com.smartdigimkt.y.c(com.smartdigimkt.y.b.j);
        cVar.f(str);
        a(cVar, this.f34547n, i2, dVar);
        b(dVar, str, 2);
    }

    public String a(String str) {
        if (this.f34545i != null) {
            try {
                com.smartdigimkt.c3.c cVarA = com.smartdigimkt.c3.e.a().a(this.f34540a, this.f34545i.j() + this.f34545i.u2() + this.f34545i.e0());
                if (cVarA != null && cVarA.h() == 5) {
                    String strJ = cVarA.j();
                    if (new File(strJ).exists()) {
                        return strJ;
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return str;
        }
        return "";
    }
}
