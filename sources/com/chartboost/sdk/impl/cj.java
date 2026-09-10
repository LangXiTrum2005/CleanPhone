package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import androidx.media3.common.PlaybackException;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.events.ChartboostError;
import com.thinkup.core.common.n.mo;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class cj extends f2 implements nj, wi {
    public static final a D = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final CoroutineScope f13623A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public he f13624B;
    public CancellableContinuation C;
    public final Context o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final URL f13625p;
    public final l6 q;
    public final vi r;
    public final Set s;
    public final jj t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Set f13626u;
    public final rd v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public oj f13627w;
    public final Lazy x;
    public final Lazy y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final CoroutineExceptionHandler f13628z;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        public final void a() {
            yh.f15659a.a(ki.g.f14375b, cj.this.a("firstQuartile"), cj.this.A(), cj.this.B(), cj.this.z());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        public final void a() {
            yh.f15659a.a(ki.i.f14377b, cj.this.a("midpoint"), cj.this.A(), cj.this.B(), cj.this.z());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        public final void a() {
            yh.f15659a.a(ki.n.f14382b, cj.this.a("thirdQuartile"), cj.this.A(), cj.this.B(), cj.this.z());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class e extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ie f13632b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ dh f13633c;
        public final /* synthetic */ cj d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ie ieVar, dh dhVar, cj cjVar) {
            super(0);
            this.f13632b = ieVar;
            this.f13633c = dhVar;
            this.d = cjVar;
        }

        public final void a() {
            ie ieVar = this.f13632b;
            if (ieVar instanceof ie.b) {
                yh.f15659a.a(new ki.k((int) (((ie.b) ieVar).a() / ((long) 1000))), this.f13633c, this.d.A(), this.d.B(), this.d.z());
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class f extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f13634b = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p2 invoke() {
            return w3.f15454b.a().p();
        }
    }

    public static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f13635b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f13636c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f13637e;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f13636c = obj;
            this.f13637e |= Integer.MIN_VALUE;
            Object objA = cj.this.a((Context) null, this);
            return objA == CoroutineSingletons.X ? objA : new Result(objA);
        }
    }

    public static final class h extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13638b;

        public h(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return cj.this.new h(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA;
            String lowerCase;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.f13638b;
            if (i2 == 0) {
                ResultKt.b(obj);
                vi viVar = cj.this.r;
                Context contextA = cj.this.A();
                URL urlC = cj.this.C();
                l6 l6Var = cj.this.q;
                this.f13638b = 1;
                objA = viVar.a(contextA, urlC, l6Var, this);
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
            if (objA instanceof Result.Failure) {
                Throwable thA = Result.a(objA);
                if (thA == null) {
                    thA = new IOException("Unknown player load initiation error.");
                }
                if (thA instanceof IOException) {
                    String message = thA.getMessage();
                    if (message != null) {
                        lowerCase = message.toLowerCase(Locale.ROOT);
                        Intrinsics.e(lowerCase, "toLowerCase(...)");
                    } else {
                        lowerCase = "";
                    }
                    thA = (StringsKt.l(lowerCase, "no space left", false) || StringsKt.l(lowerCase, "insufficient storage", false) || StringsKt.l(lowerCase, "disk full", false)) ? ChartboostError.Load.NoStorage.INSTANCE : (Exception) thA;
                }
                za.b("VideoRenderable: videoPlayer.load() returned immediate failure for " + cj.this.C() + mo.ono, thA);
                cj.this.a(thA);
            }
            return Unit.f43263a;
        }
    }

    public static final class i extends Lambda implements Function1 {

        public static final class a extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f13641b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ cj f13642c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(cj cjVar, Continuation continuation) {
                super(2, continuation);
                this.f13642c = cjVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f13642c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                if (this.f13641b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                this.f13642c.r.a(fg.FAILURE);
                return Unit.f43263a;
            }
        }

        public i() {
            super(1);
        }

        public final void a(Throwable th) {
            za.e("VideoRenderable: Load operation cancelled for " + cj.this.C() + mo.ono, null, 2, null);
            BuildersKt.c(cj.this.f13623A, NonCancellable.X, null, new a(cj.this, null), 2);
            cj.this.C = null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.f43263a;
        }
    }

    public static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13643b;

        public j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return cj.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f13643b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            cj.this.r.setVolume(0.0f);
            oj ojVarB = cj.this.b();
            if (ojVarB != null) {
                ojVarB.a(0.0f);
            }
            return Unit.f43263a;
        }
    }

    public static final class k extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13645b;

        public k(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return cj.this.new k(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f13645b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            cj.this.r.release();
            return Unit.f43263a;
        }
    }

    public static final class l extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final l f13647b = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final id invoke() {
            return w3.f15454b.j().a();
        }
    }

    public static final class m extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13648b;

        public m(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return cj.this.new m(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f13648b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            cj.this.r.pause();
            yh yhVar = yh.f15659a;
            ki.j jVar = ki.j.f14378b;
            for (Object obj2 : cj.this.s) {
                if (Intrinsics.a(((dh) obj2).a(), "pause")) {
                    yhVar.a(jVar, (dh) obj2, cj.this.A(), cj.this.B(), cj.this.z());
                    return Unit.f43263a;
                }
            }
            obj2 = null;
            yhVar.a(jVar, (dh) obj2, cj.this.A(), cj.this.B(), cj.this.z());
            return Unit.f43263a;
        }
    }

    public static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13650b;

        public n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return cj.this.new n(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f13650b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            cj.this.r.play();
            yh yhVar = yh.f15659a;
            ki.l lVar = ki.l.f14380b;
            for (Object obj2 : cj.this.s) {
                if (Intrinsics.a(((dh) obj2).a(), "resume")) {
                    yhVar.a(lVar, (dh) obj2, cj.this.A(), cj.this.B(), cj.this.z());
                    return Unit.f43263a;
                }
            }
            obj2 = null;
            yhVar.a(lVar, (dh) obj2, cj.this.A(), cj.this.B(), cj.this.z());
            return Unit.f43263a;
        }
    }

    public static final class o extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ cj f13652b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(CoroutineExceptionHandler.Key key, cj cjVar) {
            super(key);
            this.f13652b = cjVar;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            za.b("Failed to perform video operation", th);
            ChartboostError.Load unknown = th instanceof ChartboostError.Load ? (ChartboostError.Load) th : new ChartboostError.Load.Unknown(th.getMessage(), th);
            CancellableContinuation cancellableContinuation = this.f13652b.C;
            if (cancellableContinuation != null) {
                if (!cancellableContinuation.isActive()) {
                    cancellableContinuation = null;
                }
                if (cancellableContinuation != null) {
                    cancellableContinuation.resumeWith(ResultKt.a(unknown));
                }
            }
            this.f13652b.C = null;
            xe xeVarI = this.f13652b.i();
            if (xeVarI != null) {
                xeVarI.b(unknown);
            }
        }
    }

    public static final class p extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13653b;

        public static final class a implements vd {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ cj f13655a;

            public a(cj cjVar) {
                this.f13655a = cjVar;
            }

            @Override // com.chartboost.sdk.impl.vd
            public long a() {
                return this.f13655a.r.a();
            }

            @Override // com.chartboost.sdk.impl.vd
            public long b() {
                return this.f13655a.r.b();
            }
        }

        public p(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return cj.this.new p(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object next;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f13653b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            oj ojVarB = cj.this.b();
            if (ojVarB != null) {
                ojVarB.b();
            }
            cj.this.r.play();
            Map mapJ = MapsKt.j(new Pair("duration", new Float(cj.this.r.a() / 1000.0f)), new Pair("volume", new Float(cj.this.r.getVolume())));
            yh yhVar = yh.f15659a;
            yhVar.a(ki.m.f14381b, cj.this.a("start", mapJ), cj.this.A(), cj.this.B(), cj.this.z());
            ki.e eVar = ki.e.f14373b;
            Iterator it = cj.this.s.iterator();
            do {
                obj2 = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.a(((dh) next).a(), "creativeView"));
            yhVar.a(eVar, (dh) next, cj.this.A(), cj.this.B(), cj.this.z());
            yh yhVar2 = yh.f15659a;
            ki.h hVar = ki.h.f14376b;
            for (Object obj3 : cj.this.s) {
                if (Intrinsics.a(((dh) obj3).a(), "impression")) {
                    obj2 = obj3;
                    break;
                }
            }
            yhVar2.a(hVar, (dh) obj2, cj.this.A(), cj.this.B(), cj.this.z());
            List listY = cj.this.y();
            cj cjVar = cj.this;
            he heVar = new he(new a(cjVar), listY, 50L, cj.this.f13623A);
            heVar.a();
            cjVar.f13624B = heVar;
            cj.super.x();
            return Unit.f43263a;
        }
    }

    public static final class q extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13656b;
        public final /* synthetic */ fg d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(fg fgVar, Continuation continuation) {
            super(2, continuation);
            this.d = fgVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return cj.this.new q(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object next;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f13656b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            oj ojVarB = cj.this.b();
            if (ojVarB != null) {
                ojVarB.a();
            }
            he heVar = cj.this.f13624B;
            if (heVar != null) {
                heVar.b();
            }
            Object obj2 = null;
            cj.this.f13624B = null;
            cj.this.r.a(this.d);
            yh yhVar = yh.f15659a;
            ki.c cVar = ki.c.f14371b;
            Iterator it = cj.this.s.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.a(((dh) next).a(), "closeLinear"));
            yhVar.a(cVar, (dh) next, cj.this.A(), cj.this.B(), cj.this.z());
            yh yhVar2 = yh.f15659a;
            ki.b bVar = ki.b.f14370b;
            for (Object obj3 : cj.this.s) {
                if (Intrinsics.a(((dh) obj3).a(), "close")) {
                    obj2 = obj3;
                    break;
                }
            }
            yhVar2.a(bVar, (dh) obj2, cj.this.A(), cj.this.B(), cj.this.z());
            xe xeVarI = cj.this.i();
            if (xeVarI != null) {
                xeVarI.a(rd.ENABLE_ORIENTATION_CHANGE);
            }
            return Unit.f43263a;
        }
    }

    public static final class r extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13658b;
        public final /* synthetic */ float d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(float f, Continuation continuation) {
            super(2, continuation);
            this.d = f;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return cj.this.new r(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.f13658b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            cj.this.r.setVolume(this.d);
            oj ojVarB = cj.this.b();
            if (ojVarB != null) {
                ojVarB.a(1.0f);
            }
            return Unit.f43263a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj(Context context, URL videoUrl, ue renderableConfig, w adMarkupConfig, l6 downloaderCache, vi videoPlayer, Set trackingEvents, vg trackerComponent, jg telemetryManager, jj viewabilityComponent, Set set, com.chartboost.sdk.impl.r adFormat, Mediation mediation, rd videoOrientation) {
        super(renderableConfig, adMarkupConfig, trackerComponent, telemetryManager, adFormat, mediation);
        Intrinsics.f(context, "context");
        Intrinsics.f(videoUrl, "videoUrl");
        Intrinsics.f(renderableConfig, "renderableConfig");
        Intrinsics.f(adMarkupConfig, "adMarkupConfig");
        Intrinsics.f(downloaderCache, "downloaderCache");
        Intrinsics.f(videoPlayer, "videoPlayer");
        Intrinsics.f(trackingEvents, "trackingEvents");
        Intrinsics.f(trackerComponent, "trackerComponent");
        Intrinsics.f(telemetryManager, "telemetryManager");
        Intrinsics.f(viewabilityComponent, "viewabilityComponent");
        Intrinsics.f(adFormat, "adFormat");
        Intrinsics.f(videoOrientation, "videoOrientation");
        this.o = context;
        this.f13625p = videoUrl;
        this.q = downloaderCache;
        this.r = videoPlayer;
        this.s = trackingEvents;
        this.t = viewabilityComponent;
        this.f13626u = set;
        this.v = videoOrientation;
        this.x = LazyKt.b(l.f13647b);
        this.y = LazyKt.b(f.f13634b);
        o oVar = new o(CoroutineExceptionHandler.Key.X, this);
        this.f13628z = oVar;
        Job jobB = SupervisorKt.b();
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        this.f13623A = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.d((JobSupport) jobB, MainDispatcherLoader.f45042a).plus(oVar));
        videoPlayer.a(this);
    }

    public final Context A() {
        return this.o;
    }

    public final id B() {
        return (id) this.x.getX();
    }

    public final URL C() {
        return this.f13625p;
    }

    @Override // com.chartboost.sdk.impl.te
    public View k() throws ei {
        View viewA = this.r.a(this.o);
        if (viewA != null) {
            if (b() == null) {
                a(viewA);
            }
            return viewA;
        }
        za.e("VideoRenderable.nextAd(): getPlayerView returned null for " + this.f13625p, null, 2, null);
        return viewA;
    }

    @Override // com.chartboost.sdk.impl.te
    public void l() {
        xe xeVarI = i();
        if (xeVarI != null) {
            xeVarI.a(this.v);
        }
    }

    @Override // com.chartboost.sdk.impl.te
    public void m() {
        BuildersKt.c(this.f13623A, null, null, new m(null), 3);
    }

    @Override // com.chartboost.sdk.impl.te
    public void n() {
        BuildersKt.c(this.f13623A, null, null, new n(null), 3);
    }

    @Override // com.chartboost.sdk.impl.f2
    public void x() {
        if (this.r.a(this.o) != null) {
            BuildersKt.c(this.f13623A, null, null, new p(null), 3);
            return;
        }
        ChartboostError.Show.Unknown unknown = new ChartboostError.Show.Unknown("Player view not available for " + this.f13625p, null);
        za.b("VideoRenderable: Cannot start, player view is null for " + this.f13625p + mo.ono, (Throwable) null, 2, (Object) null);
        xe xeVarI = i();
        if (xeVarI != null) {
            xeVarI.b(unknown);
        }
    }

    public final List y() {
        ie ieVarB;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ge(new ie.a(0.25d), new b()));
        arrayList.add(new ge(new ie.a(0.5d), new c()));
        arrayList.add(new ge(new ie.a(0.75d), new d()));
        Set set = this.s;
        ArrayList<dh> arrayList2 = new ArrayList();
        for (Object obj : set) {
            dh dhVar = (dh) obj;
            if (Intrinsics.a(dhVar.a(), "progress") && dhVar.d() != null) {
                arrayList2.add(obj);
            }
        }
        for (dh dhVar2 : arrayList2) {
            String strD = dhVar2.d();
            if (strD != null && (ieVarB = b(strD)) != null) {
                arrayList.add(new ge(ieVarB, new e(ieVarB, dhVar2, this)));
            }
        }
        return arrayList;
    }

    public final p2 z() {
        return (p2) this.y.getX();
    }

    @Override // com.chartboost.sdk.impl.nj
    public oj b() {
        return this.f13627w;
    }

    public final int c(PlaybackException playbackException) {
        int i2 = playbackException.X;
        switch (i2) {
            case 1000:
            case 1001:
            case 1004:
                return com.smartdigimkt.o1.b.z1;
            case 1002:
                return 400;
            case 1003:
                return TTAdConstant.AD_ID_IS_NULL_CODE;
            default:
                switch (i2) {
                    case 2000:
                    case 2007:
                    case 2008:
                        return 400;
                    case 2001:
                    case 2002:
                        return TTAdConstant.AD_ID_IS_NULL_CODE;
                    case 2003:
                        return 405;
                    case 2004:
                    case 2005:
                    case 2006:
                        return 401;
                    default:
                        switch (i2) {
                            case 3001:
                            case 3002:
                            case 3003:
                            case 3004:
                                return 405;
                            default:
                                switch (i2) {
                                    case 4001:
                                    case 4002:
                                    case 4003:
                                    case 4004:
                                    case 4005:
                                        return 405;
                                    default:
                                        return com.smartdigimkt.o1.b.z1;
                                }
                        }
                }
        }
    }

    @Override // com.chartboost.sdk.impl.wi
    public void d() {
        String str = "VideoRenderable: Video asset for " + this.f13625p + " was invalidated (e.g., evicted).";
        za.b(str, (Throwable) null, 2, (Object) null);
        ChartboostError.Load.AssetUnavailable assetUnavailable = new ChartboostError.Load.AssetUnavailable(this.f13625p.toString(), str, new IOException(str));
        CancellableContinuation cancellableContinuation = this.C;
        if (cancellableContinuation != null) {
            if (!cancellableContinuation.isActive()) {
                cancellableContinuation = null;
            }
            if (cancellableContinuation != null) {
                cancellableContinuation.resumeWith(ResultKt.a(assetUnavailable));
            }
        }
        this.C = null;
        xe xeVarI = i();
        if (xeVarI != null) {
            xeVarI.b(assetUnavailable);
        }
        BuildersKt.c(this.f13623A, NonCancellable.X, null, new k(null), 2);
    }

    @Override // com.chartboost.sdk.impl.wi
    public void e() {
        za.a("VideoRenderable: Received onVideoReady for " + this.f13625p, (Throwable) null, 2, (Object) null);
        CancellableContinuation cancellableContinuation = this.C;
        if (cancellableContinuation != null) {
            if (!cancellableContinuation.isActive()) {
                cancellableContinuation = null;
            }
            if (cancellableContinuation != null) {
                cancellableContinuation.resumeWith(new Result(Unit.f43263a));
            }
        }
        this.C = null;
    }

    @Override // com.chartboost.sdk.impl.te
    public long g() {
        return this.r.a() / ((long) 1000);
    }

    @Override // com.chartboost.sdk.impl.te
    public float j() {
        float volume = this.r.getVolume();
        super.j();
        BuildersKt.c(this.f13623A, null, null, new j(null), 3);
        return volume;
    }

    public final ChartboostError.Render b(PlaybackException playbackException) {
        switch (playbackException.X) {
            case 2000:
            case 2001:
            case 2002:
            case 2004:
            case 2005:
            case 2007:
            case 2008:
                return new ChartboostError.Render.AssetUnavailable(this.f13625p.toString(), "Playback error: ".concat(playbackException.d()), playbackException);
            case 2003:
            case 2006:
            default:
                return new ChartboostError.Render.VideoPlaybackError("Playback error: ".concat(playbackException.d()), playbackException);
        }
    }

    @Override // com.chartboost.sdk.impl.wi
    public void c() {
        Object obj = null;
        za.a("VideoRenderable: Received onVideoCompleted for " + this.f13625p, (Throwable) null, 2, (Object) null);
        yh yhVar = yh.f15659a;
        ki.d dVar = ki.d.f14372b;
        for (Object obj2 : this.s) {
            if (Intrinsics.a(((dh) obj2).a(), "complete")) {
                obj = obj2;
                break;
            }
        }
        yhVar.a(dVar, (dh) obj, this.o, B(), z());
        xe xeVarI = i();
        if (xeVarI != null) {
            xeVarI.a();
        }
    }

    public final void a(View view) throws ei {
        Set set;
        yh yhVar = yh.f15659a;
        yhVar.a((rj) null);
        try {
            kj kjVarB = this.t.b();
            if (kjVarB.b() && (set = this.f13626u) != null && !set.isEmpty()) {
                rj rjVarA = this.t.a().a(kjVarB, view, set);
                yhVar.a(rjVarA);
                this.f13627w = rjVarA;
            }
        } catch (Exception e2) {
            throw new ei(android.support.v4.media.a.C("Failed to execute/initialize AdVerification unit: ", e2.getMessage()), 410);
        }
    }

    public final ie b(String str) {
        try {
            if (StringsKt.p(str, "%", false)) {
                Double dW = StringsKt.W(StringsKt.E(str, "%"));
                if (dW != null) {
                    return new ie.a(dW.doubleValue() / 100.0d);
                }
            } else if (new Regex("\\d+s").b(str)) {
                Long lZ = StringsKt.Z(StringsKt.E(str, "s"));
                if (lZ != null) {
                    return new ie.b(lZ.longValue() * ((long) 1000));
                }
            } else {
                if (new Regex("\\d{1,2}:\\d{1,2}:\\d{1,2}(\\.\\d+)?").b(str)) {
                    List listJ = StringsKt.J(str, 0, 6, new String[]{":"});
                    Long lZ2 = StringsKt.Z((String) listJ.get(0));
                    long jLongValue = lZ2 != null ? lZ2.longValue() : 0L;
                    Long lZ3 = StringsKt.Z((String) listJ.get(1));
                    long jLongValue2 = lZ3 != null ? lZ3.longValue() : 0L;
                    Double dW2 = StringsKt.W((String) listJ.get(2));
                    if (dW2 != null) {
                        return new ie.b((long) (((jLongValue2 * ((long) 60)) + (jLongValue * ((long) com.smartdigimkt.o1.b.l2)) + dW2.doubleValue()) * ((double) 1000)));
                    }
                    za.e(com.ironsource.d9.i.d + new ChartboostError.Load.InvalidAdm("Invalid time format in VAST offset: " + str + ". Seconds part could not be parsed.", null).getCode() + "] Failed to parse time offset seconds: " + listJ.get(2) + " in offset: " + str, null, 2, null);
                    return null;
                }
                za.d("Unrecognized offset format: ".concat(str), null, 2, null);
                return null;
            }
        } catch (Exception e2) {
            ChartboostError.Load.InvalidAdm invalidAdm = new ChartboostError.Load.InvalidAdm(android.support.v4.media.a.o("Failed to parse VAST offset string: ", str, ". ", e2.getMessage()), e2);
            za.e(com.ironsource.d9.i.d + invalidAdm.getCode() + "] Exception parsing offset string: " + str, invalidAdm);
        }
        return null;
    }

    public final dh a(String str) {
        Object next;
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.a(((dh) next).a(), str)) {
                return (dh) next;
            }
        }
        next = null;
        return (dh) next;
    }

    public final dh a(String str, Map map) {
        Object next;
        Map map2;
        Iterator it = this.s.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.a(((dh) next).a(), str));
        dh dhVar = (dh) next;
        if (dhVar != null) {
            dh dhVarA = dh.a(dhVar, null, null, 0, null, map, 15, null);
            map2 = map;
            if (dhVarA != null) {
                return dhVarA;
            }
        } else {
            map2 = map;
        }
        return new dh(str, null, 0, null, map2, 8, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.chartboost.sdk.impl.te
    public Object a(Context context, Continuation continuation) throws Throwable {
        g gVar;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i2 = gVar.f13637e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.f13637e = i2 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object objP = gVar.f13636c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = gVar.f13637e;
        if (i3 == 0) {
            ResultKt.b(objP);
            gVar.f13635b = this;
            gVar.f13637e = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(gVar));
            cancellableContinuationImpl.q();
            this.C = cancellableContinuationImpl;
            za.a("VideoRenderable: Initiating load for " + C(), (Throwable) null, 2, (Object) null);
            BuildersKt.c(this.f13623A, null, null, new h(null), 3);
            cancellableContinuationImpl.s(new i());
            objP = cancellableContinuationImpl.p();
            if (objP == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objP);
        }
        return ((Result) objP).X;
    }

    public final ChartboostError.Load a(PlaybackException playbackException) {
        switch (playbackException.X) {
            case 4001:
            case 4002:
            case 4003:
            case 4004:
            case 4005:
                return new ChartboostError.Load.UnsupportedCodec("Playback error: ".concat(playbackException.d()), playbackException);
            default:
                return new ChartboostError.Load.AssetUnavailable(this.f13625p.toString(), "Playback error: ".concat(playbackException.d()), playbackException);
        }
    }

    @Override // com.chartboost.sdk.impl.wi
    public void a(Throwable error) {
        Throwable unknown;
        Intrinsics.f(error, "error");
        za.b("onVideoError() fired for " + this.f13625p, error);
        Throwable cause = error.getCause();
        ChartboostError chartboostError = cause instanceof ChartboostError ? (ChartboostError) cause : null;
        if (chartboostError == null) {
            chartboostError = error instanceof ChartboostError ? (ChartboostError) error : null;
        }
        CancellableContinuation cancellableContinuation = this.C;
        if (cancellableContinuation != null && cancellableContinuation.isActive()) {
            unknown = chartboostError instanceof ChartboostError.Load ? (ChartboostError.Load) chartboostError : null;
            if (unknown == null) {
                if (error instanceof PlaybackException) {
                    unknown = a((PlaybackException) error);
                } else if (error instanceof IOException) {
                    unknown = new ChartboostError.Load.AssetUnavailable(this.f13625p.toString(), android.support.v4.media.a.C("Asset unavailable: ", error.getMessage()), error);
                } else {
                    unknown = new ChartboostError.Load.Unknown(android.support.v4.media.a.C("An unknown video error occurred: ", error.getMessage()), error);
                }
            }
        } else {
            unknown = chartboostError instanceof ChartboostError.Render ? (ChartboostError.Render) chartboostError : null;
            if (unknown == null) {
                if (error instanceof PlaybackException) {
                    unknown = b((PlaybackException) error);
                } else if (error instanceof IOException) {
                    unknown = new ChartboostError.Render.AssetUnavailable(this.f13625p.toString(), android.support.v4.media.a.C("Asset unavailable: ", error.getMessage()), error);
                } else {
                    unknown = new ChartboostError.Render.Unknown(android.support.v4.media.a.C("An unknown video error occurred: ", error.getMessage()), error);
                }
            }
        }
        if (unknown instanceof ChartboostError.Load) {
            CancellableContinuation cancellableContinuation2 = this.C;
            if (cancellableContinuation2 != null) {
                if (!cancellableContinuation2.isActive()) {
                    cancellableContinuation2 = null;
                }
                if (cancellableContinuation2 != null) {
                    cancellableContinuation2.resumeWith(ResultKt.a(unknown));
                }
            }
            this.C = null;
        } else if (unknown instanceof ChartboostError.Render) {
            a((ChartboostError.Render) unknown);
        }
        yh.f15659a.a(ki.f.f14374b, a("error", MapsKt.i(new Pair("VAST_ERROR_CODE", Integer.valueOf(error instanceof PlaybackException ? c((PlaybackException) error) : com.smartdigimkt.o1.b.z1)))), this.o, B(), z());
    }

    @Override // com.chartboost.sdk.impl.te
    public void a(fg reason) {
        Intrinsics.f(reason, "reason");
        za.a("Stopping video (" + this.f13625p + ") with reason: " + reason, (Throwable) null, 2, (Object) null);
        BuildersKt.c(this.f13623A, NonCancellable.X, null, new q(reason, null), 2);
    }

    @Override // com.chartboost.sdk.impl.te
    public void a(boolean z2) {
        yh yhVar = yh.f15659a;
        ki.a aVar = ki.a.f14369b;
        for (Object obj : this.s) {
            if (Intrinsics.a(((dh) obj).a(), "click")) {
                yhVar.a(aVar, (dh) obj, this.o, B(), z());
            }
        }
        obj = null;
        yhVar.a(aVar, (dh) obj, this.o, B(), z());
    }

    @Override // com.chartboost.sdk.impl.te
    public void a(float f2) {
        super.a(f2);
        if (f2 <= 0.0f) {
            f2 = 1.0f;
        }
        BuildersKt.c(this.f13623A, null, null, new r(f2, null), 3);
    }
}
