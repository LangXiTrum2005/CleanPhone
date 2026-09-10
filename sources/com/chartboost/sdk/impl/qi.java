package com.chartboost.sdk.impl;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class qi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f14965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f14966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineDispatcher f14967c;
    public final Lazy d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14968e;
    public long f;
    public Job g;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f14969b = new a();

        public a() {
            super(3, ri.class, "createRandomAccessFile", "createRandomAccessFile(Lcom/chartboost/sdk/internal/video/VideoAsset;Lcom/chartboost/sdk/internal/video/TempFileDownloadHelper;Lcom/chartboost/sdk/internal/Libraries/FileCache;)Lcom/chartboost/sdk/internal/utils/RandomAccessFileWrapper;", 1);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ne invoke(oi p0, lg p1, a8 a8Var) {
            Intrinsics.f(p0, "p0");
            Intrinsics.f(p1, "p1");
            return ri.b(p0, p1, a8Var);
        }
    }

    public interface b {
        void d();
    }

    public static final class c extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14970b;

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
            return qi.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f14970b;
            if (i2 == 0) {
                ResultKt.b(obj);
                this.f14970b = 1;
                if (DelayKt.a(1500L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            qi.this.b();
            return Unit.f43263a;
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function3 f14972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ oi f14973c;
        public final /* synthetic */ lg d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ a8 f14974e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function3 function3, oi oiVar, lg lgVar, a8 a8Var) {
            super(0);
            this.f14972b = function3;
            this.f14973c = oiVar;
            this.d = lgVar;
            this.f14974e = a8Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ne invoke() {
            return (ne) this.f14972b.invoke(this.f14973c, this.d, this.f14974e);
        }
    }

    public qi(oi videoAsset, b listener, float f, lg tempHelper, a8 a8Var, CoroutineDispatcher coroutineDispatcher, Function3 randomAccessFileFactory) {
        Intrinsics.f(videoAsset, "videoAsset");
        Intrinsics.f(listener, "listener");
        Intrinsics.f(tempHelper, "tempHelper");
        Intrinsics.f(coroutineDispatcher, "coroutineDispatcher");
        Intrinsics.f(randomAccessFileFactory, "randomAccessFileFactory");
        this.f14965a = listener;
        this.f14966b = f;
        this.f14967c = coroutineDispatcher;
        this.d = LazyKt.b(new d(randomAccessFileFactory, videoAsset, tempHelper, a8Var));
        this.f14968e = videoAsset.c();
    }

    public final void b() {
        ne neVarD = d();
        long jC = neVarD != null ? neVarD.c() : 0L;
        long j = this.f14968e;
        if (jC == j) {
            f();
        } else if ((jC - this.f) / j > this.f14966b) {
            f();
        } else {
            c();
        }
    }

    public final void c() {
        this.g = BuildersKt.c(CoroutineScopeKt.a(this.f14967c), null, null, new c(null), 3);
    }

    public final ne d() {
        return (ne) this.d.getX();
    }

    public final void e() {
        Job job = this.g;
        if (job != null) {
            job.a(null);
        }
        this.g = null;
    }

    public final void f() {
        this.f = 0L;
        e();
        this.f14965a.d();
    }

    public final void a() {
        if (this.f == 0) {
            ne neVarD = d();
            this.f = neVarD != null ? neVarD.c() : 0L;
        }
    }

    public final void a(int i2) {
        long j = this.f14968e;
        if (j <= 0 || i2 <= 0) {
            return;
        }
        float f = j / 1000000.0f;
        this.f14966b = ((f / 1000.0f) / ((i2 / 60000.0f) * 0.0075f)) / (f * 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public qi(oi oiVar, b bVar, float f, lg lgVar, a8 a8Var, CoroutineDispatcher coroutineDispatcher, Function3 function3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        float f2 = (i2 & 4) != 0 ? 0.01f : f;
        lg lgVar2 = (i2 & 8) != 0 ? new lg() : lgVar;
        if ((i2 & 32) != 0) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            coroutineDispatcher = MainDispatcherLoader.f45042a;
        }
        this(oiVar, bVar, f2, lgVar2, a8Var, coroutineDispatcher, (i2 & 64) != 0 ? a.f14969b : function3);
    }
}
