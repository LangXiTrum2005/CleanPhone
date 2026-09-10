package com.chartboost.sdk.impl;

import androidx.media3.exoplayer.ExoPlayer;
import com.chartboost.sdk.events.ChartboostError;
import java.net.URL;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class g7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f7 f13986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f13987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wd f13988c;
    public Job d;

    public static final class a extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13989b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f13990c;
        public final /* synthetic */ l6 d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ URL f13991e;
        public final /* synthetic */ g7 f;
        public final /* synthetic */ ExoPlayer g;

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.g7$a$a, reason: collision with other inner class name */
        public static final class C0166a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ URL f13992a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g7 f13993b;

            public C0166a(URL url, g7 g7Var) {
                this.f13992a = url;
                this.f13993b = g7Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(k3 k3Var, Continuation continuation) {
                if (k3Var instanceof k3.a) {
                    k3.a aVar = (k3.a) k3Var;
                    if (Intrinsics.a(this.f13992a, aVar.b())) {
                        za.e("Cache eviction detected for " + this.f13992a + ". Reason: " + aVar.a(), null, 2, null);
                        this.f13993b.a(ud.c.f15276a);
                    }
                }
                return Unit.f43263a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l6 l6Var, URL url, g7 g7Var, ExoPlayer exoPlayer, Continuation continuation) {
            super(2, continuation);
            this.d = l6Var;
            this.f13991e = url;
            this.f = g7Var;
            this.g = exoPlayer;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.d, this.f13991e, this.f, this.g, continuation);
            aVar.f13990c = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
        
            if (r9.collect(r1, r8) == r0) goto L37;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 294
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.g7.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public g7(f7 actionConsumer, CoroutineScope coroutineScope) {
        Intrinsics.f(actionConsumer, "actionConsumer");
        Intrinsics.f(coroutineScope, "coroutineScope");
        this.f13986a = actionConsumer;
        this.f13987b = coroutineScope;
        this.f13988c = wd.b.f15476a;
    }

    public final wd b() {
        return this.f13988c;
    }

    public final long c() {
        ExoPlayer exoPlayerA = this.f13988c.a();
        if (exoPlayerA == null) {
            return 0L;
        }
        long duration = exoPlayerA.getDuration();
        if (duration < 0) {
            return 0L;
        }
        return duration;
    }

    public final void d() {
        Job job = this.d;
        if (job != null) {
            job.a(null);
        }
        this.d = null;
    }

    public final long a() {
        ExoPlayer exoPlayerA = this.f13988c.a();
        if (exoPlayerA == null) {
            return 0L;
        }
        long currentPosition = exoPlayerA.getCurrentPosition();
        if (currentPosition < 0) {
            return 0L;
        }
        return currentPosition;
    }

    public final void a(ud event) {
        Intrinsics.f(event, "event");
        wd wdVar = this.f13988c;
        wd wdVarA = a(wdVar, event);
        this.f13988c = wdVarA;
        Class<?> cls = wdVar.getClass();
        ReflectionFactory reflectionFactory = Reflection.f43333a;
        String strL = reflectionFactory.b(cls).l();
        String strL2 = reflectionFactory.b(wdVarA.getClass()).l();
        String strL3 = reflectionFactory.b(event.getClass()).l();
        StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("State Transition: ", strL, " -> ", strL2, " on Event ");
        sbQ.append(strL3);
        za.a(sbQ.toString(), (Throwable) null, 2, (Object) null);
    }

    public final void a(URL url, l6 l6Var, ExoPlayer exoPlayer) {
        d();
        this.d = BuildersKt.c(this.f13987b, null, null, new a(l6Var, url, this, exoPlayer, null), 3);
    }

    public final wd a(wd wdVar, ud udVar) {
        if (wdVar instanceof wd.b) {
            if (!(udVar instanceof ud.a)) {
                return udVar instanceof ud.i ? wd.g.f15485a : wdVar;
            }
            ud.a aVar = (ud.a) udVar;
            ExoPlayer exoPlayerB = this.f13986a.b(aVar.b());
            a(aVar.c(), aVar.a(), exoPlayerB);
            return new wd.c(aVar.c(), exoPlayerB);
        }
        if (wdVar instanceof wd.c) {
            if (udVar instanceof ud.b) {
                ud.b bVar = (ud.b) udVar;
                this.f13986a.a(bVar.b(), bVar.a());
                return wdVar;
            }
            if (udVar instanceof ud.f) {
                this.f13986a.e();
                return new wd.f(((wd.c) wdVar).b(), ((ud.f) udVar).a());
            }
            if (udVar instanceof ud.e) {
                ud.e eVar = (ud.e) udVar;
                this.f13986a.a(eVar.a());
                return new wd.a(eVar.a());
            }
            if (udVar instanceof ud.c) {
                wd.c cVar = (wd.c) wdVar;
                ChartboostError.Load.AssetUnavailable assetUnavailable = new ChartboostError.Load.AssetUnavailable(cVar.b().toString(), "Video asset for " + cVar.b() + " was evicted during load.", null);
                this.f13986a.a(assetUnavailable);
                return new wd.a(assetUnavailable);
            }
            if (!(udVar instanceof ud.i)) {
                return wdVar;
            }
            this.f13986a.f();
            d();
            return wd.g.f15485a;
        }
        if (wdVar instanceof wd.f) {
            if (udVar instanceof ud.h) {
                wd.f fVar = (wd.f) wdVar;
                this.f13986a.b(fVar.a());
                return new wd.e(fVar.b(), fVar.a());
            }
            if (udVar instanceof ud.j) {
                this.f13986a.a(((wd.f) wdVar).a(), ((ud.j) udVar).a());
                return wdVar;
            }
            if (udVar instanceof ud.k) {
                wd.f fVar2 = (wd.f) wdVar;
                this.f13986a.d(fVar2.a());
                return new wd.h(fVar2.b(), fVar2.a());
            }
            if (udVar instanceof ud.i) {
                this.f13986a.f();
                d();
                return wd.g.f15485a;
            }
            if (udVar instanceof ud.e) {
                ud.e eVar2 = (ud.e) udVar;
                this.f13986a.a(eVar2.a());
                return new wd.a(eVar2.a());
            }
            if (!(udVar instanceof ud.c)) {
                return wdVar;
            }
            ChartboostError.Show.AdInvalidated adInvalidated = ChartboostError.Show.AdInvalidated.INSTANCE;
            this.f13986a.a(adInvalidated);
            return new wd.a(adInvalidated);
        }
        if (wdVar instanceof wd.e) {
            if (udVar instanceof ud.g) {
                wd.e eVar3 = (wd.e) wdVar;
                this.f13986a.a(eVar3.a());
                return new wd.d(eVar3.b(), eVar3.a());
            }
            if (udVar instanceof ud.d) {
                this.f13986a.d();
                wd.e eVar4 = (wd.e) wdVar;
                return new wd.f(eVar4.b(), eVar4.a());
            }
            if (udVar instanceof ud.k) {
                wd.e eVar5 = (wd.e) wdVar;
                this.f13986a.d(eVar5.a());
                return new wd.h(eVar5.b(), eVar5.a());
            }
            if (udVar instanceof ud.j) {
                this.f13986a.a(((wd.e) wdVar).a(), ((ud.j) udVar).a());
                return wdVar;
            }
            if (udVar instanceof ud.i) {
                this.f13986a.f();
                d();
                return wd.g.f15485a;
            }
            if (udVar instanceof ud.e) {
                ud.e eVar6 = (ud.e) udVar;
                this.f13986a.a(eVar6.a());
                return new wd.a(eVar6.a());
            }
            if (!(udVar instanceof ud.c)) {
                return wdVar;
            }
            ChartboostError.Show.AdInvalidated adInvalidated2 = ChartboostError.Show.AdInvalidated.INSTANCE;
            this.f13986a.a(adInvalidated2);
            return new wd.a(adInvalidated2);
        }
        if (wdVar instanceof wd.d) {
            if (udVar instanceof ud.h) {
                wd.d dVar = (wd.d) wdVar;
                this.f13986a.b(dVar.a());
                return new wd.e(dVar.b(), dVar.a());
            }
            if (udVar instanceof ud.k) {
                wd.d dVar2 = (wd.d) wdVar;
                this.f13986a.d(dVar2.a());
                return new wd.h(dVar2.b(), dVar2.a());
            }
            if (udVar instanceof ud.j) {
                this.f13986a.a(((wd.d) wdVar).a(), ((ud.j) udVar).a());
                return wdVar;
            }
            if (udVar instanceof ud.i) {
                this.f13986a.f();
                d();
                return wd.g.f15485a;
            }
            if (udVar instanceof ud.e) {
                ud.e eVar7 = (ud.e) udVar;
                this.f13986a.a(eVar7.a());
                return new wd.a(eVar7.a());
            }
            if (!(udVar instanceof ud.c)) {
                return wdVar;
            }
            ChartboostError.Show.AdInvalidated adInvalidated3 = ChartboostError.Show.AdInvalidated.INSTANCE;
            this.f13986a.a(adInvalidated3);
            return new wd.a(adInvalidated3);
        }
        if (wdVar instanceof wd.h) {
            if (udVar instanceof ud.h) {
                wd.h hVar = (wd.h) wdVar;
                this.f13986a.c(hVar.a());
                this.f13986a.b(hVar.a());
                return new wd.e(hVar.b(), hVar.a());
            }
            if (!(udVar instanceof ud.i)) {
                return wdVar;
            }
            this.f13986a.f();
            d();
            return wd.g.f15485a;
        }
        if ((wdVar instanceof wd.a) || (wdVar instanceof wd.g)) {
            if (!(udVar instanceof ud.i)) {
                return wdVar;
            }
            this.f13986a.f();
            d();
            return wd.g.f15485a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
