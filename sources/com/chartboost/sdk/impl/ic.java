package com.chartboost.sdk.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class ic implements hc {
    public static final a f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f14173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f14175c;
    public Runnable d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Job f14176e;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public b(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            za.a("Unexpected error when scheduling mraid recurring task.", th);
        }
    }

    public static final class c extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f14178c;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = ic.this.new c(continuation);
            cVar.f14178c = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0027  */
        /* JADX WARN: Code duplicated, block: B:13:0x0037 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:16:0x0040  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0035 -> B:14:0x0038). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:13:0x0037
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
                int r1 = r5.f14177b
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                java.lang.Object r1 = r5.f14178c
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.ResultKt.b(r6)
                goto L38
            L11:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L19:
                kotlin.ResultKt.b(r6)
                java.lang.Object r6 = r5.f14178c
                kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
                r1 = r6
            L21:
                boolean r6 = kotlinx.coroutines.CoroutineScopeKt.e(r1)
                if (r6 == 0) goto L44
                com.chartboost.sdk.impl.ic r6 = com.chartboost.sdk.impl.ic.this
                long r3 = com.chartboost.sdk.impl.ic.a(r6)
                r5.f14178c = r1
                r5.f14177b = r2
                java.lang.Object r6 = kotlinx.coroutines.DelayKt.a(r3, r5)
                if (r6 != r0) goto L38
                return r0
            L38:
                com.chartboost.sdk.impl.ic r6 = com.chartboost.sdk.impl.ic.this
                java.lang.Runnable r6 = r6.c()
                if (r6 == 0) goto L21
                r6.run()
                goto L21
            L44:
                kotlin.Unit r6 = kotlin.Unit.f43263a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.ic.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ic(Handler handler, long j, CoroutineScope scope) {
        Intrinsics.f(handler, "handler");
        Intrinsics.f(scope, "scope");
        this.f14173a = handler;
        this.f14174b = j;
        this.f14175c = scope;
    }

    public final void b() {
        Job job = this.f14176e;
        if (job != null) {
            job.a(null);
        }
    }

    public Runnable c() {
        return this.d;
    }

    @Override // com.chartboost.sdk.impl.hc
    public void cancel() {
        b();
    }

    public final void d() {
        Job job = this.f14176e;
        if (job != null) {
            job.a(null);
        }
        this.f14176e = BuildersKt.c(this.f14175c, new b(CoroutineExceptionHandler.Key.X), null, new c(null), 2);
    }

    @Override // com.chartboost.sdk.impl.hc
    public void pause() {
        b();
        Runnable runnableC = c();
        if (runnableC != null) {
            this.f14173a.post(runnableC);
        }
    }

    @Override // com.chartboost.sdk.impl.hc
    public void start() {
        a();
    }

    @Override // com.chartboost.sdk.impl.hc
    public void a() {
        d();
    }

    @Override // com.chartboost.sdk.impl.hc
    public void a(Runnable runnable) {
        this.d = runnable;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ic(Handler handler, long j, CoroutineScope coroutineScope, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        handler = (i2 & 1) != 0 ? new Handler(Looper.getMainLooper()) : handler;
        j = (i2 & 2) != 0 ? 200L : j;
        if ((i2 & 4) != 0) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            coroutineScope = CoroutineScopeKt.a(MainDispatcherLoader.f45042a.plus(SupervisorKt.b()));
        }
        this(handler, j, coroutineScope);
    }
}
