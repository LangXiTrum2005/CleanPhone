package com.startapp.sdk.internal;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.EnabledConfig;
import com.startapp.sdk.adsbase.remoteconfig.WeightedChoice;
import com.startapp.sdk.adsbase.remoteconfig.WvfMetadata;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class al implements tk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lb f40815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f40816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb f40817c;
    public final lb d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k7 f40818e;
    public final f3 f;
    public final Context g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f40819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Lazy f40820i;
    public final Lazy j;
    public final Lazy k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedList f40821l;
    public volatile String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f40822n;

    public al(Context context, lb prefs, lb threadPool, lb uiExecutor, lb looperIdleDetector, k7 metadataHolder, f3 clock) {
        Intrinsics.f(context, "context");
        Intrinsics.f(prefs, "prefs");
        Intrinsics.f(threadPool, "threadPool");
        Intrinsics.f(uiExecutor, "uiExecutor");
        Intrinsics.f(looperIdleDetector, "looperIdleDetector");
        Intrinsics.f(metadataHolder, "metadataHolder");
        Intrinsics.f(clock, "clock");
        this.f40815a = prefs;
        this.f40816b = threadPool;
        this.f40817c = uiExecutor;
        this.d = looperIdleDetector;
        this.f40818e = metadataHolder;
        this.f = clock;
        if (Build.VERSION.SDK_INT >= 31 && !context.isUiContext()) {
            context = context.createWindowContext(((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0), 2, null);
            Intrinsics.c(context);
        }
        this.g = context;
        final int i2 = 1;
        this.f40819h = LazyKt.b(new Function0(this) { // from class: com.startapp.sdk.internal.A

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ al f40767Y;

            {
                this.f40767Y = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return Long.valueOf(al.e(this.f40767Y));
                    case 1:
                        return al.b(this.f40767Y);
                    case 2:
                        return Boolean.valueOf(al.j(this.f40767Y));
                    default:
                        return al.c(this.f40767Y);
                }
            }
        });
        final int i3 = 2;
        this.f40820i = LazyKt.b(new Function0(this) { // from class: com.startapp.sdk.internal.A

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ al f40767Y;

            {
                this.f40767Y = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return Long.valueOf(al.e(this.f40767Y));
                    case 1:
                        return al.b(this.f40767Y);
                    case 2:
                        return Boolean.valueOf(al.j(this.f40767Y));
                    default:
                        return al.c(this.f40767Y);
                }
            }
        });
        final int i4 = 3;
        this.j = LazyKt.b(new Function0(this) { // from class: com.startapp.sdk.internal.A

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ al f40767Y;

            {
                this.f40767Y = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return Long.valueOf(al.e(this.f40767Y));
                    case 1:
                        return al.b(this.f40767Y);
                    case 2:
                        return Boolean.valueOf(al.j(this.f40767Y));
                    default:
                        return al.c(this.f40767Y);
                }
            }
        });
        final int i5 = 0;
        this.k = LazyKt.b(new Function0(this) { // from class: com.startapp.sdk.internal.A

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ al f40767Y;

            {
                this.f40767Y = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return Long.valueOf(al.e(this.f40767Y));
                    case 1:
                        return al.b(this.f40767Y);
                    case 2:
                        return Boolean.valueOf(al.j(this.f40767Y));
                    default:
                        return al.c(this.f40767Y);
                }
            }
        });
        this.f40821l = new LinkedList();
        this.f40822n = true;
    }

    public static final WvfMetadata b(al this$0) {
        Intrinsics.f(this$0, "this$0");
        return (WvfMetadata) this$0.f40818e.a();
    }

    public static final String c(al this$0) {
        WeightedChoice weightedChoiceB;
        String strA;
        Intrinsics.f(this$0, "this$0");
        WvfMetadata wvfMetadata = (WvfMetadata) this$0.f40819h.getX();
        return (wvfMetadata == null || (weightedChoiceB = wvfMetadata.b()) == null || (strA = weightedChoiceB.a()) == null) ? "default" : strA;
    }

    public static final long e(al this$0) {
        Intrinsics.f(this$0, "this$0");
        WvfMetadata wvfMetadata = (WvfMetadata) this$0.f40819h.getX();
        return Math.min(Math.max(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS, wvfMetadata != null ? wvfMetadata.d() : 2592000000L), 31536000000L);
    }

    public static final void g(al this$0) {
        Intrinsics.f(this$0, "this$0");
        try {
            if (this$0.f.a() < ((vf) this$0.f40815a.a()).getLong("06202469550e108e", 0L) + ((Number) this$0.k.getX()).longValue()) {
                String string = ((vf) this$0.f40815a.a()).getString("5b47fb537d32a117", null);
                String strC = string != null ? vi.c(string) : null;
                if (strC != null && !StringsKt.w(strC)) {
                    this$0.m = strC;
                }
            }
        } catch (Throwable th) {
            if (this$0.a(4096)) {
                g9.a(th);
            }
        }
        ((m8) this$0.f40817c.a()).f41243a.post(new B(this$0, 4));
    }

    public static final boolean j(al this$0) {
        EnabledConfig enabledConfigE;
        Intrinsics.f(this$0, "this$0");
        WvfMetadata wvfMetadata = (WvfMetadata) this$0.f40819h.getX();
        if (wvfMetadata == null || (enabledConfigE = wvfMetadata.e()) == null) {
            return false;
        }
        return enabledConfigE.a(this$0.f);
    }

    public final boolean a(int i2) {
        ComponentInfoEventConfig componentInfoEventConfigA;
        WvfMetadata wvfMetadata = (WvfMetadata) this.f40819h.getX();
        if (wvfMetadata == null || (componentInfoEventConfigA = wvfMetadata.a()) == null) {
            return false;
        }
        return componentInfoEventConfigA.a(i2);
    }

    public final void d() {
        try {
            if (!this.f40821l.isEmpty()) {
                if (!this.f40822n) {
                    return;
                }
                String str = this.m;
                if (str != null && !StringsKt.w(str)) {
                    return;
                }
            }
            gc gcVar = (gc) this.d.a();
            B b2 = new B(this, 5);
            synchronized (gcVar) {
                if (gcVar.f41008c != null) {
                    return;
                }
                Thread thread = new Thread(new fc(gcVar, b2), "startapp-lid-" + gc.g.incrementAndGet());
                gcVar.f41008c = thread;
                thread.start();
            }
        } catch (Throwable th) {
            if (a(256)) {
                g9.a(th);
            }
        }
    }

    public final void f() {
        try {
            if (this.f40822n) {
                String str = this.m;
                if (str != null && !StringsKt.w(str)) {
                    return;
                }
                this.f40822n = false;
                String str2 = (String) this.j.getX();
                if (Intrinsics.a(str2, "default")) {
                    e();
                } else if (Intrinsics.a(str2, "headers")) {
                    a(c());
                }
            }
        } catch (Throwable th) {
            if (a(Segment.SIZE)) {
                g9.a(th);
            }
        }
    }

    @Override // com.startapp.sdk.internal.tk
    public final void b() {
        try {
            String str = this.m;
            boolean z2 = str == null || StringsKt.w(str);
            if (z2) {
                ((Executor) this.f40816b.a()).execute(new B(this, 1));
            }
            if (((Boolean) this.f40820i.getX()).booleanValue()) {
                ((m8) this.f40817c.a()).f41243a.post(new B(this, 2));
            } else {
                if (z2) {
                    return;
                }
                ((m8) this.f40817c.a()).f41243a.post(new B(this, 3));
            }
        } catch (Throwable th) {
            if (a(16384)) {
                g9.a(th);
            }
        }
    }

    @Override // com.startapp.sdk.internal.tk
    public final String a() {
        String str = this.m;
        if (str != null) {
            if (StringsKt.w(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        String property = System.getProperty("http.agent");
        if (property == null || StringsKt.w(property)) {
            return null;
        }
        return property;
    }

    @Override // com.startapp.sdk.internal.tk
    public final WebView c() {
        WebView webView = (WebView) this.f40821l.poll();
        if (webView == null) {
            webView = new WebView(this.g);
            webView.setWebViewClient(new sk());
        }
        if (((Boolean) this.f40820i.getX()).booleanValue()) {
            d();
        }
        return webView;
    }

    public final void e() {
        try {
            ((Executor) this.f40816b.a()).execute(new B(this, 0));
        } catch (Throwable th) {
            if (a(8)) {
                g9.a(th);
            }
        }
    }

    public final void a(String str) {
        if (str != null) {
            try {
                String strG = vi.g(str);
                if (strG != null) {
                    uf ufVarA = ((vf) this.f40815a.a()).edit();
                    ufVarA.a("5b47fb537d32a117", strG);
                    ufVarA.f41545a.putString("5b47fb537d32a117", strG);
                    long jA = this.f.a();
                    ufVarA.a("06202469550e108e", Long.valueOf(jA));
                    ufVarA.f41545a.putLong("06202469550e108e", jA);
                    ufVarA.f41545a.commit();
                }
            } catch (IOException e2) {
                if (a(com.p004ironsource.mediationsdk.metadata.a.f25965n)) {
                    g9.a(e2);
                }
            }
        }
    }

    public static final void b(WebView webView) {
        Intrinsics.f(webView, "$webView");
        String strA = vi.a();
        Intrinsics.e(strA, "cipherVigenere(...)");
        webView.loadUrl(strA);
    }

    public static final void d(al alVar) {
        alVar.getClass();
        try {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(alVar.g);
            if (defaultUserAgent != null) {
                if (!StringsKt.w(defaultUserAgent)) {
                    alVar.m = defaultUserAgent;
                }
                alVar.a(defaultUserAgent);
            }
        } catch (Throwable th) {
            if (alVar.a(16)) {
                g9.a(th);
            }
        }
    }

    public static final void a(al alVar) {
        WebView webView;
        alVar.getClass();
        try {
            if (alVar.f40821l.isEmpty()) {
                try {
                    webView = new WebView(alVar.g);
                    webView.setWebViewClient(new sk());
                } catch (Throwable th) {
                    if (alVar.a(2)) {
                        g9.a(th);
                    }
                    webView = null;
                }
                if (webView != null) {
                    alVar.f40821l.add(webView);
                    alVar.d();
                    return;
                }
                return;
            }
            alVar.f();
        } catch (Throwable th2) {
            if (alVar.a(1024)) {
                g9.a(th2);
            }
        }
    }

    public final void a(WebView webView) {
        try {
            webView.setWebViewClient(new zk(this));
            m8 m8Var = (m8) this.f40817c.a();
            m8Var.f41243a.post(new A.q0(webView, 1));
        } catch (Throwable th) {
            if (a(32)) {
                g9.a(th);
            }
        }
    }

    public static final void a(WebView webView, al this$0) {
        Intrinsics.f(webView, "$webView");
        Intrinsics.f(this$0, "this$0");
        webView.setWebViewClient(new sk());
        this$0.f40821l.add(webView);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002d  */
    public final void a(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        Intrinsics.f(webView, "webView");
        try {
            if (webResourceRequest != null) {
                try {
                    Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                    if (requestHeaders == null || (str = requestHeaders.get(Command.HTTP_HEADER_USER_AGENT)) == null || StringsKt.w(str)) {
                        str = null;
                    }
                } catch (Throwable th) {
                    if (a(128)) {
                        g9.a(th);
                    }
                }
            } else {
                str = null;
            }
            if (str != null && !StringsKt.w(str)) {
                this.m = str;
            }
            a(str);
            ((m8) this.f40817c.a()).f41243a.post(new com.google.android.exoplayer2.video.a(11, webView, this));
        } catch (Throwable th2) {
            if (a(64)) {
                g9.a(th2);
            }
        }
    }
}
