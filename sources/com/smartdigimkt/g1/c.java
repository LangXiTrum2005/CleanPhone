package com.smartdigimkt.g1;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.p004ironsource.f9;
import com.smartdigimkt.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.smartdigimkt.expressad.video.bt.module.AnythinkBTLayout;
import com.smartdigimkt.expressad.video.bt.module.AnythinkBTRootLayout;
import com.smartdigimkt.v0.v;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f35272h = "RewardCampaignsResourceManager";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static Map<String, d> f35273i = null;
    private static final int j = 100;
    private static final int k = 200;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f35274l = 101;
    private static final int m = 201;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f35275n = 102;
    private static final int o = 202;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f35276p = 103;
    private static final int q = 203;
    private static final int r = 104;
    private static final int s = 204;
    private static final int t = 105;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f35277u = 205;
    private static final int v = 106;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f35278w = 0;
    private static final int x = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f35279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, List<com.smartdigimkt.x.d>> f35280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35281c;
    private final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f35282e;
    private final String f;
    private volatile List<WindVaneWebView> g;

    public class a implements Runnable {
        final /* synthetic */ CopyOnWriteArrayList X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ Context f35283Y;
        final /* synthetic */ String Z;
        final /* synthetic */ int e0;
        final /* synthetic */ String f0;
        final /* synthetic */ String g0;
        final /* synthetic */ l h0;

        public a(CopyOnWriteArrayList copyOnWriteArrayList, Context context, String str, int i2, String str2, String str3, l lVar) {
            this.X = copyOnWriteArrayList;
            this.f35283Y = context;
            this.Z = str;
            this.e0 = i2;
            this.f0 = str2;
            this.g0 = str3;
            this.h0 = lVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<String> list;
            CopyOnWriteArrayList copyOnWriteArrayList = this.X;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                return;
            }
            try {
                com.smartdigimkt.c3.l.a().a(this.X);
                com.smartdigimkt.c3.e.a().a(this.f35283Y, this.Z, this.X, this.e0, new i(c.this.f35279a, this.f0, this.Z, this.g0));
                com.smartdigimkt.c3.e.a().f(this.Z);
            } catch (Exception e2) {
                if (com.smartdigimkt.b.b.f33800a) {
                    e2.getLocalizedMessage();
                }
            }
            for (com.smartdigimkt.x.d dVar : this.X) {
                if (dVar != null) {
                    dVar.g1();
                    try {
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 106;
                        Bundle bundle = new Bundle();
                        bundle.putString("unit_id", this.Z);
                        bundle.putString(com.smartdigimkt.b.b.f33814z, this.f0);
                        bundle.putString("request_id", this.g0);
                        messageObtain.setData(bundle);
                        c.this.f35279a.sendMessage(messageObtain);
                    } catch (Exception unused) {
                    }
                    com.smartdigimkt.x.d.c cVarU1 = dVar.U1();
                    if (cVarU1 != null && !dVar.H2()) {
                        new HashMap();
                        String strF = cVarU1.f();
                        if (!TextUtils.isEmpty(strF) && !strF.contains("cmpt=1")) {
                            if (strF.contains(".zip")) {
                                try {
                                    com.smartdigimkt.c3.i.a().b(strF, (com.smartdigimkt.c3.i.b) new j(this.f35283Y, this.f0, this.Z, this.g0, dVar, 859, c.this.f35279a, this.h0, this.X));
                                } catch (Exception e3) {
                                    if (com.smartdigimkt.b.b.f33800a) {
                                        e3.getLocalizedMessage();
                                    }
                                }
                            } else {
                                try {
                                    com.smartdigimkt.c3.i.a().b(strF, new g(859, this.f0, this.Z, this.g0, dVar, this.h0, c.this.f35279a, this.X));
                                } catch (Exception e4) {
                                    if (com.smartdigimkt.b.b.f33800a) {
                                        e4.getLocalizedMessage();
                                    }
                                }
                            }
                        }
                    }
                    String strB2 = dVar.B2();
                    boolean zH2 = dVar.H2();
                    boolean zH = v.h(strB2);
                    if (!zH2 || zH) {
                        c.this.a(this.f35283Y, this.f0, this.Z, this.g0, dVar, strB2, this.h0, (CopyOnWriteArrayList<com.smartdigimkt.x.d>) this.X);
                    }
                    if (!TextUtils.isEmpty(dVar.x0()) && !dVar.H2()) {
                        com.smartdigimkt.c3.i.a().a(dVar.x0());
                    }
                    String strI = dVar.i();
                    if (!TextUtils.isEmpty(strI)) {
                        try {
                            com.smartdigimkt.f0.b bVarA = com.smartdigimkt.f0.b.a(this.f35283Y);
                            try {
                                h hVar = new h(c.this.f35279a, 0, this.f0, this.Z, this.g0, dVar);
                                dVar = dVar;
                                bVarA.a(strI, hVar);
                            } catch (Exception e5) {
                                e = e5;
                                dVar = dVar;
                                if (com.smartdigimkt.b.b.f33800a) {
                                    e.getLocalizedMessage();
                                }
                            }
                        } catch (Exception e6) {
                            e = e6;
                        }
                    }
                    String strK = dVar.k();
                    if (!TextUtils.isEmpty(strK)) {
                        try {
                            com.smartdigimkt.x.d dVar2 = dVar;
                            try {
                                dVar = dVar2;
                                com.smartdigimkt.f0.b.a(this.f35283Y).a(strK, new h(c.this.f35279a, 0, this.f0, this.Z, this.g0, dVar2));
                            } catch (Exception e7) {
                                e = e7;
                                dVar = dVar2;
                                if (com.smartdigimkt.b.b.f33800a) {
                                    e.getLocalizedMessage();
                                }
                            }
                        } catch (Exception e8) {
                            e = e8;
                        }
                    }
                    if (cVarU1 != null) {
                        String strD = cVarU1.d();
                        if (!TextUtils.isEmpty(strD) && !dVar.H2()) {
                            if (dVar.O() != null) {
                                int i2 = dVar.O().f39646a;
                            }
                            if (strD.contains(".zip")) {
                                try {
                                    com.smartdigimkt.c3.i.a().b(strD, (com.smartdigimkt.c3.i.b) new j(this.f35283Y, this.f0, this.Z, this.g0, dVar, 313, c.this.f35279a, this.h0, this.X));
                                } catch (Exception e9) {
                                    if (com.smartdigimkt.b.b.f33800a) {
                                        e9.getLocalizedMessage();
                                    }
                                }
                            } else {
                                try {
                                    com.smartdigimkt.c3.i.a().b(strD, new g(313, this.f0, this.Z, this.g0, dVar, this.h0, c.this.f35279a, this.X));
                                } catch (Exception e10) {
                                    if (com.smartdigimkt.b.b.f33800a) {
                                        e10.getLocalizedMessage();
                                    }
                                }
                            }
                        }
                        List<com.smartdigimkt.x.d.c.a> listB = cVarU1.b();
                        if (listB != null && listB.size() > 0) {
                            for (com.smartdigimkt.x.d.c.a aVar : listB) {
                                if (aVar != null && (list = aVar.f39683b) != null && list.size() > 0) {
                                    for (String str : aVar.f39683b) {
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                com.smartdigimkt.x.d dVar3 = dVar;
                                                try {
                                                    dVar = dVar3;
                                                    com.smartdigimkt.f0.b.a(this.f35283Y).a(str, new h(c.this.f35279a, 1, this.f0, this.Z, this.g0, dVar3));
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    dVar = dVar3;
                                                    if (com.smartdigimkt.b.b.f33800a) {
                                                        e.getLocalizedMessage();
                                                    }
                                                }
                                            } catch (Exception e12) {
                                                e = e12;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public class b implements com.smartdigimkt.c3.i.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f35284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f35285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35286c;
        final /* synthetic */ l d;

        public b(String str, String str2, String str3, l lVar) {
            this.f35284a = str;
            this.f35285b = str2;
            this.f35286c = str3;
            this.d = lVar;
        }

        @Override // com.smartdigimkt.c3.i.b
        public void a(String str, String str2, boolean z2) {
            try {
                com.smartdigimkt.c3.l.a().d(str, true);
                Message messageObtain = Message.obtain();
                messageObtain.what = 105;
                Bundle bundle = new Bundle();
                bundle.putString("unit_id", this.f35284a);
                bundle.putString(com.smartdigimkt.b.b.f33814z, this.f35285b);
                bundle.putString("request_id", this.f35286c);
                bundle.putString("url", str);
                messageObtain.setData(bundle);
                c.this.f35279a.sendMessage(messageObtain);
                l lVar = this.d;
                if (lVar != null) {
                    lVar.a(this.f35285b, this.f35284a, this.f35286c, str);
                }
            } catch (Exception e2) {
                com.smartdigimkt.c3.l.a().d(str, false);
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 205;
                Bundle bundle2 = new Bundle();
                bundle2.putString("unit_id", this.f35284a);
                bundle2.putString(com.smartdigimkt.b.b.f33814z, this.f35285b);
                bundle2.putString("request_id", this.f35286c);
                bundle2.putString("url", str);
                messageObtain2.setData(bundle2);
                c.this.f35279a.sendMessage(messageObtain2);
                l lVar2 = this.d;
                if (lVar2 != null) {
                    lVar2.a(str, this.f35286c, c.b(com.smartdigimkt.y.b.f, "", e2, null));
                }
            }
        }

        @Override // com.smartdigimkt.c3.i.b
        public void b(String str, String str2) {
            try {
                com.smartdigimkt.c3.l.a().d(str2, false);
                Message messageObtain = Message.obtain();
                messageObtain.what = 205;
                Bundle bundle = new Bundle();
                bundle.putString("unit_id", this.f35284a);
                bundle.putString(com.smartdigimkt.b.b.f33814z, this.f35285b);
                bundle.putString("request_id", this.f35286c);
                bundle.putString("url", str2);
                bundle.putString(PglCryptUtils.KEY_MESSAGE, str);
                messageObtain.setData(bundle);
                c.this.f35279a.sendMessage(messageObtain);
                l lVar = this.d;
                if (lVar != null) {
                    try {
                        lVar.a(str2, this.f35286c, c.b(com.smartdigimkt.y.b.f, "", null, null));
                    } catch (Exception e2) {
                        e2.getMessage();
                    }
                }
            } catch (Exception e3) {
                com.smartdigimkt.c3.l.a().d(str2, false);
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 105;
                Bundle bundle2 = new Bundle();
                bundle2.putString("unit_id", this.f35284a);
                bundle2.putString(com.smartdigimkt.b.b.f33814z, this.f35285b);
                bundle2.putString("request_id", this.f35286c);
                bundle2.putString("url", str2);
                bundle2.putString(PglCryptUtils.KEY_MESSAGE, e3.getMessage());
                messageObtain2.setData(bundle2);
                c.this.f35279a.sendMessage(messageObtain2);
                l lVar2 = this.d;
                if (lVar2 != null) {
                    try {
                        lVar2.a(str2, this.f35286c, c.b(com.smartdigimkt.y.b.f, "", e3, null));
                    } catch (Exception e4) {
                        e4.getMessage();
                    }
                }
                if (com.smartdigimkt.b.b.f33800a) {
                    e3.getLocalizedMessage();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.g1.c$c, reason: collision with other inner class name */
    public class RunnableC0485c implements Runnable {
        final /* synthetic */ boolean X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ WindVaneWebView f35288Y;
        final /* synthetic */ com.smartdigimkt.x.d Z;
        final /* synthetic */ List e0;
        final /* synthetic */ String f0;
        final /* synthetic */ com.smartdigimkt.f3.d g0;
        final /* synthetic */ String h0;

        public RunnableC0485c(boolean z2, WindVaneWebView windVaneWebView, com.smartdigimkt.x.d dVar, List list, String str, com.smartdigimkt.f3.d dVar2, String str2) {
            this.X = z2;
            this.f35288Y = windVaneWebView;
            this.Z = dVar;
            this.e0 = list;
            this.f0 = str;
            this.g0 = dVar2;
            this.h0 = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a(this.X, this.f35288Y, this.Z.U1().f(), 0, this.Z, (List<com.smartdigimkt.x.d>) this.e0, com.smartdigimkt.c3.i.a().c(this.Z.U1().f()), this.f0, this.g0, this.h0, c.this.f35281c);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f35289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f35290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f35291c;
        int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f35292e;
        String f;
        int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        CopyOnWriteArrayList<com.smartdigimkt.x.d> f35293h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        CopyOnWriteArrayList<com.smartdigimkt.x.d> f35294i;

        public d(boolean z2, boolean z3, int i2, int i3, String str, String str2, int i4, CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayList) {
            this.f35289a = z2;
            this.f35290b = z3;
            this.f35291c = i2;
            this.d = i3;
            this.f35292e = str;
            this.f = str2;
            this.g = i4;
            this.f35293h = copyOnWriteArrayList;
            this.f35294i = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        }
    }

    public static class e extends com.smartdigimkt.k.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f35295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f35296c;
        private final boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f35297e;
        private int f;
        private String g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f35298h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f35299i;
        private String j;
        private com.smartdigimkt.a3.a.C0428a k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private com.smartdigimkt.x.d f35300l;
        private CopyOnWriteArrayList<com.smartdigimkt.x.d> m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private com.smartdigimkt.f3.d f35301n;
        private final m o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f35302p;
        private boolean q;
        private boolean r;
        private int s = 0;
        private boolean t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private long f35303u;

        public e(boolean z2, Handler handler, Runnable runnable, boolean z3, boolean z4, int i2, String str, String str2, String str3, String str4, com.smartdigimkt.a3.a.C0428a c0428a, com.smartdigimkt.x.d dVar, CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayList, com.smartdigimkt.f3.d dVar2, m mVar, boolean z5, long j) {
            this.f35295b = handler;
            this.f35296c = runnable;
            this.d = z3;
            this.f35297e = z4;
            this.f = i2;
            this.g = str;
            this.f35299i = str2;
            this.f35298h = str3;
            this.j = str4;
            this.k = c0428a;
            this.f35300l = dVar;
            this.m = copyOnWriteArrayList;
            this.f35301n = dVar2;
            this.o = mVar;
            this.f35302p = z5;
            this.t = z2;
            this.f35303u = j;
        }

        @Override // com.smartdigimkt.k.a, com.smartdigimkt.n.c
        public void a(WebView webView, String str, String str2, int i2, int i3) {
        }

        @Override // com.smartdigimkt.k.a, com.smartdigimkt.u4.c
        public void onPageFinished(WebView webView, String str) {
            Runnable runnable;
            super.onPageFinished(webView, str);
            if (this.q) {
                return;
            }
            String str2 = this.f35298h + "_" + this.g;
            if (!str.contains("wfr=1")) {
                com.smartdigimkt.c3.l.a().b(this.f35298h + "_" + this.j + "_" + this.g, true);
                Handler handler = this.f35295b;
                if (handler != null && (runnable = this.f35296c) != null) {
                    handler.removeCallbacks(runnable);
                }
                com.smartdigimkt.a3.a.C0428a c0428a = this.k;
                if (c0428a != null) {
                    c0428a.a(true);
                }
                m mVar = this.o;
                if (mVar != null) {
                    mVar.a(str2, this.f35299i, this.f35298h, this.j, this.g, this.k);
                }
            }
            com.smartdigimkt.n.h.a().a(webView);
            this.q = true;
        }

        @Override // com.smartdigimkt.k.a, com.smartdigimkt.u4.c
        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            super.onReceivedError(webView, i2, str, str2);
            com.smartdigimkt.c3.l.a().b(this.f35298h + "_" + this.j + "_" + this.g, false);
            if (this.o != null) {
                String str3 = this.f35298h + "_" + this.g;
                com.smartdigimkt.a3.a.C0428a c0428a = this.k;
                if (c0428a != null) {
                    c0428a.a(false);
                }
                this.o.a(str3, this.j, this.g, this.k, c.b(com.smartdigimkt.y.b.f39998i, "onReceivedError： " + i2 + "  " + str, null, this.f35300l));
            }
        }

        @Override // com.smartdigimkt.k.a, com.smartdigimkt.u4.c
        public void onRenderProcessGone(WebView webView) {
            if (webView != null) {
                try {
                    com.smartdigimkt.z1.c.c().b(this.f35298h, this.j);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }

        @Override // com.smartdigimkt.k.a, com.smartdigimkt.n.c
        public void preloadSubPlayTemplateView(Object obj, String str) {
            if (obj != null) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    String strOptString = new JSONObject(str).optString("id");
                    com.smartdigimkt.z1.c.c().b(obj, strOptString);
                    String strG = com.smartdigimkt.z1.c.c().g(strOptString);
                    com.smartdigimkt.x.d dVarD = com.smartdigimkt.z1.c.c().d(strOptString);
                    com.smartdigimkt.f3.d dVarE = com.smartdigimkt.z1.c.c().e(strOptString);
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    copyOnWriteArrayList.add(dVarD);
                    WindVaneWebView windVaneWebView = ((com.smartdigimkt.n.b) obj).f36886a;
                    if (windVaneWebView != null) {
                        c.b().a(this.t, windVaneWebView, dVarD, copyOnWriteArrayList, dVarE, strG, strOptString, this.s == 0 ? 3 : 6);
                        this.s++;
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }

        @Override // com.smartdigimkt.k.a, com.smartdigimkt.u4.c
        public void readyState(WebView webView, int i2) {
            Runnable runnable;
            if (this.r) {
                return;
            }
            String str = this.f35298h + "_" + this.g;
            boolean z2 = this.f35302p;
            if (i2 == 1) {
                if (z2) {
                    com.smartdigimkt.a3.a.d(this.f35298h + "_" + this.j);
                } else {
                    com.smartdigimkt.a3.a.c(this.f35298h + "_" + this.j);
                }
                com.smartdigimkt.a3.a.a(this.f35298h + "_" + this.j + "_" + this.g, this.k, true, this.f35302p);
                Handler handler = this.f35295b;
                if (handler != null && (runnable = this.f35296c) != null) {
                    handler.removeCallbacks(runnable);
                }
                com.smartdigimkt.c3.l.a().b(this.f35298h + "_" + this.j + "_" + this.g, true);
                com.smartdigimkt.a3.a.C0428a c0428a = this.k;
                if (c0428a != null) {
                    c0428a.a(true);
                }
                m mVar = this.o;
                if (mVar != null) {
                    mVar.a(str, this.f35299i, this.f35298h, this.j, this.g, this.k);
                }
            } else {
                com.smartdigimkt.c3.l.a().b(this.f35298h + "_" + this.j + "_" + this.g, false);
                com.smartdigimkt.a3.a.C0428a c0428a2 = this.k;
                if (c0428a2 != null) {
                    c0428a2.a(false);
                }
                if (this.o != null) {
                    this.o.a(str, this.j, this.g, this.k, c.b(com.smartdigimkt.y.b.f39998i, android.support.v4.media.a.h(i2, "readyState:"), null, this.f35300l));
                }
            }
            this.r = true;
        }

        @Override // com.smartdigimkt.k.a, com.smartdigimkt.n.c
        public String a(WebView webView, String str, String str2) {
            return com.smartdigimkt.c3.i.a().c(str2);
        }
    }

    public interface f {
        void a(String str, String str2, String str3, CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayList);

        void a(CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayList, com.smartdigimkt.y.c cVar);
    }

    public static final class g implements com.smartdigimkt.c3.i.c {
        public static final int k = 497;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f35304l = 313;
        public static final int m = 859;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f35306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f35307c;
        private final String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f35308e;
        private com.smartdigimkt.x.d f;
        private l g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Handler f35309h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List<com.smartdigimkt.x.d> f35310i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f35305a = false;
        private final long j = System.currentTimeMillis();

        public g(int i2, String str, String str2, String str3, com.smartdigimkt.x.d dVar, l lVar, Handler handler, CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayList) {
            this.f35306b = i2;
            this.f35307c = str;
            this.d = str2;
            this.f35308e = str3;
            this.f = dVar;
            this.g = lVar;
            this.f35309h = handler;
            this.f35310i = copyOnWriteArrayList;
        }

        public void a(boolean z2) {
            this.f35305a = z2;
        }

        @Override // com.smartdigimkt.c3.i.b
        public void b(String str, String str2) {
            com.smartdigimkt.c3.l.a().d(str, false);
            int i2 = this.f35306b;
            if (i2 == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 201;
                Bundle bundle = new Bundle();
                bundle.putString("unit_id", this.d);
                bundle.putString(com.smartdigimkt.b.b.f33814z, this.f35307c);
                bundle.putString("request_id", this.f35308e);
                bundle.putString("url", str);
                bundle.putString(PglCryptUtils.KEY_MESSAGE, str2);
                messageObtain.setData(bundle);
                this.f35309h.sendMessage(messageObtain);
                return;
            }
            if (i2 == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 201;
                Bundle bundle2 = new Bundle();
                bundle2.putString("unit_id", this.d);
                bundle2.putString(com.smartdigimkt.b.b.f33814z, this.f35307c);
                bundle2.putString("request_id", this.f35308e);
                bundle2.putString("url", str);
                bundle2.putString(PglCryptUtils.KEY_MESSAGE, str2);
                messageObtain2.setData(bundle2);
                this.f35309h.sendMessage(messageObtain2);
                if (this.f35305a) {
                    System.currentTimeMillis();
                    return;
                }
                return;
            }
            if (i2 != 859) {
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = 205;
            Bundle bundle3 = new Bundle();
            bundle3.putString("unit_id", this.d);
            bundle3.putString(com.smartdigimkt.b.b.f33814z, this.f35307c);
            bundle3.putString("request_id", this.f35308e);
            bundle3.putString(PglCryptUtils.KEY_MESSAGE, str2);
            messageObtain3.setData(bundle3);
            this.f35309h.sendMessage(messageObtain3);
            l lVar = this.g;
            if (lVar != null) {
                try {
                    lVar.a(str, this.f35308e, c.b(com.smartdigimkt.y.b.g, str2, null, null));
                } catch (Exception e2) {
                    e2.getMessage();
                }
            }
        }

        @Override // com.smartdigimkt.c3.i.b
        public void a(String str, String str2, boolean z2) {
            com.smartdigimkt.c3.l.a().d(str, true);
            int i2 = this.f35306b;
            if (i2 == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString("unit_id", this.d);
                bundle.putString(com.smartdigimkt.b.b.f33814z, this.f35307c);
                bundle.putString("request_id", this.f35308e);
                bundle.putString("url", str);
                messageObtain.setData(bundle);
                this.f35309h.sendMessage(messageObtain);
                return;
            }
            if (i2 == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString("unit_id", this.d);
                bundle2.putString(com.smartdigimkt.b.b.f33814z, this.f35307c);
                bundle2.putString("request_id", this.f35308e);
                bundle2.putString("url", str);
                messageObtain2.setData(bundle2);
                this.f35309h.sendMessage(messageObtain2);
                if (this.f35305a) {
                    System.currentTimeMillis();
                    return;
                }
                return;
            }
            if (i2 != 859) {
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = 105;
            Bundle bundle3 = new Bundle();
            bundle3.putString("unit_id", this.d);
            bundle3.putString(com.smartdigimkt.b.b.f33814z, this.f35307c);
            bundle3.putString("request_id", this.f35308e);
            messageObtain3.setData(bundle3);
            this.f35309h.sendMessage(messageObtain3);
            l lVar = this.g;
            if (lVar != null) {
                lVar.a(this.f35307c, this.d, this.f35308e, str);
            }
        }
    }

    public static final class j implements com.smartdigimkt.c3.i.e {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f35319l = 497;
        public static final int m = 859;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f35320n = 313;
        public static final int o = 502;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f35322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f35323c;
        private String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f35324e;
        private com.smartdigimkt.x.d f;
        private int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Handler f35325h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private l f35326i;
        private List<com.smartdigimkt.x.d> j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f35321a = false;
        private long k = System.currentTimeMillis();

        public j(Context context, String str, String str2, String str3, com.smartdigimkt.x.d dVar, int i2, Handler handler, l lVar, CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayList) {
            this.f35322b = context;
            this.d = str;
            this.f35323c = str2;
            this.f35324e = str3;
            this.f = dVar;
            this.g = i2;
            this.f35325h = handler;
            this.f35326i = lVar;
            this.j = copyOnWriteArrayList;
        }

        public void a(boolean z2) {
            this.f35321a = z2;
        }

        @Override // com.smartdigimkt.c3.i.b
        public void b(String str, String str2) {
            com.smartdigimkt.c3.l.a().d(str2, false);
            System.currentTimeMillis();
            int i2 = this.g;
            if (i2 == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString("unit_id", this.f35323c);
                bundle.putString(com.smartdigimkt.b.b.f33814z, this.d);
                bundle.putString("request_id", this.f35324e);
                bundle.putString("url", str2);
                bundle.putString(PglCryptUtils.KEY_MESSAGE, str);
                messageObtain.setData(bundle);
                this.f35325h.sendMessage(messageObtain);
                return;
            }
            if (i2 == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 201;
                Bundle bundle2 = new Bundle();
                bundle2.putString("unit_id", this.f35323c);
                bundle2.putString(com.smartdigimkt.b.b.f33814z, this.d);
                bundle2.putString("request_id", this.f35324e);
                bundle2.putString("url", str2);
                bundle2.putString(PglCryptUtils.KEY_MESSAGE, str);
                messageObtain2.setData(bundle2);
                this.f35325h.sendMessage(messageObtain2);
                return;
            }
            if (i2 != 859) {
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = 203;
            Bundle bundle3 = new Bundle();
            bundle3.putString("unit_id", this.f35323c);
            bundle3.putString(com.smartdigimkt.b.b.f33814z, this.d);
            bundle3.putString("request_id", this.f35324e);
            bundle3.putString("url", str2);
            bundle3.putString(PglCryptUtils.KEY_MESSAGE, str);
            messageObtain3.setData(bundle3);
            this.f35325h.sendMessage(messageObtain3);
            l lVar = this.f35326i;
            if (lVar != null) {
                try {
                    lVar.a(str2, this.f35324e, c.b(com.smartdigimkt.y.b.g, "", null, null));
                } catch (Exception e2) {
                    e2.getMessage();
                }
            }
        }

        @Override // com.smartdigimkt.c3.i.b
        public void a(String str, String str2, boolean z2) {
            com.smartdigimkt.c3.l.a().d(str, true);
            System.currentTimeMillis();
            int i2 = this.g;
            if (i2 == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString("unit_id", this.f35323c);
                bundle.putString(com.smartdigimkt.b.b.f33814z, this.d);
                bundle.putString("request_id", this.f35324e);
                bundle.putString("url", str);
                messageObtain.setData(bundle);
                this.f35325h.sendMessage(messageObtain);
                return;
            }
            if (i2 == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString("unit_id", this.f35323c);
                bundle2.putString(com.smartdigimkt.b.b.f33814z, this.d);
                bundle2.putString("request_id", this.f35324e);
                bundle2.putString("url", str);
                messageObtain2.setData(bundle2);
                this.f35325h.sendMessage(messageObtain2);
                return;
            }
            if (i2 != 859) {
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = 103;
            Bundle bundle3 = new Bundle();
            bundle3.putString("unit_id", this.f35323c);
            bundle3.putString(com.smartdigimkt.b.b.f33814z, this.d);
            bundle3.putString("request_id", this.f35324e);
            messageObtain3.setData(bundle3);
            this.f35325h.sendMessage(messageObtain3);
            l lVar = this.f35326i;
            if (lVar != null) {
                lVar.a(this.d, this.f35323c, this.f35324e, str);
            }
        }
    }

    public static final class k extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f35327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private f f35328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ConcurrentHashMap<String, f> f35329c;
        private ConcurrentHashMap<String, CopyOnWriteArrayList<com.smartdigimkt.x.d>> d;

        public k(Looper looper) {
            super(looper);
            this.f35329c = new ConcurrentHashMap<>();
            this.d = new ConcurrentHashMap<>();
        }

        public void a(String str, String str2, String str3, f fVar) {
            this.f35329c.put(str2 + "_" + str3, fVar);
        }

        /* JADX WARN: Code duplicated, block: B:165:0x0338 A[Catch: Exception -> 0x0302, TRY_LEAVE, TryCatch #7 {Exception -> 0x0302, blocks: (B:147:0x02eb, B:155:0x0310, B:165:0x0338, B:201:0x03e5), top: B:233:0x00a2 }] */
        /* JADX WARN: Code duplicated, block: B:169:0x036e A[Catch: Exception -> 0x0377, TryCatch #4 {Exception -> 0x0377, blocks: (B:167:0x0368, B:169:0x036e, B:174:0x037e, B:176:0x0384, B:178:0x038e, B:187:0x039f, B:190:0x03b1, B:193:0x03c0, B:196:0x03cf, B:199:0x03da), top: B:228:0x0368 }] */
        /* JADX WARN: Code duplicated, block: B:173:0x037c  */
        /* JADX WARN: Code duplicated, block: B:180:0x0392  */
        /* JADX WARN: Code duplicated, block: B:182:0x0396  */
        /* JADX WARN: Code duplicated, block: B:184:0x039a  */
        /* JADX WARN: Code duplicated, block: B:186:0x039e  */
        /* JADX WARN: Code duplicated, block: B:187:0x039f A[Catch: Exception -> 0x0377, TryCatch #4 {Exception -> 0x0377, blocks: (B:167:0x0368, B:169:0x036e, B:174:0x037e, B:176:0x0384, B:178:0x038e, B:187:0x039f, B:190:0x03b1, B:193:0x03c0, B:196:0x03cf, B:199:0x03da), top: B:228:0x0368 }] */
        /* JADX WARN: Code duplicated, block: B:190:0x03b1 A[Catch: Exception -> 0x0377, TryCatch #4 {Exception -> 0x0377, blocks: (B:167:0x0368, B:169:0x036e, B:174:0x037e, B:176:0x0384, B:178:0x038e, B:187:0x039f, B:190:0x03b1, B:193:0x03c0, B:196:0x03cf, B:199:0x03da), top: B:228:0x0368 }] */
        /* JADX WARN: Code duplicated, block: B:192:0x03bf  */
        /* JADX WARN: Code duplicated, block: B:193:0x03c0 A[Catch: Exception -> 0x0377, TryCatch #4 {Exception -> 0x0377, blocks: (B:167:0x0368, B:169:0x036e, B:174:0x037e, B:176:0x0384, B:178:0x038e, B:187:0x039f, B:190:0x03b1, B:193:0x03c0, B:196:0x03cf, B:199:0x03da), top: B:228:0x0368 }] */
        /* JADX WARN: Code duplicated, block: B:195:0x03ce  */
        /* JADX WARN: Code duplicated, block: B:196:0x03cf A[Catch: Exception -> 0x0377, TryCatch #4 {Exception -> 0x0377, blocks: (B:167:0x0368, B:169:0x036e, B:174:0x037e, B:176:0x0384, B:178:0x038e, B:187:0x039f, B:190:0x03b1, B:193:0x03c0, B:196:0x03cf, B:199:0x03da), top: B:228:0x0368 }] */
        /* JADX WARN: Code duplicated, block: B:198:0x03d9  */
        /* JADX WARN: Code restructure failed: missing block: B:188:0x03ab, code lost:
        
            if (r18.V1().contains(3) != false) goto L189;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [android.os.BaseBundle, android.os.Bundle] */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v23, types: [int] */
        /* JADX WARN: Type inference failed for: r2v3, types: [int] */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v9, types: [int] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void handleMessage(android.os.Message r30) {
            /*
                Method dump skipped, instruction units count: 1130
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smartdigimkt.g1.c.k.handleMessage(android.os.Message):void");
        }

        public void a(Context context) {
            this.f35327a = context;
        }

        public void a(String str, CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayList) {
            this.d.put(str, copyOnWriteArrayList);
        }
    }

    public interface l {
        void a(String str, String str2, com.smartdigimkt.y.c cVar);

        void a(String str, String str2, String str3, String str4);
    }

    public interface m {
        void a(String str, String str2, String str3, com.smartdigimkt.a3.a.C0428a c0428a, com.smartdigimkt.y.c cVar);

        void a(String str, String str2, String str3, String str4, String str5, com.smartdigimkt.a3.a.C0428a c0428a);
    }

    public static class n extends com.smartdigimkt.k.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Handler f35330b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Runnable f35331c;
        private final boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f35332e;
        private String f;
        private final m g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final WindVaneWebView f35333h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String f35334i;
        private final String j;
        private final String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final com.smartdigimkt.a3.a.C0428a f35335l;
        private final com.smartdigimkt.x.d m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private CopyOnWriteArrayList<com.smartdigimkt.x.d> f35336n;
        private long o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f35337p;
        private boolean q;
        private final Runnable r;
        private final Runnable s;

        public class a implements Runnable {
            final /* synthetic */ m X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            final /* synthetic */ com.smartdigimkt.a3.a.C0428a f35338Y;
            final /* synthetic */ String Z;
            final /* synthetic */ String e0;
            final /* synthetic */ String f0;
            final /* synthetic */ String g0;

            public a(m mVar, com.smartdigimkt.a3.a.C0428a c0428a, String str, String str2, String str3, String str4) {
                this.X = mVar;
                this.f35338Y = c0428a;
                this.Z = str;
                this.e0 = str2;
                this.f0 = str3;
                this.g0 = str4;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindVaneWebView windVaneWebViewB;
                com.smartdigimkt.a3.a.C0428a c0428a;
                if (this.X != null && (c0428a = this.f35338Y) != null) {
                    c0428a.a(true);
                    com.smartdigimkt.c3.l.a().b(this.Z + "_" + this.e0 + "_" + this.f0, true);
                    m mVar = this.X;
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.Z);
                    sb.append("_");
                    sb.append(this.f0);
                    mVar.a(sb.toString(), this.g0, this.Z, this.e0, this.f0, this.f35338Y);
                }
                com.smartdigimkt.a3.a.C0428a c0428a2 = this.f35338Y;
                if (c0428a2 == null || (windVaneWebViewB = c0428a2.b()) == null) {
                    return;
                }
                try {
                    windVaneWebViewB.release();
                } catch (Exception unused) {
                }
            }
        }

        public class b implements Runnable {
            final /* synthetic */ m X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            final /* synthetic */ com.smartdigimkt.a3.a.C0428a f35339Y;
            final /* synthetic */ String Z;
            final /* synthetic */ String e0;
            final /* synthetic */ String f0;
            final /* synthetic */ String g0;

            public b(m mVar, com.smartdigimkt.a3.a.C0428a c0428a, String str, String str2, String str3, String str4) {
                this.X = mVar;
                this.f35339Y = c0428a;
                this.Z = str;
                this.e0 = str2;
                this.f0 = str3;
                this.g0 = str4;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindVaneWebView windVaneWebViewB;
                com.smartdigimkt.a3.a.C0428a c0428a;
                if (this.X != null && (c0428a = this.f35339Y) != null) {
                    c0428a.a(true);
                    com.smartdigimkt.c3.l.a().b(this.Z + "_" + this.e0 + "_" + this.f0, true);
                    m mVar = this.X;
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.Z);
                    sb.append("_");
                    sb.append(this.f0);
                    mVar.a(sb.toString(), this.g0, this.Z, this.e0, this.f0, this.f35339Y);
                }
                com.smartdigimkt.a3.a.C0428a c0428a2 = this.f35339Y;
                if (c0428a2 == null || (windVaneWebViewB = c0428a2.b()) == null) {
                    return;
                }
                try {
                    windVaneWebViewB.release();
                } catch (Exception unused) {
                }
            }
        }

        public n(Handler handler, Runnable runnable, boolean z2, boolean z3, String str, m mVar, WindVaneWebView windVaneWebView, String str2, String str3, String str4, com.smartdigimkt.a3.a.C0428a c0428a, com.smartdigimkt.x.d dVar, CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayList, long j) {
            this.f35330b = handler;
            this.f35331c = runnable;
            this.d = z2;
            this.f35332e = z3;
            this.f = str;
            this.g = mVar;
            this.f35333h = windVaneWebView;
            this.f35334i = str2;
            this.j = str4;
            this.k = str3;
            this.f35335l = c0428a;
            this.m = dVar;
            this.f35336n = copyOnWriteArrayList;
            this.o = j;
            a aVar = new a(mVar, c0428a, str4, str, str2, str3);
            this.s = aVar;
            this.r = new b(mVar, c0428a, str4, str, str2, str3);
            if (handler != null) {
                handler.postDelayed(aVar, 5000L);
            }
        }

        @Override // com.smartdigimkt.k.b, com.smartdigimkt.u4.c
        public void onPageFinished(WebView webView, String str) {
            Runnable runnable;
            Handler handler;
            Runnable runnable2;
            super.onPageFinished(webView, str);
            Handler handler2 = this.f35330b;
            if (handler2 != null && (runnable2 = this.s) != null) {
                handler2.removeCallbacks(runnable2);
            }
            if (this.f35337p) {
                return;
            }
            if (str.contains("wfr=1")) {
                Handler handler3 = this.f35330b;
                if (handler3 != null && (runnable = this.r) != null) {
                    handler3.postDelayed(runnable, 5000L);
                }
            } else {
                String str2 = this.j + "_" + this.f35334i;
                com.smartdigimkt.c3.l.a().b(this.j + "_" + this.f + "_" + this.f35334i, true);
                Runnable runnable3 = this.f35331c;
                if (runnable3 != null && (handler = this.f35330b) != null) {
                    handler.removeCallbacks(runnable3);
                }
                com.smartdigimkt.a3.a.C0428a c0428a = this.f35335l;
                if (c0428a != null) {
                    c0428a.a(true);
                }
                if (this.d) {
                    if (this.m.D2()) {
                        com.smartdigimkt.a3.a.a(287, this.m.O1(), this.f35335l);
                    } else {
                        com.smartdigimkt.a3.a.b(287, this.m.O1(), this.f35335l);
                    }
                } else if (this.m.D2()) {
                    com.smartdigimkt.a3.a.a(94, this.m.O1(), this.f35335l);
                } else {
                    com.smartdigimkt.a3.a.b(94, this.m.O1(), this.f35335l);
                }
                m mVar = this.g;
                if (mVar != null) {
                    mVar.a(str2, this.k, this.j, this.f, this.f35334i, this.f35335l);
                }
            }
            com.smartdigimkt.n.h.a().a(webView);
            this.f35337p = true;
        }

        @Override // com.smartdigimkt.k.b, com.smartdigimkt.u4.c
        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            super.onReceivedError(webView, i2, str, str2);
            com.smartdigimkt.c3.l.a().b(this.j + "_" + this.f + "_" + this.f35334i, false);
            Handler handler = this.f35330b;
            if (handler != null) {
                if (this.r != null) {
                    handler.removeCallbacks(this.s);
                }
                Runnable runnable = this.r;
                if (runnable != null) {
                    this.f35330b.removeCallbacks(runnable);
                }
            }
            try {
                String str3 = this.j + "_" + this.f35334i;
                com.smartdigimkt.a3.a.C0428a c0428a = this.f35335l;
                if (c0428a != null) {
                    c0428a.a(false);
                }
                if (this.g != null) {
                    this.g.a(str3, this.f, str2, this.f35335l, c.b(com.smartdigimkt.y.b.j, i2 + "#" + str, null, this.m));
                }
            } catch (Exception e2) {
                if (com.smartdigimkt.b.b.f33800a) {
                    e2.getLocalizedMessage();
                }
            }
        }

        @Override // com.smartdigimkt.k.b, com.smartdigimkt.u4.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            Object objValueOf = "";
            (sslError == null ? "" : Integer.valueOf(sslError.getPrimaryError())).toString();
            com.smartdigimkt.c3.l.a().b(this.j + "_" + this.f + "_" + this.f35334i, false);
            Handler handler = this.f35330b;
            if (handler != null) {
                if (this.r != null) {
                    handler.removeCallbacks(this.s);
                }
                Runnable runnable = this.r;
                if (runnable != null) {
                    this.f35330b.removeCallbacks(runnable);
                }
            }
            try {
                String str = this.j + "_" + this.f35334i;
                com.smartdigimkt.a3.a.C0428a c0428a = this.f35335l;
                if (c0428a != null) {
                    c0428a.a(false);
                }
                if (this.g != null) {
                    StringBuilder sb = new StringBuilder("onReceivedSslError:");
                    if (sslError != null) {
                        objValueOf = Integer.valueOf(sslError.getPrimaryError());
                    }
                    sb.append(objValueOf);
                    this.g.a(str, this.f, this.f35334i, this.f35335l, c.b(com.smartdigimkt.y.b.j, sb.toString(), null, this.m));
                }
            } catch (Exception e2) {
                if (com.smartdigimkt.b.b.f33800a) {
                    e2.getLocalizedMessage();
                }
            }
        }

        @Override // com.smartdigimkt.k.b, com.smartdigimkt.u4.c
        public void readyState(WebView webView, int i2) {
            Handler handler;
            Runnable runnable;
            Runnable runnable2;
            super.readyState(webView, i2);
            Handler handler2 = this.f35330b;
            if (handler2 != null && (runnable2 = this.r) != null) {
                handler2.removeCallbacks(runnable2);
            }
            Handler handler3 = this.f35330b;
            if (handler3 != null && (runnable = this.s) != null) {
                handler3.removeCallbacks(runnable);
            }
            if (this.q) {
                return;
            }
            String str = this.j + "_" + this.f35334i;
            if (i2 == 1) {
                Runnable runnable3 = this.f35331c;
                if (runnable3 != null && (handler = this.f35330b) != null) {
                    handler.removeCallbacks(runnable3);
                }
                com.smartdigimkt.c3.l.a().b(this.j + "_" + this.f + "_" + this.f35334i, true);
                com.smartdigimkt.a3.a.C0428a c0428a = this.f35335l;
                if (c0428a != null) {
                    c0428a.a(true);
                }
                if (this.d) {
                    if (this.f35332e) {
                        com.smartdigimkt.a3.a.a(287, this.m.O1(), this.f35335l);
                    } else {
                        com.smartdigimkt.a3.a.b(287, this.m.O1(), this.f35335l);
                    }
                } else if (this.f35332e) {
                    com.smartdigimkt.a3.a.a(94, this.m.O1(), this.f35335l);
                } else {
                    com.smartdigimkt.a3.a.b(94, this.m.O1(), this.f35335l);
                }
                m mVar = this.g;
                if (mVar != null) {
                    mVar.a(str, this.k, this.j, this.f, this.f35334i, this.f35335l);
                }
            } else if (this.g != null) {
                this.g.a(str, this.f, this.f35334i, this.f35335l, c.b(com.smartdigimkt.y.b.j, android.support.v4.media.a.h(i2, "readyState:"), null, this.m));
            }
            this.q = true;
        }
    }

    public static class o extends com.smartdigimkt.k.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f35340b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f35341c;
        private final WindVaneWebView d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f35342e;
        private final String f;
        private final com.smartdigimkt.a3.a.C0428a g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final com.smartdigimkt.x.d f35343h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f35344i;
        private String j;
        private boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f35345l;

        public o(String str, boolean z2, WindVaneWebView windVaneWebView, String str2, String str3, com.smartdigimkt.a3.a.C0428a c0428a, com.smartdigimkt.x.d dVar, boolean z3, String str4) {
            this.f35341c = z2;
            this.d = windVaneWebView;
            this.f35342e = str2;
            this.f = str3;
            this.g = c0428a;
            this.f35343h = dVar;
            this.f35340b = str;
            this.f35344i = z3;
            this.j = str4;
        }

        @Override // com.smartdigimkt.k.b, com.smartdigimkt.u4.c
        public void onPageFinished(WebView webView, String str) {
            if (this.k) {
                return;
            }
            if (!str.contains("wfr=1")) {
                if (this.d != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", this.f35340b);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", 1);
                        jSONObject2.put("error", "");
                        jSONObject.put("data", jSONObject2);
                        com.smartdigimkt.n.h.a().a((WebView) this.d, "componentReact", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e2) {
                        if (com.smartdigimkt.b.b.f33800a) {
                            e2.getLocalizedMessage();
                        }
                    }
                }
                com.smartdigimkt.c3.l.a().b(this.f + "_" + this.j + "_" + this.f35342e, true);
                com.smartdigimkt.a3.a.C0428a c0428a = this.g;
                if (c0428a != null) {
                    c0428a.a(true);
                }
                String str2 = this.f + "_" + this.f35343h.j() + "_" + this.f35343h.N1() + "_" + this.f35342e;
                if (this.f35341c) {
                    if (this.f35343h.D2()) {
                        com.smartdigimkt.a3.a.a(287, this.f35343h.O1(), this.g);
                    } else {
                        com.smartdigimkt.a3.a.a(str2, this.g, false, this.f35344i);
                    }
                } else if (this.f35343h.D2()) {
                    com.smartdigimkt.a3.a.a(94, this.f35343h.O1(), this.g);
                } else {
                    com.smartdigimkt.a3.a.a(str2, this.g, false, this.f35344i);
                }
            }
            com.smartdigimkt.n.h.a().a(webView);
            this.k = true;
        }

        @Override // com.smartdigimkt.k.b, com.smartdigimkt.u4.c
        public void onReceivedError(WebView webView, int i2, String str, String str2) {
            com.smartdigimkt.c3.l.a().b(this.f + "_" + this.j + "_" + this.f35342e, false);
            com.smartdigimkt.a3.a.C0428a c0428a = this.g;
            if (c0428a != null) {
                c0428a.a(false);
            }
            if (this.d != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f35340b);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", 2);
                    jSONObject2.put("error", str);
                    jSONObject.put("data", jSONObject2);
                    com.smartdigimkt.n.h.a().a((WebView) this.d, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e2) {
                    if (com.smartdigimkt.b.b.f33800a) {
                        e2.getLocalizedMessage();
                    }
                }
            }
        }

        @Override // com.smartdigimkt.k.b, com.smartdigimkt.u4.c
        public void readyState(WebView webView, int i2) {
            if (this.f35345l) {
                return;
            }
            if (this.d != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f35340b);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", i2);
                    jSONObject2.put("error", "");
                    jSONObject.put("data", jSONObject2);
                    com.smartdigimkt.n.h.a().a((WebView) this.d, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e2) {
                    if (com.smartdigimkt.b.b.f33800a) {
                        e2.getLocalizedMessage();
                    }
                }
            }
            String str = this.f + "_" + this.f35343h.j() + "_" + this.f35343h.N1() + "_" + this.f35342e;
            if (i2 == 1) {
                com.smartdigimkt.c3.l.a().b(this.f + "_" + this.j + "_" + this.f35342e, true);
                com.smartdigimkt.a3.a.C0428a c0428a = this.g;
                if (c0428a != null) {
                    c0428a.a(true);
                }
                if (this.f35341c) {
                    if (this.f35343h.D2()) {
                        com.smartdigimkt.a3.a.a(str, this.g, false, this.f35344i);
                    } else {
                        com.smartdigimkt.a3.a.a(str, this.g, false, this.f35344i);
                    }
                } else if (this.f35343h.D2()) {
                    com.smartdigimkt.a3.a.a(str, this.g, false, this.f35344i);
                } else {
                    com.smartdigimkt.a3.a.a(str, this.g, false, this.f35344i);
                }
            } else {
                com.smartdigimkt.c3.l.a().b(this.f + "_" + this.j + "_" + this.f35342e, false);
                com.smartdigimkt.a3.a.C0428a c0428a2 = this.g;
                if (c0428a2 != null) {
                    c0428a2.a(false);
                }
            }
            this.f35345l = true;
        }
    }

    public static final class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final c f35346a = new c(null);

        private p() {
        }
    }

    public /* synthetic */ c(a aVar) {
        this();
    }

    private static String c(int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i2);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(int i2) {
        if (i2 == 200) {
            return com.smartdigimkt.y.b.f39996e;
        }
        if (i2 == 201) {
            return com.smartdigimkt.y.b.f39997h;
        }
        if (i2 != 203) {
            return i2 != 205 ? com.smartdigimkt.y.b.x : com.smartdigimkt.y.b.f;
        }
        return com.smartdigimkt.y.b.g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static synchronized String e(int i2) {
        if (i2 == 200) {
            return "video";
        }
        if (i2 == 201) {
            return "zip/html";
        }
        if (i2 != 203) {
            return i2 != 205 ? "unknown" : "tpl";
        }
        return f9.D;
    }

    private c() {
        this.d = "local_rid";
        this.f35282e = "down_type";
        this.f = com.smartdigimkt.q0.b.w0;
        this.g = new ArrayList(6);
        HandlerThread handlerThread = new HandlerThread("mb-reward-load-thread");
        f35273i = new HashMap();
        handlerThread.start();
        this.f35279a = new k(handlerThread.getLooper());
        this.f35280b = new ConcurrentHashMap<>();
    }

    public static c b() {
        return p.f35346a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.smartdigimkt.y.c b(int i2, String str, Throwable th, com.smartdigimkt.x.d dVar) {
        com.smartdigimkt.y.c cVar = new com.smartdigimkt.y.c(i2);
        cVar.a(th);
        cVar.f(str);
        cVar.a(dVar);
        return cVar;
    }

    public synchronized void c() {
    }

    public synchronized void a(Context context, boolean z2, int i2, boolean z3, int i3, String str, String str2, String str3, CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayList, f fVar, l lVar) {
        String str4 = str2 + "_" + str3;
        f35273i.put(str4, new d(z2, z3, i2, copyOnWriteArrayList.size(), str2, str3, i3, copyOnWriteArrayList));
        this.f35279a.a(str, str2, str3, fVar);
        this.f35279a.a(context);
        this.f35279a.a(str4, copyOnWriteArrayList);
        this.f35279a.post(new a(copyOnWriteArrayList, context, str2, i3, str, str3, lVar));
    }

    public static final class h implements com.smartdigimkt.f0.c {
        public static final int g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f35311h = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f35312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f35313b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f35314c;
        private String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f35315e;
        private com.smartdigimkt.x.d f;

        public h(Handler handler, int i2, String str, String str2, String str3, com.smartdigimkt.x.d dVar) {
            this.f35312a = handler;
            this.f35313b = i2;
            this.d = str;
            this.f35314c = str2;
            this.f35315e = str3;
            this.f = dVar;
        }

        @Override // com.smartdigimkt.f0.c
        public void a(Bitmap bitmap, String str) {
            com.smartdigimkt.c3.l.a().a(str, true);
            Message messageObtain = Message.obtain();
            messageObtain.what = this.f35313b == 0 ? 102 : 104;
            Bundle bundle = new Bundle();
            bundle.putString("unit_id", this.f35314c);
            bundle.putString(com.smartdigimkt.b.b.f33814z, this.d);
            bundle.putString("request_id", this.f35315e);
            messageObtain.setData(bundle);
            this.f35312a.sendMessage(messageObtain);
        }

        @Override // com.smartdigimkt.f0.c
        public void a(String str, String str2) {
            Message messageObtain = Message.obtain();
            messageObtain.what = this.f35313b == 0 ? 202 : 204;
            Bundle bundle = new Bundle();
            bundle.putString("unit_id", this.f35314c);
            bundle.putString(com.smartdigimkt.b.b.f33814z, this.d);
            bundle.putString("request_id", this.f35315e);
            messageObtain.setData(bundle);
            this.f35312a.sendMessage(messageObtain);
        }
    }

    public static final class i implements com.smartdigimkt.e3.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f35316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f35317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f35318c;
        private final String d;

        public i(Handler handler, String str, String str2, String str3) {
            this.f35316a = handler;
            this.f35318c = str;
            this.f35317b = str2;
            this.d = str3;
        }

        @Override // com.smartdigimkt.e3.c
        public void a(String str) {
            com.smartdigimkt.c3.l.a().c(str, true);
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            Bundle bundle = new Bundle();
            bundle.putString("unit_id", this.f35317b);
            bundle.putString(com.smartdigimkt.b.b.f33814z, this.f35318c);
            bundle.putString("request_id", this.d);
            bundle.putString("url", str);
            messageObtain.setData(bundle);
            this.f35316a.sendMessage(messageObtain);
        }

        @Override // com.smartdigimkt.e3.c
        public void a(String str, String str2) {
            com.smartdigimkt.c3.l.a().c(str2, false);
            Message messageObtain = Message.obtain();
            messageObtain.what = 200;
            Bundle bundle = new Bundle();
            bundle.putString("unit_id", this.f35317b);
            bundle.putString(com.smartdigimkt.b.b.f33814z, this.f35318c);
            bundle.putString("request_id", this.d);
            bundle.putString("url", str2);
            bundle.putString(PglCryptUtils.KEY_MESSAGE, str);
            messageObtain.setData(bundle);
            this.f35316a.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, String str2, String str3, com.smartdigimkt.x.d dVar, String str4, l lVar, CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayList) {
        if (TextUtils.isEmpty(str4) || dVar.K2()) {
            return;
        }
        if (str4.contains(".zip") && str4.contains("md5filename")) {
            boolean zIsEmpty = TextUtils.isEmpty(com.smartdigimkt.c3.i.a().c(str4));
            try {
                j jVar = new j(context, str, str2, str3, dVar, 497, this.f35279a, lVar, copyOnWriteArrayList);
                jVar.a(zIsEmpty);
                com.smartdigimkt.c3.i.a().b(str4, (com.smartdigimkt.c3.i.b) jVar);
                return;
            } catch (Exception e2) {
                if (com.smartdigimkt.b.b.f33800a) {
                    e2.getLocalizedMessage();
                    return;
                }
                return;
            }
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(com.smartdigimkt.c3.j.b().a(str4));
        try {
            g gVar = new g(497, str, str2, str3, dVar, lVar, this.f35279a, copyOnWriteArrayList);
            gVar.a(zIsEmpty2);
            com.smartdigimkt.c3.i.a().b(str4, gVar);
        } catch (Exception e3) {
            if (com.smartdigimkt.b.b.f33800a) {
                e3.getLocalizedMessage();
            }
        }
    }

    public synchronized void a(Context context, com.smartdigimkt.x.d dVar, String str, String str2, String str3, l lVar) throws Throwable {
        Throwable th;
        try {
            try {
                this.f35279a.a(context);
                if (dVar != null) {
                    try {
                        String strG0 = dVar.g0();
                        if (dVar.H2()) {
                            com.smartdigimkt.c3.l.a().d(strG0, true);
                            Message messageObtain = Message.obtain();
                            messageObtain.what = 105;
                            Bundle bundle = new Bundle();
                            bundle.putString("unit_id", str2);
                            bundle.putString(com.smartdigimkt.b.b.f33814z, str);
                            bundle.putString("request_id", str3);
                            bundle.putString("url", strG0);
                            messageObtain.setData(bundle);
                            this.f35279a.sendMessage(messageObtain);
                            if (lVar != null) {
                                lVar.a(str, str2, str3, strG0);
                            }
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                if (dVar != null && !TextUtils.isEmpty(dVar.g0())) {
                    try {
                        try {
                            com.smartdigimkt.c3.i.a().b(dVar.g0(), (com.smartdigimkt.c3.i.b) new b(str2, str, str3, lVar));
                        } catch (Exception e2) {
                            e = e2;
                            Exception exc = e;
                            if (com.smartdigimkt.b.b.f33800a) {
                                exc.getLocalizedMessage();
                            }
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0173 A[Catch: all -> 0x0034, TryCatch #3 {, blocks: (B:4:0x0009, B:5:0x0021, B:8:0x0029, B:17:0x0040, B:25:0x0079, B:28:0x007f, B:30:0x0085, B:35:0x0097, B:37:0x00c2, B:39:0x00c8, B:52:0x016f, B:54:0x0173, B:56:0x0178, B:34:0x0091, B:45:0x00e7, B:49:0x012c), top: B:64:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0178 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0009, B:5:0x0021, B:8:0x0029, B:17:0x0040, B:25:0x0079, B:28:0x007f, B:30:0x0085, B:35:0x0097, B:37:0x00c2, B:39:0x00c8, B:52:0x016f, B:54:0x0173, B:56:0x0178, B:34:0x0091, B:45:0x00e7, B:49:0x012c), top: B:64:0x0009 }] */
    public synchronized void a(boolean z2, Handler handler, boolean z3, boolean z4, WindVaneWebView windVaneWebView, String str, int i2, com.smartdigimkt.x.d dVar, CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayList, String str2, String str3, String str4, String str5, String str6, com.smartdigimkt.f3.d dVar2, m mVar) {
        String str7;
        com.smartdigimkt.z2.j jVar;
        String str8 = str4 + "_" + str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (v.e(str)) {
                if (mVar != null) {
                    mVar.a(str8, str3, str4, str5, str, null);
                }
                return;
            }
            str7 = str8;
            try {
                new HashMap().put("type", "2");
                com.smartdigimkt.a3.a.C0428a c0428a = new com.smartdigimkt.a3.a.C0428a();
                try {
                    WindVaneWebView windVaneWebView2 = new WindVaneWebView(com.smartdigimkt.m6.b.p().k());
                    if (dVar != null) {
                        windVaneWebView2.setLocalRequestId(dVar.g1());
                    }
                    windVaneWebView2.setTempTypeForMetrics(2);
                    try {
                        c0428a.a(windVaneWebView2);
                        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                            jVar = new com.smartdigimkt.z2.j(null, dVar, copyOnWriteArrayList);
                        } else {
                            jVar = new com.smartdigimkt.z2.j(null, dVar);
                        }
                        com.smartdigimkt.z2.j jVar2 = jVar;
                        jVar2.g(i2);
                        jVar2.setUnitId(str4);
                        jVar2.setRewardUnitSetting(dVar2);
                        jVar2.e(z2);
                        try {
                            windVaneWebView2.setWebViewListener(new n(handler, null, z3, z4, str5, mVar, windVaneWebView, str, str3, str4, c0428a, dVar, copyOnWriteArrayList, jCurrentTimeMillis));
                            windVaneWebView2.setObject(jVar2);
                            windVaneWebView2.loadUrl(str2);
                            windVaneWebView2.setRid(str5);
                        } catch (Exception e2) {
                            e = e2;
                            if (com.smartdigimkt.b.b.f33800a) {
                                e.getLocalizedMessage();
                            }
                            if (mVar != null) {
                                mVar.a(str7, str5, str, null, b(com.smartdigimkt.y.b.j, "", e, dVar));
                            }
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (Exception unused) {
                    if (mVar != null) {
                        c0428a.a(true);
                        com.smartdigimkt.c3.l.a().b(str4 + "_" + str5 + "_" + str, true);
                        StringBuilder sb = new StringBuilder();
                        sb.append(str4);
                        sb.append("_");
                        sb.append(str);
                        mVar.a(sb.toString(), str3, str4, str5, str, c0428a);
                        return;
                    }
                    return;
                } catch (Throwable unused2) {
                    if (mVar != null) {
                        c0428a.a(true);
                        com.smartdigimkt.c3.l.a().b(str4 + "_" + str5 + "_" + str, true);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str4);
                        sb2.append("_");
                        sb2.append(str);
                        mVar.a(sb2.toString(), str3, str4, str5, str, c0428a);
                        return;
                    }
                    return;
                }
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Exception e5) {
            e = e5;
            str7 = str8;
        }
        if (com.smartdigimkt.b.b.f33800a) {
            e.getLocalizedMessage();
        }
        if (mVar != null) {
            mVar.a(str7, str5, str, null, b(com.smartdigimkt.y.b.j, "", e, dVar));
        }
    }

    public synchronized void a(boolean z2, Handler handler, boolean z3, boolean z4, String str, String str2, String str3, String str4, String str5, int i2, com.smartdigimkt.x.d dVar, CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayList, String str6, String str7, com.smartdigimkt.f3.d dVar2, m mVar, boolean z5) {
        String str8;
        com.smartdigimkt.z2.j jVar;
        this.f35281c = z5;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str9 = str4 + "_" + str5;
        this.f35281c = z5;
        if (v.e(str5)) {
            if (mVar != null) {
                mVar.a(str9, str3, str4, str, str5, null);
            }
            return;
        }
        try {
            com.smartdigimkt.a3.a.C0428a c0428a = new com.smartdigimkt.a3.a.C0428a();
            WindVaneWebView windVaneWebView = new WindVaneWebView(com.smartdigimkt.m6.b.p().k());
            if (dVar != null) {
                windVaneWebView.setLocalRequestId(dVar.g1());
            }
            windVaneWebView.setTempTypeForMetrics(1);
            c0428a.a(windVaneWebView);
            String strB = com.smartdigimkt.z1.c.c().b();
            String strB2 = com.smartdigimkt.z1.c.c().b();
            c0428a.a(strB2);
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayListC = com.smartdigimkt.c3.e.a().c(str4);
                if (copyOnWriteArrayListC != null && copyOnWriteArrayListC.size() > 0) {
                    for (int i3 = 0; i3 < copyOnWriteArrayList.size(); i3++) {
                        com.smartdigimkt.x.d dVar3 = copyOnWriteArrayList.get(i3);
                        for (com.smartdigimkt.x.d dVar4 : copyOnWriteArrayListC) {
                            if (dVar4.j().equals(dVar3.j()) && dVar4.N1().equals(dVar3.N1())) {
                                dVar3.l(true);
                                copyOnWriteArrayList.set(i3, dVar3);
                            }
                        }
                    }
                }
                jVar = new com.smartdigimkt.z2.j(null, dVar, copyOnWriteArrayList);
            } else {
                jVar = new com.smartdigimkt.z2.j(null, dVar);
            }
            jVar.g(i2);
            jVar.setUnitId(str7);
            jVar.c(strB2);
            jVar.d(strB);
            jVar.c(true);
            jVar.setRewardUnitSetting(dVar2);
            jVar.e(z2);
            com.smartdigimkt.z2.j jVar2 = jVar;
            try {
                str8 = str;
                try {
                    windVaneWebView.setWebViewListener(new e(z2, handler, null, z3, z4, i2, str5, str3, str4, str, c0428a, dVar, copyOnWriteArrayList, dVar2, mVar, z5, jCurrentTimeMillis));
                    windVaneWebView.setObject(jVar2);
                    windVaneWebView.loadUrl(str6);
                    windVaneWebView.setRid(str8);
                    AnythinkBTRootLayout anythinkBTRootLayout = new AnythinkBTRootLayout(com.smartdigimkt.m6.b.p().k());
                    anythinkBTRootLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    anythinkBTRootLayout.setInstanceId(strB);
                    anythinkBTRootLayout.setUnitId(str4);
                    AnythinkBTLayout anythinkBTLayout = new AnythinkBTLayout(com.smartdigimkt.m6.b.p().k());
                    anythinkBTLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    anythinkBTLayout.setInstanceId(strB2);
                    anythinkBTLayout.setUnitId(str4);
                    anythinkBTLayout.setWebView(windVaneWebView);
                    AbstractMap abstractMapA = com.smartdigimkt.z1.c.c().a(str4, str8);
                    abstractMapA.put(strB2, anythinkBTLayout);
                    abstractMapA.put(strB, anythinkBTRootLayout);
                    anythinkBTRootLayout.addView(anythinkBTLayout, new FrameLayout.LayoutParams(-1, -1));
                } catch (Exception e2) {
                    e = e2;
                    if (mVar != null) {
                        mVar.a(str9, str8, str5, null, b(com.smartdigimkt.y.b.f39998i, "", e, dVar));
                    }
                    if (com.smartdigimkt.b.b.f33800a) {
                        e.getLocalizedMessage();
                    }
                }
            } catch (Exception e3) {
                e = e3;
                str8 = str;
            }
        } catch (Exception e4) {
            e = e4;
            str8 = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z2, WindVaneWebView windVaneWebView, com.smartdigimkt.x.d dVar, List<com.smartdigimkt.x.d> list, com.smartdigimkt.f3.d dVar2, String str, String str2, int i2) {
        if (windVaneWebView != null) {
            if (dVar != null && dVar2 != null && dVar.U1() != null && !TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(dVar.U1().f())) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", str2);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", 1);
                        jSONObject2.put("error", "data is null");
                        jSONObject.put("data", jSONObject2);
                        com.smartdigimkt.n.h.a().a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        return;
                    } catch (Exception e2) {
                        if (com.smartdigimkt.b.b.f33800a) {
                            e2.getLocalizedMessage();
                            return;
                        }
                        return;
                    }
                }
                if (TextUtils.isEmpty(dVar.U1().f()) || !dVar.U1().f().contains("cmpt=1")) {
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0485c(z2, windVaneWebView, dVar, list, str, dVar2, str2), i2 * 1000);
                    return;
                }
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", str2);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("result", 2);
                jSONObject4.put("error", "data is null");
                jSONObject3.put("data", jSONObject4);
                com.smartdigimkt.n.h.a().a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
            } catch (Exception e3) {
                if (com.smartdigimkt.b.b.f33800a) {
                    e3.getLocalizedMessage();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z2, WindVaneWebView windVaneWebView, String str, int i2, com.smartdigimkt.x.d dVar, List<com.smartdigimkt.x.d> list, String str2, String str3, com.smartdigimkt.f3.d dVar2, String str4, boolean z3) {
        com.smartdigimkt.z2.j jVar;
        String strN1;
        try {
            com.smartdigimkt.a3.a.C0428a c0428a = new com.smartdigimkt.a3.a.C0428a();
            WindVaneWebView windVaneWebView2 = new WindVaneWebView(com.smartdigimkt.m6.b.p().k());
            if (dVar != null) {
                windVaneWebView2.setLocalRequestId(dVar.g1());
            }
            windVaneWebView2.setTempTypeForMetrics(2);
            c0428a.a(windVaneWebView2);
            String strN2 = "";
            if (list != null && list.size() > 0) {
                CopyOnWriteArrayList<com.smartdigimkt.x.d> copyOnWriteArrayListC = com.smartdigimkt.c3.e.a().c(str3);
                if (copyOnWriteArrayListC != null && copyOnWriteArrayListC.size() > 0) {
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        com.smartdigimkt.x.d dVar3 = list.get(i3);
                        for (com.smartdigimkt.x.d dVar4 : copyOnWriteArrayListC) {
                            if (dVar4.j().equals(dVar3.j()) && dVar4.N1().equals(dVar3.N1())) {
                                dVar3.l(true);
                                list.set(i3, dVar3);
                            }
                        }
                    }
                }
                com.smartdigimkt.z2.j jVar2 = new com.smartdigimkt.z2.j(null, dVar, list);
                strN1 = list.get(0).N1();
                jVar = jVar2;
            } else {
                com.smartdigimkt.z2.j jVar3 = new com.smartdigimkt.z2.j(null, dVar);
                if (dVar != null) {
                    strN2 = dVar.N1();
                }
                jVar = jVar3;
                strN1 = strN2;
            }
            jVar.g(i2);
            jVar.setUnitId(str3);
            jVar.c(str4);
            jVar.setRewardUnitSetting(dVar2);
            jVar.e(z2);
            windVaneWebView2.setWebViewListener(new o(str4, false, windVaneWebView, str, str3, c0428a, dVar, z3, strN1));
            windVaneWebView2.setObject(jVar);
            windVaneWebView2.loadUrl(str2);
            windVaneWebView2.setRid(strN1);
        } catch (Exception e2) {
            if (com.smartdigimkt.b.b.f33800a) {
                e2.getLocalizedMessage();
            }
        }
    }

    private int a(com.smartdigimkt.x.d dVar) {
        if (dVar == null) {
            return 0;
        }
        try {
            if (dVar.O() != null) {
                return dVar.O().f39646a;
            }
            return 0;
        } catch (Throwable th) {
            th.getMessage();
            return 0;
        }
    }
}
