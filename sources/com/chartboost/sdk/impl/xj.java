package com.chartboost.sdk.impl;

import android.content.Context;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.events.ChartboostError;
import com.startapp.sdk.internal.C;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class xj extends f2 implements ec, nj {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final a f15567B = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public oj f15568A;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final URL f15569p;
    public final zb q;
    public final n4 r;
    public final zj s;
    public final jj t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Set f15570u;
    public final Mediation v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public WebView f15571w;
    public dc x;
    public boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Triple f15572z;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f15573b;
        public int d;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f15573b = obj;
            this.d |= Integer.MIN_VALUE;
            Object objA = xj.this.a((Context) null, this);
            return objA == CoroutineSingletons.X ? objA : new Result(objA);
        }
    }

    public static final class c extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f15575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f15576c;
        public int d;
        public final /* synthetic */ Context f;

        public static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ xj f15578b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ WebView f15579c;

            /* JADX INFO: renamed from: com.chartboost.sdk.impl.xj$c$a$a, reason: collision with other inner class name */
            public static final class C0177a extends SuspendLambda implements Function2 {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f15580b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ WebView f15581c;
                public final /* synthetic */ xj d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0177a(WebView webView, xj xjVar, Continuation continuation) {
                    super(2, continuation);
                    this.f15581c = webView;
                    this.d = xjVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C0177a) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0177a(this.f15581c, this.d, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                    int i2 = this.f15580b;
                    if (i2 == 0) {
                        ResultKt.b(obj);
                        this.f15581c.setVisibility(8);
                        xj xjVar = this.d;
                        WebView webView = this.f15581c;
                        this.f15580b = 1;
                        if (xjVar.a(webView, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj);
                    }
                    return Unit.f43263a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(xj xjVar, WebView webView) {
                super(1);
                this.f15578b = xjVar;
                this.f15579c = webView;
            }

            public final void a(Throwable th) {
                za.a("WebRenderable load cancelled: " + th, (Throwable) null, 2, (Object) null);
                oj ojVarB = this.f15578b.b();
                if (ojVarB != null) {
                    ojVarB.a();
                }
                dc dcVar = this.f15578b.x;
                if (dcVar != null) {
                    dcVar.a(fg.FAILURE);
                }
                dc dcVar2 = this.f15578b.x;
                if (dcVar2 != null) {
                    dcVar2.a((ec) null);
                }
                this.f15578b.x = null;
                DefaultScheduler defaultScheduler = Dispatchers.f44752a;
                BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new C0177a(this.f15579c, this.f15578b, null), 3);
                this.f15578b.f15571w = null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return Unit.f43263a;
            }
        }

        public static final class b extends nc {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CancellableContinuation f15582b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ xj f15583c;
            public final /* synthetic */ WebView d;

            public b(CancellableContinuation cancellableContinuation, xj xjVar, WebView webView) {
                this.f15582b = cancellableContinuation;
                this.f15583c = xjVar;
                this.d = webView;
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                List<String> listB;
                if (this.f15582b.isActive()) {
                    if (this.f15583c.y) {
                        Triple triple = this.f15583c.f15572z;
                        if (triple == null) {
                            triple = new Triple("Unknown URL", -1, "No description");
                        }
                        this.f15582b.resumeWith(new Result(ResultKt.a(new ChartboostError.Load.WebViewFailed("WebView failed to load main frame. URL: " + ((String) triple.X) + ", Error Code: " + ((Integer) triple.f43253Y) + ", Description: " + ((Object) ((CharSequence) triple.Z)), null))));
                        return;
                    }
                    this.f15583c.a(this.d);
                    if (webView != null) {
                        webView.evaluateJavascript(String.format("document.querySelectorAll('video, audio').forEach(media => media.muted = %b);", Arrays.copyOf(new Object[]{Boolean.TRUE}, 1)), null);
                    }
                    i8 i8VarJ = this.f15583c.v().j();
                    if (i8VarJ != null && (listB = i8VarJ.b()) != null) {
                        for (String str2 : listB) {
                            if (webView != null) {
                                webView.evaluateJavascript(str2, null);
                            }
                        }
                    }
                    this.f15582b.resumeWith(new Result(Unit.f43263a));
                    dc dcVar = this.f15583c.x;
                    if (dcVar != null) {
                        dcVar.start();
                    }
                }
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                String strValueOf = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
                za.a("WebView threw " + ((Object) (webResourceError != null ? webResourceError.getDescription() : null)) + " when requesting " + strValueOf, (Throwable) null, 2, (Object) null);
                if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
                    return;
                }
                this.f15583c.y = true;
                if (this.f15583c.f15572z == null) {
                    this.f15583c.f15572z = new Triple(strValueOf, webResourceError != null ? Integer.valueOf(webResourceError.getErrorCode()) : null, webResourceError != null ? webResourceError.getDescription() : null);
                }
            }

            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                za.a("WebView render process " + renderProcessGoneDetail, (Throwable) null, 2, (Object) null);
                if (this.f15582b.isActive()) {
                    this.f15582b.resumeWith(new Result(ResultKt.a(ChartboostError.Load.WebViewCrashed.INSTANCE)));
                    return true;
                }
                ChartboostError.Render.WebViewTerminated webViewTerminated = ChartboostError.Render.WebViewTerminated.INSTANCE;
                za.b("WebView render process gone: " + renderProcessGoneDetail, webViewTerminated);
                this.f15583c.a(webViewTerminated);
                xe xeVarI = this.f15583c.i();
                if (xeVarI != null) {
                    xeVarI.b(webViewTerminated);
                }
                dc dcVar = this.f15583c.x;
                if (dcVar == null) {
                    return true;
                }
                dcVar.a(fg.FAILURE);
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                Intrinsics.f(view, "view");
                Intrinsics.f(request, "request");
                if (!(view instanceof lc)) {
                    za.b("Expected an MraidWebView", (Throwable) null, 2, (Object) null);
                    return false;
                }
                lc lcVar = (lc) view;
                boolean gestureDetected = lcVar.getGestureDetected();
                if (this.f15583c.v().n()) {
                    lcVar.a();
                }
                dc dcVar = this.f15583c.x;
                if (dcVar == null) {
                    return false;
                }
                i8 i8VarJ = this.f15583c.v().j();
                return dcVar.a(request, i8VarJ != null ? i8VarJ.c() : false, gestureDetected);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, Continuation continuation) {
            super(2, continuation);
            this.f = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return xj.this.new c(this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            URL urlA;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.d;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return obj;
            }
            ResultKt.b(obj);
            xj xjVar = xj.this;
            Context context = this.f;
            this.f15575b = xjVar;
            this.f15576c = context;
            this.d = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(this));
            cancellableContinuationImpl.q();
            WebView webViewA = xjVar.s.a(context);
            webViewA.getSettings().setJavaScriptEnabled(true);
            webViewA.getSettings().setMediaPlaybackRequiresUserGesture(false);
            webViewA.setBackgroundColor(-16777216);
            webViewA.setWebViewClient(new b(cancellableContinuationImpl, xjVar, webViewA));
            xjVar.f15571w = webViewA;
            dc dcVarA = xjVar.s.a(context, webViewA, xjVar.q);
            dcVarA.a(xjVar);
            xjVar.x = dcVarA;
            cancellableContinuationImpl.s(new a(xjVar, webViewA));
            String str = xjVar.o;
            if (str != null) {
                RegexOption[] regexOptionArr = RegexOption.f44714Y;
                String strC = new Regex("\\sautoplay(=[\"']?autoplay[\"']?)?", 0).c("", str);
                Set set = xjVar.f15570u;
                if (set != null) {
                    strC = xjVar.t.b().a(strC, set);
                }
                String strA = xjVar.t.b().a(strC);
                i8 i8VarJ = xjVar.v().j();
                String string = (i8VarJ == null || (urlA = i8VarJ.a()) == null) ? null : urlA.toString();
                webViewA.loadDataWithBaseURL(string, "<html><script type=\"text/javascript\">" + fc.f13892a.a() + "</script>\n" + ((Object) strA) + "</html>", "text/html", "UTF-8", null);
            } else {
                URL url = xjVar.f15569p;
                if (url != null) {
                    webViewA.loadUrl(url.toString());
                }
            }
            Object objP = cancellableContinuationImpl.p();
            return objP == coroutineSingletons ? coroutineSingletons : objP;
        }
    }

    public static final class d extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15584b;
        public final /* synthetic */ WebView d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(WebView webView, Continuation continuation) {
            super(2, continuation);
            this.d = webView;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return xj.this.new d(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f15584b;
            if (i2 == 0) {
                ResultKt.b(obj);
                xj xjVar = xj.this;
                WebView webView = this.d;
                this.f15584b = 1;
                if (xjVar.a(webView, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            xj.this.f15571w = null;
            return Unit.f43263a;
        }
    }

    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f15586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15587c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f15588e;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15587c = obj;
            this.f15588e |= Integer.MIN_VALUE;
            return xj.this.a((WebView) null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj(String str, URL url, zb placementType, n4 n4Var, zj webViewFactory, ue renderableConfig, w adMarkupConfig, vg trackerComponent, jg telemetryManager, r adFormat, jj viewabilityComponent, Set set, Mediation mediation) throws ChartboostError.Load.InvalidAdm {
        super(renderableConfig, adMarkupConfig, trackerComponent, telemetryManager, adFormat, mediation);
        Intrinsics.f(placementType, "placementType");
        Intrinsics.f(webViewFactory, "webViewFactory");
        Intrinsics.f(renderableConfig, "renderableConfig");
        Intrinsics.f(adMarkupConfig, "adMarkupConfig");
        Intrinsics.f(trackerComponent, "trackerComponent");
        Intrinsics.f(telemetryManager, "telemetryManager");
        Intrinsics.f(adFormat, "adFormat");
        Intrinsics.f(viewabilityComponent, "viewabilityComponent");
        this.o = str;
        this.f15569p = url;
        this.q = placementType;
        this.r = n4Var;
        this.s = webViewFactory;
        this.t = viewabilityComponent;
        this.f15570u = set;
        this.v = mediation;
        if (str == null && url == null) {
            throw new ChartboostError.Load.InvalidAdm("WebRenderable requires either HTML or URL to be provided", new IllegalArgumentException("Missing content"));
        }
    }

    @Override // com.chartboost.sdk.impl.te
    public float j() {
        super.j();
        String str = String.format("document.querySelectorAll('video, audio').forEach(media => media.muted = %b);", Arrays.copyOf(new Object[]{Boolean.TRUE}, 1));
        WebView webView = this.f15571w;
        if (webView == null) {
            return 0.0f;
        }
        webView.evaluateJavascript(str, null);
        return 0.0f;
    }

    @Override // com.chartboost.sdk.impl.te
    public void m() {
        dc dcVar = this.x;
        if (dcVar != null) {
            dcVar.pause();
        }
        WebView webView = this.f15571w;
        if (webView != null) {
            webView.onPause();
        }
        za.a("WebRenderable paused.", (Throwable) null, 2, (Object) null);
    }

    @Override // com.chartboost.sdk.impl.te
    public void n() {
        WebView webView = this.f15571w;
        if (webView != null) {
            webView.onResume();
        }
        dc dcVar = this.x;
        if (dcVar != null) {
            dcVar.a();
        }
        WebView webView2 = this.f15571w;
        if (webView2 != null) {
            webView2.postDelayed(new C(this, 21), 100L);
        }
    }

    @Override // com.chartboost.sdk.impl.te
    public void o() {
        oj ojVarB = b();
        if (ojVarB != null) {
            ojVarB.c();
        }
    }

    @Override // com.chartboost.sdk.impl.f2
    public void x() {
        oj ojVarB = b();
        if (ojVarB != null) {
            ojVarB.b();
        }
        dc dcVar = this.x;
        if (dcVar != null) {
            dcVar.a();
        }
        WebView webView = this.f15571w;
        if (webView != null) {
            webView.onResume();
        }
        WebView webView2 = this.f15571w;
        if (webView2 != null) {
            webView2.evaluateJavascript("window?.chartboost?.onShow?.();", null);
        }
        WebView webView3 = this.f15571w;
        if (webView3 != null) {
            webView3.evaluateJavascript("document.querySelectorAll('video, audio').forEach(media => { if (media.paused) media.play(); });", null);
        }
        super.x();
    }

    @Override // com.chartboost.sdk.impl.te
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public WebView k() {
        return this.f15571w;
    }

    @Override // com.chartboost.sdk.impl.nj
    public oj b() {
        return this.f15568A;
    }

    public static final void j(xj this$0) {
        Intrinsics.f(this$0, "this$0");
        WebView webView = this$0.f15571w;
        if (webView != null) {
            webView.evaluateJavascript("document.querySelectorAll('video, audio').forEach(media => { media.muted = true;});", null);
        }
        za.a("WebRenderable resumed.", (Throwable) null, 2, (Object) null);
    }

    @Override // com.chartboost.sdk.impl.ec
    public void b(rd request) {
        Intrinsics.f(request, "request");
        xe xeVarI = i();
        if (xeVarI != null) {
            xeVarI.a(request);
        }
    }

    @Override // com.chartboost.sdk.impl.f2
    public void b(String str, boolean z2) {
        xe xeVarI;
        n4 n4Var = this.r;
        if (n4Var != null) {
            a(n4Var.b(), z2);
            if (!r().a(new y3.c(this.r.c()), z2) || (xeVarI = i()) == null) {
                return;
            }
            xeVarI.f();
            return;
        }
        super.b(str, z2);
    }

    public final void a(WebView webView) {
        kj kjVarB = this.t.b();
        if (kjVarB.b()) {
            this.f15568A = this.t.a().a(kjVarB, webView);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.chartboost.sdk.impl.te
    public Object a(Context context, Continuation continuation) throws Throwable {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.d = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objF = bVar.f15573b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = bVar.d;
        if (i3 == 0) {
            ResultKt.b(objF);
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatcherLoader.f45042a;
            c cVar = new c(context, null);
            bVar.d = 1;
            objF = BuildersKt.f(mainCoroutineDispatcher, cVar, bVar);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objF);
        }
        return ((Result) objF).X;
    }

    public /* synthetic */ xj(String str, URL url, zb zbVar, n4 n4Var, zj zjVar, ue ueVar, w wVar, vg vgVar, jg jgVar, r rVar, jj jjVar, Set set, Mediation mediation, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : url, zbVar, (i2 & 8) != 0 ? null : n4Var, (i2 & 16) != 0 ? new s5() : zjVar, ueVar, wVar, vgVar, jgVar, rVar, jjVar, (i2 & com.p004ironsource.mediationsdk.metadata.a.f25965n) != 0 ? null : set, mediation);
    }

    @Override // com.chartboost.sdk.impl.ec
    public void a(String str, ak reason, boolean z2) {
        Intrinsics.f(reason, "reason");
        b(str, z2);
    }

    @Override // com.chartboost.sdk.impl.ec
    public void a(ck reason) {
        Intrinsics.f(reason, "reason");
        za.a("WebView stopped for " + reason, (Throwable) null, 2, (Object) null);
        if (reason == ck.MRAID_UNLOAD) {
            ChartboostError.Render.WebViewMraidUnload webViewMraidUnload = ChartboostError.Render.WebViewMraidUnload.INSTANCE;
            za.b("WebView stopped due to MRAID unload", webViewMraidUnload);
            a(webViewMraidUnload);
            a(fg.UNLOAD);
            xe xeVarI = i();
            if (xeVarI != null) {
                xeVarI.b(webViewMraidUnload);
            }
        }
    }

    @Override // com.chartboost.sdk.impl.te
    public void a(fg reason) {
        Intrinsics.f(reason, "reason");
        oj ojVarB = b();
        if (ojVarB != null) {
            ojVarB.a();
        }
        dc dcVar = this.x;
        if (dcVar != null) {
            dcVar.a(reason);
        }
        dc dcVar2 = this.x;
        if (dcVar2 != null) {
            dcVar2.a((ec) null);
        }
        this.x = null;
        WebView webView = this.f15571w;
        if (webView != null) {
            webView.setVisibility(8);
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new d(webView, null), 3);
        }
    }

    @Override // com.chartboost.sdk.impl.te
    public void a(float f) {
        super.a(f);
        String str = String.format("document.querySelectorAll('video, audio').forEach(media => media.muted = %b);", Arrays.copyOf(new Object[]{Boolean.FALSE}, 1));
        WebView webView = this.f15571w;
        if (webView != null) {
            webView.evaluateJavascript(str, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(WebView webView, Continuation continuation) {
        e eVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.f15588e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.f15588e = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj = eVar.f15587c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = eVar.f15588e;
        if (i3 == 0) {
            ResultKt.b(obj);
            eVar.f15586b = webView;
            eVar.f15588e = 1;
            if (DelayKt.a(1100L, eVar) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            webView = (WebView) eVar.f15586b;
            ResultKt.b(obj);
        }
        webView.onPause();
        webView.stopLoading();
        webView.destroy();
        return Unit.f43263a;
    }
}
