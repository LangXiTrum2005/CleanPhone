package com.chartboost.sdk.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.callbacks.DismissibleAdCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.DismissEvent;
import com.chartboost.sdk.events.ExpirationEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import com.chartboost.sdk.internal.Model.CBError;
import com.thinkup.core.common.n.mo;
import java.net.URL;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e2 implements p8 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f13726n = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ad f13727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.chartboost.sdk.impl.d f13728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdCallback f13729c;
    public final u5 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.chartboost.sdk.impl.j f13730e;
    public final b2 f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13731h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Lazy f13732i;
    public boolean j;
    public final CoroutineScope k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Job f13733l;
    public URL m;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public class b implements l {
        public b() {
        }

        @Override // com.chartboost.sdk.impl.l
        public void a() {
            AdCallback adCallbackK = e2.this.k();
            ya yaVarF = e2.this.g().f();
            adCallbackK.onAdClicked(new ClickEvent(yaVarF != null ? yaVarF.b() : null, e2.this.e()), null);
        }

        @Override // com.chartboost.sdk.impl.l
        public void b() {
            za.a("DefaultAdContainerListener: onAdClosed called. This is unexpected for the current ad type.", (Throwable) null, 2, (Object) null);
        }

        @Override // com.chartboost.sdk.impl.l
        public void c() {
        }

        @Override // com.chartboost.sdk.impl.l
        public void d() {
            za.a("DefaultAdContainerListener: onAdRewarded called. This is unexpected for the current ad type.", (Throwable) null, 2, (Object) null);
        }

        @Override // com.chartboost.sdk.impl.l
        public void e() {
            za.a("DefaultAdContainerListener: onAdImpression called. This is unexpected for the current ad type.", (Throwable) null, 2, (Object) null);
        }

        @Override // com.chartboost.sdk.impl.l
        public void a(s7 expirationReason) {
            Intrinsics.f(expirationReason, "expirationReason");
            new com.chartboost.sdk.impl.e(e2.this.j().d().c()).a(new ExpirationEvent(e2.this.e(), expirationReason), e2.this.k());
        }

        @Override // com.chartboost.sdk.impl.l
        public void a(String url) {
            Intrinsics.f(url, "url");
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
            intent.setFlags(268435456);
            ContextCompat.startActivity(e2.this.j().d().getContext(), intent, null);
        }

        @Override // com.chartboost.sdk.impl.l
        public void a(rd request) {
            Intrinsics.f(request, "request");
            za.a("DefaultAdContainerListener: onRequestOrientation called with " + request + ". Ignoring as this ad type may not support or expect orientation changes.", (Throwable) null, 2, (Object) null);
        }
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return new o(e2.this.f13730e, e2.this.e().getMediation(), e2.this.f(), e2.this.j().c(), e2.this.j().b(), e2.this.j().a().q(), e2.this.j().a().c(), null, 128, null);
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f13736b = new d();

        public d() {
            super(0);
        }

        public final void a() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class e extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ DismissibleAdCallback f13738c;
        public final /* synthetic */ Function0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(DismissibleAdCallback dismissibleAdCallback, Function0 function0) {
            super();
            this.f13738c = dismissibleAdCallback;
            this.d = function0;
        }

        @Override // com.chartboost.sdk.impl.e2.b, com.chartboost.sdk.impl.l
        public void b() {
            e2.this.d(false);
            DismissibleAdCallback dismissibleAdCallback = this.f13738c;
            ya yaVarF = e2.this.g().f();
            dismissibleAdCallback.onAdDismiss(new DismissEvent(yaVarF != null ? yaVarF.b() : null, e2.this.e()));
        }

        @Override // com.chartboost.sdk.impl.e2.b, com.chartboost.sdk.impl.l
        public void d() {
            this.d.invoke();
        }

        @Override // com.chartboost.sdk.impl.e2.b, com.chartboost.sdk.impl.l
        public void e() {
            Unit unit;
            ya yaVarF = e2.this.g().f();
            this.f13738c.onImpressionRecorded(new ImpressionEvent(new ShowEvent(yaVarF != null ? yaVarF.b() : null, e2.this.e()).getAdID(), e2.this.e()));
            ya yaVarF2 = e2.this.g().f();
            if (yaVarF2 != null) {
                e2.this.g().c(yaVarF2);
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
            if (unit == null) {
                za.e("Cannot track impression: currentAd is null for location " + e2.this.e().getLocation(), null, 2, null);
            }
        }
    }

    public static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f13739b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f13740c;
        public long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f13741e;
        public /* synthetic */ Object f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f13742h;

        public f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f = obj;
            this.f13742h |= Integer.MIN_VALUE;
            Object objA = e2.a(e2.this, null, null, this);
            return objA == CoroutineSingletons.X ? objA : new Result(objA);
        }
    }

    public static final class g extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13743b;
        public final /* synthetic */ Context d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f13745e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Context context, String str, Continuation continuation) {
            super(2, continuation);
            this.d = context;
            this.f13745e = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return e2.this.new g(this.d, this.f13745e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f13743b;
            if (i2 == 0) {
                ResultKt.b(obj);
                o oVarG = e2.this.g();
                Context context = this.d;
                String str = this.f13745e;
                this.f13743b = 1;
                objA = oVarG.a(context, str, this);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                objA = ((Result) obj).X;
            }
            return new Result(objA);
        }
    }

    public static final class h extends Lambda implements Function0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f13747c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z2) {
            super(0);
            this.f13747c = z2;
        }

        public final void a() {
            e2.this.b(this.f13747c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class i extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f13748b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f13749c;
        public /* synthetic */ Object d;
        public int f;

        public i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            Object objA = e2.a(e2.this, (Context) null, this);
            return objA == CoroutineSingletons.X ? objA : new Result(objA);
        }
    }

    public static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13751b;
        public final /* synthetic */ ShowEvent d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Context f13753e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ShowEvent showEvent, Context context, Continuation continuation) {
            super(2, continuation);
            this.d = showEvent;
            this.f13753e = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return e2.this.new j(this.d, this.f13753e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f13751b;
            if (i2 == 0) {
                ResultKt.b(obj);
                e2.this.i().onAdRequestedToShow(this.d);
                o oVarG = e2.this.g();
                Context context = this.f13753e;
                this.f13751b = 1;
                objA = oVarG.a(context, this);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                objA = ((Result) obj).X;
            }
            return new Result(objA);
        }
    }

    public static final class k extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l6 f13755c;
        public final /* synthetic */ URL d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e2 f13756e;

        public static final class a extends SuspendLambda implements Function3 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f13757b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f13758c;
            public final /* synthetic */ URL d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(URL url, Continuation continuation) {
                super(3, continuation);
                this.d = url;
            }

            @Override // kotlin.jvm.functions.Function3
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(FlowCollector flowCollector, Throwable th, Continuation continuation) {
                a aVar = new a(this.d, continuation);
                aVar.f13758c = th;
                return aVar.invokeSuspend(Unit.f43263a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                if (this.f13757b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                Throwable th = (Throwable) this.f13758c;
                ChartboostError.Other.Unknown unknown = new ChartboostError.Other.Unknown("Cache observer flow error for URL: " + this.d, th instanceof Exception ? (Exception) th : new Exception(th));
                za.b(androidx.datastore.preferences.protobuf.a.n(com.ironsource.d9.i.d, unknown.getCode(), "] ", unknown.getConstant(), " - Cache observer error"), unknown);
                return Unit.f43263a;
            }
        }

        public static final class b implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e2 f13759a;

            public b(e2 e2Var) {
                this.f13759a = e2Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(k3 k3Var, Continuation continuation) {
                if (k3Var instanceof k3.a) {
                    k3.a aVar = (k3.a) k3Var;
                    za.c("Observed eviction for " + this.f13759a.e().getLocation() + ", reason: " + aVar.a() + ", url: " + aVar.b(), null, 2, null);
                    this.f13759a.f().a(aVar.a());
                    this.f13759a.q();
                }
                return Unit.f43263a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(l6 l6Var, URL url, e2 e2Var, Continuation continuation) {
            super(2, continuation);
            this.f13755c = l6Var;
            this.d = url;
            this.f13756e = e2Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new k(this.f13755c, this.d, this.f13756e, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.net.URL] */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.StringBuilder] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str = "Cache observer cancelled for ";
            String sb = com.ironsource.d9.i.d;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f13754b;
            try {
                if (i2 == 0) {
                    ResultKt.b(obj);
                    FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(this.f13755c.a(this.d), new a(this.d, null));
                    b bVar = new b(this.f13756e);
                    this.f13754b = 1;
                    if (flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.collect(bVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                String location = this.f13756e.e().getLocation();
                str = this.d;
                sb = new StringBuilder("Cache observer collect loop finished for ");
                sb.append(location);
                sb.append(", URL: ");
                sb.append(str);
                za.a(sb.toString(), (Throwable) null, 2, (Object) null);
            } catch (CancellationException unused) {
                za.a(str + this.f13756e.e().getLocation() + ", URL: " + this.d, (Throwable) null, 2, (Object) null);
            } catch (Exception e2) {
                ChartboostError.Other.Unknown unknown = new ChartboostError.Other.Unknown("Failed to collect cache events for " + this.f13756e.e().getLocation(), e2);
                za.b(sb + unknown.getCode() + "] " + unknown.getConstant() + " - Cache event collection failed, URL: " + this.d, unknown);
            } finally {
                za.a("Cache observer collect loop finished for " + this.f13756e.e().getLocation() + ", URL: " + this.d, (Throwable) null, 2, (Object) null);
            }
            return Unit.f43263a;
        }
    }

    public e2(Ad ad, com.chartboost.sdk.impl.d api, AdCallback originalCallback, u5 dependencyContainer, com.chartboost.sdk.impl.j adConfigInternal) {
        Intrinsics.f(ad, "ad");
        Intrinsics.f(api, "api");
        Intrinsics.f(originalCallback, "originalCallback");
        Intrinsics.f(dependencyContainer, "dependencyContainer");
        Intrinsics.f(adConfigInternal, "adConfigInternal");
        this.f13727a = ad;
        this.f13728b = api;
        this.f13729c = originalCallback;
        this.d = dependencyContainer;
        this.f13730e = adConfigInternal;
        this.f = new b2();
        this.f13732i = LazyKt.b(new c());
        Job jobB = SupervisorKt.b();
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        this.k = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.d((JobSupport) jobB, DefaultIoScheduler.f45062Y));
    }

    public abstract void a(String str);

    public abstract Object b(Context context, Continuation continuation);

    @Override // com.chartboost.sdk.impl.p8
    public void b() {
        q();
        CoroutineScopeKt.c(this.k, ExceptionsKt.a("Coordinator destroyed", null));
        g().b();
    }

    public void c(boolean z2) {
        this.j = z2;
    }

    public void d() {
        this.f13728b.a();
    }

    public final Ad e() {
        return this.f13727a;
    }

    public abstract l f();

    public final o g() {
        return (o) this.f13732i.getX();
    }

    public final com.chartboost.sdk.impl.d h() {
        return this.f13728b;
    }

    public abstract AdCallback i();

    public final u5 j() {
        return this.d;
    }

    public final AdCallback k() {
        return this.f13729c;
    }

    public URL l() {
        pc pcVarZ;
        List listV;
        pc pcVarC;
        List listV2;
        ya yaVarF = g().f();
        f2 f2Var = (yaVarF == null || (pcVarC = yaVarF.c()) == null || (listV2 = pcVarC.v()) == null) ? null : (f2) CollectionsKt.y(listV2);
        cj cjVar = f2Var instanceof cj ? (cj) f2Var : null;
        if (cjVar == null) {
            zh zhVar = f2Var instanceof zh ? (zh) f2Var : null;
            f2 f2Var2 = (zhVar == null || (pcVarZ = zhVar.z()) == null || (listV = pcVarZ.v()) == null) ? null : (f2) CollectionsKt.y(listV);
            cjVar = f2Var2 instanceof cj ? (cj) f2Var2 : null;
        }
        if (cjVar == null) {
            za.e(android.support.v4.media.a.n("Could not find VideoRenderable for ad with location ", this.f13727a.getLocation(), " to observe expiration."), null, 2, null);
        }
        if (cjVar != null) {
            return cjVar.C();
        }
        return null;
    }

    public void m() {
        this.f13728b.a("", (CBError.Type) CBError.Impression.INVALID_RESPONSE);
    }

    public boolean n() {
        return this.f13728b.b();
    }

    public void o() {
        p();
        AdCallback adCallbackI = i();
        ya yaVarF = g().f();
        adCallbackI.onAdLoaded(new CacheEvent(yaVarF != null ? yaVarF.b() : null, this.f13727a), null);
    }

    public void p() {
        q();
        URL urlL = l();
        if (urlL == null) {
            za.d(android.support.v4.media.a.n("No video URL to observe for ad at location ", this.f13727a.getLocation(), mo.ono), null, 2, null);
            return;
        }
        this.m = urlL;
        l6 l6VarI = this.d.a().i();
        za.a("Starting cache observer for " + this.f13727a.getLocation() + ", URL: " + urlL, (Throwable) null, 2, (Object) null);
        this.f13733l = BuildersKt.c(this.k, null, null, new k(l6VarI, urlL, this, null), 3);
    }

    public void q() {
        Job job = this.f13733l;
        if (job != null) {
            if (!job.isActive()) {
                job = null;
            }
            if (job != null) {
                za.a("Stopping cache observer for " + this.f13727a.getLocation() + ", URL: " + this.m, (Throwable) null, 2, (Object) null);
                job.a(null);
            }
        }
        this.f13733l = null;
        this.m = null;
    }

    public final l a(DismissibleAdCallback callback, Function0 onReward) {
        Intrinsics.f(callback, "callback");
        Intrinsics.f(onReward, "onReward");
        return new e(callback, onReward);
    }

    @Override // com.chartboost.sdk.impl.p8
    public void c() {
        if (!Chartboost.isSdkStarted()) {
            za.b("Chartboost is not initialized. Ignoring clearLoadedAd().", (Throwable) null, 2, (Object) null);
            return;
        }
        c(false);
        Job job = this.f13733l;
        if (job != null) {
            job.a(null);
        }
        this.f13733l = null;
        this.m = null;
        d();
        g().c();
    }

    public final void d(boolean z2) {
        this.g = z2;
    }

    public static /* synthetic */ l a(e2 e2Var, DismissibleAdCallback dismissibleAdCallback, Function0 function0, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createFullscreenAdContainerListener");
        }
        if ((i2 & 2) != 0) {
            function0 = d.f13736b;
        }
        return e2Var.a(dismissibleAdCallback, function0);
    }

    public void b(boolean z2) {
        if (z2) {
            this.f13729c.onAdLoaded(new CacheEvent(null, this.f13727a), new CacheError(CacheError.Code.SESSION_NOT_STARTED, null, 2, null));
        } else {
            this.f13729c.onAdShown(new ShowEvent(null, this.f13727a), new ShowError(ShowError.Code.SESSION_NOT_STARTED, null, 2, null));
        }
    }

    public final void a(ClickEvent event, ClickError clickError) {
        Intrinsics.f(event, "event");
        this.f13729c.onAdClicked(event, clickError);
    }

    public final void a(ExpirationEvent event) {
        Intrinsics.f(event, "event");
        this.f13729c.onAdExpired(event);
    }

    public final void a(CacheEvent event, CacheError cacheError) {
        Intrinsics.f(event, "event");
        c(cacheError == null);
        this.f13729c.onAdLoaded(event, cacheError);
    }

    public final void a(ShowEvent event) {
        Intrinsics.f(event, "event");
        this.g = true;
        this.f13729c.onAdRequestedToShow(event);
    }

    public final void a(ShowEvent event, ShowError showError) {
        Intrinsics.f(event, "event");
        this.g = showError == null;
        this.f13729c.onAdShown(event, showError);
    }

    public final void a(ImpressionEvent event) {
        Intrinsics.f(event, "event");
        this.f13729c.onImpressionRecorded(event);
    }

    public void a(Throwable throwable, ShowEvent showEvent) {
        Unit unit;
        Intrinsics.f(throwable, "throwable");
        Intrinsics.f(showEvent, "showEvent");
        this.g = false;
        ShowError showErrorB = q.b(throwable);
        ya yaVarF = g().f();
        if (yaVarF != null) {
            g().a(yaVarF, throwable);
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            za.e("Cannot track show failure: currentAd is null for location " + this.f13727a.getLocation(), null, 2, null);
        }
        this.f13729c.onAdShown(showEvent, showErrorB);
    }

    public void a(View view, ShowEvent showEvent) {
        Intrinsics.f(showEvent, "showEvent");
        this.f13729c.onAdShown(showEvent, null);
    }

    @Override // com.chartboost.sdk.impl.p8
    public boolean a() {
        if (this.f13731h) {
            return this.j;
        }
        if (Chartboost.isSdkStarted()) {
            return n();
        }
        return this.j;
    }

    @Override // com.chartboost.sdk.impl.p8
    public Object a(Context context, String str, Continuation continuation) {
        return a(this, context, str, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0197  */
    /* JADX WARN: Code duplicated, block: B:75:0x019a  */
    /* JADX WARN: Code duplicated, block: B:77:0x019e  */
    /* JADX WARN: Code duplicated, block: B:79:0x01af  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c3  */
    public static Object a(e2 e2Var, Context context, String str, Continuation continuation) throws Throwable {
        f fVar;
        long jF;
        Ref.ObjectRef objectRef;
        e2 e2Var2;
        ChartboostError.Load internal;
        ChartboostError.Load load;
        Unit unit;
        e2 e2Var3 = e2Var;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i2 = fVar.f13742h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.f13742h = i2 - Integer.MIN_VALUE;
            } else {
                fVar = e2Var3.new f(continuation);
            }
        } else {
            fVar = e2Var3.new f(continuation);
        }
        Object obj = fVar.f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = fVar.f13742h;
        Unit unit2 = Unit.f43263a;
        if (i3 == 0) {
            ResultKt.b(obj);
            if (!Chartboost.isSdkStarted()) {
                ChartboostError.Load.NotInitialized notInitialized = ChartboostError.Load.NotInitialized.INSTANCE;
                e2Var3.a(notInitialized);
                return ResultKt.a(notInitialized);
            }
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity.isFinishing() || activity.isDestroyed()) {
                    ChartboostError.Load.NoContext noContext = ChartboostError.Load.NoContext.INSTANCE;
                    e2Var3.a(noContext);
                    return ResultKt.a(noContext);
                }
            }
            if (e2Var3.a()) {
                ChartboostError.Load.AlreadyLoaded alreadyLoaded = ChartboostError.Load.AlreadyLoaded.INSTANCE;
                e2Var3.a(alreadyLoaded);
                return ResultKt.a(alreadyLoaded);
            }
            if (StringsKt.w(e2Var3.f13727a.getLocation())) {
                ChartboostError.Load.InvalidPlacement invalidPlacement = ChartboostError.Load.InvalidPlacement.INSTANCE;
                e2Var3.a(invalidPlacement);
                return ResultKt.a(invalidPlacement);
            }
            if (str != null && str.length() != 0) {
                if (o.f14553n.a(e2Var3.f, str)) {
                    e2Var3.f13731h = true;
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    objectRef2.X = ResultKt.a(new ChartboostError.Load.Unknown("Load initialization failed", null));
                    ya yaVarF = e2Var3.g().f();
                    w wVarA = yaVarF != null ? yaVarF.a() : null;
                    jF = ((long) (wVarA != null ? wVarA.f() : 30)) * 1000;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    try {
                        g gVar = e2Var3.new g(context, str, null);
                        fVar.f13739b = e2Var3;
                        fVar.f13740c = objectRef2;
                        fVar.d = jF;
                        fVar.f13741e = jCurrentTimeMillis;
                        fVar.f13742h = 1;
                        Object objC = TimeoutKt.c(jF, gVar, fVar);
                        if (objC == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        objectRef = objectRef2;
                        obj = objC;
                    } catch (Exception e2) {
                        e = e2;
                        objectRef = objectRef2;
                        e2Var2 = e2Var3;
                        if (e instanceof ChartboostError.Load) {
                            load = (ChartboostError.Load) e;
                        } else {
                            if (e instanceof IllegalArgumentException) {
                                internal = new ChartboostError.Load.InvalidRequest(android.support.v4.media.a.C("Invalid request parameters: ", e.getMessage()), e);
                            } else if (e instanceof IllegalStateException) {
                                internal = new ChartboostError.Load.Internal(android.support.v4.media.a.C("Invalid state during load: ", e.getMessage()), e);
                            } else {
                                internal = new ChartboostError.Load.Internal(android.support.v4.media.a.C("Unexpected error during load: ", e.getMessage()), e);
                            }
                            load = internal;
                        }
                        String code = load.getCode();
                        String constant = load.getConstant();
                        String location = e2Var2.f13727a.getLocation();
                        StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q(com.ironsource.d9.i.d, code, "] ", constant, " - Ad load failed: ");
                        sbQ.append(location);
                        za.b(sbQ.toString(), load);
                        e2Var2.a(load);
                        objectRef.X = ResultKt.a(load);
                        System.currentTimeMillis();
                        return objectRef.X;
                    }
                } else {
                    e2Var3.f13731h = false;
                    e2Var3.a(str);
                    return unit2;
                }
            } else {
                e2Var3.m();
                return ResultKt.a(new ChartboostError.Load.InvalidAdm(android.support.v4.media.a.C("Bid response is null or empty for placement: ", e2Var3.f13727a.getLocation()), null));
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = fVar.d;
            objectRef = (Ref.ObjectRef) fVar.f13740c;
            e2Var2 = (e2) fVar.f13739b;
            try {
                ResultKt.b(obj);
                jF = j2;
                e2Var3 = e2Var2;
            } catch (Exception e3) {
                e = e3;
                if (e instanceof ChartboostError.Load) {
                    load = (ChartboostError.Load) e;
                } else {
                    if (e instanceof IllegalArgumentException) {
                        internal = new ChartboostError.Load.InvalidRequest(android.support.v4.media.a.C("Invalid request parameters: ", e.getMessage()), e);
                    } else if (e instanceof IllegalStateException) {
                        internal = new ChartboostError.Load.Internal(android.support.v4.media.a.C("Invalid state during load: ", e.getMessage()), e);
                    } else {
                        internal = new ChartboostError.Load.Internal(android.support.v4.media.a.C("Unexpected error during load: ", e.getMessage()), e);
                    }
                    load = internal;
                }
                String code2 = load.getCode();
                String constant2 = load.getConstant();
                String location2 = e2Var2.f13727a.getLocation();
                StringBuilder sbQ2 = androidx.datastore.preferences.protobuf.a.q(com.ironsource.d9.i.d, code2, "] ", constant2, " - Ad load failed: ");
                sbQ2.append(location2);
                za.b(sbQ2.toString(), load);
                e2Var2.a(load);
                objectRef.X = ResultKt.a(load);
            }
        }
        try {
            Result result = (Result) obj;
            if (result != null) {
                Object obj2 = result.X;
                if (!(obj2 instanceof Result.Failure)) {
                    e2Var3.o();
                } else {
                    e2Var3.a(Result.a(obj2));
                }
                objectRef.X = obj2;
                unit = unit2;
            } else {
                unit = null;
            }
            if (unit == null) {
                ChartboostError.Load.TimedOut timedOut = new ChartboostError.Load.TimedOut("Load operation exceeded timeout of " + jF + "ms", new TimeoutException("Ad load timed out after " + jF + " ms"));
                za.b(com.ironsource.d9.i.d + timedOut.getCode() + "] " + timedOut.getConstant() + " - Ad load timed out: " + e2Var3.f13727a.getLocation(), timedOut);
                e2Var3.a(timedOut);
                objectRef.X = ResultKt.a(timedOut);
            }
        } catch (Exception e4) {
            e = e4;
            e2Var2 = e2Var3;
            if (e instanceof ChartboostError.Load) {
                load = (ChartboostError.Load) e;
            } else {
                if (e instanceof IllegalArgumentException) {
                    internal = new ChartboostError.Load.InvalidRequest(android.support.v4.media.a.C("Invalid request parameters: ", e.getMessage()), e);
                } else if (e instanceof IllegalStateException) {
                    internal = new ChartboostError.Load.Internal(android.support.v4.media.a.C("Invalid state during load: ", e.getMessage()), e);
                } else {
                    internal = new ChartboostError.Load.Internal(android.support.v4.media.a.C("Unexpected error during load: ", e.getMessage()), e);
                }
                load = internal;
            }
            String code3 = load.getCode();
            String constant3 = load.getConstant();
            String location3 = e2Var2.f13727a.getLocation();
            StringBuilder sbQ3 = androidx.datastore.preferences.protobuf.a.q(com.ironsource.d9.i.d, code3, "] ", constant3, " - Ad load failed: ");
            sbQ3.append(location3);
            za.b(sbQ3.toString(), load);
            e2Var2.a(load);
            objectRef.X = ResultKt.a(load);
        }
        System.currentTimeMillis();
        return objectRef.X;
    }

    public void a(Throwable th) {
        AdCallback adCallbackI = i();
        ya yaVarF = g().f();
        adCallbackI.onAdLoaded(new CacheEvent(yaVarF != null ? yaVarF.b() : null, this.f13727a), q.a(th));
    }

    public void a(Context context) {
        Intrinsics.f(context, "context");
    }

    @Override // com.chartboost.sdk.impl.p8
    public Object a(Context context, Continuation continuation) {
        return a(this, context, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00c1 A[Catch: Exception -> 0x00d0, TryCatch #0 {Exception -> 0x00d0, blocks: (B:47:0x00bd, B:49:0x00c1, B:51:0x00c9, B:55:0x00d3, B:57:0x00d7, B:44:0x00a8), top: B:69:0x00a8 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c9 A[Catch: Exception -> 0x00d0, TryCatch #0 {Exception -> 0x00d0, blocks: (B:47:0x00bd, B:49:0x00c1, B:51:0x00c9, B:55:0x00d3, B:57:0x00d7, B:44:0x00a8), top: B:69:0x00a8 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d3 A[Catch: Exception -> 0x00d0, TryCatch #0 {Exception -> 0x00d0, blocks: (B:47:0x00bd, B:49:0x00c1, B:51:0x00c9, B:55:0x00d3, B:57:0x00d7, B:44:0x00a8), top: B:69:0x00a8 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00d7 A[Catch: Exception -> 0x00d0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00d0, blocks: (B:47:0x00bd, B:49:0x00c1, B:51:0x00c9, B:55:0x00d3, B:57:0x00d7, B:44:0x00a8), top: B:69:0x00a8 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Code duplicated, block: B:62:0x011f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x00d7, please report this as an issue */
    public static Object a(e2 e2Var, Context context, Continuation continuation) throws Throwable {
        i iVar;
        ShowEvent showEvent;
        Exception e2;
        ChartboostError.Show unknown;
        Result result;
        Object obj;
        Throwable thA;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i2 = iVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.f = i2 - Integer.MIN_VALUE;
            } else {
                iVar = e2Var.new i(continuation);
            }
        } else {
            iVar = e2Var.new i(continuation);
        }
        Object objC = iVar.d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = iVar.f;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    ResultKt.b(objC);
                    return ((Result) objC).X;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ShowEvent showEvent2 = (ShowEvent) iVar.f13749c;
            e2 e2Var2 = (e2) iVar.f13748b;
            try {
                ResultKt.b(objC);
                showEvent = showEvent2;
                e2Var = e2Var2;
                result = (Result) objC;
                if (result != null) {
                    obj = result.X;
                    thA = Result.a(obj);
                    if (thA == null) {
                        e2Var.a((View) obj, showEvent);
                        return obj;
                    }
                    e2Var.a(thA, showEvent);
                    return obj;
                }
                ChartboostError.Show.TimedOut timedOut = new ChartboostError.Show.TimedOut("Show operation exceeded timeout of 5000ms", new TimeoutException("Ad show timed out after 5000 ms"));
                za.b(com.ironsource.d9.i.d + timedOut.getCode() + "] " + timedOut.getConstant() + " - Ad show timed out: " + e2Var.f13727a.getLocation(), timedOut);
                e2Var.a(timedOut, showEvent);
                return ResultKt.a(timedOut);
            } catch (Exception e3) {
                e2 = e3;
                showEvent = showEvent2;
                e2Var = e2Var2;
                if (e2 instanceof ChartboostError.Show) {
                    unknown = (ChartboostError.Show) e2;
                } else {
                    unknown = new ChartboostError.Show.Unknown(android.support.v4.media.a.C("Exception during ad show: ", e2.getMessage()), e2);
                }
                String code = unknown.getCode();
                String constant = unknown.getConstant();
                String location = e2Var.f13727a.getLocation();
                StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q(com.ironsource.d9.i.d, code, "] ", constant, " - Ad show failed: ");
                sbQ.append(location);
                za.b(sbQ.toString(), unknown);
                e2Var.a(unknown, showEvent);
                return ResultKt.a(unknown);
            }
        }
        ResultKt.b(objC);
        if (!Chartboost.isSdkStarted()) {
            e2Var.a(false);
            return ResultKt.a(ChartboostError.Show.NotInitialized.INSTANCE);
        }
        e2Var.a(context);
        if (e2Var.f13731h) {
            if (!e2Var.a()) {
                return ResultKt.a(ChartboostError.Show.NoAd.INSTANCE);
            }
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity.isFinishing() || activity.isDestroyed()) {
                    return ResultKt.a(ChartboostError.Show.NoContext.INSTANCE);
                }
            }
            ya yaVarF = e2Var.g().f();
            showEvent = new ShowEvent(yaVarF != null ? yaVarF.b() : null, e2Var.f13727a);
            try {
                j jVar = e2Var.new j(showEvent, context, null);
                iVar.f13748b = e2Var;
                iVar.f13749c = showEvent;
                iVar.f = 1;
                objC = TimeoutKt.c(5000L, jVar, iVar);
                if (objC == coroutineSingletons) {
                }
                result = (Result) objC;
                if (result != null) {
                    obj = result.X;
                    thA = Result.a(obj);
                    if (thA == null) {
                        e2Var.a((View) obj, showEvent);
                        return obj;
                    }
                    e2Var.a(thA, showEvent);
                    return obj;
                }
                ChartboostError.Show.TimedOut timedOut2 = new ChartboostError.Show.TimedOut("Show operation exceeded timeout of 5000ms", new TimeoutException("Ad show timed out after 5000 ms"));
                za.b(com.ironsource.d9.i.d + timedOut2.getCode() + "] " + timedOut2.getConstant() + " - Ad show timed out: " + e2Var.f13727a.getLocation(), timedOut2);
                e2Var.a(timedOut2, showEvent);
                return ResultKt.a(timedOut2);
            } catch (Exception e4) {
                e2 = e4;
                if (e2 instanceof ChartboostError.Show) {
                    unknown = (ChartboostError.Show) e2;
                } else {
                    unknown = new ChartboostError.Show.Unknown(android.support.v4.media.a.C("Exception during ad show: ", e2.getMessage()), e2);
                }
                String code2 = unknown.getCode();
                String constant2 = unknown.getConstant();
                String location2 = e2Var.f13727a.getLocation();
                StringBuilder sbQ2 = androidx.datastore.preferences.protobuf.a.q(com.ironsource.d9.i.d, code2, "] ", constant2, " - Ad show failed: ");
                sbQ2.append(location2);
                za.b(sbQ2.toString(), unknown);
                e2Var.a(unknown, showEvent);
                return ResultKt.a(unknown);
            }
        }
        iVar.f = 2;
        Object objB = e2Var.b(context, iVar);
        if (objB != coroutineSingletons) {
            return objB;
        }
        return coroutineSingletons;
    }

    public final void a(boolean z2) {
        try {
            w3.f15454b.d().c().a(new h(z2));
        } catch (Exception e2) {
            ChartboostError.Other.Unknown unknown = new ChartboostError.Other.Unknown("Failed to post session not started callback for " + this.f13730e.a(), e2);
            za.b(androidx.datastore.preferences.protobuf.a.n(com.ironsource.d9.i.d, unknown.getCode(), "] ", unknown.getConstant(), " - Cannot post session not started callback"), unknown);
        }
    }
}
